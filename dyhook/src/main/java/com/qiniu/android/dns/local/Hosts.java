package com.qiniu.android.dns.local;

import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.NetworkInfo;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public final class Hosts {
    private final Hashtable<String, ArrayList<Value>> hosts = new Hashtable<>();

    public String[] query(Domain domain, NetworkInfo networkInfo) {
        ArrayList arrayList = this.hosts.get(domain.domain);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return toIps(filter(arrayList, networkInfo));
    }

    private ArrayList<Value> filter(ArrayList<Value> arrayList, NetworkInfo networkInfo) {
        ArrayList<Value> arrayList2 = new ArrayList<>();
        ArrayList<Value> arrayList3 = new ArrayList<>();
        Iterator<Value> it = arrayList.iterator();
        while (it.hasNext()) {
            Value next = it.next();
            if (next.provider == 0) {
                arrayList2.add(next);
            }
            if (networkInfo.provider != 0 && next.provider == networkInfo.provider) {
                arrayList3.add(next);
            }
        }
        return arrayList3.size() != 0 ? arrayList3 : arrayList2;
    }

    public String[] toIps(ArrayList<Value> arrayList) {
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i).ip;
        }
        return strArr;
    }

    public Hosts put(String str, Value value) {
        ArrayList arrayList = this.hosts.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(value);
        this.hosts.put(str, arrayList);
        return this;
    }

    public Hosts put(String str, String str2) {
        put(str, new Value(str2));
        return this;
    }

    public static class Value {
        public final String ip;
        public final int provider;

        public Value(String str, int i) {
            this.ip = str;
            this.provider = i;
        }

        public Value(String str) {
            this(str, 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            if (!this.ip.equals(value.ip) || this.provider != value.provider) {
                return false;
            }
            return true;
        }
    }
}
