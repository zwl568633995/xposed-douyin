package com.xp.wx.backend.douyin.util;

import android.support.v4.app.NotificationCompat;
import com.xp.wx.backend.douyin.model.LiveRoom;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.chatroom.viewmodule.Methods;
import com.xp.wx.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xp/wx/backend/douyin/util/ChatroomUtil;", "", "()V", "commentWidget", "getCommentWidget", "()Ljava/lang/Object;", "setCommentWidget", "(Ljava/lang/Object;)V", "currentChatroom", "Lcom/xp/wx/backend/douyin/model/LiveRoom;", "getCurrentChatroom", "()Lcom/xp/wx/backend/douyin/model/LiveRoom;", "setCurrentChatroom", "(Lcom/xp/wx/backend/douyin/model/LiveRoom;)V", "sendRoomTextMsg", "", "msg", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ChatroomUtil.kt */
public final class ChatroomUtil {
    public static final ChatroomUtil INSTANCE = new ChatroomUtil();
    private static Object commentWidget;
    private static LiveRoom currentChatroom;

    private ChatroomUtil() {
    }

    public final Object getCommentWidget() {
        return commentWidget;
    }

    public final void setCommentWidget(Object obj) {
        commentWidget = obj;
    }

    public final LiveRoom getCurrentChatroom() {
        return currentChatroom;
    }

    public final void setCurrentChatroom(LiveRoom liveRoom) {
        currentChatroom = liveRoom;
    }

    public final synchronized void sendRoomTextMsg(String str) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_MESSAGE);
        if (commentWidget == null) {
            Log.debug("sendRoomTextMsg. commentWidget is null");
            return;
        }
        Log.debug("sendRoomTextMsg. msg = " + str);
        Methods.INSTANCE.getClassCommentWidget_a().invoke(commentWidget, new Object[]{str, false, false});
    }
}
