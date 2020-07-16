package com.xp.wx.spellbook.douyin;

import android.content.Context;
import com.xp.api.callbacks.XC_LoadPackage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/xp/wx/spellbook/util/BasicUtil$tryAsynchronously$1"}, k = 3, mv = {1, 1, 13})
/* compiled from: BasicUtil.kt */
public final class DyGlobal$init$$inlined$tryAsynchronously$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ XC_LoadPackage.LoadPackageParam $lpparam$inlined;
    final /* synthetic */ List $plugins$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DyGlobal$init$$inlined$tryAsynchronously$1(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam, List list) {
        super(0);
        this.$context$inlined = context;
        this.$lpparam$inlined = loadPackageParam;
        this.$plugins$inlined = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00f2, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f6, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r5 = this;
            java.lang.String r0 = "lpparam.packageName"
            java.lang.String r1 = "DyGlobal:: init"
            com.xp.wx.util.Log.debug(r1)
            com.xp.wx.spellbook.douyin.DyGlobal r1 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE
            com.xp.wx.spellbook.base.WaitChannel r1 = r1.getInitializeChannel()
            boolean r1 = r1.isDone()
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "DyGlobal:: init isDone"
            com.xp.wx.util.Log.debug(r0)
            goto L_0x0119
        L_0x001a:
            com.xp.wx.spellbook.util.AppUtil r1 = com.xp.wx.spellbook.util.AppUtil.INSTANCE     // Catch:{ all -> 0x00f7 }
            android.content.Context r2 = r5.$context$inlined     // Catch:{ all -> 0x00f7 }
            com.xp.api.callbacks.XC_LoadPackage$LoadPackageParam r3 = r5.$lpparam$inlined     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = r3.packageName     // Catch:{ all -> 0x00f7 }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.base.Version r1 = r1.getApplicationVersion(r2, r3)     // Catch:{ all -> 0x00f7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r2.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = "version : "
            r2.append(r3)     // Catch:{ all -> 0x00f7 }
            r2.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00f7 }
            com.xp.wx.util.Log.warn((java.lang.String) r2)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.V r2 = com.xp.wx.spellbook.douyin.V.INSTANCE     // Catch:{ all -> 0x00f7 }
            boolean r2 = r2.isSupport(r1)     // Catch:{ all -> 0x00f7 }
            if (r2 != 0) goto L_0x005b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r0.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = "not support version : "
            r0.append(r2)     // Catch:{ all -> 0x00f7 }
            r0.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f7 }
            com.xp.wx.util.Log.warn((java.lang.String) r0)     // Catch:{ all -> 0x00f7 }
            goto L_0x0110
        L_0x005b:
            com.xp.wx.spellbook.douyin.DyGlobal r2 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f7 }
            r2.setDyVersion(r1)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DyGlobal r1 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f7 }
            com.xp.api.callbacks.XC_LoadPackage$LoadPackageParam r2 = r5.$lpparam$inlined     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = r2.packageName     // Catch:{ all -> 0x00f7 }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)     // Catch:{ all -> 0x00f7 }
            r1.setDyPackageName(r2)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DyGlobal r1 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f7 }
            com.xp.api.callbacks.XC_LoadPackage$LoadPackageParam r2 = r5.$lpparam$inlined     // Catch:{ all -> 0x00f7 }
            java.lang.ClassLoader r2 = r2.classLoader     // Catch:{ all -> 0x00f7 }
            r1.setDyLoader(r2)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DyGlobal r1 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f7 }
            com.xp.wx.backend.douyin.api.DyHookApi r2 = new com.xp.wx.backend.douyin.api.DyHookApi     // Catch:{ all -> 0x00f7 }
            com.xp.api.callbacks.XC_LoadPackage$LoadPackageParam r3 = r5.$lpparam$inlined     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = r3.packageName     // Catch:{ all -> 0x00f7 }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)     // Catch:{ all -> 0x00f7 }
            com.xp.api.callbacks.XC_LoadPackage$LoadPackageParam r0 = r5.$lpparam$inlined     // Catch:{ all -> 0x00f7 }
            java.lang.ClassLoader r0 = r0.classLoader     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "lpparam.classLoader"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)     // Catch:{ all -> 0x00f7 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x00f7 }
            r1.setHookApi(r2)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "DyGlobal:: start init classes"
            com.xp.wx.util.Log.debug(r0)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.parser.ApkFile r0 = new com.xp.wx.spellbook.parser.ApkFile     // Catch:{ all -> 0x00f7 }
            com.xp.api.callbacks.XC_LoadPackage$LoadPackageParam r1 = r5.$lpparam$inlined     // Catch:{ all -> 0x00f7 }
            android.content.pm.ApplicationInfo r1 = r1.appInfo     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r1.sourceDir     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = "lpparam.appInfo.sourceDir"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ all -> 0x00f7 }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x00f7 }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ all -> 0x00f7 }
            r1 = 0
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00f7 }
            r2 = r0
            com.xp.wx.spellbook.parser.ApkFile r2 = (com.xp.wx.spellbook.parser.ApkFile) r2     // Catch:{ all -> 0x00f0 }
            com.xp.wx.spellbook.douyin.DyGlobal r3 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f0 }
            com.xp.wx.spellbook.parser.ClassTrie r2 = r2.getClassTypes()     // Catch:{ all -> 0x00f0 }
            r3.setDyClasses(r2)     // Catch:{ all -> 0x00f0 }
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f0 }
            kotlin.io.CloseableKt.closeFinally(r0, r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "DyGlobal:: init classes done"
            com.xp.wx.util.Log.debug(r0)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DyGlobal r0 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.base.WaitChannel r0 = r0.getInitializeChannel()     // Catch:{ all -> 0x00f7 }
            r0.done()     // Catch:{ all -> 0x00f7 }
            com.xp.wx.backend.helper.RemoteHelper r0 = com.xp.wx.backend.helper.RemoteHelper.INSTANCE     // Catch:{ all -> 0x00f7 }
            r0.init()     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.util.AvoidSealUtil r0 = com.xp.wx.spellbook.util.AvoidSealUtil.INSTANCE     // Catch:{ all -> 0x00f7 }
            r0.avoidSealDy()     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DySpellBook r0 = com.xp.wx.spellbook.douyin.DySpellBook.INSTANCE     // Catch:{ all -> 0x00f7 }
            java.util.List r1 = r5.$plugins$inlined     // Catch:{ all -> 0x00f7 }
            r0.registerPlugins(r1)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DySpellBook r0 = com.xp.wx.spellbook.douyin.DySpellBook.INSTANCE     // Catch:{ all -> 0x00f7 }
            java.util.List r1 = r5.$plugins$inlined     // Catch:{ all -> 0x00f7 }
            r0.registerHookers(r1)     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DyGlobal r0 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f7 }
            r0.getContext()     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DyGlobal r0 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f7 }
            r0.initUserInfo()     // Catch:{ all -> 0x00f7 }
            com.xp.wx.spellbook.douyin.DyGlobal r0 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE     // Catch:{ all -> 0x00f7 }
            r0.listenLogout()     // Catch:{ all -> 0x00f7 }
            goto L_0x0110
        L_0x00f0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)     // Catch:{ all -> 0x00f7 }
            throw r2     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            r1.<init>()     // Catch:{ all -> 0x011a }
            java.lang.String r2 = "DyGlobal:: error: "
            r1.append(r2)     // Catch:{ all -> 0x011a }
            r1.append(r0)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x011a }
            com.xp.wx.util.Log.error((java.lang.String) r0)     // Catch:{ all -> 0x011a }
        L_0x0110:
            com.xp.wx.spellbook.douyin.DyGlobal r0 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE
            com.xp.wx.spellbook.base.WaitChannel r0 = r0.getInitializeChannel()
            r0.done()
        L_0x0119:
            return
        L_0x011a:
            r0 = move-exception
            com.xp.wx.spellbook.douyin.DyGlobal r1 = com.xp.wx.spellbook.douyin.DyGlobal.INSTANCE
            com.xp.wx.spellbook.base.WaitChannel r1 = r1.getInitializeChannel()
            r1.done()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.douyin.DyGlobal$init$$inlined$tryAsynchronously$1.invoke():void");
    }
}
