package com.qiniu.android.dns.util;

import java.util.HashMap;
import java.util.LinkedList;

public final class LruCache<K, V> {
    private LinkedList<K> list;
    private HashMap<K, V> map;
    private int size;

    public LruCache() {
        this(256);
    }

    public LruCache(int i) {
        this.list = new LinkedList<>();
        this.map = new HashMap<>();
        this.size = i;
    }

    public LruCache put(K k, V v) {
        if (this.list.size() == this.size) {
            this.map.remove(this.list.pollLast());
        }
        this.map.put(k, v);
        this.list.push(k);
        return this;
    }

    public LruCache delete(K k) {
        this.list.remove(k);
        this.map.remove(k);
        return this;
    }

    public V get(K k) {
        V v = this.map.get(k);
        this.list.remove(k);
        this.list.push(k);
        return v;
    }

    public void clear() {
        this.list.clear();
        this.map.clear();
    }
}
