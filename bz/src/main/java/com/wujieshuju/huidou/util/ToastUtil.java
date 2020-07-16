package com.wujieshuju.huidou.util;

import android.widget.Toast;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.wujieshuju.huidou.HDApp;

public class ToastUtil {
    private static String lastMsg = "";
    private static long lastMsgTimeStamp;

    public static void makeText(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!lastMsg.equals(str) || currentTimeMillis - lastMsgTimeStamp >= CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
            lastMsg = str;
            lastMsgTimeStamp = currentTimeMillis;
            Toast.makeText(HDApp.getApp().getApplicationContext(), str, 0).show();
        }
    }
}
