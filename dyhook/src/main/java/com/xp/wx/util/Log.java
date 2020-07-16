package com.xp.wx.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.jiongbull.jlog.IStorage;
import com.jiongbull.jlog.Logger;
import com.jiongbull.jlog.constant.LogLevel;
import com.jiongbull.jlog.util.LogUtils;
import com.jiongbull.jlog.util.TimeUtils;
import com.xp.wx.GlobalConst;
import external.org.apache.commons.lang3.ArrayUtils;
import java.io.File;
import java.util.ArrayList;

public class Log {
    public static String LOG_DIR = "";
    public static final String LOG_PRE_FIX = "baoz";
    public static final String LOG_ROOT_DIR = ("BaoZ" + File.separator + "log");
    public static final String UPLOAD_LOG = "#@log*#!!!";
    private static Handler sHandler = HandlerUtil.createNewHandler("jlog");
    private static Logger sLogger;

    private static void postLog(Runnable runnable) {
        sHandler.post(runnable);
    }

    public static void init(Context context) {
        LOG_DIR = LOG_ROOT_DIR + File.separator + context.getPackageName();
        ArrayList arrayList = new ArrayList();
        arrayList.add(LogLevel.ERROR);
        arrayList.add(LogLevel.WTF);
        arrayList.add(LogLevel.WARN);
        arrayList.add(LogLevel.INFO);
        arrayList.add(LogLevel.DEBUG);
        sLogger = Logger.Builder.newBuilder(context, "jlog").setDebug(true).setWriteToFile(true).setLogDir(LOG_DIR).setLogPrefix(LOG_PRE_FIX).setLogSegment(24).setLogLevelsForFile(arrayList).setZoneOffset(TimeUtils.ZoneOffset.P0800).setTimeFormat("yyyy-MM-dd HH:mm:ss").setPackagedLevel(0).setStorage((IStorage) null).build();
    }

    public static ArrayList<String> getLogPath(String str) {
        if (TextUtils.isEmpty(str)) {
            str = TimeUtils.getCurDate(TimeUtils.ZoneOffset.P0800);
        }
        File[] fileArr = (File[]) ArrayUtils.addAll(LogUtils.getLogFiles(new File(LogUtils.genDirPath(LOG_DIR))), LogUtils.getLogFiles(new File(LogUtils.genDirPath(LOG_ROOT_DIR))));
        ArrayList<String> arrayList = new ArrayList<>();
        if (fileArr != null && fileArr.length > 0) {
            for (File file : fileArr) {
                if (file.getName().contains(str)) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        }
        return arrayList;
    }

    public static void clearLog(int i) {
        boolean z;
        debug("clearLog " + i);
        long curMillis = TimeUtils.getCurMillis(TimeUtils.ZoneOffset.P0800);
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = TimeUtils.format(curMillis - (86400000 * ((long) i2)), "yyyy-MM-dd");
        }
        File[] fileArr = (File[]) ArrayUtils.addAll(LogUtils.getLogFiles(new File(LogUtils.genDirPath(LOG_DIR))), LogUtils.getLogFiles(new File(LogUtils.genDirPath(LOG_ROOT_DIR))));
        if (fileArr != null && fileArr.length > 0) {
            for (File file : fileArr) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i) {
                        z = true;
                        break;
                    }
                    if (file.getName().contains(strArr[i3])) {
                        z = false;
                        break;
                    }
                    i3++;
                }
                if (z) {
                    debug("clearLog delete file  " + file.getName());
                    file.delete();
                }
            }
        }
    }

    public static void verbose(String str, String str2) {
        if (sLogger != null) {
            postLog(new Runnable(str, str2) {
                private final /* synthetic */ String f$0;
                private final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    Log.sLogger.v(this.f$0, this.f$1);
                }
            });
        }
    }

    public static void verbose(String str) {
        if (sLogger != null) {
            postLog(new Runnable(str) {
                private final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    Log.sLogger.v(GlobalConst.TAG, this.f$0);
                }
            });
        }
    }

    public static void debug(String str, String str2) {
        if (sLogger != null) {
            postLog(new Runnable(str, str2) {
                private final /* synthetic */ String f$0;
                private final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    Log.sLogger.d(this.f$0, this.f$1);
                }
            });
        }
    }

    public static void debug(String str) {
        if (sLogger != null) {
            postLog(new Runnable(str) {
                private final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    Log.sLogger.d(GlobalConst.TAG, this.f$0);
                }
            });
        }
    }

    public static void info(String str, String str2) {
        if (sLogger != null) {
            postLog(new Runnable(str, str2) {
                private final /* synthetic */ String f$0;
                private final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    Log.sLogger.i(this.f$0, this.f$1);
                }
            });
        }
    }

    public static void info(String str) {
        if (sLogger != null) {
            postLog(new Runnable(str) {
                private final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    Log.sLogger.i(GlobalConst.TAG, this.f$0);
                }
            });
        }
    }

    public static void warn(String str, String str2) {
        if (sLogger != null) {
            postLog(new Runnable(str, str2) {
                private final /* synthetic */ String f$0;
                private final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    Log.sLogger.w(this.f$0, this.f$1);
                }
            });
        }
    }

    public static void warn(String str) {
        if (sLogger != null) {
            postLog(new Runnable(str) {
                private final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    Log.sLogger.w(GlobalConst.TAG, this.f$0);
                }
            });
        }
    }

    public static void warn(String str, Throwable th) {
        if (sLogger != null) {
            postLog(new Runnable(str, th) {
                private final /* synthetic */ String f$0;
                private final /* synthetic */ Throwable f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    Log.sLogger.w(this.f$0, Log.getStackTraceString(this.f$1));
                }
            });
        }
    }

    public static void warn(Throwable th) {
        if (sLogger != null) {
            postLog(new Runnable(th) {
                private final /* synthetic */ Throwable f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    Log.sLogger.w(GlobalConst.TAG, Log.getStackTraceString(this.f$0));
                }
            });
        }
    }

    public static void error(String str, String str2) {
        if (sLogger != null) {
            postLog(new Runnable(str, str2) {
                private final /* synthetic */ String f$0;
                private final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    Log.sLogger.e(this.f$0, this.f$1);
                }
            });
        }
    }

    public static void error(Throwable th) {
        if (sLogger != null) {
            postLog(new Runnable(th) {
                private final /* synthetic */ Throwable f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    Log.sLogger.e(GlobalConst.TAG, this.f$0, "");
                }
            });
        }
    }

    public static void error(String str) {
        if (sLogger != null) {
            postLog(new Runnable(str) {
                private final /* synthetic */ String f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    Log.sLogger.e(GlobalConst.TAG, this.f$0);
                }
            });
        }
    }
}
