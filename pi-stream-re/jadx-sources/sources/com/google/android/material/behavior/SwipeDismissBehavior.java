package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g0.h0;
import g0.y0;
import h0.g;
import java.util.WeakHashMap;
import o0.d;
import u.a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public d f2643a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2644b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2645c;

    /* renamed from: d, reason: collision with root package name */
    public int f2646d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f2647e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f2648f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f2649g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final v5.a f2650h = new v5.a(this);

    @Override // u.a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9 = this.f2644b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f2644b = false;
            }
        } else {
            z9 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2644b = z9;
        }
        if (!z9) {
            return false;
        }
        if (this.f2643a == null) {
            this.f2643a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f2650h);
        }
        if (!this.f2645c && this.f2643a.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // u.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = y0.f4277a;
        if (h0.c(view) == 0) {
            h0.s(view, 1);
            y0.i(view, 1048576);
            y0.g(view, 0);
            if (r(view)) {
                y0.j(view, g.f4531j, new k3.d(this, 20));
            }
        }
        return false;
    }

    @Override // u.a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f2643a != null) {
            if (!this.f2645c || motionEvent.getActionMasked() != 3) {
                this.f2643a.k(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean r(View view) {
        return true;
    }
}
