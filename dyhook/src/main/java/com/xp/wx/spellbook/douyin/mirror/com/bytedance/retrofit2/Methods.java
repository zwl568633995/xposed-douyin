package com.xp.wx.spellbook.douyin.mirror.com.bytedance.retrofit2;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/retrofit2/Methods;", "", "()V", "ClassCall_execute", "Ljava/lang/reflect/Method;", "getClassCall_execute", "()Ljava/lang/reflect/Method;", "ClassCall_execute$delegate", "Lkotlin/Lazy;", "ClassSsResponse_body", "getClassSsResponse_body", "ClassSsResponse_body$delegate", "ClassSsResponse_isSuccessful", "getClassSsResponse_isSuccessful", "ClassSsResponse_isSuccessful$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Methods.kt */
public final class Methods {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassCall_execute$delegate;
    private static final Lazy ClassSsResponse_body$delegate;
    private static final Lazy ClassSsResponse_isSuccessful$delegate;
    public static final Methods INSTANCE = new Methods();

    public final Method getClassCall_execute() {
        Lazy lazy = ClassCall_execute$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    public final Method getClassSsResponse_body() {
        Lazy lazy = ClassSsResponse_body$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Method) lazy.getValue();
    }

    public final Method getClassSsResponse_isSuccessful() {
        Lazy lazy = ClassSsResponse_isSuccessful$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Method) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Class<Methods> cls = Methods.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCall_execute", "getClassCall_execute()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassSsResponse_isSuccessful", "getClassSsResponse_isSuccessful()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassSsResponse_body", "getClassSsResponse_body()Ljava/lang/reflect/Method;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$1("ClassCall_execute"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$2("ClassCall_execute"));
        }
        ClassCall_execute$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$3("ClassSsResponse_isSuccessful"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$4("ClassSsResponse_isSuccessful"));
        }
        ClassSsResponse_isSuccessful$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$5("ClassSsResponse_body"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$6("ClassSsResponse_body"));
        }
        ClassSsResponse_body$delegate = lazy3;
    }

    private Methods() {
    }
}
