package com.xp.wx.spellbook.util;

import com.xp.api.XC_MethodHook;
import com.xp.api.XmasBridge;
import com.xp.wx.spellbook.parser.ClassTrie;
import com.xp.wx.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u00014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u001e\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007J\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u001f\u001a\u00020\u0005H\u0007J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001e2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010!\u001a\u00020\u0005H\u0007J=\u0010\"\u001a\u00020\b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010#\u001a\u00020\u00052\u001a\u0010$\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0%\"\u0006\u0012\u0002\b\u00030\rH\u0007¢\u0006\u0002\u0010&J?\u0010'\u001a\u0004\u0018\u00010\b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010#\u001a\u00020\u00052\u001a\u0010$\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0%\"\u0006\u0012\u0002\b\u00030\rH\u0007¢\u0006\u0002\u0010&JI\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u001e2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\f\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u001a\u0010$\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0%\"\u0006\u0012\u0002\b\u00030\rH\u0007¢\u0006\u0002\u0010*J)\u0010+\u001a\u00020\u00052\u001a\u0010,\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0%\"\u0006\u0012\u0002\b\u00030\rH\u0003¢\u0006\u0002\u0010-J\u001c\u0010.\u001a\u00020\n2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010/\u001a\u000200H\u0007J(\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/xp/wx/spellbook/util/ReflectionUtil;", "", "()V", "classCache", "", "", "Lcom/xp/wx/spellbook/util/ReflectionUtil$Classes;", "methodCache", "Ljava/lang/reflect/Method;", "clearClassCache", "", "clearMethodCache", "findClassIfExists", "Ljava/lang/Class;", "className", "classLoader", "Ljava/lang/ClassLoader;", "findClassesFromPackage", "loader", "trie", "Lcom/xp/wx/spellbook/parser/ClassTrie;", "packageName", "depth", "", "findDeclaredFieldIfExists", "Ljava/lang/reflect/Field;", "clazz", "fieldName", "findFieldIfExists", "findFieldsWithGenericType", "", "genericTypeName", "findFieldsWithType", "typeName", "findMethodExact", "methodName", "parameterTypes", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "findMethodExactIfExists", "findMethodsByExactParameters", "returnType", "(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/util/List;", "getParametersString", "clazzes", "([Ljava/lang/Class;)Ljava/lang/String;", "hookAllMethodsInClass", "callback", "Lcom/xp/api/XC_MethodHook;", "shadowCopy", "obj", "copy", "Classes", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ReflectionUtil.kt */
public final class ReflectionUtil {
    public static final ReflectionUtil INSTANCE = new ReflectionUtil();
    private static final Map<String, Classes> classCache = new ConcurrentHashMap();
    private static final Map<String, Method> methodCache = new ConcurrentHashMap();

