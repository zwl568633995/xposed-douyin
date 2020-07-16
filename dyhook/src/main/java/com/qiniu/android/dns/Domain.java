package com.qiniu.android.dns;

public final class Domain {
    public final String domain;
    public final boolean hasCname;
    public final boolean hostsFirst;
    public final int maxTtl;

    public Domain(String str, boolean z, boolean z2) {
        this(str, z, z2, 0);
    }

    public Domain(String str, boolean z, boolean z2, int i) {
        this.domain = str;
        this.hasCname = z;
        this.hostsFirst = z2;
        this.maxTtl = i;
    }

    public Domain(String str, boolean z) {
        this(str, z, false, 0);
    }

    public Domain(String str) {
        this(str, false, false, 0);
    }
}
