package com.xp.wx.backend.db;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import com.xp.wx.Global;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J$\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J.\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/xp/wx/backend/db/DatabaseContext;", "Landroid/content/ContextWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getDatabasePath", "Ljava/io/File;", "name", "", "openOrCreateDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "mode", "", "factory", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "errorHandler", "Landroid/database/DatabaseErrorHandler;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DatabaseContext.kt */
public final class DatabaseContext extends ContextWrapper {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatabaseContext(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public File getDatabasePath(String str) {
        if (!Intrinsics.areEqual((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            return null;
        }
        String str2 = Global.ROOT_PATH + getPackageName() + "/db";
        String str3 = str2 + '/' + str;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean z = false;
        File file2 = new File(str3);
        if (!file2.exists()) {
            try {
                z = file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            z = true;
        }
        if (z) {
            return file2;
        }
        return super.getDatabasePath(str);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        SQLiteDatabase openOrCreateDatabase = super.openOrCreateDatabase(str, i, cursorFactory);
        Intrinsics.checkExpressionValueIsNotNull(openOrCreateDatabase, "super.openOrCreateDatabase(name, mode, factory)");
        return openOrCreateDatabase;
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), (SQLiteDatabase.CursorFactory) null);
        Intrinsics.checkExpressionValueIsNotNull(openOrCreateDatabase, "SQLiteDatabase.openOrCre…DatabasePath(name), null)");
        return openOrCreateDatabase;
    }
}
