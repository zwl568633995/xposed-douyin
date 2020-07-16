package com.p028ut.mini;

import com.p028ut.mini.core.sign.IUTRequestAuthentication;
import com.p028ut.mini.crashhandler.IUTCrashCaughtListner;

/* renamed from: com.ut.mini.IUTApplication */
public interface IUTApplication {
    String getUTAppVersion();

    String getUTChannel();

    IUTCrashCaughtListner getUTCrashCraughtListener();

    IUTRequestAuthentication getUTRequestAuthInstance();

    boolean isAliyunOsSystem();

    boolean isUTCrashHandlerDisable();

    boolean isUTLogEnable();
}
