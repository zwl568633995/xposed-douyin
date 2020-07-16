package com.xp.wx.spellbook.base;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 1, 13})
/* compiled from: Classes.kt */
final class Classes$filterByMethod$4$1 extends Lambda implements Function1<Class<?>, String> {
    public static final Classes$filterByMethod$4$1 INSTANCE = new Classes$filterByMethod$4$1();

    Classes$filterByMethod$4$1() {
        super(1);
    }

    public final String invoke(Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "it");
        String simpleName = cls.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "it.simpleName");
        return simpleName;
    }
}
