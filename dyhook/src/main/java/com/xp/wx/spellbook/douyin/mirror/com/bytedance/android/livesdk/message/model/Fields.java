package com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.message.model;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0012\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R\u001b\u0010\u0015\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R\u001b\u0010\u0018\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R\u001b\u0010\u001b\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R\u001b\u0010\u001e\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R\u001b\u0010!\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0006R\u001b\u0010$\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b%\u0010\u0006R\u001b\u0010'\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b(\u0010\u0006R\u001b\u0010*\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b+\u0010\u0006¨\u0006-"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/android/livesdk/message/model/Fields;", "", "()V", "ClassLivesdkMessageModelAa_id", "Ljava/lang/reflect/Field;", "getClassLivesdkMessageModelAa_id", "()Ljava/lang/reflect/Field;", "ClassLivesdkMessageModelAa_id$delegate", "Lkotlin/Lazy;", "ClassLivesdkMessageModelAa_user", "getClassLivesdkMessageModelAa_user", "ClassLivesdkMessageModelAa_user$delegate", "ClassLivesdkMessageModelAq_gift", "getClassLivesdkMessageModelAq_gift", "ClassLivesdkMessageModelAq_gift$delegate", "ClassLivesdkMessageModelAq_repeatEnd", "getClassLivesdkMessageModelAq_repeatEnd", "ClassLivesdkMessageModelAq_repeatEnd$delegate", "ClassLivesdkMessageModelAq_user", "getClassLivesdkMessageModelAq_user", "ClassLivesdkMessageModelAq_user$delegate", "ClassLivesdkMessageModelBm_k", "getClassLivesdkMessageModelBm_k", "ClassLivesdkMessageModelBm_k$delegate", "ClassLivesdkMessageModelBm_user", "getClassLivesdkMessageModelBm_user", "ClassLivesdkMessageModelBm_user$delegate", "ClassLivesdkMessageModelCz_action", "getClassLivesdkMessageModelCz_action", "ClassLivesdkMessageModelCz_action$delegate", "ClassLivesdkMessageModelCz_user", "getClassLivesdkMessageModelCz_user", "ClassLivesdkMessageModelCz_user$delegate", "ClassLivesdkMessageModelN_c", "getClassLivesdkMessageModelN_c", "ClassLivesdkMessageModelN_c$delegate", "ClassLivesdkMessageModelN_user", "getClassLivesdkMessageModelN_user", "ClassLivesdkMessageModelN_user$delegate", "ClassLivesdkMessageModelV_b", "getClassLivesdkMessageModelV_b", "ClassLivesdkMessageModelV_b$delegate", "ClassLivesdkMessageModelZ_user", "getClassLivesdkMessageModelZ_user", "ClassLivesdkMessageModelZ_user$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Fields.kt */
public final class Fields {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassLivesdkMessageModelAa_id$delegate;
    private static final Lazy ClassLivesdkMessageModelAa_user$delegate;
    private static final Lazy ClassLivesdkMessageModelAq_gift$delegate;
    private static final Lazy ClassLivesdkMessageModelAq_repeatEnd$delegate;
    private static final Lazy ClassLivesdkMessageModelAq_user$delegate;
    private static final Lazy ClassLivesdkMessageModelBm_k$delegate;
    private static final Lazy ClassLivesdkMessageModelBm_user$delegate;
    private static final Lazy ClassLivesdkMessageModelCz_action$delegate;
    private static final Lazy ClassLivesdkMessageModelCz_user$delegate;
    private static final Lazy ClassLivesdkMessageModelN_c$delegate;
    private static final Lazy ClassLivesdkMessageModelN_user$delegate;
    private static final Lazy ClassLivesdkMessageModelV_b$delegate;
    private static final Lazy ClassLivesdkMessageModelZ_user$delegate;
    public static final Fields INSTANCE = new Fields();

