package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jg extends ViewGroup implements o84, it0, lh4, nd4 {
    public static final b3 a0 = new b3((byte) 19);
    public sb2 A;
    public boolean B;
    public sb2 C;
    public sb2 D;
    public yz3 E;
    public ub2 F;
    public ud1 G;
    public ub2 H;
    public og3 I;
    public ga5 J;
    public final int[] K;
    public long L;
    public v57 M;
    public ub2 N;
    public final eg O;
    public final eg P;
    public ub2 Q;
    public final int[] R;
    public int S;
    public int T;
    public final h12 U;
    public boolean V;
    public final za3 W;
    public final g84 x;
    public final View y;
    public final kh4 z;

    public jg(Context context, id2 id2Var, int i, g84 g84Var, View view, kh4 kh4Var) {
        super(context);
        this.x = g84Var;
        this.y = view;
        this.z = kh4Var;
        p44 p44Var = p67.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, id2Var);
        byte b = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        sv6 sv6Var = (sv6) this;
        fg fgVar = new fg(sv6Var, b);
        int i2 = pv6.a;
        c57.a(this, fgVar);
        kv6.b(this, this);
        this.A = new t((byte) 13);
        this.C = new t((byte) 14);
        this.D = new t((byte) 15);
        vz3 vz3Var = vz3.x;
        this.E = vz3Var;
        this.G = tl7.d();
        this.K = new int[2];
        this.L = 0L;
        this.O = new eg(sv6Var, b);
        byte b2 = 1;
        this.P = new eg(sv6Var, b2);
        this.R = new int[2];
        this.S = Integer.MIN_VALUE;
        this.T = Integer.MIN_VALUE;
        byte b3 = 4;
        this.U = new h12((byte) 4);
        za3 za3Var = new za3(3);
        za3Var.L = sv6Var;
        yz3 a = rh5.a(v94.C(vz3Var, q23.a, g84Var), true, new b3((byte) 20));
        ar4 ar4Var = new ar4();
        ar4Var.x = new dg(sv6Var, (byte) 2);
        yd ydVar = new yd();
        yd ydVar2 = ar4Var.y;
        if (ydVar2 != null) {
            ydVar2.y = null;
        }
        ar4Var.y = ydVar;
        ydVar.y = ar4Var;
        setOnRequestDisallowInterceptTouchEvent$ui(ydVar);
        yz3 w = wk6.B(nx7.w(a.w(ar4Var), new bg(sv6Var, za3Var, sv6Var)), new cg(sv6Var, za3Var, b)).w(new s90(new dg(sv6Var, b)));
        za3Var.e0(this.E.w(w));
        this.F = new b0(za3Var, w, b3);
        za3Var.a0(this.G);
        this.H = new l0(za3Var, (byte) 12);
        za3Var.j0 = new cg(sv6Var, za3Var, b2);
        za3Var.k0 = new dg(sv6Var, b2);
        za3Var.d0(new gg(sv6Var, za3Var));
        this.W = za3Var;
    }

    private final mh4 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            ez2.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((oa) this.z).getSnapshotObserver();
    }

    public static yz2 j(yz2 yz2Var, int i, int i2, int i3, int i4) {
        int i5 = yz2Var.a - i;
        int i6 = 0;
        if (i5 < 0) {
            i5 = 0;
        }
        int i7 = yz2Var.b - i2;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = yz2Var.c - i3;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = yz2Var.d - i4;
        if (i9 >= 0) {
            i6 = i9;
        }
        return yz2.b(i5, i7, i8, i6);
    }

    public static int l(int i, int i2, int i3) {
        if (i3 < 0 && i != i2) {
            if (i3 == -2 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
            if (i3 == -1 && i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(db.C(i3, i, i2), 1073741824);
    }

    public static final void m(sv6 sv6Var) {
        if (sv6Var.B && sv6Var.isAttachedToWindow() && sv6Var.y.getParent() == sv6Var) {
            mh4 snapshotObserver = sv6Var.getSnapshotObserver();
            snapshotObserver.a.d(sv6Var, a0, sv6Var.A);
        }
    }

    @Override // defpackage.it0
    public final void a() {
        this.D.invoke();
    }

    @Override // defpackage.o84
    public final void b(int i, int i2, int i3, int i4, int i5) {
        int i6;
        k84 k84Var;
        if (!this.y.isNestedScrollingEnabled()) {
            return;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        int i7 = i6;
        k84 k84Var2 = this.x.a;
        if (k84Var2 != null) {
            k84Var = k84Var2.b1();
        } else {
            k84Var = null;
        }
        k84 k84Var3 = k84Var;
        if (k84Var3 != null) {
            k84Var3.z(floatToRawIntBits, i7, floatToRawIntBits2);
        }
    }

    @Override // defpackage.it0
    public final void c() {
        this.C.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.o84
    public final void d(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        k84 k84Var;
        long j;
        if (!this.y.isNestedScrollingEnabled()) {
            return;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & 4294967295L);
        if (i5 == 0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        k84 k84Var2 = this.x.a;
        if (k84Var2 != null) {
            k84Var = k84Var2.b1();
        } else {
            k84Var = null;
        }
        k84 k84Var3 = k84Var;
        if (k84Var3 != null) {
            j = k84Var3.z(floatToRawIntBits, i6, floatToRawIntBits2);
        } else {
            j = 0;
        }
        iArr[0] = io3.h0(Float.intBitsToFloat((int) (j >> 32))) * (-1);
        iArr[1] = io3.h0(Float.intBitsToFloat((int) (j & 4294967295L))) * (-1);
    }

    @Override // defpackage.o84
    public final void e(View view, View view2, int i, int i2) {
        h12 h12Var = this.U;
        if (i2 == 1) {
            h12Var.c = i;
        } else {
            h12Var.b = i;
        }
    }

    @Override // defpackage.o84
    public final void f(View view, int i) {
        h12 h12Var = this.U;
        if (i == 1) {
            h12Var.c = 0;
        } else {
            h12Var.b = 0;
        }
    }

    @Override // defpackage.o84
    public final void g(int i, int i2, int[] iArr, int i3) {
        int i4;
        k84 k84Var;
        long j;
        if (!this.y.isNestedScrollingEnabled()) {
            return;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(i2 * (-1.0f)) & 4294967295L) | (Float.floatToRawIntBits(i * (-1.0f)) << 32);
        if (i3 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        k84 k84Var2 = this.x.a;
        if (k84Var2 != null) {
            k84Var = k84Var2.b1();
        } else {
            k84Var = null;
        }
        if (k84Var != null) {
            j = k84Var.O(i4, floatToRawIntBits);
        } else {
            j = 0;
        }
        iArr[0] = io3.h0(Float.intBitsToFloat((int) (j >> 32))) * (-1);
        iArr[1] = io3.h0(Float.intBitsToFloat((int) (j & 4294967295L))) * (-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.R;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final ud1 getDensity() {
        return this.G;
    }

    public final View getInteropView() {
        return this.y;
    }

    public final za3 getLayoutNode() {
        return this.W;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final og3 getLifecycleOwner() {
        return this.I;
    }

    public final yz3 getModifier() {
        return this.E;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        h12 h12Var = this.U;
        return h12Var.c | h12Var.b;
    }

    public final ub2 getOnDensityChanged$ui() {
        return this.H;
    }

    public final ub2 getOnModifierChanged$ui() {
        return this.F;
    }

    public final ub2 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.Q;
    }

    public final sb2 getRelease() {
        return this.D;
    }

    public final sb2 getReset() {
        return this.C;
    }

    public final ga5 getSavedStateRegistryOwner() {
        return this.J;
    }

    public final sb2 getUpdate() {
        return this.A;
    }

    public final View getView() {
        return this.y;
    }

    @Override // defpackage.o84
    public final boolean h(int i) {
        if ((i & 2) != 0 || (i & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.nd4
    public final v57 i(View view, v57 v57Var) {
        this.M = new v57(v57Var);
        return k(v57Var);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (this.V) {
            this.y.postOnAnimation(new ca(this.P, (byte) 3));
            return null;
        }
        this.W.D();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.y.isNestedScrollingEnabled();
    }

    public final v57 k(v57 v57Var) {
        s57 s57Var = v57Var.a;
        yz2 i = s57Var.i(-1);
        yz2 yz2Var = yz2.e;
        if (!i.equals(yz2Var) || !s57Var.j(-9).equals(yz2Var) || s57Var.h() != null) {
            kz2 kz2Var = (kz2) this.W.c0.A;
            if (kz2Var.z0.K) {
                long R = w65.R(kz2Var.J(0L));
                int i2 = (int) (R >> 32);
                int i3 = 0;
                if (i2 < 0) {
                    i2 = 0;
                }
                int i4 = (int) (R & 4294967295L);
                if (i4 < 0) {
                    i4 = 0;
                }
                long j = te4.B(kz2Var).j();
                int i5 = (int) (j >> 32);
                int i6 = (int) (j & 4294967295L);
                long j2 = kz2Var.z;
                long R2 = w65.R(kz2Var.J((Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L)));
                int i7 = i5 - ((int) (R2 >> 32));
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = i6 - ((int) (4294967295L & R2));
                if (i8 >= 0) {
                    i3 = i8;
                }
                if (i2 != 0 || i4 != 0 || i7 != 0 || i3 != 0) {
                    return v57Var.a.r(i2, i4, i7, i3);
                }
            }
        }
        return v57Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.V) {
            this.y.postOnAnimation(new ca(this.P, (byte) 3));
        } else {
            this.W.D();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.y.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.y;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.S = i;
        this.T = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.y.isNestedScrollingEnabled()) {
            return false;
        }
        tl7.z(this.x.c(), null, null, new hg(z, this, ez5.a(f * (-1.0f), f2 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.y.isNestedScrollingEnabled()) {
            return false;
        }
        tl7.z(this.x.c(), null, null, new ig((Object) this, ez5.a(f * (-1.0f), f2 * (-1.0f)), (vz0) null, (byte) 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        n05 n05Var;
        ub2 ub2Var = this.N;
        if (ub2Var != null) {
            if (rect != null) {
                n05Var = new n05(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                n05Var = null;
            }
            ub2Var.invoke(n05Var);
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ub2 ub2Var = this.Q;
        if (ub2Var != null) {
            ub2Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(ud1 ud1Var) {
        if (ud1Var != this.G) {
            this.G = ud1Var;
            ub2 ub2Var = this.H;
            if (ub2Var != null) {
                ub2Var.invoke(ud1Var);
            }
        }
    }

    public final void setLifecycleOwner(og3 og3Var) {
        if (og3Var != this.I) {
            this.I = og3Var;
            setTag(R.id.view_tree_lifecycle_owner, og3Var);
        }
    }

    public final void setModifier(yz3 yz3Var) {
        if (yz3Var != this.E) {
            this.E = yz3Var;
            ub2 ub2Var = this.F;
            if (ub2Var != null) {
                ub2Var.invoke(yz3Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(ub2 ub2Var) {
        this.H = ub2Var;
    }

    public final void setOnModifierChanged$ui(ub2 ub2Var) {
        this.F = ub2Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(ub2 ub2Var) {
        this.Q = ub2Var;
    }

    public final void setRelease(sb2 sb2Var) {
        this.D = sb2Var;
    }

    public final void setReset(sb2 sb2Var) {
        this.C = sb2Var;
    }

    public final void setSavedStateRegistryOwner(ga5 ga5Var) {
        if (ga5Var != this.J) {
            this.J = ga5Var;
            setTag(R.id.view_tree_saved_state_registry_owner, ga5Var);
        }
    }

    public final void setUpdate(sb2 sb2Var) {
        this.A = sb2Var;
        this.B = true;
        this.O.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.lh4
    public final boolean u() {
        return isAttachedToWindow();
    }
}
