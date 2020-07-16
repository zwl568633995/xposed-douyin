package com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.gift.model;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0012\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R\u001b\u0010\u0015\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R\u001b\u0010\u0018\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/android/livesdk/gift/model/Fields;", "", "()V", "ClassLivesdkGiftModelD_combo", "Ljava/lang/reflect/Field;", "getClassLivesdkGiftModelD_combo", "()Ljava/lang/reflect/Field;", "ClassLivesdkGiftModelD_combo$delegate", "Lkotlin/Lazy;", "ClassLivesdkGiftModelD_describe", "getClassLivesdkGiftModelD_describe", "ClassLivesdkGiftModelD_describe$delegate", "ClassLivesdkGiftModelD_id", "getClassLivesdkGiftModelD_id", "ClassLivesdkGiftModelD_id$delegate", "ClassLivesdkGiftModelD_image", "getClassLivesdkGiftModelD_image", "ClassLivesdkGiftModelD_image$delegate", "ClassLivesdkGiftModelD_name", "getClassLivesdkGiftModelD_name", "ClassLivesdkGiftModelD_name$delegate", "ClassLivesdkGiftModelD_type", "getClassLivesdkGiftModelD_type", "ClassLivesdkGiftModelD_type$delegate", "ClassLivesdkGiftModelGiftPage_gifts", "getClassLivesdkGiftModelGiftPage_gifts", "ClassLivesdkGiftModelGiftPage_gifts$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Fields.kt */
public final class Fields {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassLivesdkGiftModelD_combo$delegate;
    private static final Lazy ClassLivesdkGiftModelD_describe$delegate;
    private static final Lazy ClassLivesdkGiftModelD_id$delegate;
    private static final Lazy ClassLivesdkGiftModelD_image$delegate;
    private static final Lazy ClassLivesdkGiftModelD_name$delegate;
    private static final Lazy ClassLivesdkGiftModelD_type$delegate;
    private static final Lazy ClassLivesdkGiftModelGiftPage_gifts$delegate;
    public static final Fields INSTANCE = new Fields();

    public final Field getClassLivesdkGiftModelD_combo() {
        Lazy lazy = ClassLivesdkGiftModelD_combo$delegate;
        KProperty kProperty = $$delegatedProperties[5];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkGiftModelD_describe() {
        Lazy lazy = ClassLivesdkGiftModelD_describe$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkGiftModelD_id() {
        Lazy lazy = ClassLivesdkGiftModelD_id$delegate;
        KProperty kProperty = $$delegatedProperties[3];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkGiftModelD_image() {
        Lazy lazy = ClassLivesdkGiftModelD_image$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkGiftModelD_name() {
        Lazy lazy = ClassLivesdkGiftModelD_name$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkGiftModelD_type() {
        Lazy lazy = ClassLivesdkGiftModelD_type$delegate;
        KProperty kProperty = $$delegatedProperties[4];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkGiftModelGiftPage_gifts() {
        Lazy lazy = ClassLivesdkGiftModelGiftPage_gifts$delegate;
        KProperty kProperty = $$delegatedProperties[6];
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
        Class<Fields> cls = Fields.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkGiftModelD_name", "getClassLivesdkGiftModelD_name()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkGiftModelD_image", "getClassLivesdkGiftModelD_image()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkGiftModelD_describe", "getClassLivesdkGiftModelD_describe()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkGiftModelD_id", "getClassLivesdkGiftModelD_id()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkGiftModelD_type", "getClassLivesdkGiftModelD_type()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkGiftModelD_combo", "getClassLivesdkGiftModelD_combo()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkGiftModelGiftPage_gifts", "getClassLivesdkGiftModelGiftPage_gifts()Ljava/lang/reflect/Field;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$1("ClassLivesdkGiftModelD_name"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$2("ClassLivesdkGiftModelD_name"));
        }
        ClassLivesdkGiftModelD_name$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$3("ClassLivesdkGiftModelD_image"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$4("ClassLivesdkGiftModelD_image"));
        }
        ClassLivesdkGiftModelD_image$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$5("ClassLivesdkGiftModelD_describe"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$6("ClassLivesdkGiftModelD_describe"));
        }
        ClassLivesdkGiftModelD_describe$delegate = lazy3;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy4 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$7("ClassLivesdkGiftModelD_id"));
        } else {
            lazy4 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$8("ClassLivesdkGiftModelD_id"));
        }
        ClassLivesdkGiftModelD_id$delegate = lazy4;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy5 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$9("ClassLivesdkGiftModelD_e"));
        } else {
            lazy5 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$10("ClassLivesdkGiftModelD_e"));
        }
        ClassLivesdkGiftModelD_type$delegate = lazy5;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy6 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$11("ClassLivesdkGiftModelD_combo"));
        } else {
            lazy6 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$12("ClassLivesdkGiftModelD_combo"));
        }
        ClassLivesdkGiftModelD_combo$delegate = lazy6;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy7 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$13("ClassLivesdkGiftModelGiftPage_gifts"));
        } else {
            lazy7 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$14("ClassLivesdkGiftModelGiftPage_gifts"));
        }
        ClassLivesdkGiftModelGiftPage_gifts$delegate = lazy7;
    }

    private Fields() {
    }
}
