package com.p022ta.utdid2.p023a;

import android.content.Context;
import android.util.Log;
import androidx.core.view.PointerIconCompat;
import com.p022ta.utdid2.p024b.p025a.C1055i;
import com.p022ta.utdid2.p024b.p025a.NetworkUtils;
import com.p022ta.utdid2.p024b.p025a.TimeUtils;
import com.p028ut.device.AidCallback;

/* renamed from: com.ta.utdid2.a.a */
public class AidManager {
    private static final String TAG = AidManager.class.getName();

    /* renamed from: a */
    private static AidManager f793a;
    private Context mContext;

    /* renamed from: a */
    public static synchronized AidManager m640a(Context context) {
        AidManager aVar;
        synchronized (AidManager.class) {
            if (f793a == null) {
                f793a = new AidManager(context);
            }
            aVar = f793a;
        }
        return aVar;
    }

    private AidManager(Context context) {
        this.mContext = context;
    }

    /* renamed from: a */
    public void mo12920a(String str, String str2, String str3, AidCallback aVar) {
        if (aVar == null) {
            Log.e(TAG, "callback is null!");
        } else if (this.mContext == null || C1055i.m676a(str) || C1055i.m676a(str2)) {
            String str4 = TAG;
            StringBuilder sb = new StringBuilder("mContext:");
            sb.append(this.mContext);
            sb.append("; callback:");
            sb.append(aVar);
            sb.append("; has appName:");
            sb.append(!C1055i.m676a(str));
            sb.append("; has token:");
            sb.append(!C1055i.m676a(str2));
            Log.e(str4, sb.toString());
            aVar.mo12991a(PointerIconCompat.TYPE_HAND, "");
        } else {
            String a = AidStorageController.m654a(this.mContext, str, str2);
            if (!C1055i.m676a(a) && TimeUtils.m678a(AidStorageController.m654a(this.mContext, str, str2), 1)) {
                aVar.mo12991a(PointerIconCompat.TYPE_CONTEXT_MENU, a);
            } else if (NetworkUtils.m669a(this.mContext)) {
                AidRequester.m645a(this.mContext).mo12922a(str, str2, str3, a, aVar);
            } else {
                aVar.mo12991a(PointerIconCompat.TYPE_HELP, a);
            }
        }
    }

    /* renamed from: a */
    public String mo12919a(String str, String str2, String str3) {
        if (this.mContext == null || C1055i.m676a(str) || C1055i.m676a(str2)) {
            String str4 = TAG;
            StringBuilder sb = new StringBuilder("mContext:");
            sb.append(this.mContext);
            sb.append("; has appName:");
            sb.append(!C1055i.m676a(str));
            sb.append("; has token:");
            sb.append(!C1055i.m676a(str2));
            Log.e(str4, sb.toString());
            return "";
        }
        String a = AidStorageController.m654a(this.mContext, str, str2);
        if ((C1055i.m676a(a) || !TimeUtils.m678a(AidStorageController.m654a(this.mContext, str, str2), 1)) && NetworkUtils.m669a(this.mContext)) {
            return m641b(str, str2, str3);
        }
        return a;
    }

    /* renamed from: b */
    private synchronized String m641b(String str, String str2, String str3) {
        if (this.mContext == null) {
            Log.e(TAG, "no context!");
            return "";
        }
        String str4 = "";
        if (NetworkUtils.m669a(this.mContext)) {
            str4 = AidRequester.m645a(this.mContext).mo12921a(str, str2, str3, AidStorageController.m654a(this.mContext, str, str2));
        }
        AidStorageController.m656a(this.mContext, str, str4, str2);
        return str4;
    }
}
