package com.xp.wx.backend.helper;

import com.xp.wx.Global;
import com.xp.wx.backend.network.OkHttpClientUtil;
import com.xp.wx.backend.network.UploadFileHelper;
import com.xp.wx.backend.remote.BaseRemote;
import com.xp.wx.backend.remote.RemoteCompat;
import com.xp.wx.backend.remote.RemoteWithSBox;
import com.xp.wx.util.DownloadClient;
import com.xp.wx.util.Log;
import com.xp.wx.util.OkHttpClientUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018J2\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001d2\u0006\u0010\u0017\u001a\u00020\u001eJH\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\u001eJ*\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001dJ@\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001dJ\u0006\u0010!\u001a\u00020\u0011J*\u0010\"\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020$J\b\u0010\u000f\u001a\u00020\u0011H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/xp/wx/backend/helper/RemoteHelper;", "", "()V", "canUseOkhttp", "", "getCanUseOkhttp", "()Z", "setCanUseOkhttp", "(Z)V", "remote", "Lcom/xp/wx/backend/remote/BaseRemote;", "getRemote", "()Lcom/xp/wx/backend/remote/BaseRemote;", "setRemote", "(Lcom/xp/wx/backend/remote/BaseRemote;)V", "useCompat", "downloadFiles", "", "pathList", "Ljava/util/ArrayList;", "", "savePathList", "filterExistsFile", "callback", "Lcom/xp/wx/util/DownloadClient$DownloadCallback;", "httpPost", "baseUrl", "url", "params", "", "Lcom/xp/wx/util/OkHttpClientUtil$Callback;", "headers", "httpPostSync", "init", "uploadFiles", "nameList", "Lcom/xp/wx/backend/remote/BaseRemote$Callback;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
public final class RemoteHelper {
    public static final RemoteHelper INSTANCE = new RemoteHelper();
    private static boolean canUseOkhttp = false;
    private static BaseRemote remote = (1 != 0 ? new RemoteCompat() : new RemoteWithSBox());
    private static final boolean useCompat = useCompat;

    private RemoteHelper() {
    }

    public final BaseRemote getRemote() {
        return remote;
    }

    public final void setRemote(BaseRemote baseRemote) {
        Intrinsics.checkParameterIsNotNull(baseRemote, "<set-?>");
        remote = baseRemote;
    }

    public final boolean getCanUseOkhttp() {
        return canUseOkhttp;
    }

    public final void setCanUseOkhttp(boolean z) {
        canUseOkhttp = z;
    }

    public final void init() {
        Log.debug("RemoteHelper. init");
        try {
            OkHttpClientUtil.getInstance().post(Global.BASE_URL, "", new HashMap(), new RemoteHelper$init$1());
        } catch (Throwable th) {
            Log.warn("RemoteHelper init error. " + th.getMessage() + ", " + android.util.Log.getStackTraceString(th));
        }
    }

    public final void uploadFiles(ArrayList<String> arrayList, ArrayList<String> arrayList2, BaseRemote.Callback callback) {
        Intrinsics.checkParameterIsNotNull(arrayList, "pathList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "nameList");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        if (canUseOkhttp) {
            UploadFileHelper.INSTANCE.uploadFiles(arrayList, arrayList2, new RemoteHelper$uploadFiles$1(arrayList, arrayList2, callback));
        } else {
            remote.getRemoteHandler().post(new RemoteHelper$uploadFiles$2(arrayList, arrayList2, callback));
        }
    }

    public final void downloadFiles(ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, DownloadClient.DownloadCallback downloadCallback) {
        Intrinsics.checkParameterIsNotNull(arrayList, "pathList");
        Intrinsics.checkParameterIsNotNull(arrayList2, "savePathList");
        Intrinsics.checkParameterIsNotNull(downloadCallback, "callback");
        if (canUseOkhttp) {
            new com.xp.wx.backend.network.DownloadClient(arrayList, arrayList2, new RemoteHelper$downloadFiles$1(downloadCallback)).downloadWithFile(z);
        } else {
            remote.getRemoteHandler().post(new RemoteHelper$downloadFiles$2(arrayList, arrayList2, z, downloadCallback));
        }
    }

    public final void httpPost(String str, String str2, Map<String, String> map, OkHttpClientUtil.Callback callback) {
        Intrinsics.checkParameterIsNotNull(str, "baseUrl");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(map, "params");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        httpPost(str, str2, map, (Map<String, String>) null, callback);
    }

    public final void httpPost(String str, String str2, Map<String, String> map, Map<String, String> map2, OkHttpClientUtil.Callback callback) {
        Intrinsics.checkParameterIsNotNull(str, "baseUrl");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(map, "params");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        if (canUseOkhttp) {
            com.xp.wx.backend.network.OkHttpClientUtil.getInstance().post(str, str2, map, map2, new RemoteHelper$httpPost$1(callback));
            return;
        }
        remote.getRemoteHandler().post(new RemoteHelper$httpPost$2(str, str2, map, map2, callback));
    }

    public final String httpPostSync(String str, String str2, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, "baseUrl");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(map, "params");
        return httpPostSync(str, str2, map, (Map<String, String>) null);
    }

    public final String httpPostSync(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        Intrinsics.checkParameterIsNotNull(str, "baseUrl");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        Intrinsics.checkParameterIsNotNull(map, "params");
        if (canUseOkhttp) {
            String postSync = com.xp.wx.backend.network.OkHttpClientUtil.getInstance().postSync(str, str2, map, map2);
            Intrinsics.checkExpressionValueIsNotNull(postSync, "com.xp.wx.backend.networ…rl, url, params, headers)");
            return postSync;
        }
        try {
            String httpPostSync = remote.httpPostSync(str, str2, map, map2);
            Intrinsics.checkExpressionValueIsNotNull(httpPostSync, "remote.httpPostSync(baseUrl, url, params, headers)");
            return httpPostSync;
        } catch (Throwable th) {
            Log.warn("httpPostSync error. " + th.getMessage() + ", " + android.util.Log.getStackTraceString(th));
            return "远程服务调用失败";
        }
    }

    private final synchronized void useCompat() {
        if (!(remote instanceof RemoteCompat)) {
            remote.destroy();
            remote = new RemoteCompat();
        }
    }
}
