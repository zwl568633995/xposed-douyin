package com.xp.wx.spellbook.base;

import android.content.Context;
import com.xp.wx.util.WebSocketUtil;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0003H\u0016¨\u0006\u0011"}, d2 = {"Lcom/xp/wx/spellbook/base/BaseGlobal;", "", "cleanBindInfo", "", "status", "", "getContext", "Landroid/content/Context;", "getLoginUserId", "getLoginUserNickname", "getSocket", "Lcom/xp/wx/util/WebSocketUtil;", "initSocket", "isInitializeChannelDone", "", "isSocketOpen", "sendBindStateChanged", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: BaseGlobal.kt */
public interface BaseGlobal {
    void cleanBindInfo(String str);

    Context getContext();

    String getLoginUserId();

    String getLoginUserNickname();

    WebSocketUtil getSocket();

    void initSocket();

    boolean isInitializeChannelDone();

    boolean isSocketOpen();

    void sendBindStateChanged();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* compiled from: BaseGlobal.kt */
    public static final class DefaultImpls {
        public static void initSocket(BaseGlobal baseGlobal) {
        }

        public static void sendBindStateChanged(BaseGlobal baseGlobal) {
        }

        public static /* synthetic */ void cleanBindInfo$default(BaseGlobal baseGlobal, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "0";
                }
                baseGlobal.cleanBindInfo(str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cleanBindInfo");
        }
    }
}
