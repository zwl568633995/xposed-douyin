package com.p028ut.mini.base;

import com.p028ut.mini.sdkevents.UTMI1010_2001Event;

/* renamed from: com.ut.mini.base.UTMIVariables */
public class UTMIVariables {

    /* renamed from: a */
    private static UTMIVariables f914a = new UTMIVariables();

    /* renamed from: S */
    private boolean f915S = false;

    /* renamed from: a */
    private UTMI1010_2001Event f916a = null;

    /* renamed from: ao */
    private String f917ao = null;

    /* renamed from: ar */
    private String f918ar = null;

    /* renamed from: as */
    private String f919as = null;

    public synchronized void setToAliyunOSPlatform() {
        this.f915S = true;
    }

    public synchronized boolean isAliyunOSPlatform() {
        return this.f915S;
    }

    public synchronized void setUTMI1010_2001EventInstance(UTMI1010_2001Event uTMI1010_2001Event) {
        this.f916a = uTMI1010_2001Event;
    }

    public synchronized UTMI1010_2001Event getUTMI1010_2001EventInstance() {
        return this.f916a;
    }

    public static UTMIVariables getInstance() {
        return f914a;
    }

    public String getH5Url() {
        return this.f919as;
    }

    public void setH5Url(String str) {
        this.f919as = str;
    }

    public String getRefPage() {
        return this.f917ao;
    }

    public void setRefPage(String str) {
        this.f917ao = str;
    }

    public String getH5RefPage() {
        return this.f918ar;
    }

    public void setH5RefPage(String str) {
        this.f918ar = str;
    }
}
