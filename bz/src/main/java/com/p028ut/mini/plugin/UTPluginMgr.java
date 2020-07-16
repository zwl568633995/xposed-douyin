package com.p028ut.mini.plugin;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.mtl.log.UTMCStatConfig;
import com.alibaba.mtl.log.p016d.Logger;
import com.p028ut.mini.core.appstatus.UTMCAppStatusCallbacks;
import com.p028ut.mini.core.appstatus.UTMCAppStatusRegHelper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ut.mini.plugin.UTPluginMgr */
public class UTPluginMgr implements UTMCAppStatusCallbacks {
    public static final String PARTNERPLUGIN_UTPREF = "com.ut.mini.perf.UTPerfPlugin";

    /* renamed from: a */
    private static UTPluginMgr f950a = new UTPluginMgr();

    /* renamed from: b */
    private HandlerThread f951b = null;
    private Handler mHandler = null;

    /* renamed from: n */
    private List<UTPlugin> f952n = new LinkedList();

    /* renamed from: o */
    private List<String> f953o = new ArrayList();

    /* renamed from: p */
    private List<String> f954p = new ArrayList<String>() {
        {
            add(UTPluginMgr.PARTNERPLUGIN_UTPREF);
        }
    };

    /* renamed from: q */
    private List<UTPlugin> f955q = new LinkedList();

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

    private UTPluginMgr() {
        if (Build.VERSION.SDK_INT >= 14) {
            UTMCAppStatusRegHelper.registerAppStatusCallbacks(this);
        }
    }

    public static UTPluginMgr getInstance() {
        return f950a;
    }

