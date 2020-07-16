package com.xp.wx.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class BitmapUtil {
    public static Bitmap cropBitmap(Bitmap bitmap, int i, boolean z) {
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width == 0 || height == 0) {
                throw new IllegalArgumentException("width or height can't be 0!");
            }
            if (width >= height) {
                width = height;
            }
            int i2 = width > i ? i : width;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i2, (Matrix) null, false);
            if (z) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        throw new IllegalArgumentException("bitmap can't be null!");
    }
}
