package com.xp.wx.spellbook.util;

import android.util.Log;
import java.lang.Thread;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "t", "", "uncaughtException"}, k = 3, mv = {1, 1, 13})
/* compiled from: BasicUtil.kt */
public final class BasicUtil$tryAsynchronously$2$1 implements Thread.UncaughtExceptionHandler {
    public static final BasicUtil$tryAsynchronously$2$1 INSTANCE = new BasicUtil$tryAsynchronously$2$1();

    public final void uncaughtException(Thread thread, Throwable th) {
        Log.e("Xposed", Log.getStackTraceString(th));
    }
}
