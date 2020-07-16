package com.wujieshuju.huidou.util;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.ImageView;

public class UIHelper {
    private static final String TAG = "UIHelper";

    public static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * getDensity(context)) + 0.5f);
    }

    public static float px2dip(Context context, float f) {
        return (f / getDensity(context)) + 0.5f;
    }

    public static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static int getWindowScreenWidth(Context context) {
        return getRealDisplayMetrics(context).widthPixels;
    }

    public static int getWindowScreenHeight(Context context) {
        return getRealDisplayMetrics(context).heightPixels;
    }

    public static DisplayMetrics getRealDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int getRotation(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static int getStatusBarHeight(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            LogUtil.m825w(TAG, (Throwable) e);
            return 0;
        }
    }

    public static void setImageResourceSafely(Application application, ImageView imageView, int i) {
        int i2 = 0;
        while (i2 < 2) {
            try {
                imageView.setImageResource(i);
                return;
            } catch (OutOfMemoryError e) {
                LogUtil.m825w(TAG, (Throwable) e);
                application.onLowMemory();
                System.gc();
                i2++;
            }
        }
    }
}
