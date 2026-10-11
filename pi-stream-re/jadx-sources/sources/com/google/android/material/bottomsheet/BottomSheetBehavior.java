package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c1.r;
import com.google.android.gms.common.api.internal.v;
import d0.h;
import g0.c;
import g0.h0;
import g0.i0;
import g0.k0;
import g0.l0;
import g0.n0;
import g0.s1;
import g0.u1;
import g0.y0;
import j6.f;
import j6.g;
import j6.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import msr.pistream.app.R;
import o0.d;
import p7.a0;
import u.a;
import w5.b;
import z3.e;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends a {
    public final v A;
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public d M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f2651a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2652a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2653b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f2654b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f2655c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f2656c0;

    /* renamed from: d, reason: collision with root package name */
    public int f2657d;

    /* renamed from: d0, reason: collision with root package name */
    public final b f2658d0;

    /* renamed from: e, reason: collision with root package name */
    public int f2659e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2660f;

    /* renamed from: g, reason: collision with root package name */
    public int f2661g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2662h;

    /* renamed from: i, reason: collision with root package name */
    public g f2663i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f2664j;

    /* renamed from: k, reason: collision with root package name */
    public int f2665k;

    /* renamed from: l, reason: collision with root package name */
    public int f2666l;

    /* renamed from: m, reason: collision with root package name */
    public int f2667m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2668n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2669p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2670q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2671r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2672s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2673t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2674u;

    /* renamed from: v, reason: collision with root package name */
    public int f2675v;

    /* renamed from: w, reason: collision with root package name */
    public int f2676w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2677x;

    /* renamed from: y, reason: collision with root package name */
    public final k f2678y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2679z;

    public BottomSheetBehavior() {
        this.f2651a = 0;
        this.f2653b = true;
        this.f2665k = -1;
        this.f2666l = -1;
        this.A = new v(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f2656c0 = new SparseIntArray();
        this.f2658d0 = new b(this);
    }

    public static View u(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = y0.f4277a;
        if (n0.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View u9 = u(viewGroup.getChildAt(i10));
                if (u9 != null) {
                    return u9;
                }
            }
        }
        return null;
    }

    public final void A(int i10) {
        if (this.L == i10) {
            return;
        }
        this.L = i10;
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            F(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            F(false);
        }
        E(i10, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            D();
        } else {
            a3.g.z(arrayList.get(0));
            throw null;
        }
    }

    public final boolean B(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f10 * this.Q) + view.getTop()) - this.G) / s() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1.q(r5.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r5, int r6, boolean r7) {
        /*
            r4 = this;
            int r0 = r4.x(r6)
            o0.d r1 = r4.M
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r7 == 0) goto L17
            int r5 = r5.getLeft()
            boolean r5 = r1.q(r5, r0)
            if (r5 == 0) goto L34
            goto L33
        L17:
            int r7 = r5.getLeft()
            r1.f8096r = r5
            r5 = -1
            r1.f8082c = r5
            boolean r5 = r1.i(r7, r0, r2, r2)
            if (r5 != 0) goto L31
            int r7 = r1.f8080a
            if (r7 != 0) goto L31
            android.view.View r7 = r1.f8096r
            if (r7 == 0) goto L31
            r7 = 0
            r1.f8096r = r7
        L31:
            if (r5 == 0) goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L43
            r5 = 2
            r4.A(r5)
            r4.E(r6, r3)
            com.google.android.gms.common.api.internal.v r5 = r4.A
            r5.b(r6)
            goto L46
        L43:
            r4.A(r6)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(android.view.View, int, boolean):void");
    }

    public final void D() {
        View view;
        int i10;
        boolean z9;
        c cVar;
        WeakReference weakReference = this.U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            y0.i(view, 524288);
            y0.g(view, 0);
            y0.i(view, 262144);
            y0.g(view, 0);
            y0.i(view, 1048576);
            y0.g(view, 0);
            SparseIntArray sparseIntArray = this.f2656c0;
            int i11 = sparseIntArray.get(0, -1);
            if (i11 != -1) {
                y0.i(view, i11);
                y0.g(view, 0);
                sparseIntArray.delete(0);
            }
            int i12 = 6;
            if (!this.f2653b && this.L != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                h hVar = new h(this, i12);
                ArrayList e10 = y0.e(view);
                int i13 = 0;
                while (true) {
                    if (i13 < e10.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((h0.g) e10.get(i13)).f4534a).getLabel())) {
                            i10 = ((h0.g) e10.get(i13)).a();
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = 0;
                        int i15 = -1;
                        while (true) {
                            int[] iArr = y0.f4280d;
                            if (i14 >= iArr.length || i15 != -1) {
                                break;
                            }
                            int i16 = iArr[i14];
                            boolean z10 = true;
                            for (int i17 = 0; i17 < e10.size(); i17++) {
                                if (((h0.g) e10.get(i17)).a() != i16) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                z10 &= z9;
                            }
                            if (z10) {
                                i15 = i16;
                            }
                            i14++;
                        }
                        i10 = i15;
                    }
                }
                if (i10 != -1) {
                    h0.g gVar = new h0.g(null, i10, string, hVar, null);
                    View.AccessibilityDelegate c6 = y0.c(view);
                    if (c6 == null) {
                        cVar = null;
                    } else if (c6 instanceof g0.a) {
                        cVar = ((g0.a) c6).f4164a;
                    } else {
                        cVar = new c(c6);
                    }
                    if (cVar == null) {
                        cVar = new c();
                    }
                    y0.l(view, cVar);
                    y0.i(view, gVar.a());
                    y0.e(view).add(gVar);
                    y0.g(view, 0);
                }
                sparseIntArray.put(0, i10);
            }
            if (this.I) {
                int i18 = 5;
                if (this.L != 5) {
                    y0.j(view, h0.g.f4531j, new h(this, i18));
                }
            }
            int i19 = this.L;
            int i20 = 4;
            int i21 = 3;
            if (i19 != 3) {
                if (i19 != 4) {
                    if (i19 == 6) {
                        y0.j(view, h0.g.f4530i, new h(this, i20));
                        y0.j(view, h0.g.f4529h, new h(this, i21));
                        return;
                    }
                    return;
                }
                if (this.f2653b) {
                    i12 = 3;
                }
                y0.j(view, h0.g.f4529h, new h(this, i12));
                return;
            }
            if (this.f2653b) {
                i12 = 4;
            }
            y0.j(view, h0.g.f4530i, new h(this, i12));
        }
    }

    public final void E(int i10, boolean z9) {
        boolean z10;
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        if (this.L == 3 && (this.f2677x || w() == 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f2679z != z10 && this.f2663i != null) {
            this.f2679z = z10;
            float f10 = 0.0f;
            if (z9 && (valueAnimator = this.B) != null) {
                if (valueAnimator.isRunning()) {
                    this.B.reverse();
                    return;
                }
                if (!z10) {
                    f10 = 1.0f;
                }
                this.B.setFloatValues(1.0f - f10, f10);
                this.B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B.cancel();
            }
            g gVar = this.f2663i;
            if (!this.f2679z) {
                f10 = 1.0f;
            }
            f fVar = gVar.f6194a;
            if (fVar.f6183j != f10) {
                fVar.f6183j = f10;
                gVar.f6198e = true;
                gVar.invalidateSelf();
            }
        }
    }

    public final void F(boolean z9) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z9) {
            if (this.f2654b0 == null) {
                this.f2654b0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.U.get() && z9) {
                this.f2654b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z9) {
            this.f2654b0 = null;
        }
    }

    public final void G() {
        View view;
        if (this.U != null) {
            r();
            if (this.L == 4 && (view = (View) this.U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // u.a
    public final void c(u.d dVar) {
        this.U = null;
        this.M = null;
    }

    @Override // u.a
    public final void e() {
        this.U = null;
        this.M = null;
    }

    @Override // u.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9;
        View view2;
        d dVar;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.Y = -1;
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.X = null;
                }
            }
            if (this.X == null) {
                this.X = VelocityTracker.obtain();
            }
            this.X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f2652a0 = false;
                    this.Y = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x9 = (int) motionEvent.getX();
                this.Z = (int) motionEvent.getY();
                if (this.L != 2) {
                    WeakReference weakReference = this.V;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x9, this.Z)) {
                        this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f2652a0 = true;
                    }
                }
                if (this.Y == -1 && !coordinatorLayout.o(view, x9, this.Z)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.N = z9;
            }
            if (!this.N && (dVar = this.M) != null && dVar.r(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.V;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(this.Z - motionEvent.getY()) <= this.M.f8081b) {
                return false;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    @Override // u.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean z9;
        WeakHashMap weakHashMap = y0.f4277a;
        if (h0.b(coordinatorLayout) && !h0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.U == null) {
            this.f2661g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29 && !this.f2668n && !this.f2660f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.o || this.f2669p || this.f2670q || this.f2672s || this.f2673t || this.f2674u || z9) {
                n0.u(view, new e(15, new r(this, z9), new z1.h(i0.f(view), view.getPaddingTop(), i0.e(view), view.getPaddingBottom())));
                if (k0.b(view)) {
                    l0.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new e6.k());
                }
            }
            w5.d dVar = new w5.d(view);
            if (i11 >= 30) {
                view.setWindowInsetsAnimationCallback(new u1(dVar));
            } else {
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener s1Var = new s1(view, dVar);
                view.setTag(R.id.tag_window_insets_animation_callback, s1Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(s1Var);
                }
            }
            this.U = new WeakReference(view);
            g gVar = this.f2663i;
            if (gVar != null) {
                h0.q(view, gVar);
                g gVar2 = this.f2663i;
                float f10 = this.H;
                if (f10 == -1.0f) {
                    f10 = n0.i(view);
                }
                gVar2.i(f10);
            } else {
                ColorStateList colorStateList = this.f2664j;
                if (colorStateList != null) {
                    n0.q(view, colorStateList);
                }
            }
            D();
            if (h0.c(view) == 0) {
                h0.s(view, 1);
            }
        }
        if (this.M == null) {
            this.M = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f2658d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i10);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int i12 = this.T;
        int i13 = i12 - height;
        int i14 = this.f2676w;
        if (i13 < i14) {
            if (this.f2671r) {
                this.R = i12;
            } else {
                this.R = i12 - i14;
            }
        }
        this.D = Math.max(0, i12 - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        r();
        int i15 = this.L;
        if (i15 == 3) {
            view.offsetTopAndBottom(w());
        } else if (i15 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i15 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i15 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i15 == 1 || i15 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        E(this.L, false);
        this.V = new WeakReference(u(view));
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            return true;
        }
        a3.g.z(arrayList.get(0));
        throw null;
    }

    @Override // u.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(v(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f2665k, marginLayoutParams.width), v(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f2666l, marginLayoutParams.height));
        return true;
    }

    @Override // u.a
    public final boolean i(View view) {
        WeakReference weakReference = this.V;
        if (weakReference != null && view == weakReference.get() && this.L != 3) {
            return true;
        }
        return false;
    }

    @Override // u.a
    public final void j(View view, View view2, int i10, int[] iArr, int i11) {
        View view3;
        if (i11 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i10;
        if (i10 > 0) {
            if (i12 < w()) {
                int w9 = top - w();
                iArr[1] = w9;
                WeakHashMap weakHashMap = y0.f4277a;
                view.offsetTopAndBottom(-w9);
                A(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap2 = y0.f4277a;
                view.offsetTopAndBottom(-i10);
                A(1);
            }
        } else if (i10 < 0 && !view2.canScrollVertically(-1)) {
            int i13 = this.G;
            if (i12 > i13 && !this.I) {
                int i14 = top - i13;
                iArr[1] = i14;
                WeakHashMap weakHashMap3 = y0.f4277a;
                view.offsetTopAndBottom(-i14);
                A(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i10;
                WeakHashMap weakHashMap4 = y0.f4277a;
                view.offsetTopAndBottom(-i10);
                A(1);
            }
        }
        t(view.getTop());
        this.O = i10;
        this.P = true;
    }

    @Override // u.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // u.a
    public final void m(View view, Parcelable parcelable) {
        w5.c cVar = (w5.c) parcelable;
        int i10 = this.f2651a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f2659e = cVar.f11001d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f2653b = cVar.f11002e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = cVar.f11003f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = cVar.f11004x;
            }
        }
        int i11 = cVar.f11000c;
        if (i11 != 1 && i11 != 2) {
            this.L = i11;
        } else {
            this.L = 4;
        }
    }

    @Override // u.a
    public final Parcelable n(View view) {
        return new w5.c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // u.a
    public final boolean o(View view, int i10, int i11) {
        this.O = 0;
        this.P = false;
        if ((i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r3.getTop() <= r2.E) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (java.lang.Math.abs(r4 - r2.D) < java.lang.Math.abs(r4 - r2.G)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r4 < java.lang.Math.abs(r4 - r2.G)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (java.lang.Math.abs(r4 - r5) < java.lang.Math.abs(r4 - r2.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (java.lang.Math.abs(r4 - r2.E) < java.lang.Math.abs(r4 - r2.G)) goto L50;
     */
    @Override // u.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            int r5 = r3.getTop()
            int r0 = r2.w()
            r1 = 3
            if (r5 != r0) goto Lf
            r2.A(r1)
            return
        Lf:
            java.lang.ref.WeakReference r5 = r2.V
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r5.get()
            if (r4 != r5) goto Lb4
            boolean r4 = r2.P
            if (r4 != 0) goto L1f
            goto Lb4
        L1f:
            int r4 = r2.O
            if (r4 <= 0) goto L33
            boolean r4 = r2.f2653b
            if (r4 == 0) goto L29
            goto Lae
        L29:
            int r4 = r3.getTop()
            int r5 = r2.E
            if (r4 <= r5) goto Lae
            goto Lab
        L33:
            boolean r4 = r2.I
            if (r4 == 0) goto L54
            android.view.VelocityTracker r4 = r2.X
            if (r4 != 0) goto L3d
            r4 = 0
            goto L4c
        L3d:
            r5 = 1000(0x3e8, float:1.401E-42)
            float r0 = r2.f2655c
            r4.computeCurrentVelocity(r5, r0)
            android.view.VelocityTracker r4 = r2.X
            int r5 = r2.Y
            float r4 = r4.getYVelocity(r5)
        L4c:
            boolean r4 = r2.B(r3, r4)
            if (r4 == 0) goto L54
            r1 = 5
            goto Lae
        L54:
            int r4 = r2.O
            if (r4 != 0) goto L91
            int r4 = r3.getTop()
            boolean r5 = r2.f2653b
            if (r5 == 0) goto L72
            int r5 = r2.D
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
            goto Lae
        L72:
            int r5 = r2.E
            if (r4 >= r5) goto L81
            int r5 = r2.G
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r4 >= r5) goto Lab
            goto Lae
        L81:
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
            goto Lab
        L91:
            boolean r4 = r2.f2653b
            if (r4 == 0) goto L96
            goto Lad
        L96:
            int r4 = r3.getTop()
            int r5 = r2.E
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r0 = r2.G
            int r4 = r4 - r0
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto Lad
        Lab:
            r1 = 6
            goto Lae
        Lad:
            r1 = 4
        Lae:
            r4 = 0
            r2.C(r3, r1, r4)
            r2.P = r4
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // u.a
    public final boolean q(View view, MotionEvent motionEvent) {
        boolean z9;
        boolean z10 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.M;
        if (dVar != null && (this.K || i10 == 1)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            dVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z10 = true;
        }
        if (z10 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(this.Z - motionEvent.getY());
            d dVar2 = this.M;
            if (abs > dVar2.f8081b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void r() {
        int s9 = s();
        if (this.f2653b) {
            this.G = Math.max(this.T - s9, this.D);
        } else {
            this.G = this.T - s9;
        }
    }

    public final int s() {
        int i10;
        if (this.f2660f) {
            return Math.min(Math.max(this.f2661g, this.T - ((this.S * 9) / 16)), this.R) + this.f2675v;
        }
        if (!this.f2668n && !this.o && (i10 = this.f2667m) > 0) {
            return Math.max(this.f2659e, i10 + this.f2662h);
        }
        return this.f2659e + this.f2675v;
    }

    public final void t(int i10) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                int i11 = this.G;
                if (i10 <= i11 && i11 != w()) {
                    w();
                }
                if (arrayList.size() > 0) {
                    a3.g.z(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    public final int v(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    public final int w() {
        int i10;
        if (this.f2653b) {
            return this.D;
        }
        int i11 = this.C;
        if (this.f2671r) {
            i10 = 0;
        } else {
            i10 = this.f2676w;
        }
        return Math.max(i11, i10);
    }

    public final int x(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(a3.g.n("Invalid state to get top offset: ", i10));
                }
                return this.T;
            }
            return this.G;
        }
        return w();
    }

    public final void y(int i10) {
        boolean z9 = false;
        if (i10 == -1) {
            if (!this.f2660f) {
                this.f2660f = true;
                z9 = true;
            }
        } else if (this.f2660f || this.f2659e != i10) {
            this.f2660f = false;
            this.f2659e = Math.max(0, i10);
            z9 = true;
        }
        if (z9) {
            G();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (g0.k0.b(r5) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L71
            r1 = 2
            if (r5 != r1) goto L8
            goto L71
        L8:
            boolean r1 = r4.I
            if (r1 != 0) goto L23
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L23:
            r1 = 6
            if (r5 != r1) goto L34
            boolean r2 = r4.f2653b
            if (r2 == 0) goto L34
            int r2 = r4.x(r5)
            int r3 = r4.D
            if (r2 > r3) goto L34
            r2 = 3
            goto L35
        L34:
            r2 = r5
        L35:
            java.lang.ref.WeakReference r3 = r4.U
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L40
            goto L6d
        L40:
            java.lang.ref.WeakReference r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            a.d r3 = new a.d
            r3.<init>(r4, r5, r2, r1)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L62
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L62
            java.util.WeakHashMap r1 = g0.y0.f4277a
            boolean r1 = g0.k0.b(r5)
            if (r1 == 0) goto L62
            goto L63
        L62:
            r0 = 0
        L63:
            if (r0 == 0) goto L69
            r5.post(r3)
            goto L70
        L69:
            r3.run()
            goto L70
        L6d:
            r4.A(r5)
        L70:
            return
        L71:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L7f
            java.lang.String r5 = "DRAGGING"
            goto L81
        L7f:
            java.lang.String r5 = "SETTLING"
        L81:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = a3.g.t(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.z(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        int i10;
        int i11 = 0;
        this.f2651a = 0;
        this.f2653b = true;
        this.f2665k = -1;
        this.f2666l = -1;
        this.A = new v(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f2656c0 = new SparseIntArray();
        this.f2658d0 = new b(this);
        this.f2662h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.f9900a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2664j = a0.u(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2678y = new k(k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        k kVar = this.f2678y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2663i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2664j;
            if (colorStateList != null) {
                this.f2663i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2663i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new w5.a(this, i11));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2665k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2666l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            y(i10);
        } else {
            y(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z9 = obtainStyledAttributes.getBoolean(8, false);
        if (this.I != z9) {
            this.I = z9;
            if (!z9 && this.L == 5) {
                z(4);
            }
            D();
        }
        this.f2668n = obtainStyledAttributes.getBoolean(13, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2653b != z10) {
            this.f2653b = z10;
            if (this.U != null) {
                r();
            }
            A((this.f2653b && this.L == 6) ? 3 : this.L);
            E(this.L, true);
            D();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f2651a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.U != null) {
                this.E = (int) ((1.0f - f10) * this.T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i12 = peekValue2.data;
                if (i12 >= 0) {
                    this.C = i12;
                    E(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    E(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2657d = obtainStyledAttributes.getInt(11, 500);
            this.o = obtainStyledAttributes.getBoolean(17, false);
            this.f2669p = obtainStyledAttributes.getBoolean(18, false);
            this.f2670q = obtainStyledAttributes.getBoolean(19, false);
            this.f2671r = obtainStyledAttributes.getBoolean(20, true);
            this.f2672s = obtainStyledAttributes.getBoolean(14, false);
            this.f2673t = obtainStyledAttributes.getBoolean(15, false);
            this.f2674u = obtainStyledAttributes.getBoolean(16, false);
            this.f2677x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f2655c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
