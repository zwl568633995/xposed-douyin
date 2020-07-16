package com.jiongbull.jlog.receiver;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.jiongbull.jlog.service.LogService;

public class LogReceiver extends WakefulBroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        startWakefulService(context, new Intent(context, LogService.class));
    }
}
