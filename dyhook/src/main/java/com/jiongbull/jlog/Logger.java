package com.jiongbull.jlog;

import android.content.Context;
import com.jiongbull.jlog.constant.LogLevel;
import com.jiongbull.jlog.printer.DefaultPrinter;
import com.jiongbull.jlog.printer.JsonPrinter;
import com.jiongbull.jlog.util.LogUtils;
import com.jiongbull.jlog.util.TimeUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static final String LOG_CLASS_NAME = Logger.class.getName();
    private static final String LOG_PRINT_METHOD_NAME = "printLog";
    private final Context mContext;
    private boolean mDebug;
    private final DefaultPrinter mDefaultPrinter;
    private final JsonPrinter mJsonPrinter;
    private String mLogDir;
    private List<String> mLogLevelsForFile;
    private String mLogPrefix;
    private int mLogSegment;
    private String mName;
    private int mPackagedLevel;
    private IStorage mStorage;
    private String mTimeFormat;
    private boolean mWriteToFile;
    private long mZoneOffset;

    private Logger(Builder builder) {
        this.mContext = builder.mContext;
        this.mName = builder.mName;
        this.mDebug = builder.mDebug;
        this.mWriteToFile = builder.mWriteToFile;
        this.mLogDir = builder.mLogDir;
        this.mLogPrefix = builder.mLogPrefix;
        this.mLogSegment = builder.mLogSegment;
        this.mLogLevelsForFile = builder.mLogLevelsForFile;
        this.mZoneOffset = builder.mZoneOffset;
        this.mTimeFormat = builder.mTimeFormat;
        this.mPackagedLevel = builder.mPackagedLevel;
        this.mStorage = builder.mStorage;
        this.mDefaultPrinter = new DefaultPrinter();
        this.mJsonPrinter = new JsonPrinter();
    }

    public void v(String str, String str2) {
        printLog(LogLevel.VERBOSE, str, (Throwable) null, str2);
    }

    public void v(String str) {
        printLog(LogLevel.VERBOSE, (String) null, (Throwable) null, str);
    }

    public void d(String str, String str2) {
        printLog(LogLevel.DEBUG, str, (Throwable) null, str2);
    }

    public void d(String str) {
        printLog(LogLevel.DEBUG, (String) null, (Throwable) null, str);
    }

    public void i(String str, String str2) {
        printLog(LogLevel.INFO, str, (Throwable) null, str2);
    }

    public void i(String str) {
        printLog(LogLevel.INFO, (String) null, (Throwable) null, str);
    }

    public void json(String str, String str2) {
        printLog(LogLevel.JSON, str, (Throwable) null, str2);
    }

    public void json(String str) {
        printLog(LogLevel.JSON, (String) null, (Throwable) null, str);
    }

    public void w(String str, String str2) {
        printLog(LogLevel.WARN, str, (Throwable) null, str2);
    }

    public void w(String str) {
        printLog(LogLevel.WARN, (String) null, (Throwable) null, str);
    }

    public void e(String str, Throwable th, String str2) {
        printLog(LogLevel.ERROR, str, th, str2);
    }

    public void e(Throwable th, String str) {
        printLog(LogLevel.ERROR, (String) null, th, str);
    }

    public void e(String str, String str2) {
        printLog(LogLevel.ERROR, str, (Throwable) null, str2);
    }

    public void e(String str) {
        printLog(LogLevel.ERROR, (String) null, (Throwable) null, str);
    }

    public void e(String str, Throwable th) {
        printLog(LogLevel.ERROR, str, th, (String) null);
    }

    public void e(Throwable th) {
        printLog(LogLevel.ERROR, (String) null, th, (String) null);
    }

    public void wtf(String str, Throwable th, String str2) {
        printLog(LogLevel.WTF, str, th, str2);
    }

    public void wtf(Throwable th, String str) {
        printLog(LogLevel.WTF, (String) null, th, str);
    }

    public void wtf(String str, String str2) {
        printLog(LogLevel.WTF, str, (Throwable) null, str2);
    }

    public void wtf(String str) {
        printLog(LogLevel.WTF, (String) null, (Throwable) null, str);
    }

    public void wtf(String str, Throwable th) {
        printLog(LogLevel.WTF, str, th, (String) null);
    }

    public void wtf(Throwable th) {
        printLog(LogLevel.WTF, (String) null, th, (String) null);
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getName() {
        return this.mName;
    }

    public boolean isDebug() {
        return this.mDebug;
    }

    public void setDebug(boolean z) {
        this.mDebug = z;
    }

    public boolean isWriteToFile() {
        return this.mWriteToFile;
    }

    public void setWriteToFile(boolean z) {
        this.mWriteToFile = z;
    }

    public String getLogDir() {
        return this.mLogDir;
    }

    public void setLogDir(String str) {
        this.mLogDir = str;
    }

    public String getLogPrefix() {
        return this.mLogPrefix;
    }

    public void setLogPrefix(String str) {
        this.mLogPrefix = str;
    }

    public int getLogSegment() {
        return this.mLogSegment;
    }

    public void setLogSegment(int i) {
        this.mLogSegment = i;
    }

    public List<String> getLogLevelsForFile() {
        return this.mLogLevelsForFile;
    }

    public void setLogLevelsForFile(List<String> list) {
        this.mLogLevelsForFile = list;
    }

    public long getZoneOffset() {
        return this.mZoneOffset;
    }

    public void setZoneOffset(long j) {
        this.mZoneOffset = j;
    }

    public String getTimeFormat() {
        return this.mTimeFormat;
    }

    public void setTimeFormat(String str) {
        this.mTimeFormat = str;
    }

    public int getPackagedLevel() {
        return this.mPackagedLevel;
    }

    public void setPackagedLevel(int i) {
        this.mPackagedLevel = i;
    }

    public IStorage getStorage() {
        return this.mStorage;
    }

    public void setStorage(IStorage iStorage) {
        this.mStorage = iStorage;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        if (r15.equals(com.jiongbull.jlog.constant.LogLevel.DEBUG) != false) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void printLog(java.lang.String r15, java.lang.String r16, java.lang.Throwable r17, java.lang.String r18) {
        /*
            r14 = this;
            r0 = r14
            r3 = r15
            r4 = r16
            r1 = r17
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            r5 = 0
            if (r2 == 0) goto L_0x000f
            r2 = r5
            goto L_0x0011
        L_0x000f:
            r2 = r18
        L_0x0011:
            if (r2 != 0) goto L_0x001b
            if (r1 != 0) goto L_0x0016
            return
        L_0x0016:
            java.lang.String r1 = android.util.Log.getStackTraceString(r17)
            goto L_0x0035
        L_0x001b:
            if (r1 == 0) goto L_0x0037
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = com.jiongbull.jlog.printer.Printer.LINE_SEPARATOR
            r6.append(r2)
            java.lang.String r1 = r14.getStackTraceString(r1)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
        L_0x0035:
            r6 = r1
            goto L_0x0038
        L_0x0037:
            r6 = r2
        L_0x0038:
            boolean r1 = r0.mDebug
            boolean r2 = r0.mWriteToFile
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x004a
            java.util.List<java.lang.String> r2 = r0.mLogLevelsForFile
            boolean r2 = r2.contains(r15)
            if (r2 == 0) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r9 = -1
            int r10 = r15.hashCode()
            switch(r10) {
                case 86281: goto L_0x008f;
                case 2251950: goto L_0x0085;
                case 2286824: goto L_0x007b;
                case 2656902: goto L_0x0071;
                case 64921139: goto L_0x0068;
                case 66247144: goto L_0x005e;
                case 1069090146: goto L_0x0054;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0099
        L_0x0054:
            java.lang.String r7 = "VERBOSE"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0099
            r7 = 0
            goto L_0x009a
        L_0x005e:
            java.lang.String r7 = "ERROR"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0099
            r7 = 4
            goto L_0x009a
        L_0x0068:
            java.lang.String r8 = "DEBUG"
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0071:
            java.lang.String r7 = "WARN"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0099
            r7 = 3
            goto L_0x009a
        L_0x007b:
            java.lang.String r7 = "JSON"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0099
            r7 = 6
            goto L_0x009a
        L_0x0085:
            java.lang.String r7 = "INFO"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0099
            r7 = 2
            goto L_0x009a
        L_0x008f:
            java.lang.String r7 = "WTF"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0099
            r7 = 5
            goto L_0x009a
        L_0x0099:
            r7 = -1
        L_0x009a:
            switch(r7) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00c4;
                case 6: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00e9
        L_0x009e:
            if (r1 == 0) goto L_0x00a5
            com.jiongbull.jlog.printer.JsonPrinter r1 = r0.mJsonPrinter
            r1.printConsole(r15, r4, r6, r5)
        L_0x00a5:
            if (r2 == 0) goto L_0x00e9
            com.jiongbull.jlog.printer.JsonPrinter r1 = r0.mJsonPrinter
            android.content.Context r2 = r0.mContext
            r7 = 0
            long r8 = r0.mZoneOffset
            java.lang.String r10 = r0.mTimeFormat
            java.lang.String r11 = r0.mLogDir
            java.lang.String r12 = r0.mLogPrefix
            int r13 = r0.mLogSegment
            r3 = r15
            r4 = r16
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r1.printFile(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            goto L_0x00e9
        L_0x00c4:
            if (r1 == 0) goto L_0x00cb
            com.jiongbull.jlog.printer.DefaultPrinter r1 = r0.mDefaultPrinter
            r1.printConsole(r15, r4, r6, r5)
        L_0x00cb:
            if (r2 == 0) goto L_0x00e9
            com.jiongbull.jlog.printer.DefaultPrinter r1 = r0.mDefaultPrinter
            android.content.Context r2 = r0.mContext
            r7 = 0
            long r8 = r0.mZoneOffset
            java.lang.String r10 = r0.mTimeFormat
            java.lang.String r11 = r0.mLogDir
            java.lang.String r12 = r0.mLogPrefix
            int r13 = r0.mLogSegment
            r3 = r15
            r4 = r16
            r5 = r6
            r6 = r7
            r7 = r8
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r1.printFile(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jiongbull.jlog.Logger.printLog(java.lang.String, java.lang.String, java.lang.Throwable, java.lang.String):void");
    }

    private String getTag(StackTraceElement stackTraceElement) {
        return LogUtils.getSimpleClassName(stackTraceElement.getClassName());
    }

    private int getStackIndex(StackTraceElement[] stackTraceElementArr) {
        int i;
        boolean z = false;
        for (int i2 = 0; i2 < stackTraceElementArr.length; i2++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            if (LOG_CLASS_NAME.equals(stackTraceElement.getClassName()) && LOG_PRINT_METHOD_NAME.equals(stackTraceElement.getMethodName())) {
                z = true;
            }
            if (z && (i = i2 + 2 + this.mPackagedLevel) < stackTraceElementArr.length) {
                return i;
            }
        }
        return -1;
    }

    private String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public final Context mContext;
        /* access modifiers changed from: private */
        public boolean mDebug = true;
        /* access modifiers changed from: private */
        public String mLogDir = "jlog";
        /* access modifiers changed from: private */
        public List<String> mLogLevelsForFile;
        /* access modifiers changed from: private */
        public String mLogPrefix = "";
        /* access modifiers changed from: private */
        public int mLogSegment = 24;
        /* access modifiers changed from: private */
        public String mName;
        /* access modifiers changed from: private */
        public int mPackagedLevel;
        /* access modifiers changed from: private */
        public IStorage mStorage;
        /* access modifiers changed from: private */
        public String mTimeFormat;
        /* access modifiers changed from: private */
        public boolean mWriteToFile = false;
        /* access modifiers changed from: private */
        public long mZoneOffset;

        private Builder(Context context, String str) {
            this.mContext = context;
            this.mName = str;
            ArrayList arrayList = new ArrayList();
            this.mLogLevelsForFile = arrayList;
            arrayList.add(LogLevel.ERROR);
            this.mLogLevelsForFile.add(LogLevel.WTF);
            this.mZoneOffset = TimeUtils.ZoneOffset.P0800;
            this.mTimeFormat = "yyyy-MM-dd HH:mm:ss";
            this.mPackagedLevel = 0;
        }

        public static Builder newBuilder(Context context, String str) {
            return new Builder(context, str);
        }

        public Builder setDebug(boolean z) {
            this.mDebug = z;
            return this;
        }

        public Builder setTimeFormat(String str) {
            this.mTimeFormat = str;
            return this;
        }

        public Builder setZoneOffset(long j) {
            this.mZoneOffset = j;
            return this;
        }

        public Builder setLogDir(String str) {
            this.mLogDir = str;
            return this;
        }

        public Builder setLogPrefix(String str) {
            this.mLogPrefix = str;
            return this;
        }

        public Builder setLogSegment(int i) {
            this.mLogSegment = i;
            return this;
        }

        public Builder setWriteToFile(boolean z) {
            this.mWriteToFile = z;
            return this;
        }

        public Builder setLogLevelsForFile(List<String> list) {
            this.mLogLevelsForFile = list;
            return this;
        }

        public Builder setPackagedLevel(int i) {
            this.mPackagedLevel = i;
            return this;
        }

        public Builder setStorage(IStorage iStorage) {
            this.mStorage = iStorage;
            return this;
        }

        public Logger build() {
            Logger logger = new Logger(this);
            LoggerGlobal.addLogger(logger);
            return logger;
        }
    }
}
