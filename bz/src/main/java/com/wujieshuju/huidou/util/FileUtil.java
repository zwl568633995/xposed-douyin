package com.wujieshuju.huidou.util;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileUtil {
    public static byte[] readStream(InputStream inputStream) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static byte[] readFileBytes(String str) {
        try {
            return readStream(new FileInputStream(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.addSuppressed(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0045, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readFile(java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x000e
            java.lang.String r4 = ""
            return r4
        L_0x000e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ IOException -> 0x0046 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0046 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x003a }
            r4.<init>(r1)     // Catch:{ all -> 0x003a }
        L_0x001d:
            java.lang.String r2 = r4.readLine()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0027
            r0.append(r2)     // Catch:{ all -> 0x002e }
            goto L_0x001d
        L_0x0027:
            r4.close()     // Catch:{ all -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x002e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r3 = move-exception
            r4.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r4 = move-exception
            r2.addSuppressed(r4)     // Catch:{ all -> 0x003a }
        L_0x0039:
            throw r3     // Catch:{ all -> 0x003a }
        L_0x003a:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch:{ IOException -> 0x0046 }
        L_0x0045:
            throw r2     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            r4 = move-exception
            r4.printStackTrace()
        L_0x004a:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.util.FileUtil.readFile(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[SYNTHETIC, Splitter:B:19:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveFile(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0036 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0036 }
            java.io.File r2 = r1.getParentFile()     // Catch:{ IOException -> 0x0036 }
            boolean r2 = r2.exists()     // Catch:{ IOException -> 0x0036 }
            if (r2 != 0) goto L_0x0017
            java.io.File r2 = r1.getParentFile()     // Catch:{ IOException -> 0x0036 }
            r2.mkdirs()     // Catch:{ IOException -> 0x0036 }
        L_0x0017:
            r1.createNewFile()     // Catch:{ IOException -> 0x0036 }
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0036 }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x0036 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0036 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0036 }
            r1.write(r4)     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            r1.flush()     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            r1.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x002e:
            r3 = move-exception
            r0 = r1
            goto L_0x0045
        L_0x0031:
            r3 = move-exception
            r0 = r1
            goto L_0x0037
        L_0x0034:
            r3 = move-exception
            goto L_0x0045
        L_0x0036:
            r3 = move-exception
        L_0x0037:
            r3.printStackTrace()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0044
            r0.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0044:
            return
        L_0x0045:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r4 = move-exception
            r4.printStackTrace()
        L_0x004f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.util.FileUtil.saveFile(java.lang.String, java.lang.String):void");
    }

    public static void deleteFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
