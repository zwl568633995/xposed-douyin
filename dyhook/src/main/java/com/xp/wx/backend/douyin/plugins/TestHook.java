package com.xp.wx.backend.douyin.plugins;

import com.xp.wx.spellbook.douyin.interfaces.ITestHook;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/xp/wx/backend/douyin/plugins/TestHook;", "Lcom/xp/wx/spellbook/douyin/interfaces/ITestHook;", "()V", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: TestHook.kt */
public final class TestHook implements ITestHook {
    public static final TestHook INSTANCE = new TestHook();

    private TestHook() {
    }

    public void test() {
        ITestHook.DefaultImpls.test(this);
    }
}
