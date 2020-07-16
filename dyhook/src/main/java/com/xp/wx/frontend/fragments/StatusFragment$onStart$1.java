package com.xp.wx.frontend.fragments;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;
import com.xp.wx.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017¨\u0006\u0006"}, d2 = {"com/xp/wx/frontend/fragments/StatusFragment$onStart$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: StatusFragment.kt */
public final class StatusFragment$onStart$1 extends Handler {
    final /* synthetic */ StatusFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StatusFragment$onStart$1(StatusFragment statusFragment, Looper looper) {
        super(looper);
        this.this$0 = statusFragment;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        Integer num = null;
        Object obj = message != null ? message.obj : null;
        if (message != null) {
            num = Integer.valueOf(message.what);
        }
        if (num != null && num.intValue() == 1) {
            TextView textView = (TextView) this.this$0._$_findCachedViewById(R.id.ip_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "ip_text");
            if (obj != null) {
                textView.setText((String) obj);
                TextView textView2 = (TextView) this.this$0._$_findCachedViewById(R.id.ip_text);
                Activity activity = this.this$0.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                textView2.setTextColor(ContextCompat.getColor(activity, com.xp.wx.hd.R.color.ok));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        } else if (num != null && num.intValue() == 2) {
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            } else if (((Integer) obj).intValue() == 0) {
                TextView textView3 = (TextView) this.this$0._$_findCachedViewById(R.id.WebSocket_TextView);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "WebSocket_TextView");
                textView3.setText("成功");
                TextView textView4 = (TextView) this.this$0._$_findCachedViewById(R.id.WebSocket_TextView);
                Activity activity2 = this.this$0.getActivity();
                if (activity2 == null) {
                    Intrinsics.throwNpe();
                }
                textView4.setTextColor(ContextCompat.getColor(activity2, com.xp.wx.hd.R.color.ok));
            } else {
                TextView textView5 = (TextView) this.this$0._$_findCachedViewById(R.id.WebSocket_TextView);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "WebSocket_TextView");
                textView5.setText("失败");
                TextView textView6 = (TextView) this.this$0._$_findCachedViewById(R.id.WebSocket_TextView);
                Activity activity3 = this.this$0.getActivity();
                if (activity3 == null) {
                    Intrinsics.throwNpe();
                }
                textView6.setTextColor(ContextCompat.getColor(activity3, com.xp.wx.hd.R.color.error));
            }
        } else if (num != null && num.intValue() == 3) {
            TextView textView7 = (TextView) this.this$0._$_findCachedViewById(R.id.heart_beat);
            Activity activity4 = this.this$0.getActivity();
            if (activity4 == null) {
                Intrinsics.throwNpe();
            }
            textView7.setTextColor(ContextCompat.getColor(activity4, com.xp.wx.hd.R.color.ok));
            if (obj != null) {
                Date date = new Date(((Long) obj).longValue());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                TextView textView8 = (TextView) this.this$0._$_findCachedViewById(R.id.heart_beat);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "heart_beat");
                textView8.setText(simpleDateFormat.format(date));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
        }
    }
}
