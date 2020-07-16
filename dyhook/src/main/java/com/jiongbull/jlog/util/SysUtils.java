package com.jiongbull.jlog.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

public class SysUtils {
    private SysUtils() {
    }

    public static String getManufacturerInfo() {
        return Build.MANUFACTURER;
    }

    public static String getModelInfo() {
        return Build.MODEL;
    }

    public static String getProductInfo() {
        return Build.PRODUCT;
    }

    public static String getBrandInfo() {
        return Build.BRAND;
    }

    public static int getOsVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    public static String getOsVersionName() {
        return Build.VERSION.RELEASE;
    }

    public static String getOsVersionDisplayName() {
        return Build.DISPLAY;
    }

    public static int getAppVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    public static String getLanguage() {
        Locale locale = Locale.getDefault();
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    public static boolean isDebug(String str) {
        return "debug".equals(str);
    }
}
