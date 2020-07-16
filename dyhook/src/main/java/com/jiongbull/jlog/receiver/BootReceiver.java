package com.jiongbull.jlog.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jiongbull.jlog.LoggerGlobal;

public class BootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            LoggerGlobal.startAlarm(context);
        }
    }
}
