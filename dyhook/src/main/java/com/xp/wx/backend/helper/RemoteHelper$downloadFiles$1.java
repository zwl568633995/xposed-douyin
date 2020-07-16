package com.xp.wx.backend.helper;

import com.xp.wx.backend.network.DownloadClient;
import com.xp.wx.util.DownloadClient;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\bH\u0016¨\u0006\t"}, d2 = {"com/xp/wx/backend/helper/RemoteHelper$downloadFiles$1", "Lcom/xp/wx/backend/network/DownloadClient$DownloadCallback;", "onDownloadFinished", "", "result", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
public final class RemoteHelper$downloadFiles$1 implements DownloadClient.DownloadCallback {
    final /* synthetic */ DownloadClient.DownloadCallback $callback;

    RemoteHelper$downloadFiles$1(DownloadClient.DownloadCallback downloadCallback) {
        this.$callback = downloadCallback;
    }

    public void onDownloadFinished(HashMap<String, Object> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "result");
        this.$callback.onDownloadFinished(hashMap);
    }
}
