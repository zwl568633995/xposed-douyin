package com.wujieshuju.huidou.p031ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.wujieshuju.huidou.C1068R;

/* renamed from: com.wujieshuju.huidou.ui.widget.MaxHeightRecyclerView */
public class MaxHeightRecyclerView extends RecyclerView {
    private int mMaxHeight;

    public MaxHeightRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet);
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1068R.styleable.MaxHeightRecyclerView);
        this.mMaxHeight = obtainStyledAttributes.getLayoutDimension(0, this.mMaxHeight);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.mMaxHeight;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
