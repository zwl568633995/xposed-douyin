package com.xp.wx.backend.douyin.api;

import com.xp.api.XposedHelpers;
import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.backend.douyin.model.PromotionResponse;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.livecommerce.h.Classes;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.livecommerce.h.Fields;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.livecommerce.h.Methods;
import com.xp.wx.util.HandlerUtil;
import com.xp.wx.util.JsonUtil;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyHookApi.kt */
final class DyHookApi$getLivePromotions$1 implements Runnable {
    final /* synthetic */ String $author_id;
    final /* synthetic */ DyHookApi.CommonResponseCallback $callback;
    final /* synthetic */ String $room_id;
    final /* synthetic */ String $sec_author_id;

    DyHookApi$getLivePromotions$1(String str, String str2, String str3, DyHookApi.CommonResponseCallback commonResponseCallback) {
        this.$author_id = str;
        this.$sec_author_id = str2;
        this.$room_id = str3;
        this.$callback = commonResponseCallback;
    }

    public final void run() {
        try {
            Object newInstance = XposedHelpers.newInstance(Classes.INSTANCE.getClassLivesdkLivecommerceHD(), new Object[0]);
            Object invoke = Methods.INSTANCE.getFunLivesdkLivecommerceHB_a().invoke((Object) null, new Object[]{"author_id", this.$author_id});
            Methods.INSTANCE.getFunLivesdkLivecommerceHD_add().invoke(newInstance, new Object[]{invoke});
            Object invoke2 = Methods.INSTANCE.getFunLivesdkLivecommerceHB_a().invoke((Object) null, new Object[]{"sec_author_id", this.$sec_author_id});
            Methods.INSTANCE.getFunLivesdkLivecommerceHD_add().invoke(newInstance, new Object[]{invoke2});
            Object invoke3 = Methods.INSTANCE.getFunLivesdkLivecommerceHB_a().invoke((Object) null, new Object[]{"room_id", this.$room_id});
            Methods.INSTANCE.getFunLivesdkLivecommerceHD_add().invoke(newInstance, new Object[]{invoke3});
            Object invoke4 = com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.livecommerce.b.Methods.INSTANCE.getFunLivesdkLivecommerceB_o_c().invoke((Object) null, new Object[0]);
            Object invoke5 = Methods.INSTANCE.getFunLivesdkLivecommerceHB_a().invoke((Object) null, new Object[]{"entrance_info", invoke4});
            Methods.INSTANCE.getFunLivesdkLivecommerceHD_add().invoke(newInstance, new Object[]{invoke5});
            Object invoke6 = Methods.INSTANCE.getFunLivesdkLivecommerceHB_a().invoke((Object) null, new Object[]{"first_enter", "false"});
            Methods.INSTANCE.getFunLivesdkLivecommerceHD_add().invoke(newInstance, new Object[]{invoke6});
            Object obj = Fields.INSTANCE.getClassLivesdkLivecommerceHA_d().get((Object) null);
            final PromotionResponse promotionResponse = (PromotionResponse) JsonUtil.parseJson((String) Methods.INSTANCE.getClassLivesdkLivecommerceHC_b().invoke((Object) null, new Object[]{obj, newInstance}), PromotionResponse.class);
            HandlerUtil.getMainHandler().post(new Runnable(this) {
                final /* synthetic */ DyHookApi$getLivePromotions$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    this.this$0.$callback.onSuccess(promotionResponse);
                }
            });
        } catch (InvocationTargetException e) {
            HandlerUtil.getMainHandler().post(new Runnable(this) {
                final /* synthetic */ DyHookApi$getLivePromotions$1 this$0;

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
