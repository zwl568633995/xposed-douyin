package com.p028ut.mini;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.PointerIconCompat;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.log.UTMCStatConfig;
import com.alibaba.mtl.log.UTMCVariables;
import com.alibaba.mtl.log.p016d.Logger;
import com.p028ut.mini.base.UTMIVariables;
import com.p028ut.mini.core.appstatus.UTMCAppStatusRegHelper;
import com.p028ut.mini.core.sign.IUTRequestAuthentication;
import com.p028ut.mini.core.sign.UTBaseRequestAuthentication;
import com.p028ut.mini.core.sign.UTSecuritySDKRequestAuthentication;
import com.p028ut.mini.internal.UTOriginalCustomHitBuilder;
import com.p028ut.mini.internal.UTTeamWork;
import com.p028ut.mini.plugin.UTPluginMgr;
import com.p028ut.mini.sdkevents.UTMI1010_2001Event;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ut.mini.UTAnalytics */
public class UTAnalytics {

    /* renamed from: a */
    private static UTAnalytics f881a;

    /* renamed from: M */
    private boolean f882M;

    /* renamed from: N */
    private boolean f883N;

    /* renamed from: a */
    private UTTracker f884a;

    /* renamed from: w */
    private Map<String, UTTracker> f885w = new HashMap();

    /* renamed from: x */
    private Map<String, UTTracker> f886x = new HashMap();

    private UTAnalytics() {
        if (Build.VERSION.SDK_INT < 14) {
            UTMI1010_2001Event uTMI1010_2001Event = new UTMI1010_2001Event();
            UTPluginMgr.getInstance().registerPlugin(uTMI1010_2001Event, false);
            UTMIVariables.getInstance().setUTMI1010_2001EventInstance(uTMI1010_2001Event);
            return;
        }
        UTMI1010_2001Event uTMI1010_2001Event2 = new UTMI1010_2001Event();
        UTMCAppStatusRegHelper.registerAppStatusCallbacks(uTMI1010_2001Event2);
        UTMIVariables.getInstance().setUTMI1010_2001EventInstance(uTMI1010_2001Event2);
    }

    @Deprecated
    public void setContext(Context context) {
        UTMCStatConfig.mo9570a().setContext(context);
        if (context != null) {
            UTTeamWork.getInstance().initialized();
        }
    }

    @Deprecated
    public void setAppApplicationInstance(Application application) {
        UTMCStatConfig.mo9570a().setAppApplicationInstance(application);
        AppMonitor.init(application);
    }

    public void setAppApplicationInstance(Application application, IUTApplication iUTApplication) {
        try {
            if (!this.f882M) {
                if (application == null || iUTApplication == null || application.getApplicationContext() == null) {
                    throw new IllegalArgumentException("application and callback must not be null");
                }
                getInstance().setContext(application.getApplicationContext());
                getInstance().setAppApplicationInstance(application);
                if (iUTApplication.isUTLogEnable()) {
                    getInstance().turnOnDebug();
                }
                getInstance().setChannel(iUTApplication.getUTChannel());
                getInstance().setAppVersion(iUTApplication.getUTAppVersion());
                getInstance().setRequestAuthentication(iUTApplication.getUTRequestAuthInstance());
                this.f883N = true;
                this.f882M = true;
            }
        } catch (Throwable unused) {
        }
    }

