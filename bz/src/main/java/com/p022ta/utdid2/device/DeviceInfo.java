package com.p022ta.utdid2.device;

import android.content.Context;
import com.p022ta.utdid2.p024b.p025a.C1054g;
import com.p022ta.utdid2.p024b.p025a.C1055i;
import java.util.zip.Adler32;

/* renamed from: com.ta.utdid2.device.b */
public class DeviceInfo {

    /* renamed from: a */
    private static Device f865a = null;

    /* renamed from: e */
    static final Object f866e = new Object();

    /* renamed from: k */
    static String f867k = "d6fc3a4a06adbde89223bvefedc24fecde188aaa9161";

    /* renamed from: a */
    static long m745a(Device aVar) {
        if (aVar == null) {
            return 0;
        }
        String format = String.format("%s%s%s%s%s", new Object[]{aVar.mo12982f(), aVar.getDeviceId(), Long.valueOf(aVar.mo12973a()), aVar.mo12980e(), aVar.mo12978d()});
        if (C1055i.m676a(format)) {
            return 0;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(format.getBytes());
        return adler32.getValue();
    }

    /* renamed from: a */
    private static Device m746a(Context context) {
        if (context == null) {
            return null;
        }
        new Device();
        synchronized (f866e) {
            String value = UTUtdid.m748a(context).getValue();
            if (C1055i.m676a(value)) {
                return null;
            }
            if (value.endsWith("\n")) {
                value = value.substring(0, value.length() - 1);
            }
            Device aVar = new Device();
            long currentTimeMillis = System.currentTimeMillis();
            String a = C1054g.m672a(context);
            String b = C1054g.m673b(context);
            aVar.mo12979d(a);
            aVar.mo12976b(a);
            aVar.mo12975b(currentTimeMillis);
            aVar.mo12977c(b);
            aVar.mo12981e(value);
            aVar.mo12974a(m745a(aVar));
            return aVar;
        }
    }

    /* renamed from: b */
    public static synchronized Device m747b(Context context) {
        synchronized (DeviceInfo.class) {
            if (f865a != null) {
                Device aVar = f865a;
                return aVar;
            } else if (context == null) {
                return null;
            } else {
                Device a = m746a(context);
                f865a = a;
                return a;
            }
        }
    }
}
