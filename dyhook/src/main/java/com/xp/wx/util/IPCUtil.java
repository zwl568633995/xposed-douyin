package com.xp.wx.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0001¨\u0006\r"}, d2 = {"Lcom/xp/wx/util/IPCUtil;", "", "()V", "getProtectedSharedPreferences", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "name", "", "mode", "", "putExtra", "Landroid/content/Intent;", "value", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: IPCUtil.kt */
public final class IPCUtil {
    public static final IPCUtil INSTANCE = new IPCUtil();

    private IPCUtil() {
    }

    public final Intent putExtra(Intent intent, String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(intent, "receiver$0");
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(obj, "value");
        if (obj instanceof Boolean) {
            Intent putExtra = intent.putExtra(str, ((Boolean) obj).booleanValue());
            Intrinsics.checkExpressionValueIsNotNull(putExtra, "putExtra(name, value)");
            return putExtra;
        } else if (obj instanceof boolean[]) {
            Intent putExtra2 = intent.putExtra(str, (boolean[]) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra2, "putExtra(name, value)");
            return putExtra2;
        } else if (obj instanceof Bundle) {
            Intent putExtra3 = intent.putExtra(str, (Bundle) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra3, "putExtra(name, value)");
            return putExtra3;
        } else if (obj instanceof Byte) {
            Intent putExtra4 = intent.putExtra(str, ((Number) obj).byteValue());
            Intrinsics.checkExpressionValueIsNotNull(putExtra4, "putExtra(name, value)");
            return putExtra4;
        } else if (obj instanceof byte[]) {
            Intent putExtra5 = intent.putExtra(str, (byte[]) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra5, "putExtra(name, value)");
            return putExtra5;
        } else if (obj instanceof Character) {
            Intent putExtra6 = intent.putExtra(str, ((Character) obj).charValue());
            Intrinsics.checkExpressionValueIsNotNull(putExtra6, "putExtra(name, value)");
            return putExtra6;
        } else if (obj instanceof char[]) {
            Intent putExtra7 = intent.putExtra(str, (char[]) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra7, "putExtra(name, value)");
            return putExtra7;
        } else if (obj instanceof CharSequence) {
            Intent putExtra8 = intent.putExtra(str, (CharSequence) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra8, "putExtra(name, value)");
            return putExtra8;
        } else if (obj instanceof Double) {
            Intent putExtra9 = intent.putExtra(str, ((Number) obj).doubleValue());
            Intrinsics.checkExpressionValueIsNotNull(putExtra9, "putExtra(name, value)");
            return putExtra9;
        } else if (obj instanceof double[]) {
            Intent putExtra10 = intent.putExtra(str, (double[]) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra10, "putExtra(name, value)");
            return putExtra10;
        } else if (obj instanceof Float) {
            Intent putExtra11 = intent.putExtra(str, ((Number) obj).floatValue());
            Intrinsics.checkExpressionValueIsNotNull(putExtra11, "putExtra(name ,value)");
            return putExtra11;
        } else if (obj instanceof float[]) {
            Intent putExtra12 = intent.putExtra(str, (float[]) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra12, "putExtra(name, value)");
            return putExtra12;
        } else if (obj instanceof Integer) {
            Intent putExtra13 = intent.putExtra(str, ((Number) obj).intValue());
            Intrinsics.checkExpressionValueIsNotNull(putExtra13, "putExtra(name, value)");
            return putExtra13;
        } else if (obj instanceof int[]) {
            Intent putExtra14 = intent.putExtra(str, (int[]) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra14, "putExtra(name, value)");
            return putExtra14;
        } else if (obj instanceof Long) {
            Intent putExtra15 = intent.putExtra(str, ((Number) obj).longValue());
            Intrinsics.checkExpressionValueIsNotNull(putExtra15, "putExtra(name, value)");
            return putExtra15;
        } else if (obj instanceof long[]) {
            Intent putExtra16 = intent.putExtra(str, (long[]) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra16, "putExtra(name, value)");
            return putExtra16;
        } else if (obj instanceof Short) {
            Intent putExtra17 = intent.putExtra(str, ((Number) obj).shortValue());
            Intrinsics.checkExpressionValueIsNotNull(putExtra17, "putExtra(name, value)");
            return putExtra17;
        } else if (obj instanceof short[]) {
            Intent putExtra18 = intent.putExtra(str, (short[]) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra18, "putExtra(name, value)");
            return putExtra18;
        } else if (obj instanceof String) {
            Intent putExtra19 = intent.putExtra(str, (String) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra19, "putExtra(name, value)");
            return putExtra19;
        } else if (obj instanceof Parcelable) {
            Intent putExtra20 = intent.putExtra(str, (Parcelable) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra20, "putExtra(name, value)");
            return putExtra20;
        } else if (obj instanceof Serializable) {
            Intent putExtra21 = intent.putExtra(str, (Serializable) obj);
            Intrinsics.checkExpressionValueIsNotNull(putExtra21, "putExtra(name, value)");
            return putExtra21;
        } else {
            throw new Error("Intent.putExtra(): Unknown type: " + obj.getClass());
        }
    }

    public final SharedPreferences getProtectedSharedPreferences(Context context, String str, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Intrinsics.checkParameterIsNotNull(str, "name");
        if (Build.VERSION.SDK_INT < 24) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, i);
            Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "getSharedPreferences(name, mode)");
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.createDeviceProtectedStorageContext().getSharedPreferences(str, i);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences2, "createDeviceProtectedSto…edPreferences(name, mode)");
        return sharedPreferences2;
    }
}
