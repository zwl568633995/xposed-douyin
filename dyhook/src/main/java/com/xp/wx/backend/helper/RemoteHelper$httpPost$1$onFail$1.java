package com.xp.wx.backend.helper;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
final class RemoteHelper$httpPost$1$onFail$1 implements Runnable {
    final /* synthetic */ String $errMsg;
    final /* synthetic */ RemoteHelper$httpPost$1 this$0;

    RemoteHelper$httpPost$1$onFail$1(RemoteHelper$httpPost$1 remoteHelper$httpPost$1, String str) {
        this.this$0 = remoteHelper$httpPost$1;
        this.$errMsg = str;
    }

    public final void run() {
        this.this$0.$callback.onFail(this.$errMsg);
    }
}
