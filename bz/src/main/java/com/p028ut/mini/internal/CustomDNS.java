package com.p028ut.mini.internal;

/* renamed from: com.ut.mini.internal.CustomDNS */
public class CustomDNS {

    /* renamed from: a */
    private IDnsResolver f944a;

    /* renamed from: com.ut.mini.internal.CustomDNS$IDnsResolver */
    public interface IDnsResolver {
        String[] resolveUrl(String str);
    }

    /* renamed from: com.ut.mini.internal.CustomDNS$a */
    private static class C1063a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final CustomDNS f945a = new CustomDNS();
    }

    public static CustomDNS instance() {
        return C1063a.f945a;
    }

    private CustomDNS() {
        this.f944a = null;
    }

    public void setDnsResolver(IDnsResolver iDnsResolver) {
        this.f944a = iDnsResolver;
    }

    public String[] resolveUrl(String str) {
        IDnsResolver iDnsResolver = this.f944a;
        if (iDnsResolver != null) {
            return iDnsResolver.resolveUrl(str);
        }
        return null;
    }
}
