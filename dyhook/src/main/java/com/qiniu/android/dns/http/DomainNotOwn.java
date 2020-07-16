package com.qiniu.android.dns.http;

import com.qiniu.android.dns.DnsException;

public class DomainNotOwn extends DnsException {
    public DomainNotOwn(String str) {
        super(str, "dns not own");
    }
}
