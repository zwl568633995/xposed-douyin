package com.wujieshuju.huidou.threadpool;

import com.wujieshuju.huidou.util.LogUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    private static final int CORE_POOL_SIZE = 2;
    public static final JobContext JOB_CONTEXT_STUB = new JobContextStub();
    private static final int KEEP_ALIVE_TIME = 10;
    private static final int MAX_POOL_SIZE = 8;
    public static final int MODE_CPU = 1;
    public static final int MODE_NETWORK = 2;
    public static final int MODE_NONE = 0;
    private static ThreadPool mDefault = new ThreadPool();
    ResourceCounter mCpuCounter;
    private final Executor mExecutor;
    ResourceCounter mNetworkCounter;

    public interface CancelListener {
        void onCancel();
    }

    public interface Job<T> {
        T run(JobContext jobContext);
    }

    public interface JobContext {
        boolean isCancelled();

        void setCancelListener(CancelListener cancelListener);

        boolean setMode(int i);
    }

    private static class JobContextStub implements JobContext {
        public boolean isCancelled() {
            return false;
        }

        public void setCancelListener(CancelListener cancelListener) {
        }

        public boolean setMode(int i) {
            return true;
        }

        private JobContextStub() {
        }
    }

    private static class ResourceCounter {
        public int value;

        public ResourceCounter(int i) {
            this.value = i;
        }
    }

    public static ThreadPool getDefault() {
        return mDefault;
    }

    public ThreadPool() {
        this.mCpuCounter = new ResourceCounter(2);
        this.mNetworkCounter = new ResourceCounter(2);
        this.mExecutor = new ThreadPoolExecutor(2, 8, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new PriorityThreadFactory("vkei-thread-pool", 10));
    }

    public ThreadPool(int i) {
        this.mCpuCounter = new ResourceCounter(2);
        this.mNetworkCounter = new ResourceCounter(2);
        this.mExecutor = new ThreadPoolExecutor(i, 8, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new PriorityThreadFactory("vkei-thread-pool", 10));
    }

    public <T> Future<T> submit(Job<T> job, FutureListener<T> futureListener) {
        Worker worker = new Worker(job, futureListener);
        this.mExecutor.execute(worker);
        return worker;
    }

    public <T> Future<T> submit(Job<T> job) {
        return submit(job, (FutureListener) null);
    }

    public ThreadPoolExecutor getExecutor() {
        return (ThreadPoolExecutor) this.mExecutor;
    }

    private class Worker<T> implements Runnable, Future<T>, JobContext {
        private static final String TAG = "Worker";
        private CancelListener mCancelListener;
        private volatile boolean mIsCancelled;
        private boolean mIsDone;
        private Job<T> mJob;
        private FutureListener<T> mListener;
        private int mMode;
        private T mResult;
        private ResourceCounter mWaitOnResource;

        public Worker(Job<T> job, FutureListener<T> futureListener) {
            this.mJob = job;
            this.mListener = futureListener;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:653)
            	at java.util.ArrayList.get(ArrayList.java:429)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void run() {
            /*
                r4 = this;
                r0 = 1
                boolean r1 = r4.setMode(r0)
                if (r1 == 0) goto L_0x0016
                com.wujieshuju.huidou.threadpool.ThreadPool$Job<T> r1 = r4.mJob     // Catch:{ all -> 0x000e }
                java.lang.Object r1 = r1.run(r4)     // Catch:{ all -> 0x000e }
                goto L_0x0017
            L_0x000e:
                r1 = move-exception
                java.lang.String r2 = "Worker"
                java.lang.String r3 = "Exception in running a job"
                com.wujieshuju.huidou.util.LogUtil.m824w(r2, r3, r1)
            L_0x0016:
                r1 = 0
            L_0x0017:
                monitor-enter(r4)
                r2 = 0
                r4.setMode(r2)     // Catch:{ all -> 0x002c }
                r4.mResult = r1     // Catch:{ all -> 0x002c }
                r4.mIsDone = r0     // Catch:{ all -> 0x002c }
                r4.notifyAll()     // Catch:{ all -> 0x002c }
                monitor-exit(r4)     // Catch:{ all -> 0x002c }
                com.wujieshuju.huidou.threadpool.FutureListener<T> r0 = r4.mListener
                if (r0 == 0) goto L_0x002b
                r0.onFutureDone(r4)
            L_0x002b:
                return
            L_0x002c:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x002c }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.threadpool.ThreadPool.Worker.run():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0025, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void cancel() {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.mIsCancelled     // Catch:{ all -> 0x0026 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r2)
                return
            L_0x0007:
                r0 = 1
                r2.mIsCancelled = r0     // Catch:{ all -> 0x0026 }
                com.wujieshuju.huidou.threadpool.ThreadPool$ResourceCounter r0 = r2.mWaitOnResource     // Catch:{ all -> 0x0026 }
                if (r0 == 0) goto L_0x001b
                com.wujieshuju.huidou.threadpool.ThreadPool$ResourceCounter r0 = r2.mWaitOnResource     // Catch:{ all -> 0x0026 }
                monitor-enter(r0)     // Catch:{ all -> 0x0026 }
                com.wujieshuju.huidou.threadpool.ThreadPool$ResourceCounter r1 = r2.mWaitOnResource     // Catch:{ all -> 0x0018 }
                r1.notifyAll()     // Catch:{ all -> 0x0018 }
                monitor-exit(r0)     // Catch:{ all -> 0x0018 }
                goto L_0x001b
            L_0x0018:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0018 }
                throw r1     // Catch:{ all -> 0x0026 }
            L_0x001b:
                com.wujieshuju.huidou.threadpool.ThreadPool$CancelListener r0 = r2.mCancelListener     // Catch:{ all -> 0x0026 }
                if (r0 == 0) goto L_0x0024
                com.wujieshuju.huidou.threadpool.ThreadPool$CancelListener r0 = r2.mCancelListener     // Catch:{ all -> 0x0026 }
                r0.onCancel()     // Catch:{ all -> 0x0026 }
            L_0x0024:
                monitor-exit(r2)
                return
            L_0x0026:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.threadpool.ThreadPool.Worker.cancel():void");
        }

        public boolean isCancelled() {
            return this.mIsCancelled;
        }

        public synchronized boolean isDone() {
            return this.mIsDone;
        }

        public synchronized T get() {
            while (!this.mIsDone) {
                try {
                    wait();
                } catch (Exception e) {
                    LogUtil.m824w(TAG, "ingore exception", e);
                }
            }
            return this.mResult;
        }

        public void waitDone() {
            get();
        }

        public synchronized void setCancelListener(CancelListener cancelListener) {
            this.mCancelListener = cancelListener;
            if (this.mIsCancelled && this.mCancelListener != null) {
                this.mCancelListener.onCancel();
            }
        }

        public boolean setMode(int i) {
            ResourceCounter modeToCounter = modeToCounter(this.mMode);
            if (modeToCounter != null) {
                releaseResource(modeToCounter);
            }
            this.mMode = 0;
            ResourceCounter modeToCounter2 = modeToCounter(i);
            if (modeToCounter2 == null) {
                return true;
            }
            if (!acquireResource(modeToCounter2)) {
                return false;
            }
            this.mMode = i;
            return true;
        }

        private ResourceCounter modeToCounter(int i) {
            if (i == 1) {
                return ThreadPool.this.mCpuCounter;
            }
            if (i == 2) {
                return ThreadPool.this.mNetworkCounter;
            }
            return null;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:25|26|27) */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
            if (r4.value <= 0) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0013, code lost:
            r4.value--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r3.mWaitOnResource = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x001d, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x001e, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r4.wait();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0025 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean acquireResource(com.wujieshuju.huidou.threadpool.ThreadPool.ResourceCounter r4) {
            /*
                r3 = this;
            L_0x0000:
                monitor-enter(r3)
                boolean r0 = r3.mIsCancelled     // Catch:{ all -> 0x002a }
                r1 = 0
                if (r0 == 0) goto L_0x000b
                r3.mWaitOnResource = r1     // Catch:{ all -> 0x002a }
                r4 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x002a }
                return r4
            L_0x000b:
                r3.mWaitOnResource = r4     // Catch:{ all -> 0x002a }
                monitor-exit(r3)     // Catch:{ all -> 0x002a }
                monitor-enter(r4)
                int r0 = r4.value     // Catch:{ all -> 0x0027 }
                if (r0 <= 0) goto L_0x0022
                int r0 = r4.value     // Catch:{ all -> 0x0027 }
                r2 = 1
                int r0 = r0 - r2
                r4.value = r0     // Catch:{ all -> 0x0027 }
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                monitor-enter(r3)
                r3.mWaitOnResource = r1     // Catch:{ all -> 0x001f }
                monitor-exit(r3)     // Catch:{ all -> 0x001f }
                return r2
            L_0x001f:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x001f }
                throw r4
            L_0x0022:
                r4.wait()     // Catch:{ InterruptedException -> 0x0025 }
            L_0x0025:
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                goto L_0x0000
            L_0x0027:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0027 }
                throw r0
            L_0x002a:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002a }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.threadpool.ThreadPool.Worker.acquireResource(com.wujieshuju.huidou.threadpool.ThreadPool$ResourceCounter):boolean");
        }

        private void releaseResource(ResourceCounter resourceCounter) {
            synchronized (resourceCounter) {
                resourceCounter.value++;
                resourceCounter.notifyAll();
            }
        }
    }
}
