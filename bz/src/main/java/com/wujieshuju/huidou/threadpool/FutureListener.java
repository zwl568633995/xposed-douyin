package com.wujieshuju.huidou.threadpool;

public interface FutureListener<T> {
    void onFutureDone(Future<T> future);
}
