package com.p022ta.utdid2.device;

import android.content.Context;
import com.p022ta.utdid2.p024b.p025a.C1055i;

/* renamed from: com.ta.utdid2.device.UTDevice */
public class UTDevice {
    public static String getUtdid(Context context) {
        Device b = DeviceInfo.m747b(context);
        return (b == null || C1055i.m676a(b.mo12982f())) ? "ffffffffffffffffffffffff" : b.mo12982f();
    }

    public static String getUtdidForUpdate(Context context) {
        String h = UTUtdid.m748a(context).mo12985h();
        return (h == null || C1055i.m676a(h)) ? "ffffffffffffffffffffffff" : h;
    }
}
