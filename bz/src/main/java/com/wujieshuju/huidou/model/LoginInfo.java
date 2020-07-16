package com.wujieshuju.huidou.model;

public class LoginInfo {
    public int isExpire;
    public String token;
    public String username;
    public long validTime;

    public LoginInfo() {
    }

    public LoginInfo(String str, String str2, int i, long j) {
        this.username = str;
        this.token = str2;
        this.isExpire = i;
        this.validTime = j;
    }
}
