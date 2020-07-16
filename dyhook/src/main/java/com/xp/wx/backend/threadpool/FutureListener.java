package com.xp.wx.backend.threadpool;

public interface FutureListener<T> {
    void onFutureDone(Future<T> future);
}
