package com.xp.wx.spellbook.util;

import android.util.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\bJ*\u0010\b\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0006H\b¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0006H\b¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/xp/wx/spellbook/util/BasicUtil;", "", "()V", "tryAsynchronously", "Ljava/lang/Thread;", "func", "Lkotlin/Function0;", "", "trySilently", "T", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "tryVerbosely", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: BasicUtil.kt */
public final class BasicUtil {
    public static final BasicUtil INSTANCE = new BasicUtil();

    private BasicUtil() {
    }

    @JvmStatic
    public static final <T> T trySilently(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "func");
        try {
            return function0.invoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    @JvmStatic
    public static final <T> T tryVerbosely(Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "func");
        try {
            return function0.invoke();
        } catch (Throwable th) {
            Log.e("Xposed", Log.getStackTraceString(th));
            return null;
        }
    }

    @JvmStatic
    public static final Thread tryAsynchronously(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "func");
        Thread thread$default = ThreadsKt.thread$default(true, false, (ClassLoader) null, (String) null, 0, new BasicUtil$tryAsynchronously$1(function0), 30, (Object) null);
        thread$default.setUncaughtExceptionHandler(BasicUtil$tryAsynchronously$2$1.INSTANCE);
        return thread$default;
    }
}
