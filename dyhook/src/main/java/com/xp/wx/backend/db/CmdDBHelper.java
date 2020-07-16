package com.xp.wx.backend.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.xp.wx.util.Log;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\u0011\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\u0017"}, d2 = {"Lcom/xp/wx/backend/db/CmdDBHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clearFile", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "tableName", "", "execSQL", "sql", "getCreateTableSql", "getMsgCacheSql", "getStatusTableSql", "onCreate", "onUpgrade", "oldVersion", "", "newVersion", "updateToVersion", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: CmdDBHelper.kt */
public final class CmdDBHelper extends SQLiteOpenHelper {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DB_VERSION = 10;
    public static final String NAME = "cmd.db";
    public static final int PROCESS_STATUS_DEFAULT = 0;
    public static final int PROCESS_STATUS_FAIL = 1;
    public static final int PROCESS_STATUS_ING = 3;
    public static final int PROCESS_STATUS_SUCCESS = 2;
    public static final String TABLE_DOWN = "tb_down";
    public static final String TABLE_MSG_CACHE = "tb_msg_cache";
    public static final String TABLE_STATUS = "tb_status";
    public static final String TABLE_UP = "tb_up";
    /* access modifiers changed from: private */
    public static final byte[] mLock = new byte[0];

    public static final byte[] getMLock() {
        return mLock;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CmdDBHelper(Context context) {
        super(context, NAME, (SQLiteDatabase.CursorFactory) null, 10);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xp/wx/backend/db/CmdDBHelper$Companion;", "", "()V", "DB_VERSION", "", "NAME", "", "PROCESS_STATUS_DEFAULT", "PROCESS_STATUS_FAIL", "PROCESS_STATUS_ING", "PROCESS_STATUS_SUCCESS", "TABLE_DOWN", "TABLE_MSG_CACHE", "TABLE_STATUS", "TABLE_UP", "mLock", "", "mLock$annotations", "getMLock", "()[B", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: CmdDBHelper.kt */
    public static final class Companion {
        @JvmStatic
        public static /* synthetic */ void mLock$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte[] getMLock() {
            return CmdDBHelper.mLock;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            execSQL(sQLiteDatabase, getCreateTableSql(TABLE_DOWN));
            execSQL(sQLiteDatabase, getCreateTableSql(TABLE_UP));
            execSQL(sQLiteDatabase, getStatusTableSql(TABLE_STATUS));
            execSQL(sQLiteDatabase, getMsgCacheSql(TABLE_MSG_CACHE));
        }
    }

    private final String getCreateTableSql(String str) {
        return "create table " + str + "(id integer primary key autoincrement, " + "cmd integer, " + "timestamp long, " + "fromClientId char(50), " + "toClientId char(50), " + "status integer, " + "priority integer, " + "cmdData char(256), " + "localId char(50), " + "serverId char(50), " + "channel char(500), " + "msg char(3000), " + "desc char(1000), " + "createTime char(50), " + "updateTime char(50), " + "retryCount integer, " + "processStatus smallint" + ")";
    }

    private final String getStatusTableSql(String str) {
        return "create table " + str + "(id integer primary key autoincrement, " + "localId integer, " + "msgId char(50), " + "createTime char(50)" + ")";
    }

    private final String getMsgCacheSql(String str) {
        return "create table " + str + "(id integer primary key autoincrement, " + "username char(50), " + "cmd integer, " + "talker char(50), " + "msgSvrId long, " + "mark char(500), " + "createTime char(50), " + "updateTime char(50)" + ")";
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        synchronized (mLock) {
            Log.debug("db need update, oldVersion = " + i + ", newVersion = " + i2);
            updateToVersion(sQLiteDatabase);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void updateToVersion(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            clearFile(sQLiteDatabase, TABLE_DOWN);
            clearFile(sQLiteDatabase, TABLE_UP);
            execSQL(sQLiteDatabase, "drop table tb_down");
            execSQL(sQLiteDatabase, "drop table tb_up");
            execSQL(sQLiteDatabase, "drop table tb_status");
            execSQL(sQLiteDatabase, "drop table tb_msg_cache");
            onCreate(sQLiteDatabase);
        }
    }

    private final void execSQL(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (Exception e) {
            Log.error((Throwable) e);
        }
    }

    private final void clearFile(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            Cursor query = sQLiteDatabase.query(str, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndex("cmdData"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    if (file.exists()) {
                        Log.debug("clearFile  " + file.getAbsolutePath());
                        file.delete();
                    }
                }
            }
            query.close();
        } catch (Exception e) {
            Log.error((Throwable) e);
        }
    }
}
