package com.xp.wx.util;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import com.xp.api.XmasBridge;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004J\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015J\n\u0010\u0017\u001a\u00020\u0004*\u00020\u0018J\u0012\u0010\u0019\u001a\u00020\b*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xp/wx/util/ViewUtil;", "", "()V", "TAG", "", "drawView", "Landroid/graphics/Bitmap;", "view", "Landroid/view/View;", "dumpViewGroup", "", "prefix", "viewGroup", "Landroid/view/ViewGroup;", "openURL", "context", "Landroid/content/Context;", "url", "searchViewGroup", "className", "dp2px", "", "dip", "getDefaultLanguage", "Landroid/content/res/Resources;", "getViewAtPosition", "Landroid/widget/ListView;", "position", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ViewUtil.kt */
public final class ViewUtil {
    public static final ViewUtil INSTANCE = new ViewUtil();
    private static final String TAG = "ViewUtil";

    private ViewUtil() {
    }

    public final void dumpViewGroup(String str, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = MapsKt.emptyMap();
            View childAt = viewGroup.getChildAt(i);
            Function1 viewUtil$dumpViewGroup$1$getAttr$1 = new ViewUtil$dumpViewGroup$1$getAttr$1(childAt, objectRef);
            viewUtil$dumpViewGroup$1$getAttr$1.invoke("getWidth");
            viewUtil$dumpViewGroup$1$getAttr$1.invoke("getHeight");
            viewUtil$dumpViewGroup$1$getAttr$1.invoke("getTag");
            viewUtil$dumpViewGroup$1$getAttr$1.invoke("getText");
            viewUtil$dumpViewGroup$1$getAttr$1.invoke("isClickable");
            viewUtil$dumpViewGroup$1$getAttr$1.invoke("isLongClickable");
            XmasBridge.log(str + '[' + i + "] => " + childAt.getClass() + ", " + ((Map) objectRef.element));
            if (childAt instanceof ViewGroup) {
                ViewUtil viewUtil = INSTANCE;
                viewUtil.dumpViewGroup(str + '[' + i + ']', (ViewGroup) childAt);
            }
        }
    }

    public final View searchViewGroup(ViewGroup viewGroup, String str) {
        View searchViewGroup;
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        Intrinsics.checkParameterIsNotNull(str, "className");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (Intrinsics.areEqual((Object) childAt.getClass().getName(), (Object) str)) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (searchViewGroup = INSTANCE.searchViewGroup((ViewGroup) childAt, str)) != null) {
                return searchViewGroup;
            }
        }
        return null;
    }

    public final Bitmap drawView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-1);
        view.draw(new Canvas(createBitmap));
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "b");
        return createBitmap;
    }

    public final void openURL(Context context, String str) {
        if (context != null) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
            } catch (Throwable th) {
                Log.error(TAG, "Cannot open URL " + str + ": " + th);
                Toast.makeText(context, th.getLocalizedMessage(), 0).show();
            }
        }
    }

    public final int dp2px(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "receiver$0");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        return (int) ((((float) i) * resources.getDisplayMetrics().density) + 0.5f);
    }

    public final String getDefaultLanguage(Resources resources) {
        Locale locale;
        Intrinsics.checkParameterIsNotNull(resources, "receiver$0");
        if (Build.VERSION.SDK_INT >= 24) {
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkExpressionValueIsNotNull(configuration, "configuration");
            locale = configuration.getLocales().get(0);
        } else {
            locale = resources.getConfiguration().locale;
        }
        Intrinsics.checkExpressionValueIsNotNull(locale, "if (Build.VERSION.SDK_IN…guration.locale\n        }");
        String language = locale.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "if (Build.VERSION.SDK_IN…locale\n        }.language");
        return language;
    }

    public final View getViewAtPosition(ListView listView, int i) {
        Intrinsics.checkParameterIsNotNull(listView, "receiver$0");
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int childCount = (listView.getChildCount() + firstVisiblePosition) - 1;
        if (i < firstVisiblePosition || i > childCount) {
            View view = listView.getAdapter().getView(i, (View) null, listView);
            Intrinsics.checkExpressionValueIsNotNull(view, "adapter.getView(position, null, this)");
            return view;
        }
        View childAt = listView.getChildAt(i - firstVisiblePosition);
        Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(position - firstItemPosition)");
        return childAt;
    }
}
