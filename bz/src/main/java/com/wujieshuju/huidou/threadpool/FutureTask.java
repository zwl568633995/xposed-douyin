package com.wujieshuju.huidou.threadpool;

import java.util.concurrent.Callable;

public class FutureTask<T> implements Runnable, Future<T> {
    private static final String TAG = "FutureTask";
    private Callable<T> mCallable;
    private volatile boolean mIsCancelled;
    private boolean mIsDone;
    private FutureListener<T> mListener;
    private T mResult;

    public FutureTask(Callable<T> callable, FutureListener<T> futureListener) {
        this.mCallable = callable;
        this.mListener = futureListener;
    }

    public FutureTask(Callable<T> callable) {
        this(callable, (FutureListener) null);
    }

    public void cancel() {
        this.mIsCancelled = true;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:13:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized T get() {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            boolean r0 = r1.mIsDone     // Catch:{ all -> 0x000d }
            if (r0 != 0) goto L_0x0009
            r1.wait()     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0009:
            T r0 = r1.mResult     // Catch:{ all -> 0x000d }
            monitor-exit(r1)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.threadpool.FutureTask.get():java.lang.Object");
    }

    public void waitDone() {
        get();
    }

    public synchronized boolean isDone() {
        return this.mIsDone;
    }

    public boolean isCancelled() {
        return this.mIsCancelled;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r3 = this;
            boolean r0 = r3.mIsCancelled
            if (r0 != 0) goto L_0x0013
            java.util.concurrent.Callable<T> r0 = r3.mCallable     // Catch:{ all -> 0x000b }
            java.lang.Object r0 = r0.call()     // Catch:{ all -> 0x000b }
            goto L_0x0014
        L_0x000b:
            r0 = move-exception
            java.lang.String r1 = "FutureTask"
            java.lang.String r2 = "Exception in running a task"
            com.wujieshuju.huidou.util.LogUtil.m824w(r1, r2, r0)
        L_0x0013:
            r0 = 0
        L_0x0014:
            monitor-enter(r3)
            r3.mResult = r0     // Catch:{ all -> 0x0028 }
            r0 = 1
            r3.mIsDone = r0     // Catch:{ all -> 0x0028 }
            com.wujieshuju.huidou.threadpool.FutureListener<T> r0 = r3.mListener     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0023
            com.wujieshuju.huidou.threadpool.FutureListener<T> r0 = r3.mListener     // Catch:{ all -> 0x0028 }
            r0.onFutureDone(r3)     // Catch:{ all -> 0x0028 }
        L_0x0023:
            r3.notifyAll()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wujieshuju.huidou.threadpool.FutureTask.run():void");
    }
}
