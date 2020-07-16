package com.qiniu.android.dns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.qiniu.android.dns.NetworkInfo;
import java.util.Locale;

public final class NetworkReceiver extends BroadcastReceiver {
    private static final Uri PREFERRED_APN_URI = Uri.parse("content://telephony/carriers/preferapn");
    private static DnsManager mdnsManager;

    public static NetworkInfo createNetInfo(NetworkInfo networkInfo, Context context) {
        NetworkInfo.NetSatus netSatus;
        String extraInfo;
        if (networkInfo == null) {
            return NetworkInfo.noNetwork;
        }
        int i = 0;
        if (networkInfo.getType() == 1) {
            netSatus = NetworkInfo.NetSatus.WIFI;
        } else {
            NetworkInfo.NetSatus netSatus2 = NetworkInfo.NetSatus.MOBILE;
            Cursor query = context.getContentResolver().query(PREFERRED_APN_URI, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null) {
                query.moveToFirst();
                String string = query.getString(query.getColumnIndex("user"));
                if (!TextUtils.isEmpty(string) && (string.startsWith("ctwap") || string.startsWith("ctnet"))) {
                    i = 1;
                }
            }
            query.close();
            if (!(i == 1 || (extraInfo = networkInfo.getExtraInfo()) == null)) {
                String lowerCase = extraInfo.toLowerCase(Locale.getDefault());
                if (lowerCase.equals("cmwap") || lowerCase.equals("cmnet")) {
                    i = 3;
                } else if (lowerCase.equals("3gnet") || lowerCase.equals("uninet") || lowerCase.equals("3gwap") || lowerCase.equals("uniwap")) {
                    i = 2;
                }
            }
            netSatus = netSatus2;
        }
        return new NetworkInfo(netSatus, i);
    }

    public static void setDnsManager(DnsManager dnsManager) {
        mdnsManager = dnsManager;
    }

    public void onReceive(Context context, Intent intent) {
        if (mdnsManager != null) {
            mdnsManager.onNetworkChange(createNetInfo(((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo(), context));
        }
    }
}
