package com.xp.wx.spellbook.douyin;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyGlobal.kt */
final class DyGlobal$listenLogout$1$afterHookedMethod$1 implements Runnable {
    public static final DyGlobal$listenLogout$1$afterHookedMethod$1 INSTANCE = new DyGlobal$listenLogout$1$afterHookedMethod$1();

    DyGlobal$listenLogout$1$afterHookedMethod$1() {
    }

    public final void run() {
        Thread.sleep(5000);
        DyGlobal.INSTANCE.initUserInfo();
    }
}
