package com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdkapi.depend.model.live;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/android/livesdkapi/depend/model/live/Fields;", "", "()V", "ClassLivesdkapiDependModelLiveRoom_id", "Ljava/lang/reflect/Field;", "getClassLivesdkapiDependModelLiveRoom_id", "()Ljava/lang/reflect/Field;", "ClassLivesdkapiDependModelLiveRoom_id$delegate", "Lkotlin/Lazy;", "ClassLivesdkapiDependModelLiveRoom_owner", "getClassLivesdkapiDependModelLiveRoom_owner", "ClassLivesdkapiDependModelLiveRoom_owner$delegate", "ClassLivesdkapiDependModelLiveRoom_ownerUserId", "getClassLivesdkapiDependModelLiveRoom_ownerUserId", "ClassLivesdkapiDependModelLiveRoom_ownerUserId$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Fields.kt */
public final class Fields {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassLivesdkapiDependModelLiveRoom_id$delegate;
    private static final Lazy ClassLivesdkapiDependModelLiveRoom_owner$delegate;
    private static final Lazy ClassLivesdkapiDependModelLiveRoom_ownerUserId$delegate;
    public static final Fields INSTANCE = new Fields();

    public final Field getClassLivesdkapiDependModelLiveRoom_id() {
        Lazy lazy = ClassLivesdkapiDependModelLiveRoom_id$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkapiDependModelLiveRoom_owner() {
        Lazy lazy = ClassLivesdkapiDependModelLiveRoom_owner$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Field) lazy.getValue();
    }

    public final Field getClassLivesdkapiDependModelLiveRoom_ownerUserId() {
        Lazy lazy = ClassLivesdkapiDependModelLiveRoom_ownerUserId$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Field) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Class<Fields> cls = Fields.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkapiDependModelLiveRoom_id", "getClassLivesdkapiDependModelLiveRoom_id()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkapiDependModelLiveRoom_ownerUserId", "getClassLivesdkapiDependModelLiveRoom_ownerUserId()Ljava/lang/reflect/Field;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassLivesdkapiDependModelLiveRoom_owner", "getClassLivesdkapiDependModelLiveRoom_owner()Ljava/lang/reflect/Field;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$1("ClassLivesdkapiDependModelLiveRoom_id"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$2("ClassLivesdkapiDependModelLiveRoom_id"));
        }
        ClassLivesdkapiDependModelLiveRoom_id$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$3("ClassLivesdkapiDependModelLiveRoom_ownerUserId"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$4("ClassLivesdkapiDependModelLiveRoom_ownerUserId"));
        }
        ClassLivesdkapiDependModelLiveRoom_ownerUserId$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$5("ClassLivesdkapiDependModelLiveRoom_owner"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$6("ClassLivesdkapiDependModelLiveRoom_owner"));
        }
        ClassLivesdkapiDependModelLiveRoom_owner$delegate = lazy3;
    }

    private Fields() {
    }
}
