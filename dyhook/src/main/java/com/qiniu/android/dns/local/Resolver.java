package com.qiniu.android.dns.local;

import com.qiniu.android.dns.DnsException;
import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Random;

public final class Resolver implements IResolver {
    private static final Random random = new Random();
    final InetAddress address;

    public Resolver(InetAddress inetAddress) {
        this.address = inetAddress;
    }

    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
        int nextInt;
        synchronized (random) {
            nextInt = random.nextInt() & 255;
        }
        byte[] udpCommunicate = udpCommunicate(DnsMessage.buildQuery(domain.domain, nextInt));
        if (udpCommunicate != null) {
            return DnsMessage.parseResponse(udpCommunicate, nextInt, domain.domain);
        }
        throw new DnsException(domain.domain, "cant get answer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] udpCommunicate(byte[] r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch:{ all -> 0x002f }
            r1.<init>()     // Catch:{ all -> 0x002f }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ all -> 0x002c }
            int r2 = r6.length     // Catch:{ all -> 0x002c }
            java.net.InetAddress r3 = r5.address     // Catch:{ all -> 0x002c }
            r4 = 53
            r0.<init>(r6, r2, r3, r4)     // Catch:{ all -> 0x002c }
            r6 = 10000(0x2710, float:1.4013E-41)
            r1.setSoTimeout(r6)     // Catch:{ all -> 0x002c }
            r1.send(r0)     // Catch:{ all -> 0x002c }
            java.net.DatagramPacket r6 = new java.net.DatagramPacket     // Catch:{ all -> 0x002c }
            r0 = 1500(0x5dc, float:2.102E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x002c }
            r6.<init>(r2, r0)     // Catch:{ all -> 0x002c }
            r1.receive(r6)     // Catch:{ all -> 0x002c }
            byte[] r6 = r6.getData()     // Catch:{ all -> 0x002c }
            r1.close()
            return r6
        L_0x002c:
            r6 = move-exception
            r0 = r1
            goto L_0x0030
        L_0x002f:
            r6 = move-exception
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()
        L_0x0035:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiniu.android.dns.local.Resolver.udpCommunicate(byte[]):byte[]");
    }
}
