package com.ehook.helper

import android.util.Log
import com.ehook.HookGlobal
import com.ehook.helper.ParserHelper.ClassTrie
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.XposedBridge.hookMethod
import de.robv.android.xposed.XposedHelpers.findMethodExactIfExists
import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import kotlin.jvm.internal.Intrinsics

/**
 *  查找类、方法、属性，用于版本自动匹配
 */
object ReflecterHelper {

    private val fieldCache: MutableMap<String, Fields> = ConcurrentHashMap()

    /**
     * 用于缓存已经完成的[findMethodExact]的搜索结果
     */
    private val methodCache: MutableMap<String, Method?> = ConcurrentHashMap()
    private val methodsCache: MutableMap<String, Methods> = ConcurrentHashMap()

    /**
     * 查找指定包里指定深度的所有类
     *
     * 出于性能方面的考虑, 只有深度相等的类才会被返回, 比如搜索深度为0的时候, 就只返回这个包自己拥有的类, 不包括它
     * 里面其他包拥有的类.
     *
     * @param loader 用于取出 [Class] 对象的加载器
     * @param trie 整个 APK 的包结构, 由于 Java 的 [ClassLoader] 对象不支持读取所有类名, 我们必须先通过其他手段
     * 解析 APK 结构, 然后才能检索某个包内的所有类, 详情请参见 [ApkFile] 和 [WechatGlobal]
     * @param packageName 包名
     * @param depth 深度
     */
    @JvmStatic
    fun findClassesInPackage(
        loader: ClassLoader,
        trie: ClassTrie,
        packageName: String,
        depth: Int = 0
    ): Classes {
        val key = "$depth-$packageName"
        val cached = classCache[key]
        if (cached != null) {
            return cached
        }
        val classes = Classes(trie.search(packageName, depth).mapNotNull { name ->
            findClassIfExists(name, loader)
        })
        return classes.also { classCache[key] = classes }
    }

    @JvmStatic
    fun findMethodIfExists(
        clazz: Class<*>,
        methodName: String,
        vararg parameterTypes: Class<*>
    ): Method? =
        try {
            findMethodExact(clazz, methodName, *parameterTypes)
        } catch (_: Throwable) {
            null
        }

    @JvmStatic
    fun findMethodsByExactName(clazz: Class<*>, methodName: String): Methods {
        val fullMethodName = "${clazz.name}#$methodName#exactnname"
        return when (methodsCache[fullMethodName] != null) {
            true -> methodsCache[fullMethodName]!!
            else -> Methods(clazz.declaredMethods.filter { return@filter it.name.equals(methodName, false) }
                .onEach { it.isAccessible = true })
                .also { methodsCache[fullMethodName] = it }
        }
    }
    /**
     * 查找所有满足要求的方法
     *
     * @param clazz 该方法所属的类
     * @param returnType 该方法的返回类型
     * @param parameterTypes 该方法的参数类型
     */
    @JvmStatic
    fun findMethodsByExactParameters(
        clazz: Class<*>,
        returnType: Class<*>?,
        vararg parameterTypes: Class<*>
    ): List<Method> {
        return clazz.declaredMethods.filter { method ->
            if (returnType != null && returnType != method.returnType) {
                return@filter false
            }

            val methodParameterTypes = method.parameterTypes
            if (parameterTypes.size != methodParameterTypes.size) {
                return@filter false
            }
            for (i in parameterTypes.indices) {
                if (parameterTypes[i] != methodParameterTypes[i]) {
                    return@filter false
                }
            }
            method.isAccessible = true
            return@filter true
        }
    }


    /** ------------- Field ------------ */
    @JvmStatic
    fun findFieldIfExists(clazz: Class<*>, fieldName: String): Field? {
        val fullFieldName = "${clazz.name}#$fieldName"
        return if (fieldCache.containsKey(fullFieldName)) {
            fieldCache[fullFieldName]?.firstOrNull()
        } else try {
            clazz.getDeclaredField(fieldName)
        } catch (_: NoSuchFieldException) {
            null
        }
    }

    /** 通过其他方式过滤类 */
    class Classes(val classes: List<Class<*>>) {

        /**
         * @suppress
         */
        private companion object {
            private const val TAG = "Reflection"
        }

        fun filterBySuper(superClass: Class<*>?): Classes {
            return Classes(classes.filter { it.superclass == superClass }.also {
                if (it.isEmpty()) {
                    Log.w(
                        TAG,
                        "filterBySuper found nothing, super class = ${superClass?.simpleName}"
                    )
                }
            })
        }

