package com.xp.wx.backend.helper;

import com.xp.wx.util.DownloadClient;
import com.xp.wx.util.Log;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
final class RemoteHelper$downloadFiles$2 implements Runnable {
    final /* synthetic */ DownloadClient.DownloadCallback $callback;
    final /* synthetic */ boolean $filterExistsFile;
    final /* synthetic */ ArrayList $pathList;
    final /* synthetic */ ArrayList $savePathList;

    RemoteHelper$downloadFiles$2(ArrayList arrayList, ArrayList arrayList2, boolean z, DownloadClient.DownloadCallback downloadCallback) {
        this.$pathList = arrayList;
        this.$savePathList = arrayList2;
        this.$filterExistsFile = z;
        this.$callback = downloadCallback;
    }

    public final void run() {
        try {
            RemoteHelper.INSTANCE.getRemote().downloadFiles(this.$pathList, this.$savePathList, this.$filterExistsFile, this.$callback);
        } catch (Throwable th) {
            Log.warn("downloadFiles error. " + th.getMessage() + ", " + android.util.Log.getStackTraceString(th));
        }
    }
}
