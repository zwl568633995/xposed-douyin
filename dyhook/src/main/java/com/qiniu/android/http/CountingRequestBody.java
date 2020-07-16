package com.qiniu.android.http;

import com.qiniu.android.http.CancellationHandler;
import com.qiniu.android.utils.AsyncRun;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

public final class CountingRequestBody extends RequestBody {
    private static final int SEGMENT_SIZE = 2048;
    private final RequestBody body;
    /* access modifiers changed from: private */
    public final CancellationHandler cancellationHandler;
    /* access modifiers changed from: private */
    public final ProgressHandler progress;

    public CountingRequestBody(RequestBody requestBody, ProgressHandler progressHandler, CancellationHandler cancellationHandler2) {
        this.body = requestBody;
        this.progress = progressHandler;
        this.cancellationHandler = cancellationHandler2;
    }

    public long contentLength() throws IOException {
        return this.body.contentLength();
    }

    public MediaType contentType() {
        return this.body.contentType();
    }

    public void writeTo(BufferedSink bufferedSink) throws IOException {
        BufferedSink buffer = Okio.buffer((Sink) new CountingSink(bufferedSink));
        this.body.writeTo(buffer);
        buffer.flush();
    }

    protected final class CountingSink extends ForwardingSink {
        /* access modifiers changed from: private */
        public int bytesWritten = 0;

        public CountingSink(Sink sink) {
            super(sink);
        }

        public void write(Buffer buffer, long j) throws IOException {
            if (CountingRequestBody.this.cancellationHandler == null && CountingRequestBody.this.progress == null) {
                super.write(buffer, j);
            } else if (CountingRequestBody.this.cancellationHandler == null || !CountingRequestBody.this.cancellationHandler.isCancelled()) {
                super.write(buffer, j);
                this.bytesWritten = (int) (((long) this.bytesWritten) + j);
                if (CountingRequestBody.this.progress != null) {
                    AsyncRun.runInMain(new Runnable() {
                        public void run() {
                            try {
                                CountingRequestBody.this.progress.onProgress(CountingSink.this.bytesWritten, (int) CountingRequestBody.this.contentLength());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            } else {
                throw new CancellationHandler.CancellationException();
            }
        }
    }
}
