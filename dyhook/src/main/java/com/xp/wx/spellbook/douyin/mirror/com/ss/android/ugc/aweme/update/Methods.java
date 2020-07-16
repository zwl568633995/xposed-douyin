package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.update;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/update/Methods;", "", "()V", "ClassUpdateO_a", "Ljava/lang/reflect/Method;", "getClassUpdateO_a", "()Ljava/lang/reflect/Method;", "ClassUpdateO_a$delegate", "Lkotlin/Lazy;", "ClassUpdateUpdateHelper_C", "getClassUpdateUpdateHelper_C", "ClassUpdateUpdateHelper_C$delegate", "ClassUpdateUpdateHelper_a", "getClassUpdateUpdateHelper_a", "ClassUpdateUpdateHelper_a$delegate", "ClassUpdateUpdateHelper_a2", "getClassUpdateUpdateHelper_a2", "ClassUpdateUpdateHelper_a2$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Methods.kt */
public final class Methods {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassUpdateO_a$delegate;
    private static final Lazy ClassUpdateUpdateHelper_C$delegate;
    private static final Lazy ClassUpdateUpdateHelper_a$delegate;
    private static final Lazy ClassUpdateUpdateHelper_a2$delegate;
    public static final Methods INSTANCE = new Methods();

    public final Method getClassUpdateO_a() {
        Lazy lazy = ClassUpdateO_a$delegate;
        KProperty kProperty = $$delegatedProperties[3];
        return (Method) lazy.getValue();
    }

    public final Method getClassUpdateUpdateHelper_C() {
        Lazy lazy = ClassUpdateUpdateHelper_C$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Method) lazy.getValue();
    }

    public final Method getClassUpdateUpdateHelper_a() {
        Lazy lazy = ClassUpdateUpdateHelper_a$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    public final Method getClassUpdateUpdateHelper_a2() {
        Lazy lazy = ClassUpdateUpdateHelper_a2$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Method) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Class<Methods> cls = Methods.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassUpdateUpdateHelper_a", "getClassUpdateUpdateHelper_a()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassUpdateUpdateHelper_a2", "getClassUpdateUpdateHelper_a2()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassUpdateUpdateHelper_C", "getClassUpdateUpdateHelper_C()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassUpdateO_a", "getClassUpdateO_a()Ljava/lang/reflect/Method;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$1("ClassUpdateUpdateHelper_a"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$2("ClassUpdateUpdateHelper_a"));
        }
        ClassUpdateUpdateHelper_a$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$3("ClassUpdateUpdateHelper_a2"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$4("ClassUpdateUpdateHelper_a2"));
        }
        ClassUpdateUpdateHelper_a2$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$5("ClassUpdateUpdateHelper_C"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$6("ClassUpdateUpdateHelper_C"));
        }
        ClassUpdateUpdateHelper_C$delegate = lazy3;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy4 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$7("ClassUpdateO_a"));
        } else {
            lazy4 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$8("ClassUpdateO_a"));
        }
        ClassUpdateO_a$delegate = lazy4;
    }

    private Methods() {
    }
}
