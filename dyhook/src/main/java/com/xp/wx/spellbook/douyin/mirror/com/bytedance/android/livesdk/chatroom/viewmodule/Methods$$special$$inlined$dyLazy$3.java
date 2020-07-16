package com.xp.wx.spellbook.douyin.mirror.com.bytedance.android.livesdk.chatroom.viewmodule;

import com.xp.wx.spellbook.util.ReflectionUtil;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "com/xp/wx/spellbook/douyin/DyGlobal$dyLazy$1"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyGlobal.kt */
public final class Methods$$special$$inlined$dyLazy$3 extends Lambda implements Function0<Method> {
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Methods$$special$$inlined$dyLazy$3(String str) {
        super(0);
        this.$name = str;
    }

    public final Method invoke() {
        Method findMethodExactIfExists = ReflectionUtil.findMethodExactIfExists(Classes.INSTANCE.getClassCommentWidget(), "onPause", new Class[0]);
        if (findMethodExactIfExists != null) {
            return findMethodExactIfExists;
        }
        throw new Error("Failed to evaluate " + this.$name);
    }
}
