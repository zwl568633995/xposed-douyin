package com.p028ut.mini.crashhandler;

import java.util.Map;

/* renamed from: com.ut.mini.crashhandler.IUTCrashCaughtListner */
public interface IUTCrashCaughtListner {
    Map<String, String> onCrashCaught(Thread thread, Throwable th);
}
