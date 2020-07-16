package com.wujieshuju.huidou.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public static String stampToDate(long j) {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(j * 1000));
    }

    public static boolean isInValidTime() {
        return System.currentTimeMillis() / 1000 < ConfigUtil.getInstance().getLoginInfo().validTime;
    }
}
