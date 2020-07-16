package com.jiongbull.jlog.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.jiongbull.jlog.IStorage;
import com.jiongbull.jlog.Logger;
import com.jiongbull.jlog.LoggerGlobal;
import java.util.Map;

public class LogService extends IntentService {
    public LogService() {
        super("LogService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        for (Map.Entry<String, Logger> value : LoggerGlobal.getLoggers().entrySet()) {
            Logger logger = (Logger) value.getValue();
            IStorage storage = logger.getStorage();
            if (storage != null) {
                storage.upload(logger);
            }
        }
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
