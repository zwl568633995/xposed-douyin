package com.p028ut.mini.core.appstatus;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.ut.mini.core.appstatus.UTMCAppStatusCallbacks */
public interface UTMCAppStatusCallbacks {
    void onActivityCreated(Activity activity, Bundle bundle);

    void onActivityDestroyed(Activity activity);

    void onActivityPaused(Activity activity);

    void onActivityResumed(Activity activity);

    void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    void onActivityStarted(Activity activity);

    void onActivityStopped(Activity activity);

    void onSwitchBackground();

    void onSwitchForeground();
}
