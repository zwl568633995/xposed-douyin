package com.xp.wx.spellbook.douyin.hookers;

import com.xp.api.XC_MethodHook;
import com.xp.api.XposedHelpers;
import com.xp.wx.spellbook.douyin.DyGlobal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* compiled from: TestHook.kt */
final class TestHook$TestHooker$1 extends Lambda implements Function0<Unit> {
    public static final TestHook$TestHooker$1 INSTANCE = new TestHook$TestHooker$1();

    TestHook$TestHooker$1() {
        super(0);
    }

    public final void invoke() {
        ClassLoader dyLoader = DyGlobal.INSTANCE.getDyLoader();
        if (dyLoader == null) {
            Intrinsics.throwNpe();
        }
        XposedHelpers.findAndHookMethod("com.ss.android.ugc.aweme.live.LivePlayActivity", dyLoader, "onResume", new Object[]{new XC_MethodHook() {
            /* access modifiers changed from: protected */
            public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
                Intrinsics.checkParameterIsNotNull(methodHookParam, "p");
                new Thread(new TestHook$TestHooker$1$1$afterHookedMethod$1(methodHookParam)).start();
            }
        }});
        ClassLoader dyLoader2 = DyGlobal.INSTANCE.getDyLoader();
        if (dyLoader2 == null) {
            Intrinsics.throwNpe();
        }
        XposedHelpers.findAndHookMethod("com.bytedance.retrofit2.SsHttpCall", dyLoader2, "execute", new Object[]{new XC_MethodHook() {
            /* access modifiers changed from: protected */
            public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
                TestHook$TestHooker$1.super.afterHookedMethod(methodHookParam);
            }
        }});
        ClassLoader dyLoader3 = DyGlobal.INSTANCE.getDyLoader();
        if (dyLoader3 == null) {
            Intrinsics.throwNpe();
        }
        XposedHelpers.findAndHookMethod("com.bytedance.retrofit2.SsHttpCall", dyLoader3, "enqueue", new Object[]{XposedHelpers.findClass("com.bytedance.retrofit2.c", DyGlobal.INSTANCE.getDyLoader()), new XC_MethodHook() {
            /* access modifiers changed from: protected */
            public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
                TestHook$TestHooker$1.super.afterHookedMethod(methodHookParam);
            }
        }});
    }
}
