package com.p028ut.mini;

import android.app.Activity;
import android.net.Uri;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.ut.mini.UTPageHitHelper */
public class UTPageHitHelper {

    /* renamed from: a */
    private static UTPageHitHelper f890a = new UTPageHitHelper();

    /* renamed from: A */
    private Map<String, UTPageEventObject> f891A = new HashMap();

    /* renamed from: B */
    private Map<String, String> f892B = new HashMap();

    /* renamed from: C */
    private Map<Object, String> f893C = new HashMap();

    /* renamed from: O */
    private boolean f894O = false;

    /* renamed from: a */
    private Queue<UTPageEventObject> f895a = new LinkedList();

    /* renamed from: al */
    private String f896al = null;

    /* renamed from: am */
    private String f897am = null;

    /* renamed from: z */
    private Map<String, String> f898z = new HashMap();

    /* renamed from: com.ut.mini.UTPageHitHelper$UTPageEventObject */
    public static class UTPageEventObject {

        /* renamed from: A */
        private long f899A = 0;

        /* renamed from: P */
        private boolean f900P = false;

        /* renamed from: Q */
        private boolean f901Q = false;

        /* renamed from: R */
        private boolean f902R = false;

        /* renamed from: a */
        private Uri f903a = null;

        /* renamed from: a */
        private UTPageStatus f904a = null;

        /* renamed from: an */
        private String f905an = null;

        /* renamed from: ao */
        private String f906ao = null;

        /* renamed from: ap */
        private String f907ap = null;

        /* renamed from: z */
        private Map<String, String> f908z = new HashMap();

        public void setCacheKey(String str) {
            this.f907ap = str;
        }

        public String getCacheKey() {
            return this.f907ap;
        }

        public void resetPropertiesWithoutSkipFlagAndH5Flag() {
            this.f908z = new HashMap();
            this.f899A = 0;
            this.f903a = null;
            this.f905an = null;
            this.f906ao = null;
            UTPageStatus uTPageStatus = this.f904a;
            if (uTPageStatus == null || uTPageStatus != UTPageStatus.UT_H5_IN_WebView) {
                this.f904a = null;
            }
            this.f900P = false;
            this.f902R = false;
        }

        public boolean isH5Called() {
            return this.f902R;
        }

        public void setH5Called() {
            this.f902R = true;
        }

        public void setToSkipPage() {
            this.f901Q = true;
        }

        public boolean isSkipPage() {
            return this.f901Q;
        }

        public void setPageAppearCalled() {
            this.f900P = true;
        }

        public boolean isPageAppearCalled() {
            return this.f900P;
        }

        public void setPageStatus(UTPageStatus uTPageStatus) {
            this.f904a = uTPageStatus;
        }

        public UTPageStatus getPageStatus() {
            return this.f904a;
        }

        public Map<String, String> getPageProperties() {
            return this.f908z;
        }

        public void setPageProperties(Map<String, String> map) {
            this.f908z = map;
        }

        public long getPageStayTimstamp() {
            return this.f899A;
        }

        public void setPageStayTimstamp(long j) {
            this.f899A = j;
        }

        public Uri getPageUrl() {
            return this.f903a;
        }

        public void setPageUrl(Uri uri) {
            this.f903a = uri;
        }

        public void setPageName(String str) {
            this.f905an = str;
        }

        public String getPageName() {
            return this.f905an;
        }

        public void setRefPage(String str) {
            this.f906ao = str;
        }

        public String getRefPage() {
            return this.f906ao;
        }
    }

