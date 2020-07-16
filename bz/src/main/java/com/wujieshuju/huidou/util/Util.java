package com.wujieshuju.huidou.util;

import android.app.Activity;
import android.os.Build;
import android.view.Window;

public class Util {
    public static void setStatusBarColor(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(activity.getResources().getColor(i));
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
    }
}
