package com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.chatroom.viewmodule;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/android/livesdk/chatroom/viewmodule/Methods;", "", "()V", "ClassCommentWidget_a", "Ljava/lang/reflect/Method;", "getClassCommentWidget_a", "()Ljava/lang/reflect/Method;", "ClassCommentWidget_a$delegate", "Lkotlin/Lazy;", "ClassCommentWidget_onPause", "getClassCommentWidget_onPause", "ClassCommentWidget_onPause$delegate", "ClassCommentWidget_onResume", "getClassCommentWidget_onResume", "ClassCommentWidget_onResume$delegate", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Methods.kt */
public final class Methods {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassCommentWidget_a$delegate;
    private static final Lazy ClassCommentWidget_onPause$delegate;
    private static final Lazy ClassCommentWidget_onResume$delegate;
    public static final Methods INSTANCE = new Methods();

    public final Method getClassCommentWidget_a() {
        Lazy lazy = ClassCommentWidget_a$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (Method) lazy.getValue();
    }

    public final Method getClassCommentWidget_onPause() {
        Lazy lazy = ClassCommentWidget_onPause$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Method) lazy.getValue();
    }

    public final Method getClassCommentWidget_onResume() {
        Lazy lazy = ClassCommentWidget_onResume$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Class<Methods> cls = Methods.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommentWidget_onResume", "getClassCommentWidget_onResume()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommentWidget_onPause", "getClassCommentWidget_onPause()Ljava/lang/reflect/Method;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommentWidget_a", "getClassCommentWidget_a()Ljava/lang/reflect/Method;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$1("ClassCommentWidget_onResume"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$2("ClassCommentWidget_onResume"));
        }
        ClassCommentWidget_onResume$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$3("ClassCommentWidget_onPause"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$4("ClassCommentWidget_onPause"));
        }
        ClassCommentWidget_onPause$delegate = lazy2;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy3 = new DyGlobal.UnitTestLazyImpl(new Methods$$special$$inlined$dyLazy$5("ClassCommentWidget_a"));
        } else {
            lazy3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Methods$$special$$inlined$dyLazy$6("ClassCommentWidget_a"));
        }
        ClassCommentWidget_a$delegate = lazy3;
    }

    private Methods() {
    }
}
