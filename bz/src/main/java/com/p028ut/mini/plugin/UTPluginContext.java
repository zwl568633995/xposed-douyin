package com.p028ut.mini.plugin;

import android.content.Context;

/* renamed from: com.ut.mini.plugin.UTPluginContext */
public class UTPluginContext {
    public static final int DEBUG_LOG_SWITCH = 1;

    /* renamed from: U */
    private boolean f948U = false;

    /* renamed from: V */
    private boolean f949V = false;
    private Context mContext = null;

    public void setContext(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void setDebugLogFlag(boolean z) {
        this.f948U = z;
    }

    public boolean isDebugLogEnable() {
        return this.f948U;
    }

    public void enableRealtimeDebug() {
        this.f949V = true;
    }

    public boolean isRealtimeDebugEnable() {
        return this.f949V;
    }
}
