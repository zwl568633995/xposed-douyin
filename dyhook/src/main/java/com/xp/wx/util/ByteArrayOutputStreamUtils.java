package com.xp.wx.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteArrayOutputStreamUtils extends OutputStream {
    private static final byte[] mNullByteArray = new byte[0];
    private byte[] mBuffer;
    private int mCount;

    public void close() {
    }

    public ByteArrayOutputStreamUtils() {
        this(32);
    }

    public ByteArrayOutputStreamUtils(int i) {
        if (i >= 0) {
            this.mBuffer = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i);
    }

    public static int indexOf(byte[] bArr, byte b, int i, int i2) {
        if (!(bArr == null || bArr.length == 0 || i >= i2)) {
            if (i < 0) {
                i = 0;
            }
            if (i2 > bArr.length) {
                i2 = bArr.length;
            }
            while (i < i2) {
                if (bArr[i] == b) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(byte[] bArr, byte b, int i, int i2) {
        if (!(bArr == null || bArr.length == 0 || i2 > i)) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i > bArr.length - 1) {
                i = bArr.length - 1;
            }
            while (i >= i2) {
                if (bArr[i] == b) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public static int indexOf(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr != null && bArr.length != 0 && i <= i2 && bArr2 != null && bArr2.length <= bArr.length && bArr2.length != 0 && (i2 - i) + 1 >= bArr2.length) {
            if (i < 0) {
                i = 0;
            }
            if (i2 > bArr.length) {
                i2 = bArr.length;
            }
            while (i < i2) {
                if (bArr[i] == bArr2[0]) {
                    if (i2 - i < bArr2.length) {
                        break;
                    }
                    int i3 = 1;
                    while (i3 < bArr2.length && bArr[i + i3] == bArr2[i3]) {
                        i3++;
                    }
                    if (i3 == bArr2.length) {
                        return i;
                    }
                }
                i++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (!(bArr == null || bArr.length == 0 || i2 > i || bArr2 == null || bArr2.length > bArr.length || bArr2.length == 0 || (i - i2) + 1 < bArr2.length)) {
            if (i2 < 0) {
                i2 = 0;
            }
            if (i > bArr.length) {
                i = bArr.length;
            }
            int length = i == bArr.length ? bArr.length - 1 : i;
            while (length >= i2) {
                if (bArr[length] == bArr2[0] && bArr2.length + length <= i) {
                    int i3 = 1;
                    while (i3 < bArr2.length && bArr[length + i3] == bArr2[i3]) {
                        i3++;
                    }
                    if (i3 == bArr2.length) {
                        return length;
                    }
                }
                length--;
            }
        }
        return -1;
    }

    public int getSize() {
        return this.mCount;
    }

    public void setSize(int i) {
        byte[] bArr = this.mBuffer;
        if (i > bArr.length) {
            i = bArr.length;
        }
        this.mCount = i;
    }

    public int getBuffSize() {
        return this.mBuffer.length;
    }

    private void ensureCapacity(int i) {
        if (i - this.mBuffer.length > 0) {
            grow(i);
        }
    }

    private void grow(int i) {
        int length = this.mBuffer.length << 1;
        if (length - i < 0) {
            length = i;
        }
        if (length < 0) {
            if (i >= 0) {
                length = Integer.MAX_VALUE;
            } else {
                throw new OutOfMemoryError();
            }
        }
        this.mBuffer = Arrays.copyOf(this.mBuffer, length);
    }

    public void write(int i) {
        ensureCapacity(this.mCount + 1);
        byte[] bArr = this.mBuffer;
        int i2 = this.mCount;
        bArr[i2] = (byte) i;
        this.mCount = i2 + 1;
    }

    public void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || (i + i2) - bArr.length > 0) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(this.mCount + i2);
        System.arraycopy(bArr, i, this.mBuffer, this.mCount, i2);
        this.mCount += i2;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.mBuffer, 0, this.mCount);
    }

    public void reset() {
        this.mCount = 0;
    }

    public byte[] toByteArray() {
        int i = this.mCount;
        if (i == 0) {
            return mNullByteArray;
        }
        return Arrays.copyOf(this.mBuffer, i);
    }

    public int size() {
        return this.mCount;
    }

    public String toString() {
        return new String(this.mBuffer, 0, this.mCount);
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(this.mBuffer, 0, this.mCount, str);
    }

    @Deprecated
    public String toString(int i) {
        return new String(this.mBuffer, i, 0, this.mCount);
    }

    public void releaseCache() {
        this.mBuffer = mNullByteArray;
        this.mCount = 0;
    }

    public byte[] getBuff() {
        return this.mBuffer;
    }

    public void seekIndex(int i) {
        setSize(i);
    }

    public int getIndex() {
        return this.mCount;
    }

    public int indexOfBuff(byte b, int i) {
        byte[] bArr = this.mBuffer;
        return indexOf(bArr, b, i, bArr.length);
    }

    public int indexOfBuff(byte[] bArr, int i) {
        byte[] bArr2 = this.mBuffer;
        return indexOf(bArr2, bArr, i, bArr2.length);
    }

    public int indexOfBuff(byte b, int i, int i2) {
        return indexOf(this.mBuffer, b, i, i2);
    }

    public int indexOfBuff(byte[] bArr, int i, int i2) {
        return indexOf(this.mBuffer, bArr, i, i2);
    }

    public int lastIndexOfBuff(byte b, int i) {
        return lastIndexOf(this.mBuffer, b, 0, i);
    }

    public int lastIndexOfBuff(byte[] bArr, int i) {
        return lastIndexOf(this.mBuffer, bArr, 0, i);
    }

    public int lastIndexOfBuff(byte b, int i, int i2) {
        return lastIndexOf(this.mBuffer, b, i, i2);
    }

    public int lastIndexOfBuff(byte[] bArr, int i, int i2) {
        return lastIndexOf(this.mBuffer, bArr, i, i2);
    }
}
