package com.p022ta.utdid2.p024b.p025a;

import java.lang.reflect.Method;

/* renamed from: com.ta.utdid2.b.a.d */
public class DebugUtils {

    /* renamed from: a */
    private static Class<?> f821a = null;

    /* renamed from: a */
    private static Method f822a = null;

    /* renamed from: b */
    private static Method f823b = null;

    /* renamed from: e */
    public static boolean f824e;

    public static int getInt(String str, int i) {
        m668a();
        try {
            return ((Integer) f823b.invoke(f821a, new Object[]{str, Integer.valueOf(i)})).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    static {
        boolean z = false;
        if (getInt("alidebug", 0) == 1) {
            z = true;
        }
        f824e = z;
    }

    /* renamed from: a */
    private static void m668a() {
        try {
            if (f821a == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                f821a = cls;
                f822a = cls.getDeclaredMethod("get", new Class[]{String.class});
                f823b = f821a.getDeclaredMethod("getInt", new Class[]{String.class, Integer.TYPE});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
