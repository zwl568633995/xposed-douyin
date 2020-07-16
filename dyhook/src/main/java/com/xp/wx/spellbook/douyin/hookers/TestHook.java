package com.xp.wx.spellbook.douyin.hookers;

import android.support.v4.app.NotificationCompat;
import com.xp.wx.spellbook.base.EventCenter;
import com.xp.wx.spellbook.base.Hooker;
import com.xp.wx.spellbook.douyin.interfaces.ITestHook;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/xp/wx/spellbook/douyin/hookers/TestHook;", "Lcom/xp/wx/spellbook/base/EventCenter;", "()V", "TestHooker", "Lcom/xp/wx/spellbook/base/Hooker;", "interfaces", "", "Ljava/lang/Class;", "getInterfaces", "()Ljava/util/List;", "provideEventHooker", "event", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: TestHook.kt */
public final class TestHook extends EventCenter {
    public static final TestHook INSTANCE = new TestHook();
    private static final Hooker TestHooker = new Hooker(TestHook$TestHooker$1.INSTANCE);

    private TestHook() {
    }

    public List<Class<?>> getInterfaces() {
        return CollectionsKt.listOf(ITestHook.class);
    }

    public Hooker provideEventHooker(String str) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
        if (str.hashCode() == 3556498 && str.equals("test")) {
            return TestHooker;
        }
        throw new IllegalArgumentException("Unknown event: " + str);
    }
}