    public static UTPageHitHelper getInstance() {
        return f890a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized Map<String, String> mo13023c() {
        if (this.f892B == null || this.f892B.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f892B);
        this.f892B.clear();
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo13020a(UTPageEventObject uTPageEventObject) {
        uTPageEventObject.resetPropertiesWithoutSkipFlagAndH5Flag();
        if (!this.f895a.contains(uTPageEventObject)) {
            this.f895a.add(uTPageEventObject);
        }
        if (this.f895a.size() > 200) {
            for (int i = 0; i < 100; i++) {
                UTPageEventObject poll = this.f895a.poll();
                if (poll != null && this.f891A.containsKey(poll.getCacheKey())) {
                    this.f891A.remove(poll.getCacheKey());
                }
            }
        }
    }

    @Deprecated
    public synchronized void turnOffAutoPageTrack() {
        this.f894O = true;
    }

    public String getCurrentPageName() {
        return this.f897am;
    }

    /* access modifiers changed from: package-private */
    public void pageAppearByAuto(Activity activity) {
        if (!this.f894O) {
            pageAppear(activity);
        }
    }

    /* renamed from: a */
    private String m778a(Object obj) {
        String str;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        return str + hashCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m786a(Object obj) {
        if (obj != null) {
            UTPageEventObject a = mo13021a(obj);
            if (a.getPageStatus() != null && a.getPageStatus() == UTPageStatus.UT_H5_IN_WebView) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m784a(Object obj) {
        if (obj != null) {
            UTPageEventObject a = mo13021a(obj);
            if (a.getPageStatus() != null) {
                a.setH5Called();
            }
        }
    }

    /* renamed from: a */
    private synchronized UTPageEventObject mo13021a(Object obj) {
        String a = mo13021a(obj);
        if (this.f891A.containsKey(a)) {
            return this.f891A.get(a);
        }
        UTPageEventObject uTPageEventObject = new UTPageEventObject();
        this.f891A.put(a, uTPageEventObject);
        uTPageEventObject.setCacheKey(a);
        return uTPageEventObject;
    }

    /* renamed from: a */
    private synchronized void m779a(String str, UTPageEventObject uTPageEventObject) {
        this.f891A.put(str, uTPageEventObject);
    }

    /* renamed from: b */
    private synchronized void m781b(UTPageEventObject uTPageEventObject) {
        if (this.f891A.containsKey(uTPageEventObject.getCacheKey())) {
            this.f891A.remove(uTPageEventObject.getCacheKey());
        }
    }

    /* renamed from: b */
    private synchronized void m782b(Object obj) {
        String a = mo13021a(obj);
        if (this.f891A.containsKey(a)) {
            this.f891A.remove(a);
        }
    }

    @Deprecated
    public synchronized void pageAppear(Object obj) {
        mo13022a(obj, (String) null, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo13022a(java.lang.Object r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x00f5
            java.lang.String r0 = r4.mo13021a((java.lang.Object) r5)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = r4.f896al     // Catch:{ all -> 0x00fe }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r4)
            return
        L_0x0013:
            java.lang.String r0 = r4.f896al     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "lost 2001"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            r1.<init>()     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = "Last page requires leave("
            r1.append(r2)     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = r4.f896al     // Catch:{ all -> 0x00fe }
            r1.append(r2)     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = ")."
            r1.append(r2)     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fe }
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x00fe }
        L_0x0034:
            com.ut.mini.UTPageHitHelper$UTPageEventObject r0 = r4.mo13021a((java.lang.Object) r5)     // Catch:{ all -> 0x00fe }
            if (r7 != 0) goto L_0x0066
            boolean r7 = r0.isSkipPage()     // Catch:{ all -> 0x00fe }
            if (r7 == 0) goto L_0x0066
            java.lang.String r6 = "skip page[pageAppear]"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x00fe }
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            r1.<init>()     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = "page name:"
            r1.append(r2)     // Catch:{ all -> 0x00fe }
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x00fe }
            r1.append(r5)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x00fe }
            r7[r0] = r5     // Catch:{ all -> 0x00fe }
            com.alibaba.mtl.log.p016d.Logger.m291a((java.lang.String) r6, (java.lang.String[]) r7)     // Catch:{ all -> 0x00fe }
            monitor-exit(r4)
            return
        L_0x0066:
            com.ut.mini.base.UTMIVariables r7 = com.p028ut.mini.base.UTMIVariables.getInstance()     // Catch:{ all -> 0x00fe }
            java.lang.String r7 = r7.getH5Url()     // Catch:{ all -> 0x00fe }
            r1 = 0
            if (r7 == 0) goto L_0x008e
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "spm"
            java.lang.String r7 = r7.getQueryParameter(r2)     // Catch:{ all -> 0x0083 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.f898z     // Catch:{ all -> 0x0083 }
            java.lang.String r3 = "spm"
            r2.put(r3, r7)     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ all -> 0x00fe }
        L_0x0087:
            com.ut.mini.base.UTMIVariables r7 = com.p028ut.mini.base.UTMIVariables.getInstance()     // Catch:{ all -> 0x00fe }
            r7.setH5Url(r1)     // Catch:{ all -> 0x00fe }
        L_0x008e:
            java.lang.String r7 = m780b((java.lang.Object) r5)     // Catch:{ all -> 0x00fe }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00fe }
            if (r2 != 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r6 = r7
        L_0x009a:
            java.lang.String r7 = r0.getPageName()     // Catch:{ all -> 0x00fe }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00fe }
            if (r7 != 0) goto L_0x00a8
            java.lang.String r6 = r0.getPageName()     // Catch:{ all -> 0x00fe }
        L_0x00a8:
            r4.f897am = r6     // Catch:{ all -> 0x00fe }
            r0.setPageName(r6)     // Catch:{ all -> 0x00fe }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00fe }
            r0.setPageStayTimstamp(r6)     // Catch:{ all -> 0x00fe }
            com.ut.mini.base.UTMIVariables r6 = com.p028ut.mini.base.UTMIVariables.getInstance()     // Catch:{ all -> 0x00fe }
            java.lang.String r6 = r6.getRefPage()     // Catch:{ all -> 0x00fe }
            r0.setRefPage(r6)     // Catch:{ all -> 0x00fe }
            r0.setPageAppearCalled()     // Catch:{ all -> 0x00fe }
            java.util.Map<java.lang.String, java.lang.String> r6 = r4.f892B     // Catch:{ all -> 0x00fe }
            if (r6 == 0) goto L_0x00e2
            java.util.Map r6 = r0.getPageProperties()     // Catch:{ all -> 0x00fe }
            if (r6 != 0) goto L_0x00d2
            java.util.Map<java.lang.String, java.lang.String> r6 = r4.f892B     // Catch:{ all -> 0x00fe }
            r0.setPageProperties(r6)     // Catch:{ all -> 0x00fe }
            goto L_0x00e2
        L_0x00d2:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x00fe }
            r7.<init>()     // Catch:{ all -> 0x00fe }
            r7.putAll(r6)     // Catch:{ all -> 0x00fe }
            java.util.Map<java.lang.String, java.lang.String> r6 = r4.f892B     // Catch:{ all -> 0x00fe }
            r7.putAll(r6)     // Catch:{ all -> 0x00fe }
            r0.setPageProperties(r7)     // Catch:{ all -> 0x00fe }
        L_0x00e2:
            r4.f892B = r1     // Catch:{ all -> 0x00fe }
            java.lang.String r6 = r4.mo13021a((java.lang.Object) r5)     // Catch:{ all -> 0x00fe }
            r4.f896al = r6     // Catch:{ all -> 0x00fe }
            r4.m781b((com.p028ut.mini.UTPageHitHelper.UTPageEventObject) r0)     // Catch:{ all -> 0x00fe }
            java.lang.String r5 = r4.mo13021a((java.lang.Object) r5)     // Catch:{ all -> 0x00fe }
            r4.m779a(r5, r0)     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00f5:
            java.lang.String r5 = "pageAppear"
            java.lang.String r6 = "The page object should not be null"
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x00fe }
        L_0x00fc:
            monitor-exit(r4)
            return
        L_0x00fe:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.UTPageHitHelper.mo13022a(java.lang.Object, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void pageAppear(Object obj, String str) {
        mo13022a(obj, str, false);
    }

    @Deprecated
    public synchronized void updatePageProperties(Map<String, String> map) {
        if (map != null) {
            this.f898z.putAll(map);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updatePageProperties(java.lang.Object r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x0032
            if (r4 == 0) goto L_0x0032
            int r0 = r4.size()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x000c
            goto L_0x0032
        L_0x000c:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            r0.putAll(r4)     // Catch:{ all -> 0x003b }
            com.ut.mini.UTPageHitHelper$UTPageEventObject r3 = r2.mo13021a((java.lang.Object) r3)     // Catch:{ all -> 0x003b }
            java.util.Map r4 = r3.getPageProperties()     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x0022
            r3.setPageProperties(r0)     // Catch:{ all -> 0x003b }
            goto L_0x0030
        L_0x0022:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x003b }
            r1.<init>()     // Catch:{ all -> 0x003b }
            r1.putAll(r4)     // Catch:{ all -> 0x003b }
            r1.putAll(r0)     // Catch:{ all -> 0x003b }
            r3.setPageProperties(r1)     // Catch:{ all -> 0x003b }
        L_0x0030:
            monitor-exit(r2)
            return
        L_0x0032:
            java.lang.String r3 = "updatePageProperties"
            java.lang.String r4 = "failed to update project, parameters should not be null and the map should not be empty"
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.UTPageHitHelper.updatePageProperties(java.lang.Object, java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updatePageName(java.lang.Object r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0018
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0018
        L_0x000a:
            com.ut.mini.UTPageHitHelper$UTPageEventObject r2 = r1.mo13021a((java.lang.Object) r2)     // Catch:{ all -> 0x0015 }
            r2.setPageName(r3)     // Catch:{ all -> 0x0015 }
            r1.f897am = r3     // Catch:{ all -> 0x0015 }
            monitor-exit(r1)
            return
        L_0x0015:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0018:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.UTPageHitHelper.updatePageName(java.lang.Object, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updatePageUrl(java.lang.Object r4, android.net.Uri r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x002c
            if (r5 != 0) goto L_0x0006
            goto L_0x002c
        L_0x0006:
            java.lang.String r0 = "url"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r1.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "url"
            r1.append(r2)     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0029 }
            r1.append(r2)     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0029 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0029 }
            com.ut.mini.UTPageHitHelper$UTPageEventObject r4 = r3.mo13021a((java.lang.Object) r4)     // Catch:{ all -> 0x0029 }
            r4.setPageUrl(r5)     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x002c:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.UTPageHitHelper.updatePageUrl(java.lang.Object, android.net.Uri):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void updatePageStatus(java.lang.Object r1, com.p028ut.mini.UTPageStatus r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto L_0x0012
            if (r2 != 0) goto L_0x0006
            goto L_0x0012
        L_0x0006:
            com.ut.mini.UTPageHitHelper$UTPageEventObject r1 = r0.mo13021a((java.lang.Object) r1)     // Catch:{ all -> 0x000f }
            r1.setPageStatus(r2)     // Catch:{ all -> 0x000f }
            monitor-exit(r0)
            return
        L_0x000f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0012:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.UTPageHitHelper.updatePageStatus(java.lang.Object, com.ut.mini.UTPageStatus):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void updateNextPageProperties(Map<String, String> map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            this.f892B = hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    public void pageDisAppearByAuto(Activity activity) {
        if (!this.f894O) {
            pageDisAppear(activity);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void skipPage(Object obj) {
        if (obj != null) {
            mo13021a(obj).setToSkipPage();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ba, code lost:
        return;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void pageDisAppear(java.lang.Object r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            if (r12 == 0) goto L_0x01b2
            java.lang.String r0 = r11.f896al     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r11)
            return
        L_0x0009:
            com.ut.mini.UTPageHitHelper$UTPageEventObject r0 = r11.mo13021a((java.lang.Object) r12)     // Catch:{ all -> 0x01bb }
            boolean r1 = r0.isPageAppearCalled()     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x0167
            com.ut.mini.UTPageStatus r1 = r0.getPageStatus()     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x002c
            com.ut.mini.UTPageStatus r1 = com.p028ut.mini.UTPageStatus.UT_H5_IN_WebView     // Catch:{ all -> 0x01bb }
            com.ut.mini.UTPageStatus r2 = r0.getPageStatus()     // Catch:{ all -> 0x01bb }
            if (r1 != r2) goto L_0x002c
            boolean r1 = r0.isH5Called()     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x002c
            r11.mo13020a((com.p028ut.mini.UTPageHitHelper.UTPageEventObject) r0)     // Catch:{ all -> 0x01bb }
            monitor-exit(r11)
            return
        L_0x002c:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01bb }
            long r3 = r0.getPageStayTimstamp()     // Catch:{ all -> 0x01bb }
            long r1 = r1 - r3
            android.net.Uri r3 = r0.getPageUrl()     // Catch:{ all -> 0x01bb }
            if (r3 != 0) goto L_0x0056
            boolean r3 = r12 instanceof android.app.Activity     // Catch:{ all -> 0x01bb }
            if (r3 == 0) goto L_0x0056
            r3 = r12
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x01bb }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x01bb }
            if (r3 == 0) goto L_0x0056
            r3 = r12
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x01bb }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x01bb }
            android.net.Uri r3 = r3.getData()     // Catch:{ all -> 0x01bb }
            r0.setPageUrl(r3)     // Catch:{ all -> 0x01bb }
        L_0x0056:
            java.lang.String r3 = r0.getPageName()     // Catch:{ all -> 0x01bb }
            java.lang.String r4 = r0.getRefPage()     // Catch:{ all -> 0x01bb }
            if (r4 == 0) goto L_0x0066
            int r5 = r4.length()     // Catch:{ all -> 0x01bb }
            if (r5 != 0) goto L_0x0068
        L_0x0066:
            java.lang.String r4 = "-"
        L_0x0068:
            java.util.Map<java.lang.String, java.lang.String> r5 = r11.f898z     // Catch:{ all -> 0x01bb }
            if (r5 != 0) goto L_0x0071
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x01bb }
            r5.<init>()     // Catch:{ all -> 0x01bb }
        L_0x0071:
            java.util.Map r6 = r0.getPageProperties()     // Catch:{ all -> 0x01bb }
            if (r6 == 0) goto L_0x007e
            java.util.Map r6 = r0.getPageProperties()     // Catch:{ all -> 0x01bb }
            r5.putAll(r6)     // Catch:{ all -> 0x01bb }
        L_0x007e:
            boolean r6 = r12 instanceof com.p028ut.mini.IUTPageTrack     // Catch:{ all -> 0x01bb }
            if (r6 == 0) goto L_0x00ae
            r6 = r12
            com.ut.mini.IUTPageTrack r6 = (com.p028ut.mini.IUTPageTrack) r6     // Catch:{ all -> 0x01bb }
            java.lang.String r7 = r6.getReferPage()     // Catch:{ all -> 0x01bb }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x01bb }
            if (r8 != 0) goto L_0x0090
            r4 = r7
        L_0x0090:
            java.util.Map r7 = r6.getPageProperties()     // Catch:{ all -> 0x01bb }
            if (r7 == 0) goto L_0x00a3
            int r8 = r7.size()     // Catch:{ all -> 0x01bb }
            if (r8 <= 0) goto L_0x00a3
            java.util.Map<java.lang.String, java.lang.String> r5 = r11.f898z     // Catch:{ all -> 0x01bb }
            r5.putAll(r7)     // Catch:{ all -> 0x01bb }
            java.util.Map<java.lang.String, java.lang.String> r5 = r11.f898z     // Catch:{ all -> 0x01bb }
        L_0x00a3:
            java.lang.String r6 = r6.getPageName()     // Catch:{ all -> 0x01bb }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x01bb }
            if (r7 != 0) goto L_0x00ae
            r3 = r6
        L_0x00ae:
            android.net.Uri r6 = r0.getPageUrl()     // Catch:{ all -> 0x01bb }
            if (r6 == 0) goto L_0x0136
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0132 }
            r7.<init>()     // Catch:{ all -> 0x0132 }
            java.lang.String r8 = "spm"
            java.lang.String r8 = r6.getQueryParameter(r8)     // Catch:{ all -> 0x0132 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0132 }
            if (r9 == 0) goto L_0x00de
            java.lang.String r9 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x00da }
            java.lang.String r10 = "UTF-8"
            java.lang.String r9 = java.net.URLDecoder.decode(r9, r10)     // Catch:{ UnsupportedEncodingException -> 0x00da }
            android.net.Uri r6 = android.net.Uri.parse(r9)     // Catch:{ UnsupportedEncodingException -> 0x00da }
            java.lang.String r9 = "spm"
            java.lang.String r8 = r6.getQueryParameter(r9)     // Catch:{ UnsupportedEncodingException -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ all -> 0x0132 }
        L_0x00de:
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0132 }
            if (r9 != 0) goto L_0x0106
            r9 = 0
            java.util.Map<java.lang.Object, java.lang.String> r10 = r11.f893C     // Catch:{ all -> 0x0132 }
            boolean r10 = r10.containsKey(r12)     // Catch:{ all -> 0x0132 }
            if (r10 == 0) goto L_0x00fa
            java.util.Map<java.lang.Object, java.lang.String> r10 = r11.f893C     // Catch:{ all -> 0x0132 }
            java.lang.Object r10 = r10.get(r12)     // Catch:{ all -> 0x0132 }
            boolean r10 = r8.equals(r10)     // Catch:{ all -> 0x0132 }
            if (r10 == 0) goto L_0x00fa
            r9 = 1
        L_0x00fa:
            if (r9 != 0) goto L_0x0106
            java.lang.String r9 = "spm"
            r7.put(r9, r8)     // Catch:{ all -> 0x0132 }
            java.util.Map<java.lang.Object, java.lang.String> r9 = r11.f893C     // Catch:{ all -> 0x0132 }
            r9.put(r12, r8)     // Catch:{ all -> 0x0132 }
        L_0x0106:
            java.lang.String r8 = "scm"
            java.lang.String r8 = r6.getQueryParameter(r8)     // Catch:{ all -> 0x0132 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0132 }
            if (r9 != 0) goto L_0x0117
            java.lang.String r9 = "scm"
            r7.put(r9, r8)     // Catch:{ all -> 0x0132 }
        L_0x0117:
            java.lang.String r6 = m777a((android.net.Uri) r6)     // Catch:{ all -> 0x0132 }
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0132 }
            if (r8 != 0) goto L_0x0128
            com.alibaba.mtl.log.c r8 = com.alibaba.mtl.log.UTMCVariables.mo9578a()     // Catch:{ all -> 0x0132 }
            r8.mo9581e(r6)     // Catch:{ all -> 0x0132 }
        L_0x0128:
            int r6 = r7.size()     // Catch:{ all -> 0x0132 }
            if (r6 <= 0) goto L_0x0136
            r5.putAll(r7)     // Catch:{ all -> 0x0132 }
            goto L_0x0136
        L_0x0132:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ all -> 0x01bb }
        L_0x0136:
            com.ut.mini.UTHitBuilders$UTPageHitBuilder r6 = new com.ut.mini.UTHitBuilders$UTPageHitBuilder     // Catch:{ all -> 0x01bb }
            r6.<init>(r3)     // Catch:{ all -> 0x01bb }
            com.ut.mini.UTHitBuilders$UTPageHitBuilder r4 = r6.setReferPage(r4)     // Catch:{ all -> 0x01bb }
            com.ut.mini.UTHitBuilders$UTPageHitBuilder r1 = r4.setDurationOnPage(r1)     // Catch:{ all -> 0x01bb }
            r1.setProperties(r5)     // Catch:{ all -> 0x01bb }
            com.ut.mini.base.UTMIVariables r1 = com.p028ut.mini.base.UTMIVariables.getInstance()     // Catch:{ all -> 0x01bb }
            r1.setRefPage(r3)     // Catch:{ all -> 0x01bb }
            com.ut.mini.UTAnalytics r1 = com.p028ut.mini.UTAnalytics.getInstance()     // Catch:{ all -> 0x01bb }
            com.ut.mini.UTTracker r1 = r1.getDefaultTracker()     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x015f
            java.util.Map r2 = r6.build()     // Catch:{ all -> 0x01bb }
            r1.send(r2)     // Catch:{ all -> 0x01bb }
            goto L_0x0186
        L_0x015f:
            java.lang.String r1 = "Record page event error"
            java.lang.String r2 = "Fatal Error,must call setRequestAuthentication method first."
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x01bb }
            goto L_0x0186
        L_0x0167:
            java.lang.String r1 = "UT"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bb }
            r2.<init>()     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = "Please call pageAppear first("
            r2.append(r3)     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = m780b((java.lang.Object) r12)     // Catch:{ all -> 0x01bb }
            r2.append(r3)     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = ")."
            r2.append(r3)     // Catch:{ all -> 0x01bb }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01bb }
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x01bb }
        L_0x0186:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x01bb }
            r1.<init>()     // Catch:{ all -> 0x01bb }
            r11.f898z = r1     // Catch:{ all -> 0x01bb }
            boolean r1 = r0.isSkipPage()     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x0197
            r11.mo13020a((com.p028ut.mini.UTPageHitHelper.UTPageEventObject) r0)     // Catch:{ all -> 0x01bb }
            goto L_0x01ac
        L_0x0197:
            com.ut.mini.UTPageStatus r1 = r0.getPageStatus()     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x01a9
            com.ut.mini.UTPageStatus r1 = com.p028ut.mini.UTPageStatus.UT_H5_IN_WebView     // Catch:{ all -> 0x01bb }
            com.ut.mini.UTPageStatus r2 = r0.getPageStatus()     // Catch:{ all -> 0x01bb }
            if (r1 != r2) goto L_0x01a9
            r11.mo13020a((com.p028ut.mini.UTPageHitHelper.UTPageEventObject) r0)     // Catch:{ all -> 0x01bb }
            goto L_0x01ac
        L_0x01a9:
            r11.m780b((java.lang.Object) r12)     // Catch:{ all -> 0x01bb }
        L_0x01ac:
            r12 = 0
            r11.f896al = r12     // Catch:{ all -> 0x01bb }
            r11.f897am = r12     // Catch:{ all -> 0x01bb }
            goto L_0x01b9
        L_0x01b2:
            java.lang.String r12 = "pageDisAppear"
            java.lang.String r0 = "The page object should not be null"
            com.alibaba.mtl.log.p016d.Logger.m288a((java.lang.String) r12, (java.lang.Object) r0)     // Catch:{ all -> 0x01bb }
        L_0x01b9:
            monitor-exit(r11)
            return
        L_0x01bb:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p028ut.mini.UTPageHitHelper.pageDisAppear(java.lang.Object):void");
    }

    /* renamed from: a */
    private static String m777a(Uri uri) {
        List<String> queryParameters;
        if (uri == null || (queryParameters = uri.getQueryParameters("ttid")) == null) {
            return null;
        }
        for (String next : queryParameters) {
            if (!next.contains("@") && !next.contains("%40")) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static String m780b(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        return (simpleName == null || !simpleName.toLowerCase().endsWith("activity")) ? simpleName : simpleName.substring(0, simpleName.length() - 8);
    }
}
