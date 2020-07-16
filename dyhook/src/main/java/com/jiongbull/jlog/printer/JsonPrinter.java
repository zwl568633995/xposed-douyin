package com.jiongbull.jlog.printer;

import android.content.Context;
import com.jiongbull.jlog.util.PrinterUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonPrinter implements Printer {
    private static final int JSON_INDENT = 4;

    public void printConsole(String str, String str2, String str3, StackTraceElement stackTraceElement) {
        try {
            if (str3.startsWith("{")) {
                str3 = new JSONObject(str3).toString(4);
            } else if (str3.startsWith("[")) {
                str3 = new JSONArray(str3).toString(4);
            }
        } catch (JSONException unused) {
        }
        PrinterUtils.printConsole(str, str2, PrinterUtils.decorateMsgForConsole(str3, stackTraceElement));
    }

    public void printFile(Context context, String str, String str2, String str3, StackTraceElement stackTraceElement, long j, String str4, String str5, String str6, int i) {
        synchronized (Printer.class) {
            PrinterUtils.printFile(context, str5, str6, i, j, PrinterUtils.decorateMsgForFile(str, str2, str3, stackTraceElement, j, str4));
        }
    }
}