    /* renamed from: K */
    private void m804K() {
        HandlerThread handlerThread = new HandlerThread("UT-PLUGIN-ASYNC");
        this.f951b = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.f951b.getLooper()) {
            public void handleMessage(Message message) {
                if (message.what == 1 && (message.obj instanceof C1067a)) {
                    C1067a aVar = (C1067a) message.obj;
                    UTPlugin a = aVar.mo13149a();
                    int i = aVar.mo13154i();
                    Object msgObj = aVar.getMsgObj();
                    if (a != null) {
                        try {
                            if (msgObj instanceof UTPluginMsgDispatchDelegate) {
                                UTPluginMsgDispatchDelegate uTPluginMsgDispatchDelegate = (UTPluginMsgDispatchDelegate) msgObj;
                                if (uTPluginMsgDispatchDelegate.isMatchPlugin(a)) {
                                    a.onPluginMsgArrivedFromSDK(i, uTPluginMsgDispatchDelegate.getDispatchObject(a));
                                    return;
                                }
                                return;
                            }
                            a.onPluginMsgArrivedFromSDK(i, msgObj);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            }
        };
    }

    public boolean isPartnerPluginExist(String str) {
        return this.f953o.contains(str);
    }

    /* renamed from: a */
    private synchronized void m806a(int i, UTPluginContextValueDispatchDelegate uTPluginContextValueDispatchDelegate) {
        if (uTPluginContextValueDispatchDelegate != null) {
            for (UTPlugin next : this.f955q) {
                uTPluginContextValueDispatchDelegate.onPluginContextValueChange(next.getPluginContext());
                next.onPluginContextValueUpdate(i);
            }
        }
    }

    public void updatePluginContextValue(int i) {
        if (i == 1) {
            m806a(i, (UTPluginContextValueDispatchDelegate) new UTPluginContextValueDispatchDelegate() {
                public void onPluginContextValueChange(UTPluginContext uTPluginContext) {
                    uTPluginContext.setDebugLogFlag(Logger.m294l());
                }
            });
        }
    }

    public void runPartnerPlugin() {
        List<String> list = this.f954p;
        if (list != null && list.size() > 0) {
            for (String next : this.f954p) {
                if (!TextUtils.isEmpty(next)) {
                    try {
                        Object newInstance = Class.forName(next).newInstance();
                        if (newInstance instanceof UTPlugin) {
                            registerPlugin((UTPlugin) newInstance, true);
                            Logger.m291a("runPartnerPlugin[OK]:" + next, new String[0]);
                            this.f953o.add(next);
                        }
                    } catch (ClassNotFoundException unused) {
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private UTPluginContext m805a() {
        UTPluginContext uTPluginContext = new UTPluginContext();
        uTPluginContext.setContext(UTMCStatConfig.mo9570a().getContext());
        if (Logger.m294l()) {
            uTPluginContext.setDebugLogFlag(Logger.m294l());
        }
        return uTPluginContext;
    }

    public synchronized void registerPlugin(UTPlugin uTPlugin, boolean z) {
        if (uTPlugin != null) {
            if (!this.f955q.contains(uTPlugin)) {
                uTPlugin.mo13126a(m805a());
                this.f955q.add(uTPlugin);
                if (!z) {
                    this.f952n.add(uTPlugin);
                }
                uTPlugin.onRegistered();
            }
        }
    }

    public synchronized void unregisterPlugin(UTPlugin uTPlugin) {
        if (uTPlugin != null) {
            if (this.f955q.contains(uTPlugin)) {
                this.f955q.remove(uTPlugin);
                uTPlugin.onUnRegistered();
                uTPlugin.mo13126a((UTPluginContext) null);
            }
        }
        if (this.f952n != null && this.f952n.contains(uTPlugin)) {
            this.f952n.remove(uTPlugin);
        }
    }

    /* renamed from: a */
    private boolean m807a(int i, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : iArr) {
            if (i2 == i) {
                z = true;
            }
        }
        return z;
    }

    public synchronized boolean dispatchPluginMsg(int i, Object obj) {
        boolean z;
        if (this.mHandler == null) {
            m804K();
        }
        z = false;
        if (this.f955q.size() > 0) {
            for (UTPlugin next : this.f955q) {
                int[] returnRequiredMsgIds = next.returnRequiredMsgIds();
                if (returnRequiredMsgIds != null && m807a(i, returnRequiredMsgIds)) {
                    if (i != 1) {
                        if (this.f952n == null || !this.f952n.contains(next)) {
                            C1067a aVar = new C1067a();
                            aVar.mo13152g(i);
                            aVar.mo13151c(obj);
                            aVar.mo13150a(next);
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            obtain.obj = aVar;
                            this.mHandler.sendMessage(obtain);
                            z = true;
                        }
                    }
                    try {
                        if (obj instanceof UTPluginMsgDispatchDelegate) {
                            UTPluginMsgDispatchDelegate uTPluginMsgDispatchDelegate = (UTPluginMsgDispatchDelegate) obj;
                            if (uTPluginMsgDispatchDelegate.isMatchPlugin(next)) {
                                next.onPluginMsgArrivedFromSDK(i, uTPluginMsgDispatchDelegate.getDispatchObject(next));
                            }
                        } else {
                            next.onPluginMsgArrivedFromSDK(i, obj);
                        }
                        z = true;
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: com.ut.mini.plugin.UTPluginMgr$a */
    private static class C1067a {

        /* renamed from: L */
        private int f959L;

        /* renamed from: a */
        private UTPlugin f960a;

        /* renamed from: g */
        private Object f961g;

        private C1067a() {
            this.f959L = 0;
            this.f961g = null;
            this.f960a = null;
        }

        /* renamed from: i */
        public int mo13154i() {
            return this.f959L;
        }

        /* renamed from: g */
        public void mo13152g(int i) {
            this.f959L = i;
        }

        public Object getMsgObj() {
            return this.f961g;
        }

        /* renamed from: c */
        public void mo13151c(Object obj) {
            this.f961g = obj;
        }

        /* renamed from: a */
        public UTPlugin mo13149a() {
            return this.f960a;
        }

        /* renamed from: a */
        public void mo13150a(UTPlugin uTPlugin) {
            this.f960a = uTPlugin;
        }
    }

    public void onSwitchBackground() {
        dispatchPluginMsg(2, (Object) null);
    }

    public void onSwitchForeground() {
        dispatchPluginMsg(8, (Object) null);
    }
}
