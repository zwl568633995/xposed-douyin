package com.xp.wx.frontend.wechat;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xp.api.XposedHelpers;
import com.xp.wx.util.ViewUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xp/wx/frontend/wechat/StringListAdapter;", "Landroid/widget/ArrayAdapter;", "", "context", "Landroid/content/Context;", "strings", "", "(Landroid/content/Context;Ljava/util/List;)V", "getView", "Landroid/view/View;", "position", "", "convertView", "parent", "Landroid/view/ViewGroup;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: StringListAdapter.kt */
public final class StringListAdapter extends ArrayAdapter<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringListAdapter(Context context, List<String> list) {
        super(context, 0, list);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "strings");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) view;
        if (linearLayout == null) {
            Object callMethod = XposedHelpers.callMethod(viewGroup, "generateDefaultLayoutParams", new Object[0]);
            ViewUtil viewUtil = ViewUtil.INSTANCE;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            XposedHelpers.setIntField(callMethod, "height", viewUtil.dp2px(context, 50));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(1);
            if (callMethod instanceof ViewGroup.LayoutParams) {
                linearLayout2.setLayoutParams((ViewGroup.LayoutParams) callMethod);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            ViewUtil viewUtil2 = ViewUtil.INSTANCE;
            Context context2 = linearLayout2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            layoutParams.setMarginStart(viewUtil2.dp2px(context2, 15));
            ViewUtil viewUtil3 = ViewUtil.INSTANCE;
            Context context3 = linearLayout2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            layoutParams.setMarginEnd(viewUtil3.dp2px(context3, 15));
            TextView textView = new TextView(linearLayout2.getContext());
            textView.setTextSize(16.0f);
            textView.setGravity(16);
            textView.setSingleLine();
            textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            linearLayout2.addView(textView, layoutParams);
            linearLayout2.setBackgroundColor(-1);
            linearLayout = linearLayout2;
        }
        TextView textView2 = (TextView) linearLayout.getChildAt(0);
        if (textView2 != null) {
            textView2.setText((CharSequence) getItem(i));
        }
        return linearLayout;
    }
}
