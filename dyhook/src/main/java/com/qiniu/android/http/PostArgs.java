package com.qiniu.android.http;

import com.qiniu.android.utils.StringMap;
import java.io.File;

public final class PostArgs {
    public byte[] data;
    public File file;
    public String fileName;
    public String mimeType;
    public StringMap params;
}
