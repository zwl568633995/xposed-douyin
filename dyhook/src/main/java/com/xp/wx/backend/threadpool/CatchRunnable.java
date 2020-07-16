package com.xp.wx.backend.threadpool;

import com.xp.wx.util.Log;

public abstract class CatchRunnable implements Runnable {
    public abstract void runInTry();

    public void run() {
        try {
            runInTry();
        } catch (Throwable th) {
            Log.error(th);
        }
    }
}
