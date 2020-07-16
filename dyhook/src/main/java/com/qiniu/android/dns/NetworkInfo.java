package com.qiniu.android.dns;

public final class NetworkInfo {
    public static final int ISP_CMCC = 3;
    public static final int ISP_CNC = 2;
    public static final int ISP_CTC = 1;
    public static final int ISP_DIANXIN = 1;
    public static final int ISP_GENERAL = 0;
    public static final int ISP_LIANTONG = 2;
    public static final int ISP_OTHER = 999;
    public static final int ISP_YIDONG = 3;
    public static final NetworkInfo noNetwork = new NetworkInfo(NetSatus.NO_NETWORK, 0);
    public static final NetworkInfo normal = new NetworkInfo(NetSatus.WIFI, 0);
    public final NetSatus netStatus;
    public final int provider;

    public enum NetSatus {
        NO_NETWORK,
        WIFI,
        MOBILE
    }

    public NetworkInfo(NetSatus netSatus, int i) {
        this.netStatus = netSatus;
        this.provider = i;
    }
}
