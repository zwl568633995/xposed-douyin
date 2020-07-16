package com.qiniu.android.dns;

import com.qiniu.android.dns.local.Hosts;
import com.qiniu.android.dns.util.LruCache;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class DnsManager {
    private final LruCache<String, Record[]> cache;
    private final Hosts hosts;
    private volatile int index;
    private volatile NetworkInfo info;
    private final IResolver[] resolvers;
    private final IpSorter sorter;

    public DnsManager(NetworkInfo networkInfo, IResolver[] iResolverArr) {
        this(networkInfo, iResolverArr, (IpSorter) null);
    }

    public DnsManager(NetworkInfo networkInfo, IResolver[] iResolverArr, IpSorter ipSorter) {
        this.hosts = new Hosts();
        this.info = null;
        this.index = 0;
        this.info = networkInfo == null ? NetworkInfo.normal : networkInfo;
        this.resolvers = (IResolver[]) iResolverArr.clone();
        this.cache = new LruCache<>();
        this.sorter = ipSorter == null ? new ShuffleIps() : ipSorter;
    }

    private static Record[] trimCname(Record[] recordArr) {
        ArrayList arrayList = new ArrayList(recordArr.length);
        for (Record record : recordArr) {
            if (record != null && record.type == 1) {
                arrayList.add(record);
            }
        }
        return (Record[]) arrayList.toArray(new Record[arrayList.size()]);
    }

    private static String[] records2Ip(Record[] recordArr) {
        if (recordArr == null || recordArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(recordArr.length);
        for (Record record : recordArr) {
            arrayList.add(record.value);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean validIP(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || str.contains("-")) {
            return false;
        }
        try {
            int indexOf = str.indexOf(46);
            if (indexOf != -1 && Integer.parseInt(str.substring(0, indexOf)) > 255) {
                return false;
            }
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(46, i);
            if (indexOf2 != -1 && Integer.parseInt(str.substring(i, indexOf2)) > 255) {
                return false;
            }
            int i2 = indexOf2 + 1;
            int indexOf3 = str.indexOf(46, i2);
            if (indexOf3 == -1 || Integer.parseInt(str.substring(i2, indexOf3)) <= 255 || Integer.parseInt(str.substring(indexOf3 + 1, str.length() - 1)) <= 255 || str.charAt(str.length() - 1) == '.') {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public String[] query(String str) throws IOException {
        return query(new Domain(str));
    }

    public String[] query(Domain domain) throws IOException {
        if (domain == null) {
            throw new IOException("null domain");
        } else if (domain.domain == null || domain.domain.trim().length() == 0) {
            throw new IOException("empty domain " + domain.domain);
        } else if (validIP(domain.domain)) {
            return new String[]{domain.domain};
        } else {
            String[] queryInternal = queryInternal(domain);
            return (queryInternal == null || queryInternal.length <= 1) ? queryInternal : this.sorter.sort(queryInternal);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        	at java.util.ArrayList.get(ArrayList.java:429)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private java.lang.String[] queryInternal(com.qiniu.android.dns.Domain r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r10.hostsFirst
            if (r0 == 0) goto L_0x0012
            com.qiniu.android.dns.local.Hosts r0 = r9.hosts
            com.qiniu.android.dns.NetworkInfo r1 = r9.info
            java.lang.String[] r0 = r0.query(r10, r1)
            if (r0 == 0) goto L_0x0012
            int r1 = r0.length
            if (r1 == 0) goto L_0x0012
            return r0
        L_0x0012:
            com.qiniu.android.dns.util.LruCache<java.lang.String, com.qiniu.android.dns.Record[]> r0 = r9.cache
            monitor-enter(r0)
            com.qiniu.android.dns.NetworkInfo r1 = r9.info     // Catch:{ all -> 0x00ec }
            com.qiniu.android.dns.NetworkInfo r2 = com.qiniu.android.dns.NetworkInfo.normal     // Catch:{ all -> 0x00ec }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00ec }
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0037
            boolean r1 = com.qiniu.android.dns.Network.isNetworkChanged()     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x0037
            com.qiniu.android.dns.util.LruCache<java.lang.String, com.qiniu.android.dns.Record[]> r1 = r9.cache     // Catch:{ all -> 0x00ec }
            r1.clear()     // Catch:{ all -> 0x00ec }
            com.qiniu.android.dns.IResolver[] r1 = r9.resolvers     // Catch:{ all -> 0x00ec }
            monitor-enter(r1)     // Catch:{ all -> 0x00ec }
            r9.index = r3     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            r1 = r2
            goto L_0x0054
        L_0x0034:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r10     // Catch:{ all -> 0x00ec }
        L_0x0037:
            com.qiniu.android.dns.util.LruCache<java.lang.String, com.qiniu.android.dns.Record[]> r1 = r9.cache     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r10.domain     // Catch:{ all -> 0x00ec }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x00ec }
            com.qiniu.android.dns.Record[] r1 = (com.qiniu.android.dns.Record[]) r1     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x0054
            int r4 = r1.length     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x0054
            r4 = r1[r3]     // Catch:{ all -> 0x00ec }
            boolean r4 = r4.isExpired()     // Catch:{ all -> 0x00ec }
            if (r4 != 0) goto L_0x0032
            java.lang.String[] r10 = records2Ip(r1)     // Catch:{ all -> 0x00ec }
            monitor-exit(r0)     // Catch:{ all -> 0x00ec }
            return r10
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x00ec }
            int r0 = r9.index
            r4 = 0
        L_0x0058:
            com.qiniu.android.dns.IResolver[] r5 = r9.resolvers
            int r6 = r5.length
            if (r4 >= r6) goto L_0x00a7
            int r6 = r0 + r4
            int r5 = r5.length
            int r6 = r6 % r5
            com.qiniu.android.dns.NetworkInfo r5 = r9.info
            java.lang.String r7 = com.qiniu.android.dns.Network.getIp()
            com.qiniu.android.dns.IResolver[] r8 = r9.resolvers     // Catch:{ DomainNotOwn -> 0x00a4, IOException -> 0x0072 }
            r6 = r8[r6]     // Catch:{ DomainNotOwn -> 0x00a4, IOException -> 0x0072 }
            com.qiniu.android.dns.NetworkInfo r8 = r9.info     // Catch:{ DomainNotOwn -> 0x00a4, IOException -> 0x0072 }
            com.qiniu.android.dns.Record[] r1 = r6.resolve(r10, r8)     // Catch:{ DomainNotOwn -> 0x00a4, IOException -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0076:
            java.lang.String r6 = com.qiniu.android.dns.Network.getIp()
            com.qiniu.android.dns.NetworkInfo r8 = r9.info
            if (r8 != r5) goto L_0x00a7
            if (r1 == 0) goto L_0x0083
            int r5 = r1.length
            if (r5 != 0) goto L_0x00a7
        L_0x0083:
            boolean r5 = r7.equals(r6)
            if (r5 == 0) goto L_0x00a7
            com.qiniu.android.dns.IResolver[] r5 = r9.resolvers
            monitor-enter(r5)
            int r6 = r9.index     // Catch:{ all -> 0x00a1 }
            if (r6 != r0) goto L_0x009f
            int r6 = r9.index     // Catch:{ all -> 0x00a1 }
            int r6 = r6 + 1
            r9.index = r6     // Catch:{ all -> 0x00a1 }
            int r6 = r9.index     // Catch:{ all -> 0x00a1 }
            com.qiniu.android.dns.IResolver[] r7 = r9.resolvers     // Catch:{ all -> 0x00a1 }
            int r7 = r7.length     // Catch:{ all -> 0x00a1 }
            if (r6 != r7) goto L_0x009f
            r9.index = r3     // Catch:{ all -> 0x00a1 }
        L_0x009f:
            monitor-exit(r5)     // Catch:{ all -> 0x00a1 }
            goto L_0x00a4
        L_0x00a1:
            r10 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a1 }
            throw r10
        L_0x00a4:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x00a7:
            if (r1 == 0) goto L_0x00cf
            int r0 = r1.length
            if (r0 != 0) goto L_0x00ad
            goto L_0x00cf
        L_0x00ad:
            com.qiniu.android.dns.Record[] r0 = trimCname(r1)
            int r1 = r0.length
            if (r1 == 0) goto L_0x00c7
            com.qiniu.android.dns.util.LruCache<java.lang.String, com.qiniu.android.dns.Record[]> r1 = r9.cache
            monitor-enter(r1)
            com.qiniu.android.dns.util.LruCache<java.lang.String, com.qiniu.android.dns.Record[]> r2 = r9.cache     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r10.domain     // Catch:{ all -> 0x00c4 }
            r2.put(r10, r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.String[] r10 = records2Ip(r0)
            return r10
        L_0x00c4:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c4 }
            throw r10
        L_0x00c7:
            java.net.UnknownHostException r10 = new java.net.UnknownHostException
            java.lang.String r0 = "no A records"
            r10.<init>(r0)
            throw r10
        L_0x00cf:
            boolean r0 = r10.hostsFirst
            if (r0 != 0) goto L_0x00e1
            com.qiniu.android.dns.local.Hosts r0 = r9.hosts
            com.qiniu.android.dns.NetworkInfo r1 = r9.info
            java.lang.String[] r0 = r0.query(r10, r1)
            if (r0 == 0) goto L_0x00e1
            int r1 = r0.length
            if (r1 == 0) goto L_0x00e1
            return r0
        L_0x00e1:
            if (r2 == 0) goto L_0x00e4
            throw r2
        L_0x00e4:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r10 = r10.domain
            r0.<init>(r10)
            throw r0
        L_0x00ec:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ec }
            goto L_0x00f0
        L_0x00ef:
            throw r10
        L_0x00f0:
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiniu.android.dns.DnsManager.queryInternal(com.qiniu.android.dns.Domain):java.lang.String[]");
    }

    public InetAddress[] queryInetAdress(Domain domain) throws IOException {
        String[] query = query(domain);
        InetAddress[] inetAddressArr = new InetAddress[query.length];
        for (int i = 0; i < query.length; i++) {
            inetAddressArr[i] = InetAddress.getByName(query[i]);
        }
        return inetAddressArr;
    }

    public void onNetworkChange(NetworkInfo networkInfo) {
        clearCache();
        if (networkInfo == null) {
            networkInfo = NetworkInfo.normal;
        }
        this.info = networkInfo;
        synchronized (this.resolvers) {
            this.index = 0;
        }
    }

    private void clearCache() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public DnsManager putHosts(String str, String str2, int i) {
        this.hosts.put(str, new Hosts.Value(str2, i));
        return this;
    }

    public DnsManager putHosts(String str, String str2) {
        this.hosts.put(str, str2);
        return this;
    }

    private static class ShuffleIps implements IpSorter {
        private AtomicInteger pos;

        private ShuffleIps() {
            this.pos = new AtomicInteger();
        }

        public String[] sort(String[] strArr) {
            if (strArr == null || strArr.length <= 1) {
                return strArr;
            }
            int andIncrement = this.pos.getAndIncrement() & 255;
            String[] strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr2[i] = strArr[(i + andIncrement) % strArr.length];
            }
            return strArr2;
        }
    }
}
