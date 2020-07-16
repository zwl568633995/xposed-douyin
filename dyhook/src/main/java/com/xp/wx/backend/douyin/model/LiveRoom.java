package com.xp.wx.backend.douyin.model;

import com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdkapi.depend.model.live.Fields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xp/wx/backend/douyin/model/LiveRoom;", "", "room", "(Ljava/lang/Object;)V", "roomObj", "getRoomObj", "()Ljava/lang/Object;", "getId", "", "getOwner", "Lcom/xp/wx/backend/douyin/model/LiveUser;", "getOwnerUserId", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: LiveRoom.kt */
public final class LiveRoom {
    private final Object roomObj;

    public LiveRoom(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "room");
        this.roomObj = obj;
    }

    public final Object getRoomObj() {
        return this.roomObj;
    }

    public final long getId() {
        return Fields.INSTANCE.getClassLivesdkapiDependModelLiveRoom_id().getLong(this.roomObj);
    }

    public final long getOwnerUserId() {
        return Fields.INSTANCE.getClassLivesdkapiDependModelLiveRoom_ownerUserId().getLong(this.roomObj);
    }

    public final LiveUser getOwner() {
        Object obj = Fields.INSTANCE.getClassLivesdkapiDependModelLiveRoom_owner().get(this.roomObj);
        Intrinsics.checkExpressionValueIsNotNull(obj, "ClassLivesdkapiDependMod…veRoom_owner.get(roomObj)");
        return new LiveUser(obj);
    }
}
