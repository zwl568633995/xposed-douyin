package com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.livecommerce.h;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/android/livesdk/livecommerce/h/Fields;", "", "()V", "ClassLivesdkLivecommerceHA_d", "Ljava/lang/reflect/Field;", "getClassLivesdkLivecommerceHA_d", "()Ljava/lang/reflect/Field;", "ClassLivesdkLivecommerceHA_d$delegate", "Lkotlin/Lazy;", "ClassLivesdkLivecommerceHA_h", "getClassLivesdkLivecommerceHA_h", "ClassLivesdkLivecommerceHA_h$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Fields.kt */
public final class Fields {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassLivesdkLivecommerceHA_d$delegate;
    private static final Lazy ClassLivesdkLivecommerceHA_h$delegate;
    public static final Fields INSTANCE = new Fields();

    public final Field getClassLivesdkLivecommerceHA_d() {
        Lazy lazy = ClassLivesdkLivecommerceHA_d$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkLivecommerceHA_h() {
        Lazy lazy = ClassLivesdkLivecommerceHA_h$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Field) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Class<Fields> cls = Fields.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkLivecommerceHA_d", "getClassLivesdkLivecommerceHA_d()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkLivecommerceHA_h", "getClassLivesdkLivecommerceHA_h()Ljava/lang/reflect/Field;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$1("ClassLivesdkLivecommerceHA_d"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$2("ClassLivesdkLivecommerceHA_d"));
        }
        ClassLivesdkLivecommerceHA_d$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$3("ClassLivesdkLivecommerceHA_h"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$4("ClassLivesdkLivecommerceHA_h"));
        }
        ClassLivesdkLivecommerceHA_h$delegate = lazy2;
    }

    private Fields() {
    }
}
