package com.xp.wx.backend.douyin.plugins;

import com.xp.wx.backend.douyin.handler.DyTaskHandler;
import com.xp.wx.backend.douyin.model.ChatroomMessage;
import com.xp.wx.backend.douyin.model.LiveRoom;
import com.xp.wx.backend.douyin.util.ChatroomUtil;
import com.xp.wx.backend.douyin.util.ConfigUtil;
import com.xp.wx.spellbook.douyin.interfaces.IUIHook;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.chatroom.presenter.Fields;
import com.xp.wx.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/xp/wx/backend/douyin/plugins/UIHook;", "Lcom/xp/wx/spellbook/douyin/interfaces/IUIHook;", "()V", "onCommentWidgetPause", "", "thisObj", "", "onCommentWidgetResume", "onMessage", "msg", "onRoomChanged", "room", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: UIHook.kt */
public final class UIHook implements IUIHook {
    public static final UIHook INSTANCE = new UIHook();

    private UIHook() {
    }

    public void onCommentWidgetResume(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "thisObj");
        Log.debug("onCommentWidgetResume");
        ChatroomUtil.INSTANCE.setCommentWidget(obj);
    }

    public void onCommentWidgetPause(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "thisObj");
        Log.debug("onCommentWidgetPause");
        if (Intrinsics.areEqual(ChatroomUtil.INSTANCE.getCommentWidget(), obj)) {
            ChatroomUtil.INSTANCE.setCommentWidget((Object) null);
        }
    }

    public void onRoomChanged(Object obj) {
        if (obj == null) {
            Log.debug("onRoomChanged: exit room");
            ChatroomUtil.INSTANCE.setCurrentChatroom((LiveRoom) null);
            DyTaskHandler.INSTANCE.stopTask();
        } else if (ConfigUtil.INSTANCE.getLastLoginDyInfo().isBind) {
            LiveRoom liveRoom = new LiveRoom(obj);
            Log.debug("onRoomChanged: current room = " + liveRoom.getId());
            ChatroomUtil.INSTANCE.setCurrentChatroom(liveRoom);
            DyTaskHandler.INSTANCE.startTask(liveRoom);
        } else {
            Log.debug("onRoomChanged: not bind");
        }
    }

    public void onMessage(Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(obj, "thisObj");
        if (obj2 != null && ConfigUtil.INSTANCE.getLastLoginDyInfo().isBind) {
            Object obj3 = Fields.INSTANCE.getClassChatroomPresenterAz_room().get(obj);
            Intrinsics.checkExpressionValueIsNotNull(obj3, "ClassChatroomPresenterAz_room.get(thisObj)");
            if (!(!Intrinsics.areEqual((Object) ConfigUtil.INSTANCE.getBindChatroomDyId(), (Object) new LiveRoom(obj3).getOwner().getDisplayId()))) {
                DyTaskHandler.INSTANCE.handleMessage(new ChatroomMessage(obj2));
            }
        }
    }
}
