package com.jiongbull.jlog.printer;

import android.content.Context;
import com.jiongbull.jlog.util.PrinterUtils;

public class DefaultPrinter implements Printer {
    public void printConsole(String str, String str2, String str3, StackTraceElement stackTraceElement) {
        PrinterUtils.printConsole(str, str2, str3);
    }

    public void printFile(Context context, String str, String str2, String str3, StackTraceElement stackTraceElement, long j, String str4, String str5, String str6, int i) {
        synchronized (Printer.class) {
            PrinterUtils.printFile(context, str5, str6, i, j, PrinterUtils.decorateMsgForFile(str, str2, str3, stackTraceElement, j, str4));
        }
    }
}
