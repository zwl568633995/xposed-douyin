package com.xp.wx.backend.network;

import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.UpCompletionHandler;
import com.xp.wx.backend.network.UploadFileHelper;
import com.xp.wx.util.Log;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/xp/wx/backend/network/UploadFileHelper$uploadFiles$2", "Lcom/qiniu/android/storage/UpCompletionHandler;", "complete", "", "key", "", "info", "Lcom/qiniu/android/http/ResponseInfo;", "response", "Lorg/json/JSONObject;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: UploadFileHelper.kt */
public final class UploadFileHelper$uploadFiles$2 implements UpCompletionHandler {
    final /* synthetic */ UploadFileHelper.Callback $callback;
    final /* synthetic */ List $nameList;
    final /* synthetic */ String $path;
    final /* synthetic */ List $pathList;
    final /* synthetic */ HashMap $result;

    UploadFileHelper$uploadFiles$2(UploadFileHelper.Callback callback, HashMap hashMap, List list, List list2, String str) {
        this.$callback = callback;
        this.$result = hashMap;
        this.$pathList = list;
        this.$nameList = list2;
        this.$path = str;
    }

    public void complete(String str, ResponseInfo responseInfo, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (responseInfo == null || responseInfo.statusCode != 401) {
            String access$getTAG$p = UploadFileHelper.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("upload finish. code = ");
            sb.append(Integer.valueOf(responseInfo != null ? responseInfo.statusCode : -1));
            sb.append(", err = ");
            sb.append(responseInfo != null ? responseInfo.error : null);
            Log.debug(access$getTAG$p, sb.toString());
            if (responseInfo == null || responseInfo.statusCode != 200) {
                this.$result.put(this.$path, "");
            } else {
                this.$result.put(this.$path, UploadFileHelper.INSTANCE.getUrl(str, responseInfo));
            }
            String access$getTAG$p2 = UploadFileHelper.TAG;
            Log.debug(access$getTAG$p2, "upload success. localPath = " + this.$path + ", serverPath = " + ((String) this.$result.get(this.$path)));
            if (this.$pathList.size() == 1) {
                Log.debug(UploadFileHelper.TAG, "upload complete");
                this.$callback.onComplete(this.$result);
                return;
            }
            int size = this.$pathList.size();
            for (int i = 1; i < size; i++) {
                String str2 = (String) this.$pathList.get(i);
                UploadFileHelper.INSTANCE.uploadFile(str2, (String) this.$nameList.get(i), new UploadFileHelper$uploadFiles$2$complete$2(this, responseInfo, str2));
            }
            return;
        }
        Log.debug(UploadFileHelper.TAG, "token is expired and refresh");
        UploadFileHelper.INSTANCE.updateToken(new UploadFileHelper$uploadFiles$2$complete$1(this));
    }
}
