package com.xp.wx.backend.helper;

import com.xp.wx.backend.remote.BaseRemote;
import com.xp.wx.util.Log;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
final class RemoteHelper$uploadFiles$2 implements Runnable {
    final /* synthetic */ BaseRemote.Callback $callback;
    final /* synthetic */ ArrayList $nameList;
    final /* synthetic */ ArrayList $pathList;

    RemoteHelper$uploadFiles$2(ArrayList arrayList, ArrayList arrayList2, BaseRemote.Callback callback) {
        this.$pathList = arrayList;
        this.$nameList = arrayList2;
        this.$callback = callback;
    }

    public final void run() {
        try {
            RemoteHelper.INSTANCE.getRemote().uploadFiles(this.$pathList, this.$nameList, this.$callback);
        } catch (Throwable th) {
            Log.warn("uploadFiles error. " + th.getMessage() + ", " + android.util.Log.getStackTraceString(th));
        }
    }
}
