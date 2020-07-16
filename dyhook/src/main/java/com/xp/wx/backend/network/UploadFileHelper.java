package com.xp.wx.backend.network;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.qiniu.android.common.FixedZone;
import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.Configuration;
import com.qiniu.android.storage.KeyGenerator;
import com.qiniu.android.storage.Recorder;
import com.qiniu.android.storage.UpCompletionHandler;
import com.qiniu.android.storage.UploadManager;
import com.qiniu.android.storage.UploadOptions;
import com.qiniu.android.storage.persistent.FileRecorder;
import com.xp.wx.Global;
import com.xp.wx.GlobalConst;
import com.xp.wx.spellbook.base.BaseGlobal;
import com.xp.wx.util.Log;
import com.xp.wx.util.SharedPreferenceUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002)*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020#H\u0002J*\u0010$\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u001e\u001a\u00020(R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xp/wx/backend/network/UploadFileHelper;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "keyGen", "Lcom/qiniu/android/storage/KeyGenerator;", "getKeyGen", "()Lcom/qiniu/android/storage/KeyGenerator;", "mConfig", "Lcom/qiniu/android/storage/Configuration;", "mHost", "mToken", "mTokenExpireTime", "", "mUploadManager", "Lcom/qiniu/android/storage/UploadManager;", "getRecorder", "Lcom/qiniu/android/storage/Recorder;", "getUrl", "key", "info", "Lcom/qiniu/android/http/ResponseInfo;", "initToken", "", "saveToken", "token", "expire", "updateToken", "callback", "Lcom/xp/wx/backend/network/UploadFileHelper$OnTokenRefreshCallback;", "uploadFile", "path", "name", "Lcom/qiniu/android/storage/UpCompletionHandler;", "uploadFiles", "pathList", "", "nameList", "Lcom/xp/wx/backend/network/UploadFileHelper$Callback;", "Callback", "OnTokenRefreshCallback", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: UploadFileHelper.kt */
public final class UploadFileHelper {
    public static final UploadFileHelper INSTANCE;
    /* access modifiers changed from: private */
    public static final String TAG = GlobalConst.TAG;
    private static final KeyGenerator keyGen = UploadFileHelper$keyGen$1.INSTANCE;
    private static final Configuration mConfig;
    private static final String mHost = "http://mission-treasure.wujieshuju.com";
    private static String mToken = "";
    private static long mTokenExpireTime;
    private static final UploadManager mUploadManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007H&¨\u0006\b"}, d2 = {"Lcom/xp/wx/backend/network/UploadFileHelper$Callback;", "", "onComplete", "", "result", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: UploadFileHelper.kt */
    public interface Callback {
        void onComplete(HashMap<String, String> hashMap);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xp/wx/backend/network/UploadFileHelper$OnTokenRefreshCallback;", "", "onRefresh", "", "token", "", "expire", "", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: UploadFileHelper.kt */
    public interface OnTokenRefreshCallback {
        void onRefresh(String str, long j);
    }

    static {
        UploadFileHelper uploadFileHelper = new UploadFileHelper();
        INSTANCE = uploadFileHelper;
        Configuration build = new Configuration.Builder().responseTimeout(60).zone(FixedZone.zone2).recorder(uploadFileHelper.getRecorder(), keyGen).build();
        mConfig = build;
        mUploadManager = new UploadManager(build);
    }

    private UploadFileHelper() {
    }

    public final KeyGenerator getKeyGen() {
        return keyGen;
    }

    private final Recorder getRecorder() {
        try {
            return new FileRecorder(Global.UPLOAD_PATH);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void uploadFiles(List<String> list, List<String> list2, Callback callback) {
        Intrinsics.checkParameterIsNotNull(list, "pathList");
        Intrinsics.checkParameterIsNotNull(list2, "nameList");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        if (list.isEmpty() || list2.isEmpty()) {
            throw new IllegalArgumentException("pathList or nameList is empty");
        } else if (list.size() == list2.size()) {
            if (TextUtils.isEmpty(mToken)) {
                initToken();
            }
            if (System.currentTimeMillis() / ((long) 1000) >= mTokenExpireTime) {
                Log.debug(TAG, "token is expired and refresh");
                updateToken(new UploadFileHelper$uploadFiles$1(callback, list, list2));
                return;
            }
            Log.debug(TAG, "start upload");
            HashMap hashMap = new HashMap();
            String str = list.get(0);
            uploadFile(str, list2.get(0), new UploadFileHelper$uploadFiles$2(callback, hashMap, list, list2, str));
        } else {
            throw new IllegalArgumentException("pathList.size != nameList.size");
        }
    }

    private final void initToken() {
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.INSTANCE;
        BaseGlobal global = Global.INSTANCE.getGlobal();
        if (global == null) {
            Intrinsics.throwNpe();
        }
        SharedPreferences sharedPreference = sharedPreferenceUtil.getSharedPreference(global.getContext());
        String string = sharedPreference.getString("qiniu_token", "");
        if (string != null) {
            mToken = string;
            mTokenExpireTime = sharedPreference.getLong("qiniu_expire", 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    /* access modifiers changed from: private */
    public final void saveToken(String str, long j) {
        mToken = str;
        mTokenExpireTime = j;
        SharedPreferenceUtil sharedPreferenceUtil = SharedPreferenceUtil.INSTANCE;
        BaseGlobal global = Global.INSTANCE.getGlobal();
        if (global == null) {
            Intrinsics.throwNpe();
        }
        sharedPreferenceUtil.getSharedPreference(global.getContext()).edit().putString("qiniu_token", str).putLong("qiniu_expire", j).apply();
    }

    /* access modifiers changed from: private */
    public final String getUrl(String str, ResponseInfo responseInfo) {
        return "http://mission-treasure.wujieshuju.com/" + str;
    }

    /* access modifiers changed from: private */
    public final void uploadFile(String str, String str2, UpCompletionHandler upCompletionHandler) {
        mUploadManager.put(str, str2, mToken, upCompletionHandler, (UploadOptions) null);
    }

    /* access modifiers changed from: private */
    public final void updateToken(OnTokenRefreshCallback onTokenRefreshCallback) {
        OkHttpClientUtil.getInstance().post(Global.URL_QINIU_TOKEN, new HashMap(), new UploadFileHelper$updateToken$1(onTokenRefreshCallback));
    }
}
