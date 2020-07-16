package com.qiniu.android.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public final class Dns {
    public static String[] getAddresses(String str) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            int length = allByName.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = allByName[i].getHostAddress();
            }
            return strArr;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public static String getAddress(String str) {
        String[] addresses = getAddresses(str);
        if (addresses == null || addresses.length == 0) {
            return null;
        }
        return addresses[0];
    }

    public static String getAddressesString(String str) {
        return StringUtils.join(getAddresses(str), ";");
    }
}
