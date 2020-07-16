package com.p022ta.utdid2.p026c.p027a;

import com.p022ta.utdid2.p026c.p027a.MySharedPreferences;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.ta.utdid2.c.a.d */
public class TransactionXMLFile {

    /* renamed from: c */
    private static final Object f845c = new Object();

    /* renamed from: a */
    private File f846a;

    /* renamed from: a */
    private HashMap<File, C1058a> f847a = new HashMap<>();

    /* renamed from: b */
    private final Object f848b = new Object();

    public TransactionXMLFile(String str) {
        if (str == null || str.length() <= 0) {
            throw new RuntimeException("Directory can not be empty");
        }
        this.f846a = new File(str);
    }

    /* renamed from: a */
    private File m701a(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    /* renamed from: a */
    private File m699a() {
        File file;
        synchronized (this.f848b) {
            file = this.f846a;
        }
        return file;
    }

    /* renamed from: b */
    private File m704b(String str) {
        File a = m699a();
        return m701a(a, String.valueOf(str) + ".xml");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.util.HashMap} */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v15, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: type inference failed for: r2v38 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        	at java.util.ArrayList.get(ArrayList.java:429)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:86:0x00c9=Splitter:B:86:0x00c9, B:39:0x006d=Splitter:B:39:0x006d} */
    /* renamed from: a */
    public com.p022ta.utdid2.p026c.p027a.MySharedPreferences mo12969a(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.io.File r10 = r9.m704b((java.lang.String) r10)
            java.lang.Object r0 = f845c
            monitor-enter(r0)
            java.util.HashMap<java.io.File, com.ta.utdid2.c.a.d$a> r1 = r9.f847a     // Catch:{ all -> 0x00f3 }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x00f3 }
            com.ta.utdid2.c.a.d$a r1 = (com.p022ta.utdid2.p026c.p027a.TransactionXMLFile.C1058a) r1     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.mo12972c()     // Catch:{ all -> 0x00f3 }
            if (r2 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            return r1
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            java.io.File r0 = m700a(r10)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x002a
            r10.delete()
            r0.renameTo(r10)
        L_0x002a:
            boolean r0 = r10.exists()
            if (r0 == 0) goto L_0x0033
            r10.canRead()
        L_0x0033:
            boolean r0 = r10.exists()
            r2 = 0
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r10.canRead()
            if (r0 == 0) goto L_0x00d0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ XmlPullParserException -> 0x0087, FileNotFoundException -> 0x007b, IOException -> 0x0073, Exception -> 0x006b }
            r0.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0087, FileNotFoundException -> 0x007b, IOException -> 0x0073, Exception -> 0x006b }
            java.util.HashMap r2 = com.p022ta.utdid2.p026c.p027a.XmlUtils.m725a(r0)     // Catch:{ XmlPullParserException -> 0x0064, FileNotFoundException -> 0x005f, IOException -> 0x005a, Exception -> 0x0055, all -> 0x0051 }
            r0.close()     // Catch:{ XmlPullParserException -> 0x0064, FileNotFoundException -> 0x005f, IOException -> 0x005a, Exception -> 0x0055, all -> 0x0051 }
            r0.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d0
        L_0x0051:
            r10 = move-exception
            r2 = r0
            goto L_0x00ca
        L_0x0055:
            r3 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x0075
        L_0x005f:
            r3 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x007d
        L_0x0064:
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x0088
        L_0x0068:
            r10 = move-exception
            goto L_0x00ca
        L_0x006b:
            r3 = move-exception
            r0 = r2
        L_0x006d:
            r3.printStackTrace()     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x0085
            goto L_0x0082
        L_0x0073:
            r3 = move-exception
            r0 = r2
        L_0x0075:
            r3.printStackTrace()     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x0085
            goto L_0x0082
        L_0x007b:
            r3 = move-exception
            r0 = r2
        L_0x007d:
            r3.printStackTrace()     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x0085
        L_0x0082:
            r2.close()     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r2 = r0
            goto L_0x00d0
        L_0x0087:
            r0 = r2
        L_0x0088:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b2, IOException -> 0x00a8, all -> 0x00a6 }
            r3.<init>(r10)     // Catch:{ FileNotFoundException -> 0x00b2, IOException -> 0x00a8, all -> 0x00a6 }
            int r2 = r3.available()     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x00a2 }
            byte[] r4 = new byte[r2]     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x00a2 }
            r3.read(r4)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x00a2 }
            java.lang.String r5 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x00a2 }
            r6 = 0
            java.lang.String r7 = "UTF-8"
            r5.<init>(r4, r6, r2, r7)     // Catch:{ FileNotFoundException -> 0x00a4, IOException -> 0x00a2 }
        L_0x009e:
            r3.close()     // Catch:{ all -> 0x00bc }
            goto L_0x00bc
        L_0x00a2:
            r2 = move-exception
            goto L_0x00ac
        L_0x00a4:
            r2 = move-exception
            goto L_0x00b6
        L_0x00a6:
            r10 = move-exception
            goto L_0x00c4
        L_0x00a8:
            r3 = move-exception
            r8 = r3
            r3 = r2
            r2 = r8
        L_0x00ac:
            r2.printStackTrace()     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x00bc
            goto L_0x009e
        L_0x00b2:
            r3 = move-exception
            r8 = r3
            r3 = r2
            r2 = r8
        L_0x00b6:
            r2.printStackTrace()     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x00bc
            goto L_0x009e
        L_0x00bc:
            if (r3 == 0) goto L_0x0085
            r3.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0085
        L_0x00c2:
            r10 = move-exception
            r2 = r3
        L_0x00c4:
            if (r2 == 0) goto L_0x00c9
            r2.close()     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            throw r10     // Catch:{ all -> 0x0068 }
        L_0x00ca:
            if (r2 == 0) goto L_0x00cf
            r2.close()     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            throw r10
        L_0x00d0:
            java.lang.Object r3 = f845c
            monitor-enter(r3)
            if (r1 == 0) goto L_0x00d9
            r1.mo12970a((java.util.Map) r2)     // Catch:{ all -> 0x00f0 }
            goto L_0x00ee
        L_0x00d9:
            java.util.HashMap<java.io.File, com.ta.utdid2.c.a.d$a> r0 = r9.f847a     // Catch:{ all -> 0x00f0 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00f0 }
            r1 = r0
            com.ta.utdid2.c.a.d$a r1 = (com.p022ta.utdid2.p026c.p027a.TransactionXMLFile.C1058a) r1     // Catch:{ all -> 0x00f0 }
            if (r1 != 0) goto L_0x00ee
            com.ta.utdid2.c.a.d$a r1 = new com.ta.utdid2.c.a.d$a     // Catch:{ all -> 0x00f0 }
            r1.<init>(r10, r11, r2)     // Catch:{ all -> 0x00f0 }
            java.util.HashMap<java.io.File, com.ta.utdid2.c.a.d$a> r11 = r9.f847a     // Catch:{ all -> 0x00f0 }
            r11.put(r10, r1)     // Catch:{ all -> 0x00f0 }
        L_0x00ee:
            monitor-exit(r3)     // Catch:{ all -> 0x00f0 }
            return r1
        L_0x00f0:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f0 }
            throw r10
        L_0x00f3:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p022ta.utdid2.p026c.p027a.TransactionXMLFile.mo12969a(java.lang.String, int):com.ta.utdid2.c.a.b");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static File m700a(File file) {
        return new File(String.valueOf(file.getPath()) + ".bak");
    }

    /* renamed from: com.ta.utdid2.c.a.d$a */
    /* compiled from: TransactionXMLFile */
    private static final class C1058a implements MySharedPreferences {

        /* renamed from: d */
        private static final Object f849d = new Object();

        /* renamed from: a */
        private WeakHashMap<MySharedPreferences.C1057b, Object> f850a;

        /* renamed from: b */
        private final File f851b;

        /* renamed from: c */
        private final int f852c;

        /* renamed from: c */
        private final File f853c;

        /* renamed from: c */
        private Map f854c;

        /* renamed from: k */
        private boolean f855k = false;

        C1058a(File file, int i, Map map) {
            this.f851b = file;
            this.f853c = TransactionXMLFile.m700a(file);
            this.f852c = i;
            this.f854c = map == null ? new HashMap() : map;
            this.f850a = new WeakHashMap<>();
        }

        /* renamed from: a */
        public boolean m714a() {
            return this.f851b != null && new File(this.f851b.getAbsolutePath()).exists();
        }

        /* renamed from: a */
        public void mo12971a(boolean z) {
            synchronized (this) {
                this.f855k = z;
            }
        }

        /* renamed from: c */
        public boolean mo12972c() {
            boolean z;
            synchronized (this) {
                z = this.f855k;
            }
            return z;
        }

        /* renamed from: a */
        public void mo12970a(Map map) {
            if (map != null) {
                synchronized (this) {
                    this.f854c = map;
                }
            }
        }

        public Map<String, ?> getAll() {
            HashMap hashMap;
            synchronized (this) {
                hashMap = new HashMap(this.f854c);
            }
            return hashMap;
        }

        public String getString(String str, String str2) {
            synchronized (this) {
                String str3 = (String) this.f854c.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            }
            return str2;
        }

        public long getLong(String str, long j) {
            synchronized (this) {
                Long l = (Long) this.f854c.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            }
            return j;
        }

        /* renamed from: com.ta.utdid2.c.a.d$a$a */
        /* compiled from: TransactionXMLFile */
        public final class C1059a implements MySharedPreferences.C1056a {

            /* renamed from: d */
            private final Map<String, Object> f857d = new HashMap();

            /* renamed from: l */
            private boolean f858l = false;

            public C1059a() {
            }

            /* renamed from: a */
            public MySharedPreferences.C1056a mo12960a(String str, String str2) {
                synchronized (this) {
                    this.f857d.put(str, str2);
                }
                return this;
            }

            /* renamed from: a */
            public MySharedPreferences.C1056a mo12958a(String str, int i) {
                synchronized (this) {
                    this.f857d.put(str, Integer.valueOf(i));
                }
                return this;
            }

            /* renamed from: a */
            public MySharedPreferences.C1056a mo12959a(String str, long j) {
                synchronized (this) {
                    this.f857d.put(str, Long.valueOf(j));
                }
                return this;
            }

            /* renamed from: a */
            public MySharedPreferences.C1056a mo12957a(String str, float f) {
                synchronized (this) {
                    this.f857d.put(str, Float.valueOf(f));
                }
                return this;
            }

            /* renamed from: a */
            public MySharedPreferences.C1056a mo12961a(String str, boolean z) {
                synchronized (this) {
                    this.f857d.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            /* renamed from: a */
            public MySharedPreferences.C1056a mo12956a(String str) {
                synchronized (this) {
                    this.f857d.put(str, this);
                }
                return this;
            }

            /* renamed from: b */
            public MySharedPreferences.C1056a mo12962b() {
                synchronized (this) {
                    this.f858l = true;
                }
                return this;
            }

            public boolean commit() {
                boolean z;
                ArrayList arrayList;
                HashSet<MySharedPreferences.C1057b> hashSet;
                boolean a;
                synchronized (TransactionXMLFile.m699a()) {
                    z = C1058a.m707a(C1058a.this).size() > 0;
                    arrayList = null;
                    if (z) {
                        arrayList = new ArrayList();
                        hashSet = new HashSet<>(C1058a.m707a(C1058a.this).keySet());
                    } else {
                        hashSet = null;
                    }
                    synchronized (this) {
                        if (this.f858l) {
                            C1058a.m707a(C1058a.this).clear();
                            this.f858l = false;
                        }
                        for (Map.Entry next : this.f857d.entrySet()) {
                            String str = (String) next.getKey();
                            Object value = next.getValue();
                            if (value == this) {
                                C1058a.m707a(C1058a.this).remove(str);
                            } else {
                                C1058a.m707a(C1058a.this).put(str, value);
                            }
                            if (z) {
                                arrayList.add(str);
                            }
                        }
                        this.f857d.clear();
                    }
                    a = C1058a.m707a(C1058a.this);
                    if (a) {
                        C1058a.this.mo12971a(true);
                    }
                }
                if (z) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str2 = (String) arrayList.get(size);
                        for (MySharedPreferences.C1057b bVar : hashSet) {
                            if (bVar != null) {
                                bVar.mo12964a(C1058a.this, str2);
                            }
                        }
                    }
                }
                return a;
            }
        }

        /* renamed from: a */
        public MySharedPreferences.C1056a mo12952a() {
            return new C1059a();
        }

        /* renamed from: a */
        private FileOutputStream m706a(File file) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            }
            return fileOutputStream;
        }

        /* renamed from: d */
        private boolean m710d() {
            if (this.f851b.exists()) {
                if (this.f853c.exists()) {
                    this.f851b.delete();
                } else if (!this.f851b.renameTo(this.f853c)) {
                    return false;
                }
            }
            try {
                FileOutputStream a = m706a(this.f851b);
                if (a == null) {
                    return false;
                }
                XmlUtils.m729a(this.f854c, (OutputStream) a);
                a.close();
                this.f853c.delete();
                return true;
            } catch (IOException | XmlPullParserException unused) {
                if (this.f851b.exists()) {
                    this.f851b.delete();
                }
                return false;
            }
        }
    }
}
