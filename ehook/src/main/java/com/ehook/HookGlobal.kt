package com.ehook

import android.util.Log
import com.ehook.core.WaitChannel
import com.ehook.helper.ParserHelper.ApkFile
import com.ehook.helper.ParserHelper.ClassTrie
import com.ehook.helper.TryHelper
import de.robv.android.xposed.callbacks.XC_LoadPackage

object HookGlobal {

    @Suppress("MemberVisibilityCanBePrivate")
    const val INIT_TIMEOUT = 2000L // ms

    @Volatile
    var unitTestMode: Boolean = false

    private val initChannel = WaitChannel()

    @Volatile
    var version: com.ehook.core.Version? = null
        get() {
            if (!unitTestMode) {
                initChannel.wait(INIT_TIMEOUT)
                initChannel.done()
            }
            return field
        }

    @Volatile
    var packageName: String = ""
        get() {
            if (!unitTestMode) {
                initChannel.wait(INIT_TIMEOUT)
                initChannel.done()
            }
            return field
        }

    @Volatile
    var classLoader: ClassLoader? = null
        get() {
            if (!unitTestMode) {
                initChannel.wait(INIT_TIMEOUT)
                initChannel.done()
            }
            return field
        }

    @Volatile
    var classes: ClassTrie? = null
        get() {
            if (!unitTestMode) {
                initChannel.wait(INIT_TIMEOUT)
                initChannel.done()
            }
            return field
        }

    inline fun <T> lazy(name: String, crossinline initializer: () -> T?): Lazy<T> {
        return if (unitTestMode) {
            UnitTestLazyImpl {
                initializer() ?: throw Error("Failed to evaluate $name")
            }
        } else {
            lazy(LazyThreadSafetyMode.PUBLICATION) {
                when (null) {
                    version -> throw Error("Invalid version")
                    packageName -> throw Error("Invalid packageName")
                    classLoader -> throw Error("Invalid classLoader")
                    classes -> throw Error("Invalid classes")
                }
                initializer() ?: throw Error("Failed to evaluate $name")
            }
        }
    }

    class UnitTestLazyImpl<out T>(private val initializer: () -> T) : Lazy<T>,
        java.io.Serializable {
        @Volatile
        private var lazyValue: Lazy<T> = lazy(initializer)

        fun refresh() {
            lazyValue = lazy(initializer)
        }

        override val value: T
            get() = lazyValue.value

        override fun toString(): String = lazyValue.toString()

        override fun isInitialized(): Boolean = lazyValue.isInitialized()
    }

    @JvmStatic
    fun init(lpparam: XC_LoadPackage.LoadPackageParam, callback: (Boolean) -> Unit) {
        TryHelper.tryAsynchronously {
            if (initChannel.isDone()) {
                return@tryAsynchronously
            }

            try {
                version =  EasyHook.getApplicationVersion(lpparam.packageName)
                packageName = lpparam.packageName
                classLoader = lpparam.classLoader

                Log.e(
                    HookGlobal::class.java.name,
                    "init  ${lpparam.appInfo.sourceDir}     ${lpparam.appInfo.publicSourceDir}  \n${version}   ${packageName}  ${classLoader}"
                )
                ApkFile(lpparam.appInfo.sourceDir).use {
                    classes = it.classTypes
                    callback(true)
                }
            } finally {
                initChannel.done()
            }
        }
    }

}