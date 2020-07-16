package com.xp.wx.backend.douyin.model;

public class DyUser {
    public String avatar;
    public boolean isBind;
    public String nickname;
    public String secUid;
    public String uid;
    public String uniqueId;

    public DyUser() {
    }

    public DyUser(String str, String str2, String str3, String str4, String str5) {
        this.uid = str;
        this.uniqueId = str2;
        this.secUid = str3;
        this.nickname = str4;
        this.avatar = str5;
    }
}
