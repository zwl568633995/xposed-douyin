package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.profile.model;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0012\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R\u001b\u0010\u0015\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R\u001b\u0010\u0018\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R\u001b\u0010\u001b\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R\u001b\u0010\u001e\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R\u001b\u0010!\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0006R\u001b\u0010$\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b%\u0010\u0006R\u001b\u0010'\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b(\u0010\u0006R\u001b\u0010*\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b+\u0010\u0006R\u001b\u0010-\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b.\u0010\u0006R\u001b\u00100\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b1\u0010\u0006¨\u00063"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/profile/model/Fields;", "", "()V", "ClassProfileModelUser_avatarLarger", "Ljava/lang/reflect/Field;", "getClassProfileModelUser_avatarLarger", "()Ljava/lang/reflect/Field;", "ClassProfileModelUser_avatarLarger$delegate", "Lkotlin/Lazy;", "ClassProfileModelUser_avatarThumb", "getClassProfileModelUser_avatarThumb", "ClassProfileModelUser_avatarThumb$delegate", "ClassProfileModelUser_bindPhone", "getClassProfileModelUser_bindPhone", "ClassProfileModelUser_bindPhone$delegate", "ClassProfileModelUser_fansCount", "getClassProfileModelUser_fansCount", "ClassProfileModelUser_fansCount$delegate", "ClassProfileModelUser_favoritingCount", "getClassProfileModelUser_favoritingCount", "ClassProfileModelUser_favoritingCount$delegate", "ClassProfileModelUser_followStatus", "getClassProfileModelUser_followStatus", "ClassProfileModelUser_followStatus$delegate", "ClassProfileModelUser_followingCount", "getClassProfileModelUser_followingCount", "ClassProfileModelUser_followingCount$delegate", "ClassProfileModelUser_friendCount", "getClassProfileModelUser_friendCount", "ClassProfileModelUser_friendCount$delegate", "ClassProfileModelUser_gender", "getClassProfileModelUser_gender", "ClassProfileModelUser_gender$delegate", "ClassProfileModelUser_nickname", "getClassProfileModelUser_nickname", "ClassProfileModelUser_nickname$delegate", "ClassProfileModelUser_secUid", "getClassProfileModelUser_secUid", "ClassProfileModelUser_secUid$delegate", "ClassProfileModelUser_shortId", "getClassProfileModelUser_shortId", "ClassProfileModelUser_shortId$delegate", "ClassProfileModelUser_signature", "getClassProfileModelUser_signature", "ClassProfileModelUser_signature$delegate", "ClassProfileModelUser_uid", "getClassProfileModelUser_uid", "ClassProfileModelUser_uid$delegate", "ClassProfileModelUser_uniqueId", "getClassProfileModelUser_uniqueId", "ClassProfileModelUser_uniqueId$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Fields.kt */
public final class Fields {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassProfileModelUser_avatarLarger$delegate;
    private static final Lazy ClassProfileModelUser_avatarThumb$delegate;
    private static final Lazy ClassProfileModelUser_bindPhone$delegate;
    private static final Lazy ClassProfileModelUser_fansCount$delegate;
    private static final Lazy ClassProfileModelUser_favoritingCount$delegate;
    private static final Lazy ClassProfileModelUser_followStatus$delegate;
    private static final Lazy ClassProfileModelUser_followingCount$delegate;
    private static final Lazy ClassProfileModelUser_friendCount$delegate;
    private static final Lazy ClassProfileModelUser_gender$delegate;
    private static final Lazy ClassProfileModelUser_nickname$delegate;
    private static final Lazy ClassProfileModelUser_secUid$delegate;
    private static final Lazy ClassProfileModelUser_shortId$delegate;
    private static final Lazy ClassProfileModelUser_signature$delegate;
    private static final Lazy ClassProfileModelUser_uid$delegate;
    private static final Lazy ClassProfileModelUser_uniqueId$delegate;
    public static final Fields INSTANCE = new Fields();

