package com.p028ut.mini;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.mtl.log.p016d.Logger;
import com.p028ut.mini.base.UTMIVariables;
import com.p028ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ut.mini.UTHybridHelper */
public class UTHybridHelper {

    /* renamed from: a */
    private static UTHybridHelper f889a = new UTHybridHelper();

    public static UTHybridHelper getInstance() {
        return f889a;
    }

    public void setH5Url(String str) {
        if (str != null) {
            UTMIVariables.getInstance().setH5Url(str);
        }
    }

    public void h5UT(Map<String, String> map, Object obj) {
        if (map == null || map.size() == 0) {
            Logger.m288a("h5UT", (Object) "dataMap is empty");
            return;
        }
        String str = map.get("functype");
        if (str == null) {
            Logger.m288a("h5UT", (Object) "funcType is null");
            return;
        }
        String str2 = map.get("utjstype");
        if (str2 == null || str2.equals("0") || str2.equals("1")) {
            map.remove("functype");
            Date date = new Date();
            if (str.equals("2001")) {
                m770a(date, map, obj);
            } else if (str.equals("2101")) {
                m769a(date, map);
            }
        } else {
            Logger.m288a("h5UT", (Object) "utjstype should be 1 or 0 or null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m770a(java.util.Date r10, java.util.Map<java.lang.String, java.lang.String> r11, java.lang.Object r12) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x00b8
            int r10 = r11.size()
            if (r10 != 0) goto L_0x000a
            goto L_0x00b8
        L_0x000a:
            java.lang.String r10 = "urlpagename"
            java.lang.Object r10 = r11.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = "url"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = r9.m771b(r10, r0)
            if (r10 == 0) goto L_0x00b1
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0028
            goto L_0x00b1
        L_0x0028:
            com.ut.mini.base.UTMIVariables r0 = com.p028ut.mini.base.UTMIVariables.getInstance()
            java.lang.String r4 = r0.getRefPage()
            r0 = 0
            java.lang.String r1 = "utjstype"
            java.lang.Object r2 = r11.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r11.remove(r1)
            if (r2 == 0) goto L_0x0056
            java.lang.String r1 = "0"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0047
            goto L_0x0056
        L_0x0047:
            java.lang.String r1 = "1"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0054
            java.util.Map r11 = r9.m773d(r11)
            goto L_0x005a
        L_0x0054:
            r7 = r0
            goto L_0x005b
        L_0x0056:
            java.util.Map r11 = r9.m772c(r11)
        L_0x005a:
            r7 = r11
        L_0x005b:
            r11 = 2006(0x7d6, float:2.811E-42)
            com.ut.mini.UTPageHitHelper r0 = com.p028ut.mini.UTPageHitHelper.getInstance()
            boolean r0 = r0.mo13021a((java.lang.Object) r12)
            r8 = 2001(0x7d1, float:2.804E-42)
            if (r0 == 0) goto L_0x006a
            r11 = r8
        L_0x006a:
            com.ut.mini.internal.UTOriginalCustomHitBuilder r0 = new com.ut.mini.internal.UTOriginalCustomHitBuilder
            r5 = 0
            r6 = 0
            r1 = r0
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            if (r8 != r11) goto L_0x007d
            com.ut.mini.base.UTMIVariables r11 = com.p028ut.mini.base.UTMIVariables.getInstance()
            r11.setRefPage(r10)
        L_0x007d:
            com.ut.mini.UTPageHitHelper r10 = com.p028ut.mini.UTPageHitHelper.getInstance()
            java.util.Map r10 = r10.mo13023c()
            if (r10 == 0) goto L_0x0090
            int r11 = r10.size()
            if (r11 <= 0) goto L_0x0090
            r0.setProperties(r10)
        L_0x0090:
            com.ut.mini.UTAnalytics r10 = com.p028ut.mini.UTAnalytics.getInstance()
            com.ut.mini.UTTracker r10 = r10.getDefaultTracker()
            if (r10 == 0) goto L_0x00a2
            java.util.Map r11 = r0.build()
            r10.send(r11)
            goto L_0x00a9
        L_0x00a2:
            java.lang.String r10 = "h5Page event error"
            java.lang.String r11 = "Fatal Error,must call setRequestAuthentication method first."
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r10, (java.lang.Object) r11)
        L_0x00a9:
            com.ut.mini.UTPageHitHelper r10 = com.p028ut.mini.UTPageHitHelper.getInstance()
            r10.mo13021a((java.lang.Object) r12)
            return
        L_0x00b1:
            java.lang.String r10 = "h5Page"
            java.lang.String r11 = "pageName is null,return"
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r10, (java.lang.Object) r11)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.UTHybridHelper.m770a(java.util.Date, java.util.Map, java.lang.Object):void");
    }

