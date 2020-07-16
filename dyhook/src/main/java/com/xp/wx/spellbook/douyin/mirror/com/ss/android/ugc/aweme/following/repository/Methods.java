package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.following.repository;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/following/repository/Methods;", "", "()V", "ClassFollowRelationApi_a_a", "Ljava/lang/reflect/Method;", "getClassFollowRelationApi_a_a", "()Ljava/lang/reflect/Method;", "ClassFollowRelationApi_a_a$delegate", "Lkotlin/Lazy;", "ClassFollowRelationApi_queryFollowerList", "getClassFollowRelationApi_queryFollowerList", "ClassFollowRelationApi_queryFollowerList$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Methods.kt */
public final class Methods {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassFollowRelationApi_a_a$delegate;
    private static final Lazy ClassFollowRelationApi_queryFollowerList$delegate;
    public static final Methods INSTANCE = new Methods();

    public final Method getClassFollowRelationApi_a_a() {
        Lazy lazy = ClassFollowRelationApi_a_a$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Method) lazy.getValue();
    }

    public final Method getClassFollowRelationApi_queryFollowerList() {
        Lazy lazy = ClassFollowRelationApi_queryFollowerList$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Class<Methods> cls = Methods.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassFollowRelationApi_queryFollowerList", "getClassFollowRelationApi_queryFollowerList()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassFollowRelationApi_a_a", "getClassFollowRelationApi_a_a()Ljava/lang/reflect/Method;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$1("ClassFollowRelationApi_queryFollowerList"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$2("ClassFollowRelationApi_queryFollowerList"));
        }
        ClassFollowRelationApi_queryFollowerList$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$3("ClassFollowRelationApi_a_a"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$4("ClassFollowRelationApi_a_a"));
        }
        ClassFollowRelationApi_a_a$delegate = lazy2;
    }

    private Methods() {
    }
}
