package com.xp.wx.backend.network;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: DownloadClient.kt */
final class DownloadClient$downloadWithByteData$1 implements Runnable {
    final /* synthetic */ DownloadClient this$0;

    DownloadClient$downloadWithByteData$1(DownloadClient downloadClient) {
        this.this$0 = downloadClient;
    }

    public final void run() {
        this.this$0.checkValidity();
        int size = this.this$0.mUrls.size();
        for (int i = 0; i < size; i++) {
            DownloadClient downloadClient = this.this$0;
            downloadClient.download((String) downloadClient.mUrls.get(i), (String) null);
        }
    }
}
