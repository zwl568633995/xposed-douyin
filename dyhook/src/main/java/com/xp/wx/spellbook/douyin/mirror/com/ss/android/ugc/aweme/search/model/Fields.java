package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.search.model;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/search/model/Fields;", "", "()V", "ClassSearchModelJ_currentSearchKeyword", "Ljava/lang/reflect/Field;", "getClassSearchModelJ_currentSearchKeyword", "()Ljava/lang/reflect/Field;", "ClassSearchModelJ_currentSearchKeyword$delegate", "Lkotlin/Lazy;", "ClassSearchModelJ_enterFrom", "getClassSearchModelJ_enterFrom", "ClassSearchModelJ_enterFrom$delegate", "ClassSearchModelJ_keyword", "getClassSearchModelJ_keyword", "ClassSearchModelJ_keyword$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Fields.kt */
public final class Fields {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassSearchModelJ_currentSearchKeyword$delegate;
    private static final Lazy ClassSearchModelJ_enterFrom$delegate;
    private static final Lazy ClassSearchModelJ_keyword$delegate;
    public static final Fields INSTANCE = new Fields();

    public final Field getClassSearchModelJ_currentSearchKeyword() {
        Lazy lazy = ClassSearchModelJ_currentSearchKeyword$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Field) lazy.getValue();
    }

    public final Field getClassSearchModelJ_enterFrom() {
        Lazy lazy = ClassSearchModelJ_enterFrom$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Field) lazy.getValue();
    }

    public final Field getClassSearchModelJ_keyword() {
        Lazy lazy = ClassSearchModelJ_keyword$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Field) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Class<Fields> cls = Fields.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassSearchModelJ_enterFrom", "getClassSearchModelJ_enterFrom()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassSearchModelJ_currentSearchKeyword", "getClassSearchModelJ_currentSearchKeyword()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassSearchModelJ_keyword", "getClassSearchModelJ_keyword()Ljava/lang/reflect/Field;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$1("ClassSearchModelJ_enterFrom"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$2("ClassSearchModelJ_enterFrom"));
        }
        ClassSearchModelJ_enterFrom$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$3("ClassSearchModelJ_currentSearchKeyword"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$4("ClassSearchModelJ_currentSearchKeyword"));
        }
        ClassSearchModelJ_currentSearchKeyword$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$5("ClassSearchModelJ_keyword"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$6("ClassSearchModelJ_keyword"));
        }
        ClassSearchModelJ_keyword$delegate = lazy3;
    }

    private Fields() {
    }
}
