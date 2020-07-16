package com.wujieshuju.huidou.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.Reader;

public class JsonUtil {
    private static final Gson GSON_SERI_NULL = new GsonBuilder().serializeNulls().create();
    private static final String TAG = "BaoZhi-HD";

    public static <T> T parseJson(Reader reader, Class<T> cls) {
        try {
            T fromJson = GSON_SERI_NULL.fromJson(reader, cls);
            try {
                reader.close();
            } catch (IOException e) {
                LogUtil.m825w("BaoZhi-HD", (Throwable) e);
            }
            return fromJson;
        } catch (JsonIOException | JsonSyntaxException e2) {
            LogUtil.m825w("BaoZhi-HD", (Throwable) e2);
            try {
                reader.close();
                return null;
            } catch (IOException e3) {
                LogUtil.m825w("BaoZhi-HD", (Throwable) e3);
                return null;
            }
        } catch (Throwable th) {
            try {
                reader.close();
            } catch (IOException e4) {
                LogUtil.m825w("BaoZhi-HD", (Throwable) e4);
            }
            throw th;
        }
    }

    public static <T> T parseJson(String str, Class<T> cls) {
        try {
            return GSON_SERI_NULL.fromJson(str, cls);
        } catch (JsonIOException | JsonSyntaxException e) {
            LogUtil.m825w("BaoZhi-HD", (Throwable) e);
            return null;
        }
    }

    public static String serialObject(Object obj) {
        try {
            return GSON_SERI_NULL.toJson(obj);
        } catch (Exception e) {
            LogUtil.m825w("BaoZhi-HD", (Throwable) e);
            return "";
        }
    }
}