    public final Field getClassProfileModelUser_avatarLarger() {
        Lazy lazy = ClassProfileModelUser_avatarLarger$delegate;
        KProperty kProperty = $$delegatedProperties[13];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_avatarThumb() {
        Lazy lazy = ClassProfileModelUser_avatarThumb$delegate;
        KProperty kProperty = $$delegatedProperties[12];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_bindPhone() {
        Lazy lazy = ClassProfileModelUser_bindPhone$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_fansCount() {
        Lazy lazy = ClassProfileModelUser_fansCount$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_favoritingCount() {
        Lazy lazy = ClassProfileModelUser_favoritingCount$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_followStatus() {
        Lazy lazy = ClassProfileModelUser_followStatus$delegate;
        KProperty kProperty = $$delegatedProperties[14];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_followingCount() {
        Lazy lazy = ClassProfileModelUser_followingCount$delegate;
        KProperty kProperty = $$delegatedProperties[3];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_friendCount() {
        Lazy lazy = ClassProfileModelUser_friendCount$delegate;
        KProperty kProperty = $$delegatedProperties[4];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_gender() {
        Lazy lazy = ClassProfileModelUser_gender$delegate;
        KProperty kProperty = $$delegatedProperties[5];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_nickname() {
        Lazy lazy = ClassProfileModelUser_nickname$delegate;
        KProperty kProperty = $$delegatedProperties[6];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_secUid() {
        Lazy lazy = ClassProfileModelUser_secUid$delegate;
        KProperty kProperty = $$delegatedProperties[7];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_shortId() {
        Lazy lazy = ClassProfileModelUser_shortId$delegate;
        KProperty kProperty = $$delegatedProperties[8];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_signature() {
        Lazy lazy = ClassProfileModelUser_signature$delegate;
        KProperty kProperty = $$delegatedProperties[11];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_uid() {
        Lazy lazy = ClassProfileModelUser_uid$delegate;
        KProperty kProperty = $$delegatedProperties[9];
        return (Field) lazy.getValue();
    }

    public final Field getClassProfileModelUser_uniqueId() {
        Lazy lazy = ClassProfileModelUser_uniqueId$delegate;
        KProperty kProperty = $$delegatedProperties[10];
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
        Lazy lazy14;
        Lazy lazy15;
        Class<Fields> cls = Fields.class;
        String str = "ClassProfileModelUser_uniqueId";
        String str2 = "ClassProfileModelUser_signature";
        String str3 = "ClassProfileModelUser_avatarThumb";
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_bindPhone", "getClassProfileModelUser_bindPhone()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_fansCount", "getClassProfileModelUser_fansCount()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_favoritingCount", "getClassProfileModelUser_favoritingCount()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_followingCount", "getClassProfileModelUser_followingCount()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_friendCount", "getClassProfileModelUser_friendCount()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_gender", "getClassProfileModelUser_gender()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_nickname", "getClassProfileModelUser_nickname()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_secUid", "getClassProfileModelUser_secUid()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_shortId", "getClassProfileModelUser_shortId()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_uid", "getClassProfileModelUser_uid()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_uniqueId", "getClassProfileModelUser_uniqueId()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_signature", "getClassProfileModelUser_signature()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_avatarThumb", "getClassProfileModelUser_avatarThumb()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_avatarLarger", "getClassProfileModelUser_avatarLarger()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassProfileModelUser_followStatus", "getClassProfileModelUser_followStatus()Ljava/lang/reflect/Field;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$1("ClassProfileModelUser_bindPhone"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$2("ClassProfileModelUser_bindPhone"));
        }
        ClassProfileModelUser_bindPhone$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$3("ClassProfileModelUser_fansCount"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$4("ClassProfileModelUser_fansCount"));
        }
        ClassProfileModelUser_fansCount$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$5("ClassProfileModelUser_favoritingCount"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$6("ClassProfileModelUser_favoritingCount"));
        }
        ClassProfileModelUser_favoritingCount$delegate = lazy3;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy4 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$7("ClassProfileModelUser_followingCount"));
        } else {
            lazy4 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$8("ClassProfileModelUser_followingCount"));
        }
        ClassProfileModelUser_followingCount$delegate = lazy4;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy5 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$9("ClassProfileModelUser_friendCount"));
        } else {
            lazy5 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$10("ClassProfileModelUser_friendCount"));
        }
        ClassProfileModelUser_friendCount$delegate = lazy5;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy6 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$11("ClassProfileModelUser_gender"));
        } else {
            lazy6 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$12("ClassProfileModelUser_gender"));
        }
        ClassProfileModelUser_gender$delegate = lazy6;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy7 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$13("ClassProfileModelUser_nickname"));
        } else {
            lazy7 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$14("ClassProfileModelUser_nickname"));
        }
        ClassProfileModelUser_nickname$delegate = lazy7;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy8 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$15("ClassProfileModelUser_secUid"));
        } else {
            lazy8 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$16("ClassProfileModelUser_secUid"));
        }
        ClassProfileModelUser_secUid$delegate = lazy8;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy9 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$17("ClassProfileModelUser_shortId"));
        } else {
            lazy9 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$18("ClassProfileModelUser_shortId"));
        }
        ClassProfileModelUser_shortId$delegate = lazy9;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy10 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$19("ClassProfileModelUser_uid"));
        } else {
            lazy10 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$20("ClassProfileModelUser_uid"));
        }
        ClassProfileModelUser_uid$delegate = lazy10;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy11 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$21(str));
        } else {
            lazy11 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$22(str));
        }
        ClassProfileModelUser_uniqueId$delegate = lazy11;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy12 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$23(str2));
        } else {
            lazy12 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$24(str2));
        }
        ClassProfileModelUser_signature$delegate = lazy12;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy13 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$25(str3));
        } else {
            lazy13 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$26(str3));
        }
        ClassProfileModelUser_avatarThumb$delegate = lazy13;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy14 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$27("ClassProfileModelUser_avatarLarger"));
        } else {
            lazy14 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$28("ClassProfileModelUser_avatarLarger"));
        }
        ClassProfileModelUser_avatarLarger$delegate = lazy14;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy15 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$29("ClassProfileModelUser_followStatus"));
        } else {
            lazy15 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$30("ClassProfileModelUser_followStatus"));
        }
        ClassProfileModelUser_followStatus$delegate = lazy15;
    }

    private Fields() {
    }
}
