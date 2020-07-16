package com.xp.wx.util;

import android.view.View;
import com.xp.api.XposedHelpers;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "getter", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* compiled from: ViewUtil.kt */
final class ViewUtil$dumpViewGroup$1$getAttr$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ Ref.ObjectRef $attrs;
    final /* synthetic */ View $child;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewUtil$dumpViewGroup$1$getAttr$1(View view, Ref.ObjectRef objectRef) {
        super(1);
        this.$child = view;
        this.$attrs = objectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkParameterIsNotNull(str, "getter");
        Method[] methods = this.$child.getClass().getMethods();
        Intrinsics.checkExpressionValueIsNotNull(methods, "child::class.java.methods");
        int i = 0;
        for (Method method : methods) {
            Intrinsics.checkExpressionValueIsNotNull(method, "it");
            if (Intrinsics.areEqual((Object) method.getName(), (Object) str)) {
                i++;
            }
        }
        if (i != 0) {
            Ref.ObjectRef objectRef = this.$attrs;
            objectRef.element = MapsKt.plus((Map) objectRef.element, TuplesKt.to(str, XposedHelpers.callMethod(this.$child, str, new Object[0])));
        }
    }
}
