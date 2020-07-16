package com.xp.wx.backend.helper;

import android.text.TextUtils;
import com.xp.wx.backend.network.UploadFileHelper;
import com.xp.wx.backend.remote.BaseRemote;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016¨\u0006\b"}, d2 = {"com/xp/wx/backend/helper/RemoteHelper$uploadFiles$1", "Lcom/xp/wx/backend/network/UploadFileHelper$Callback;", "onComplete", "", "result", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: RemoteHelper.kt */
public final class RemoteHelper$uploadFiles$1 implements UploadFileHelper.Callback {
    final /* synthetic */ BaseRemote.Callback $callback;
    final /* synthetic */ ArrayList $nameList;
    final /* synthetic */ ArrayList $pathList;

    RemoteHelper$uploadFiles$1(ArrayList arrayList, ArrayList arrayList2, BaseRemote.Callback callback) {
        this.$pathList = arrayList;
        this.$nameList = arrayList2;
        this.$callback = callback;
    }

    public void onComplete(HashMap<String, String> hashMap) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(hashMap, "result");
        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                if (!TextUtils.isEmpty((CharSequence) it.next().getValue())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            RemoteHelper.INSTANCE.getRemote().getRemoteHandler().post(new RemoteHelper$uploadFiles$1$onComplete$1(this));
        } else {
            this.$callback.onComplete(hashMap);
        }
    }
}
