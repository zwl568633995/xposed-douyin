package com.wujieshuju.huidou.room.p030db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.TableInfo;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import com.wujieshuju.huidou.room.dao.DyHistoryDao;
import com.wujieshuju.huidou.room.dao.DyHistoryDao_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.wujieshuju.huidou.room.db.DyHistoryDB_Impl */
public final class DyHistoryDB_Impl extends DyHistoryDB {
    private volatile DyHistoryDao _dyHistoryDao;

    /* access modifiers changed from: protected */
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) {
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `dy_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT)");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"23c6f837051ebbf381566572e4989266\")");
            }

            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `dy_history`");
            }

            /* access modifiers changed from: protected */
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (DyHistoryDB_Impl.this.mCallbacks != null) {
                    int size = DyHistoryDB_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) DyHistoryDB_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase unused = DyHistoryDB_Impl.this.mDatabase = supportSQLiteDatabase;
                DyHistoryDB_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (DyHistoryDB_Impl.this.mCallbacks != null) {
                    int size = DyHistoryDB_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) DyHistoryDB_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            /* access modifiers changed from: protected */
            public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
                hashMap.put("name", new TableInfo.Column("name", "TEXT", false, 0));
                TableInfo tableInfo = new TableInfo("dy_history", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "dy_history");
                if (!tableInfo.equals(read)) {
                    throw new IllegalStateException("Migration didn't properly handle dy_history(com.wujieshuju.huidou.room.model.DyHistory).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
            }
        }, "23c6f837051ebbf381566572e4989266", "9f1f451db85d4504f707c9e854c5ddf8")).build());
    }

    /* access modifiers changed from: protected */
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, "dy_history");
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `dy_history`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    public DyHistoryDao getDyHistoryDao() {
        DyHistoryDao dyHistoryDao;
        if (this._dyHistoryDao != null) {
            return this._dyHistoryDao;
        }
        synchronized (this) {
            if (this._dyHistoryDao == null) {
                this._dyHistoryDao = new DyHistoryDao_Impl(this);
            }
            dyHistoryDao = this._dyHistoryDao;
        }
        return dyHistoryDao;
    }
}
