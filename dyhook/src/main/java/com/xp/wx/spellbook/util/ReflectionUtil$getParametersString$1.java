package com.xp.wx.spellbook.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 1, 13})
/* compiled from: ReflectionUtil.kt */
final class ReflectionUtil$getParametersString$1 extends Lambda implements Function1<Class<?>, CharSequence> {
    public static final ReflectionUtil$getParametersString$1 INSTANCE = new ReflectionUtil$getParametersString$1();

    ReflectionUtil$getParametersString$1() {
        super(1);
    }

    public final CharSequence invoke(Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "it");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return canonicalName;
    }
}
