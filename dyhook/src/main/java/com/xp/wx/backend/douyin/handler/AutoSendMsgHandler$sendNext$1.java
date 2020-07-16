package com.xp.wx.backend.douyin.handler;

import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.following.a.Fields;
import com.xp.wx.spellbook.douyin.model.User;
import com.xp.wx.util.Log;
import com.xp.wx.util.SharedPreferenceUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/xp/wx/backend/douyin/handler/AutoSendMsgHandler$sendNext$1", "Lcom/xp/wx/backend/douyin/api/DyHookApi$CommonResponseCallback;", "onFailed", "", "e", "", "onSuccess", "data", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: AutoSendMsgHandler.kt */
public final class AutoSendMsgHandler$sendNext$1 implements DyHookApi.CommonResponseCallback {
    final /* synthetic */ User $currUser;

    AutoSendMsgHandler$sendNext$1(User user) {
        this.$currUser = user;
    }

    public void onSuccess(Object obj) {
        if (obj != null) {
            AutoSendMsgHandler.errorCount = 0;
            long access$getMaxTime$p = AutoSendMsgHandler.maxTime;
            AutoSendMsgHandler.INSTANCE.setMaxTime(Fields.INSTANCE.getClassFollowingC_minTime().getLong(obj));
            SharedPreferenceUtil.INSTANCE.saveAutoSendMsgLoginUid(Long.parseLong(this.$currUser.getUid()));
            if (access$getMaxTime$p == 0) {
                DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
                if (hookApi == null) {
                    Intrinsics.throwNpe();
                }
                hookApi.getFollowerList(Long.parseLong(this.$currUser.getUid()), this.$currUser.getSecUid(), AutoSendMsgHandler.maxTime, this);
                return;
            }
            AutoSendMsgHandler.currentFollowers = (ArrayList) Fields.INSTANCE.getClassFollowingC_followers().get(obj);
            AutoSendMsgHandler.INSTANCE.setCurrentIndex(0);
            AutoSendMsgHandler.INSTANCE.findFollowerAndSendMsg();
            return;
        }
        Log.error("AutoSendMsg. getFollowerList error, data = null");
        AutoSendMsgHandler autoSendMsgHandler = AutoSendMsgHandler.INSTANCE;
        AutoSendMsgHandler.errorCount = AutoSendMsgHandler.errorCount + 1;
        Log.debug("AutoSendMsg. errorCount = " + AutoSendMsgHandler.errorCount);
        if (AutoSendMsgHandler.errorCount <= 10) {
            AutoSendMsgHandler.INSTANCE.sendNextDelayed();
        } else {
            AutoSendMsgHandler.stop$default(AutoSendMsgHandler.INSTANCE, 0, 1, (Object) null);
        }
    }

    public void onFailed(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("AutoSendMsg. getFollowerList error, ");
        sb.append(th != null ? th.getMessage() : null);
        Log.error(sb.toString());
        AutoSendMsgHandler autoSendMsgHandler = AutoSendMsgHandler.INSTANCE;
        AutoSendMsgHandler.errorCount = AutoSendMsgHandler.errorCount + 1;
        Log.debug("AutoSendMsg. errorCount = " + AutoSendMsgHandler.errorCount);
        if (AutoSendMsgHandler.errorCount <= 10) {
            AutoSendMsgHandler.INSTANCE.sendNextDelayed();
        } else {
            AutoSendMsgHandler.stop$default(AutoSendMsgHandler.INSTANCE, 0, 1, (Object) null);
        }
    }
}
