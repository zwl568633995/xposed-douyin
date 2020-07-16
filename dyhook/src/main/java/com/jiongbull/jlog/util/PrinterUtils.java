package com.jiongbull.jlog.util;

import android.content.Context;
import android.os.Process;
import com.jiongbull.jlog.printer.Printer;

public class PrinterUtils {
    private static final String PRINT_CONSOLE_FORMAT = ("(%1$s:%2$d)#%3$s Thread:%4$s" + Printer.LINE_SEPARATOR + "%5$s" + Printer.LINE_SEPARATOR + " ");
    private static final String PRINT_FILE_FORMAT;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("%1$s %2$d %3$s %4$s : %5$s");
        sb.append(Printer.LINE_SEPARATOR);
        PRINT_FILE_FORMAT = sb.toString();
    }

    private PrinterUtils() {
    }

    public static void printConsole(String str, String str2, String str3) {
        LogUtils.log(str, str2, str3);
    }

    public static void printFile(Context context, String str, String str2, int i, long j, String str3) {
        LogUtils.write(context, LogUtils.genDirPath(str), LogUtils.genFileName(str2, i, j), str3);
    }

    public static String decorateMsgForConsole(String str, StackTraceElement stackTraceElement) {
        String name = Thread.currentThread().getName();
        return String.format(PRINT_CONSOLE_FORMAT, new Object[]{"", 0, "", name, str});
    }

    public static String decorateMsgForFile(String str, String str2, String str3, StackTraceElement stackTraceElement, long j, String str4) {
        String curTime = TimeUtils.getCurTime(j, str4);
        int myPid = Process.myPid();
        return String.format(PRINT_FILE_FORMAT, new Object[]{curTime, Integer.valueOf(myPid), str, str2, str3});
    }
}
