package com.jiongbull.jlog.util;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;

public class IOUtils {
    private static final String TAG = "IOUtils";

    private IOUtils() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e(TAG, e.getMessage());
            }
        }
    }
}
