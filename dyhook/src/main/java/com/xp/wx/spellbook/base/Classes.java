package com.xp.wx.spellbook.base;

import android.util.Log;
import com.xp.wx.spellbook.util.ReflectionUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nJ5\u0010\f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u000f\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0010J=\u0010\f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\n2\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u000f\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004J\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004R\u0018\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xp/wx/spellbook/base/Classes;", "", "classes", "", "Ljava/lang/Class;", "(Ljava/util/List;)V", "filterByEnclosingClass", "enclosingClass", "filterByField", "fieldType", "", "fieldName", "filterByMethod", "returnType", "parameterTypes", "", "(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/xp/wx/spellbook/base/Classes;", "methodName", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lcom/xp/wx/spellbook/base/Classes;", "filterBySuper", "superClass", "firstOrNull", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Classes.kt */
public final class Classes {
    @Deprecated
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "Reflection";
    private final List<Class<?>> classes;

    public Classes(List<? extends Class<?>> list) {
        Intrinsics.checkParameterIsNotNull(list, "classes");
        this.classes = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/xp/wx/spellbook/base/Classes$Companion;", "", "()V", "TAG", "", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: Classes.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Classes filterBySuper(Class<?> cls) {
        Collection arrayList = new ArrayList();
        for (Object next : this.classes) {
            if (Intrinsics.areEqual((Object) ((Class) next).getSuperclass(), (Object) cls)) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("filterBySuper found nothing, super class = ");
            sb.append(cls != null ? cls.getSimpleName() : null);
            Log.w(TAG, sb.toString());
        }
        return new Classes(list);
    }

    public final Classes filterByEnclosingClass(Class<?> cls) {
        Collection arrayList = new ArrayList();
        for (Object next : this.classes) {
            if (Intrinsics.areEqual((Object) ((Class) next).getEnclosingClass(), (Object) cls)) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("filterByEnclosingClass found nothing, enclosing class = ");
            sb.append(cls != null ? cls.getSimpleName() : null);
            sb.append(' ');
            Log.w(TAG, sb.toString());
        }
        return new Classes(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0019 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.xp.wx.spellbook.base.Classes filterByMethod(java.lang.Class<?> r12, java.lang.String r13, java.lang.Class<?>... r14) {
        /*
            r11 = this;
            java.lang.String r0 = "methodName"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            java.lang.String r0 = "parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            java.util.List<java.lang.Class<?>> r0 = r11.classes
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
            int r4 = r14.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r14, r4)
            java.lang.Class[] r4 = (java.lang.Class[]) r4
            java.lang.reflect.Method r3 = com.xp.wx.spellbook.util.ReflectionUtil.findMethodExactIfExists(r3, r13, r4)
            if (r3 == 0) goto L_0x0047
            java.lang.Class r4 = r3.getReturnType()
            if (r12 == 0) goto L_0x003b
            r3 = r12
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
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x009a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "filterByMethod found nothing, returnType = "
            r0.append(r2)
            if (r12 == 0) goto L_0x0067
            java.lang.String r12 = r12.getSimpleName()
            goto L_0x0068
        L_0x0067:
            r12 = 0
        L_0x0068:
            r0.append(r12)
            java.lang.String r12 = ", methodName = "
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = ", parameterTypes = "
            r0.append(r12)
            java.lang.String r12 = "|"
            r3 = r12
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.xp.wx.spellbook.base.Classes$filterByMethod$2$1 r12 = com.xp.wx.spellbook.base.Classes$filterByMethod$2$1.INSTANCE
            r8 = r12
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r9 = 30
            r10 = 0
            r2 = r14
            java.lang.String r12 = kotlin.collections.ArraysKt.joinToString$default((java.lang.Object[]) r2, (java.lang.CharSequence) r3, (java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (int) r6, (java.lang.CharSequence) r7, (kotlin.jvm.functions.Function1) r8, (int) r9, (java.lang.Object) r10)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r13 = "Reflection"
            android.util.Log.w(r13, r12)
        L_0x009a:
            com.xp.wx.spellbook.base.Classes r12 = new com.xp.wx.spellbook.base.Classes
            r12.<init>(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.base.Classes.filterByMethod(java.lang.Class, java.lang.String, java.lang.Class[]):com.xp.wx.spellbook.base.Classes");
    }

    public final Classes filterByMethod(Class<?> cls, Class<?>... clsArr) {
        Intrinsics.checkParameterIsNotNull(clsArr, "parameterTypes");
        Collection arrayList = new ArrayList();
        for (Object next : this.classes) {
            if (!ReflectionUtil.findMethodsByExactParameters((Class) next, cls, (Class[]) Arrays.copyOf(clsArr, clsArr.length)).isEmpty()) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("filterByMethod found nothing, returnType = ");
            sb.append(cls != null ? cls.getSimpleName() : null);
            sb.append(", parameterTypes = ");
            sb.append(ArraysKt.joinToString$default((Object[]) clsArr, (CharSequence) "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) Classes$filterByMethod$4$1.INSTANCE, 30, (Object) null));
            Log.w(TAG, sb.toString());
        }
        return new Classes(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0019 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.xp.wx.spellbook.base.Classes filterByField(java.lang.String r6, java.lang.String r7) {
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
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "filterByField found nothing, fieldName = "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r6 = ", fieldType = "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "Reflection"
            android.util.Log.w(r7, r6)
        L_0x006e:
            com.xp.wx.spellbook.base.Classes r6 = new com.xp.wx.spellbook.base.Classes
            r6.<init>(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.base.Classes.filterByField(java.lang.String, java.lang.String):com.xp.wx.spellbook.base.Classes");
    }

    public final Classes filterByField(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fieldType");
        Collection arrayList = new ArrayList();
        for (Object next : this.classes) {
            if (!ReflectionUtil.findFieldsWithType((Class) next, str).isEmpty()) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.isEmpty()) {
            Log.w(TAG, "filterByField found nothing, fieldType = " + str);
        }
        return new Classes(list);
    }

    public final Class<?> firstOrNull() {
        if (this.classes.size() > 1) {
            Iterable<Class> iterable = this.classes;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Class canonicalName : iterable) {
                arrayList.add(canonicalName.getCanonicalName());
            }
            Log.w("Xposed", "found a signature that matches more than one class: " + ((List) arrayList));
        }
        return (Class) CollectionsKt.firstOrNull(this.classes);
    }
}
