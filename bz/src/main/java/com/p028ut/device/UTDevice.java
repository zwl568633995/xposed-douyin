package com.p028ut.device;

import android.content.Context;
import com.p022ta.utdid2.p023a.AidManager;

/* renamed from: com.ut.device.UTDevice */
public class UTDevice {
    public static String getUtdid(Context context) {
        return com.p022ta.utdid2.device.UTDevice.getUtdid(context);
    }

    public static String getAid(String str, String str2, Context context) {
        return AidManager.m640a(context).mo12919a(str, str2, getUtdid(context));
    }

    public static void getAidAsync(String str, String str2, Context context, AidCallback aVar) {
        AidManager.m640a(context).mo12920a(str, str2, getUtdid(context), aVar);
    }
}
