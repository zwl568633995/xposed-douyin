package com.p022ta.utdid2.device;

import android.content.Context;
import android.provider.Settings;
import com.p022ta.utdid2.p024b.p025a.C1049b;
import com.p022ta.utdid2.p024b.p025a.C1053e;
import com.p022ta.utdid2.p024b.p025a.C1054g;
import com.p022ta.utdid2.p024b.p025a.C1055i;
import com.p022ta.utdid2.p026c.p027a.PersistentConfiguration;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ta.utdid2.device.c */
public class UTUtdid {

    /* renamed from: a */
    private static UTUtdid f868a = null;

    /* renamed from: f */
    private static final Object f869f = new Object();

    /* renamed from: o */
    private static final String f870o = (".UTSystemConfig" + File.separator + "Global");

    /* renamed from: a */
    private PersistentConfiguration f871a = null;

    /* renamed from: a */
    private UTUtdidHelper f872a = null;

    /* renamed from: a */
    private Pattern f873a = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* renamed from: b */
    private PersistentConfiguration f874b = null;

    /* renamed from: l */
    private String f875l = null;

    /* renamed from: m */
    private String f876m = "xx_utdid_key";
    private Context mContext = null;

    /* renamed from: n */
    private String f877n = "xx_utdid_domain";

    public UTUtdid(Context context) {
        this.mContext = context;
        this.f874b = new PersistentConfiguration(context, f870o, "Alvin2", false, true);
        this.f871a = new PersistentConfiguration(context, ".DataStorage", "ContextData", false, true);
        this.f872a = new UTUtdidHelper();
        this.f876m = String.format("K_%d", new Object[]{Integer.valueOf(C1055i.m676a(this.f876m))});
        this.f877n = String.format("D_%d", new Object[]{Integer.valueOf(C1055i.m676a(this.f877n))});
    }

    /* renamed from: d */
    private void m752d() {
        PersistentConfiguration cVar = this.f874b;
        if (cVar != null) {
            if (C1055i.m676a(cVar.getString("UTDID2"))) {
                String string = this.f874b.getString("UTDID");
                if (!C1055i.m676a(string)) {
                    m753f(string);
                }
            }
            boolean z = false;
            boolean z2 = true;
            if (!C1055i.m676a(this.f874b.getString("DID"))) {
                this.f874b.remove("DID");
                z = true;
            }
            if (!C1055i.m676a(this.f874b.getString("EI"))) {
                this.f874b.remove("EI");
                z = true;
            }
            if (!C1055i.m676a(this.f874b.getString("SI"))) {
                this.f874b.remove("SI");
            } else {
                z2 = z;
            }
            if (z2) {
                this.f874b.commit();
            }
        }
    }

    /* renamed from: a */
    public static UTUtdid m748a(Context context) {
        if (context != null && f868a == null) {
            synchronized (f869f) {
                if (f868a == null) {
                    UTUtdid cVar = new UTUtdid(context);
                    f868a = cVar;
                    cVar.m752d();
                }
            }
        }
        return f868a;
    }

