package com.xp.wx.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

public class HttpUtil {

    interface OnRefreshBindInfoCallback {
        void onComplete();
    }

    public static int getAPNType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 1;
        }
        if (type != 0) {
            return 0;
        }
        return (activeNetworkInfo.getSubtype() != 3 || ((TelephonyManager) context.getSystemService("phone")).isNetworkRoaming()) ? 3 : 2;
    }
}
