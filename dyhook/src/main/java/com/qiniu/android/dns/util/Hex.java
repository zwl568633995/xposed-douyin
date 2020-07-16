package com.qiniu.android.dns.util;

import java.io.IOException;

public final class Hex {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] decodeHex(char[] cArr) throws HexDecodeException {
        int length = cArr.length;
        if ((length & 1) == 0) {
            byte[] bArr = new byte[(length >> 1)];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                i = i3 + 1;
                bArr[i2] = (byte) (((toDigit(cArr[i], i) << 4) | toDigit(cArr[i3], i3)) & 255);
                i2++;
            }
            return bArr;
        }
        throw new HexDecodeException("Odd number of characters.");
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static char[] encodeHex(byte[] bArr, boolean z) {
        return encodeHex(bArr, z ? DIGITS_LOWER : DIGITS_UPPER);
    }

    private static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }

    public static String encodeHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    protected static int toDigit(char c, int i) throws HexDecodeException {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        throw new HexDecodeException("Illegal hexadecimal character " + c + " at index " + i);
    }

    public static class HexDecodeException extends IOException {
        public HexDecodeException(String str) {
            super(str);
        }
    }
}
