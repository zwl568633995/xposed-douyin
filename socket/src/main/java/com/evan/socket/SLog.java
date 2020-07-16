package com.evan.socket;

import android.util.Log;

public class SLog {
    public static String TAG = "SLog";

    public static void i(String msg) {
        Log.i(TAG, msg);
    }

    public static void v(String msg) {
        Log.i(TAG, msg);
    }

    public static void v(String tag, String msg) {
        Log.i(tag, msg);
    }

    public static void i(String msg, Throwable throwable) {
        Log.i(TAG, msg, throwable);
    }

    public static void w(String msg) {
        Log.w(TAG, msg);
    }

    public static void w(String msg, Throwable throwable) {

    }

    public static void e(String msg) {
        Log.e(TAG, msg);
    }

    public static void e(String msg, Throwable throwable) {
        Log.e(TAG, msg, throwable);
    }

    public static void e(String tag, String msg, Throwable throwable) {
        Log.e(tag, msg, throwable);
    }
}
