package com.wujieshuju.huidou.room.p030db;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.wujieshuju.huidou.room.dao.DyHistoryDao;

/* renamed from: com.wujieshuju.huidou.room.db.DyHistoryDB */
public abstract class DyHistoryDB extends RoomDatabase {
    private static final String DB_NAME = "dy_history.db";
    private static DyHistoryDB mInstance;

    public abstract DyHistoryDao getDyHistoryDao();

    public static synchronized DyHistoryDB getInstance(Context context) {
        DyHistoryDB dyHistoryDB;
        synchronized (DyHistoryDB.class) {
            if (mInstance == null) {
                mInstance = create(context);
            }
            dyHistoryDB = mInstance;
        }
        return dyHistoryDB;
    }

    private static DyHistoryDB create(Context context) {
        return Room.databaseBuilder(context, DyHistoryDB.class, DB_NAME).build();
    }
}
