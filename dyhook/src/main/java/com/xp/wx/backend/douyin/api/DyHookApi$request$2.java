package com.xp.wx.backend.douyin.api;

import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.retrofit2.Methods;
import com.xp.wx.util.HandlerUtil;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyHookApi.kt */
final class DyHookApi$request$2 implements Runnable {
    final /* synthetic */ DyHookApi.CommonResponseCallback $callback;
    final /* synthetic */ Object $ssHttpCall;

    DyHookApi$request$2(Object obj, DyHookApi.CommonResponseCallback commonResponseCallback) {
        this.$ssHttpCall = obj;
        this.$callback = commonResponseCallback;
    }

    public final void run() {
        try {
            final Object invoke = Methods.INSTANCE.getClassCall_execute().invoke(this.$ssHttpCall, new Object[0]);
            HandlerUtil.getMainHandler().post(new Runnable(this) {
                final /* synthetic */ DyHookApi$request$2 this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    Object invoke = Methods.INSTANCE.getClassSsResponse_isSuccessful().invoke(invoke, new Object[0]);
                    if (invoke == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                    } else if (((Boolean) invoke).booleanValue()) {
                        this.this$0.$callback.onSuccess(Methods.INSTANCE.getClassSsResponse_body().invoke(invoke, new Object[0]));
                    }
                }
            });
        } catch (InvocationTargetException e) {
            HandlerUtil.getMainHandler().post(new Runnable(this) {
                final /* synthetic */ DyHookApi$request$2 this$0;

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
