package com.xp.wx.backend;

import com.xp.wx.backend.helper.CmdProcessHelper;
import com.xp.wx.backend.threadpool.CatchRunnable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xp/wx/backend/WechatHook$Companion$dateTimeReceiver$1$onReceive$1", "Lcom/xp/wx/backend/threadpool/CatchRunnable;", "runInTry", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: WechatHook.kt */
public final class WechatHook$Companion$dateTimeReceiver$1$onReceive$1 extends CatchRunnable {
    final /* synthetic */ Calendar $calendar;

    WechatHook$Companion$dateTimeReceiver$1$onReceive$1(Calendar calendar) {
        this.$calendar = calendar;
    }

    public void runInTry() {
        CmdProcessHelper cmdProcessHelper = CmdProcessHelper.INSTANCE;
        Calendar calendar = this.$calendar;
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendar");
        cmdProcessHelper.clearUpHistoryCmd(calendar.getTimeInMillis() - ((long) 86400000));
        CmdProcessHelper cmdProcessHelper2 = CmdProcessHelper.INSTANCE;
        Calendar calendar2 = this.$calendar;
        Intrinsics.checkExpressionValueIsNotNull(calendar2, "calendar");
        cmdProcessHelper2.clearUpHistoryMsgCache(calendar2.getTimeInMillis() - ((long) 259200000));
    }
}
