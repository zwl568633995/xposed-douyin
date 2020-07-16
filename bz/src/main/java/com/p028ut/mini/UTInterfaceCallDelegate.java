package com.p028ut.mini;

import android.app.Activity;

/* renamed from: com.ut.mini.UTInterfaceCallDelegate */
public class UTInterfaceCallDelegate {
    public static void pageDisAppearByAuto(Activity activity) {
        UTPageHitHelper.getInstance().pageDisAppearByAuto(activity);
    }

    public static void pageAppearByAuto(Activity activity) {
        UTPageHitHelper.getInstance().pageAppearByAuto(activity);
    }
}
