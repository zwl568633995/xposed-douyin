package com.xp.wx.backend.network;

import android.text.TextUtils;
import com.xp.wx.backend.network.UploadFileHelper;
import com.xp.wx.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/xp/wx/backend/network/UploadFileHelper$uploadFiles$2$complete$1", "Lcom/xp/wx/backend/network/UploadFileHelper$OnTokenRefreshCallback;", "onRefresh", "", "token", "", "expire", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: UploadFileHelper.kt */
public final class UploadFileHelper$uploadFiles$2$complete$1 implements UploadFileHelper.OnTokenRefreshCallback {
    final /* synthetic */ UploadFileHelper$uploadFiles$2 this$0;

    UploadFileHelper$uploadFiles$2$complete$1(UploadFileHelper$uploadFiles$2 uploadFileHelper$uploadFiles$2) {
        this.this$0 = uploadFileHelper$uploadFiles$2;
    }

    public void onRefresh(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        if (TextUtils.isEmpty(str)) {
            this.this$0.$callback.onComplete(this.this$0.$result);
            return;
        }
        UploadFileHelper.INSTANCE.saveToken(str, j);
        Log.debug(UploadFileHelper.TAG, "token refreshed");
        UploadFileHelper.INSTANCE.uploadFiles(this.this$0.$pathList, this.this$0.$nameList, this.this$0.$callback);
    }
}
