package com.xp.wx.backend.network;

public class BaseResponse<T> {
    public T data;
    public String msg;
    public int state;
    public int status;
}
