package com.p028ut.mini.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.log.UTDC;
import com.alibaba.mtl.log.UTMCStatConfig;
import com.alibaba.mtl.log.UTMCVariables;
import com.alibaba.mtl.log.p013a.Config;
import com.alibaba.mtl.log.p015c.LogStoreMgr;
import com.alibaba.mtl.log.p016d.SpSetting;
import com.p028ut.device.UTDevice;
import com.p028ut.mini.base.UTMIVariables;
import java.util.Map;

/* renamed from: com.ut.mini.internal.UTTeamWork */
public class UTTeamWork {

    /* renamed from: a */
    private static UTTeamWork f946a;

    public void disableNetworkStatusChecker() {
    }

    public void dispatchLocalHits() {
    }

    public void initialized() {
    }

    public static synchronized UTTeamWork getInstance() {
        UTTeamWork uTTeamWork;
        synchronized (UTTeamWork.class) {
            if (f946a == null) {
                f946a = new UTTeamWork();
            }
            uTTeamWork = f946a;
        }
        return uTTeamWork;
    }

    public void turnOnRealTimeDebug(Map<String, String> map) {
        AppMonitor.turnOnRealTimeDebug(map);
    }

    public void turnOffRealTimeDebug() {
        AppMonitor.turnOffRealTimeDebug();
    }

    public void saveCacheDataToLocal() {
        LogStoreMgr.m247a().mo9594E();
    }

    public void setToAliyunOsPlatform() {
        UTMIVariables.getInstance().setToAliyunOSPlatform();
    }

    public String getUtsid() {
        try {
            String appkey = UTDC.m166a() != null ? UTDC.m166a().getAppkey() : null;
            String utdid = UTDevice.getUtdid(UTMCStatConfig.mo9570a().getContext());
            long longValue = Long.valueOf(UTDC.f324B).longValue();
            if (!TextUtils.isEmpty(appkey) && !TextUtils.isEmpty(utdid)) {
                return utdid + "_" + appkey + "_" + longValue;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeAuto1010Track() {
        UTMCVariables.mo9578a().mo9582o();
    }

    public void enableUpload(boolean z) {
        UTDC.f334s = z;
    }

    public void setHost4Https(Context context, String str) {
        if (context == null) {
            Log.w("UTTeamWork", "context is null");
        } else if (TextUtils.isEmpty(str)) {
            Log.w("UTTeamWork", "host or port is empty");
        } else {
            Config.m185f(str);
            SpSetting.m313a(context, "utanalytics_https_host", str);
        }
    }

    public void clearHost4Https(Context context) {
        if (context == null) {
            Log.w("UTTeamWork", "context is null");
            return;
        }
        Config.m185f("");
        SpSetting.m313a(context, "utanalytics_https_host", (String) null);
    }
}
