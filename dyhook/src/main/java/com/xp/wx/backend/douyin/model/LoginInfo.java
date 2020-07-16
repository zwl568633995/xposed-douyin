package com.xp.wx.backend.douyin.model;

public class LoginInfo {
    public String token;
    public String username;

    public LoginInfo() {
    }

    public LoginInfo(String str, String str2) {
        this.username = str;
        this.token = str2;
    }
}
