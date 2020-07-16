package com.qiniu.android.http;

import android.os.Build;
import android.support.v4.os.EnvironmentCompat;
import android.text.TextUtils;
import com.qiniu.android.common.Constants;
import com.qiniu.android.utils.StringUtils;
import java.util.Locale;
import java.util.Random;

public final class UserAgent {
    private static UserAgent _instance = new UserAgent();
    public final String id;
    public final String ua;

    private UserAgent() {
        String genId = genId();
        this.id = genId;
        this.ua = getUserAgent(genId);
    }

    public static UserAgent instance() {
        return _instance;
    }

    private static String genId() {
        Random random = new Random();
        return System.currentTimeMillis() + "" + random.nextInt(999);
    }

    private static String getUserAgent(String str) {
        return String.format("QiniuAndroid/%s (%s; %s; %s)", new Object[]{Constants.VERSION, osVersion(), device(), str});
    }

    private static String osVersion() {
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            return "";
        }
        return StringUtils.strip(str.trim());
    }

    private static String device() {
        String trim = Build.MODEL.trim();
        String deviceName = deviceName(Build.MANUFACTURER.trim(), trim);
        if (TextUtils.isEmpty(deviceName)) {
            deviceName = deviceName(Build.BRAND.trim(), trim);
        }
        StringBuilder sb = new StringBuilder();
        if (deviceName == null) {
            deviceName = "";
        }
        sb.append(deviceName);
        sb.append("-");
        sb.append(trim);
        return StringUtils.strip(sb.toString());
    }

    private static String deviceName(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (lowerCase.startsWith(EnvironmentCompat.MEDIA_UNKNOWN) || lowerCase.startsWith("alps") || lowerCase.startsWith("android") || lowerCase.startsWith("sprd") || lowerCase.startsWith("spreadtrum") || lowerCase.startsWith("rockchip") || lowerCase.startsWith("wondermedia") || lowerCase.startsWith("mtk") || lowerCase.startsWith("mt65") || lowerCase.startsWith("nvidia") || lowerCase.startsWith("brcm") || lowerCase.startsWith("marvell") || str2.toLowerCase(Locale.getDefault()).contains(lowerCase)) {
            return null;
        }
        return str;
    }

    public String toString() {
        return this.ua;
    }
}
