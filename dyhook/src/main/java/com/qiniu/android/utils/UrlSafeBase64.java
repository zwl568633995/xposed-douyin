package com.qiniu.android.utils;

import android.util.Base64;
import com.qiniu.android.common.Constants;
import java.io.UnsupportedEncodingException;

public final class UrlSafeBase64 {
    public static String encodeToString(String str) {
        try {
            return encodeToString(str.getBytes(Constants.UTF_8));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String encodeToString(byte[] bArr) {
        return Base64.encodeToString(bArr, 10);
    }

    public static byte[] decode(String str) {
        return Base64.decode(str, 10);
    }
}
