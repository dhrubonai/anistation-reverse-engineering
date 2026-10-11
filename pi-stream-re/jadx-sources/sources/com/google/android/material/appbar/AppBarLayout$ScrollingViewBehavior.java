package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.c;
import g0.y0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u.a;
import u5.d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends d {

    /* renamed from: c, reason: collision with root package name */
    public int f2628c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
    }

    @Override // u.a
    public final void b(View view) {
    }

    @Override // u.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int k10;
        a aVar = ((u.d) view2.getLayoutParams()).f10104a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i10 = bottom + 0 + 0;
            int i11 = this.f2628c;
            if (i11 == 0) {
                k10 = 0;
            } else {
                k10 = c.k((int) (i11 * 0.0f), 0, i11);
            }
            int i12 = i10 - k10;
            WeakHashMap weakHashMap = y0.f4277a;
            view.offsetTopAndBottom(i12);
        }
        return false;
    }

    @Override // u.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int i13 = view.getLayoutParams().height;
        if (i13 == -1 || i13 == -2) {
            s(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // u.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // u5.d
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i10);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f9918t);
        this.f2628c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
