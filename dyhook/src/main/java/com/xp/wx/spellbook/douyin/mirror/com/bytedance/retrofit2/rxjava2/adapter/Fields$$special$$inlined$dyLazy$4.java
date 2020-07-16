package com.xp.wx.spellbook.douyin.mirror.com.bytedance.retrofit2.rxjava2.adapter;

import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.spellbook.douyin.mirror.com.bytedance.retrofit2.Classes;
import com.xp.wx.spellbook.util.ReflectionUtil;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "com/xp/wx/spellbook/douyin/DyGlobal$dyLazy$2"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyGlobal.kt */
public final class Fields$$special$$inlined$dyLazy$4 extends Lambda implements Function0<Field> {
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Fields$$special$$inlined$dyLazy$4(String str) {
        super(0);
        this.$name = str;
    }

    public final Field invoke() {
        if (DyGlobal.INSTANCE.getDyVersion() == null) {
            throw new Error("Invalid wxVersion");
        } else if (DyGlobal.INSTANCE.getDyPackageName() == null) {
            throw new Error("Invalid wxPackageName");
        } else if (DyGlobal.INSTANCE.getDyLoader() == null) {
            throw new Error("Invalid wxLoader");
        } else if (DyGlobal.INSTANCE.getDyClasses() != null) {
            Class<?> classRxjava2AdapterB = Classes.INSTANCE.getClassRxjava2AdapterB();
            String name = Classes.INSTANCE.getClassCall().getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "ClassCall.name");
            Field field = (Field) CollectionsKt.firstOrNull(ReflectionUtil.findFieldsWithType(classRxjava2AdapterB, name));
            if (field != null) {
                field.setAccessible(true);
            } else {
                field = null;
            }
            if (field != null) {
                return field;
            }
            throw new Error("Failed to evaluate " + this.$name);
        } else {
            throw new Error("Invalid wxClasses");
        }
    }
}
