package com.google.android.material.floatingactionbutton;

import a3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import u.a;
import u.d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // u.a
    public final boolean a(View view) {
        g.C(view);
        throw null;
    }

    @Override // u.a
    public final void c(d dVar) {
        if (dVar.f10111h == 0) {
            dVar.f10111h = 80;
        }
    }

    @Override // u.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        g.C(view);
        throw null;
    }

    @Override // u.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        g.C(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f9905f);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
