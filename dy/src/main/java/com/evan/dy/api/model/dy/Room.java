package com.evan.dy.api.model.dy;

public class Room extends BasePB<Room> {
    public long id;
    public long ownerUserId;
    public User owner;
}
