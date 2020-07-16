package com.xp.wx.backend.helper;

import com.xp.wx.util.Log;
import com.xp.wx.util.OkHttpClientUtil;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
final class RemoteHelper$httpPost$2 implements Runnable {
    final /* synthetic */ String $baseUrl;
    final /* synthetic */ OkHttpClientUtil.Callback $callback;
    final /* synthetic */ Map $headers;
    final /* synthetic */ Map $params;
    final /* synthetic */ String $url;

    RemoteHelper$httpPost$2(String str, String str2, Map map, Map map2, OkHttpClientUtil.Callback callback) {
        this.$baseUrl = str;
        this.$url = str2;
        this.$params = map;
        this.$headers = map2;
        this.$callback = callback;
    }

    public final void run() {
        try {
            RemoteHelper.INSTANCE.getRemote().httpPost(this.$baseUrl, this.$url, this.$params, this.$headers, this.$callback);
        } catch (Throwable th) {
            Log.warn("httpPost error. " + th.getMessage() + ", " + android.util.Log.getStackTraceString(th));
        }
    }
}
