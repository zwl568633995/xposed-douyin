package com.xp.wx.backend.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.protobuf.ByteString;
import com.google.protobuf.ProtocolStringList;
import com.xp.wx.Global;
import com.xp.wx.backend.db.CmdDBHelper;
import com.xp.wx.backend.db.DatabaseContext;
import com.xp.wx.middleware.MsgProtos;
import com.xp.wx.util.FileUtil;
import com.xp.wx.util.Log;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002J\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0015J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0015J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0015J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0015J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0015J\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0002J\b\u0010*\u001a\u00020\bH\u0002J\u0010\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-H\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\b\u00100\u001a\u0004\u0018\u00010/J\b\u00101\u001a\u0004\u0018\u00010/J\u000e\u00102\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0015J\u0018\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020/2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u000e\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u00020/J\u000e\u00106\u001a\u00020\u00172\u0006\u00104\u001a\u00020/J\u000e\u00107\u001a\u00020\u00172\u0006\u00104\u001a\u00020/J\u0016\u00108\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\u0006\u00109\u001a\u00020\bJ \u0010:\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/xp/wx/backend/helper/CmdProcessHelper;", "", "()V", "mContext", "Landroid/content/Context;", "mDBHelper", "Lcom/xp/wx/backend/db/CmdDBHelper;", "mFileBasePath", "", "mLock", "", "mReadableDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "kotlin.jvm.PlatformType", "mWritableDatabase", "checkCmdExisted", "", "serverId", "tableName", "checkCmdExistedWithLocalId", "id", "", "clearAllCmdDataFiles", "", "clearHistoryCmdDataFiles", "beforeTimeStr", "clearUpAllCmd", "clearUpHistoryCmd", "beforeTimestamp", "", "clearUpHistoryMsgCache", "deleteCmd", "deleteDownCmd", "executeDownCmdFail", "localId", "executeDownCmdIng", "executeDownCmdSuccess", "executeUpCmdFail", "executeUpCmdIng", "executeUpCmdSuccess", "getChildFolder", "fileName", "getCurrentDateStr", "getDateStr", "date", "Ljava/util/Date;", "getExecuteCmd", "Lcom/xp/wx/middleware/MsgProtos$Cmd;", "getExecuteDownCmd", "getExecuteUpCmd", "getMsgIdForLocalId", "insertCmd", "cmd", "insertDownCmd", "insertUpCmd", "retryDownCmd", "saveLocaId", "msgId", "updateProcessStatus", "status", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: CmdProcessHelper.kt */
public final class CmdProcessHelper {
    public static final CmdProcessHelper INSTANCE = new CmdProcessHelper();
    private static final Context mContext;
    private static final CmdDBHelper mDBHelper;
    private static final String mFileBasePath = (Global.ROOT_PATH + mContext.getPackageName() + "/db/data/");
    private static final byte[] mLock = CmdDBHelper.Companion.getMLock();
    private static final SQLiteDatabase mReadableDatabase = mDBHelper.getReadableDatabase();
    private static final SQLiteDatabase mWritableDatabase;

    static {
        Context context = Global.INSTANCE.getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        mContext = context;
        CmdDBHelper cmdDBHelper = new CmdDBHelper(new DatabaseContext(mContext));
        mDBHelper = cmdDBHelper;
        mWritableDatabase = cmdDBHelper.getWritableDatabase();
    }

    private CmdProcessHelper() {
    }

    public final void insertDownCmd(MsgProtos.Cmd cmd) throws Exception {
        Intrinsics.checkParameterIsNotNull(cmd, "cmd");
        synchronized (mLock) {
            CmdProcessHelper cmdProcessHelper = INSTANCE;
            String serverId = cmd.getServerId();
            Intrinsics.checkExpressionValueIsNotNull(serverId, "cmd.serverId");
            if (!cmdProcessHelper.checkCmdExisted(serverId, CmdDBHelper.TABLE_DOWN)) {
                INSTANCE.insertCmd(cmd, CmdDBHelper.TABLE_DOWN);
                Unit unit = Unit.INSTANCE;
            } else {
                Log.debug("insertCmd: cmd = " + cmd.getCmd() + ", serverId = " + cmd.getServerId() + ", tb_down, repeat cmd");
                throw new Exception("repeat cmd");
            }
        }
    }

