package com.wujieshuju.huidou.util;

import android.os.Build;
import android.view.View;
import android.view.Window;

public class StatusBarUtil {
    public static void setStatusBar(Window window, int i, boolean z) {
        View decorView = window.getDecorView();
        window.setStatusBarColor(i);
        int systemUiVisibility = decorView.getSystemUiVisibility() | 256;
        if (Build.VERSION.SDK_INT >= 23) {
            systemUiVisibility = z ? systemUiVisibility | 8192 : systemUiVisibility & -8193;
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
    }
}
