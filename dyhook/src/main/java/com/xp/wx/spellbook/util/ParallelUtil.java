package com.xp.wx.spellbook.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007J/\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r2\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000b0\u000fH\bJ;\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0011\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\f0\u00112\u0014\b\u0004\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u00120\u000fH\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/xp/wx/spellbook/util/ParallelUtil;", "", "()V", "processors", "", "getProcessors", "()I", "createThreadPool", "Ljava/util/concurrent/ExecutorService;", "nThread", "parallelForEach", "", "T", "", "action", "Lkotlin/Function1;", "parallelMap", "", "R", "transform", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ParallelUtil.kt */
public final class ParallelUtil {
    public static final ParallelUtil INSTANCE = new ParallelUtil();
    private static final int processors = Runtime.getRuntime().availableProcessors();

    private ParallelUtil() {
    }

    public final int getProcessors() {
        return processors;
    }

    @JvmStatic
    public static /* synthetic */ ExecutorService createThreadPool$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = processors;
        }
        return createThreadPool(i);
    }

    @JvmStatic
    public static final ExecutorService createThreadPool(int i) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
        Intrinsics.checkExpressionValueIsNotNull(newFixedThreadPool, "Executors.newFixedThreadPool(nThread)");
        return newFixedThreadPool;
    }

    @JvmStatic
    public static final <T, R> List<R> parallelMap(List<? extends T> list, Function1<? super T, ? extends R> function1) {
        List<? extends T> list2 = list;
        Function1<? super T, ? extends R> function12 = function1;
        Intrinsics.checkParameterIsNotNull(list2, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function12, "transform");
        int size = list.size() / INSTANCE.getProcessors();
        int processors2 = INSTANCE.getProcessors();
        ArrayList arrayList = new ArrayList(processors2);
        for (int i = 0; i < processors2; i++) {
            arrayList.add(new ArrayList());
        }
        List list3 = arrayList;
        Iterable until = RangesKt.until(0, INSTANCE.getProcessors());
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            arrayList2.add(ThreadsKt.thread$default(true, false, (ClassLoader) null, (String) null, 0, new ParallelUtil$parallelMap$$inlined$map$lambda$1(((IntIterator) it).nextInt(), list, size, list3, function1), 30, (Object) null));
        }
        for (Thread join : (List) arrayList2) {
            join.join();
        }
        Iterable until2 = RangesKt.until(0, list.size() % INSTANCE.getProcessors());
        Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until2, 10));
        Iterator it2 = until2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(function12.invoke(list2.get((INSTANCE.getProcessors() * size) + ((IntIterator) it2).nextInt())));
        }
        return CollectionsKt.plus(CollectionsKt.flatten(list3), (List) arrayList3);
    }

    @JvmStatic
    public static final <T> void parallelForEach(Iterable<? extends T> iterable, Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(iterable, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        ExecutorService createThreadPool$default = createThreadPool$default(0, 1, (Object) null);
        for (Object parallelUtil$parallelForEach$1 : iterable) {
            createThreadPool$default.execute(new ParallelUtil$parallelForEach$1(function1, parallelUtil$parallelForEach$1));
        }
        createThreadPool$default.shutdown();
        createThreadPool$default.awaitTermination(LongCompanionObject.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}
