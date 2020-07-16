package com.xp.wx.backend;

import com.xp.wx.backend.douyin.plugins.CommonHook;
import com.xp.wx.backend.douyin.plugins.TestHook;
import com.xp.wx.backend.douyin.plugins.UIHook;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"DouyinPlugins", "", "", "getDouyinPlugins", "()Ljava/util/List;", "app_release"}, k = 2, mv = {1, 1, 13})
/* compiled from: WechatPlugins.kt */
public final class WechatPluginsKt {
    private static final List<Object> DouyinPlugins = CollectionsKt.listOf(CommonHook.INSTANCE, UIHook.INSTANCE, TestHook.INSTANCE);

    public static final List<Object> getDouyinPlugins() {
        return DouyinPlugins;
    }
}
