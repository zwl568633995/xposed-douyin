package com.xp.wx.backend.douyin.handler;

import android.os.Handler;
import android.os.Message;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xp/wx/backend/douyin/handler/AutoSendMsgHandler$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: AutoSendMsgHandler.kt */
public final class AutoSendMsgHandler$handler$1 extends Handler {
    AutoSendMsgHandler$handler$1() {
    }

    public void handleMessage(Message message) {
        if (message != null && message.what == 200) {
            AutoSendMsgHandler.INSTANCE.sendNext();
        }
    }
}
