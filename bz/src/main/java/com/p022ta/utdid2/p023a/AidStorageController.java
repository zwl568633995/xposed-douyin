package com.p022ta.utdid2.p023a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.p022ta.utdid2.p024b.p025a.Base64Helper;
import com.p022ta.utdid2.p024b.p025a.C1049b;
import com.p022ta.utdid2.p024b.p025a.C1055i;
import com.p022ta.utdid2.p024b.p025a.DebugUtils;
import com.p022ta.utdid2.p024b.p025a.SharedPreferenceHelper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ta.utdid2.a.c */
public class AidStorageController {
    private static final String TAG = AidStorageController.class.getName();

    /* renamed from: a */
    private static Map<String, String> f803a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Map<String, Long> f804b = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m656a(Context context, String str, String str2, String str3) {
        if (context == null) {
            Log.e(TAG, "no context!");
            return;
        }
        String c = m657c(str, str3);
        long currentTimeMillis = System.currentTimeMillis();
        f803a.put(c, str2);
        f804b.put(c, Long.valueOf(currentTimeMillis));
        SharedPreferences sharedPreferences = context.getSharedPreferences("OfJbkLdFbPOMbGyP", 0);
        if (Build.VERSION.SDK_INT >= 9) {
            SharedPreferenceHelper.m675a(sharedPreferences.edit().putString("EvQwnbilKezpOJey".concat(c), str2));
            SharedPreferenceHelper.m675a(sharedPreferences.edit().putLong("rKrMJgyAEbVtSQGi".concat(c), currentTimeMillis));
            return;
        }
        sharedPreferences.edit().putString("EvQwnbilKezpOJey".concat(c), str2).commit();
        sharedPreferences.edit().putLong("rKrMJgyAEbVtSQGi".concat(c), currentTimeMillis).commit();
    }

    /* renamed from: a */
    public static String m655a(Context context, String str, String str2) {
        if (context == null) {
            Log.e(TAG, "no context!");
            return "";
        }
        String c = m657c(str, str2);
        String str3 = f803a.get(c);
        if (DebugUtils.f824e) {
            String str4 = TAG;
            Log.d(str4, "cache AID:" + str3);
        }
        if (!C1055i.m676a(str3)) {
            return str3;
        }
        String string = context.getSharedPreferences("OfJbkLdFbPOMbGyP", 0).getString("EvQwnbilKezpOJey".concat(c), "");
        f803a.put(c, string);
        return string;
    }

    /* renamed from: a */
    public static long m654a(Context context, String str, String str2) {
        if (context == null) {
            Log.e(TAG, "no context!");
            return 0;
        }
        String c = m657c(str, str2);
        Long valueOf = Long.valueOf(f804b.containsKey(c) ? f804b.get(c).longValue() : 0);
        if (DebugUtils.f824e) {
            String str3 = TAG;
            Log.d(str3, "cache AIDGenTime:" + valueOf);
        }
        if (valueOf.longValue() == 0) {
            valueOf = Long.valueOf(context.getSharedPreferences("OfJbkLdFbPOMbGyP", 0).getLong("rKrMJgyAEbVtSQGi".concat(c), 0));
            f804b.put(c, valueOf);
        }
        return valueOf.longValue();
    }

    /* renamed from: c */
    private static String m657c(String str, String str2) {
        String str3;
        if (Build.VERSION.SDK_INT >= 8) {
            str3 = Base64Helper.encodeToString(str.concat(str2).getBytes(), 2);
        } else {
            str3 = C1049b.encodeToString(str.concat(str2).getBytes(), 2);
        }
        if (DebugUtils.f824e) {
            String str4 = TAG;
            Log.d(str4, "encodedName:" + str3);
        }
        return str3;
    }
}