    /* renamed from: a */
    private void m769a(Date date, Map<String, String> map) {
        if (map != null && map.size() != 0) {
            String b = m771b(map.get("urlpagename"), map.get("url"));
            if (b == null || TextUtils.isEmpty(b)) {
                Logger.m291a("h5Ctrl", "pageName is null,return");
                return;
            }
            String str = map.get("logkey");
            if (str == null || TextUtils.isEmpty(str)) {
                Logger.m291a("h5Ctrl", "logkey is null,return");
                return;
            }
            Map<String, String> map2 = null;
            String str2 = map.get("utjstype");
            map.remove("utjstype");
            if (str2 == null || str2.equals("0")) {
                map2 = m774e(map);
            } else if (str2.equals("1")) {
                map2 = m775f(map);
            }
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(b, 2101, str, (String) null, (String) null, map2);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker != null) {
                defaultTracker.send(uTOriginalCustomHitBuilder.build());
            } else {
                Logger.m288a("h5Ctrl event error", (Object) "Fatal Error,must call setRequestAuthentication method first.");
            }
        }
    }

    /* renamed from: c */
    private Map<String, String> m772c(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("url");
        String str2 = "";
        hashMap.put("_h5url", str == null ? str2 : str);
        if (str != null) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("spm");
            if (queryParameter == null || TextUtils.isEmpty(queryParameter)) {
                hashMap.put("spm", "0.0.0.0");
            } else {
                hashMap.put("spm", queryParameter);
            }
            String queryParameter2 = parse.getQueryParameter("scm");
            if (queryParameter2 != null && !TextUtils.isEmpty(queryParameter2)) {
                hashMap.put("scm", queryParameter2);
            }
        } else {
            hashMap.put("spm", "0.0.0.0");
        }
        String str3 = map.get("spmcnt");
        if (str3 == null) {
            str3 = str2;
        }
        hashMap.put("_spmcnt", str3);
        String str4 = map.get("spmpre");
        if (str4 == null) {
            str4 = str2;
        }
        hashMap.put("_spmpre", str4);
        String str5 = map.get("lzsid");
        if (str5 == null) {
            str5 = str2;
        }
        hashMap.put("_lzsid", str5);
        String str6 = map.get("extendargs");
        if (str6 == null) {
            str6 = str2;
        }
        hashMap.put("_h5ea", str6);
        String str7 = map.get("cna");
        if (str7 != null) {
            str2 = str7;
        }
        hashMap.put("_cna", str2);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    /* renamed from: d */
    private Map<String, String> m773d(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("url");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("_h5url", str);
        String str3 = map.get("extendargs");
        if (str3 != null) {
            str2 = str3;
        }
        hashMap.put("_h5ea", str2);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    /* renamed from: e */
    private Map<String, String> m774e(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("logkeyargs");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hashMap.put("_lka", str);
        String str3 = map.get("cna");
        if (str3 == null) {
            str3 = str2;
        }
        hashMap.put("_cna", str3);
        String str4 = map.get("extendargs");
        if (str4 != null) {
            str2 = str4;
        }
        hashMap.put("_h5ea", str2);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    /* renamed from: f */
    private Map<String, String> m775f(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("extendargs");
        if (str == null) {
            str = "";
        }
        hashMap.put("_h5ea", str);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    /* renamed from: b */
    private String m771b(String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str)) {
            return str;
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        int indexOf = str2.indexOf("?");
        if (indexOf == -1) {
            return str2;
        }
        return str2.substring(0, indexOf);
    }
}
