package com.qiniu.android.storage.persistent;

import com.qiniu.android.storage.Recorder;
import com.qiniu.android.utils.UrlSafeBase64;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public final class FileRecorder implements Recorder {
    public String directory;

    public FileRecorder(String str) throws IOException {
        this.directory = str;
        File file = new File(str);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new IOException("mkdir failed");
            }
        } else if (!file.isDirectory()) {
            throw new IOException("does not mkdir");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[SYNTHETIC, Splitter:B:10:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void set(java.lang.String r3, byte[] r4) {
        /*
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.directory
            java.lang.String r3 = com.qiniu.android.utils.UrlSafeBase64.encodeToString((java.lang.String) r3)
            r0.<init>(r1, r3)
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0017 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0017 }
            r1.write(r4)     // Catch:{ IOException -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            r3 = move-exception
            goto L_0x001a
        L_0x0017:
            r4 = move-exception
            r1 = r3
            r3 = r4
        L_0x001a:
            r3.printStackTrace()
        L_0x001d:
            if (r1 == 0) goto L_0x0027
            r1.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiniu.android.storage.persistent.FileRecorder.set(java.lang.String, byte[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035 A[SYNTHETIC, Splitter:B:18:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] get(java.lang.String r4) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r3.directory
            java.lang.String r4 = com.qiniu.android.utils.UrlSafeBase64.encodeToString((java.lang.String) r4)
            r0.<init>(r1, r4)
            r4 = 0
            boolean r1 = r3.outOfDate(r0)     // Catch:{ IOException -> 0x002c }
            if (r1 == 0) goto L_0x0016
            r0.delete()     // Catch:{ IOException -> 0x002c }
            return r4
        L_0x0016:
            long r1 = r0.length()     // Catch:{ IOException -> 0x002c }
            int r2 = (int) r1     // Catch:{ IOException -> 0x002c }
            byte[] r1 = new byte[r2]     // Catch:{ IOException -> 0x002c }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0029 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0029 }
            int r0 = r2.read(r1)     // Catch:{ IOException -> 0x0027 }
            goto L_0x0033
        L_0x0027:
            r0 = move-exception
            goto L_0x002f
        L_0x0029:
            r0 = move-exception
            r2 = r4
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            r1 = r4
            r2 = r1
        L_0x002f:
            r0.printStackTrace()
            r0 = 0
        L_0x0033:
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r2 = move-exception
            r2.printStackTrace()
        L_0x003d:
            if (r0 != 0) goto L_0x0040
            return r4
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiniu.android.storage.persistent.FileRecorder.get(java.lang.String):byte[]");
    }

    private boolean outOfDate(File file) {
        return file.lastModified() + 172800000 < new Date().getTime();
    }

    public void del(String str) {
        new File(this.directory, UrlSafeBase64.encodeToString(str)).delete();
    }
}
