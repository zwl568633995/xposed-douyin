package com.xp.wx.backend.threadpool;

import android.os.Handler;
import android.os.Looper;
import com.xp.wx.backend.threadpool.ThreadPool;

public abstract class UiJob<T> implements ThreadPool.Job<T> {
    private final Handler mHandler;

    /* access modifiers changed from: protected */
    public abstract T doInBackground();

    /* access modifiers changed from: protected */
    public abstract void onPostExecute(T t);

    public UiJob() {
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public UiJob(Handler handler) {
        this.mHandler = handler;
    }

    public T run(ThreadPool.JobContext jobContext) {
        T doInBackground = doInBackground();
        this.mHandler.post(new PostRunnable(this, doInBackground));
        return doInBackground;
    }

    private static class PostRunnable<T> implements Runnable {
        private final UiJob<T> mJob;
        private final T mResult;

        public PostRunnable(UiJob<T> uiJob, T t) {
            this.mJob = uiJob;
            this.mResult = t;
        }

        public void run() {
            this.mJob.onPostExecute(this.mResult);
        }
    }
}
