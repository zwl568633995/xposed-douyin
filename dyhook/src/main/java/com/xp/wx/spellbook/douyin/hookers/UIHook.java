package com.xp.wx.spellbook.douyin.hookers;

import com.xp.wx.spellbook.base.EventCenter;
import com.xp.wx.spellbook.base.Hooker;
import com.xp.wx.spellbook.douyin.interfaces.IUIHook;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/hookers/UIHook;", "Lcom/xp/wx/spellbook/base/EventCenter;", "()V", "CommentWidgetHooker", "Lcom/xp/wx/spellbook/base/Hooker;", "MessageHooker", "interfaces", "", "Ljava/lang/Class;", "getInterfaces", "()Ljava/util/List;", "onRoomChangedHooker", "provideEventHooker", "event", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: UIHook.kt */
public final class UIHook extends EventCenter {
    private static final Hooker CommentWidgetHooker = new Hooker(UIHook$CommentWidgetHooker$1.INSTANCE);
    public static final UIHook INSTANCE = new UIHook();
    private static final Hooker MessageHooker = new Hooker(UIHook$MessageHooker$1.INSTANCE);
    private static final Hooker onRoomChangedHooker = new Hooker(UIHook$onRoomChangedHooker$1.INSTANCE);

    private UIHook() {
    }

    public List<Class<?>> getInterfaces() {
        return CollectionsKt.listOf(IUIHook.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        throw new java.lang.IllegalArgumentException("Unknown event: " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return CommentWidgetHooker;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r4.equals("onCommentWidgetResume") != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r4.equals("onCommentWidgetPause") != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xp.wx.spellbook.base.Hooker provideEventHooker(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            int r0 = r4.hashCode()
            switch(r0) {
                case -2003762904: goto L_0x002c;
                case -929780110: goto L_0x0021;
                case 1302482737: goto L_0x0018;
                case 1779328506: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0037
        L_0x000d:
            java.lang.String r0 = "onRoomChanged"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
            com.xp.wx.spellbook.base.Hooker r4 = onRoomChangedHooker
            goto L_0x0036
        L_0x0018:
            java.lang.String r0 = "onCommentWidgetResume"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
            goto L_0x0029
        L_0x0021:
            java.lang.String r0 = "onCommentWidgetPause"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
        L_0x0029:
            com.xp.wx.spellbook.base.Hooker r4 = CommentWidgetHooker
            goto L_0x0036
        L_0x002c:
            java.lang.String r0 = "onMessage"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0037
            com.xp.wx.spellbook.base.Hooker r4 = MessageHooker
        L_0x0036:
            return r4
        L_0x0037:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown event: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.douyin.hookers.UIHook.provideEventHooker(java.lang.String):com.xp.wx.spellbook.base.Hooker");
    }
}
