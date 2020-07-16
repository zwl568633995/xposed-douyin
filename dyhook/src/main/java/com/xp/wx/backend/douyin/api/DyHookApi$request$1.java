package com.xp.wx.backend.douyin.api;

import com.xp.wx.backend.douyin.api.DyHookApi;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyHookApi.kt */
final class DyHookApi$request$1 implements Runnable {
    final /* synthetic */ DyHookApi.CommonResponseCallback $callback;

    DyHookApi$request$1(DyHookApi.CommonResponseCallback commonResponseCallback) {
        this.$callback = commonResponseCallback;
    }

    public final void run() {
        this.$callback.onFailed(new IllegalArgumentException("request == null!"));
    }
}
