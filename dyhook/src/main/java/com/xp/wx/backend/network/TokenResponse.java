package com.xp.wx.backend.network;

public class TokenResponse extends BaseResponse<Token> {

    public class Token {
        public long expire;
        public String token;

        public Token() {
        }
    }
}
