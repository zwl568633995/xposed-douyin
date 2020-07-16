package com.wujieshuju.huidou.room.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import com.wujieshuju.huidou.room.model.DyHistory;
import java.util.ArrayList;
import java.util.List;

public final class DyHistoryDao_Impl implements DyHistoryDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter __deletionAdapterOfDyHistory;
    private final EntityInsertionAdapter __insertionAdapterOfDyHistory;

    public DyHistoryDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDyHistory = new EntityInsertionAdapter<DyHistory>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR ABORT INTO `dy_history`(`id`,`name`) VALUES (nullif(?, 0),?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, DyHistory dyHistory) {
                supportSQLiteStatement.bindLong(1, (long) dyHistory.getId());
                if (dyHistory.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dyHistory.getName());
                }
            }
        };
        this.__deletionAdapterOfDyHistory = new EntityDeletionOrUpdateAdapter<DyHistory>(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM `dy_history` WHERE `id` = ?";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, DyHistory dyHistory) {
                supportSQLiteStatement.bindLong(1, (long) dyHistory.getId());
            }
        };
    }

    public void insert(DyHistory... dyHistoryArr) {
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfDyHistory.insert((T[]) dyHistoryArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void delete(DyHistory... dyHistoryArr) {
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfDyHistory.handleMultiple((T[]) dyHistoryArr);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<DyHistory> getAllHistory() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM dy_history order by id desc", 0);
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("name");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                DyHistory dyHistory = new DyHistory();
                dyHistory.setId(query.getInt(columnIndexOrThrow));
                dyHistory.setName(query.getString(columnIndexOrThrow2));
                arrayList.add(dyHistory);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
