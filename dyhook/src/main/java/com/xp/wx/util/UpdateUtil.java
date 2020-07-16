package com.xp.wx.util;

import android.content.Context;
import android.content.Intent;
import com.xp.wx.Global;

public class UpdateUtil {
    public static void checkModulesUpdate() {
        Context context = Global.INSTANCE.getContext();
        if (context != null) {
            context.sendBroadcast(new Intent("io.virtualapp.action.CheckModulesUpdate"));
        }
    }
}
