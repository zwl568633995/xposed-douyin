package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme;

import com.xp.wx.spellbook.douyin.DyGlobal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/Classes;", "", "()V", "ClassIAccountService", "Ljava/lang/Class;", "getClassIAccountService", "()Ljava/lang/Class;", "ClassIAccountService$delegate", "Lkotlin/Lazy;", "ClassIAccountUserService", "getClassIAccountUserService", "ClassIAccountUserService$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Classes.kt */
public final class Classes {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassIAccountService$delegate;
    private static final Lazy ClassIAccountUserService$delegate;
    public static final Classes INSTANCE = new Classes();

    public final Class<?> getClassIAccountService() {
        Lazy lazy = ClassIAccountService$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Class) lazy.getValue();
    }

    public final Class<?> getClassIAccountUserService() {
        Lazy lazy = ClassIAccountUserService$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Class) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Class<Classes> cls = Classes.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassIAccountUserService", "getClassIAccountUserService()Ljava/lang/Class;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassIAccountService", "getClassIAccountService()Ljava/lang/Class;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Classes$$special$$inlined$dyLazy$1("ClassIAccountUserService"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Classes$$special$$inlined$dyLazy$2("ClassIAccountUserService"));
        }
        ClassIAccountUserService$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Classes$$special$$inlined$dyLazy$3("ClassIAccountService"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Classes$$special$$inlined$dyLazy$4("ClassIAccountService"));
        }
        ClassIAccountService$delegate = lazy2;
    }

    private Classes() {
    }
}