    public final void insertUpCmd(MsgProtos.Cmd cmd) {
        Intrinsics.checkParameterIsNotNull(cmd, "cmd");
        synchronized (mLock) {
            INSTANCE.insertCmd(cmd, CmdDBHelper.TABLE_UP);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void insertCmd(MsgProtos.Cmd cmd, String str) {
        String str2;
        String str3;
        String str4;
        synchronized (mLock) {
            if (cmd.getCmdData() == null || cmd.getCmdData().size() <= 0) {
                str2 = "";
            } else {
                str2 = "temp_" + cmd.getCmdData().hashCode() + "_" + System.currentTimeMillis();
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = mFileBasePath + INSTANCE.getChildFolder(str2);
            } else {
                str3 = "";
            }
            boolean z = !TextUtils.isEmpty(str3) && (Intrinsics.areEqual((Object) str3, (Object) mFileBasePath) ^ true);
            if (z) {
                FileUtil.saveFile(cmd.getCmdData().toByteArray(), str3, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (cmd.getChannelList() != null && cmd.getChannelList().size() > 0) {
                ProtocolStringList<String> channelList = cmd.getChannelList();
                Intrinsics.checkExpressionValueIsNotNull(channelList, "cmd.channelList");
                for (String append : channelList) {
                    sb.append(append);
                    sb.append(";");
                }
                if (StringsKt.endsWith$default((CharSequence) sb, (CharSequence) ";", false, 2, (Object) null)) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("cmd", Integer.valueOf(cmd.getCmd()));
            contentValues.put("timestamp", Long.valueOf(cmd.getTimestamp()));
            contentValues.put("fromClientId", cmd.getFromClientId());
            contentValues.put("toClientId", cmd.getToClientId());
            contentValues.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(cmd.getStatus()));
            contentValues.put("priority", Integer.valueOf(cmd.getPriority()));
            if (z) {
                str4 = str3 + str2;
            } else {
                str4 = "";
            }
            contentValues.put("cmdData", str4);
            contentValues.put("localId", cmd.getLocalId());
            contentValues.put("serverId", cmd.getServerId());
            contentValues.put("channel", sb.toString());
            contentValues.put(NotificationCompat.CATEGORY_MESSAGE, cmd.getMsg());
            contentValues.put("desc", cmd.getDesc());
            contentValues.put("createTime", INSTANCE.getCurrentDateStr());
            contentValues.put("updateTime", INSTANCE.getCurrentDateStr());
            contentValues.put("retryCount", Integer.valueOf(cmd.getRetryCount()));
            contentValues.put("processStatus", 0);
            mWritableDatabase.insert(str, (String) null, contentValues);
            Log.debug("insertCmd: cmd = " + cmd.getCmd() + ", serverId = " + cmd.getServerId() + ", " + str);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void retryDownCmd(MsgProtos.Cmd cmd) {
        Intrinsics.checkParameterIsNotNull(cmd, "cmd");
        synchronized (mLock) {
            Log.debug("retryDownCmd: cmd = " + cmd.getCmd() + ", serverId = " + cmd.getServerId() + ", retryCount=" + cmd.getRetryCount());
            CmdProcessHelper cmdProcessHelper = INSTANCE;
            String serverId = cmd.getServerId();
            Intrinsics.checkExpressionValueIsNotNull(serverId, "cmd.serverId");
            if (!cmdProcessHelper.checkCmdExisted(serverId, CmdDBHelper.TABLE_DOWN)) {
                INSTANCE.insertCmd(cmd, CmdDBHelper.TABLE_DOWN);
                Unit unit = Unit.INSTANCE;
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("updateTime", INSTANCE.getCurrentDateStr());
                contentValues.put("retryCount", Integer.valueOf(cmd.getRetryCount() + 1));
                contentValues.put("processStatus", 0);
                Integer.valueOf(mWritableDatabase.update(CmdDBHelper.TABLE_DOWN, contentValues, "serverId = ?", new String[]{cmd.getServerId().toString()}));
            }
        }
    }

    private final String getChildFolder(String str) {
        if (str.length() <= 4) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length() - 2;
        int length2 = str.length();
        if (str != null) {
            String substring = str.substring(length, length2);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("/");
            int length3 = str.length() - 4;
            int length4 = str.length() - 2;
            if (str != null) {
                String substring2 = str.substring(length3, length4);
                Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring2);
                sb.append("/");
                return sb.toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final String getCurrentDateStr() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "Calendar.getInstance()");
        Date time = instance.getTime();
        Intrinsics.checkExpressionValueIsNotNull(time, "Calendar.getInstance().time");
        return getDateStr(time);
    }

    private final String getDateStr(Date date) {
        return DateFormat.format("yyyy-MM-dd kk:mm:ss", date).toString();
    }

    public final void deleteDownCmd(String str) {
        Intrinsics.checkParameterIsNotNull(str, "serverId");
        deleteCmd(str, CmdDBHelper.TABLE_DOWN);
    }

    private final void deleteCmd(String str, String str2) {
        synchronized (mLock) {
            mWritableDatabase.delete(str2, "serverId = ?", new String[]{str});
            Log.debug("deleteCmd: msgId = " + str + ", " + str2);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clearUpAllCmd() {
        synchronized (mLock) {
            try {
                INSTANCE.clearAllCmdDataFiles(CmdDBHelper.TABLE_DOWN);
                INSTANCE.clearAllCmdDataFiles(CmdDBHelper.TABLE_UP);
                mWritableDatabase.delete(CmdDBHelper.TABLE_DOWN, (String) null, (String[]) null);
                Integer.valueOf(mWritableDatabase.delete(CmdDBHelper.TABLE_UP, (String) null, (String[]) null));
            } catch (Exception e) {
                Log.debug("clear all cmd error. " + e.getMessage());
                Unit unit = Unit.INSTANCE;
            }
        }
        return;
    }

    public final void clearUpHistoryCmd(long j) {
        synchronized (mLock) {
            try {
                String dateStr = INSTANCE.getDateStr(new Date(j));
                Log.debug("clearUpHistoryCmd, time = " + dateStr + ". start");
                INSTANCE.clearHistoryCmdDataFiles(CmdDBHelper.TABLE_DOWN, dateStr);
                INSTANCE.clearHistoryCmdDataFiles(CmdDBHelper.TABLE_UP, dateStr);
                mWritableDatabase.delete(CmdDBHelper.TABLE_DOWN, "processStatus = ? AND createTime < ?", new String[]{String.valueOf(2), dateStr});
                mWritableDatabase.delete(CmdDBHelper.TABLE_UP, "processStatus = ? AND createTime < ?", new String[]{String.valueOf(2), dateStr});
                Log.debug("clearUpHistoryCmd, time = " + dateStr + ". finish");
            } catch (Exception e) {
                Log.debug("clear history cmd error. " + e.getMessage());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void clearHistoryCmdDataFiles(String str, String str2) {
        Cursor query = mReadableDatabase.query(str, (String[]) null, "processStatus = ? AND createTime < ?", new String[]{String.valueOf(2), str2}, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("cmdData"));
            if (!TextUtils.isEmpty(string)) {
                File file = new File(string);
                if (file.exists()) {
                    file.delete();
                }
            }
        }
        query.close();
    }

    private final void clearAllCmdDataFiles(String str) {
        Cursor query = mReadableDatabase.query(str, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("cmdData"));
            if (!TextUtils.isEmpty(string)) {
                File file = new File(string);
                if (file.exists()) {
                    file.delete();
                }
            }
        }
        query.close();
    }

    public final MsgProtos.Cmd getExecuteDownCmd() {
        return getExecuteCmd(CmdDBHelper.TABLE_DOWN);
    }

    public final MsgProtos.Cmd getExecuteUpCmd() {
        return getExecuteCmd(CmdDBHelper.TABLE_UP);
    }

    private final MsgProtos.Cmd getExecuteCmd(String str) {
        MsgProtos.Cmd cmd;
        synchronized (mLock) {
            Cursor query = mReadableDatabase.query(str, (String[]) null, "processStatus == ? OR processStatus == ?", new String[]{String.valueOf(0), String.valueOf(1)}, (String) null, (String) null, (String) null, "1");
            cmd = null;
            if (query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("cmdData"));
                byte[] bArr = null;
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    if (file.exists() && file.length() > 0) {
                        bArr = FilesKt.readBytes(file);
                    }
                }
                MsgProtos.Cmd.Builder priority = MsgProtos.Cmd.newBuilder().setCmd(query.getInt(query.getColumnIndex("cmd"))).setTimestamp(query.getLong(query.getColumnIndex("timestamp"))).setFromClientId(query.getString(query.getColumnIndex("fromClientId"))).setToClientId(query.getString(query.getColumnIndex("toClientId"))).setStatus(query.getInt(query.getColumnIndex(NotificationCompat.CATEGORY_STATUS))).setPriority(query.getInt(query.getColumnIndex("priority")));
                if (bArr == null) {
                    bArr = new byte[0];
                }
                MsgProtos.Cmd.Builder serverId = priority.setCmdData(ByteString.copyFrom(bArr)).setLocalId(query.getString(query.getColumnIndex("localId"))).setServerId(query.getString(query.getColumnIndex("serverId")));
                String string2 = query.getString(query.getColumnIndex("channel"));
                Intrinsics.checkExpressionValueIsNotNull(string2, "query.getString(query.getColumnIndex(\"channel\"))");
                cmd = serverId.addAllChannel(StringsKt.split$default((CharSequence) string2, new String[]{";"}, false, 0, 6, (Object) null)).setMsg(query.getString(query.getColumnIndex(NotificationCompat.CATEGORY_MESSAGE))).setDesc(query.getString(query.getColumnIndex("desc"))).setLocalDBId(query.getInt(query.getColumnIndex("id"))).setRetryCount(query.getInt(query.getColumnIndex("retryCount"))).build();
                StringBuilder sb = new StringBuilder();
                sb.append("getExecuteCmd: localId = ");
                Intrinsics.checkExpressionValueIsNotNull(cmd, "cmd");
                sb.append(cmd.getLocalDBId());
                sb.append(", cmd = ");
                sb.append(cmd.getCmd());
                sb.append(", serverId = ");
                sb.append(cmd.getServerId());
                sb.append(' ');
                sb.append(str);
                Log.debug(sb.toString());
            }
            query.close();
        }
        return cmd;
    }

    public final void executeDownCmdIng(int i) {
        updateProcessStatus(i, CmdDBHelper.TABLE_DOWN, 3);
    }

    public final void executeDownCmdSuccess(int i) {
        updateProcessStatus(i, CmdDBHelper.TABLE_DOWN, 2);
    }

    public final void executeDownCmdFail(int i) {
        updateProcessStatus(i, CmdDBHelper.TABLE_DOWN, 1);
    }

    public final void executeUpCmdIng(int i) {
        updateProcessStatus(i, CmdDBHelper.TABLE_UP, 3);
    }

    public final void executeUpCmdSuccess(int i) {
        updateProcessStatus(i, CmdDBHelper.TABLE_UP, 2);
    }

    public final void executeUpCmdFail(int i) {
        updateProcessStatus(i, CmdDBHelper.TABLE_UP, 1);
    }

    private final void updateProcessStatus(int i, String str, int i2) {
        synchronized (mLock) {
            if (INSTANCE.checkCmdExistedWithLocalId(i, str)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("updateTime", INSTANCE.getCurrentDateStr());
                contentValues.put("processStatus", Integer.valueOf(i2));
                mWritableDatabase.update(str, contentValues, "id = ?", new String[]{String.valueOf(i)});
                Log.debug("updateProcessStatus: localId=" + i + ", " + str + ", status=" + i2);
            } else {
                Log.debug("updateProcessStatus: localId=" + i + ", " + str + ", not existed");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean checkCmdExisted(String str, String str2) {
        Cursor query = mReadableDatabase.query(str2, (String[]) null, "serverId = ?", new String[]{str}, (String) null, (String) null, (String) null);
        boolean moveToFirst = query.moveToFirst();
        query.close();
        return moveToFirst;
    }

    private final boolean checkCmdExistedWithLocalId(int i, String str) {
        Cursor query = mReadableDatabase.query(str, (String[]) null, "id = ?", new String[]{String.valueOf(i)}, (String) null, (String) null, (String) null);
        boolean moveToFirst = query.moveToFirst();
        query.close();
        return moveToFirst;
    }

    public final void saveLocaId(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        synchronized (mLock) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("localId", Integer.valueOf(i));
            contentValues.put("msgId", str);
            contentValues.put("createTime", INSTANCE.getCurrentDateStr());
            mWritableDatabase.insert(CmdDBHelper.TABLE_STATUS, (String) null, contentValues);
        }
    }

    public final String getMsgIdForLocalId(int i) {
        synchronized (mLock) {
            Cursor query = mReadableDatabase.query(CmdDBHelper.TABLE_STATUS, (String[]) null, "localId = ?", new String[]{String.valueOf(i)}, (String) null, (String) null, (String) null);
            if (query.moveToFirst()) {
                String string = query.getString(query.getColumnIndex("msgId"));
                Intrinsics.checkExpressionValueIsNotNull(string, "query.getString(query.getColumnIndex(\"msgId\"))");
                return string;
            }
            query.close();
            return "";
        }
    }

    public final void clearUpHistoryMsgCache(long j) {
        synchronized (mLock) {
            Log.debug("clearUpHistoryMsgCache");
            String dateStr = INSTANCE.getDateStr(new Date(j));
            mWritableDatabase.delete(CmdDBHelper.TABLE_MSG_CACHE, "updateTime < ?", new String[]{dateStr});
        }
    }
}
