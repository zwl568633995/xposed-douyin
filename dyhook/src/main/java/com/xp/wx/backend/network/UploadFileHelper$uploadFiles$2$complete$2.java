package com.xp.wx.backend.network;

import com.qiniu.android.http.ResponseInfo;
import com.qiniu.android.storage.UpCompletionHandler;
import com.xp.wx.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "_key", "", "kotlin.jvm.PlatformType", "_info", "Lcom/qiniu/android/http/ResponseInfo;", "<anonymous parameter 2>", "Lorg/json/JSONObject;", "complete"}, k = 3, mv = {1, 1, 13})
/* compiled from: UploadFileHelper.kt */
final class UploadFileHelper$uploadFiles$2$complete$2 implements UpCompletionHandler {
    final /* synthetic */ ResponseInfo $info;
    final /* synthetic */ String $otherPath;
    final /* synthetic */ UploadFileHelper$uploadFiles$2 this$0;

    UploadFileHelper$uploadFiles$2$complete$2(UploadFileHelper$uploadFiles$2 uploadFileHelper$uploadFiles$2, ResponseInfo responseInfo, String str) {
        this.this$0 = uploadFileHelper$uploadFiles$2;
        this.$info = responseInfo;
        this.$otherPath = str;
    }

    public final void complete(String str, ResponseInfo responseInfo, JSONObject jSONObject) {
        String access$getTAG$p = UploadFileHelper.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("upload finish. code = ");
        sb.append(Integer.valueOf(responseInfo != null ? responseInfo.statusCode : -1));
        sb.append(", err = ");
        sb.append(responseInfo != null ? responseInfo.error : null);
        Log.debug(access$getTAG$p, sb.toString());
        ResponseInfo responseInfo2 = this.$info;
        if (responseInfo2 == null || responseInfo2.statusCode != 200) {
            this.this$0.$result.put(this.$otherPath, "");
        } else {
            String str2 = this.$otherPath;
            UploadFileHelper uploadFileHelper = UploadFileHelper.INSTANCE;
            Intrinsics.checkExpressionValueIsNotNull(str, "_key");
            Intrinsics.checkExpressionValueIsNotNull(responseInfo, "_info");
            this.this$0.$result.put(str2, uploadFileHelper.getUrl(str, responseInfo));
        }
        String access$getTAG$p2 = UploadFileHelper.TAG;
        Log.debug(access$getTAG$p2, "upload success. localPath = " + this.$otherPath + ", serverPath = " + ((String) this.this$0.$result.get(this.$otherPath)));
        if (this.this$0.$result.size() == this.this$0.$pathList.size()) {
            Log.debug(UploadFileHelper.TAG, "upload complete");
            this.this$0.$callback.onComplete(this.this$0.$result);
        }
    }
}
