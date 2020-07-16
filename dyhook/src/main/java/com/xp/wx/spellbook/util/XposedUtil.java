package com.xp.wx.spellbook.util;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.xp.wx.spellbook.base.Hooker;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0019\u0010\u0010\u001a\u00020\n2\u000e\b\u0004\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xp/wx/spellbook/util/XposedUtil;", "", "()V", "managerHandler", "Landroid/os/Handler;", "managerThread", "Landroid/os/HandlerThread;", "workerPool", "Ljava/util/concurrent/ExecutorService;", "postAsyn", "", "run", "Ljava/lang/Runnable;", "postHooker", "hooker", "Lcom/xp/wx/spellbook/base/Hooker;", "tryHook", "hook", "Lkotlin/Function0;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: XposedUtil.kt */
public final class XposedUtil {
    public static final XposedUtil INSTANCE = new XposedUtil();
    private static final Handler managerHandler = new Handler(managerThread.getLooper());
    private static final HandlerThread managerThread;
    /* access modifiers changed from: private */
    public static final ExecutorService workerPool = ParallelUtil.createThreadPool$default(0, 1, (Object) null);

    static {
        HandlerThread handlerThread = new HandlerThread("HookHandler");
        handlerThread.start();
        managerThread = handlerThread;
    }

    private XposedUtil() {
    }

    /* access modifiers changed from: private */
    @JvmStatic
    public static final void tryHook(Function0<Unit> function0) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                function0.invoke();
            } catch (Throwable th) {
                Log.e("Xposed", Log.getStackTraceString(th));
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            workerPool.execute(new XposedUtil$tryHook$1(function0));
        } else {
            workerPool.execute(new XposedUtil$tryHook$2(function0));
        }
    }

    @JvmStatic
    public static final void postHooker(Hooker hooker) {
        Intrinsics.checkParameterIsNotNull(hooker, "hooker");
        managerHandler.post(new XposedUtil$postHooker$1(hooker));
    }

    public final void postAsyn(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "run");
        managerHandler.post(runnable);
    }
}
