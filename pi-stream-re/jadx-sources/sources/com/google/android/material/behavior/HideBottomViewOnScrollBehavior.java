package com.google.android.material.behavior;

import a3.g;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import msr.pistream.app.R;
import u.a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2635a;

    /* renamed from: b, reason: collision with root package name */
    public int f2636b;

    /* renamed from: c, reason: collision with root package name */
    public int f2637c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2638d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f2639e;

    /* renamed from: f, reason: collision with root package name */
    public int f2640f;

    /* renamed from: g, reason: collision with root package name */
    public int f2641g;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f2642h;

    public HideBottomViewOnScrollBehavior() {
        this.f2635a = new LinkedHashSet();
        this.f2640f = 0;
        this.f2641g = 2;
    }

    @Override // u.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f2640f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2636b = j5.a.a0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2637c = j5.a.a0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2638d = j5.a.b0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, t5.a.f10037d);
        this.f2639e = j5.a.b0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, t5.a.f10036c);
        return false;
    }

    @Override // u.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        boolean z9;
        LinkedHashSet linkedHashSet = this.f2635a;
        boolean z10 = true;
        if (i10 > 0) {
            if (this.f2641g == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                ViewPropertyAnimator viewPropertyAnimator = this.f2642h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f2641g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    r(view, this.f2640f + 0, this.f2637c, this.f2639e);
                    return;
                } else {
                    g.z(it.next());
                    throw null;
                }
            }
            return;
        }
        if (i10 < 0) {
            if (this.f2641g != 2) {
                z10 = false;
            }
            if (!z10) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f2642h;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f2641g = 2;
                Iterator it2 = linkedHashSet.iterator();
                if (!it2.hasNext()) {
                    r(view, 0, this.f2636b, this.f2638d);
                } else {
                    g.z(it2.next());
                    throw null;
                }
            }
        }
    }

    @Override // u.a
    public boolean o(View view, int i10, int i11) {
        return i10 == 2;
    }

    public final void r(View view, int i10, long j4, TimeInterpolator timeInterpolator) {
        this.f2642h = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j4).setListener(new d(this, 3));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f2635a = new LinkedHashSet();
        this.f2640f = 0;
        this.f2641g = 2;
    }
}
