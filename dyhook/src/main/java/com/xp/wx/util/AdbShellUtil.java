package com.xp.wx.util;

import java.util.concurrent.locks.ReentrantLock;

public class AdbShellUtil {
    public static final String TAG = "AdbShellUtil";
    public static ReentrantLock lock = new ReentrantLock();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        if (r3 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012c, code lost:
        if (r3 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x014b, code lost:
        if (r3 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014d, code lost:
        r3.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0150, code lost:
        android.util.Log.d(TAG, "Result Of Execution===============>>" + r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x016c, code lost:
        return r1.toString();
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017d A[Catch:{ IOException -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011d A[SYNTHETIC, Splitter:B:71:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0125 A[Catch:{ IOException -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013c A[SYNTHETIC, Splitter:B:85:0x013c] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0144 A[Catch:{ IOException -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0175 A[SYNTHETIC, Splitter:B:99:0x0175] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x0132=Splitter:B:81:0x0132, B:67:0x0113=Splitter:B:67:0x0113} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String ExeCmds(java.lang.String r8) {
        /*
            java.lang.String r0 = "AdbShellUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.util.concurrent.locks.ReentrantLock r3 = lock     // Catch:{ IOException -> 0x012f, InterruptedException -> 0x0110, all -> 0x010c }
            r3.lock()     // Catch:{ IOException -> 0x012f, InterruptedException -> 0x0110, all -> 0x010c }
            java.lang.ProcessBuilder r3 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x012f, InterruptedException -> 0x0110, all -> 0x010c }
            java.lang.String r4 = "su"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ IOException -> 0x012f, InterruptedException -> 0x0110, all -> 0x010c }
            r3.<init>(r4)     // Catch:{ IOException -> 0x012f, InterruptedException -> 0x0110, all -> 0x010c }
            r4 = 1
            java.lang.ProcessBuilder r3 = r3.redirectErrorStream(r4)     // Catch:{ IOException -> 0x012f, InterruptedException -> 0x0110, all -> 0x010c }
            java.lang.Process r3 = r3.start()     // Catch:{ IOException -> 0x012f, InterruptedException -> 0x0110, all -> 0x010c }
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0109, InterruptedException -> 0x0106, all -> 0x0102 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x0109, InterruptedException -> 0x0106, all -> 0x0102 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0109, InterruptedException -> 0x0106, all -> 0x0102 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00fe, InterruptedException -> 0x00fa, all -> 0x00f5 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00fe, InterruptedException -> 0x00fa, all -> 0x00f5 }
            java.io.InputStream r7 = r3.getInputStream()     // Catch:{ IOException -> 0x00fe, InterruptedException -> 0x00fa, all -> 0x00f5 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00fe, InterruptedException -> 0x00fa, all -> 0x00f5 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00fe, InterruptedException -> 0x00fa, all -> 0x00f5 }
            java.lang.String r2 = "exit\n"
            java.lang.String r6 = "\n"
            if (r8 == 0) goto L_0x00ab
            java.lang.String r7 = r8.trim()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            int r7 = r7.length()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            if (r7 != 0) goto L_0x0049
            goto L_0x00ab
        L_0x0049:
            android.util.Log.d(r0, r8)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r7.<init>()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r7.append(r8)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r7.append(r6)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            java.lang.String r8 = r7.toString()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r4.writeBytes(r8)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r4.flush()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r4.writeBytes(r2)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r4.flush()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            int r8 = r3.waitFor()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            if (r8 != 0) goto L_0x0091
        L_0x006d:
            java.lang.String r8 = r5.readLine()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            if (r8 == 0) goto L_0x0091
            java.lang.String r2 = r8.trim()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            if (r2 != 0) goto L_0x007e
            goto L_0x006d
        L_0x007e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r2.<init>()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r2.append(r8)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r2.append(r6)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            java.lang.String r8 = r2.toString()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r1.append(r8)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            goto L_0x006d
        L_0x0091:
            java.util.concurrent.locks.ReentrantLock r8 = lock
            r8.unlock()
            r4.close()     // Catch:{ IOException -> 0x009d }
            r5.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00a1:
            if (r3 == 0) goto L_0x0150
            goto L_0x014d
        L_0x00a5:
            r8 = move-exception
            goto L_0x00f7
        L_0x00a7:
            r8 = move-exception
            goto L_0x00fc
        L_0x00a9:
            r8 = move-exception
            goto L_0x0100
        L_0x00ab:
            r4.writeBytes(r2)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r4.flush()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            int r8 = r3.waitFor()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            if (r8 != 0) goto L_0x00db
        L_0x00b7:
            java.lang.String r8 = r5.readLine()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            if (r8 == 0) goto L_0x00db
            java.lang.String r2 = r8.trim()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            if (r2 != 0) goto L_0x00c8
            goto L_0x00b7
        L_0x00c8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r2.<init>()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r2.append(r8)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r2.append(r6)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            java.lang.String r8 = r2.toString()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            r1.append(r8)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            goto L_0x00b7
        L_0x00db:
            java.lang.String r8 = r1.toString()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x00a7, all -> 0x00a5 }
            java.util.concurrent.locks.ReentrantLock r0 = lock
            r0.unlock()
            r4.close()     // Catch:{ IOException -> 0x00eb }
            r5.close()     // Catch:{ IOException -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ef:
            if (r3 == 0) goto L_0x00f4
            r3.destroy()
        L_0x00f4:
            return r8
        L_0x00f5:
            r8 = move-exception
            r5 = r2
        L_0x00f7:
            r2 = r4
            goto L_0x016e
        L_0x00fa:
            r8 = move-exception
            r5 = r2
        L_0x00fc:
            r2 = r4
            goto L_0x0113
        L_0x00fe:
            r8 = move-exception
            r5 = r2
        L_0x0100:
            r2 = r4
            goto L_0x0132
        L_0x0102:
            r8 = move-exception
            r5 = r2
            goto L_0x016e
        L_0x0106:
            r8 = move-exception
            r5 = r2
            goto L_0x0113
        L_0x0109:
            r8 = move-exception
            r5 = r2
            goto L_0x0132
        L_0x010c:
            r8 = move-exception
            r3 = r2
            r5 = r3
            goto L_0x016e
        L_0x0110:
            r8 = move-exception
            r3 = r2
            r5 = r3
        L_0x0113:
            r8.printStackTrace()     // Catch:{ all -> 0x016d }
            java.util.concurrent.locks.ReentrantLock r8 = lock
            r8.unlock()
            if (r2 == 0) goto L_0x0123
            r2.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x0123
        L_0x0121:
            r8 = move-exception
            goto L_0x0129
        L_0x0123:
            if (r5 == 0) goto L_0x012c
            r5.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x012c
        L_0x0129:
            r8.printStackTrace()
        L_0x012c:
            if (r3 == 0) goto L_0x0150
            goto L_0x014d
        L_0x012f:
            r8 = move-exception
            r3 = r2
            r5 = r3
        L_0x0132:
            r8.printStackTrace()     // Catch:{ all -> 0x016d }
            java.util.concurrent.locks.ReentrantLock r8 = lock
            r8.unlock()
            if (r2 == 0) goto L_0x0142
            r2.close()     // Catch:{ IOException -> 0x0140 }
            goto L_0x0142
        L_0x0140:
            r8 = move-exception
            goto L_0x0148
        L_0x0142:
            if (r5 == 0) goto L_0x014b
            r5.close()     // Catch:{ IOException -> 0x0140 }
            goto L_0x014b
        L_0x0148:
            r8.printStackTrace()
        L_0x014b:
            if (r3 == 0) goto L_0x0150
        L_0x014d:
            r3.destroy()
        L_0x0150:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "Result Of Execution===============>>"
            r8.append(r2)
            java.lang.String r2 = r1.toString()
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r0, r8)
            java.lang.String r8 = r1.toString()
            return r8
        L_0x016d:
            r8 = move-exception
        L_0x016e:
            java.util.concurrent.locks.ReentrantLock r0 = lock
            r0.unlock()
            if (r2 == 0) goto L_0x017b
            r2.close()     // Catch:{ IOException -> 0x0179 }
            goto L_0x017b
        L_0x0179:
            r0 = move-exception
            goto L_0x0181
        L_0x017b:
            if (r5 == 0) goto L_0x0184
            r5.close()     // Catch:{ IOException -> 0x0179 }
            goto L_0x0184
        L_0x0181:
            r0.printStackTrace()
        L_0x0184:
            if (r3 == 0) goto L_0x0189
            r3.destroy()
        L_0x0189:
            goto L_0x018b
        L_0x018a:
            throw r8
        L_0x018b:
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.AdbShellUtil.ExeCmds(java.lang.String):java.lang.String");
    }
}
