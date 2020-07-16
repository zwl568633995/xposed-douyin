package com.xp.wx.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Handler;
import android.text.TextUtils;
import com.qiniu.android.common.Constants;
import com.xp.wx.Global;
import com.xp.wx.GlobalConst;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.UByte;

public class FileUtil {

    public interface CheckFileCallback {
        void checkResult(int i);
    }

    public static void clearXpwxHistoryFile(String str, long j) {
        Log.debug(GlobalConst.TAG, "clearXpwxHistoryFile. check " + str);
        File file = new File(str);
        if (file.exists()) {
            if (!file.isFile()) {
                File[] listFiles = file.listFiles();
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            clearXpwxHistoryFile(file2.getPath(), j);
                        } else if (System.currentTimeMillis() - file2.lastModified() >= j) {
                            Log.debug(GlobalConst.TAG, "clearXpwxHistoryFile. delete " + file2.getPath());
                            file2.delete();
                        }
                    }
                }
            } else if (System.currentTimeMillis() - file.lastModified() >= j) {
                Log.debug(GlobalConst.TAG, "clearXpwxHistoryFile. delete " + file.getPath());
                file.delete();
            }
        }
    }

    public static void GetImageInputStream(String str, String str2, String str3) {
        try {
            byte[] image = getImage(str);
            if (image != null) {
                saveFile(BitmapFactory.decodeByteArray(image, 0, image.length), str2, str3);
            } else {
                Log.info(GlobalConst.TAG, "GetImageInputStream: 下载图片为空");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] getImage(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setRequestMethod("GET");
        InputStream inputStream = httpURLConnection.getInputStream();
        if (httpURLConnection.getResponseCode() == 200) {
            return readStream(inputStream);
        }
        return null;
    }

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

    public static void saveFile(Bitmap bitmap, String str, String str2) throws IOException {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str + str2)));
        bitmap.compress(Bitmap.CompressFormat.PNG, 80, bufferedOutputStream);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[SYNTHETIC, Splitter:B:22:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC, Splitter:B:27:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveFile(byte[] r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "/"
            boolean r1 = r4.endsWith(r0)
            if (r1 != 0) goto L_0x0017
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
        L_0x0017:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0025
            r0.mkdirs()
        L_0x0025:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0049 }
            r2.<init>()     // Catch:{ IOException -> 0x0049 }
            r2.append(r4)     // Catch:{ IOException -> 0x0049 }
            r2.append(r5)     // Catch:{ IOException -> 0x0049 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0049 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0049 }
            r1.write(r3)     // Catch:{ IOException -> 0x0044, all -> 0x0041 }
            r1.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0041:
            r3 = move-exception
            r0 = r1
            goto L_0x0058
        L_0x0044:
            r3 = move-exception
            r0 = r1
            goto L_0x004a
        L_0x0047:
            r3 = move-exception
            goto L_0x0058
        L_0x0049:
            r3 = move-exception
        L_0x004a:
            r3.printStackTrace()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0057
            r0.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0057
        L_0x0053:
            r3 = move-exception
            r3.printStackTrace()
        L_0x0057:
            return
        L_0x0058:
            if (r0 == 0) goto L_0x0062
            r0.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0062:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.FileUtil.saveFile(byte[], java.lang.String, java.lang.String):void");
    }

    public static String getImagePathFromUrl(String str) {
        return getImagePathFromUrl(str, (String) null);
    }

    public static String getImagePathFromUrl(String str, String str2) {
        String encodeUrl = encodeUrl(str);
        if (!encodeUrl.endsWith("jpg") && !encodeUrl.endsWith(".png") && !encodeUrl.endsWith(".gif")) {
            encodeUrl = encodeUrl + ".jpg";
        }
        if (TextUtils.isEmpty(encodeUrl)) {
            encodeUrl = System.currentTimeMillis() + ".jpg";
        }
        if (TextUtils.isEmpty(str2)) {
            return Global.IMAGE_PATH + encodeUrl;
        }
        return Global.IMAGE_PATH + str2 + "/" + encodeUrl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072 A[SYNTHETIC, Splitter:B:36:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007c A[SYNTHETIC, Splitter:B:41:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088 A[SYNTHETIC, Splitter:B:47:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0092 A[SYNTHETIC, Splitter:B:52:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyFile(java.lang.String r9, java.lang.String r10) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            java.io.File r9 = new java.io.File
            r9.<init>(r10)
            boolean r10 = r0.exists()
            if (r10 != 0) goto L_0x0011
            return
        L_0x0011:
            java.io.File r10 = r9.getParentFile()
            boolean r10 = r10.exists()
            if (r10 != 0) goto L_0x0022
            java.io.File r10 = r9.getParentFile()
            r10.mkdir()
        L_0x0022:
            boolean r10 = r9.exists()
            if (r10 == 0) goto L_0x0030
            r9.createNewFile()     // Catch:{ IOException -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0030:
            r10 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ IOException -> 0x006b, all -> 0x0068 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            r1.<init>(r9)     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            java.nio.channels.FileChannel r10 = r1.getChannel()     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            r4 = 0
            long r6 = r0.size()     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            r2 = r10
            r3 = r0
            r2.transferFrom(r3, r4, r6)     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0058:
            if (r10 == 0) goto L_0x0084
            r10.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x005e:
            r9 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x0086
        L_0x0063:
            r9 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x006d
        L_0x0068:
            r9 = move-exception
            r0 = r10
            goto L_0x0086
        L_0x006b:
            r9 = move-exception
            r0 = r10
        L_0x006d:
            r9.printStackTrace()     // Catch:{ all -> 0x0085 }
            if (r10 == 0) goto L_0x007a
            r10.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r9 = move-exception
            r9.printStackTrace()
        L_0x007a:
            if (r0 == 0) goto L_0x0084
            r0.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0084:
            return
        L_0x0085:
            r9 = move-exception
        L_0x0086:
            if (r10 == 0) goto L_0x0090
            r10.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0090:
            if (r0 == 0) goto L_0x009a
            r0.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r10 = move-exception
            r10.printStackTrace()
        L_0x009a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.FileUtil.copyFile(java.lang.String, java.lang.String):void");
    }

    public static String getFilePathFromUrl(String str) {
        return getFilePathFromUrl(str, (String) null);
    }

    public static String getFilePathFromUrl(String str, String str2) {
        String encodeUrl = encodeUrl(str);
        if (TextUtils.isEmpty(encodeUrl)) {
            encodeUrl = System.currentTimeMillis() + "";
        }
        if (TextUtils.isEmpty(str2)) {
            return Global.FILE_PATH + encodeUrl;
        }
        return Global.FILE_PATH + str2 + "/" + encodeUrl;
    }

    public static String getSnsVideoPath() {
        return Global.FILE_PATH + "/snsvideo/";
    }

    public static String encodeUrl(String str) {
        try {
            return URLEncoder.encode(str, Constants.UTF_8).replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void removeAllFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                if (file.isDirectory()) {
                    for (File absolutePath : file.listFiles()) {
                        removeAllFile(absolutePath.getAbsolutePath());
                    }
                    return;
                }
                file.delete();
            }
        }
    }

    public static String updateImageDateTime(String str) {
        try {
            if (System.currentTimeMillis() - new File(str).lastModified() < 400) {
                Log.debug(GlobalConst.TAG, "updateImageDateTime < 1000ms");
                return str;
            }
            String substring = str.substring(str.lastIndexOf(".") + 1);
            if (TextUtils.isEmpty(substring)) {
                substring = "jpg";
            }
            String str2 = str.substring(0, str.lastIndexOf(".")) + System.currentTimeMillis() + "." + substring;
            copyFile(str, str2);
            if (!isValid(str2)) {
                Log.debug(GlobalConst.TAG, "copy file fail");
                return str;
            }
            ExifInterface exifInterface = new ExifInterface(str2);
            exifInterface.setAttribute("DateTime", new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date()));
            exifInterface.saveAttributes();
            if (isValid(str2)) {
                Log.debug(GlobalConst.TAG, "updateImageDateTime success");
                return str2;
            }
            Log.debug(GlobalConst.TAG, "updateImageDateTime fail");
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            Log.error(th);
        }
    }

    public static String getFileMD5(File file) {
        String str = "def_" + System.currentTimeMillis();
        if (!file.isFile() || !file.exists()) {
            return str;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            fileInputStream.close();
            String bytesToHexString = bytesToHexString(instance.digest());
            return TextUtils.isEmpty(bytesToHexString) ? str : bytesToHexString;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void writeLog(String str) {
        saveFile(Global.LOG_PATH, str, true);
    }

    public static String readLog() {
        return readFile(Global.LOG_PATH);
    }

    public static void deleteLog() {
        deleteFile(Global.LOG_PATH);
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
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.FileUtil.readFile(java.lang.String):java.lang.String");
    }

    public static void saveFile(String str, String str2) {
        saveFile(str, str2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC, Splitter:B:22:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d A[SYNTHETIC, Splitter:B:27:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveFile(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x003c }
            r1.<init>(r3)     // Catch:{ IOException -> 0x003c }
            java.io.File r2 = r1.getParentFile()     // Catch:{ IOException -> 0x003c }
            boolean r2 = r2.exists()     // Catch:{ IOException -> 0x003c }
            if (r2 != 0) goto L_0x0017
            java.io.File r2 = r1.getParentFile()     // Catch:{ IOException -> 0x003c }
            r2.mkdirs()     // Catch:{ IOException -> 0x003c }
        L_0x0017:
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x003c }
            if (r2 != 0) goto L_0x0020
            r1.createNewFile()     // Catch:{ IOException -> 0x003c }
        L_0x0020:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x003c }
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x003c }
            r2.<init>(r3, r5)     // Catch:{ IOException -> 0x003c }
            r1.<init>(r2)     // Catch:{ IOException -> 0x003c }
            r1.write(r4)     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
            r1.flush()     // Catch:{ IOException -> 0x0037, all -> 0x0034 }
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0034:
            r3 = move-exception
            r0 = r1
            goto L_0x004b
        L_0x0037:
            r3 = move-exception
            r0 = r1
            goto L_0x003d
        L_0x003a:
            r3 = move-exception
            goto L_0x004b
        L_0x003c:
            r3 = move-exception
        L_0x003d:
            r3.printStackTrace()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x004a
            r0.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r3 = move-exception
            r3.printStackTrace()
        L_0x004a:
            return
        L_0x004b:
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0055:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.FileUtil.saveFile(java.lang.String, java.lang.String, boolean):void");
    }

    public static boolean isValid(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists() && file.length() > 0) {
            z = true;
        }
        if (!z) {
            file.delete();
        }
        return z;
    }

    public static void deleteFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static String getFileSuffix(File file) {
        String name = file.getName();
        if (!name.contains(".") || name.endsWith(".")) {
            return "";
        }
        String substring = name.substring(name.lastIndexOf(".") + 1);
        return !TextUtils.isEmpty(substring) ? substring : "";
    }

    public static void checkFileComplete(String str, int i, CheckFileCallback checkFileCallback) {
        Handler secondHandler = HandlerUtil.getSecondHandler();
        final int[] iArr = {0};
        Log.debug("start check file. filepath = " + str);
        final String str2 = str;
        final CheckFileCallback checkFileCallback2 = checkFileCallback;
        final int i2 = i;
        final Handler handler = secondHandler;
        secondHandler.postDelayed(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    java.io.File r0 = new java.io.File
                    java.lang.String r1 = r1
                    r0.<init>(r1)
                    long r1 = r0.length()
                    boolean r3 = r0.exists()
                    r4 = 1
                    r5 = 0
                    if (r3 == 0) goto L_0x002b
                    r6 = 0
                    int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                    if (r3 != 0) goto L_0x001a
                    goto L_0x002b
                L_0x001a:
                    r8 = 50
                    android.os.SystemClock.sleep(r8)
                    long r8 = r0.length()
                    long r8 = r8 - r1
                    int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0029
                    goto L_0x002b
                L_0x0029:
                    r0 = 1
                    goto L_0x002c
                L_0x002b:
                    r0 = 0
                L_0x002c:
                    if (r0 == 0) goto L_0x004a
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "check file success. filepath = "
                    r0.append(r1)
                    java.lang.String r1 = r1
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    com.xp.wx.util.Log.debug(r0)
                    com.xp.wx.util.FileUtil$CheckFileCallback r0 = r2
                    r0.checkResult(r5)
                    goto L_0x007b
                L_0x004a:
                    int[] r0 = r3
                    r1 = r0[r5]
                    int r2 = r4
                    if (r1 < r2) goto L_0x006f
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "check file timeout. filepath = "
                    r0.append(r1)
                    java.lang.String r1 = r1
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    com.xp.wx.util.Log.error((java.lang.String) r0)
                    com.xp.wx.util.FileUtil$CheckFileCallback r0 = r2
                    r1 = -1
                    r0.checkResult(r1)
                    goto L_0x007b
                L_0x006f:
                    r1 = r0[r5]
                    int r1 = r1 + r4
                    r0[r5] = r1
                    android.os.Handler r0 = r5
                    r1 = 1000(0x3e8, double:4.94E-321)
                    r0.postDelayed(r10, r1)
                L_0x007b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.FileUtil.AnonymousClass1.run():void");
            }
        }, 1000);
    }
}
