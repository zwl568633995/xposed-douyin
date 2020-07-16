package com.xp.wx.backend.douyin.util;

import com.xp.wx.backend.douyin.model.DyConfig;
import com.xp.wx.backend.network.HDConfigResponse;
import com.xp.wx.util.Log;
import com.xp.wx.util.OkHttpClientUtil;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/xp/wx/backend/douyin/util/ConfigUtil$initConfig$1", "Lcom/xp/wx/util/OkHttpClientUtil$ResponseCallback;", "Lcom/xp/wx/backend/network/HDConfigResponse;", "onComplete", "", "result", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ConfigUtil.kt */
public final class ConfigUtil$initConfig$1 implements OkHttpClientUtil.ResponseCallback<HDConfigResponse> {
    ConfigUtil$initConfig$1() {
    }

    public void onComplete(HDConfigResponse hDConfigResponse) {
        if (hDConfigResponse == null || hDConfigResponse.status != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("sync cofig error: ");
            sb.append(hDConfigResponse != null ? hDConfigResponse.msg : null);
            Log.warn(sb.toString());
            return;
        }
        ConfigUtil.INSTANCE.updateDyConfig((DyConfig) hDConfigResponse.data);
        ConfigUtil.INSTANCE.updateDyConfigLocalFile();
        Log.debug("initConfig from server");
    }
}
