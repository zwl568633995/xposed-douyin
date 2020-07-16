package com.evan.dy.api.model;

import com.evan.dy.api.model.dy.Room;
import com.evan.dy.api.model.dy.User;
import com.evan.dy.mirror.com.bytedance.android.livesdkapi.depend.model.live.Fields;

public class LiveRoom {
    private final Object roomObj;
    private Room room;

    public LiveRoom(Object obj) {
        this.roomObj = obj;
    }

    public final Object getRoomObj() {
        return this.roomObj;
    }

    public final Room getRoom() {
        if (room == null) {
            room = new Room().parseFrom(roomObj);
        }
        return room;
    }

    public final long getId() {
        return getRoom().id;
    }

    public final long getOwnerUserId() {
        return getRoom().ownerUserId;
    }

    public final User getOwner() {
        return getRoom().owner;
    }

    @Override
    public String toString() {
        return "LiveRoom{" +
            "User=" + getOwner() +
            ", id=" + getId() +
            ", ownerUserId=" + getOwnerUserId() +
            '}';
    }
}
