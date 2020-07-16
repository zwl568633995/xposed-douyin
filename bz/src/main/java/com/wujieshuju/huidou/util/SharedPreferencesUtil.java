package com.wujieshuju.huidou.util;

import android.content.SharedPreferences;
import com.wujieshuju.huidou.HDApp;

public class SharedPreferencesUtil {
    private static final String KEY_IS_FIRST_LAUNCH = "is_first_launch";
    private static final String KEY_TOKEN = "token";
    private static final String KEY_TOKEN_EXPIRE_TIME = "token_expire_time";
    private static final String ST_AUTO_SENT_GIFT_ID = "auto_sent_gift_id";
    private static SharedPreferences sSharedPreferences;

    public static void save() {
    }

    public static SharedPreferences getSharedPreferences() {
        if (sSharedPreferences == null) {
            sSharedPreferences = HDApp.getApp().getSharedPreferences("common", 0);
        }
        return sSharedPreferences;
    }

    public static void saveAutoSentGiftID(String str) {
        getSharedPreferences().edit().putString(ST_AUTO_SENT_GIFT_ID, str).apply();
    }

    public static String getStAutoSentGiftId() {
        return getSharedPreferences().getString(ST_AUTO_SENT_GIFT_ID, "");
    }

    public static void saveTokenExpireTime(long j) {
        getSharedPreferences().edit().putLong(KEY_TOKEN_EXPIRE_TIME, j).apply();
    }

    public static long getTokenExpireTime() {
        return getSharedPreferences().getLong(KEY_TOKEN_EXPIRE_TIME, 0);
    }

    public static void saveIsFirstLaunch(boolean z) {
        getSharedPreferences().edit().putBoolean(KEY_IS_FIRST_LAUNCH, z).apply();
    }

    public static boolean isFirstLaunch() {
        return getSharedPreferences().getBoolean(KEY_IS_FIRST_LAUNCH, true);
    }
}
