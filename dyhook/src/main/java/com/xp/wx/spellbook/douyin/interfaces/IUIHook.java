package com.xp.wx.spellbook.douyin.interfaces;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001H&¨\u0006\n"}, d2 = {"Lcom/xp/wx/spellbook/douyin/interfaces/IUIHook;", "", "onCommentWidgetPause", "", "thisObj", "onCommentWidgetResume", "onMessage", "msg", "onRoomChanged", "room", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: IUIHook.kt */
public interface IUIHook {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* compiled from: IUIHook.kt */
    public static final class DefaultImpls {
        public static void onCommentWidgetPause(IUIHook iUIHook, Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "thisObj");
        }

        public static void onCommentWidgetResume(IUIHook iUIHook, Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "thisObj");
        }

        public static void onMessage(IUIHook iUIHook, Object obj, Object obj2) {
            Intrinsics.checkParameterIsNotNull(obj, "thisObj");
        }
    }

    void onCommentWidgetPause(Object obj);

    void onCommentWidgetResume(Object obj);

    void onMessage(Object obj, Object obj2);

    void onRoomChanged(Object obj);
}
