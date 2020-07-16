package com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.platform.core.manager;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/android/livesdk/gift/platform/core/manager/Methods;", "", "()V", "ClassGiftManager_getGiftPageList", "Ljava/lang/reflect/Method;", "getClassGiftManager_getGiftPageList", "()Ljava/lang/reflect/Method;", "ClassGiftManager_getGiftPageList$delegate", "Lkotlin/Lazy;", "ClassGiftManager_inst", "getClassGiftManager_inst", "ClassGiftManager_inst$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Methods.kt */
public final class Methods {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassGiftManager_getGiftPageList$delegate;
    private static final Lazy ClassGiftManager_inst$delegate;
    public static final Methods INSTANCE = new Methods();

    public final Method getClassGiftManager_getGiftPageList() {
        Lazy lazy = ClassGiftManager_getGiftPageList$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Method) lazy.getValue();
    }

    public final Method getClassGiftManager_inst() {
        Lazy lazy = ClassGiftManager_inst$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Class<Methods> cls = Methods.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassGiftManager_inst", "getClassGiftManager_inst()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassGiftManager_getGiftPageList", "getClassGiftManager_getGiftPageList()Ljava/lang/reflect/Method;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$1("ClassGiftManager_inst"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$2("ClassGiftManager_inst"));
        }
        ClassGiftManager_inst$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$3("ClassGiftManager_getGiftPageList"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$4("ClassGiftManager_getGiftPageList"));
        }
        ClassGiftManager_getGiftPageList$delegate = lazy2;
    }

    private Methods() {
    }
}
