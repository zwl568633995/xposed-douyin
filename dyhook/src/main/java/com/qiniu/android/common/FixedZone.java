package com.qiniu.android.common;

import com.qiniu.android.common.Zone;

public final class FixedZone extends Zone {
    private final ServiceAddress up;
    private final ServiceAddress upBackup;

    public FixedZone(ServiceAddress serviceAddress, ServiceAddress serviceAddress2) {
        this.up = serviceAddress;
        this.upBackup = serviceAddress2;
    }

    public ServiceAddress upHost(String str) {
        return this.up;
    }

    public ServiceAddress upHostBackup(String str) {
        return this.upBackup;
    }

    public void preQuery(String str, Zone.QueryHandler queryHandler) {
        queryHandler.onSuccess();
    }
}
