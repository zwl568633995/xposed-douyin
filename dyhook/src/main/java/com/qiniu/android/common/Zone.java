package com.qiniu.android.common;

import com.qiniu.android.dns.DnsManager;

public abstract class Zone {
    public static final Zone zone0 = createZone("upload.qiniu.com", "up.qiniu.com", "183.136.139.10", "115.231.182.136");
    public static final Zone zone1 = createZone("upload-z1.qiniu.com", "up-z1.qiniu.com", "106.38.227.27", "106.38.227.28");
    public static final Zone zone2 = createZone("upload-z2.qiniu.com", "up-z2.qiniu.com", "183.60.214.197", "14.152.37.7");

    public interface QueryHandler {
        void onFailure(int i);

        void onSuccess();
    }

    public abstract void preQuery(String str, QueryHandler queryHandler);

    public abstract ServiceAddress upHost(String str);

    public abstract ServiceAddress upHostBackup(String str);

    private static Zone createZone(String str, String str2, String str3, String str4) {
        String[] strArr = {str3, str4};
        ServiceAddress serviceAddress = new ServiceAddress("http://" + str, strArr);
        return new FixedZone(serviceAddress, new ServiceAddress("http://" + str2, strArr));
    }

    public static void addDnsIp(DnsManager dnsManager) {
        zone0.upHost("").addIpToDns(dnsManager);
        zone0.upHostBackup("").addIpToDns(dnsManager);
        zone1.upHost("").addIpToDns(dnsManager);
        zone1.upHostBackup("").addIpToDns(dnsManager);
        zone2.upHost("").addIpToDns(dnsManager);
        zone2.upHostBackup("").addIpToDns(dnsManager);
    }
}
