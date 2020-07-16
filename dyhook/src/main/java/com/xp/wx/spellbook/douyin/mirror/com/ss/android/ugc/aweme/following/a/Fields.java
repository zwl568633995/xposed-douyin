package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.following.a;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0012\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/following/a/Fields;", "", "()V", "ClassFollowingC_followers", "Ljava/lang/reflect/Field;", "getClassFollowingC_followers", "()Ljava/lang/reflect/Field;", "ClassFollowingC_followers$delegate", "Lkotlin/Lazy;", "ClassFollowingC_hasMore", "getClassFollowingC_hasMore", "ClassFollowingC_hasMore$delegate", "ClassFollowingC_hotsoonText", "getClassFollowingC_hotsoonText", "ClassFollowingC_hotsoonText$delegate", "ClassFollowingC_minTime", "getClassFollowingC_minTime", "ClassFollowingC_minTime$delegate", "ClassFollowingC_total", "getClassFollowingC_total", "ClassFollowingC_total$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Fields.kt */
public final class Fields {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassFollowingC_followers$delegate;
    private static final Lazy ClassFollowingC_hasMore$delegate;
    private static final Lazy ClassFollowingC_hotsoonText$delegate;
    private static final Lazy ClassFollowingC_minTime$delegate;
    private static final Lazy ClassFollowingC_total$delegate;
    public static final Fields INSTANCE = new Fields();

    public final Field getClassFollowingC_followers() {
        Lazy lazy = ClassFollowingC_followers$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Field) lazy.getValue();
    }

    public final Field getClassFollowingC_hasMore() {
        Lazy lazy = ClassFollowingC_hasMore$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Field) lazy.getValue();
    }

    public final Field getClassFollowingC_hotsoonText() {
        Lazy lazy = ClassFollowingC_hotsoonText$delegate;
        KProperty kProperty = $$delegatedProperties[4];
        return (Field) lazy.getValue();
    }

    public final Field getClassFollowingC_minTime() {
        Lazy lazy = ClassFollowingC_minTime$delegate;
        KProperty kProperty = $$delegatedProperties[3];
        return (Field) lazy.getValue();
    }

    public final Field getClassFollowingC_total() {
        Lazy lazy = ClassFollowingC_total$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Field) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Class<Fields> cls = Fields.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassFollowingC_followers", "getClassFollowingC_followers()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassFollowingC_hasMore", "getClassFollowingC_hasMore()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassFollowingC_total", "getClassFollowingC_total()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassFollowingC_minTime", "getClassFollowingC_minTime()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassFollowingC_hotsoonText", "getClassFollowingC_hotsoonText()Ljava/lang/reflect/Field;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$1("ClassFollowingC_followers"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$2("ClassFollowingC_followers"));
        }
        ClassFollowingC_followers$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$3("ClassFollowingC_hasMore"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$4("ClassFollowingC_hasMore"));
        }
        ClassFollowingC_hasMore$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$5("ClassFollowingC_total"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$6("ClassFollowingC_total"));
        }
        ClassFollowingC_total$delegate = lazy3;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy4 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$7("ClassFollowingC_minTime"));
        } else {
            lazy4 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$8("ClassFollowingC_minTime"));
        }
        ClassFollowingC_minTime$delegate = lazy4;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy5 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$9("ClassFollowingC_hotsoonText"));
        } else {
            lazy5 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$10("ClassFollowingC_hotsoonText"));
        }
        ClassFollowingC_hotsoonText$delegate = lazy5;
    }

    private Fields() {
    }
}
