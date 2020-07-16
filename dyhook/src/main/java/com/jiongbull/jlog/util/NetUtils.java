package com.jiongbull.jlog.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetUtils {
    public static boolean isNetConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isWifiConnected(Context context) {
        return isNetConnected(context, 1);
    }

    public static boolean isEthernetConnected(Context context) {
        return isNetConnected(context, 9);
    }

    public static boolean isMobileConnected(Context context) {
        return isNetConnected(context, 0);
    }

    private static boolean isNetConnected(Context context, int i) {
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(i);
        return networkInfo != null && networkInfo.isConnected();
    }
}
