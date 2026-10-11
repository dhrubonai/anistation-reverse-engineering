package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.internal.v;
import g0.h0;
import g0.k0;
import g0.n0;
import g0.y0;
import j1.n;
import j6.g;
import j6.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k3.d;
import k6.b;
import msr.pistream.app.R;
import p7.a0;
import u.a;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {

    /* renamed from: a, reason: collision with root package name */
    public d f2775a;

    /* renamed from: b, reason: collision with root package name */
    public g f2776b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f2777c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2778d;

    /* renamed from: e, reason: collision with root package name */
    public final v f2779e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2780f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2781g;

    /* renamed from: h, reason: collision with root package name */
    public int f2782h;

    /* renamed from: i, reason: collision with root package name */
    public o0.d f2783i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2784j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2785k;

    /* renamed from: l, reason: collision with root package name */
    public int f2786l;

    /* renamed from: m, reason: collision with root package name */
    public int f2787m;

    /* renamed from: n, reason: collision with root package name */
    public int f2788n;
    public WeakReference o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f2789p;

    /* renamed from: q, reason: collision with root package name */
    public int f2790q;

    /* renamed from: r, reason: collision with root package name */
    public VelocityTracker f2791r;

    /* renamed from: s, reason: collision with root package name */
    public int f2792s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f2793t;

    /* renamed from: u, reason: collision with root package name */
    public final k6.a f2794u;

    public SideSheetBehavior() {
        this.f2779e = new v(this);
        this.f2781g = true;
        this.f2782h = 5;
        this.f2785k = 0.1f;
        this.f2790q = -1;
        this.f2793t = new LinkedHashSet();
        this.f2794u = new k6.a(this);
    }

    @Override // u.a
    public final void c(u.d dVar) {
        this.o = null;
        this.f2783i = null;
    }

    @Override // u.a
    public final void e() {
        this.o = null;
        this.f2783i = null;
    }

    @Override // u.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9;
        o0.d dVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || y0.d(view) != null) && this.f2781g) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            this.f2784j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2791r) != null) {
            velocityTracker.recycle();
            this.f2791r = null;
        }
        if (this.f2791r == null) {
            this.f2791r = VelocityTracker.obtain();
        }
        this.f2791r.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f2784j) {
                this.f2784j = false;
                return false;
            }
        } else {
            this.f2792s = (int) motionEvent.getX();
        }
        if (!this.f2784j && (dVar = this.f2783i) != null && dVar.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // u.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        int i12;
        View findViewById;
        int i13;
        WeakHashMap weakHashMap = y0.f4277a;
        if (h0.b(coordinatorLayout) && !h0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int i14 = 0;
        if (this.o == null) {
            this.o = new WeakReference(view);
            g gVar = this.f2776b;
            if (gVar != null) {
                h0.q(view, gVar);
                g gVar2 = this.f2776b;
                float f10 = this.f2780f;
                if (f10 == -1.0f) {
                    f10 = n0.i(view);
                }
                gVar2.i(f10);
            } else {
                ColorStateList colorStateList = this.f2777c;
                if (colorStateList != null) {
                    n0.q(view, colorStateList);
                }
            }
            if (this.f2782h == 5) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            t();
            if (h0.c(view) == 0) {
                h0.s(view, 1);
            }
            if (y0.d(view) == null) {
                y0.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f2783i == null) {
            this.f2783i = new o0.d(coordinatorLayout.getContext(), coordinatorLayout, this.f2794u);
        }
        d dVar = this.f2775a;
        dVar.getClass();
        int left = view.getLeft() - ((SideSheetBehavior) dVar.f6453b).f2788n;
        coordinatorLayout.q(view, i10);
        this.f2787m = coordinatorLayout.getWidth();
        this.f2786l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            this.f2775a.getClass();
            i11 = marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        this.f2788n = i11;
        int i15 = this.f2782h;
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                if (i15 == 5) {
                    i14 = this.f2775a.e();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f2782h);
                }
            }
        } else {
            d dVar2 = this.f2775a;
            dVar2.getClass();
            i14 = left - (view.getLeft() - ((SideSheetBehavior) dVar2.f6453b).f2788n);
        }
        view.offsetLeftAndRight(i14);
        if (this.f2789p == null && (i12 = this.f2790q) != -1 && (findViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f2789p = new WeakReference(findViewById);
        }
        Iterator it = this.f2793t.iterator();
        while (it.hasNext()) {
            a3.g.z(it.next());
        }
        return true;
    }

    @Override // u.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // u.a
    public final void m(View view, Parcelable parcelable) {
        int i10 = ((b) parcelable).f6479c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f2782h = i10;
    }

    @Override // u.a
    public final Parcelable n(View view) {
        return new b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // u.a
    public final boolean q(View view, MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        boolean z12 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f2782h;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        o0.d dVar = this.f2783i;
        if (dVar != null && (this.f2781g || i10 == 1)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            dVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2791r) != null) {
            velocityTracker.recycle();
            this.f2791r = null;
        }
        if (this.f2791r == null) {
            this.f2791r = VelocityTracker.obtain();
        }
        this.f2791r.addMovement(motionEvent);
        o0.d dVar2 = this.f2783i;
        if (dVar2 != null && (this.f2781g || this.f2782h == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && actionMasked == 2 && !this.f2784j) {
            if (dVar2 != null && (this.f2781g || this.f2782h == 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && Math.abs(this.f2792s - motionEvent.getX()) > this.f2783i.f8081b) {
                z12 = true;
            }
            if (z12) {
                this.f2783i.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2784j;
    }

    public final void r(int i10) {
        View view;
        int i11;
        if (this.f2782h == i10) {
            return;
        }
        this.f2782h = i10;
        WeakReference weakReference = this.o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.f2782h == 5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f2793t.iterator();
        if (!it.hasNext()) {
            t();
        } else {
            a3.g.z(it.next());
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r0.q(r1, r4.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r4 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            k3.d r0 = r3.f2775a
            java.lang.Object r1 = r0.f6453b
            com.google.android.material.sidesheet.SideSheetBehavior r1 = (com.google.android.material.sidesheet.SideSheetBehavior) r1
            r2 = 3
            if (r5 == r2) goto L22
            r2 = 5
            if (r5 != r2) goto L13
            k3.d r1 = r1.f2775a
            int r1 = r1.e()
            goto L28
        L13:
            r1.getClass()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid state to get outer edge offset: "
            java.lang.String r5 = a3.g.n(r6, r5)
            r4.<init>(r5)
            throw r4
        L22:
            k3.d r1 = r1.f2775a
            int r1 = r1.d()
        L28:
            java.lang.Object r0 = r0.f6453b
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            o0.d r0 = r0.f2783i
            r2 = 0
            if (r0 == 0) goto L5b
            if (r6 == 0) goto L3e
            int r4 = r4.getTop()
            boolean r4 = r0.q(r1, r4)
            if (r4 == 0) goto L5b
            goto L5a
        L3e:
            int r6 = r4.getTop()
            r0.f8096r = r4
            r4 = -1
            r0.f8082c = r4
            boolean r4 = r0.i(r1, r6, r2, r2)
            if (r4 != 0) goto L58
            int r6 = r0.f8080a
            if (r6 != 0) goto L58
            android.view.View r6 = r0.f8096r
            if (r6 == 0) goto L58
            r6 = 0
            r0.f8096r = r6
        L58:
            if (r4 == 0) goto L5b
        L5a:
            r2 = 1
        L5b:
            if (r2 == 0) goto L67
            r4 = 2
            r3.r(r4)
            com.google.android.gms.common.api.internal.v r4 = r3.f2779e
            r4.b(r5)
            goto L6a
        L67:
            r3.r(r5)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.s(android.view.View, int, boolean):void");
    }

    public final void t() {
        View view;
        WeakReference weakReference = this.o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        y0.i(view, 262144);
        y0.g(view, 0);
        y0.i(view, 1048576);
        y0.g(view, 0);
        int i10 = 5;
        if (this.f2782h != 5) {
            y0.j(view, h0.g.f4531j, new n(this, i10));
        }
        int i11 = 3;
        if (this.f2782h != 3) {
            y0.j(view, h0.g.f4529h, new n(this, i11));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f2779e = new v(this);
        this.f2781g = true;
        this.f2782h = 5;
        this.f2785k = 0.1f;
        this.f2790q = -1;
        this.f2793t = new LinkedHashSet();
        this.f2794u = new k6.a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f9920v);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2777c = a0.u(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2778d = new k(k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2790q = resourceId;
            WeakReference weakReference = this.f2789p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2789p = null;
            WeakReference weakReference2 = this.o;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = y0.f4277a;
                    if (k0.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f2778d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2776b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2777c;
            if (colorStateList != null) {
                this.f2776b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2776b.setTint(typedValue.data);
            }
        }
        this.f2780f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2781g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f2775a == null) {
            this.f2775a = new d(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
