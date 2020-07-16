package com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.livecommerce.h;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/android/livesdk/livecommerce/h/Methods;", "", "()V", "ClassLivesdkLivecommerceHC_b", "Ljava/lang/reflect/Method;", "getClassLivesdkLivecommerceHC_b", "()Ljava/lang/reflect/Method;", "ClassLivesdkLivecommerceHC_b$delegate", "Lkotlin/Lazy;", "FunLivesdkLivecommerceHB_a", "getFunLivesdkLivecommerceHB_a", "FunLivesdkLivecommerceHB_a$delegate", "FunLivesdkLivecommerceHD_add", "getFunLivesdkLivecommerceHD_add", "FunLivesdkLivecommerceHD_add$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Methods.kt */
public final class Methods {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassLivesdkLivecommerceHC_b$delegate;
    private static final Lazy FunLivesdkLivecommerceHB_a$delegate;
    private static final Lazy FunLivesdkLivecommerceHD_add$delegate;
    public static final Methods INSTANCE = new Methods();

    public final Method getClassLivesdkLivecommerceHC_b() {
        Lazy lazy = ClassLivesdkLivecommerceHC_b$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Method) lazy.getValue();
    }

    public final Method getFunLivesdkLivecommerceHB_a() {
        Lazy lazy = FunLivesdkLivecommerceHB_a$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    public final Method getFunLivesdkLivecommerceHD_add() {
        Lazy lazy = FunLivesdkLivecommerceHD_add$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Method) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Class<Methods> cls = Methods.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "FunLivesdkLivecommerceHB_a", "getFunLivesdkLivecommerceHB_a()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "FunLivesdkLivecommerceHD_add", "getFunLivesdkLivecommerceHD_add()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkLivecommerceHC_b", "getClassLivesdkLivecommerceHC_b()Ljava/lang/reflect/Method;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$1("FunLivesdkLivecommerceHB_a"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$2("FunLivesdkLivecommerceHB_a"));
        }
        FunLivesdkLivecommerceHB_a$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$3("FunLivesdkLivecommerceHD_add"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$4("FunLivesdkLivecommerceHD_add"));
        }
        FunLivesdkLivecommerceHD_add$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$5("ClassLivesdkLivecommerceHC_b"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$6("ClassLivesdkLivecommerceHC_b"));
        }
        ClassLivesdkLivecommerceHC_b$delegate = lazy3;
    }

    private Methods() {
    }
}
