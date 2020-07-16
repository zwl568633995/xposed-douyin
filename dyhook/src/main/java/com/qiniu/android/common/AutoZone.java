package com.qiniu.android.common;

import com.qiniu.android.common.Zone;
import com.qiniu.android.dns.DnsManager;
import com.qiniu.android.http.Client;
import com.qiniu.android.http.CompletionHandler;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.utils.StringMap;
import com.qiniu.android.utils.UrlSafeBase64;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AutoZone extends Zone {
    private static Client client = new Client();
    /* access modifiers changed from: private */
    public static Map<ZoneIndex, ZoneInfo> zones = new ConcurrentHashMap();
    private final DnsManager dns;
    private final boolean https;
    private final String ucServer;

    public AutoZone(boolean z, DnsManager dnsManager) {
        this("https://uc.qbox.me", z, dnsManager);
    }

    AutoZone(String str, boolean z, DnsManager dnsManager) {
        this.ucServer = str;
        this.https = z;
        this.dns = dnsManager;
    }

    private void getZoneJsonAsync(ZoneIndex zoneIndex, CompletionHandler completionHandler) {
        client.asyncGet(this.ucServer + "/v1/query?ak=" + zoneIndex.accessKey + "&bucket=" + zoneIndex.bucket, (StringMap) null, completionHandler);
    }

    /* access modifiers changed from: private */
    public void putHosts(ZoneInfo zoneInfo) {
        if (this.dns != null) {
            try {
                String host = new URI(zoneInfo.upHost).getHost();
                String host2 = new URI(zoneInfo.upHttps).getHost();
                String host3 = new URI(zoneInfo.upBackup).getHost();
                this.dns.putHosts(host, zoneInfo.upIp);
                this.dns.putHosts(host2, zoneInfo.upIp);
                this.dns.putHosts(host3, zoneInfo.upIp);
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ZoneInfo zoneInfo(String str, String str2) {
        return zones.get(new ZoneIndex(str, str2));
    }

    /* access modifiers changed from: package-private */
    public ZoneInfo queryByToken(String str) {
        try {
            String[] split = str.split(":");
            return zoneInfo(split[0], new JSONObject(new String(UrlSafeBase64.decode(split[2]), Constants.UTF_8)).getString("scope").split(":")[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ServiceAddress upHost(String str) {
        ZoneInfo queryByToken = queryByToken(str);
        if (queryByToken == null) {
            return null;
        }
        if (this.https) {
            return new ServiceAddress(queryByToken.upHttps);
        }
        return new ServiceAddress(queryByToken.upHost, new String[]{queryByToken.upIp});
    }

    public ServiceAddress upHostBackup(String str) {
        ZoneInfo queryByToken = queryByToken(str);
        if (queryByToken == null || this.https) {
            return null;
        }
        return new ServiceAddress(queryByToken.upBackup, new String[]{queryByToken.upIp});
    }

    /* access modifiers changed from: package-private */
    public void preQueryIndex(final ZoneIndex zoneIndex, final Zone.QueryHandler queryHandler) {
        if (zoneIndex == null) {
            queryHandler.onFailure(-5);
        } else if (zones.get(zoneIndex) != null) {
            queryHandler.onSuccess();
        } else {
            getZoneJsonAsync(zoneIndex, new CompletionHandler() {
                public void complete(ResponseInfo responseInfo, JSONObject jSONObject) {
                    if (responseInfo.isOK() && jSONObject != null) {
                        try {
                            ZoneInfo buildFromJson = ZoneInfo.buildFromJson(jSONObject);
                            AutoZone.zones.put(zoneIndex, buildFromJson);
                            AutoZone.this.putHosts(buildFromJson);
                            queryHandler.onSuccess();
                        } catch (JSONException e) {
                            e.printStackTrace();
                            queryHandler.onFailure(-1);
                        }
                    }
                }
            });
        }
    }

    public void preQuery(String str, Zone.QueryHandler queryHandler) {
        preQueryIndex(ZoneIndex.getFromToken(str), queryHandler);
    }

    static class ZoneInfo {
        final String upBackup;
        final String upHost;
        final String upHttps;
        final String upIp;

        private ZoneInfo(String str, String str2, String str3, String str4) {
            this.upHost = str;
            this.upIp = str2;
            this.upBackup = str3;
            this.upHttps = str4;
        }

        static ZoneInfo buildFromJson(JSONObject jSONObject) throws JSONException {
            JSONArray jSONArray = jSONObject.getJSONObject("http").getJSONArray("up");
            return new ZoneInfo(jSONArray.getString(1), jSONArray.getString(2).split(" ")[2].split("//")[1], jSONArray.getString(0), jSONObject.getJSONObject("https").getJSONArray("up").getString(0));
        }
    }

    static class ZoneIndex {
        /* access modifiers changed from: private */
        public final String accessKey;
        /* access modifiers changed from: private */
        public final String bucket;

        ZoneIndex(String str, String str2) {
            this.accessKey = str;
            this.bucket = str2;
        }

        public static ZoneIndex getFromToken(String str) {
            String[] split = str.split(":");
            try {
                return new ZoneIndex(split[0], new JSONObject(new String(UrlSafeBase64.decode(split[2]), Constants.UTF_8)).getString("scope").split(":")[0]);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public int hashCode() {
            return (this.accessKey.hashCode() * 37) + this.bucket.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                if (obj != null && (obj instanceof ZoneIndex)) {
                    ZoneIndex zoneIndex = (ZoneIndex) obj;
                    if (!zoneIndex.accessKey.equals(this.accessKey) || !zoneIndex.bucket.equals(this.bucket)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
    }
}
