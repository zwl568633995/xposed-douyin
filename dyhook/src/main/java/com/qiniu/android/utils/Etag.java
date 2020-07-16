package com.qiniu.android.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class Etag {
    public static String data(byte[] bArr, int i, int i2) {
        try {
            return stream(new ByteArrayInputStream(bArr, i, i2), (long) i2);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String data(byte[] bArr) {
        return data(bArr, 0, bArr.length);
    }

    public static String file(File file) throws IOException {
        return stream(new FileInputStream(file), file.length());
    }

    public static String file(String str) throws IOException {
        return file(new File(str));
    }

    public static String stream(InputStream inputStream, long j) throws IOException {
        if (j == 0) {
            return "Fto5o-5ea0sNMlW_75VgGJCv2AcJ";
        }
        byte[] bArr = new byte[65536];
        int i = ((int) ((j + 4194304) - 1)) / 4194304;
        byte[][] bArr2 = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j - (((long) i2) * 4194304);
            if (j2 > 4194304) {
                j2 = 4194304;
            }
            bArr2[i2] = oneBlock(bArr, inputStream, (int) j2);
        }
        return resultEncode(bArr2);
    }

    private static byte[] oneBlock(byte[] bArr, InputStream inputStream, int i) throws IOException {
        try {
            MessageDigest instance = MessageDigest.getInstance("sha-1");
            int length = bArr.length;
            while (i != 0) {
                int i2 = length > i ? i : length;
                inputStream.read(bArr, 0, i2);
                instance.update(bArr, 0, i2);
                i -= i2;
            }
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String resultEncode(byte[][] bArr) {
        byte[] bArr2;
        byte b;
        byte[] bArr3 = bArr[0];
        int length = bArr3.length;
        byte[] bArr4 = new byte[(length + 1)];
        if (bArr.length != 1) {
            b = -106;
            try {
                MessageDigest instance = MessageDigest.getInstance("sha-1");
                for (byte[] update : bArr) {
                    instance.update(update);
                }
                bArr2 = instance.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            bArr2 = bArr3;
            b = 22;
        }
        bArr4[0] = b;
        System.arraycopy(bArr2, 0, bArr4, 1, length);
        return UrlSafeBase64.encodeToString(bArr4);
    }
}
