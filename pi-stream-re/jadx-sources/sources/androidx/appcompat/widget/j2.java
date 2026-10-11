package androidx.appcompat.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class j2 {
    public static int a(PopupWindow popupWindow, View view, int i10, boolean z9) {
        return popupWindow.getMaxAvailableHeight(view, i10, z9);
    }
}
