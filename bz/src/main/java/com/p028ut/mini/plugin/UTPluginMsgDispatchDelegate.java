package com.p028ut.mini.plugin;

/* renamed from: com.ut.mini.plugin.UTPluginMsgDispatchDelegate */
public abstract class UTPluginMsgDispatchDelegate {

    /* renamed from: g */
    private Object f962g = null;

    public boolean isMatchPlugin(UTPlugin uTPlugin) {
        return true;
    }

    public final Object getMsgObj() {
        return this.f962g;
    }

    public UTPluginMsgDispatchDelegate(Object obj) {
        this.f962g = obj;
    }

    public Object getDispatchObject(UTPlugin uTPlugin) {
        return this.f962g;
    }
}
