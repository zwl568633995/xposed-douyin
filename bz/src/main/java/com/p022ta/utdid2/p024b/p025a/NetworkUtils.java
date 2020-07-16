package com.p022ta.utdid2.p024b.p025a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* renamed from: com.ta.utdid2.b.a.f */
public class NetworkUtils {

    /* renamed from: a */
    private static ConnectivityManager f825a;

    /* renamed from: d */
    private static final int[] f826d = {4, 7, 2, 1};

    /* renamed from: a */
    public static boolean m670a(Context context) {
        ConnectivityManager a = m669a(context);
        if (a != null) {
            try {
                NetworkInfo activeNetworkInfo = a.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
                return false;
            } catch (Exception e) {
                Log.e("NetworkUtils", e.toString());
                return false;
            }
        } else {
            Log.e("NetworkUtils", "connManager is null!");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m671b(Context context) {
        ConnectivityManager a = m669a(context);
        if (a != null) {
            try {
                NetworkInfo activeNetworkInfo = a.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    int subtype = activeNetworkInfo.getSubtype();
                    if (DebugUtils.f824e) {
                        Log.d("NetworkUtils", "subType:" + subtype + ": name:" + activeNetworkInfo.getSubtypeName());
                    }
                    for (int i : f826d) {
                        if (i == subtype) {
                            return true;
                        }
                    }
                } else {
                    Log.e("NetworkUtils", "networkInfo is null!");
                }
            } catch (Exception e) {
                Log.e("NetworkUtils", e.toString());
            }
        } else {
            Log.e("NetworkUtils", "connManager is null!");
        }
        return false;
    }

    /* renamed from: a */
    public static ConnectivityManager m669a(Context context) {
        if (context == null) {
            Log.e("NetworkUtils", "context is null!");
            return null;
        }
        if (f825a == null) {
            f825a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        return f825a;
    }
}
