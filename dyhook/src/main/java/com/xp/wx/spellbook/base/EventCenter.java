package com.xp.wx.spellbook.base;

import android.support.v4.app.NotificationCompat;
import android.util.Log;
import com.xp.api.XC_MethodHook;
import com.xp.wx.spellbook.base.HookerProvider;
import com.xp.wx.spellbook.util.ParallelUtil;
import com.xp.wx.spellbook.util.XposedUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\nJ%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u0012H\bJ9\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u0012H\bJ1\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u0012H\bJ7\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0004\"\b\b\u0000\u0010\u001b*\u00020\f2\u0006\u0010\u000e\u001a\u00020\n2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001H\u001b0\u0012H\bJ'\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u0012H\bJ6\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170\u0012J\u001a\u0010\u001e\u001a\u00020\u00102\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010 \u001a\u00020\fJ\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010!\u001a\u00020\fH\u0002J\u0014\u0010\"\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002R\u001c\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xp/wx/spellbook/base/EventCenter;", "Lcom/xp/wx/spellbook/base/HookerProvider;", "()V", "interfaces", "", "Ljava/lang/Class;", "getInterfaces", "()Ljava/util/List;", "observers", "", "", "", "", "findObservers", "event", "notify", "", "action", "Lkotlin/Function1;", "notifyForBypassFlags", "param", "Lcom/xp/api/XC_MethodHook$MethodHookParam;", "default", "", "notifyForOperations", "Lcom/xp/wx/spellbook/base/Operation;", "notifyForResults", "T", "notifyParallel", "notifyWithInterrupt", "register", "inface", "plugin", "observer", "hasEvent", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: EventCenter.kt */
public abstract class EventCenter implements HookerProvider {
    private final Map<String, Set<Object>> observers = new ConcurrentHashMap();

    public abstract List<Class<?>> getInterfaces();

