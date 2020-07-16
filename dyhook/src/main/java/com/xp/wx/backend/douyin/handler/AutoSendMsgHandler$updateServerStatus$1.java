package com.xp.wx.backend.douyin.handler;

import com.xp.wx.backend.douyin.model.DyConfig;
import com.xp.wx.backend.douyin.util.ConfigUtil;
import com.xp.wx.backend.network.BaseResponse;
import com.xp.wx.util.Log;
import com.xp.wx.util.OkHttpClientUtil;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/xp/wx/backend/douyin/handler/AutoSendMsgHandler$updateServerStatus$1", "Lcom/xp/wx/util/OkHttpClientUtil$ResponseCallback;", "Lcom/xp/wx/backend/network/BaseResponse;", "", "onComplete", "", "result", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: AutoSendMsgHandler.kt */
public final class AutoSendMsgHandler$updateServerStatus$1 implements OkHttpClientUtil.ResponseCallback<BaseResponse<Object>> {
    final /* synthetic */ int $status;

    AutoSendMsgHandler$updateServerStatus$1(int i) {
        this.$status = i;
    }

    public void onComplete(BaseResponse<Object> baseResponse) {
        DyConfig.StSenFan stSenFan;
        if (baseResponse == null || baseResponse.status != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("AutoSendMsg. /huidouApi/Huidou/MoidfyFuncStatus error = ");
            sb.append(baseResponse != null ? baseResponse.msg : null);
            Log.debug(sb.toString());
            return;
        }
        DyConfig dyConfig = ConfigUtil.INSTANCE.getDyConfig();
        if (!(dyConfig == null || (stSenFan = dyConfig.stSenFan) == null)) {
            stSenFan.status = this.$status;
        }
        ConfigUtil.INSTANCE.updateDyConfigLocalFile();
    }
}
