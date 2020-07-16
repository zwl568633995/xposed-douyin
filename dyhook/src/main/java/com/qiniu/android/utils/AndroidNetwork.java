package com.qiniu.android.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class AndroidNetwork {
    public static boolean isNetWorkReady() {
        Context applicationContext = ContextGetter.applicationContext();
        if (applicationContext == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
