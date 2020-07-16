package com.p022ta.utdid2.p024b.p025a;

/* renamed from: com.ta.utdid2.b.a.i */
/* compiled from: StringUtils */
public class C1055i {
    /* renamed from: a */
    public static boolean m677a(String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: a */
    public static int m676a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            i = (i * 31) + c;
        }
        return i;
    }
}