    private ReflectionUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ5\u0010\f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u000f\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0010J=\u0010\f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\n2\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u000f\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0012J/\u0010\f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\n2\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u000f\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004J\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004R\u0018\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xp/wx/spellbook/util/ReflectionUtil$Classes;", "", "classes", "", "Ljava/lang/Class;", "(Ljava/util/List;)V", "filterByEnclosingClass", "enclosingClass", "filterByField", "fieldType", "", "fieldName", "filterByMethod", "returnType", "parameterTypes", "", "(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/xp/wx/spellbook/util/ReflectionUtil$Classes;", "methodName", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lcom/xp/wx/spellbook/util/ReflectionUtil$Classes;", "(Ljava/lang/String;[Ljava/lang/Class;)Lcom/xp/wx/spellbook/util/ReflectionUtil$Classes;", "filterBySuper", "superClass", "firstOrNull", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ReflectionUtil.kt */
    public static final class Classes {
        private final List<Class<?>> classes;

        public Classes(List<? extends Class<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "classes");
            this.classes = list;
        }

        public final Classes filterBySuper(Class<?> cls) {
            Collection arrayList = new ArrayList();
            for (Object next : this.classes) {
                if (Intrinsics.areEqual((Object) ((Class) next).getSuperclass(), (Object) cls)) {
                    arrayList.add(next);
                }
            }
            return new Classes((List) arrayList);
        }

        public final Classes filterByEnclosingClass(Class<?> cls) {
            Collection arrayList = new ArrayList();
            for (Object next : this.classes) {
                if (Intrinsics.areEqual((Object) ((Class) next).getEnclosingClass(), (Object) cls)) {
                    arrayList.add(next);
                }
            }
            return new Classes((List) arrayList);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0019 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.xp.wx.spellbook.util.ReflectionUtil.Classes filterByMethod(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>... r8) {
            /*
                r5 = this;
                java.lang.String r0 = "methodName"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
                java.lang.String r0 = "parameterTypes"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                java.util.List<java.lang.Class<?>> r0 = r5.classes
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x0019:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x004e
                java.lang.Object r2 = r0.next()
                r3 = r2
                java.lang.Class r3 = (java.lang.Class) r3
                int r4 = r8.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r8, r4)
                java.lang.Class[] r4 = (java.lang.Class[]) r4
                java.lang.reflect.Method r3 = com.xp.wx.spellbook.util.ReflectionUtil.findMethodExactIfExists(r3, r7, r4)
                if (r3 == 0) goto L_0x0047
                java.lang.Class r4 = r3.getReturnType()
                if (r6 == 0) goto L_0x003b
                r3 = r6
                goto L_0x003f
            L_0x003b:
                java.lang.Class r3 = r3.getReturnType()
            L_0x003f:
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r3)
                if (r3 == 0) goto L_0x0047
                r3 = 1
                goto L_0x0048
            L_0x0047:
                r3 = 0
            L_0x0048:
                if (r3 == 0) goto L_0x0019
                r1.add(r2)
                goto L_0x0019
            L_0x004e:
                java.util.List r1 = (java.util.List) r1
                com.xp.wx.spellbook.util.ReflectionUtil$Classes r6 = new com.xp.wx.spellbook.util.ReflectionUtil$Classes
                r6.<init>(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.util.ReflectionUtil.Classes.filterByMethod(java.lang.Class, java.lang.String, java.lang.Class[]):com.xp.wx.spellbook.util.ReflectionUtil$Classes");
        }

        public final Classes filterByMethod(Class<?> cls, Class<?>... clsArr) {
            Intrinsics.checkParameterIsNotNull(clsArr, "parameterTypes");
            Collection arrayList = new ArrayList();
            for (Object next : this.classes) {
                if (!ReflectionUtil.findMethodsByExactParameters((Class) next, cls, (Class[]) Arrays.copyOf(clsArr, clsArr.length)).isEmpty()) {
                    arrayList.add(next);
                }
            }
            return new Classes((List) arrayList);
        }

        public final Classes filterByMethod(String str, Class<?>... clsArr) {
            Intrinsics.checkParameterIsNotNull(str, "methodName");
            Intrinsics.checkParameterIsNotNull(clsArr, "parameterTypes");
            Collection arrayList = new ArrayList();
            for (Object next : this.classes) {
                if (ReflectionUtil.findMethodExactIfExists((Class) next, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length)) != null) {
                    arrayList.add(next);
                }
            }
            return new Classes((List) arrayList);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0019 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.xp.wx.spellbook.util.ReflectionUtil.Classes filterByField(java.lang.String r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = "fieldName"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
                java.lang.String r0 = "fieldType"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
                java.util.List<java.lang.Class<?>> r0 = r5.classes
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x0019:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0048
                java.lang.Object r2 = r0.next()
                r3 = r2
                java.lang.Class r3 = (java.lang.Class) r3
                java.lang.reflect.Field r3 = com.xp.wx.spellbook.util.ReflectionUtil.findFieldIfExists(r3, r6)
                if (r3 == 0) goto L_0x0041
                java.lang.Class r3 = r3.getType()
                java.lang.String r4 = "field.type"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                java.lang.String r3 = r3.getCanonicalName()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r7)
                if (r3 == 0) goto L_0x0041
                r3 = 1
                goto L_0x0042
            L_0x0041:
                r3 = 0
            L_0x0042:
                if (r3 == 0) goto L_0x0019
                r1.add(r2)
                goto L_0x0019
            L_0x0048:
                java.util.List r1 = (java.util.List) r1
                com.xp.wx.spellbook.util.ReflectionUtil$Classes r6 = new com.xp.wx.spellbook.util.ReflectionUtil$Classes
                r6.<init>(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.util.ReflectionUtil.Classes.filterByField(java.lang.String, java.lang.String):com.xp.wx.spellbook.util.ReflectionUtil$Classes");
        }

        public final Classes filterByField(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fieldType");
            Collection arrayList = new ArrayList();
            for (Object next : this.classes) {
                if (!ReflectionUtil.findFieldsWithType((Class) next, str).isEmpty()) {
                    arrayList.add(next);
                }
            }
            return new Classes((List) arrayList);
        }

        public final Class<?> firstOrNull() {
            if (this.classes.size() > 1) {
                Iterable<Class> iterable = this.classes;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (Class canonicalName : iterable) {
                    arrayList.add(canonicalName.getCanonicalName());
                }
                Log.warn("Xposed", "found a signature that matches more than one class: " + ((List) arrayList));
            }
            return (Class) CollectionsKt.firstOrNull(this.classes);
        }
    }

    @JvmStatic
    public static /* synthetic */ void shadowCopy$default(Object obj, Object obj2, Class<?> cls, int i, Object obj3) {
        if ((i & 4) != 0) {
            cls = obj.getClass();
        }
        shadowCopy(obj, obj2, cls);
    }

    @JvmStatic
    public static final void shadowCopy(Object obj, Object obj2, Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(obj, "obj");
        Intrinsics.checkParameterIsNotNull(obj2, "copy");
        if (cls != null) {
            shadowCopy(obj, obj2, cls.getSuperclass());
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkExpressionValueIsNotNull(declaredFields, "clazz.declaredFields");
            for (Field field : declaredFields) {
                Intrinsics.checkExpressionValueIsNotNull(field, "it");
                field.setAccessible(true);
                field.set(obj2, field.get(obj));
            }
        }
    }

    @JvmStatic
    public static final void clearClassCache() {
        classCache.clear();
    }

    @JvmStatic
    public static final void clearMethodCache() {
        methodCache.clear();
    }

    @JvmStatic
    public static final Class<?> findClassIfExists(String str, ClassLoader classLoader) {
        Intrinsics.checkParameterIsNotNull(str, "className");
        Intrinsics.checkParameterIsNotNull(classLoader, "classLoader");
        try {
            return Class.forName(str, false, classLoader);
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static /* synthetic */ Classes findClassesFromPackage$default(ClassLoader classLoader, ClassTrie classTrie, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return findClassesFromPackage(classLoader, classTrie, str, i);
    }

    @JvmStatic
    public static final Classes findClassesFromPackage(ClassLoader classLoader, ClassTrie classTrie, String str, int i) {
        Intrinsics.checkParameterIsNotNull(classLoader, "loader");
        Intrinsics.checkParameterIsNotNull(classTrie, "trie");
        Intrinsics.checkParameterIsNotNull(str, "packageName");
        String str2 = i + '-' + str;
        Classes classes = classCache.get(str2);
        if (classes != null) {
            return classes;
        }
        Collection arrayList = new ArrayList();
        for (String findClassIfExists : classTrie.search(str, i)) {
            Class<?> findClassIfExists2 = findClassIfExists(findClassIfExists, classLoader);
            if (findClassIfExists2 != null) {
                arrayList.add(findClassIfExists2);
            }
        }
        Classes classes2 = new Classes((List) arrayList);
        classCache.put(str2, classes2);
        return classes2;
    }

    @JvmStatic
    public static final Method findMethodExactIfExists(Class<?> cls, String str, Class<?>... clsArr) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(str, "methodName");
        Intrinsics.checkParameterIsNotNull(clsArr, "parameterTypes");
        try {
            return findMethodExact(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    private static final String getParametersString(Class<?>... clsArr) {
        return "(" + ArraysKt.joinToString$default((Object[]) clsArr, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) ReflectionUtil$getParametersString$1.INSTANCE, 30, (Object) null) + ")";
    }

    @JvmStatic
    public static final Method findMethodExact(Class<?> cls, String str, Class<?>... clsArr) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(str, "methodName");
        Intrinsics.checkParameterIsNotNull(clsArr, "parameterTypes");
        String str2 = cls.getName() + '#' + str + getParametersString((Class[]) Arrays.copyOf(clsArr, clsArr.length)) + "#exact";
        if (methodCache.containsKey(str2)) {
            Method method = methodCache.get(str2);
            if (method != null) {
                return method;
            }
            throw new NoSuchMethodError(str2);
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            methodCache.put(str2, declaredMethod);
            Intrinsics.checkExpressionValueIsNotNull(declaredMethod, "method.also { methodCach…ullMethodName] = method }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            methodCache.put(str2, (Object) null);
            throw new NoSuchMethodError(str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r4.getReturnType())) != false) goto L_0x0040;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.reflect.Method> findMethodsByExactParameters(java.lang.Class<?> r11, java.lang.Class<?> r12, java.lang.Class<?>... r13) {
        /*
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            java.lang.reflect.Method[] r11 = r11.getDeclaredMethods()
            java.lang.String r0 = "clazz.declaredMethods"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L_0x001d:
            if (r3 >= r1) goto L_0x0060
            r4 = r11[r3]
            java.lang.String r5 = "method"
            r6 = 1
            if (r12 == 0) goto L_0x0035
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.Class r7 = r4.getReturnType()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r7)
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x0035
            goto L_0x0040
        L_0x0035:
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r7 = r13.length
            int r8 = r5.length
            if (r7 == r8) goto L_0x0042
        L_0x0040:
            r6 = 0
            goto L_0x0058
        L_0x0042:
            int r7 = r13.length
            r8 = 0
        L_0x0044:
            if (r8 >= r7) goto L_0x0055
            r9 = r13[r8]
            r10 = r5[r8]
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            r9 = r9 ^ r6
            if (r9 == 0) goto L_0x0052
            goto L_0x0040
        L_0x0052:
            int r8 = r8 + 1
            goto L_0x0044
        L_0x0055:
            r4.setAccessible(r6)
        L_0x0058:
            if (r6 == 0) goto L_0x005d
            r0.add(r4)
        L_0x005d:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0060:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.util.ReflectionUtil.findMethodsByExactParameters(java.lang.Class, java.lang.Class, java.lang.Class[]):java.util.List");
    }

    @JvmStatic
    public static final Field findFieldIfExists(Class<?> cls, String str) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(str, "fieldName");
        try {
            return cls.getField(str);
        } catch (Throwable unused) {
            return findDeclaredFieldIfExists(cls, str);
        }
    }

    @JvmStatic
    public static final Field findDeclaredFieldIfExists(Class<?> cls, String str) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(str, "fieldName");
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static final List<Field> findFieldsWithType(Class<?> cls, String str) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(str, "typeName");
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkExpressionValueIsNotNull(declaredFields, "clazz.declaredFields");
        Collection arrayList = new ArrayList();
        for (Field field : declaredFields) {
            Intrinsics.checkExpressionValueIsNotNull(field, "it");
            Class<?> type = field.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            if (Intrinsics.areEqual((Object) type.getName(), (Object) str)) {
                arrayList.add(field);
            }
        }
        return (List) arrayList;
    }

    @JvmStatic
    public static final List<Field> findFieldsWithGenericType(Class<?> cls, String str) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(str, "genericTypeName");
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkExpressionValueIsNotNull(declaredFields, "clazz.declaredFields");
        Collection arrayList = new ArrayList();
        for (Field field : declaredFields) {
            Intrinsics.checkExpressionValueIsNotNull(field, "it");
            if (Intrinsics.areEqual((Object) field.getGenericType().toString(), (Object) str)) {
                arrayList.add(field);
            }
        }
        return (List) arrayList;
    }

    @JvmStatic
    public static final void hookAllMethodsInClass(Class<?> cls, XC_MethodHook xC_MethodHook) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(xC_MethodHook, "callback");
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkExpressionValueIsNotNull(declaredMethods, "clazz.declaredMethods");
        for (Method hookMethod : declaredMethods) {
            XmasBridge.hookMethod(hookMethod, xC_MethodHook);
        }
    }
}
