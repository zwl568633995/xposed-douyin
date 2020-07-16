package com.qiniu.android.dns.local;

import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import java.io.IOException;

public final class HijackingDetectWrapper implements IResolver {
    private final Resolver resolver;

    public HijackingDetectWrapper(Resolver resolver2) {
        this.resolver = resolver2;
    }

    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
        boolean z;
        Record[] resolve = this.resolver.resolve(domain, networkInfo);
        int i = 0;
        if (domain.hasCname) {
            int length = resolve.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (resolve[i2].isCname()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                throw new DnshijackingException(domain.domain, this.resolver.address.getHostAddress());
            }
        }
        if (domain.maxTtl != 0) {
            int length2 = resolve.length;
            while (i < length2) {
                Record record = resolve[i];
                if (record.isCname() || record.ttl <= domain.maxTtl) {
                    i++;
                } else {
                    throw new DnshijackingException(domain.domain, this.resolver.address.getHostAddress(), record.ttl);
                }
            }
        }
        return resolve;
    }
}
