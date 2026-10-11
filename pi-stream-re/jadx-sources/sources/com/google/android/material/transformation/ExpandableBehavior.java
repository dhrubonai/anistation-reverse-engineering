package com.google.android.material.transformation;

import a3.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g0.k0;
import g0.y0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u.a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // u.a
    public abstract void b(View view);

    @Override // u.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        g.z(view2);
        throw null;
    }

    @Override // u.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = y0.f4277a;
        if (!k0.c(view)) {
            ArrayList j4 = coordinatorLayout.j(view);
            int size = j4.size();
            for (int i11 = 0; i11 < size; i11++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}
