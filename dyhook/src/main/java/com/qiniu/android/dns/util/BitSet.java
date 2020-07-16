package com.qiniu.android.dns.util;

public final class BitSet {
    private int set = 0;

    public BitSet set(int i) {
        this.set = (1 << i) | this.set;
        return this;
    }

    public boolean isSet(int i) {
        return ((1 << i) & this.set) != 0;
    }

    public boolean noneIsSet(int i) {
        return this.set == 0;
    }

    public boolean allIsSet(int i) {
        return this.set + 1 == (1 << i);
    }

    public int leadingZeros() {
        int i = 16;
        int i2 = this.set >> 16;
        if (i2 != 0) {
            this.set = i2;
        } else {
            i = 32;
        }
        int i3 = this.set >> 8;
        if (i3 != 0) {
            i -= 8;
            this.set = i3;
        }
        int i4 = this.set >> 4;
        if (i4 != 0) {
            i -= 4;
            this.set = i4;
        }
        int i5 = this.set >> 2;
        if (i5 != 0) {
            i -= 2;
            this.set = i5;
        }
        int i6 = this.set;
        return (i6 >> 1) != 0 ? i - 2 : i - i6;
    }

    public BitSet clear() {
        this.set = 0;
        return this;
    }

    public int value() {
        return this.set;
    }
}
