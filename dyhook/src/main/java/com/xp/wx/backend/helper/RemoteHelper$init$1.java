package com.xp.wx.backend.helper;

import com.xp.wx.backend.network.OkHttpClientUtil;
import com.xp.wx.util.Log;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/xp/wx/backend/helper/RemoteHelper$init$1", "Lcom/xp/wx/backend/network/OkHttpClientUtil$Callback;", "onComplete", "", "result", "", "onFail", "errMsg", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
public final class RemoteHelper$init$1 implements OkHttpClientUtil.Callback {
    RemoteHelper$init$1() {
    }

    public void onFail(String str) {
        RemoteHelper.INSTANCE.setCanUseOkhttp(true);
        Log.debug("RemoteHelper. test use http success");
    }

    public void onComplete(String str) {
        RemoteHelper.INSTANCE.setCanUseOkhttp(true);
        Log.debug("RemoteHelper. test use http success");
    }
}
