package com.xp.wx.backend.douyin.handler;

import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.backend.douyin.helper.DyRecordDBHelper;
import com.xp.wx.util.Log;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/xp/wx/backend/douyin/handler/DyTaskHandler$sendGift$1", "Lcom/xp/wx/backend/douyin/api/DyHookApi$CommonResponseCallback;", "onFailed", "", "e", "", "onSuccess", "data", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyTaskHandler.kt */
public final class DyTaskHandler$sendGift$1 implements DyHookApi.CommonResponseCallback {
    DyTaskHandler$sendGift$1() {
    }

    public void onSuccess(Object obj) {
        Log.debug("sendGift. success");
        DyRecordDBHelper.INSTANCE.insertGiftOnce(1);
    }

    public void onFailed(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("like. fail, ");
        sb.append(th != null ? th.getMessage() : null);
        Log.warn(sb.toString());
    }
}
