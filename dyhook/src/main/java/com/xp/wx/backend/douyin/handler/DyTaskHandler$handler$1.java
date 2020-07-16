package com.xp.wx.backend.douyin.handler;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/xp/wx/backend/douyin/handler/DyTaskHandler$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyTaskHandler.kt */
public final class DyTaskHandler$handler$1 extends Handler {
    DyTaskHandler$handler$1() {
    }

    public void handleMessage(Message message) {
        Intrinsics.checkParameterIsNotNull(message, NotificationCompat.CATEGORY_MESSAGE);
        switch (message.what) {
            case 100:
                DyTaskHandler.INSTANCE.like();
                return;
            case 101:
                DyTaskHandler.INSTANCE.sendGift();
                return;
            case 102:
                DyTaskHandler.INSTANCE.shopping();
                return;
            case 103:
                DyTaskHandler.INSTANCE.sendBulletin();
                return;
            case 104:
                DyTaskHandler.INSTANCE.sendWelcomeMsg();
                return;
            case 105:
                DyTaskHandler.INSTANCE.sendSubscribeMsg();
                return;
            default:
                return;
        }
    }
}
