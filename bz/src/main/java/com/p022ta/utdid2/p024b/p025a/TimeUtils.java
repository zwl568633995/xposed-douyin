package com.p022ta.utdid2.p024b.p025a;

import android.util.Log;

/* renamed from: com.ta.utdid2.b.a.j */
public class TimeUtils {
    public static final String TAG = TimeUtils.class.getName();

    /* renamed from: a */
    public static boolean m678a(long j, int i) {
        boolean z = (System.currentTimeMillis() - j) / 86400000 < ((long) i);
        if (DebugUtils.f824e) {
            String str = TAG;
            Log.d(str, "isUpToDate: " + z + "; oldTimestamp: " + j + "; currentTimestamp" + System.currentTimeMillis());
        }
        return z;
    }
}
