package com.xp.wx.spellbook.douyin;

import com.xp.api.XC_MethodHook;
import com.xp.wx.backend.douyin.util.ConfigUtil;
import com.xp.wx.backend.threadpool.ThreadPool;
import com.xp.wx.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/xp/wx/spellbook/douyin/DyGlobal$listenLogout$1", "Lcom/xp/api/XC_MethodHook;", "afterHookedMethod", "", "p", "Lcom/xp/api/XC_MethodHook$MethodHookParam;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyGlobal.kt */
public final class DyGlobal$listenLogout$1 extends XC_MethodHook {
    DyGlobal$listenLogout$1() {
    }

    /* access modifiers changed from: protected */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Intrinsics.checkParameterIsNotNull(methodHookParam, "p");
        Log.debug("logout");
        ConfigUtil.INSTANCE.destroyTask();
        ThreadPool threadPool = ThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(threadPool, "ThreadPool.getDefault()");
        threadPool.getExecutor().execute(DyGlobal$listenLogout$1$afterHookedMethod$1.INSTANCE);
    }
}
