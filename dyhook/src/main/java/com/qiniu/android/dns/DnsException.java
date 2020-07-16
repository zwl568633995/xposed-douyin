package com.qiniu.android.dns;

import java.io.IOException;

public class DnsException extends IOException {
    public DnsException(String str, String str2) {
        super(str + ": " + str2);
    }
}