    public void setAppApplicationInstance4sdk(Application application, IUTApplication iUTApplication) {
        try {
            if (!this.f883N) {
                if (application == null || iUTApplication == null || application.getApplicationContext() == null) {
                    throw new IllegalArgumentException("application and callback must not be null");
                }
                getInstance().setContext(application.getApplicationContext());
                getInstance().setAppApplicationInstance(application);
                if (iUTApplication.isUTLogEnable()) {
                    getInstance().turnOnDebug();
                }
                getInstance().setChannel(iUTApplication.getUTChannel());
                getInstance().setAppVersion(iUTApplication.getUTAppVersion());
                getInstance().setRequestAuthentication(iUTApplication.getUTRequestAuthInstance());
                this.f883N = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized UTAnalytics getInstance() {
        UTAnalytics uTAnalytics;
        synchronized (UTAnalytics.class) {
            if (f881a == null) {
                f881a = new UTAnalytics();
            }
            uTAnalytics = f881a;
        }
        return uTAnalytics;
    }

    public synchronized UTTracker getDefaultTracker() {
        if (this.f884a == null) {
            this.f884a = new UTTracker();
        }
        if (this.f884a == null) {
            Logger.m288a("getDefaultTracker error", (Object) "Fatal Error,must call setRequestAuthentication method first.");
        }
        return this.f884a;
    }

    @Deprecated
    public void setRequestAuthentication(IUTRequestAuthentication iUTRequestAuthentication) {
        if (iUTRequestAuthentication == null) {
            Logger.m288a("setRequestAuthentication", (Object) "Fatal Error,pRequestAuth must not be null.");
        }
        if (iUTRequestAuthentication instanceof UTBaseRequestAuthentication) {
            String appkey = iUTRequestAuthentication.getAppkey();
            UTBaseRequestAuthentication uTBaseRequestAuthentication = (UTBaseRequestAuthentication) iUTRequestAuthentication;
            AppMonitor.setRequestAuthInfo(false, appkey, uTBaseRequestAuthentication.getAppSecret(), uTBaseRequestAuthentication.isEncode() ? "1" : "0");
            return;
        }
        AppMonitor.setRequestAuthInfo(true, iUTRequestAuthentication.getAppkey(), (String) null, ((UTSecuritySDKRequestAuthentication) iUTRequestAuthentication).getAuthCode());
    }

    @Deprecated
    public void setAppVersion(String str) {
        UTMCStatConfig.mo9570a().setAppVersion(str);
    }

    public synchronized UTTracker getTracker(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.m288a("getTracker", (Object) "TrackId is null.");
            return null;
        } else if (this.f885w.containsKey(str)) {
            return this.f885w.get(str);
        } else {
            UTTracker uTTracker = new UTTracker();
            uTTracker.mo13065q(str);
            this.f885w.put(str, uTTracker);
            return uTTracker;
        }
    }

    public synchronized UTTracker getTrackerByAppkey(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.m288a("getTracker", (Object) "TrackId is null.");
            return null;
        } else if (this.f886x.containsKey(str)) {
            return this.f886x.get(str);
        } else {
            UTTracker uTTracker = new UTTracker();
            uTTracker.mo13066r(str);
            this.f886x.put(str, uTTracker);
            return uTTracker;
        }
    }

    @Deprecated
    public void setChannel(String str) {
        AppMonitor.setChannel(str);
    }

    @Deprecated
    public void turnOnDebug() {
        UTMCStatConfig.mo9570a().turnOnDebug();
    }

    public void updateUserAccount(String str, String str2) {
        UTMCStatConfig.mo9570a().updateUserAccount(str, str2);
    }

    public void userRegister(String str) {
        if (!TextUtils.isEmpty(str)) {
            UTTracker defaultTracker = getDefaultTracker();
            if (defaultTracker != null) {
                defaultTracker.send(new UTOriginalCustomHitBuilder("UT", PointerIconCompat.TYPE_CELL, str, (String) null, (String) null, (Map<String, String>) null).build());
            } else {
                Logger.m288a("Record userRegister event error", (Object) "Fatal Error,must call setRequestAuthentication method first.");
            }
        } else {
            Logger.m288a("userRegister", (Object) "Fatal Error,usernick can not be null or empty!");
        }
    }

    public void updateSessionProperties(Map<String, String> map) {
        Map a = UTMCVariables.mo9578a().mo9578a();
        HashMap hashMap = new HashMap();
        if (a != null) {
            hashMap.putAll(a);
        }
        hashMap.putAll(map);
        UTMCVariables.mo9578a().mo9579c(hashMap);
    }

    public void turnOffAutoPageTrack() {
        UTPageHitHelper.getInstance().turnOffAutoPageTrack();
    }
}
