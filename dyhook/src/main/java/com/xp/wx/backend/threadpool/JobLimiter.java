package com.xp.wx.backend.threadpool;

import com.xp.wx.backend.threadpool.ThreadPool;
import com.xp.wx.util.Utils;
import java.util.LinkedList;

public class JobLimiter implements FutureListener {
    private static final int STATE_CANCELLED = 2;
    private static final int STATE_DONE = 1;
    private static final int STATE_INIT = 0;
    private static final String TAG = "JobLimiter";
    private final LinkedList<JobWrapper<?>> mJobs = new LinkedList<>();
    private int mLimit;
    private final ThreadPool mPool;

    private static class JobWrapper<T> implements Future<T>, ThreadPool.Job<T> {
        private Future<T> mDelegate;
        private ThreadPool.Job<T> mJob;
        private FutureListener<T> mListener;
        private T mResult;
        private int mState = 0;

        public JobWrapper(ThreadPool.Job<T> job, FutureListener<T> futureListener) {
            this.mJob = job;
            this.mListener = futureListener;
        }

        public synchronized void setFuture(Future<T> future) {
            if (this.mState == 0) {
                this.mDelegate = future;
            }
        }

        public void cancel() {
            FutureListener<T> futureListener;
            synchronized (this) {
                if (this.mState != 1) {
                    futureListener = this.mListener;
                    this.mJob = null;
                    this.mListener = null;
                    if (this.mDelegate != null) {
                        this.mDelegate.cancel();
                        this.mDelegate = null;
                    }
                } else {
                    futureListener = null;
                }
                this.mState = 2;
                this.mResult = null;
                notifyAll();
            }
            if (futureListener != null) {
                futureListener.onFutureDone(this);
            }
        }

        public synchronized boolean isCancelled() {
            return this.mState == 2;
        }

        public boolean isDone() {
            return this.mState != 0;
        }

        public synchronized T get() {
            while (this.mState == 0) {
                Utils.waitWithoutInterrupt(this);
            }
            return this.mResult;
        }

        public void waitDone() {
            get();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
            android.util.Log.w(com.xp.wx.backend.threadpool.JobLimiter.TAG, "error executing job: " + r0, r6);
            r6 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            if (r0 == null) goto L_0x0044;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
            r0.onFutureDone(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
            return r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r6 = r0.run(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T run(com.xp.wx.backend.threadpool.ThreadPool.JobContext r6) {
            /*
                r5 = this;
                monitor-enter(r5)
                int r0 = r5.mState     // Catch:{ all -> 0x0048 }
                r1 = 2
                r2 = 0
                if (r0 != r1) goto L_0x0009
                monitor-exit(r5)     // Catch:{ all -> 0x0048 }
                return r2
            L_0x0009:
                com.xp.wx.backend.threadpool.ThreadPool$Job<T> r0 = r5.mJob     // Catch:{ all -> 0x0048 }
                monitor-exit(r5)     // Catch:{ all -> 0x0048 }
                java.lang.Object r6 = r0.run(r6)     // Catch:{ all -> 0x0011 }
                goto L_0x0029
            L_0x0011:
                r6 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "error executing job: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "JobLimiter"
                android.util.Log.w(r3, r0, r6)
                r6 = r2
            L_0x0029:
                monitor-enter(r5)
                int r0 = r5.mState     // Catch:{ all -> 0x0045 }
                if (r0 != r1) goto L_0x0030
                monitor-exit(r5)     // Catch:{ all -> 0x0045 }
                return r2
            L_0x0030:
                r0 = 1
                r5.mState = r0     // Catch:{ all -> 0x0045 }
                com.xp.wx.backend.threadpool.FutureListener<T> r0 = r5.mListener     // Catch:{ all -> 0x0045 }
                r5.mListener = r2     // Catch:{ all -> 0x0045 }
                r5.mJob = r2     // Catch:{ all -> 0x0045 }
                r5.mResult = r6     // Catch:{ all -> 0x0045 }
                r5.notifyAll()     // Catch:{ all -> 0x0045 }
                monitor-exit(r5)     // Catch:{ all -> 0x0045 }
                if (r0 == 0) goto L_0x0044
                r0.onFutureDone(r5)
            L_0x0044:
                return r6
            L_0x0045:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0045 }
                throw r6
            L_0x0048:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0048 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.backend.threadpool.JobLimiter.JobWrapper.run(com.xp.wx.backend.threadpool.ThreadPool$JobContext):java.lang.Object");
        }
    }

    public JobLimiter(ThreadPool threadPool, int i) {
        this.mPool = (ThreadPool) Utils.checkNotNull(threadPool);
        this.mLimit = i;
    }

    public synchronized <T> Future<T> submit(ThreadPool.Job<T> job, FutureListener<T> futureListener) {
        JobWrapper jobWrapper;
        jobWrapper = new JobWrapper((ThreadPool.Job) Utils.checkNotNull(job), futureListener);
        this.mJobs.addLast(jobWrapper);
        submitTasksIfAllowed();
        return jobWrapper;
    }

    public <T> Future<T> submit(ThreadPool.Job<T> job) {
        return submit(job, (FutureListener) null);
    }

    private void submitTasksIfAllowed() {
        while (this.mLimit > 0 && !this.mJobs.isEmpty()) {
            JobWrapper removeFirst = this.mJobs.removeFirst();
            if (!removeFirst.isCancelled()) {
                this.mLimit--;
                removeFirst.setFuture(this.mPool.submit(removeFirst, this));
            }
        }
    }

    public synchronized void onFutureDone(Future future) {
        this.mLimit++;
        submitTasksIfAllowed();
    }
}