        /**
         * 非抽象类
         */
        fun filterBySuperImpl(superClass: Class<*>?): Classes {
            return Classes(classes.filter { superClass!!.isAssignableFrom(it) && !Modifier.isAbstract(it.modifiers) }.also {
                if (it.isEmpty()) {
                    Log.w(
                        TAG,
                        "filterBySuperImpl found nothing, super class = ${superClass?.simpleName}"
                    )
                }
            })
        }

        /**
         *  (获取对应类的直接外部类Class对象)
         */
        fun filterByEnclosingClass(enclosingClass: Class<*>?): Classes {
            return Classes(classes.filter { it.enclosingClass == enclosingClass }.also {
                if (it.isEmpty()) {
                    Log.w(
                        TAG,
                        "filterByEnclosingClass found nothing, enclosing class = ${enclosingClass?.simpleName} "
                    )
                }
            })
        }

        fun filterByMethod(
            returnType: Class<*>?,
            methodName: String,
            vararg parameterTypes: Class<*>
        ): Classes {
            return Classes(classes.filter { clazz ->
                val method = findMethodExactIfExists(clazz, methodName, *parameterTypes)
                method != null && method.returnType == returnType ?: method.returnType
            }.also {
                if (it.isEmpty()) {
                    Log.w(
                        TAG,
                        "filterByMethod found nothing, returnType = ${returnType?.simpleName}, methodName = $methodName, parameterTypes = ${parameterTypes.joinToString(
                            "|"
                        ) { it.simpleName }}"
                    )
                }
            })
        }

        fun filterByMethod(returnType: Class<*>?, vararg parameterTypes: Class<*>): Classes {
            return Classes(classes.filter { clazz ->
                findMethodsByExactParameters(clazz, returnType, *parameterTypes).isNotEmpty()
            }.also {
                if (it.isEmpty()) {
                    Log.w(
                        TAG,
                        "filterByMethod found nothing, returnType = ${returnType?.simpleName}, parameterTypes = ${parameterTypes.joinToString(
                            "|"
                        ) { it.simpleName }}"
                    )
                }
            })
        }
        fun filterByMethod(methodName: String?): Classes {
            return Classes(classes.filter { clazz ->
               val method = findMethodExactIfExists(clazz, methodName)
                method != null
            }.also {
                if (it.isEmpty()) {
//                    Log.w(
//                        TAG,
//                        "filterByMethod found nothing, parameterTypes = ${parameterTypes.joinToString(
//                            "|"
//                        ) { it.simpleName }}"
//                    )
                }
            })
        }

        fun filterByField(fieldName: String, fieldType: String): Classes {
            return Classes(classes.filter { clazz ->
                val field = findFieldIfExists(clazz, fieldName)
                field != null && field.type.canonicalName == fieldType
            }.also {
                if (it.isEmpty()) {
                    Log.w(
                        TAG,
                        "filterByField found nothing, fieldName = $fieldName, fieldType = $fieldType"
                    )
                }
            })
        }

        fun filterByField(fieldType: String): Classes {
            return Classes(classes.filter { clazz ->
                findFieldsWithType(clazz, fieldType).isNotEmpty()
            }.also {
                if (it.isEmpty()) {
                    Log.w(TAG, "filterByField found nothing, fieldType = $fieldType")
                }
            })
        }

        fun firstOrNull(): Class<*>? {
            if (classes.size > 1) {
                val names = classes.map { it.canonicalName }
                Log.w(TAG, "found a signature that matches more than one class: $names")
            }
            return classes.firstOrNull()
        }
    }

    /** 通过其他方式过滤方法 */
    class Methods(private val methods: List<Method>) {

        fun firstOrNull(): Method? {
            if (methods.isNotEmpty()) {
                val names = methods.map { it.name }
                Log.e(ReflecterHelper.javaClass.name, "found a signature methods: $names")
            }
            return methods.firstOrNull()
        }

    }

    /** 通过其他方式过滤属性 */
    class Fields(private val fields: List<Field>) {

        fun filterByModifiers(vararg modifiers: Int): Fields =
            if (modifiers.size < 0) this else Fields(fields.filter {
                it.modifiers == modifiers.reduce { acc, i ->
                    acc.or(
                        i
                    )
                }
            })

        fun isNotEmpty(): Boolean = fields.isNotEmpty()

        fun firstOrNull(): Field? {
            if (fields.isNotEmpty()) {
                val names = fields.map { it.name }
                Log.e(ReflecterHelper.javaClass.name, "found a signature fields: $names")
            }
            return fields.firstOrNull()
        }
    }

    /**
     * 利用 Reflection 对指定对象进行浅拷贝
     */
    @JvmStatic
    fun shadowCopy(obj: Any, copy: Any, clazz: Class<*>? = obj::class.java) {
        if (clazz == null) {
            return
        }
        shadowCopy(obj, copy, clazz.superclass)
        clazz.declaredFields.forEach {
            it.isAccessible = true
            it.set(copy, it.get(obj))
        }
    }

    /**
     * 用于缓存已经完成的[findClassesFromPackage]的搜索结果
     */
    private val classCache: MutableMap<String, Classes> = ConcurrentHashMap()

    @JvmStatic
    fun clearClassCache() {
        classCache.clear()
    }


    @JvmStatic
    fun clearMethodCache() {
        methodCache.clear()
    }

    /**
     * 查找一个确定的类, 如果不存在返回 null
     */
    @JvmStatic
    fun findClassIfExists(className: String, classLoader: ClassLoader): Class<*>? {
        try {
            return Class.forName(className, false, classLoader)
        } catch (throwable: Throwable) {
            if (HookGlobal.unitTestMode) {
                throw throwable
            }
        }
        return null
    }

    /**
     * 查找指定包里指定深度的所有类
     *
     * 出于性能方面的考虑, 只有深度相等的类才会被返回, 比如搜索深度为0的时候, 就只返回这个包自己拥有的类, 不包括它
     * 里面其他包拥有的类.
     *
     * @param loader 用于取出 [Class] 对象的加载器
     * @param trie 整个 APK 的包结构, 由于 Java 的 [ClassLoader] 对象不支持读取所有类名, 我们必须先通过其他手段
     * 解析 APK 结构, 然后才能检索某个包内的所有类, 详情请参见 [ApkFile] 和 [WechatGlobal]
     * @param packageName 包名
     * @param depth 深度
     */
    @JvmStatic
    fun findClassesFromPackage(
        loader: ClassLoader,
        trie: ClassTrie,
        packageName: String,
        depth: Int = 0
    ): Classes {
        val key = "$depth-$packageName"
        val cached = classCache[key]
        if (cached != null) {
            return cached
        }
        val classes = Classes(trie.search(packageName, depth).mapNotNull { name ->
            findClassIfExists(name, loader)
        })
        return classes.also { classCache[key] = classes }
    }


    /**
     * 根据 JVM Specification 生成一个参数签名
     */
    @JvmStatic
    private fun getParametersString(vararg clazzes: Class<*>): String =
        "(" + clazzes.joinToString(",") { it.canonicalName ?: "" } + ")"

    /**
     * 查找一个确定的方法, 如果不存在, 抛出 [NoSuchMethodException] 异常
     *
     * @param clazz 该方法所属的类
     * @param methodName 该方法的名称
     * @param parameterTypes 该方法的参数类型
     */
    @JvmStatic
    fun findMethodExact(
        clazz: Class<*>,
        methodName: String,
        vararg parameterTypes: Class<*>
    ): Method {
        val fullMethodName =
            "${clazz.name}#$methodName${getParametersString(*parameterTypes)}#exact"
        if (fullMethodName in methodCache) {
            return methodCache[fullMethodName] ?: throw NoSuchMethodError(fullMethodName)
        }
        try {
            val method = clazz.getDeclaredMethod(methodName, *parameterTypes).apply {
                isAccessible = true
            }
            return method.also { methodCache[fullMethodName] = method }
        } catch (e: NoSuchMethodException) {
            methodCache[fullMethodName] = null
            throw NoSuchMethodError(fullMethodName)
        }
    }


    /**
     * 查找指定类中所有特定类型的成员变量
     */
    @JvmStatic
    fun findFieldsWithType(clazz: Class<*>, typeName: String): List<Field> {
        return clazz.declaredFields.filter {
            it.type.name == typeName
        }
    }

    /**
     * 查找指定类中所有特定泛型的成员变量
     */
    @JvmStatic
    fun findFieldsWithGenericType(clazz: Class<*>, genericTypeName: String): List<Field> {
        return clazz.declaredFields.filter {
            it.genericType.toString() == genericTypeName
        }
    }

    /**
     * 钩住一个类中所有的方法, 一般只用于测试
     */
    @JvmStatic
    fun hookAllMethodsInClass(clazz: Class<*>, callback: XC_MethodHook) {
        clazz.declaredMethods.forEach { method -> hookMethod(method, callback) }
    }
}
