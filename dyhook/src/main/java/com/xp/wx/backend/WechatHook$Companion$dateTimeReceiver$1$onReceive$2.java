package com.xp.wx.backend;

import com.xp.wx.backend.threadpool.CatchRunnable;
import com.xp.wx.util.Log;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xp/wx/backend/WechatHook$Companion$dateTimeReceiver$1$onReceive$2", "Lcom/xp/wx/backend/threadpool/CatchRunnable;", "runInTry", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: WechatHook.kt */
public final class WechatHook$Companion$dateTimeReceiver$1$onReceive$2 extends CatchRunnable {
    WechatHook$Companion$dateTimeReceiver$1$onReceive$2() {
    }

    public void runInTry() {
        Log.clearLog(3);
    }
}
