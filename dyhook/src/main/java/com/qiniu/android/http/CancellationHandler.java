package com.qiniu.android.http;

import java.io.IOException;

public interface CancellationHandler {

    public static class CancellationException extends IOException {
    }

    boolean isCancelled();
}
