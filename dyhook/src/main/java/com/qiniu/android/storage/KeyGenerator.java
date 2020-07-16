package com.qiniu.android.storage;

import java.io.File;

public interface KeyGenerator {
    String gen(String str, File file);
}
