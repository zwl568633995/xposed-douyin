package com.xp.wx.frontend.wechat;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xp/wx/frontend/wechat/ListPopupWindowPosition;", "", "anchor", "Landroid/view/View;", "x", "", "y", "(Landroid/view/View;II)V", "getAnchor", "()Landroid/view/View;", "getX", "()I", "getY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ListPopupWindowPosition.kt */
public final class ListPopupWindowPosition {
    private final View anchor;
    private final int x;
    private final int y;

    public static /* synthetic */ ListPopupWindowPosition copy$default(ListPopupWindowPosition listPopupWindowPosition, View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            view = listPopupWindowPosition.anchor;
        }
        if ((i3 & 2) != 0) {
            i = listPopupWindowPosition.x;
        }
        if ((i3 & 4) != 0) {
            i2 = listPopupWindowPosition.y;
        }
        return listPopupWindowPosition.copy(view, i, i2);
    }

    public final View component1() {
        return this.anchor;
    }

    public final int component2() {
        return this.x;
    }

    public final int component3() {
        return this.y;
    }

    public final ListPopupWindowPosition copy(View view, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "anchor");
        return new ListPopupWindowPosition(view, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ListPopupWindowPosition) {
                ListPopupWindowPosition listPopupWindowPosition = (ListPopupWindowPosition) obj;
                if (Intrinsics.areEqual((Object) this.anchor, (Object) listPopupWindowPosition.anchor)) {
                    if (this.x == listPopupWindowPosition.x) {
                        if (this.y == listPopupWindowPosition.y) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        View view = this.anchor;
        return ((((view != null ? view.hashCode() : 0) * 31) + this.x) * 31) + this.y;
    }

    public String toString() {
        return "ListPopupWindowPosition(anchor=" + this.anchor + ", x=" + this.x + ", y=" + this.y + ")";
    }

    public ListPopupWindowPosition(View view, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "anchor");
        this.anchor = view;
        this.x = i;
        this.y = i2;
    }

    public final View getAnchor() {
        return this.anchor;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }
}
