package com.xp.wx.util;

import com.xp.wx.Global;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FilterXpInputStream extends InputStream {
    private final ByteArrayOutputStreamUtils mBuffer = new ByteArrayOutputStreamUtils();
    private final byte[] mReadBuffer = new byte[6];
    private final InputStream mStream;
    private final byte[] mXposedBytes = Global.KW_XPOSED.getBytes();

    public FilterXpInputStream(InputStream inputStream) {
        this.mStream = inputStream;
    }

    public int read() throws IOException {
        int read = this.mStream.read();
        if (read == -1) {
            return read;
        }
        byte[] bArr = this.mReadBuffer;
        bArr[0] = bArr[1];
        bArr[1] = bArr[2];
        bArr[2] = bArr[3];
        bArr[3] = bArr[4];
        bArr[4] = bArr[5];
        bArr[5] = (byte) read;
        if (Arrays.equals(bArr, this.mXposedBytes)) {
            return 97;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.mStream.read(bArr, i, i2);
        if (read != -1) {
            this.mBuffer.write(this.mReadBuffer);
            this.mBuffer.write(bArr, 0, read);
            int i3 = 0;
            while (true) {
                ByteArrayOutputStreamUtils byteArrayOutputStreamUtils = this.mBuffer;
                int indexOfBuff = byteArrayOutputStreamUtils.indexOfBuff(this.mXposedBytes, i3, byteArrayOutputStreamUtils.size());
                if (indexOfBuff <= -1) {
                    break;
                }
                int length = this.mXposedBytes.length + indexOfBuff;
                this.mBuffer.getBuff()[indexOfBuff] = 120;
                this.mBuffer.getBuff()[indexOfBuff + 1] = 120;
                this.mBuffer.getBuff()[indexOfBuff + 2] = 120;
                this.mBuffer.getBuff()[indexOfBuff + 3] = 120;
                this.mBuffer.getBuff()[indexOfBuff + 4] = 120;
                this.mBuffer.getBuff()[indexOfBuff + 5] = 120;
                i3 = length;
            }
            if (read == 1) {
                byte[] bArr2 = this.mReadBuffer;
                bArr2[0] = bArr2[1];
                bArr2[1] = bArr2[2];
                bArr2[2] = bArr2[3];
                bArr2[3] = bArr2[4];
                bArr2[4] = bArr2[5];
                bArr2[5] = bArr[read - 1];
            } else if (read == 2) {
                byte[] bArr3 = this.mReadBuffer;
                bArr3[0] = bArr3[2];
                bArr3[1] = bArr3[3];
                bArr3[2] = bArr3[4];
                bArr3[3] = bArr3[5];
                bArr3[4] = bArr[read - 2];
                bArr3[5] = bArr[read - 1];
            } else if (read == 3) {
                byte[] bArr4 = this.mReadBuffer;
                bArr4[0] = bArr4[3];
                bArr4[1] = bArr4[4];
                bArr4[2] = bArr4[5];
                bArr4[3] = bArr[read - 3];
                bArr4[4] = bArr[read - 2];
                bArr4[5] = bArr[read - 1];
            } else if (read == 4) {
                byte[] bArr5 = this.mReadBuffer;
                bArr5[0] = bArr5[4];
                bArr5[1] = bArr5[5];
                bArr5[2] = bArr[read - 4];
                bArr5[3] = bArr[read - 3];
                bArr5[4] = bArr[read - 2];
                bArr5[5] = bArr[read - 1];
            } else if (read == 5) {
                byte[] bArr6 = this.mReadBuffer;
                bArr6[0] = bArr6[5];
                bArr6[1] = bArr[read - 5];
                bArr6[2] = bArr[read - 4];
                bArr6[3] = bArr[read - 3];
                bArr6[4] = bArr[read - 2];
                bArr6[5] = bArr[read - 1];
            } else if (read == 6 || read > 6) {
                byte[] bArr7 = this.mReadBuffer;
                bArr7[0] = bArr[read - 6];
                bArr7[1] = bArr[read - 5];
                bArr7[2] = bArr[read - 4];
                bArr7[3] = bArr[read - 3];
                bArr7[4] = bArr[read - 2];
                bArr7[5] = bArr[read - 1];
            }
            read = this.mBuffer.size() - 6;
            System.out.println(read);
            if (read > 0) {
                System.arraycopy(this.mBuffer.getBuff(), 6, bArr, 0, read);
            }
        }
        this.mBuffer.releaseCache();
        return read;
    }

    public long skip(long j) throws IOException {
        return this.mStream.skip(j);
    }

    public int available() throws IOException {
        return this.mStream.available();
    }

    public void close() throws IOException {
        this.mStream.close();
    }

    public synchronized void mark(int i) {
        this.mStream.mark(i);
    }

    public synchronized void reset() throws IOException {
        this.mStream.reset();
    }

    public boolean markSupported() {
        return this.mStream.markSupported();
    }
}
