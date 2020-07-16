package com.evan.dy.api.model;


import com.evan.dy.api.model.dy.User;

public final class LiveUser {
    private final Object userObj;
    private User user;

    public LiveUser(Object userObj) {
        this.userObj = userObj;
    }

    public User getUser() {
        if (this.user == null) {
            this.user = new User().parseFrom(userObj);
        }
        return user;
    }

    public Object getUserObj() {
        return userObj;
    }

    @Override
    public String toString() {
        return "LiveUser{" +
            "userId=" + getUser().id +
            "nickName=" + getUser().nickName +
            '}';
    }

}
