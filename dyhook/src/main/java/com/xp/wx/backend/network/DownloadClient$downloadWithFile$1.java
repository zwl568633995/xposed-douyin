package com.xp.wx.backend.network;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: DownloadClient.kt */
final class DownloadClient$downloadWithFile$1 implements Runnable {
    final /* synthetic */ boolean $filterExistsFile;
    final /* synthetic */ DownloadClient this$0;

    DownloadClient$downloadWithFile$1(DownloadClient downloadClient, boolean z) {
        this.this$0 = downloadClient;
        this.$filterExistsFile = z;
    }

    public final void run() {
        this.this$0.checkValidity();
        this.this$0.startDownloadFile(this.$filterExistsFile);
    }
}
