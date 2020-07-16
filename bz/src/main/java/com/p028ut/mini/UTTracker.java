package com.p028ut.mini;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.mtl.log.UTDC;
import com.alibaba.mtl.log.model.LogField;
import com.alibaba.mtl.log.p016d.C0661q;
import com.alibaba.mtl.log.p016d.Logger;
import com.p028ut.mini.base.UTMIVariables;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ut.mini.UTTracker */
public class UTTracker {

    /* renamed from: a */
    private static Pattern f910a = Pattern.compile("(\\|\\||[\t\r\n])+");

    /* renamed from: D */
    private Map<String, String> f911D = new HashMap();

    /* renamed from: aq */
    private String f912aq = null;

    /* renamed from: g */
    private String f913g;

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo13065q(String str) {
        this.f912aq = str;
    }

    public synchronized void setGlobalProperty(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            Logger.m288a("setGlobalProperty", (Object) "key is null or key is empty or value is null,please check it!");
        } else {
            this.f911D.put(str, str2);
        }
    }

    public synchronized String getGlobalProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.f911D.get(str);
    }

    public synchronized void removeGlobalProperty(String str) {
        if (str != null) {
            if (this.f911D.containsKey(str)) {
                this.f911D.remove(str);
            }
        }
    }

    /* renamed from: d */
    private static String m789d(String str) {
        return (str == null || "".equals(str)) ? str : f910a.matcher(str).replaceAll("");
    }

    /* renamed from: b */
    private static String m788b(String str) {
        return m789d(str);
    }

    /* renamed from: g */
    private Map<String, String> m792g(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it = map.keySet().iterator();
        if (it != null) {
            while (it.hasNext()) {
                String next = it.next();
                if (next != null) {
                    hashMap.put(next, m788b(map.get(next)));
                }
            }
        }
        return hashMap;
    }

    public void send(Map<String, String> map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.f911D);
            hashMap.putAll(map);
            if (!TextUtils.isEmpty(this.f913g)) {
                hashMap.put(LogField.APPKEY.toString(), this.f913g);
            }
            Map<String, String> g = m792g((Map<String, String>) hashMap);
            if (!TextUtils.isEmpty(this.f912aq)) {
                g.put(UTFields.TRACK_ID, this.f912aq);
            }
            UTMIVariables.getInstance().isAliyunOSPlatform();
            m791f(g);
            m790d(g);
            m792g(g);
            m794h(g);
            UTDC.m169a(g.remove(LogField.PAGE.toString()), g.remove(LogField.EVENTID.toString()), g.remove(LogField.ARG1.toString()), g.remove(LogField.ARG2.toString()), g.remove(LogField.ARG3.toString()), g);
        }
    }

    /* renamed from: f */
    private static void m791f(Map<String, String> map) {
        if (map != null) {
            if (map.containsKey(LogField.IMEI.toString())) {
                map.remove(LogField.IMEI.toString());
            }
            if (map.containsKey(LogField.IMSI.toString())) {
                map.remove(LogField.IMSI.toString());
            }
            if (map.containsKey(LogField.CARRIER.toString())) {
                map.remove(LogField.CARRIER.toString());
            }
            if (map.containsKey(LogField.ACCESS.toString())) {
                map.remove(LogField.ACCESS.toString());
            }
            if (map.containsKey(LogField.ACCESS_SUBTYPE.toString())) {
                map.remove(LogField.ACCESS_SUBTYPE.toString());
            }
            if (map.containsKey(LogField.CHANNEL.toString())) {
                map.remove(LogField.CHANNEL.toString());
            }
            if (map.containsKey(LogField.LL_USERNICK.toString())) {
                map.remove(LogField.LL_USERNICK.toString());
            }
            if (map.containsKey(LogField.USERNICK.toString())) {
                map.remove(LogField.USERNICK.toString());
            }
            if (map.containsKey(LogField.LL_USERID.toString())) {
                map.remove(LogField.LL_USERID.toString());
            }
            if (map.containsKey(LogField.USERID.toString())) {
                map.remove(LogField.USERID.toString());
            }
            if (map.containsKey(LogField.SDKVERSION.toString())) {
                map.remove(LogField.SDKVERSION.toString());
            }
            if (map.containsKey(LogField.START_SESSION_TIMESTAMP.toString())) {
                map.remove(LogField.START_SESSION_TIMESTAMP.toString());
            }
            if (map.containsKey(LogField.UTDID.toString())) {
                map.remove(LogField.UTDID.toString());
            }
            if (map.containsKey(LogField.SDKTYPE.toString())) {
                map.remove(LogField.SDKTYPE.toString());
            }
            if (map.containsKey(LogField.RESERVE2.toString())) {
                map.remove(LogField.RESERVE2.toString());
            }
            if (map.containsKey(LogField.RESERVE3.toString())) {
                map.remove(LogField.RESERVE3.toString());
            }
            if (map.containsKey(LogField.RESERVE4.toString())) {
                map.remove(LogField.RESERVE4.toString());
            }
            if (map.containsKey(LogField.RESERVE5.toString())) {
                map.remove(LogField.RESERVE5.toString());
            }
            if (map.containsKey(LogField.RESERVES.toString())) {
                map.remove(LogField.RESERVES.toString());
            }
            if (map.containsKey(LogField.RECORD_TIMESTAMP.toString())) {
                map.remove(LogField.RECORD_TIMESTAMP.toString());
            }
        }
    }

    /* renamed from: d */
    private static void m790d(Map<String, String> map) {
        if (map != null) {
            if (map.containsKey(UTFields.f887OS)) {
                map.remove(UTFields.f887OS);
                map.put(LogField.OS.toString(), map.get(UTFields.f887OS));
            }
            if (map.containsKey(UTFields.OS_VERSION)) {
                map.remove(UTFields.OS_VERSION);
                map.put(LogField.OSVERSION.toString(), map.get(UTFields.OS_VERSION));
            }
        }
    }

    /* renamed from: g */
    private static void m793g(Map<String, String> map) {
        map.put(LogField.SDKTYPE.toString(), "mini");
    }

    /* renamed from: h */
    private static void m794h(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map.containsKey(UTFields.TRACK_ID)) {
            String str = map.get(UTFields.TRACK_ID);
            map.remove(UTFields.TRACK_ID);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("_tkid", str);
            }
        }
        if (hashMap.size() > 0) {
            map.put(LogField.RESERVES.toString(), C0661q.m315d(hashMap));
        }
        if (!map.containsKey(LogField.PAGE.toString())) {
            map.put(LogField.PAGE.toString(), "UT");
        }
    }

    public void pageAppear(Object obj) {
        UTPageHitHelper.getInstance().pageAppear(obj);
    }

    public void pageAppearDonotSkip(Object obj) {
        UTPageHitHelper.getInstance().mo13022a(obj, (String) null, true);
    }

    public void pageAppearDonotSkip(Object obj, String str) {
        UTPageHitHelper.getInstance().mo13022a(obj, str, true);
    }

    public void pageAppear(Object obj, String str) {
        UTPageHitHelper.getInstance().pageAppear(obj, str);
    }

    public void pageDisAppear(Object obj) {
        UTPageHitHelper.getInstance().pageDisAppear(obj);
    }

    public void updateNextPageProperties(Map<String, String> map) {
        UTPageHitHelper.getInstance().updateNextPageProperties(map);
    }

    public void updatePageName(Object obj, String str) {
        UTPageHitHelper.getInstance().updatePageName(obj, str);
    }

    public void updatePageProperties(Object obj, Map<String, String> map) {
        UTPageHitHelper.getInstance().updatePageProperties(obj, map);
    }

    public void updatePageStatus(Object obj, UTPageStatus uTPageStatus) {
        UTPageHitHelper.getInstance().updatePageStatus(obj, uTPageStatus);
    }

    public void updatePageUrl(Object obj, Uri uri) {
        UTPageHitHelper.getInstance().updatePageUrl(obj, uri);
    }

    public void skipPage(Object obj) {
        UTPageHitHelper.getInstance().skipPage(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo13066r(String str) {
        this.f913g = str;
    }
}
