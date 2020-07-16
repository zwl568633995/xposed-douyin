package com.xp.wx.backend.helper;

import com.xp.wx.util.Log;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
final class RemoteHelper$uploadFiles$1$onComplete$1 implements Runnable {
    final /* synthetic */ RemoteHelper$uploadFiles$1 this$0;

    RemoteHelper$uploadFiles$1$onComplete$1(RemoteHelper$uploadFiles$1 remoteHelper$uploadFiles$1) {
        this.this$0 = remoteHelper$uploadFiles$1;
    }

    public final void run() {
        try {
            RemoteHelper.INSTANCE.getRemote().uploadFiles(this.this$0.$pathList, this.this$0.$nameList, this.this$0.$callback);
        } catch (Throwable th) {
            Log.warn("uploadFiles error. " + th.getMessage() + ", " + android.util.Log.getStackTraceString(th));
        }
    }
}
