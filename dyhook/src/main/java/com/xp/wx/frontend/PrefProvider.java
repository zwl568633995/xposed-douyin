package com.xp.wx.frontend;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.xp.wx.Global;
import com.xp.wx.util.IPCUtil;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u0013\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016JQ\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u001cJ=\u0010\u001d\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u001eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xp/wx/frontend/PrefProvider;", "Landroid/content/ContentProvider;", "()V", "preferences", "", "", "Landroid/content/SharedPreferences;", "delete", "", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getPreferenceType", "value", "", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: PrefProvider.kt */
public final class PrefProvider extends ContentProvider {
    private final Map<String, SharedPreferences> preferences = new LinkedHashMap();

    public String getType(Uri uri) {
        return null;
    }

    private final String getPreferenceType(Object obj) {
        if (obj == null) {
            return "Null";
        }
        if (obj instanceof Integer) {
            return "Int";
        }
        if (obj instanceof Long) {
            return "Long";
        }
        if (obj instanceof Float) {
            return "Float";
        }
        if (obj instanceof Boolean) {
            return "Boolean";
        }
        if (obj instanceof String) {
            return "String";
        }
        if (obj instanceof Set) {
            return "StringSet";
        }
        return String.valueOf(obj.getClass());
    }

    public boolean onCreate() {
        Map<String, SharedPreferences> map = this.preferences;
        IPCUtil iPCUtil = IPCUtil.INSTANCE;
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        map.put(Global.PREFERENCE_NAME_SETTINGS, iPCUtil.getProtectedSharedPreferences(context, Global.PREFERENCE_NAME_SETTINGS, 0));
        Map<String, SharedPreferences> map2 = this.preferences;
        IPCUtil iPCUtil2 = IPCUtil.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        map2.put(Global.PREFERENCE_NAME_DEVELOPER, iPCUtil2.getProtectedSharedPreferences(context2, Global.PREFERENCE_NAME_DEVELOPER, 0));
        return true;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Wechat Xpwx PrefProvider: Cannot modify read-only preferences!");
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SharedPreferences sharedPreferences;
        if (uri == null) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 1 || (sharedPreferences = this.preferences.get(pathSegments.get(0))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"key", "value", "type"});
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkExpressionValueIsNotNull(all, "preference.all");
        for (Map.Entry next : all.entrySet()) {
            matrixCursor.addRow(new Object[]{next.getKey(), next.getValue(), getPreferenceType(next.getValue())});
        }
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Xpwx PrefProvider: Cannot modify read-only preferences!");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Xpwx PrefProvider: Cannot modify read-only preferences!");
    }
}
