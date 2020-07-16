package com.p028ut.mini.core.appstatus;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.alibaba.mtl.log.p016d.TaskExecutor;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.ut.mini.core.appstatus.UTMCAppStatusMonitor */
public class UTMCAppStatusMonitor implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static UTMCAppStatusMonitor f922a;

    /* renamed from: K */
    private int f923K = 0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f924T = false;

    /* renamed from: a */
    private ScheduledFuture<?> f925a = null;

    /* renamed from: e */
    private Object f926e = new Object();

    /* renamed from: f */
    private Object f927f = new Object();

    /* renamed from: m */
    private List<UTMCAppStatusCallbacks> f928m = new LinkedList();

    private UTMCAppStatusMonitor() {
    }

    public static synchronized UTMCAppStatusMonitor getInstance() {
        UTMCAppStatusMonitor uTMCAppStatusMonitor;
        synchronized (UTMCAppStatusMonitor.class) {
            if (f922a == null) {
                f922a = new UTMCAppStatusMonitor();
            }
            uTMCAppStatusMonitor = f922a;
        }
        return uTMCAppStatusMonitor;
    }

    public void registerAppStatusCallbacks(UTMCAppStatusCallbacks uTMCAppStatusCallbacks) {
        if (uTMCAppStatusCallbacks != null) {
            synchronized (this.f927f) {
                this.f928m.add(uTMCAppStatusCallbacks);
            }
        }
    }

    public void unregisterAppStatusCallbacks(UTMCAppStatusCallbacks uTMCAppStatusCallbacks) {
        if (uTMCAppStatusCallbacks != null) {
            synchronized (this.f927f) {
                this.f928m.remove(uTMCAppStatusCallbacks);
            }
        }
    }

    /* renamed from: J */
    private void m797J() {
        synchronized (this.f926e) {
            TaskExecutor.m316a().mo9617f(11);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (this.f927f) {
            for (UTMCAppStatusCallbacks onActivityCreated : this.f928m) {
                onActivityCreated.onActivityCreated(activity, bundle);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        synchronized (this.f927f) {
            for (UTMCAppStatusCallbacks onActivityDestroyed : this.f928m) {
                onActivityDestroyed.onActivityDestroyed(activity);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        synchronized (this.f927f) {
            for (UTMCAppStatusCallbacks onActivityPaused : this.f928m) {
                onActivityPaused.onActivityPaused(activity);
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        synchronized (this.f927f) {
            for (UTMCAppStatusCallbacks onActivityResumed : this.f928m) {
                onActivityResumed.onActivityResumed(activity);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        synchronized (this.f927f) {
            for (UTMCAppStatusCallbacks onActivitySaveInstanceState : this.f928m) {
                onActivitySaveInstanceState.onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        m797J();
        this.f923K++;
        if (!this.f924T) {
            synchronized (this.f927f) {
                for (UTMCAppStatusCallbacks onSwitchForeground : this.f928m) {
                    onSwitchForeground.onSwitchForeground();
                }
            }
        }
        this.f924T = true;
    }

    public void onActivityStopped(Activity activity) {
        int i = this.f923K - 1;
        this.f923K = i;
        if (i == 0) {
            m797J();
            TaskExecutor.m316a().mo9614a(11, new C1061a(), 1000);
        }
    }

    /* renamed from: com.ut.mini.core.appstatus.UTMCAppStatusMonitor$a */
    private class C1061a implements Runnable {
        private C1061a() {
        }

        public void run() {
            boolean unused = UTMCAppStatusMonitor.this.f924T = false;
            synchronized (UTMCAppStatusMonitor.m798a(UTMCAppStatusMonitor.this)) {
                for (UTMCAppStatusCallbacks onSwitchBackground : UTMCAppStatusMonitor.m798a(UTMCAppStatusMonitor.this)) {
                    onSwitchBackground.onSwitchBackground();
                }
            }
        }
    }
}
