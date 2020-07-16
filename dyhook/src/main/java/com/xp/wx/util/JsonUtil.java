package com.xp.wx.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xp.wx.GlobalConst;
import java.io.IOException;
import java.io.Reader;

public class JsonUtil {
    private static final Gson GSON_SERI_NULL = new GsonBuilder().serializeNulls().create();
    private static final String TAG = GlobalConst.TAG;

    public static <T> T parseJson(Reader reader, Class<T> cls) {
        try {
            T fromJson = GSON_SERI_NULL.fromJson(reader, cls);
            try {
                reader.close();
            } catch (IOException e) {
                Log.warn(TAG, (Throwable) e);
            }
            return fromJson;
        } catch (Exception e2) {
            Log.warn(TAG, (Throwable) e2);
            try {
                reader.close();
                return null;
            } catch (IOException e3) {
                Log.warn(TAG, (Throwable) e3);
                return null;
            }
        } catch (Throwable th) {
            try {
                reader.close();
            } catch (IOException e4) {
                Log.warn(TAG, (Throwable) e4);
            }
            throw th;
        }
    }

    public static <T> T parseJson(String str, Class<T> cls) {
        try {
            return GSON_SERI_NULL.fromJson(str, cls);
        } catch (Exception e) {
            Log.warn(TAG, (Throwable) e);
            return null;
        }
    }

    public static String serialObject(Object obj) {
        try {
            return GSON_SERI_NULL.toJson(obj);
        } catch (Exception e) {
            Log.warn(TAG, (Throwable) e);
            return "";
        }
    }
}
