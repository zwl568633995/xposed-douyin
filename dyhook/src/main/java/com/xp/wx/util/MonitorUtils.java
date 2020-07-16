package com.xp.wx.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.xp.wx.spellbook.util.AppUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MonitorUtils {
    private static MonitorUtils mMonitorUtils;
    private Context mContext = AppUtil.INSTANCE.getSystemContext();

    public static MonitorUtils getInstance() {
        if (mMonitorUtils == null) {
            synchronized (MonitorUtils.class) {
                if (mMonitorUtils == null) {
                    mMonitorUtils = new MonitorUtils();
                }
            }
        }
        return mMonitorUtils;
    }

    private MonitorUtils() {
    }

    public String getRebotInfoToJson() {
        int chargeInfo = getChargeInfo();
        return "{\"cpuinfo\":\"" + getCPUInfo() + "\",\"ram\":\"" + getRAM() + "\",\"storage\":\"" + getMemory() + "\",\"version\":\"" + getVersionInfo() + "\",\"batterylevel\":\"" + (chargeInfo & 127) + "\",\"ischarge\":\"" + (chargeInfo >>> 7) + "\"}";
    }

    public int getCPUInfo() {
        return isRoot() ? getCPUInfoCmds() : getCPUInfoFiles();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x00d2=Splitter:B:60:0x00d2, B:52:0x00c4=Splitter:B:52:0x00c4} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getCPUInfoFiles() {
        /*
            r17 = this;
            r1 = 2
            r2 = 0
            r0 = 0
            r4 = r0
            r5 = r2
            r7 = r5
            r9 = r7
            r11 = r9
            r0 = 2
        L_0x000a:
            if (r0 <= 0) goto L_0x00e9
            r9 = -1
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00c3 }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00c3 }
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00c3 }
            java.io.File r13 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00c3 }
            java.lang.String r14 = "/proc/stat"
            r13.<init>(r14)     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00c3 }
            r12.<init>(r13)     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00c3 }
            r11.<init>(r12)     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00c3 }
            r10.<init>(r11)     // Catch:{ FileNotFoundException -> 0x00d1, IOException -> 0x00c3 }
            java.lang.String r4 = r10.readLine()     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            if (r4 != 0) goto L_0x0033
            r10.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0032
        L_0x002d:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x0032:
            return r9
        L_0x0033:
            java.lang.String r11 = " "
            java.lang.String[] r4 = r4.split(r11)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            r11 = 0
            r11 = r4[r11]     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            java.lang.String r12 = "cpu"
            boolean r11 = r11.contains(r12)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            if (r11 != 0) goto L_0x0051
            r10.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004d
        L_0x0048:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x004d:
            r11 = r7
            r7 = r2
            goto L_0x00eb
        L_0x0051:
            r11 = r4[r1]     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r11 = java.lang.Long.parseLong(r11)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            r13 = 3
            r13 = r4[r13]     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r13 = java.lang.Long.parseLong(r13)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r11 = r11 + r13
            r13 = 4
            r13 = r4[r13]     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r13 = java.lang.Long.parseLong(r13)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r11 = r11 + r13
            r13 = 6
            r13 = r4[r13]     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r13 = java.lang.Long.parseLong(r13)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r13 = r13 + r11
            r15 = 5
            r15 = r4[r15]     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r15 = java.lang.Long.parseLong(r15)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r13 = r13 + r15
            r15 = 7
            r15 = r4[r15]     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r15 = java.lang.Long.parseLong(r15)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r13 = r13 + r15
            r15 = 8
            r4 = r4[r15]     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r15 = java.lang.Long.parseLong(r4)     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
            long r13 = r13 + r15
            int r4 = r0 + -1
            if (r4 != 0) goto L_0x009a
            r10.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0095
        L_0x0090:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x0095:
            r2 = r11
            r11 = r7
            r7 = r13
            goto L_0x00eb
        L_0x009a:
            r15 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r15)     // Catch:{ InterruptedException -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r0 = move-exception
            r15 = r0
            r15.printStackTrace()     // Catch:{ FileNotFoundException -> 0x00bd, IOException -> 0x00ba, all -> 0x00b6 }
        L_0x00a5:
            r10.close()     // Catch:{ IOException -> 0x00a9 }
            goto L_0x00ae
        L_0x00a9:
            r0 = move-exception
            r9 = r0
            r9.printStackTrace()
        L_0x00ae:
            r0 = r4
            r4 = r10
            r9 = r5
            r5 = r11
            r11 = r7
            r7 = r13
            goto L_0x000a
        L_0x00b6:
            r0 = move-exception
            r1 = r0
            r4 = r10
            goto L_0x00df
        L_0x00ba:
            r0 = move-exception
            r4 = r10
            goto L_0x00c4
        L_0x00bd:
            r0 = move-exception
            r4 = r10
            goto L_0x00d2
        L_0x00c0:
            r0 = move-exception
            r1 = r0
            goto L_0x00df
        L_0x00c3:
            r0 = move-exception
        L_0x00c4:
            r0.printStackTrace()     // Catch:{ all -> 0x00c0 }
            r4.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00d0
        L_0x00cb:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x00d0:
            return r9
        L_0x00d1:
            r0 = move-exception
        L_0x00d2:
            r0.printStackTrace()     // Catch:{ all -> 0x00c0 }
            r4.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x00de
        L_0x00d9:
            r0 = move-exception
            r1 = r0
            r1.printStackTrace()
        L_0x00de:
            return r9
        L_0x00df:
            r4.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00e8
        L_0x00e3:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x00e8:
            throw r1
        L_0x00e9:
            r2 = r5
            r5 = r9
        L_0x00eb:
            r0 = 1120403456(0x42c80000, float:100.0)
            long r2 = r2 - r5
            float r1 = (float) r2
            long r7 = r7 - r11
            float r2 = (float) r7
            float r1 = r1 / r2
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.util.MonitorUtils.getCPUInfoFiles():int");
    }

    private int getCPUInfoCmds() {
        String str = AdbShellUtil.ExeCmds("top -m 10 -n 1 -d 1 -s cpu").split("\n")[0];
        if (str == null || str.trim().length() == 0) {
            return -1;
        }
        String[] split = str.split(", ");
        int i = 0;
        for (String split2 : split) {
            String str2 = split2.split(" ")[1];
            i += Integer.parseInt(str2.substring(0, str2.indexOf("%")));
        }
        return i;
    }

    public boolean isRoot() {
        String ExeCmds;
        if ((new File("/system/bin/su").exists() || new File("/system/xbin/su").exists()) && (ExeCmds = AdbShellUtil.ExeCmds("")) != null && !ExeCmds.contains("Unallowed user")) {
            return true;
        }
        return false;
    }

    public boolean rebootWechat() {
        if (!isRoot() || AdbShellUtil.ExeCmds("pkill -9 com.tencent.mm").trim().length() != 0 || AdbShellUtil.ExeCmds("am start -n com.tencent.mm/.ui.LauncherUI").contains("Error")) {
            return false;
        }
        return true;
    }

    public void rebootDevice() {
        AdbShellUtil.ExeCmds("reboot");
    }

    public void shutdownDevice() {
        AdbShellUtil.ExeCmds("reboot -p");
    }

    public String ScreenCap() {
        File file = new File(Environment.getExternalStorageDirectory() + File.separator + "screen_Cap");
        if (file.exists() || file.mkdirs()) {
            if (!AdbShellUtil.ExeCmds("am start -n com.tencent.mm/.ui.LauncherUI").contains("Error")) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (isRoot()) {
                if (AdbShellUtil.ExeCmds("screencap -p " + file.getAbsolutePath() + "/current.png").trim().length() != 0) {
                    return "";
                }
            }
            byte[] bArr = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(file + "/current.png");
                bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return Base64.encodeToString(bArr, 0).replaceAll("\n", "");
        }
        if (this.mContext != null && 23 <= Build.VERSION.SDK_INT) {
            requestPower("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return "";
    }

    public String getDeviceSerial() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"ro.serialno"}).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getMac(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return getMacDefault(context);
        }
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT >= 24) {
            return Build.VERSION.SDK_INT >= 24 ? getMacFromHardware() : "02:00:00:00:00:00";
        }
        return getMacFromFile();
    }

    private static String getMacDefault(Context context) {
        WifiManager wifiManager;
        WifiInfo wifiInfo;
        if (context == null || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null) {
            return "02:00:00:00:00:00";
        }
        try {
            wifiInfo = wifiManager.getConnectionInfo();
        } catch (Exception unused) {
            wifiInfo = null;
        }
        if (wifiInfo == null) {
            return null;
        }
        String macAddress = wifiInfo.getMacAddress();
        return !TextUtils.isEmpty(macAddress) ? macAddress.toUpperCase(Locale.ENGLISH) : macAddress;
    }

    private static String getMacFromFile() {
        try {
            return new BufferedReader(new FileReader(new File("/sys/class/net/wlan0/address"))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    private static String getMacFromHardware() {
        try {
            for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (t.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = t.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = hardwareAddress.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception e) {
            e.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    public String getTelephonyNumber() {
        Context context = this.mContext;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if ((ActivityCompat.checkSelfPermission(this.mContext, "android.permission.READ_SMS") == 0 || ActivityCompat.checkSelfPermission(this.mContext, "android.permission.READ_PHONE_NUMBERS") == 0 || ActivityCompat.checkSelfPermission(this.mContext, "android.permission.READ_PHONE_STATE") == 0) && telephonyManager != null) {
                    return telephonyManager.getLine1Number();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public int getMemory() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        double availableBlocksLong = (double) statFs.getAvailableBlocksLong();
        Double.isNaN(availableBlocksLong);
        double blockCountLong = (double) statFs.getBlockCountLong();
        Double.isNaN(blockCountLong);
        return (int) (((availableBlocksLong * 1.0d) / blockCountLong) * 100.0d);
    }

    public int getChargeInfo() {
        if (this.mContext == null) {
            return 0;
        }
        Intent registerReceiver = this.mContext.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (2 == intExtra2 || 5 == intExtra2) {
            return intExtra | 128;
        }
        if (4 == intExtra2 || 3 == intExtra2) {
            return intExtra & 127;
        }
        return 0;
    }

    public int getRAM() {
        Context context = this.mContext;
        if (context == null) {
            return -1;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        double d = (double) memoryInfo.availMem;
        Double.isNaN(d);
        double d2 = (double) memoryInfo.totalMem;
        Double.isNaN(d2);
        return (int) (((d * 1.0d) / d2) * 100.0d);
    }

    public String getVersionInfo() {
        Context context = this.mContext;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 16384).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public int getVersionCode() {
        return getVersionCode("com.xp.wx.hd");
    }

    public int getVersionCode(String str) {
        Context context = this.mContext;
        if (context == null) {
            return 0;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 16384).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getVersionName() {
        return getVersionName("com.xp.wx.hd");
    }

    public String getVersionName(String str) {
        Context context = this.mContext;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 16384).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getBluetoothName() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.getName();
            }
            return "";
        } catch (Exception e) {
            Log.warn((Throwable) e);
            return "";
        }
    }

    public static String getBluetoothMac() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.getAddress();
            }
            return "";
        } catch (Exception e) {
            Log.warn((Throwable) e);
            return "";
        }
    }

    public String getLogInfo(String str) {
        return AdbShellUtil.ExeCmds("logcat -d -v time | grep \"" + str + "\"").replaceAll("\n", "<>").replaceAll("\\{", "(").replaceAll("\\}", ")").replaceAll("\"", " ");
    }

    public ArrayList<Integer> getPid(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.processName.contains(str)) {
                arrayList.add(Integer.valueOf(next.pid));
            }
        }
        return arrayList;
    }

    public void requestPower(String str) {
        if (ContextCompat.checkSelfPermission(this.mContext, str) != -1) {
            return;
        }
        if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) this.mContext, str)) {
            Log.error("requestPower", "Yong Hu Ju Jue Guo Ci Quan Xian");
            return;
        }
        ActivityCompat.requestPermissions((Activity) this.mContext, new String[]{str}, 1);
    }
}
