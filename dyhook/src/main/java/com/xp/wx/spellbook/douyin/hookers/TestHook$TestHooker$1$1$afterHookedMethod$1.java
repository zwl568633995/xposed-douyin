package com.xp.wx.spellbook.douyin.hookers;

import com.xp.api.XC_MethodHook;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: TestHook.kt */
final class TestHook$TestHooker$1$1$afterHookedMethod$1 implements Runnable {
    final /* synthetic */ XC_MethodHook.MethodHookParam $p;

    TestHook$TestHooker$1$1$afterHookedMethod$1(XC_MethodHook.MethodHookParam methodHookParam) {
        this.$p = methodHookParam;
    }

    public final void run() {
        Object obj = this.$p.thisObject;
    }
}
