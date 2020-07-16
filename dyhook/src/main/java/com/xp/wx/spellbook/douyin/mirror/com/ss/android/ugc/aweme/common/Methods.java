package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/common/Methods;", "", "()V", "ClassCommonA_addNotifyListener", "Ljava/lang/reflect/Method;", "getClassCommonA_addNotifyListener", "()Ljava/lang/reflect/Method;", "ClassCommonA_addNotifyListener$delegate", "Lkotlin/Lazy;", "ClassCommonA_clearNotifyListener", "getClassCommonA_clearNotifyListener", "ClassCommonA_clearNotifyListener$delegate", "ClassCommonA_getData", "getClassCommonA_getData", "ClassCommonA_getData$delegate", "ClassCommonA_sendRequest", "getClassCommonA_sendRequest", "ClassCommonA_sendRequest$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Methods.kt */
public final class Methods {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassCommonA_addNotifyListener$delegate;
    private static final Lazy ClassCommonA_clearNotifyListener$delegate;
    private static final Lazy ClassCommonA_getData$delegate;
    private static final Lazy ClassCommonA_sendRequest$delegate;
    public static final Methods INSTANCE = new Methods();

    public final Method getClassCommonA_addNotifyListener() {
        Lazy lazy = ClassCommonA_addNotifyListener$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Method) lazy.getValue();
    }

    public final Method getClassCommonA_clearNotifyListener() {
        Lazy lazy = ClassCommonA_clearNotifyListener$delegate;
        KProperty kProperty = $$delegatedProperties[3];
        return (Method) lazy.getValue();
    }

    public final Method getClassCommonA_getData() {
        Lazy lazy = ClassCommonA_getData$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    public final Method getClassCommonA_sendRequest() {
        Lazy lazy = ClassCommonA_sendRequest$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Method) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Class<Methods> cls = Methods.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommonA_getData", "getClassCommonA_getData()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommonA_sendRequest", "getClassCommonA_sendRequest()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommonA_addNotifyListener", "getClassCommonA_addNotifyListener()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommonA_clearNotifyListener", "getClassCommonA_clearNotifyListener()Ljava/lang/reflect/Method;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$1("ClassCommonA_getData"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$2("ClassCommonA_getData"));
        }
        ClassCommonA_getData$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$3("ClassCommonA_sendRequest"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$4("ClassCommonA_sendRequest"));
        }
        ClassCommonA_sendRequest$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$5("ClassCommonA_addNotifyListener"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$6("ClassCommonA_addNotifyListener"));
        }
        ClassCommonA_addNotifyListener$delegate = lazy3;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy4 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$7("ClassCommonA_clearNotifyListener"));
        } else {
            lazy4 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$8("ClassCommonA_clearNotifyListener"));
        }
        ClassCommonA_clearNotifyListener$delegate = lazy4;
    }

    private Methods() {
    }
}
