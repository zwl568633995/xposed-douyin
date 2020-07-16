package com.xp.wx.middleware;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.xp.wx.util.AdbShellUtil;
import java.io.File;

public class ActionReceiver extends BroadcastReceiver {
    public static final String ACTION_BIND_STATE_CHANGED = "action.bind_state_changed";
    public static final String ACTION_DELETE_TINKER = "action.delete.tinker";
    public static final String ACTION_HEART = "action.heart";
    public static final String EXTRA_SCOKET_URL = "extra_scoket_url";
    public static final String EXTRA_SOCKET_STATE = "extra_socket_state";
    public static final String EXTRA_TIME_STAMP = "extra_time_stamp";
    public static final String EXTRA_WX_PID = "extra_wx_pid";

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (ACTION_HEART.equals(action)) {
            String stringExtra = intent.getStringExtra(EXTRA_SCOKET_URL);
            int intExtra = intent.getIntExtra(EXTRA_SOCKET_STATE, -100);
            long longExtra = intent.getLongExtra(EXTRA_TIME_STAMP, 0);
            Handler mHandler = BotInfo.Companion.getMHandler();
            if (mHandler != null) {
                if (stringExtra != null) {
                    Message.obtain(mHandler, 1, stringExtra).sendToTarget();
                }
                if (intExtra != -100) {
                    Message.obtain(mHandler, 2, Integer.valueOf(intExtra)).sendToTarget();
                }
                if (longExtra != 0) {
                    Message.obtain(mHandler, 3, Long.valueOf(longExtra)).sendToTarget();
                }
            }
        } else if (ACTION_DELETE_TINKER.equals(action)) {
            File file = new File("/data/data/com.tencent.mm/tinker");
            if (file.exists()) {
                AdbShellUtil.ExeCmds("rm -r " + file.getAbsolutePath());
                int intExtra2 = intent.getIntExtra(EXTRA_WX_PID, 0);
                if (intExtra2 != 0) {
                    Process.killProcess(intExtra2);
                }
            }
        }
    }
}
