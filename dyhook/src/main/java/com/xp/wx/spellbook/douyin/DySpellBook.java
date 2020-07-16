package com.xp.wx.spellbook.douyin;

import android.content.Context;
import com.xp.api.callbacks.XC_LoadPackage;
import com.xp.wx.spellbook.base.EventCenter;
import com.xp.wx.spellbook.base.HookerProvider;
import com.xp.wx.spellbook.douyin.hookers.CommonHook;
import com.xp.wx.spellbook.douyin.hookers.UIHook;
import com.xp.wx.spellbook.util.ParallelUtil;
import com.xp.wx.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004J\u0016\u0010\t\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/spellbook/douyin/DySpellBook;", "", "()V", "centers", "", "Lcom/xp/wx/spellbook/base/EventCenter;", "registerHookers", "", "plugins", "registerPlugins", "startup", "context", "Landroid/content/Context;", "lpparam", "Lcom/xp/api/callbacks/XC_LoadPackage$LoadPackageParam;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DySpellBook.kt */
public final class DySpellBook {
    public static final DySpellBook INSTANCE = new DySpellBook();
    private static final List<EventCenter> centers = CollectionsKt.listOf(CommonHook.INSTANCE, UIHook.INSTANCE);

    private DySpellBook() {
    }

    public final void startup(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam, List<? extends Object> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(loadPackageParam, "lpparam");
        StringBuilder sb = new StringBuilder();
        sb.append("Dy SpellBook: ");
        sb.append(list != null ? list.size() : 0);
        sb.append(" plugins.");
        Log.debug(sb.toString());
        DyGlobal.init(context, loadPackageParam, list);
    }

    public final void registerPlugins(List<? extends Object> list) {
        List list2;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (!(next instanceof HookerProvider)) {
                    arrayList.add(next);
                }
            }
            list2 = (List) arrayList;
        } else {
            list2 = CollectionsKt.emptyList();
        }
        ExecutorService createThreadPool$default = ParallelUtil.createThreadPool$default(0, 1, (Object) null);
        for (Object dySpellBook$registerPlugins$$inlined$parallelForEach$1 : centers) {
            createThreadPool$default.execute(new DySpellBook$registerPlugins$$inlined$parallelForEach$1(dySpellBook$registerPlugins$$inlined$parallelForEach$1, list2));
        }
        createThreadPool$default.shutdown();
        createThreadPool$default.awaitTermination(LongCompanionObject.MAX_VALUE, TimeUnit.NANOSECONDS);
    }

    public final void registerHookers(List<? extends Object> list) {
        List<Object> list2;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof HookerProvider) {
                    arrayList.add(next);
                }
            }
            list2 = (List) arrayList;
        } else {
            list2 = CollectionsKt.emptyList();
        }
        ExecutorService createThreadPool$default = ParallelUtil.createThreadPool$default(0, 1, (Object) null);
        for (Object dySpellBook$registerHookers$$inlined$parallelForEach$1 : list2) {
            createThreadPool$default.execute(new DySpellBook$registerHookers$$inlined$parallelForEach$1(dySpellBook$registerHookers$$inlined$parallelForEach$1));
        }
        createThreadPool$default.shutdown();
        createThreadPool$default.awaitTermination(LongCompanionObject.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
}
