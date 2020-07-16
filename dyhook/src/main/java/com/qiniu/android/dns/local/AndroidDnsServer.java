package com.qiniu.android.dns.local;

import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class AndroidDnsServer {
    public static InetAddress[] getByCommand() {
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
            ArrayList arrayList = new ArrayList(5);
            while (true) {
                String readLine = lineNumberReader.readLine();
                if (readLine == null) {
                    break;
                }
                int indexOf = readLine.indexOf("]: [");
                if (indexOf != -1) {
                    String substring = readLine.substring(1, indexOf);
                    String substring2 = readLine.substring(indexOf + 4, readLine.length() - 1);
                    if (substring.endsWith(".dns") || substring.endsWith(".dns1") || substring.endsWith(".dns2") || substring.endsWith(".dns3") || substring.endsWith(".dns4")) {
                        InetAddress byName = InetAddress.getByName(substring2);
                        if (byName != null) {
                            String hostAddress = byName.getHostAddress();
                            if (hostAddress != null) {
                                if (hostAddress.length() != 0) {
                                    arrayList.add(byName);
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
            }
            return null;
        } catch (IOException e) {
            Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByExec", e);
            return null;
        }
    }

    public static InetAddress[] getByReflection() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
            ArrayList arrayList = new ArrayList(5);
            String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            for (int i = 0; i < 4; i++) {
                String str = (String) method.invoke((Object) null, new Object[]{strArr[i]});
                if (str != null) {
                    if (str.length() != 0) {
                        InetAddress byName = InetAddress.getByName(str);
                        if (byName != null) {
                            String hostAddress = byName.getHostAddress();
                            if (hostAddress != null) {
                                if (hostAddress.length() != 0) {
                                    if (!arrayList.contains(byName)) {
                                        arrayList.add(byName);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
            }
        } catch (Exception e) {
            Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByReflection", e);
        }
        return null;
    }

    public static IResolver defaultResolver() {
        return new IResolver() {
            public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
                boolean z;
                InetAddress[] byReflection = AndroidDnsServer.getByReflection();
                if (byReflection == null) {
                    byReflection = AndroidDnsServer.getByCommand();
                }
                if (byReflection != null) {
                    Record[] resolve = new HijackingDetectWrapper(new Resolver(byReflection[0])).resolve(domain, networkInfo);
                    if (domain.hasCname) {
                        int length = resolve.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                break;
                            } else if (resolve[i].isCname()) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (!z) {
                            throw new DnshijackingException(domain.domain, byReflection[0].getHostAddress());
                        }
                    }
                    if (domain.maxTtl != 0) {
                        int length2 = resolve.length;
                        int i2 = 0;
                        while (i2 < length2) {
                            Record record = resolve[i2];
                            if (record.isCname() || record.ttl <= domain.maxTtl) {
                                i2++;
                            } else {
                                throw new DnshijackingException(domain.domain, byReflection[0].getHostAddress(), record.ttl);
                            }
                        }
                    }
                    return resolve;
                }
                throw new IOException("cant get local dns server");
            }
        };
    }
}
