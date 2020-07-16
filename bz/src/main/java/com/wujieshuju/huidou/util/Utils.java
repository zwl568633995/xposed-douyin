package com.wujieshuju.huidou.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.Closeable;
import java.io.File;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import kotlin.UByte;

public class Utils {
    private static final String DEBUG_TAG = "GalleryDebug";
    private static final long INITIALCRC = -1;
    private static final boolean IS_DEBUG_BUILD = (Build.TYPE.equals("eng") || Build.TYPE.equals("userdebug"));
    private static final String MASK_STRING = "********************************";
    private static final long POLY64REV = -7661587058870466123L;
    private static final String TAG = "Utils";
    private static long[] sCrcTable = new long[256];
    private static volatile Thread sCurrentThread;
    private static volatile boolean sWarned;

    public static int ceilLog2(float f) {
        int i = 0;
        while (i < 31 && ((float) (1 << i)) < f) {
            i++;
        }
        return i;
    }

    public static int compare(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public static String ensureNotNull(String str) {
        return str == null ? "" : str;
    }

    public static int floorLog2(float f) {
        int i = 0;
        while (i < 31 && ((float) (1 << i)) <= f) {
            i++;
        }
        return i - 1;
    }

    public static float interpolateAngle(float f, float f2, float f3) {
        float f4 = f2 - f;
        if (f4 < 0.0f) {
            f4 += 360.0f;
        }
        if (f4 > 180.0f) {
            f4 -= 360.0f;
        }
        float f5 = f + (f4 * f3);
        return f5 < 0.0f ? f5 + 360.0f : f5;
    }

    public static float interpolateScale(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    static {
        for (int i = 0; i < 256; i++) {
            long j = (long) i;
            for (int i2 = 0; i2 < 8; i2++) {
                j = (j >> 1) ^ ((((int) j) & 1) != 0 ? POLY64REV : 0);
            }
            sCrcTable[i] = j;
        }
    }

    public static void setRenderThread() {
        sCurrentThread = Thread.currentThread();
    }

    public static void assertNotInRenderThread() {
        if (!sWarned && Thread.currentThread() == sCurrentThread) {
            sWarned = true;
            LogUtil.m825w(TAG, new Throwable("Should not do this in render thread"));
        }
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    public static void assertTrue(boolean z, String str, Object... objArr) {
        if (!z) {
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            throw new AssertionError(str);
        }
    }

    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static float distance(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f - f3), (double) (f2 - f4));
    }

    public static final long crc64Long(byte[] bArr) {
        long j = -1;
        for (byte b : bArr) {
            j = (j >> 8) ^ sCrcTable[(((int) j) ^ b) & UByte.MAX_VALUE];
        }
        return j;
    }

    public static byte[] getBytes(String str) {
        byte[] bArr = new byte[(str.length() * 2)];
        int i = 0;
        for (char c : str.toCharArray()) {
            int i2 = i + 1;
            bArr[i] = (byte) (c & 255);
            i = i2 + 1;
            bArr[i2] = (byte) (c >> 8);
        }
        return bArr;
    }

    public static void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                LogUtil.m824w(TAG, "close fail", th);
            }
        }
    }

    public static void closeSilently(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th) {
                LogUtil.m824w(TAG, "fail to close", th);
            }
        }
    }

    public static void closeSilently(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable th) {
                LogUtil.m824w(TAG, "fail to close", th);
            }
        }
    }

    public static void debug(String str, Object... objArr) {
        if (objArr.length == 0) {
            LogUtil.m817d(DEBUG_TAG, str);
        } else {
            LogUtil.m817d(DEBUG_TAG, String.format(str, objArr));
        }
    }

    public static float parseFloatSafely(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f;
        }
    }

    public static int parseIntSafely(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static boolean isNullOrEmpty(String str) {
        return TextUtils.isEmpty(str);
    }

    public static boolean hasSpaceForSize(long j) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return false;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            if (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > j) {
                return true;
            }
            return false;
        } catch (Exception e) {
            LogUtil.m824w(TAG, "Fail to access external storage", e);
            return false;
        }
    }

    public static void waitWithoutInterrupt(Object obj) {
        try {
            obj.wait();
        } catch (InterruptedException unused) {
            LogUtil.m823w(TAG, "unexpected interrupt: " + obj);
        }
    }

    public static void shuffle(int[] iArr, Random random) {
        for (int length = iArr.length; length > 0; length--) {
            int nextInt = random.nextInt(length);
            int i = length - 1;
            if (nextInt != i) {
                int i2 = iArr[i];
                iArr[i] = iArr[nextInt];
                iArr[nextInt] = i2;
            }
        }
    }

    public static boolean handleInterrruptedException(Throwable th) {
        if (!(th instanceof InterruptedIOException) && !(th instanceof InterruptedException)) {
            return false;
        }
        Thread.currentThread().interrupt();
        return true;
    }

    public static String escapeXml(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("&quot;");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt != '\'') {
                sb.append(charAt);
            } else {
                sb.append("&#039;");
            }
        }
        return sb.toString();
    }

    public static String getUserAgent(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return String.format("%s/%s; %s/%s/%s/%s; %s/%s/%s", new Object[]{packageInfo.packageName, packageInfo.versionName, Build.BRAND, Build.DEVICE, Build.MODEL, Build.ID, Build.VERSION.SDK, Build.VERSION.RELEASE, Build.VERSION.INCREMENTAL});
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalStateException("getPackageInfo failed");
        }
    }

    public static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
        return strArr2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.app.PendingIntent, android.os.Parcel] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw new java.lang.IllegalArgumentException("error parsing PendingIntent");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 != 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.PendingIntent deserializePendingIntent(byte[] r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0026
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x0018 }
            r1 = 0
            int r2 = r3.length     // Catch:{ Exception -> 0x0018 }
            r0.unmarshall(r3, r1, r2)     // Catch:{ Exception -> 0x0018 }
            android.app.PendingIntent r3 = android.app.PendingIntent.readPendingIntentOrNullFromParcel(r0)     // Catch:{ Exception -> 0x0018 }
            if (r0 == 0) goto L_0x0015
            r0.recycle()
        L_0x0015:
            return r3
        L_0x0016:
            r3 = move-exception
            goto L_0x0020
        L_0x0018:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "error parsing PendingIntent"
            r3.<init>(r1)     // Catch:{ all -> 0x0016 }
            throw r3     // Catch:{ all -> 0x0016 }
        L_0x0020:
            if (r0 == 0) goto L_0x0025
            r0.recycle()
        L_0x0025:
            throw r3
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.util.Utils.deserializePendingIntent(byte[]):android.app.PendingIntent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] serializePendingIntent(android.app.PendingIntent r1) {
        /*
            android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0013 }
            android.app.PendingIntent.writePendingIntentOrNullToParcel(r1, r0)     // Catch:{ all -> 0x0011 }
            byte[] r1 = r0.marshall()     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x0010
            r0.recycle()
        L_0x0010:
            return r1
        L_0x0011:
            r1 = move-exception
            goto L_0x0015
        L_0x0013:
            r1 = move-exception
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            r0.recycle()
        L_0x001a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.util.Utils.serializePendingIntent(android.app.PendingIntent):byte[]");
    }

    public static String maskDebugInfo(Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        return IS_DEBUG_BUILD ? obj2 : MASK_STRING.substring(0, Math.min(obj2.length(), 32));
    }

    public static float distanceP2P(PointF pointF, PointF pointF2) {
        if (pointF.equals(pointF2.x, pointF2.y)) {
            return 0.0f;
        }
        float abs = Math.abs(pointF2.x - pointF.x);
        float abs2 = Math.abs(pointF2.y - pointF.y);
        return (float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)));
    }

    public static String formatDuration(Context context, int i) {
        int i2 = i / 3600;
        int i3 = i2 * 3600;
        int i4 = (i - i3) / 60;
        int i5 = i - (i3 + (i4 * 60));
        if (i2 == 0) {
            return String.format("%0d:0%d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)});
        }
        return String.format("%d:%02d:%02d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    public static int getBucketId(String str) {
        return str.toLowerCase().hashCode();
    }

    public static boolean isFileExist(String str) {
        return new File(str).exists();
    }

    public static boolean makeDirs(String str) {
        return new File(str).mkdirs();
    }

    public static long getFileSize(String str) {
        return new File(str).length();
    }

    public static void showToast(Context context, String str) {
        new Handler(context.getMainLooper()).post(new ShowToastRunnable(context, str));
    }

    public static boolean isEmptyStr(String str) {
        return str == null || str.equals("");
    }

    private static class ShowToastRunnable implements Runnable {
        private final Context mContext;
        private final String mStr;

        ShowToastRunnable(Context context, String str) {
            this.mContext = context;
            this.mStr = str;
        }

        public void run() {
            Toast.makeText(this.mContext, this.mStr, 0).show();
        }
    }

    public static void sendMessage(Handler handler, int i, int i2, int i3, Object obj, long j) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        if (j > 0) {
            handler.sendMessageDelayed(obtain, j);
        } else {
            handler.sendMessage(obtain);
        }
    }

    public static void openWebView(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    public static Bitmap resizeWithImageByScale(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            return bitmap;
        }
        float width = (float) bitmap.getWidth();
        float f = ((float) i) / width;
        float height = (float) bitmap.getHeight();
        float f2 = ((float) i2) / height;
        if (f >= f2) {
            i = (int) (width * f2);
        } else {
            i2 = (int) (height * f);
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, true);
    }

    public static Bitmap resizeWithCropImage(Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2 = null;
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = ((float) width) / ((float) height);
            float f2 = ((float) i) / ((float) i2);
            if (width <= i && height <= i2) {
                return Bitmap.createScaledBitmap(bitmap, i, i2, true);
            }
            if (f > f2) {
                int i3 = (height * i) / i2;
                bitmap = Bitmap.createBitmap(bitmap, (width - i3) / 2, 0, i3, height);
            } else if (f < f2) {
                int i4 = (width * i2) / i;
                bitmap = Bitmap.createBitmap(bitmap, 0, (height - i4) / 2, width, i4);
            }
            bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            if (bitmap != bitmap2 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return bitmap2;
        } catch (Exception e) {
            LogUtil.m825w(TAG, (Throwable) e);
        } catch (OutOfMemoryError e2) {
            LogUtil.m825w(TAG, (Throwable) e2);
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.m825w(TAG, (Throwable) e);
            return "";
        }
    }

    public static int getAppVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.m825w(TAG, (Throwable) e);
            return 0;
        }
    }

    public static boolean isEmail(String str) {
        return Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(str).matches();
    }

    public static boolean isQQ(String str) {
        return Pattern.compile("\\d{5,12}$").matcher(str).matches();
    }

    public static String getSystemProperties(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, str2});
        } catch (Exception e) {
            LogUtil.m819e(TAG, "Exception while getting system property: ", e);
            return str2;
        }
    }

    public static void dumpStack() {
        RuntimeException runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        LogUtil.m825w(TAG, (Throwable) runtimeException);
    }

    public static Map<String, String> Obj2Map(Object obj) {
        return Obj2Map(obj, false);
    }

    public static Map<String, String> Obj2Map(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        try {
            Field[] fields = Class.forName(obj.getClass().getName()).getFields();
            if (fields != null && fields.length > 0) {
                for (Field field : fields) {
                    if (!field.isSynthetic()) {
                        Object obj2 = field.get(obj);
                        if (obj2 != null || !z) {
                            hashMap.put(field.getName(), obj2 == null ? "" : obj2.toString());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public static String getCurrentProcessName(Context context) {
        int myPid = Process.myPid();
        String str = "";
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (next.pid == myPid) {
                str = next.processName;
            }
        }
        return str;
    }

    public static boolean isMobile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$").matcher(str).matches();
    }
}
