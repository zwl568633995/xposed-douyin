package com.jiongbull.jlog.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LogLevel {
    public static final String DEBUG = "DEBUG";
    public static final String ERROR = "ERROR";
    public static final String INFO = "INFO";
    public static final String JSON = "JSON";
    public static final String VERBOSE = "VERBOSE";
    public static final String WARN = "WARN";
    public static final String WTF = "WTF";
}
