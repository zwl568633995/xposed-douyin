package com.jiongbull.jlog.util;

import android.text.format.DateFormat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Calendar;

public final class TimeUtils {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ZoneOffset {
        public static final long N0000 = 0;
        public static final long N0100 = -3600000;
        public static final long N0200 = -7200000;
        public static final long N0300 = -10800000;
        public static final long N0330 = -12600000;
        public static final long N0400 = -14400000;
        public static final long N0430 = -16200000;
        public static final long N0500 = -18000000;
        public static final long N0600 = -21600000;
        public static final long N0700 = -25200000;
        public static final long N0800 = -28800000;
        public static final long N0900 = -32400000;
        public static final long N1000 = -36000000;
        public static final long N1100 = -39600000;
        public static final long N1200 = -43200000;
        public static final long P0100 = 3600000;
        public static final long P0200 = 7200000;
        public static final long P0300 = 10800000;
        public static final long P0330 = 12600000;
        public static final long P0400 = 14400000;
        public static final long P0430 = 16200000;
        public static final long P0500 = 18000000;
        public static final long P0530 = 19800000;
        public static final long P0600 = 21600000;
        public static final long P0630 = 23400000;
        public static final long P0700 = 25200000;
        public static final long P0800 = 28800000;
        public static final long P0830 = 30600000;
        public static final long P0900 = 32400000;
        public static final long P0930 = 34200000;
        public static final long P1000 = 36000000;
        public static final long P1100 = 39600000;
        public static final long P1200 = 43200000;
        public static final long P1300 = 46800000;
        public static final long P1400 = 50400000;
    }

    private TimeUtils() {
    }

    public static Calendar getCalendar(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return instance;
    }

    public static long getCurUtcMillis() {
        return System.currentTimeMillis();
    }

    public static long getUtcMillis(long j) {
        return j - ((long) getCalendar(j).get(15));
    }

    public static long getMillis(long j, long j2) {
        return getUtcMillis(j) + j2;
    }

    public static long getCurMillis(long j) {
        return getMillis(System.currentTimeMillis(), j);
    }

    public static String getCurDate(long j) {
        return format(getCurMillis(j), "yyyy-MM-dd");
    }

    public static String format(long j, String str) {
        return DateFormat.format(str, j).toString();
    }

    public static String getCurTime(long j, String str) {
        return format(getCurMillis(j), str);
    }

    public static int getCurHour(long j) {
        return getCalendar(getCurMillis(j)).get(11);
    }
}
