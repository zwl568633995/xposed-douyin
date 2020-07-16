package com.p028ut.mini.core.appstatus;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.alibaba.mtl.log.UTMCVariables;
import java.util.HashMap;

/* renamed from: com.ut.mini.core.appstatus.UTMCAppBackgroundTimeoutDetector */
public class UTMCAppBackgroundTimeoutDetector implements UTMCAppStatusCallbacks {

    /* renamed from: a */
    private static UTMCAppBackgroundTimeoutDetector f920a;

    /* renamed from: B */
    private long f921B = 0;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    private UTMCAppBackgroundTimeoutDetector() {
    }

    public static synchronized UTMCAppBackgroundTimeoutDetector getInstance() {
        UTMCAppBackgroundTimeoutDetector uTMCAppBackgroundTimeoutDetector;
        synchronized (UTMCAppBackgroundTimeoutDetector.class) {
            if (f920a == null) {
                f920a = new UTMCAppBackgroundTimeoutDetector();
            }
            uTMCAppBackgroundTimeoutDetector = f920a;
        }
        return uTMCAppBackgroundTimeoutDetector;
    }

    public void onSwitchBackground() {
        this.f921B = SystemClock.elapsedRealtime();
    }

    public void onSwitchForeground() {
        if (0 != this.f921B && SystemClock.elapsedRealtime() - this.f921B > 30000) {
            UTMCVariables.mo9578a().mo9579c(new HashMap());
        }
        this.f921B = 0;
    }
}
