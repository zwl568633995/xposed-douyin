package com.qiniu.android.utils;

import com.qiniu.android.common.Constants;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;

public final class StringUtils {
    public static String join(String[] strArr, String str) {
        int i;
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        int length2 = (str == null || str.equals("")) ? 0 : str.length();
        if (length == 0) {
            i = 0;
        } else {
            i = ((strArr[0] == null ? 16 : strArr[0].length()) + length2) * length;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                sb.append(str);
            }
            if (strArr[i2] != null) {
                sb.append(strArr[i2]);
            }
        }
        return sb.toString();
    }

    public static String jsonJoin(String[] strArr) {
        int length = strArr.length;
        StringBuilder sb = new StringBuilder((strArr[0].length() + 3) * length);
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(Typography.quote);
            sb.append(strArr[i]);
            sb.append(Typography.quote);
        }
        return sb.toString();
    }

    public static byte[] utf8Bytes(String str) {
        try {
            return str.getBytes(Constants.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static String strip(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt > 31 && charAt < 127) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
