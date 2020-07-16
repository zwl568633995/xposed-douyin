package com.qiniu.android.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public final class StringMap {
    private Map<String, Object> map;

    public interface Consumer {
        void accept(String str, Object obj);
    }

    public StringMap() {
        this(new HashMap());
    }

    public StringMap(Map<String, Object> map2) {
        this.map = map2;
    }

    public StringMap put(String str, Object obj) {
        this.map.put(str, obj);
        return this;
    }

    public StringMap putNotEmpty(String str, String str2) {
        if (!StringUtils.isNullOrEmpty(str2)) {
            this.map.put(str, str2);
        }
        return this;
    }

    public StringMap putNotNull(String str, Object obj) {
        if (obj != null) {
            this.map.put(str, obj);
        }
        return this;
    }

    public StringMap putWhen(String str, Object obj, boolean z) {
        if (z) {
            this.map.put(str, obj);
        }
        return this;
    }

    public StringMap putAll(Map<String, Object> map2) {
        this.map.putAll(map2);
        return this;
    }

    public StringMap putFileds(Map<String, String> map2) {
        this.map.putAll(map2);
        return this;
    }

    public StringMap putAll(StringMap stringMap) {
        this.map.putAll(stringMap.map);
        return this;
    }

    public void forEach(Consumer consumer) {
        for (Map.Entry next : this.map.entrySet()) {
            consumer.accept((String) next.getKey(), next.getValue());
        }
    }

    public int size() {
        return this.map.size();
    }

    public Map<String, Object> map() {
        return this.map;
    }

    public Object get(String str) {
        return this.map.get(str);
    }

    public String formString() {
        final StringBuilder sb = new StringBuilder();
        forEach(new Consumer() {
            private boolean notStart = false;

            public void accept(String str, Object obj) {
                if (this.notStart) {
                    sb.append("&");
                }
                try {
                    StringBuilder sb = sb;
                    sb.append(URLEncoder.encode(str, "UTF-8"));
                    sb.append('=');
                    sb.append(URLEncoder.encode(obj.toString(), "UTF-8"));
                    this.notStart = true;
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            }
        });
        return sb.toString();
    }
}
