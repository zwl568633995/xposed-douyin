package com.xp.wx.backend.douyin.api;

import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common.Methods;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/xp/wx/backend/douyin/api/DyHookApi$searchUser$1", "Ljava/lang/reflect/InvocationHandler;", "invoke", "", "proxy", "", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyHookApi.kt */
public final class DyHookApi$searchUser$1 implements InvocationHandler {
    final /* synthetic */ DyHookApi.CommonResponseCallback $callback;
    final /* synthetic */ int $hashCode;
    final /* synthetic */ Object $s;

    DyHookApi$searchUser$1(int i, DyHookApi.CommonResponseCallback commonResponseCallback, Object obj) {
        this.$hashCode = i;
        this.$callback = commonResponseCallback;
        this.$s = obj;
    }

    public void invoke(Object obj, Method method, Object[] objArr) {
        DyGlobal.INSTANCE.getDyLruCache().remove(Integer.valueOf(this.$hashCode));
        Exception exc = null;
        String name = method != null ? method.getName() : null;
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -530890460) {
                if (hashCode == 1116433148 && name.equals("onFailed")) {
                    DyHookApi.CommonResponseCallback commonResponseCallback = this.$callback;
                    if (objArr != null) {
                        exc = objArr[0];
                    }
                    commonResponseCallback.onFailed(exc);
                }
            } else if (name.equals("onSuccess")) {
                this.$callback.onSuccess(Methods.INSTANCE.getClassCommonA_getData().invoke(this.$s, new Object[0]));
            }
        }
    }
}
