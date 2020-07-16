package com.wujieshuju.huidou.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

public class HandlerUtil {
    private static Handler sMainHandler;
    private static Handler sSecondHandler;

    public static Handler getSecondHandler() {
        if (sSecondHandler == null) {
            sSecondHandler = createNewHandler("SecondThread");
        }
        return sSecondHandler;
    }

    public static Handler getMainHandler() {
        if (sMainHandler == null) {
            sMainHandler = new Handler(Looper.getMainLooper());
        }
        return sMainHandler;
    }

    public static Handler createNewHandler(String str) {
        HandlerThread handlerThread = new HandlerThread(str, 0);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
