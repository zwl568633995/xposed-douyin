package com.jiongbull.jlog.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LogSegment {
    public static final int FOUR_HOURS = 4;
    public static final int ONE_HOUR = 1;
    public static final int SIX_HOURS = 6;
    public static final int THREE_HOURS = 3;
    public static final int TWELVE_HOURS = 12;
    public static final int TWENTY_FOUR_HOURS = 24;
    public static final int TWO_HOURS = 2;
}