    public final Field getClassLivesdkMessageModelAa_id() {
        Lazy lazy = ClassLivesdkMessageModelAa_id$delegate;
        KProperty kProperty = $$delegatedProperties[9];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelAa_user() {
        Lazy lazy = ClassLivesdkMessageModelAa_user$delegate;
        KProperty kProperty = $$delegatedProperties[8];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelAq_gift() {
        Lazy lazy = ClassLivesdkMessageModelAq_gift$delegate;
        KProperty kProperty = $$delegatedProperties[7];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelAq_repeatEnd() {
        Lazy lazy = ClassLivesdkMessageModelAq_repeatEnd$delegate;
        KProperty kProperty = $$delegatedProperties[6];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelAq_user() {
        Lazy lazy = ClassLivesdkMessageModelAq_user$delegate;
        KProperty kProperty = $$delegatedProperties[5];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelBm_k() {
        Lazy lazy = ClassLivesdkMessageModelBm_k$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelBm_user() {
        Lazy lazy = ClassLivesdkMessageModelBm_user$delegate;
        KProperty kProperty = $$delegatedProperties[3];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelCz_action() {
        Lazy lazy = ClassLivesdkMessageModelCz_action$delegate;
        KProperty kProperty = $$delegatedProperties[11];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelCz_user() {
        Lazy lazy = ClassLivesdkMessageModelCz_user$delegate;
        KProperty kProperty = $$delegatedProperties[12];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelN_c() {
        Lazy lazy = ClassLivesdkMessageModelN_c$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelN_user() {
        Lazy lazy = ClassLivesdkMessageModelN_user$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelV_b() {
        Lazy lazy = ClassLivesdkMessageModelV_b$delegate;
        KProperty kProperty = $$delegatedProperties[10];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkMessageModelZ_user() {
        Lazy lazy = ClassLivesdkMessageModelZ_user$delegate;
        KProperty kProperty = $$delegatedProperties[4];
        return (Field) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Lazy lazy9;
        Lazy lazy10;
        Lazy lazy11;
        Lazy lazy12;
        Lazy lazy13;
        Class<Fields> cls = Fields.class;
        String str = "ClassLivesdkMessageModelV_b";
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelN_c", "getClassLivesdkMessageModelN_c()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelN_user", "getClassLivesdkMessageModelN_user()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelBm_k", "getClassLivesdkMessageModelBm_k()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelBm_user", "getClassLivesdkMessageModelBm_user()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelZ_user", "getClassLivesdkMessageModelZ_user()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelAq_user", "getClassLivesdkMessageModelAq_user()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelAq_repeatEnd", "getClassLivesdkMessageModelAq_repeatEnd()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelAq_gift", "getClassLivesdkMessageModelAq_gift()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelAa_user", "getClassLivesdkMessageModelAa_user()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelAa_id", "getClassLivesdkMessageModelAa_id()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelV_b", "getClassLivesdkMessageModelV_b()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelCz_action", "getClassLivesdkMessageModelCz_action()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkMessageModelCz_user", "getClassLivesdkMessageModelCz_user()Ljava/lang/reflect/Field;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$1("ClassLivesdkMessageModelN_c"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$2("ClassLivesdkMessageModelN_c"));
        }
        ClassLivesdkMessageModelN_c$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$3("ClassLivesdkMessageModelN_user"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$4("ClassLivesdkMessageModelN_user"));
        }
        ClassLivesdkMessageModelN_user$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$5("ClassLivesdkMessageModelBm_k"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$6("ClassLivesdkMessageModelBm_k"));
        }
        ClassLivesdkMessageModelBm_k$delegate = lazy3;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy4 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$7("ClassLivesdkMessageModelBm_user"));
        } else {
            lazy4 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$8("ClassLivesdkMessageModelBm_user"));
        }
        ClassLivesdkMessageModelBm_user$delegate = lazy4;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy5 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$9("ClassLivesdkMessageModelZ_user"));
        } else {
            lazy5 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$10("ClassLivesdkMessageModelZ_user"));
        }
        ClassLivesdkMessageModelZ_user$delegate = lazy5;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy6 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$11("ClassLivesdkMessageModelAq_user"));
        } else {
            lazy6 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$12("ClassLivesdkMessageModelAq_user"));
        }
        ClassLivesdkMessageModelAq_user$delegate = lazy6;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy7 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$13("ClassLivesdkMessageModelAq_repeatEnd"));
        } else {
            lazy7 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$14("ClassLivesdkMessageModelAq_repeatEnd"));
        }
        ClassLivesdkMessageModelAq_repeatEnd$delegate = lazy7;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy8 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$15("ClassLivesdkMessageModelAq_gift"));
        } else {
            lazy8 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$16("ClassLivesdkMessageModelAq_gift"));
        }
        ClassLivesdkMessageModelAq_gift$delegate = lazy8;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy9 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$17("ClassLivesdkMessageModelAa_user"));
        } else {
            lazy9 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$18("ClassLivesdkMessageModelAa_user"));
        }
        ClassLivesdkMessageModelAa_user$delegate = lazy9;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy10 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$19("ClassLivesdkMessageModelAa_id"));
        } else {
            lazy10 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$20("ClassLivesdkMessageModelAa_id"));
        }
        ClassLivesdkMessageModelAa_id$delegate = lazy10;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy11 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$21(str));
        } else {
            lazy11 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$22(str));
        }
        ClassLivesdkMessageModelV_b$delegate = lazy11;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy12 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$23("ClassLivesdkMessageModelCz_action"));
        } else {
            lazy12 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$24("ClassLivesdkMessageModelCz_action"));
        }
        ClassLivesdkMessageModelCz_action$delegate = lazy12;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy13 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$25("ClassLivesdkMessageModelCz_user"));
        } else {
            lazy13 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$26("ClassLivesdkMessageModelCz_user"));
        }
        ClassLivesdkMessageModelCz_user$delegate = lazy13;
    }

    private Fields() {
    }
}
