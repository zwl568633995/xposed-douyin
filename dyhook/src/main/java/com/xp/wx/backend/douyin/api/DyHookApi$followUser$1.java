package com.xp.wx.backend.douyin.api;

import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.feed.Methods;
import com.xp.wx.util.HandlerUtil;
import com.xp.wx.util.StringUtils;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyHookApi.kt */
final class DyHookApi$followUser$1 implements Runnable {
    final /* synthetic */ DyHookApi.CommonResponseCallback $callback;
    final /* synthetic */ String $secUid;
    final /* synthetic */ int $status;
    final /* synthetic */ String $uid;

    DyHookApi$followUser$1(String str, String str2, int i, DyHookApi.CommonResponseCallback commonResponseCallback) {
        this.$uid = str;
        this.$secUid = str2;
        this.$status = i;
        this.$callback = commonResponseCallback;
    }

    public final void run() {
        try {
            Methods.INSTANCE.getClassFeedF_i().invoke((Object) null, new Object[0]);
            final Object invoke = com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.userservice.Methods.INSTANCE.getClassCommonFollowApi_a().invoke((Object) null, new Object[]{this.$uid, this.$secUid, Integer.valueOf(this.$status), 19, 3, "", 13, StringUtils.emptyIfNull((String) Methods.INSTANCE.getClassFeedF_i().invoke((Object) null, new Object[0]))});
            com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.base.api.Methods.INSTANCE.getClassBaseApiBaseResponse_checkValid().invoke(invoke, new Object[0]);
            HandlerUtil.getMainHandler().post(new Runnable(this) {
                final /* synthetic */ DyHookApi$followUser$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    this.this$0.$callback.onSuccess(invoke);
                }
            });
        } catch (InvocationTargetException e) {
            HandlerUtil.getMainHandler().post(new Runnable(this) {
                final /* synthetic */ DyHookApi$followUser$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    this.this$0.$callback.onFailed(e.getTargetException());
                }
            });
        }
    }
}
