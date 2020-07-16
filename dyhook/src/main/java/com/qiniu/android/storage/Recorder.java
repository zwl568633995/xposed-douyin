package com.qiniu.android.storage;

public interface Recorder {
    void del(String str);

    byte[] get(String str);

    void set(String str, byte[] bArr);
}
