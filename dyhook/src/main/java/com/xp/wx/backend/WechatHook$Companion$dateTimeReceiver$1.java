package com.xp.wx.backend;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xp.wx.backend.threadpool.ThreadPool;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/xp/wx/backend/WechatHook$Companion$dateTimeReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: WechatHook.kt */
public final class WechatHook$Companion$dateTimeReceiver$1 extends BroadcastReceiver {
    WechatHook$Companion$dateTimeReceiver$1() {
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && Intrinsics.areEqual((Object) intent.getAction(), (Object) "android.intent.action.TIME_TICK")) {
            Calendar instance = Calendar.getInstance();
            instance.get(11);
            int i = instance.get(12);
            if (i == 0) {
                ThreadPool threadPool = ThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(threadPool, "ThreadPool.getDefault()");
                threadPool.getExecutor().execute(new WechatHook$Companion$dateTimeReceiver$1$onReceive$1(instance));
            } else if (i == 5) {
                ThreadPool threadPool2 = ThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(threadPool2, "ThreadPool.getDefault()");
                threadPool2.getExecutor().execute(new WechatHook$Companion$dateTimeReceiver$1$onReceive$2());
            } else if (i == 10) {
                ThreadPool threadPool3 = ThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(threadPool3, "ThreadPool.getDefault()");
                threadPool3.getExecutor().execute(new WechatHook$Companion$dateTimeReceiver$1$onReceive$3());
            }
        }
    }
}
