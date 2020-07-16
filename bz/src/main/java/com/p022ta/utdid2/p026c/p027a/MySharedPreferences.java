package com.p022ta.utdid2.p026c.p027a;

import java.util.Map;

/* renamed from: com.ta.utdid2.c.a.b */
public interface MySharedPreferences {

    /* renamed from: com.ta.utdid2.c.a.b$a */
    /* compiled from: MySharedPreferences */
    public interface C1056a {
        /* renamed from: a */
        C1056a mo12956a(String str);

        /* renamed from: a */
        C1056a mo12957a(String str, float f);

        /* renamed from: a */
        C1056a mo12958a(String str, int i);

        /* renamed from: a */
        C1056a mo12959a(String str, long j);

        /* renamed from: a */
        C1056a mo12960a(String str, String str2);

        /* renamed from: a */
        C1056a mo12961a(String str, boolean z);

        /* renamed from: b */
        C1056a mo12962b();

        boolean commit();
    }

    /* renamed from: com.ta.utdid2.c.a.b$b */
    /* compiled from: MySharedPreferences */
    public interface C1057b {
        /* renamed from: a */
        void mo12964a(MySharedPreferences bVar, String str);
    }

    /* renamed from: a */
    C1056a mo12952a();

    /* renamed from: a */
    boolean m684a();

    Map<String, ?> getAll();

    long getLong(String str, long j);

    String getString(String str, String str2);
}
