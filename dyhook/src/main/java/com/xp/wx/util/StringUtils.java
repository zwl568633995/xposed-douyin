package com.xp.wx.util;

import java.security.MessageDigest;
import java.util.List;

public class StringUtils {
    public static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    public static String listToString(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            if (i == size - 1) {
                sb.append(str);
            } else {
                sb.append(str);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static String getStrMd5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return FileUtil.bytesToHexString(instance.digest());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static long parseMd5L16ToLong(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            byte[] bytes = lowerCase.getBytes();
            long j = 0;
            for (int i = 0; i < bytes.length; i++) {
                long j2 = j << 4;
                byte b = (byte) (bytes[i] - 48);
                if (b > 9) {
                    b = (byte) (b - 39);
                }
                if (b > 15 || b < 0) {
                    throw new NumberFormatException("For input string '" + lowerCase);
                }
                j = j2 + ((long) b);
            }
            return j;
        }
        throw new NumberFormatException("null");
    }

    public static long parseString16ToLong(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("0x")) {
                lowerCase = lowerCase.substring(2);
            }
            if (lowerCase.length() <= 16) {
                return parseMd5L16ToLong(lowerCase);
            }
            throw new NumberFormatException("For input string '" + lowerCase + "' is to long");
        }
        throw new NumberFormatException("null");
    }
}
