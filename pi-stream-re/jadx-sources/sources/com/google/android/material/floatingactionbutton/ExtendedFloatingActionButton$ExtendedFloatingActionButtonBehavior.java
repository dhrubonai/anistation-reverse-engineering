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
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // u.a
    public final /* bridge */ /* synthetic */ boolean a(View view) {
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

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f9904e);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
