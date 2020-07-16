package com.xp.wx.backend.douyin.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xp/wx/backend/douyin/db/DyRecordDatabase;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyRecordDatabase.kt */
public final class DyRecordDatabase extends SQLiteOpenHelper {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DB_VERSION = 1;
    public static final String NAME = "dy.db";
    public static final String TB_RECORD = "tb_record";
    public static final int TYPE_GIFT = 2;
    public static final int TYPE_LIKE = 1;
    /* access modifiers changed from: private */
    public static final byte[] mLock = new byte[0];

    public static final byte[] getMLock() {
        return mLock;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/backend/douyin/db/DyRecordDatabase$Companion;", "", "()V", "DB_VERSION", "", "NAME", "", "TB_RECORD", "TYPE_GIFT", "TYPE_LIKE", "mLock", "", "mLock$annotations", "getMLock", "()[B", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DyRecordDatabase.kt */
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
            return DyRecordDatabase.mLock;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DyRecordDatabase(Context context) {
        super(context, NAME, (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("create table tb_record(id integer primary key autoincrement, type integer, count integer, dy_id char(50), value integer, time char(50))");
        }
    }
}