    /* renamed from: f */
    private void m753f(String str) {
        PersistentConfiguration cVar;
        if (m751b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24 && (cVar = this.f874b) != null) {
                cVar.putString("UTDID2", str);
                this.f874b.commit();
            }
        }
    }

    /* renamed from: g */
    private void m755g(String str) {
        PersistentConfiguration cVar;
        if (str != null && (cVar = this.f871a) != null && !str.equals(cVar.getString(this.f876m))) {
            this.f871a.putString(this.f876m, str);
            this.f871a.commit();
        }
    }

    /* renamed from: h */
    private void m756h(String str) {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0 && m751b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length()) {
                String str2 = null;
                try {
                    str2 = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
                } catch (Exception unused) {
                }
                if (!m751b(str2)) {
                    try {
                        Settings.System.putString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk", str);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private void m757i(String str) {
        String str2;
        try {
            str2 = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused) {
            str2 = null;
        }
        if (!str.equals(str2)) {
            try {
                Settings.System.putString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp", str);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: j */
    private void m758j(String str) {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0 && str != null) {
            m757i(str);
        }
    }

    /* renamed from: g */
    private String m754g() {
        PersistentConfiguration cVar = this.f874b;
        if (cVar == null) {
            return null;
        }
        String string = cVar.getString("UTDID2");
        if (C1055i.m676a(string) || this.f872a.mo12986a(string) == null) {
            return null;
        }
        return string;
    }

    /* renamed from: b */
    private boolean m751b(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            return 24 == str.length() && !this.f873a.matcher(str).find();
        }
    }

    public synchronized String getValue() {
        if (this.f875l != null) {
            return this.f875l;
        }
        return mo12985h();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072 A[Catch:{ Exception -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[SYNTHETIC, Splitter:B:9:0x0017] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo12985h() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = ""
            android.content.Context r1 = r6.mContext     // Catch:{ Exception -> 0x000f }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x000f }
            java.lang.String r2 = "mqBRboGZkQPcAkyk"
            java.lang.String r0 = android.provider.Settings.System.getString(r1, r2)     // Catch:{ Exception -> 0x000f }
        L_0x000f:
            boolean r1 = r6.m751b((java.lang.String) r0)     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            com.ta.utdid2.device.e r0 = new com.ta.utdid2.device.e     // Catch:{ all -> 0x010d }
            r0.<init>()     // Catch:{ all -> 0x010d }
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.mContext     // Catch:{ Exception -> 0x002b }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x002b }
            java.lang.String r4 = "dxCRMxhQkdGePGnp"
            java.lang.String r3 = android.provider.Settings.System.getString(r3, r4)     // Catch:{ Exception -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r3 = r2
        L_0x002c:
            boolean r4 = com.p022ta.utdid2.p024b.p025a.C1055i.m676a((java.lang.String) r3)     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = r0.mo12990c(r3)     // Catch:{ all -> 0x010d }
            boolean r5 = r6.m751b((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            if (r5 == 0) goto L_0x0041
            r6.m756h(r4)     // Catch:{ all -> 0x010d }
            monitor-exit(r6)
            return r4
        L_0x0041:
            java.lang.String r4 = r0.mo12989b(r3)     // Catch:{ all -> 0x010d }
            boolean r5 = r6.m751b((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            if (r5 == 0) goto L_0x0066
            com.ta.utdid2.device.d r5 = r6.f872a     // Catch:{ all -> 0x010d }
            java.lang.String r4 = r5.mo12986a(r4)     // Catch:{ all -> 0x010d }
            boolean r5 = com.p022ta.utdid2.p024b.p025a.C1055i.m676a((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            if (r5 != 0) goto L_0x0066
            r6.m758j(r4)     // Catch:{ all -> 0x010d }
            android.content.Context r4 = r6.mContext     // Catch:{ Exception -> 0x0066 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r5 = "dxCRMxhQkdGePGnp"
            java.lang.String r3 = android.provider.Settings.System.getString(r4, r5)     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            com.ta.utdid2.device.d r4 = r6.f872a     // Catch:{ all -> 0x010d }
            java.lang.String r4 = r4.mo12987b(r3)     // Catch:{ all -> 0x010d }
            boolean r5 = r6.m751b((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            if (r5 == 0) goto L_0x0084
            r6.f875l = r4     // Catch:{ all -> 0x010d }
            r6.m753f(r4)     // Catch:{ all -> 0x010d }
            r6.m755g(r3)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r6.f875l     // Catch:{ all -> 0x010d }
            r6.m756h(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r6.f875l     // Catch:{ all -> 0x010d }
            monitor-exit(r6)
            return r0
        L_0x0083:
            r1 = 1
        L_0x0084:
            java.lang.String r3 = r6.m754g()     // Catch:{ all -> 0x010d }
            boolean r4 = r6.m751b((java.lang.String) r3)     // Catch:{ all -> 0x010d }
            if (r4 == 0) goto L_0x00a3
            com.ta.utdid2.device.d r0 = r6.f872a     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r0.mo12986a(r3)     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x0099
            r6.m758j(r0)     // Catch:{ all -> 0x010d }
        L_0x0099:
            r6.m756h(r3)     // Catch:{ all -> 0x010d }
            r6.m755g(r0)     // Catch:{ all -> 0x010d }
            r6.f875l = r3     // Catch:{ all -> 0x010d }
            monitor-exit(r6)
            return r3
        L_0x00a3:
            com.ta.utdid2.c.a.c r3 = r6.f871a     // Catch:{ all -> 0x010d }
            java.lang.String r4 = r6.f876m     // Catch:{ all -> 0x010d }
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x010d }
            boolean r4 = com.p022ta.utdid2.p024b.p025a.C1055i.m676a((java.lang.String) r3)     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x00e3
            java.lang.String r0 = r0.mo12989b(r3)     // Catch:{ all -> 0x010d }
            boolean r4 = r6.m751b((java.lang.String) r0)     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x00c1
            com.ta.utdid2.device.d r0 = r6.f872a     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r0.mo12987b(r3)     // Catch:{ all -> 0x010d }
        L_0x00c1:
            boolean r3 = r6.m751b((java.lang.String) r0)     // Catch:{ all -> 0x010d }
            if (r3 == 0) goto L_0x00e3
            com.ta.utdid2.device.d r3 = r6.f872a     // Catch:{ all -> 0x010d }
            java.lang.String r3 = r3.mo12986a(r0)     // Catch:{ all -> 0x010d }
            boolean r4 = com.p022ta.utdid2.p024b.p025a.C1055i.m676a((java.lang.String) r0)     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x00e3
            r6.f875l = r0     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x00da
            r6.m758j(r3)     // Catch:{ all -> 0x010d }
        L_0x00da:
            java.lang.String r0 = r6.f875l     // Catch:{ all -> 0x010d }
            r6.m753f(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r6.f875l     // Catch:{ all -> 0x010d }
            monitor-exit(r6)
            return r0
        L_0x00e3:
            byte[] r0 = r6.m749a()     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x010b
            r3 = 2
            java.lang.String r3 = com.p022ta.utdid2.p024b.p025a.C1049b.encodeToString(r0, r3)     // Catch:{ Exception -> 0x0107 }
            r6.f875l = r3     // Catch:{ Exception -> 0x0107 }
            r6.m753f(r3)     // Catch:{ Exception -> 0x0107 }
            com.ta.utdid2.device.d r3 = r6.f872a     // Catch:{ Exception -> 0x0107 }
            java.lang.String r0 = r3.mo12988c(r0)     // Catch:{ Exception -> 0x0107 }
            if (r0 == 0) goto L_0x0103
            if (r1 == 0) goto L_0x0100
            r6.m758j(r0)     // Catch:{ Exception -> 0x0107 }
        L_0x0100:
            r6.m755g(r0)     // Catch:{ Exception -> 0x0107 }
        L_0x0103:
            java.lang.String r0 = r6.f875l     // Catch:{ Exception -> 0x0107 }
            monitor-exit(r6)
            return r0
        L_0x0107:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x010d }
        L_0x010b:
            monitor-exit(r6)
            return r2
        L_0x010d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p022ta.utdid2.device.UTUtdid.mo12985h():java.lang.String");
    }

    /* renamed from: a */
    private final byte[] m749a() throws Exception {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int nextInt = new Random().nextInt();
        byte[] bytes = C1053e.getBytes((int) (System.currentTimeMillis() / 1000));
        byte[] bytes2 = C1053e.getBytes(nextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = C1054g.m672a(this.mContext);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(new Random().nextInt());
            str = sb.toString();
        }
        byteArrayOutputStream.write(C1053e.getBytes(C1055i.m676a(str)), 0, 4);
        byteArrayOutputStream.write(C1053e.getBytes(C1055i.m676a(m750b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    private static String m750b(byte[] bArr) throws Exception {
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec("d6fc3a4a06adbde89223bvefedc24fecde188aaa9161".getBytes(), instance.getAlgorithm()));
        return C1049b.encodeToString(instance.doFinal(bArr), 2);
    }
}
