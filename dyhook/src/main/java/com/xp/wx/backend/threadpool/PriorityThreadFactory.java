package com.xp.wx.backend.threadpool;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class PriorityThreadFactory implements ThreadFactory {
    private final String mName;
    private final AtomicInteger mNumber = new AtomicInteger();
    /* access modifiers changed from: private */
    public final int mPriority;

    public PriorityThreadFactory(String str, int i) {
        this.mName = str;
        this.mPriority = i;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.mName + '-' + this.mNumber.getAndIncrement()) {
            public void run() {
                Process.setThreadPriority(PriorityThreadFactory.this.mPriority);
                super.run();
            }
        };
    }
}
