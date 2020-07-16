package com.jiongbull.jlog.printer;

import android.content.Context;
import com.jiongbull.jlog.util.SysUtils;

public interface Printer {
    public static final String LINE_SEPARATOR = SysUtils.getLineSeparator();

    void printConsole(String str, String str2, String str3, StackTraceElement stackTraceElement);

    void printFile(Context context, String str, String str2, String str3, StackTraceElement stackTraceElement, long j, String str4, String str5, String str6, int i);
}
