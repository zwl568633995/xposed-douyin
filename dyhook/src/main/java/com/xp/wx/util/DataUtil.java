package com.xp.wx.util;

import android.text.format.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataUtil {
    public static Date getDayBegin() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTime();
    }

    public static Date getDayEnd() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(11, 23);
        gregorianCalendar.set(12, 59);
        gregorianCalendar.set(13, 59);
        gregorianCalendar.set(14, 999);
        return gregorianCalendar.getTime();
    }

    public static String getCurrentDateStr() {
        return getDateStr(Calendar.getInstance().getTime());
    }

    public static String getDateStr(Date date) {
        return DateFormat.format("yyyy-MM-dd kk:mm:ss", date).toString();
    }
}
