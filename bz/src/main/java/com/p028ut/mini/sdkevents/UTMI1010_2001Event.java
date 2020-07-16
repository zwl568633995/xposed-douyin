package com.p028ut.mini.sdkevents;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.view.PointerIconCompat;
import com.alibaba.mtl.log.UTMCVariables;
import com.alibaba.mtl.log.p016d.Logger;
import com.p028ut.mini.UTAnalytics;
import com.p028ut.mini.UTInterfaceCallDelegate;
import com.p028ut.mini.UTTracker;
import com.p028ut.mini.core.appstatus.UTMCAppStatusCallbacks;
import com.p028ut.mini.internal.UTOriginalCustomHitBuilder;
import com.p028ut.mini.plugin.UTPlugin;
import java.util.Map;

/* renamed from: com.ut.mini.sdkevents.UTMI1010_2001Event */
public class UTMI1010_2001Event extends UTPlugin implements UTMCAppStatusCallbacks {

    /* renamed from: C */
    private long f963C = 0;

    /* renamed from: D */
    private long f964D = 0;

    /* renamed from: E */
    private long f965E = 0;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public int[] returnRequiredMsgIds() {
        return new int[]{3};
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPluginMsgArrivedFromSDK(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 3
            if (r5 != r0) goto L_0x005b
            java.util.Map r6 = (java.util.Map) r6
            com.alibaba.mtl.log.model.LogField r5 = com.alibaba.mtl.log.model.LogField.EVENTID
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.containsKey(r5)
            if (r5 == 0) goto L_0x005b
            com.alibaba.mtl.log.model.LogField r5 = com.alibaba.mtl.log.model.LogField.EVENTID
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "2001"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x005b
            com.alibaba.mtl.log.model.LogField r5 = com.alibaba.mtl.log.model.LogField.ARG3
            java.lang.String r5 = r5.toString()
            boolean r5 = r6.containsKey(r5)
            r0 = 0
            if (r5 == 0) goto L_0x0048
            com.alibaba.mtl.log.model.LogField r5 = com.alibaba.mtl.log.model.LogField.ARG3
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0044 }
            goto L_0x0049
        L_0x0044:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0048:
            r5 = r0
        L_0x0049:
            long r2 = r4.f963C
            long r2 = r2 + r5
            r4.f963C = r2
            boolean r5 = m814m()
            if (r5 == 0) goto L_0x005b
            long r5 = r4.f963C
            r4.m813a(r5)
            r4.f963C = r0
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.sdkevents.UTMI1010_2001Event.onPluginMsgArrivedFromSDK(int, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r1.get(0).topActivity;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m814m() {
        /*
            r0 = 0
            com.alibaba.mtl.log.b r1 = com.alibaba.mtl.log.UTMCStatConfig.mo9570a()     // Catch:{ Exception -> 0x0042 }
            android.content.Context r1 = r1.getContext()     // Catch:{ Exception -> 0x0042 }
            r2 = 1
            if (r1 == 0) goto L_0x0041
            java.lang.String r3 = r1.getPackageName()     // Catch:{ Exception -> 0x0042 }
            if (r3 == 0) goto L_0x0041
            java.lang.String r4 = "activity"
            java.lang.Object r1 = r1.getSystemService(r4)     // Catch:{ Exception -> 0x0042 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ Exception -> 0x0042 }
            if (r1 == 0) goto L_0x0041
            java.util.List r1 = r1.getRunningTasks(r2)     // Catch:{ Exception -> 0x003d }
            if (r1 == 0) goto L_0x0041
            int r4 = r1.size()     // Catch:{ Exception -> 0x003d }
            if (r4 <= 0) goto L_0x0041
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x003d }
            android.app.ActivityManager$RunningTaskInfo r1 = (android.app.ActivityManager.RunningTaskInfo) r1     // Catch:{ Exception -> 0x003d }
            android.content.ComponentName r1 = r1.topActivity     // Catch:{ Exception -> 0x003d }
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x003d }
            boolean r1 = r3.contains(r1)     // Catch:{ Exception -> 0x003d }
            if (r1 == 0) goto L_0x0041
            return r0
        L_0x003d:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ Exception -> 0x0042 }
        L_0x0041:
            return r2
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.sdkevents.UTMI1010_2001Event.m814m():boolean");
    }

    /* renamed from: a */
    private void m813a(long j) {
        if (!UTMCVariables.mo9578a().mo9580d()) {
            long j2 = 0;
            if (j > 0) {
                if (0 != this.f965E) {
                    j2 = SystemClock.elapsedRealtime() - this.f965E;
                }
                UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("UT", PointerIconCompat.TYPE_ALIAS, "" + j, "" + j2, (String) null, (Map<String, String>) null);
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                if (defaultTracker != null) {
                    defaultTracker.send(uTOriginalCustomHitBuilder.build());
                } else {
                    Logger.m288a("Record app display event error", (Object) "Fatal Error,must call setRequestAuthentication method first.");
                }
            }
        }
    }

    public void onSwitchBackground() {
        m813a(SystemClock.elapsedRealtime() - this.f964D);
        this.f965E = SystemClock.elapsedRealtime();
    }

    public void onSwitchForeground() {
        this.f964D = SystemClock.elapsedRealtime();
    }

    public void onActivityPaused(Activity activity) {
        UTInterfaceCallDelegate.pageDisAppearByAuto(activity);
    }

    public void onActivityResumed(Activity activity) {
        UTInterfaceCallDelegate.pageAppearByAuto(activity);
    }
}
