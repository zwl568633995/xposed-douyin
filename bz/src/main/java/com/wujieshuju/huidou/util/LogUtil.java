package com.wujieshuju.huidou.util;

import android.content.Context;
import android.util.Log;
import com.jiongbull.jlog.IStorage;
import com.jiongbull.jlog.Logger;
import com.jiongbull.jlog.constant.LogLevel;
import com.jiongbull.jlog.util.TimeUtils;
import java.io.File;
import java.util.ArrayList;

public class LogUtil {
    /* access modifiers changed from: private */
    public static Logger sLogger;

    public static void init(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LogLevel.ERROR);
        arrayList.add(LogLevel.WTF);
        arrayList.add(LogLevel.WARN);
        arrayList.add(LogLevel.INFO);
        arrayList.add(LogLevel.DEBUG);
        Logger.Builder writeToFile = Logger.Builder.newBuilder(context, "jlog").setDebug(true).setWriteToFile(true);
        sLogger = writeToFile.setLogDir("BaoZ" + File.separator + "log").setLogPrefix("baoz_huidou").setLogSegment(24).setLogLevelsForFile(arrayList).setZoneOffset(TimeUtils.ZoneOffset.P0800).setTimeFormat("yyyy-MM-dd HH:mm:ss").setPackagedLevel(0).setStorage((IStorage) null).build();
    }

    private static void postLog(Runnable runnable) {
        HandlerUtil.getSecondHandler().post(runnable);
    }

    /* renamed from: d */
    public static void m817d(final String str, final String str2) {
        postLog(new Runnable() {
            public void run() {
                LogUtil.sLogger.mo12511d(str, str2);
            }
        });
    }

    /* renamed from: e */
    public static void m818e(final String str, final String str2) {
        postLog(new Runnable() {
            public void run() {
                LogUtil.sLogger.mo12513e(str, str2);
            }
        });
    }

    /* renamed from: e */
    public static void m820e(final String str, final Throwable th) {
        postLog(new Runnable() {
            public void run() {
                LogUtil.sLogger.mo12515e(str, th, "");
            }
        });
    }

    /* renamed from: e */
    public static void m819e(final String str, final String str2, final Throwable th) {
        postLog(new Runnable() {
            public void run() {
                LogUtil.sLogger.mo12515e(str, th, str2);
            }
        });
    }

    /* renamed from: i */
    public static void m821i(final String str, final String str2) {
        postLog(new Runnable() {
            public void run() {
                LogUtil.sLogger.mo12529i(str, str2);
            }
        });
    }

    /* renamed from: v */
    public static void m822v(final String str, final String str2) {
        postLog(new Runnable() {
            public void run() {
                LogUtil.sLogger.mo12545v(str, str2);
            }
        });
    }

    /* renamed from: w */
    public static void m823w(final String str, final String str2) {
        postLog(new Runnable() {
            public void run() {
                LogUtil.sLogger.mo12547w(str, str2);
            }
        });
    }

    /* renamed from: w */
    public static void m825w(final String str, final Throwable th) {
        postLog(new Runnable() {
            public void run() {
                LogUtil.sLogger.mo12547w(str, Log.getStackTraceString(th));
            }
        });
    }

    /* renamed from: w */
    public static void m824w(final String str, final String str2, final Throwable th) {
        postLog(new Runnable() {
            public void run() {
                Logger access$000 = LogUtil.sLogger;
                String str = str;
                access$000.mo12513e(str, str2 + ", " + Log.getStackTraceString(th));
            }
        });
    }
}
