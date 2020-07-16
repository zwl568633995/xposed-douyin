package com.p022ta.utdid2.p026c.p027a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.p022ta.utdid2.p024b.p025a.C1055i;
import com.p022ta.utdid2.p026c.p027a.MySharedPreferences;
import java.io.File;
import java.util.Map;

/* renamed from: com.ta.utdid2.c.a.c */
public class PersistentConfiguration {

    /* renamed from: a */
    private SharedPreferences.Editor f834a;

    /* renamed from: a */
    private SharedPreferences f835a;

    /* renamed from: a */
    private MySharedPreferences.C1056a f836a;

    /* renamed from: a */
    private MySharedPreferences f837a;

    /* renamed from: a */
    private TransactionXMLFile f838a;

    /* renamed from: e */
    private String f839e = "";

    /* renamed from: f */
    private String f840f = "";

    /* renamed from: g */
    private boolean f841g = false;

    /* renamed from: h */
    private boolean f842h = false;

    /* renamed from: i */
    private boolean f843i = false;

    /* renamed from: j */
    private boolean f844j;
    private Context mContext;

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PersistentConfiguration(android.content.Context r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            r9.<init>()
            java.lang.String r0 = ""
            r9.f839e = r0
            r9.f840f = r0
            r0 = 0
            r9.f841g = r0
            r9.f842h = r0
            r9.f843i = r0
            r1 = 0
            r9.f835a = r1
            r9.f837a = r1
            r9.f834a = r1
            r9.f836a = r1
            r9.mContext = r1
            r9.f838a = r1
            r9.f844j = r0
            r9.f841g = r13
            r9.f844j = r14
            r9.f839e = r12
            r9.f840f = r11
            r9.mContext = r10
            java.lang.String r13 = "t"
            r2 = 0
            if (r10 == 0) goto L_0x003a
            android.content.SharedPreferences r4 = r10.getSharedPreferences(r12, r0)
            r9.f835a = r4
            long r4 = r4.getLong(r13, r2)
            goto L_0x003b
        L_0x003a:
            r4 = r2
        L_0x003b:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0044:
            boolean r6 = com.p022ta.utdid2.p024b.p025a.C1055i.m676a((java.lang.String) r1)
            if (r6 == 0) goto L_0x004f
            r9.f843i = r0
            r9.f842h = r0
            goto L_0x006e
        L_0x004f:
            java.lang.String r6 = "mounted"
            boolean r6 = r1.equals(r6)
            r7 = 1
            if (r6 == 0) goto L_0x005d
            r9.f843i = r7
            r9.f842h = r7
            goto L_0x006e
        L_0x005d:
            java.lang.String r6 = "mounted_ro"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x006a
            r9.f842h = r7
            r9.f843i = r0
            goto L_0x006e
        L_0x006a:
            r9.f843i = r0
            r9.f842h = r0
        L_0x006e:
            boolean r1 = r9.f842h
            java.lang.String r6 = "t2"
            if (r1 != 0) goto L_0x0078
            boolean r1 = r9.f843i
            if (r1 == 0) goto L_0x0143
        L_0x0078:
            if (r10 == 0) goto L_0x0143
            boolean r1 = com.p022ta.utdid2.p024b.p025a.C1055i.m676a((java.lang.String) r11)
            if (r1 != 0) goto L_0x0143
            com.ta.utdid2.c.a.d r11 = r9.m693a((java.lang.String) r11)
            r9.f838a = r11
            if (r11 == 0) goto L_0x0143
            com.ta.utdid2.c.a.b r11 = r11.mo12969a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x0143 }
            r9.f837a = r11     // Catch:{ Exception -> 0x0143 }
            long r7 = r11.getLong(r13, r2)     // Catch:{ Exception -> 0x0143 }
            if (r14 != 0) goto L_0x00cd
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a9
            android.content.SharedPreferences r10 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            r9.m695a((android.content.SharedPreferences) r10, (com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r11)     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.d r10 = r9.f838a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r10 = r10.mo12969a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x0144 }
            r9.f837a = r10     // Catch:{ Exception -> 0x0144 }
            goto L_0x0144
        L_0x00a9:
            if (r11 >= 0) goto L_0x00ba
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            android.content.SharedPreferences r13 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            r9.m696a((com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r11, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x0144 }
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r12, r0)     // Catch:{ Exception -> 0x0144 }
            r9.f835a = r10     // Catch:{ Exception -> 0x0144 }
            goto L_0x0144
        L_0x00ba:
            if (r11 != 0) goto L_0x0144
            android.content.SharedPreferences r10 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            r9.m695a((android.content.SharedPreferences) r10, (com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r11)     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.d r10 = r9.f838a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r10 = r10.mo12969a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x0144 }
            r9.f837a = r10     // Catch:{ Exception -> 0x0144 }
            goto L_0x0144
        L_0x00cd:
            android.content.SharedPreferences r11 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            long r4 = r11.getLong(r6, r2)     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            long r7 = r11.getLong(r6, r2)     // Catch:{ Exception -> 0x0144 }
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x00f1
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x00f1
            android.content.SharedPreferences r10 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            r9.m695a((android.content.SharedPreferences) r10, (com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r11)     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.d r10 = r9.f838a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r10 = r10.mo12969a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x0144 }
            r9.f837a = r10     // Catch:{ Exception -> 0x0144 }
            goto L_0x0144
        L_0x00f1:
            if (r11 <= 0) goto L_0x0105
            int r13 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0105
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            android.content.SharedPreferences r13 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            r9.m696a((com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r11, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x0144 }
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r12, r0)     // Catch:{ Exception -> 0x0144 }
            r9.f835a = r10     // Catch:{ Exception -> 0x0144 }
            goto L_0x0144
        L_0x0105:
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x011b
            int r14 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x011b
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            android.content.SharedPreferences r13 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            r9.m696a((com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r11, (android.content.SharedPreferences) r13)     // Catch:{ Exception -> 0x0144 }
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r12, r0)     // Catch:{ Exception -> 0x0144 }
            r9.f835a = r10     // Catch:{ Exception -> 0x0144 }
            goto L_0x0144
        L_0x011b:
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0131
            if (r13 <= 0) goto L_0x0131
            android.content.SharedPreferences r10 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            r9.m695a((android.content.SharedPreferences) r10, (com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r11)     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.d r10 = r9.f838a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r10 = r10.mo12969a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x0144 }
            r9.f837a = r10     // Catch:{ Exception -> 0x0144 }
            goto L_0x0144
        L_0x0131:
            if (r11 != 0) goto L_0x0144
            android.content.SharedPreferences r10 = r9.f835a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r11 = r9.f837a     // Catch:{ Exception -> 0x0144 }
            r9.m695a((android.content.SharedPreferences) r10, (com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r11)     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.d r10 = r9.f838a     // Catch:{ Exception -> 0x0144 }
            com.ta.utdid2.c.a.b r10 = r10.mo12969a((java.lang.String) r12, (int) r0)     // Catch:{ Exception -> 0x0144 }
            r9.f837a = r10     // Catch:{ Exception -> 0x0144 }
            goto L_0x0144
        L_0x0143:
            r7 = r2
        L_0x0144:
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0150
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0180
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0180
        L_0x0150:
            long r10 = java.lang.System.currentTimeMillis()
            boolean r12 = r9.f844j
            if (r12 == 0) goto L_0x0162
            if (r12 == 0) goto L_0x0180
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0180
            int r12 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0180
        L_0x0162:
            android.content.SharedPreferences r12 = r9.f835a
            if (r12 == 0) goto L_0x0170
            android.content.SharedPreferences$Editor r12 = r12.edit()
            r12.putLong(r6, r10)
            r12.commit()
        L_0x0170:
            com.ta.utdid2.c.a.b r12 = r9.f837a     // Catch:{ Exception -> 0x0180 }
            if (r12 == 0) goto L_0x0180
            com.ta.utdid2.c.a.b r12 = r9.f837a     // Catch:{ Exception -> 0x0180 }
            com.ta.utdid2.c.a.b$a r12 = r12.mo12952a()     // Catch:{ Exception -> 0x0180 }
            r12.mo12959a((java.lang.String) r6, (long) r10)     // Catch:{ Exception -> 0x0180 }
            r12.commit()     // Catch:{ Exception -> 0x0180 }
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p022ta.utdid2.p026c.p027a.PersistentConfiguration.<init>(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* renamed from: a */
    private TransactionXMLFile m693a(String str) {
        File a = m693a(str);
        if (a == null) {
            return null;
        }
        TransactionXMLFile dVar = new TransactionXMLFile(a.getAbsolutePath());
        this.f838a = dVar;
        return dVar;
    }

    /* renamed from: a */
    private File m694a(String str) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        File file = new File(String.format("%s%s%s", new Object[]{externalStorageDirectory.getAbsolutePath(), File.separator, str}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    private void m695a(SharedPreferences sharedPreferences, MySharedPreferences bVar) {
        MySharedPreferences.C1056a a;
        if (sharedPreferences != null && bVar != null && (a = bVar.mo12952a()) != null) {
            a.mo12962b();
            for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value instanceof String) {
                    a.mo12960a(str, (String) value);
                } else if (value instanceof Integer) {
                    a.mo12958a(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    a.mo12959a(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    a.mo12957a(str, ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    a.mo12961a(str, ((Boolean) value).booleanValue());
                }
            }
            a.commit();
        }
    }

    /* renamed from: a */
    private void m696a(MySharedPreferences bVar, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit;
        if (bVar != null && sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.clear();
            for (Map.Entry next : bVar.getAll().entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value instanceof String) {
                    edit.putString(str, (String) value);
                } else if (value instanceof Integer) {
                    edit.putInt(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    edit.putLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(str, ((Float) value).floatValue());
                } else if (value instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) value).booleanValue());
                }
            }
            edit.commit();
        }
    }

    /* renamed from: b */
    private boolean m697b() {
        MySharedPreferences bVar = this.f837a;
        if (bVar == null) {
            return false;
        }
        boolean a = bVar.mo12952a();
        if (!a) {
            commit();
        }
        return a;
    }

    /* renamed from: c */
    private void m698c() {
        MySharedPreferences bVar;
        SharedPreferences sharedPreferences;
        if (this.f834a == null && (sharedPreferences = this.f835a) != null) {
            this.f834a = sharedPreferences.edit();
        }
        if (this.f843i && this.f836a == null && (bVar = this.f837a) != null) {
            this.f836a = bVar.mo12952a();
        }
        m697b();
    }

    public void putString(String str, String str2) {
        if (!C1055i.m676a(str) && !str.equals("t")) {
            m698c();
            SharedPreferences.Editor editor = this.f834a;
            if (editor != null) {
                editor.putString(str, str2);
            }
            MySharedPreferences.C1056a aVar = this.f836a;
            if (aVar != null) {
                aVar.mo12960a(str, str2);
            }
        }
    }

    public void remove(String str) {
        if (!C1055i.m676a(str) && !str.equals("t")) {
            m698c();
            SharedPreferences.Editor editor = this.f834a;
            if (editor != null) {
                editor.remove(str);
            }
            MySharedPreferences.C1056a aVar = this.f836a;
            if (aVar != null) {
                aVar.mo12956a(str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean commit() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r6.f834a
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r4 = r6.f844j
            if (r4 != 0) goto L_0x0016
            android.content.SharedPreferences r4 = r6.f835a
            if (r4 == 0) goto L_0x0016
            java.lang.String r4 = "t"
            r2.putLong(r4, r0)
        L_0x0016:
            android.content.SharedPreferences$Editor r0 = r6.f834a
            boolean r0 = r0.commit()
            if (r0 != 0) goto L_0x0020
            r0 = r3
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            android.content.SharedPreferences r1 = r6.f835a
            if (r1 == 0) goto L_0x0031
            android.content.Context r1 = r6.mContext
            if (r1 == 0) goto L_0x0031
            java.lang.String r2 = r6.f839e
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            r6.f835a = r1
        L_0x0031:
            r1 = 0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r2 = move-exception
            r2.printStackTrace()
        L_0x003b:
            boolean r2 = com.p022ta.utdid2.p024b.p025a.C1055i.m676a((java.lang.String) r1)
            if (r2 != 0) goto L_0x00a0
            java.lang.String r2 = "mounted"
            boolean r4 = r1.equals(r2)
            if (r4 == 0) goto L_0x0080
            com.ta.utdid2.c.a.b r4 = r6.f837a
            if (r4 != 0) goto L_0x0075
            java.lang.String r4 = r6.f840f
            com.ta.utdid2.c.a.d r4 = r6.m693a((java.lang.String) r4)
            if (r4 == 0) goto L_0x0080
            java.lang.String r5 = r6.f839e
            com.ta.utdid2.c.a.b r4 = r4.mo12969a((java.lang.String) r5, (int) r3)
            r6.f837a = r4
            boolean r5 = r6.f844j
            if (r5 != 0) goto L_0x0067
            android.content.SharedPreferences r5 = r6.f835a
            r6.m695a((android.content.SharedPreferences) r5, (com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r4)
            goto L_0x006c
        L_0x0067:
            android.content.SharedPreferences r5 = r6.f835a
            r6.m696a((com.p022ta.utdid2.p026c.p027a.MySharedPreferences) r4, (android.content.SharedPreferences) r5)
        L_0x006c:
            com.ta.utdid2.c.a.b r4 = r6.f837a
            com.ta.utdid2.c.a.b$a r4 = r4.mo12952a()
            r6.f836a = r4
            goto L_0x0080
        L_0x0075:
            com.ta.utdid2.c.a.b$a r4 = r6.f836a
            if (r4 == 0) goto L_0x0080
            boolean r4 = r4.commit()
            if (r4 != 0) goto L_0x0080
            r0 = r3
        L_0x0080:
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0092
            java.lang.String r2 = "mounted_ro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00a0
            com.ta.utdid2.c.a.b r1 = r6.f837a
            if (r1 == 0) goto L_0x00a0
        L_0x0092:
            com.ta.utdid2.c.a.d r1 = r6.f838a     // Catch:{ Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x00a0
            com.ta.utdid2.c.a.d r1 = r6.f838a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r6.f839e     // Catch:{ Exception -> 0x00a0 }
            com.ta.utdid2.c.a.b r1 = r1.mo12969a((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x00a0 }
            r6.f837a = r1     // Catch:{ Exception -> 0x00a0 }
        L_0x00a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p022ta.utdid2.p026c.p027a.PersistentConfiguration.commit():boolean");
    }

    public String getString(String str) {
        m697b();
        SharedPreferences sharedPreferences = this.f835a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!C1055i.m676a(string)) {
                return string;
            }
        }
        MySharedPreferences bVar = this.f837a;
        if (bVar != null) {
            return bVar.getString(str, "");
        }
        return "";
    }
}
