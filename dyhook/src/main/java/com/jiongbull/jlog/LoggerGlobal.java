package com.jiongbull.jlog;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import com.jiongbull.jlog.receiver.LogReceiver;
import java.util.HashMap;
import java.util.Map;

public class LoggerGlobal {
    private static final Map<String, Logger> mLoggers = new HashMap();
    private static boolean sAlarmStarted;

    public static void startAlarm(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, LogReceiver.class), 0);
        alarmManager.cancel(broadcast);
        alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime(), 900000, broadcast);
        sAlarmStarted = true;
    }

    public static Map<String, Logger> getLoggers() {
        return mLoggers;
    }

    static void addLogger(Logger logger) {
        mLoggers.put(logger.getName(), logger);
        if (!sAlarmStarted) {
            startAlarm(logger.getContext());
        }
    }
}