    public Hooker provideEventHooker(String str) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
        return HookerProvider.DefaultImpls.provideEventHooker(this, str);
    }

    public List<Hooker> provideStaticHookers() {
        return HookerProvider.DefaultImpls.provideStaticHookers(this);
    }

    private final boolean hasEvent(Object obj, String str) {
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        Intrinsics.checkExpressionValueIsNotNull(declaredMethods, "this::class.java.declaredMethods");
        for (Method method : declaredMethods) {
            Intrinsics.checkExpressionValueIsNotNull(method, "it");
            if (Intrinsics.areEqual((Object) method.getName(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    private final void register(String str, Object obj) {
        if (hasEvent(obj, str)) {
            Hooker provideEventHooker = provideEventHooker(str);
            if (provideEventHooker != null && !provideEventHooker.getHasHooked()) {
                XposedUtil.postHooker(provideEventHooker);
            }
            Set set = this.observers.get(str);
            if (set == null) {
                set = SetsKt.emptySet();
            }
            this.observers.put(str, SetsKt.plus(set, obj));
        }
    }

    public final void register(Class<?> cls, Object obj) {
        Intrinsics.checkParameterIsNotNull(cls, "inface");
        Intrinsics.checkParameterIsNotNull(obj, "plugin");
        Method[] methods = cls.getMethods();
        Intrinsics.checkExpressionValueIsNotNull(methods, "inface.methods");
        for (Method method : methods) {
            Intrinsics.checkExpressionValueIsNotNull(method, "method");
            String name = method.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "method.name");
            register(name, obj);
        }
    }

    public final Set<Object> findObservers(String str) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
        return this.observers.get(str);
    }

    public final void notify(String str, Function1<Object, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
        Intrinsics.checkParameterIsNotNull(function1, "action");
        Set<Object> findObservers = findObservers(str);
        if (findObservers != null) {
            for (Object invoke : findObservers) {
                try {
                    function1.invoke(invoke);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    Log.e("Xposed", Log.getStackTraceString(th));
                }
            }
        }
    }

    public final void notifyParallel(String str, Function1<Object, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
        Intrinsics.checkParameterIsNotNull(function1, "action");
        Set<Object> findObservers = findObservers(str);
        if (findObservers != null) {
            ExecutorService createThreadPool$default = ParallelUtil.createThreadPool$default(0, 1, (Object) null);
            for (Object eventCenter$notifyParallel$$inlined$parallelForEach$1 : findObservers) {
                createThreadPool$default.execute(new EventCenter$notifyParallel$$inlined$parallelForEach$1(eventCenter$notifyParallel$$inlined$parallelForEach$1, function1));
            }
            createThreadPool$default.shutdown();
            createThreadPool$default.awaitTermination(LongCompanionObject.MAX_VALUE, TimeUnit.NANOSECONDS);
        }
    }

    public final <T> List<T> notifyForResults(String str, Function1<Object, ? extends T> function1) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
        Intrinsics.checkParameterIsNotNull(function1, "action");
        Set<Object> findObservers = findObservers(str);
        if (findObservers == null) {
            return CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (Object invoke : findObservers) {
            try {
                obj = function1.invoke(invoke);
            } catch (Throwable th) {
                Log.e("Xposed", Log.getStackTraceString(th));
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }

    public static /* synthetic */ void notifyForBypassFlags$default(EventCenter eventCenter, String str, XC_MethodHook.MethodHookParam methodHookParam, Object obj, Function1 function1, int i, Object obj2) {
        List list;
        Object obj3;
        if (obj2 == null) {
            if ((i & 4) != 0) {
                obj = null;
            }
            Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
            Intrinsics.checkParameterIsNotNull(methodHookParam, "param");
            Intrinsics.checkParameterIsNotNull(function1, "action");
            Set<Object> findObservers = eventCenter.findObservers(str);
            if (findObservers != null) {
                Collection arrayList = new ArrayList();
                for (Object invoke : findObservers) {
                    try {
                        obj3 = function1.invoke(invoke);
                    } catch (Throwable th) {
                        Log.e("Xposed", Log.getStackTraceString(th));
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        arrayList.add(obj3);
                    }
                }
                list = (List) arrayList;
            } else {
                list = CollectionsKt.emptyList();
            }
            Iterable iterable = list;
            boolean z = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                methodHookParam.setResult(obj);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyForBypassFlags");
    }

    public static /* synthetic */ void notifyWithInterrupt$default(EventCenter eventCenter, String str, XC_MethodHook.MethodHookParam methodHookParam, Object obj, Function1 function1, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                obj = null;
            }
            eventCenter.notifyWithInterrupt(str, methodHookParam, obj, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyWithInterrupt");
    }

    public final void notifyWithInterrupt(String str, XC_MethodHook.MethodHookParam methodHookParam, Object obj, Function1<Object, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
        Intrinsics.checkParameterIsNotNull(methodHookParam, "param");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        Set<Object> set = this.observers.get(str);
        if (set != null) {
            for (Object invoke : set) {
                try {
                    if (function1.invoke(invoke).booleanValue()) {
                        methodHookParam.setResult(obj);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    Log.e("Xposed", Log.getStackTraceString(th));
                }
            }
        }
    }

    public final void notifyForBypassFlags(String str, XC_MethodHook.MethodHookParam methodHookParam, Object obj, Function1<Object, Boolean> function1) {
        List list;
        Boolean bool;
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_EVENT);
        Intrinsics.checkParameterIsNotNull(methodHookParam, "param");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        Set<Object> findObservers = findObservers(str);
        if (findObservers != null) {
            Collection arrayList = new ArrayList();
            for (Object invoke : findObservers) {
                try {
                    bool = function1.invoke(invoke);
                } catch (Throwable th) {
                    Log.e("Xposed", Log.getStackTraceString(th));
                    bool = null;
                }
                if (bool != null) {
                    arrayList.add(bool);
                }
            }
            list = (List) arrayList;
        } else {
            list = CollectionsKt.emptyList();
        }
        Iterable iterable = list;
        boolean z = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            methodHookParam.setResult(obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.xp.wx.spellbook.base.Operation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.xp.wx.spellbook.base.Operation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.xp.wx.spellbook.base.Operation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.xp.wx.spellbook.base.Operation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.xp.wx.spellbook.base.Operation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.xp.wx.spellbook.base.Operation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.xp.wx.spellbook.base.Operation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.xp.wx.spellbook.base.Operation} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void notifyForOperations(java.lang.String r6, com.xp.api.XC_MethodHook.MethodHookParam r7, kotlin.jvm.functions.Function1<java.lang.Object, ? extends com.xp.wx.spellbook.base.Operation<?>> r8) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "param"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.util.Set r6 = r5.findObservers(r6)
            r0 = 0
            if (r6 == 0) goto L_0x0046
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r6 = r6.iterator()
        L_0x0023:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r6.next()
            java.lang.Object r2 = r8.invoke(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x003d
        L_0x0032:
            r2 = move-exception
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            java.lang.String r3 = "Xposed"
            android.util.Log.e(r3, r2)
            r2 = r0
        L_0x003d:
            if (r2 == 0) goto L_0x0023
            r1.add(r2)
            goto L_0x0023
        L_0x0043:
            java.util.List r1 = (java.util.List) r1
            goto L_0x004a
        L_0x0046:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x004a:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r8 = r1.iterator()
        L_0x0057:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r8.next()
            r2 = r1
            com.xp.wx.spellbook.base.Operation r2 = (com.xp.wx.spellbook.base.Operation) r2
            boolean r2 = r2.getReturnEarly()
            if (r2 == 0) goto L_0x0057
            r6.add(r1)
            goto L_0x0057
        L_0x006e:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            boolean r8 = r6.hasNext()
            if (r8 != 0) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            java.lang.Object r8 = r6.next()
            r0 = r8
            com.xp.wx.spellbook.base.Operation r0 = (com.xp.wx.spellbook.base.Operation) r0
            int r0 = r0.getPriority()
            r4 = r0
            r0 = r8
            r8 = r4
        L_0x008b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00a1
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.xp.wx.spellbook.base.Operation r2 = (com.xp.wx.spellbook.base.Operation) r2
            int r2 = r2.getPriority()
            if (r8 >= r2) goto L_0x008b
            r0 = r1
            r8 = r2
            goto L_0x008b
        L_0x00a1:
            com.xp.wx.spellbook.base.Operation r0 = (com.xp.wx.spellbook.base.Operation) r0
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r6 = r0.getValue()
            if (r6 == 0) goto L_0x00b2
            java.lang.Object r6 = r0.getValue()
            r7.setResult(r6)
        L_0x00b2:
            java.lang.Throwable r6 = r0.getError()
            if (r6 == 0) goto L_0x00bf
            java.lang.Throwable r6 = r0.getError()
            r7.setThrowable(r6)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.base.EventCenter.notifyForOperations(java.lang.String, com.xp.api.XC_MethodHook$MethodHookParam, kotlin.jvm.functions.Function1):void");
    }
}
