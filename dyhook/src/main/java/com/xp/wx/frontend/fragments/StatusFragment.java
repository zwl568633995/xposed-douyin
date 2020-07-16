package com.xp.wx.frontend.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.xp.wx.Global;
import com.xp.wx.hd.R;
import com.xp.wx.middleware.BotInfo;
import com.xp.wx.util.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\tH\u0002J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0007H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/xp/wx/frontend/fragments/StatusFragment;", "Landroid/app/Fragment;", "()V", "mStatusReceiver", "com/xp/wx/frontend/fragments/StatusFragment$mStatusReceiver$1", "Lcom/xp/wx/frontend/fragments/StatusFragment$mStatusReceiver$1;", "getXposedVersion", "", "isModuleLoaded", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onStop", "setComponentIconValid", "iconId", "Companion", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: StatusFragment.kt */
public final class StatusFragment extends Fragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "StatusFragment";
    private HashMap _$_findViewCache;
    private final StatusFragment$mStatusReceiver$1 mStatusReceiver = new StatusFragment$mStatusReceiver$1();

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_status, viewGroup, false);
    }

    public void onStart() {
        int i;
        super.onStart();
        if (isModuleLoaded()) {
            if (Build.VERSION.SDK_INT < 24 || getXposedVersion() >= 89) {
                Activity activity = getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                i = ContextCompat.getColor(activity, R.color.ok);
                TextView textView = (TextView) _$_findCachedViewById(com.xp.wx.R.id.status_text);
                Intrinsics.checkExpressionValueIsNotNull(textView, "status_text");
                textView.setText(getString(R.string.status_ok));
                ((ImageView) _$_findCachedViewById(com.xp.wx.R.id.status_image)).setImageResource(R.drawable.ic_status_ok);
                ImageView imageView = (ImageView) _$_findCachedViewById(com.xp.wx.R.id.status_image);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "status_image");
                imageView.setContentDescription(getString(R.string.status_ok));
            } else {
                Activity activity2 = getActivity();
                if (activity2 == null) {
                    Intrinsics.throwNpe();
                }
                i = ContextCompat.getColor(activity2, R.color.warn);
                TextView textView2 = (TextView) _$_findCachedViewById(com.xp.wx.R.id.status_text);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "status_text");
                textView2.setText(getString(R.string.status_outdated_xposed));
                ((ImageView) _$_findCachedViewById(com.xp.wx.R.id.status_image)).setImageResource(R.drawable.ic_status_error);
                ImageView imageView2 = (ImageView) _$_findCachedViewById(com.xp.wx.R.id.status_image);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "status_image");
                imageView2.setContentDescription(getString(R.string.status_outdated_xposed));
            }
            ((TextView) _$_findCachedViewById(com.xp.wx.R.id.status_text)).setTextColor(i);
            ((ImageView) _$_findCachedViewById(com.xp.wx.R.id.status_image)).setBackgroundColor(i);
            Activity activity3 = getActivity();
            if (activity3 == null) {
                Intrinsics.throwNpe();
            }
            activity3.registerReceiver(this.mStatusReceiver, new IntentFilter(Global.ACTION_RECEIVE_HOOK_STATUS));
            Activity activity4 = getActivity();
            if (activity4 == null) {
                Intrinsics.throwNpe();
            }
            activity4.sendBroadcast(new Intent(Global.ACTION_REQUIRE_HOOK_STATUS));
        }
        BotInfo.Companion.setMHandler(new StatusFragment$onStart$1(this, Looper.getMainLooper()));
    }

    public void onStop() {
        super.onStop();
        BotInfo.Companion.setMHandler((Handler) null);
        Activity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        activity.unregisterReceiver(this.mStatusReceiver);
    }

    private final boolean isModuleLoaded() {
        Log.verbose(TAG, getClass() + ".isModuleLoaded() invoked.");
        return false;
    }

    private final int getXposedVersion() {
        Log.verbose(TAG, getClass() + ".getXposedVersion() invoked. ");
        return 0;
    }

    private final void setComponentIconValid(int i) {
        Activity activity = getActivity();
        ImageView imageView = activity != null ? (ImageView) activity.findViewById(i) : null;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_component_valid);
            imageView.setContentDescription(getString(R.string.status_component_valid));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xp/wx/frontend/fragments/StatusFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/xp/wx/frontend/fragments/StatusFragment;", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: StatusFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StatusFragment newInstance() {
            return new StatusFragment();
        }
    }
}
