package com.xp.wx.backend.douyin.helper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.format.DateFormat;
import com.xp.wx.backend.douyin.api.DyHookApi;
import com.xp.wx.backend.douyin.db.DyRecordDatabase;
import com.xp.wx.spellbook.douyin.DyGlobal;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xp/wx/backend/douyin/helper/DyRecordDBHelper;", "", "()V", "mDBHelper", "Lcom/xp/wx/backend/douyin/db/DyRecordDatabase;", "mLock", "", "mReadableDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "kotlin.jvm.PlatformType", "mWritableDatabase", "getCurrentDateStr", "", "getGiftTotalPrice", "", "insertGiftOnce", "", "price", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DyRecordDBHelper.kt */
public final class DyRecordDBHelper {
    public static final DyRecordDBHelper INSTANCE = new DyRecordDBHelper();
    private static final DyRecordDatabase mDBHelper;
    private static final byte[] mLock = DyRecordDatabase.Companion.getMLock();
    private static final SQLiteDatabase mReadableDatabase = mDBHelper.getReadableDatabase();
    private static final SQLiteDatabase mWritableDatabase;

    static {
        DyHookApi hookApi = DyGlobal.INSTANCE.getHookApi();
        if (hookApi == null) {
            Intrinsics.throwNpe();
        }
        DyRecordDatabase dyRecordDatabase = new DyRecordDatabase(hookApi.getContext());
        mDBHelper = dyRecordDatabase;
        mWritableDatabase = dyRecordDatabase.getWritableDatabase();
    }

    private DyRecordDBHelper() {
    }

    public final void insertGiftOnce(int i) {
        synchronized (mLock) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", 2);
            contentValues.put("count", 1);
            contentValues.put("dy_id", DyGlobal.INSTANCE.getLoginUserId());
            contentValues.put("value", Integer.valueOf(i));
            contentValues.put("time", INSTANCE.getCurrentDateStr());
            mWritableDatabase.insert(DyRecordDatabase.TB_RECORD, (String) null, contentValues);
        }
    }

    public final int getGiftTotalPrice() {
        int i;
        synchronized (mLock) {
            i = 0;
            Cursor rawQuery = mReadableDatabase.rawQuery("select sum(value) as sumValue from tb_record where dy_id = ? and type = ? and time = ?", new String[]{DyGlobal.INSTANCE.getLoginUserId(), String.valueOf(2), INSTANCE.getCurrentDateStr()});
            if (rawQuery != null && rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        }
        return i;
    }

    public final String getCurrentDateStr() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "Calendar.getInstance()");
        return DateFormat.format("yyyy-MM-dd", instance.getTime()).toString();
    }
}
