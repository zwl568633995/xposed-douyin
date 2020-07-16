package com.xp.wx.backend.network;

import android.text.TextUtils;
import com.xp.wx.backend.network.OkHttpClientUtil;
import com.xp.wx.backend.network.UploadFileHelper;
import com.xp.wx.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/xp/wx/backend/network/UploadFileHelper$updateToken$1", "Lcom/xp/wx/backend/network/OkHttpClientUtil$Callback;", "onComplete", "", "result", "", "onFail", "errMsg", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: UploadFileHelper.kt */
public final class UploadFileHelper$updateToken$1 implements OkHttpClientUtil.Callback {
    final /* synthetic */ UploadFileHelper.OnTokenRefreshCallback $callback;

    UploadFileHelper$updateToken$1(UploadFileHelper.OnTokenRefreshCallback onTokenRefreshCallback) {
        this.$callback = onTokenRefreshCallback;
    }

    public void onFail(String str) {
        String access$getTAG$p = UploadFileHelper.TAG;
        Log.error(access$getTAG$p, "refresh token error: " + str);
        this.$callback.onRefresh("", 0);
    }

    public void onComplete(String str) {
        if (str == null) {
            onFail("数据为空");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (jSONObject == null) {
                onFail("data为空");
                return;
            }
            String string = jSONObject.getString("token");
            long j = jSONObject.getLong("expire");
            if (TextUtils.isEmpty(string)) {
                onFail("token为空");
                return;
            }
            UploadFileHelper.OnTokenRefreshCallback onTokenRefreshCallback = this.$callback;
            Intrinsics.checkExpressionValueIsNotNull(string, "token");
            onTokenRefreshCallback.onRefresh(string, j);
        } catch (JSONException unused) {
            onFail("服务器异常");
        } catch (Exception unused2) {
            onFail("数据解析异常");
        }
    }
}
