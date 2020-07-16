package com.xp.wx.backend.network;

import android.text.TextUtils;
import android.util.Patterns;
import com.xp.wx.GlobalConst;
import com.xp.wx.backend.threadpool.ThreadPool;
import com.xp.wx.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0002#$B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\u0016\u001a\u00020\u0013J\u0010\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0019J$\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u0019J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010!\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R.\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xp/wx/backend/network/DownloadClient;", "", "url", "", "", "filePath", "callback", "Lcom/xp/wx/backend/network/DownloadClient$DownloadCallback;", "(Ljava/util/List;Ljava/util/List;Lcom/xp/wx/backend/network/DownloadClient$DownloadCallback;)V", "mCallback", "mDownloadType", "", "mFilePaths", "mResult", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mSameUrlCount", "mUrls", "checkDownloadProgress", "", "checkValidity", "download", "downloadWithByteData", "downloadWithFile", "filterExistsFile", "", "handleResponse", "response", "Lokhttp3/Response;", "isFinished", "parseByteCode", "putResult", "path", "saveFile", "startDownloadFile", "Companion", "DownloadCallback", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DownloadClient.kt */
public final class DownloadClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = GlobalConst.TAG;
    public static final int TYPE_BYTE_CODE = 1;
    public static final int TYPE_FILE = 0;
    private DownloadCallback mCallback;
    private int mDownloadType;
    private List<String> mFilePaths;
    private final HashMap<String, Object> mResult = new HashMap<>();
    private int mSameUrlCount;
    /* access modifiers changed from: private */
    public List<String> mUrls;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u0007H&¨\u0006\b"}, d2 = {"Lcom/xp/wx/backend/network/DownloadClient$DownloadCallback;", "", "onDownloadFinished", "", "result", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DownloadClient.kt */
    public interface DownloadCallback {
        void onDownloadFinished(HashMap<String, Object> hashMap);
    }

    public DownloadClient(List<String> list, List<String> list2, DownloadCallback downloadCallback) {
        Intrinsics.checkParameterIsNotNull(list, "url");
        Intrinsics.checkParameterIsNotNull(downloadCallback, "callback");
        this.mUrls = list;
        this.mFilePaths = list2;
        this.mCallback = downloadCallback;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xp/wx/backend/network/DownloadClient$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "TYPE_BYTE_CODE", "", "TYPE_FILE", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DownloadClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void downloadWithFile$default(DownloadClient downloadClient, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        downloadClient.downloadWithFile(z);
    }

    public final void downloadWithFile(boolean z) {
        this.mDownloadType = 0;
        ThreadPool threadPool = ThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(threadPool, "ThreadPool.getDefault()");
        threadPool.getExecutor().execute(new DownloadClient$downloadWithFile$1(this, z));
    }

    public final void downloadWithByteData() {
        this.mDownloadType = 1;
        ThreadPool threadPool = ThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(threadPool, "ThreadPool.getDefault()");
        threadPool.getExecutor().execute(new DownloadClient$downloadWithByteData$1(this));
    }

    /* access modifiers changed from: private */
    public final void startDownloadFile(boolean z) {
        int size = this.mUrls.size();
        for (int i = 0; i < size; i++) {
            List<String> list = this.mFilePaths;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            String str = list.get(i);
            String str2 = this.mUrls.get(i);
            if (TextUtils.isEmpty(str)) {
                String str3 = TAG;
                Log.error(str3, "fail: file path is null. url = " + str2);
                putResult(str2, (Object) null);
                checkDownloadProgress();
            } else if (!Patterns.WEB_URL.matcher(str2).matches()) {
                String str4 = TAG;
                Log.error(str4, "fail: not a legal url. url = " + str2);
                putResult(str2, (Object) null);
                checkDownloadProgress();
            } else {
                File file = new File(str);
                if (z) {
                    if (file.exists() && file.length() > 0) {
                        String str5 = TAG;
                        Log.debug(str5, "file already exists, continue. url = " + str2);
                        putResult(str2, str);
                        checkDownloadProgress();
                    }
                } else if (file.exists()) {
                    file.delete();
                }
                download(str2, str);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void download(String str, String str2) {
        Log.debug("download url = " + str);
        OkHttpClientUtil instance = OkHttpClientUtil.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "OkHttpClientUtil.getInstance()");
        try {
            handleResponse(str, str2, instance.getOkHttpClient().newCall(new Request.Builder().url(str).build()).execute());
        } catch (Throwable th) {
            Log.error(th);
            handleResponse(str, str2, (Response) null);
        }
    }

    private final void handleResponse(String str, String str2, Response response) {
        if (response == null || !response.isSuccessful()) {
            String str3 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("download fail: response = ");
            sb.append(response != null ? Integer.valueOf(response.code()) : null);
            sb.append(", url = ");
            sb.append(str);
            Log.error(str3, sb.toString());
            putResult(str, (Object) null);
        } else {
            int i = this.mDownloadType;
            if (i == 0) {
                saveFile(str, str2, response);
            } else if (i == 1) {
                parseByteCode(str, response);
            }
        }
        checkDownloadProgress();
    }

    private final void parseByteCode(String str, Response response) {
        ResponseBody body = response.body();
        if (body != null) {
            putResult(str, body.bytes());
        } else {
            putResult(str, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff A[SYNTHETIC, Splitter:B:51:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107 A[Catch:{ IOException -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015d A[SYNTHETIC, Splitter:B:66:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0165 A[Catch:{ IOException -> 0x016b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void saveFile(java.lang.String r9, java.lang.String r10, okhttp3.Response r11) {
        /*
            r8 = this;
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.String r10 = TAG
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "save file fail: file path is null. url = "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.xp.wx.util.Log.error(r10, r11)
            r8.putResult(r9, r1)
            return
        L_0x0024:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r3 = ".temp"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.io.File r2 = r0.getParentFile()
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x004b
            java.io.File r2 = r0.getParentFile()
            r2.mkdirs()
        L_0x004b:
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x008f
            long r4 = r0.length()
            r6 = 1000(0x3e8, double:4.94E-321)
            android.os.SystemClock.sleep(r6)
            long r6 = r0.length()
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0066
            r0.delete()
            goto L_0x008f
        L_0x0066:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r4 = 95
            r2.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x008f
            r0.delete()
        L_0x008f:
            r0.createNewFile()
            r2 = r1
            java.io.InputStream r2 = (java.io.InputStream) r2
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r3]
            r4 = r1
            java.io.FileOutputStream r4 = (java.io.FileOutputStream) r4
            r5 = 0
            okhttp3.ResponseBody r11 = r11.body()     // Catch:{ Exception -> 0x00f3 }
            if (r11 == 0) goto L_0x00de
            java.io.InputStream r2 = r11.byteStream()     // Catch:{ Exception -> 0x00f3 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f3 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x00f3 }
        L_0x00ac:
            if (r2 == 0) goto L_0x00be
            int r4 = r2.read(r3)     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
            goto L_0x00bf
        L_0x00b7:
            r9 = move-exception
            r4 = r11
            goto L_0x015b
        L_0x00bb:
            r3 = move-exception
            r4 = r11
            goto L_0x00f4
        L_0x00be:
            r4 = r1
        L_0x00bf:
            if (r4 != 0) goto L_0x00c4
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
        L_0x00c4:
            int r6 = r4.intValue()     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
            if (r4 != 0) goto L_0x00cd
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
        L_0x00cd:
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
            if (r4 <= 0) goto L_0x00d9
            r11.write(r3, r5, r6)     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
            goto L_0x00ac
        L_0x00d9:
            r11.flush()     // Catch:{ Exception -> 0x00bb, all -> 0x00b7 }
            r5 = 1
            r4 = r11
        L_0x00de:
            if (r2 != 0) goto L_0x00e3
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ IOException -> 0x00ef }
        L_0x00e3:
            r2.close()     // Catch:{ IOException -> 0x00ef }
            if (r4 != 0) goto L_0x00eb
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ IOException -> 0x00ef }
        L_0x00eb:
            r4.close()     // Catch:{ IOException -> 0x00ef }
            goto L_0x010b
        L_0x00ef:
            goto L_0x010b
        L_0x00f1:
            r9 = move-exception
            goto L_0x015b
        L_0x00f3:
            r3 = move-exception
        L_0x00f4:
            java.lang.String r11 = TAG     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00f1 }
            com.xp.wx.util.Log.error(r11, r3)     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x0102
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ IOException -> 0x00ef }
        L_0x0102:
            r2.close()     // Catch:{ IOException -> 0x00ef }
            if (r4 != 0) goto L_0x00eb
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ IOException -> 0x00ef }
            goto L_0x00eb
        L_0x010b:
            if (r5 == 0) goto L_0x0138
            java.io.File r11 = new java.io.File
            r11.<init>(r10)
            boolean r1 = r11.exists()
            if (r1 == 0) goto L_0x011b
            r11.delete()
        L_0x011b:
            r0.renameTo(r11)
            r8.putResult(r9, r10)
            java.lang.String r10 = TAG
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "save file success: url = "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.xp.wx.util.Log.debug(r10, r9)
            goto L_0x015a
        L_0x0138:
            boolean r10 = r0.exists()
            if (r10 == 0) goto L_0x0141
            r0.delete()
        L_0x0141:
            r8.putResult(r9, r1)
            java.lang.String r10 = TAG
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "save file fail: url = "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.xp.wx.util.Log.debug(r10, r9)
        L_0x015a:
            return
        L_0x015b:
            if (r2 != 0) goto L_0x0160
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ IOException -> 0x016b }
        L_0x0160:
            r2.close()     // Catch:{ IOException -> 0x016b }
            if (r4 != 0) goto L_0x0168
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ IOException -> 0x016b }
        L_0x0168:
            r4.close()     // Catch:{ IOException -> 0x016b }
        L_0x016b:
            goto L_0x016d
        L_0x016c:
            throw r9
        L_0x016d:
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.backend.network.DownloadClient.saveFile(java.lang.String, java.lang.String, okhttp3.Response):void");
    }

    private final void putResult(String str, Object obj) {
        if (this.mResult.containsKey(str)) {
            this.mSameUrlCount++;
            if (obj == null) {
                return;
            }
            if (!(obj instanceof String) || !TextUtils.isEmpty((CharSequence) obj)) {
                this.mResult.put(str, obj);
                return;
            }
            return;
        }
        this.mResult.put(str, obj);
    }

    private final void checkDownloadProgress() {
        if (isFinished()) {
            Log.debug(TAG, "download done");
            this.mCallback.onDownloadFinished(this.mResult);
        }
    }

    public final boolean isFinished() {
        return this.mResult.size() + this.mSameUrlCount == this.mUrls.size();
    }

    /* access modifiers changed from: private */
    public final void checkValidity() {
        if (this.mUrls.isEmpty()) {
            this.mCallback.onDownloadFinished(this.mResult);
        }
        if (this.mDownloadType == 0) {
            if (this.mFilePaths == null) {
                this.mCallback.onDownloadFinished(this.mResult);
            }
            int size = this.mUrls.size();
            List<String> list = this.mFilePaths;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            if (size != list.size()) {
                this.mCallback.onDownloadFinished(this.mResult);
            }
        }
    }
}
