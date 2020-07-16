package com.jiongbull.jlog.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okio.BufferedSink;
import okio.Okio;

public final class LogUtils {
    private static final String LOG_EXT = ".log";
    private static final int MAX_LOG_LENGTH = 4000;
    private static final String TAG = "log";
    private static final ExecutorService sExecutorService = Executors.newSingleThreadExecutor();

    private LogUtils() {
    }

    public static void log(String str, String str2, String str3) {
        int length = str3.length() / MAX_LOG_LENGTH;
        if (length > 0) {
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + MAX_LOG_LENGTH;
                logSub(str, str2, str3.substring(i2, i3));
                i++;
                i2 = i3;
            }
            logSub(str, str2, str3.substring(i2, str3.length()));
            return;
        }
        logSub(str, str2, str3);
    }

    public static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        int i = lastIndexOf + 1;
        return (lastIndexOf <= 0 || i >= str.length()) ? str : str.substring(i);
    }

    public static String genDirPath(String str) {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + str;
    }

    public static String genFileName(String str, int i, long j) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str + "_";
        }
        String curDate = TimeUtils.getCurDate(j);
        if (i == 24) {
            return str2 + curDate + LOG_EXT;
        }
        return str2 + curDate + "_" + getCurSegment(i, j) + LOG_EXT;
    }

    public static String getCurSegment(int i, long j) {
        int curHour = TimeUtils.getCurHour(j);
        int i2 = curHour - (curHour % i);
        int i3 = i + i2;
        if (i3 == 24) {
            i3 = 0;
        }
        return getDoubleNum(i2) + getDoubleNum(i3);
    }

    public static File[] getLogFiles(File file) {
        return file.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.endsWith(LogUtils.LOG_EXT);
            }
        });
    }

    public static void zipLogs(File file) throws IOException {
        String absolutePath = file.getAbsolutePath();
        int lastIndexOf = absolutePath.lastIndexOf(46);
        if (lastIndexOf != -1) {
            FileUtils.zip(absolutePath, absolutePath.substring(0, lastIndexOf) + FileUtils.ZIP_EXT, true);
        }
    }

    public static File[] filterLogFiles(File[] fileArr, long j, String str, int i) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str + "_";
        }
        String curDate = TimeUtils.getCurDate(j);
        if (i == 24) {
            str3 = str2 + curDate + LOG_EXT;
        } else {
            str3 = str2 + curDate + "_" + getCurSegment(i, j) + LOG_EXT;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            if (file.getName().compareTo(str3) < 0) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    private static String getDoubleNum(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void logSub(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case 86281: goto L_0x0044;
                case 2251950: goto L_0x003a;
                case 2286824: goto L_0x0030;
                case 2656902: goto L_0x0026;
                case 64921139: goto L_0x001c;
                case 66247144: goto L_0x0012;
                case 1069090146: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x004e
        L_0x0008:
            java.lang.String r0 = "VERBOSE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 0
            goto L_0x004f
        L_0x0012:
            java.lang.String r0 = "ERROR"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 5
            goto L_0x004f
        L_0x001c:
            java.lang.String r0 = "DEBUG"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x0026:
            java.lang.String r0 = "WARN"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 4
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "JSON"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 3
            goto L_0x004f
        L_0x003a:
            java.lang.String r0 = "INFO"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 2
            goto L_0x004f
        L_0x0044:
            java.lang.String r0 = "WTF"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 6
            goto L_0x004f
        L_0x004e:
            r1 = -1
        L_0x004f:
            switch(r1) {
                case 0: goto L_0x006b;
                case 1: goto L_0x0067;
                case 2: goto L_0x0063;
                case 3: goto L_0x005f;
                case 4: goto L_0x005b;
                case 5: goto L_0x0057;
                case 6: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x006e
        L_0x0053:
            android.util.Log.wtf(r2, r3)
            goto L_0x006e
        L_0x0057:
            android.util.Log.e(r2, r3)
            goto L_0x006e
        L_0x005b:
            android.util.Log.w(r2, r3)
            goto L_0x006e
        L_0x005f:
            android.util.Log.i(r2, r3)
            goto L_0x006e
        L_0x0063:
            android.util.Log.i(r2, r3)
            goto L_0x006e
        L_0x0067:
            android.util.Log.d(r2, r3)
            goto L_0x006e
        L_0x006b:
            android.util.Log.v(r2, r3)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jiongbull.jlog.util.LogUtils.logSub(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void write(final Context context, final String str, final String str2, final String str3) {
        sExecutorService.execute(new Runnable() {
            public void run() {
                String str = str + File.separator + str2;
                BufferedSink bufferedSink = null;
                try {
                    if (FileUtils.createDir(str)) {
                        String str2 = str3;
                        if (!FileUtils.isExist(str + File.separator + str2)) {
                            str2 = LogUtils.genInfo(context) + str2;
                        }
                        bufferedSink = Okio.buffer(Okio.appendingSink(new File(str)));
                        bufferedSink.writeUtf8(str2);
                    }
                } catch (IOException e) {
                    Log.e(LogUtils.TAG, "写日志异常", e);
                } catch (Throwable th) {
                    IOUtils.closeQuietly((Closeable) null);
                    throw th;
                }
                IOUtils.closeQuietly(bufferedSink);
            }
        });
    }

    /* access modifiers changed from: private */
    public static String genInfo(Context context) {
        String lineSeparator = SysUtils.getLineSeparator();
        return (((((((("" + "应用版本名: " + SysUtils.getAppVersionName(context) + lineSeparator) + "应用版本号: " + SysUtils.getAppVersionCode(context) + lineSeparator) + "OS版本名: " + SysUtils.getOsVersionName() + lineSeparator) + "OS版本号: " + SysUtils.getOsVersionCode() + lineSeparator) + "OS显示名: " + SysUtils.getOsVersionDisplayName() + lineSeparator) + "品牌信息: " + SysUtils.getBrandInfo() + lineSeparator) + "产品信息: " + SysUtils.getProductInfo() + lineSeparator) + "设备信息: " + SysUtils.getModelInfo() + lineSeparator) + "制造商信息: " + SysUtils.getManufacturerInfo() + lineSeparator + lineSeparator + lineSeparator;
    }
}
