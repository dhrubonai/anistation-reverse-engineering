package androidx.recyclerview.widget;

import a3.h;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import c0.m;
import c0.n;
import com.google.android.gms.common.api.f;
import g0.b1;
import g0.f1;
import g0.u;
import g0.y0;
import j5.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m3.a1;
import m3.b;
import m3.b0;
import m3.c0;
import m3.c1;
import m3.d0;
import m3.f0;
import m3.g0;
import m3.h0;
import m3.i0;
import m3.k0;
import m3.l0;
import m3.l1;
import m3.m0;
import m3.m1;
import m3.n0;
import m3.o;
import m3.o0;
import m3.p0;
import m3.q;
import m3.q0;
import m3.r0;
import m3.s0;
import m3.t0;
import m3.w;
import m3.w0;
import m3.x0;
import m3.z0;
import n.g;
import n.i;
import o0.c;
import p.j;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static boolean Q0 = false;
    public static boolean R0 = false;
    public static final int[] S0 = {R.attr.nestedScrollingEnabled};
    public static final float T0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean U0 = true;
    public static final boolean V0 = true;
    public static final boolean W0 = true;
    public static final Class[] X0;
    public static final c Y0;
    public static final x0 Z0;
    public final Rect A;
    public boolean A0;
    public final Rect B;
    public boolean B0;
    public final RectF C;
    public final c0 C0;
    public d0 D;
    public boolean D0;
    public k0 E;
    public c1 E0;
    public final ArrayList F;
    public final int[] F0;
    public final ArrayList G;
    public u G0;
    public final ArrayList H;
    public final int[] H0;
    public n0 I;
    public final int[] I0;
    public boolean J;
    public final int[] J0;
    public boolean K;
    public final ArrayList K0;
    public boolean L;
    public final b0 L0;
    public int M;
    public boolean M0;
    public boolean N;
    public int N0;
    public boolean O;
    public int O0;
    public boolean P;
    public final c0 P0;
    public int Q;
    public boolean R;
    public final AccessibilityManager S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;

    /* renamed from: a */
    public final float f1228a;

    /* renamed from: a0 */
    public g0 f1229a0;

    /* renamed from: b */
    public final s0 f1230b;

    /* renamed from: b0 */
    public EdgeEffect f1231b0;

    /* renamed from: c */
    public final h f1232c;

    /* renamed from: c0 */
    public EdgeEffect f1233c0;

    /* renamed from: d */
    public t0 f1234d;

    /* renamed from: d0 */
    public EdgeEffect f1235d0;

    /* renamed from: e */
    public b f1236e;

    /* renamed from: e0 */
    public EdgeEffect f1237e0;

    /* renamed from: f */
    public m3.c f1238f;

    /* renamed from: f0 */
    public h0 f1239f0;

    /* renamed from: g0 */
    public int f1240g0;

    /* renamed from: h0 */
    public int f1241h0;

    /* renamed from: i0 */
    public VelocityTracker f1242i0;

    /* renamed from: j0 */
    public int f1243j0;

    /* renamed from: k0 */
    public int f1244k0;

    /* renamed from: l0 */
    public int f1245l0;

    /* renamed from: m0 */
    public int f1246m0;

    /* renamed from: n0 */
    public int f1247n0;

    /* renamed from: o0 */
    public m0 f1248o0;

    /* renamed from: p0 */
    public final int f1249p0;

    /* renamed from: q0 */
    public final int f1250q0;

    /* renamed from: r0 */
    public final float f1251r0;

    /* renamed from: s0 */
    public final float f1252s0;

    /* renamed from: t0 */
    public boolean f1253t0;

    /* renamed from: u0 */
    public final z0 f1254u0;

    /* renamed from: v0 */
    public q f1255v0;

    /* renamed from: w0 */
    public final g f1256w0;

    /* renamed from: x */
    public final m1 f1257x;

    /* renamed from: x0 */
    public final w0 f1258x0;

    /* renamed from: y */
    public boolean f1259y;

    /* renamed from: y0 */
    public o0 f1260y0;

    /* renamed from: z */
    public final b0 f1261z;

    /* renamed from: z0 */
    public ArrayList f1262z0;

    static {
        Class cls = Integer.TYPE;
        X0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        Y0 = new c(1);
        Z0 = new x0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, msr.pistream.app.R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView G = G(viewGroup.getChildAt(i10));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public static a1 L(View view) {
        if (view == null) {
            return null;
        }
        return ((l0) view.getLayoutParams()).f7294a;
    }

    private int Z(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f1233c0;
        float f11 = 0.0f;
        if (edgeEffect != null && a.u(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.f1233c0.onRelease();
            } else {
                float f12 = -a.O(this.f1233c0, -height, width);
                if (a.u(this.f1233c0) == 0.0f) {
                    this.f1233c0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f1237e0;
            if (edgeEffect2 != null && a.u(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f1237e0.onRelease();
                } else {
                    float O = a.O(this.f1237e0, height, 1.0f - width);
                    if (a.u(this.f1237e0) == 0.0f) {
                        this.f1237e0.onRelease();
                    }
                    f11 = O;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getHeight());
    }

    private u getScrollingChildHelper() {
        if (this.G0 == null) {
            this.G0 = new u(this);
        }
        return this.G0;
    }

    public static void l(a1 a1Var) {
        WeakReference weakReference = a1Var.f7154b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == a1Var.f7153a) {
                    return;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            a1Var.f7154b = null;
        }
    }

    public static int o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && a.u(edgeEffect) != 0.0f) {
            int round = Math.round(a.O(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        }
        if (i10 < 0 && edgeEffect2 != null && a.u(edgeEffect2) != 0.0f) {
            float f10 = i11;
            int round2 = Math.round(a.O(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        }
        return i10;
    }

    public static void setDebugAssertionsEnabled(boolean z9) {
        Q0 = z9;
    }

    public static void setVerboseLoggingEnabled(boolean z9) {
        R0 = z9;
    }

    public final void A() {
        if (this.f1233c0 != null) {
            return;
        }
        ((x0) this.f1229a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1233c0 = edgeEffect;
        if (this.f1259y) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.D + ", layout:" + this.E + ", context:" + getContext();
    }

    public final void C(w0 w0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f1254u0.f7429c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            w0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        w0Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View D(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D(android.view.View):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r7 == 2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            java.util.ArrayList r1 = r12.H
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L6c
            java.lang.Object r5 = r1.get(r4)
            m3.n0 r5 = (m3.n0) r5
            r6 = r5
            m3.o r6 = (m3.o) r6
            int r7 = r6.f7329v
            r8 = 1
            r9 = 2
            if (r7 != r8) goto L5c
            float r7 = r13.getX()
            float r10 = r13.getY()
            boolean r7 = r6.d(r7, r10)
            float r10 = r13.getX()
            float r11 = r13.getY()
            boolean r10 = r6.c(r10, r11)
            int r11 = r13.getAction()
            if (r11 != 0) goto L60
            if (r7 != 0) goto L3f
            if (r10 == 0) goto L60
        L3f:
            if (r10 == 0) goto L4c
            r6.f7330w = r8
            float r7 = r13.getX()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f7323p = r7
            goto L58
        L4c:
            if (r7 == 0) goto L58
            r6.f7330w = r9
            float r7 = r13.getY()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f7321m = r7
        L58:
            r6.e(r9)
            goto L5e
        L5c:
            if (r7 != r9) goto L60
        L5e:
            r6 = r8
            goto L61
        L60:
            r6 = r3
        L61:
            if (r6 == 0) goto L69
            r6 = 3
            if (r0 == r6) goto L69
            r12.I = r5
            return r8
        L69:
            int r4 = r4 + 1
            goto Lc
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E(android.view.MotionEvent):boolean");
    }

    public final void F(int[] iArr) {
        int e10 = this.f1238f.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = f.API_PRIORITY_OTHER;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            a1 L = L(this.f1238f.d(i12));
            if (!L.p()) {
                int d10 = L.d();
                if (d10 < i10) {
                    i10 = d10;
                }
                if (d10 > i11) {
                    i11 = d10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final a1 H(int i10) {
        a1 a1Var = null;
        if (this.T) {
            return null;
        }
        int h10 = this.f1238f.h();
        for (int i11 = 0; i11 < h10; i11++) {
            a1 L = L(this.f1238f.g(i11));
            if (L != null && !L.j() && I(L) == i10) {
                if (this.f1238f.j(L.f7153a)) {
                    a1Var = L;
                } else {
                    return L;
                }
            }
        }
        return a1Var;
    }

    public final int I(a1 a1Var) {
        boolean z9;
        if ((a1Var.f7162j & 524) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && a1Var.g()) {
            b bVar = this.f1236e;
            int i10 = a1Var.f7155c;
            ArrayList arrayList = bVar.f7172b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                m3.a aVar = (m3.a) arrayList.get(i11);
                int i12 = aVar.f7146a;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 8) {
                            int i13 = aVar.f7147b;
                            if (i13 == i10) {
                                i10 = aVar.f7149d;
                            } else {
                                if (i13 < i10) {
                                    i10--;
                                }
                                if (aVar.f7149d <= i10) {
                                    i10++;
                                }
                            }
                        }
                    } else {
                        int i14 = aVar.f7147b;
                        if (i14 <= i10) {
                            int i15 = aVar.f7149d;
                            if (i14 + i15 <= i10) {
                                i10 -= i15;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (aVar.f7147b <= i10) {
                    i10 += aVar.f7149d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long J(a1 a1Var) {
        if (this.D.f7193b) {
            return a1Var.f7157e;
        }
        return a1Var.f7155c;
    }

    public final a1 K(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return L(view);
    }

    public final Rect M(View view) {
        l0 l0Var = (l0) view.getLayoutParams();
        boolean z9 = l0Var.f7296c;
        Rect rect = l0Var.f7295b;
        if (!z9) {
            return rect;
        }
        if (this.f1258x0.f7412g && (l0Var.b() || l0Var.f7294a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.A;
            rect2.set(0, 0, 0, 0);
            ((i0) arrayList.get(i10)).getClass();
            ((l0) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        l0Var.f7296c = false;
        return rect;
    }

    public final boolean N() {
        if (this.V > 0) {
            return true;
        }
        return false;
    }

    public final void O(int i10) {
        if (this.E == null) {
            return;
        }
        setScrollState(2);
        this.E.m0(i10);
        awakenScrollBars();
    }

    public final void P() {
        int h10 = this.f1238f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((l0) this.f1238f.g(i10).getLayoutParams()).f7296c = true;
        }
        ArrayList arrayList = (ArrayList) this.f1232c.f68e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            l0 l0Var = (l0) ((a1) arrayList.get(i11)).f7153a.getLayoutParams();
            if (l0Var != null) {
                l0Var.f7296c = true;
            }
        }
    }

    public final void Q(int i10, int i11, boolean z9) {
        int i12 = i10 + i11;
        int h10 = this.f1238f.h();
        for (int i13 = 0; i13 < h10; i13++) {
            a1 L = L(this.f1238f.g(i13));
            if (L != null && !L.p()) {
                int i14 = L.f7155c;
                w0 w0Var = this.f1258x0;
                if (i14 >= i12) {
                    if (R0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + L + " now at position " + (L.f7155c - i11));
                    }
                    L.m(-i11, z9);
                    w0Var.f7411f = true;
                } else if (i14 >= i10) {
                    if (R0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + L + " now REMOVED");
                    }
                    L.b(8);
                    L.m(-i11, z9);
                    L.f7155c = i10 - 1;
                    w0Var.f7411f = true;
                }
            }
        }
        h hVar = this.f1232c;
        ArrayList arrayList = (ArrayList) hVar.f68e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                a1 a1Var = (a1) arrayList.get(size);
                if (a1Var != null) {
                    int i15 = a1Var.f7155c;
                    if (i15 >= i12) {
                        if (R0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + a1Var + " now at position " + (a1Var.f7155c - i11));
                        }
                        a1Var.m(-i11, z9);
                    } else if (i15 >= i10) {
                        a1Var.b(8);
                        hVar.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void R() {
        this.V++;
    }

    public final void S(boolean z9) {
        int i10;
        boolean z10 = true;
        int i11 = this.V - 1;
        this.V = i11;
        if (i11 < 1) {
            if (Q0 && i11 < 0) {
                throw new IllegalStateException(a3.g.m(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.V = 0;
            if (z9) {
                int i12 = this.Q;
                this.Q = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.S;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z10 = false;
                    }
                    if (z10) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        h0.b.b(obtain, i12);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.K0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a1 a1Var = (a1) arrayList.get(size);
                    if (a1Var.f7153a.getParent() == this && !a1Var.p() && (i10 = a1Var.f7168q) != -1) {
                        WeakHashMap weakHashMap = y0.f4277a;
                        g0.h0.s(a1Var.f7153a, i10);
                        a1Var.f7168q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void T(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1241h0) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f1241h0 = motionEvent.getPointerId(i10);
            int x9 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f1245l0 = x9;
            this.f1243j0 = x9;
            int y9 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f1246m0 = y9;
            this.f1244k0 = y9;
        }
    }

    public final void U() {
        if (!this.D0 && this.J) {
            WeakHashMap weakHashMap = y0.f4277a;
            g0.h0.m(this, this.L0);
            this.D0 = true;
        }
    }

    public final void V() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (this.T) {
            b bVar = this.f1236e;
            bVar.l(bVar.f7172b);
            bVar.l(bVar.f7173c);
            bVar.f7176f = 0;
            if (this.U) {
                this.E.W();
            }
        }
        if (this.f1239f0 != null && this.E.y0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f1236e.j();
        } else {
            this.f1236e.c();
        }
        if (!this.A0 && !this.B0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.L && this.f1239f0 != null && (((z13 = this.T) || z10 || this.E.f7283f) && (!z13 || this.D.f7193b))) {
            z11 = true;
        } else {
            z11 = false;
        }
        w0 w0Var = this.f1258x0;
        w0Var.f7415j = z11;
        if (z11 && z10 && !this.T) {
            if (this.f1239f0 != null && this.E.y0()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                z14 = true;
            }
        }
        w0Var.f7416k = z14;
    }

    public final void W(boolean z9) {
        this.U = z9 | this.U;
        this.T = true;
        int h10 = this.f1238f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            a1 L = L(this.f1238f.g(i10));
            if (L != null && !L.p()) {
                L.b(6);
            }
        }
        P();
        h hVar = this.f1232c;
        ArrayList arrayList = (ArrayList) hVar.f68e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a1 a1Var = (a1) arrayList.get(i11);
            if (a1Var != null) {
                a1Var.b(6);
                a1Var.a(null);
            }
        }
        d0 d0Var = ((RecyclerView) hVar.f72i).D;
        if (d0Var == null || !d0Var.f7193b) {
            hVar.g();
        }
    }

    public final void X(a1 a1Var, z1.h hVar) {
        boolean z9 = false;
        int i10 = (a1Var.f7162j & (-8193)) | 0;
        a1Var.f7162j = i10;
        boolean z10 = this.f1258x0.f7413h;
        m1 m1Var = this.f1257x;
        if (z10) {
            if ((i10 & 2) != 0) {
                z9 = true;
            }
            if (z9 && !a1Var.j() && !a1Var.p()) {
                ((i) m1Var.f7307c).f(a1Var, J(a1Var));
            }
        }
        m1Var.c(a1Var, hVar);
    }

    public final int Y(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f1231b0;
        float f11 = 0.0f;
        if (edgeEffect != null && a.u(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.f1231b0.onRelease();
            } else {
                float f12 = -a.O(this.f1231b0, -width, 1.0f - height);
                if (a.u(this.f1231b0) == 0.0f) {
                    this.f1231b0.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f1235d0;
            if (edgeEffect2 != null && a.u(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f1235d0.onRelease();
                } else {
                    float O = a.O(this.f1235d0, width, height);
                    if (a.u(this.f1235d0) == 0.0f) {
                        this.f1235d0.onRelease();
                    }
                    f11 = O;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getWidth());
    }

    public final void a0(View view, View view2) {
        View view3;
        boolean z9;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.A;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof l0) {
            l0 l0Var = (l0) layoutParams;
            if (!l0Var.f7296c) {
                int i10 = rect.left;
                Rect rect2 = l0Var.f7295b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        k0 k0Var = this.E;
        Rect rect3 = this.A;
        boolean z10 = !this.L;
        if (view2 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        k0Var.j0(this, view, rect3, z10, z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        k0 k0Var = this.E;
        if (k0Var != null) {
            k0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0() {
        VelocityTracker velocityTracker = this.f1242i0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z9 = false;
        j0(0);
        EdgeEffect edgeEffect = this.f1231b0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z9 = this.f1231b0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1233c0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z9 |= this.f1233c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1235d0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z9 |= this.f1235d0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1237e0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z9 |= this.f1237e0.isFinished();
        }
        if (z9) {
            WeakHashMap weakHashMap = y0.f4277a;
            g0.h0.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0(int r21, int r22, android.view.MotionEvent r23, int r24) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof l0) && this.E.f((l0) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        k0 k0Var = this.E;
        if (k0Var == null || !k0Var.d()) {
            return 0;
        }
        return this.E.j(this.f1258x0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        k0 k0Var = this.E;
        if (k0Var == null || !k0Var.d()) {
            return 0;
        }
        return this.E.k(this.f1258x0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        k0 k0Var = this.E;
        if (k0Var == null || !k0Var.d()) {
            return 0;
        }
        return this.E.l(this.f1258x0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        k0 k0Var = this.E;
        if (k0Var == null || !k0Var.e()) {
            return 0;
        }
        return this.E.m(this.f1258x0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        k0 k0Var = this.E;
        if (k0Var == null || !k0Var.e()) {
            return 0;
        }
        return this.E.n(this.f1258x0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        k0 k0Var = this.E;
        if (k0Var == null || !k0Var.e()) {
            return 0;
        }
        return this.E.o(this.f1258x0);
    }

    public final void d0(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        a1 a1Var;
        h0();
        R();
        int i14 = n.f1613a;
        m.a("RV Scroll");
        w0 w0Var = this.f1258x0;
        C(w0Var);
        h hVar = this.f1232c;
        if (i10 != 0) {
            i12 = this.E.l0(i10, hVar, w0Var);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.E.n0(i11, hVar, w0Var);
        } else {
            i13 = 0;
        }
        m.b();
        int e10 = this.f1238f.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d10 = this.f1238f.d(i15);
            a1 K = K(d10);
            if (K != null && (a1Var = K.f7161i) != null) {
                int left = d10.getLeft();
                int top = d10.getTop();
                View view = a1Var.f7153a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        S(true);
        i0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return getScrollingChildHelper().a(f10, f11, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        super.draw(canvas);
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            ((i0) arrayList.get(i12)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1231b0;
        boolean z13 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f1259y) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, 0.0f);
            EdgeEffect edgeEffect2 = this.f1231b0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z9 = true;
            } else {
                z9 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect3 = this.f1233c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1259y) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1233c0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z9 |= z11;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1235d0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f1259y) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i10, -width);
            EdgeEffect edgeEffect6 = this.f1235d0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            z9 |= z10;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1237e0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1259y) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1237e0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z12 = true;
            }
            z9 |= z12;
            canvas.restoreToCount(save4);
        }
        if (z9 || this.f1239f0 == null || arrayList.size() <= 0 || !this.f1239f0.f()) {
            z13 = z9;
        }
        if (z13) {
            WeakHashMap weakHashMap = y0.f4277a;
            g0.h0.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void e0(int i10) {
        w wVar;
        if (this.O) {
            return;
        }
        setScrollState(0);
        z0 z0Var = this.f1254u0;
        z0Var.f7433x.removeCallbacks(z0Var);
        z0Var.f7429c.abortAnimation();
        k0 k0Var = this.E;
        if (k0Var != null && (wVar = k0Var.f7282e) != null) {
            wVar.i();
        }
        k0 k0Var2 = this.E;
        if (k0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            k0Var2.m0(i10);
            awakenScrollBars();
        }
    }

    public final boolean f0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float u9 = a.u(edgeEffect) * i11;
        float abs = Math.abs(-i10) * 0.35f;
        float f10 = this.f1228a * 0.015f;
        double log = Math.log(abs / f10);
        double d10 = T0;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f10)) < u9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0177, code lost:
    
        if (r3 < 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x017f, code lost:
    
        if ((r3 * r2) <= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0187, code lost:
    
        if ((r3 * r2) >= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015a, code lost:
    
        if (r4 > 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0171, code lost:
    
        if (r3 > 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0174, code lost:
    
        if (r4 < 0) goto L279;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i10, int i11, boolean z9) {
        k0 k0Var = this.E;
        if (k0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.O) {
            return;
        }
        int i12 = 0;
        if (!k0Var.d()) {
            i10 = 0;
        }
        if (!this.E.e()) {
            i11 = 0;
        }
        if (i10 != 0 || i11 != 0) {
            if (z9) {
                if (i10 != 0) {
                    i12 = 1;
                }
                if (i11 != 0) {
                    i12 |= 2;
                }
                getScrollingChildHelper().g(i12, 1);
            }
            this.f1254u0.c(i10, i11, Integer.MIN_VALUE, null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        k0 k0Var = this.E;
        if (k0Var != null) {
            return k0Var.r();
        }
        throw new IllegalStateException(a3.g.m(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        k0 k0Var = this.E;
        if (k0Var != null) {
            return k0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(a3.g.m(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d0 getAdapter() {
        return this.D;
    }

    @Override // android.view.View
    public int getBaseline() {
        k0 k0Var = this.E;
        if (k0Var != null) {
            k0Var.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1259y;
    }

    public c1 getCompatAccessibilityDelegate() {
        return this.E0;
    }

    public g0 getEdgeEffectFactory() {
        return this.f1229a0;
    }

    public h0 getItemAnimator() {
        return this.f1239f0;
    }

    public int getItemDecorationCount() {
        return this.G.size();
    }

    public k0 getLayoutManager() {
        return this.E;
    }

    public int getMaxFlingVelocity() {
        return this.f1250q0;
    }

    public int getMinFlingVelocity() {
        return this.f1249p0;
    }

    public long getNanoTime() {
        if (W0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public m0 getOnFlingListener() {
        return this.f1248o0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1253t0;
    }

    public q0 getRecycledViewPool() {
        return this.f1232c.c();
    }

    public int getScrollState() {
        return this.f1240g0;
    }

    public final void h(a1 a1Var) {
        boolean z9;
        View view = a1Var.f7153a;
        if (view.getParent() == this) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f1232c.m(K(view));
        if (a1Var.l()) {
            this.f1238f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z9) {
            this.f1238f.a(view, -1, true);
            return;
        }
        m3.c cVar = this.f1238f;
        int indexOfChild = cVar.f7181a.f7186a.indexOfChild(view);
        if (indexOfChild >= 0) {
            cVar.f7182b.h(indexOfChild);
            cVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0() {
        int i10 = this.M + 1;
        this.M = i10;
        if (i10 == 1 && !this.O) {
            this.N = false;
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().f(0) == null) {
            return false;
        }
        return true;
    }

    public final void i(i0 i0Var) {
        k0 k0Var = this.E;
        if (k0Var != null) {
            k0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.G;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(i0Var);
        P();
        requestLayout();
    }

    public final void i0(boolean z9) {
        if (this.M < 1) {
            if (!Q0) {
                this.M = 1;
            } else {
                throw new IllegalStateException(a3.g.m(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z9 && !this.O) {
            this.N = false;
        }
        if (this.M == 1) {
            if (z9 && this.N && !this.O && this.E != null && this.D != null) {
                r();
            }
            if (!this.O) {
                this.N = false;
            }
        }
        this.M--;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.O;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4258d;
    }

    public final void j(o0 o0Var) {
        if (this.f1262z0 == null) {
            this.f1262z0 = new ArrayList();
        }
        this.f1262z0.add(o0Var);
    }

    public final void j0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final void k(String str) {
        if (N()) {
            if (str == null) {
                throw new IllegalStateException(a3.g.m(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.W > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a3.g.m(this, new StringBuilder(""))));
        }
    }

    public final void m() {
        int h10 = this.f1238f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            a1 L = L(this.f1238f.g(i10));
            if (!L.p()) {
                L.f7156d = -1;
                L.f7159g = -1;
            }
        }
        h hVar = this.f1232c;
        ArrayList arrayList = (ArrayList) hVar.f68e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a1 a1Var = (a1) arrayList.get(i11);
            a1Var.f7156d = -1;
            a1Var.f7159g = -1;
        }
        ArrayList arrayList2 = (ArrayList) hVar.f66c;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a1 a1Var2 = (a1) arrayList2.get(i12);
            a1Var2.f7156d = -1;
            a1Var2.f7159g = -1;
        }
        ArrayList arrayList3 = (ArrayList) hVar.f67d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                a1 a1Var3 = (a1) ((ArrayList) hVar.f67d).get(i13);
                a1Var3.f7156d = -1;
                a1Var3.f7159g = -1;
            }
        }
    }

    public final void n(int i10, int i11) {
        boolean z9;
        EdgeEffect edgeEffect = this.f1231b0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.f1231b0.onRelease();
            z9 = this.f1231b0.isFinished();
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect2 = this.f1235d0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f1235d0.onRelease();
            z9 |= this.f1235d0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1233c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f1233c0.onRelease();
            z9 |= this.f1233c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1237e0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f1237e0.onRelease();
            z9 |= this.f1237e0.isFinished();
        }
        if (z9) {
            WeakHashMap weakHashMap = y0.f4277a;
            g0.h0.k(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r1 >= 30.0f) goto L55;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.V = r0
            r1 = 1
            r5.J = r1
            boolean r2 = r5.L
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.L = r2
            a3.h r2 = r5.f1232c
            r2.e()
            m3.k0 r2 = r5.E
            if (r2 == 0) goto L23
            r2.f7284g = r1
        L23:
            r5.D0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.W0
            if (r0 == 0) goto L80
            java.lang.ThreadLocal r0 = m3.q.f7343e
            java.lang.Object r1 = r0.get()
            m3.q r1 = (m3.q) r1
            r5.f1255v0 = r1
            if (r1 != 0) goto L63
            m3.q r1 = new m3.q
            r1.<init>()
            r5.f1255v0 = r1
            java.util.WeakHashMap r1 = g0.y0.f4277a
            android.view.Display r1 = g0.i0.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            m3.q r2 = r5.f1255v0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f7347c = r3
            r0.set(r2)
        L63:
            m3.q r0 = r5.f1255v0
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.Q0
            java.util.ArrayList r0 = r0.f7345a
            if (r1 == 0) goto L7d
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7d
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7d:
            r0.add(r5)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h hVar;
        q qVar;
        w wVar;
        super.onDetachedFromWindow();
        h0 h0Var = this.f1239f0;
        if (h0Var != null) {
            h0Var.e();
        }
        setScrollState(0);
        z0 z0Var = this.f1254u0;
        z0Var.f7433x.removeCallbacks(z0Var);
        z0Var.f7429c.abortAnimation();
        k0 k0Var = this.E;
        if (k0Var != null && (wVar = k0Var.f7282e) != null) {
            wVar.i();
        }
        this.J = false;
        k0 k0Var2 = this.E;
        if (k0Var2 != null) {
            k0Var2.f7284g = false;
            k0Var2.P(this);
        }
        this.K0.clear();
        removeCallbacks(this.L0);
        this.f1257x.getClass();
        do {
        } while (l1.f7298d.j() != null);
        int i10 = 0;
        while (true) {
            hVar = this.f1232c;
            ArrayList arrayList = (ArrayList) hVar.f68e;
            if (i10 >= arrayList.size()) {
                break;
            }
            z7.c.c(((a1) arrayList.get(i10)).f7153a);
            i10++;
        }
        hVar.f(((RecyclerView) hVar.f72i).D, false);
        f1 f1Var = new f1(this, 0);
        while (f1Var.hasNext()) {
            View view = (View) f1Var.next();
            m0.a aVar = (m0.a) view.getTag(msr.pistream.app.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new m0.a();
                view.setTag(msr.pistream.app.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f7041a;
            int w9 = com.bumptech.glide.c.w(arrayList2);
            if (-1 < w9) {
                a3.g.z(arrayList2.get(w9));
                throw null;
            }
        }
        if (W0 && (qVar = this.f1255v0) != null) {
            boolean remove = qVar.f7345a.remove(this);
            if (Q0 && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.f1255v0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i0) arrayList.get(i10)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        if (this.O) {
            return false;
        }
        this.I = null;
        if (E(motionEvent)) {
            b0();
            setScrollState(0);
            return true;
        }
        k0 k0Var = this.E;
        if (k0Var == null) {
            return false;
        }
        boolean d10 = k0Var.d();
        boolean e10 = this.E.e();
        if (this.f1242i0 == null) {
            this.f1242i0 = VelocityTracker.obtain();
        }
        this.f1242i0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                T(motionEvent);
                            }
                        } else {
                            this.f1241h0 = motionEvent.getPointerId(actionIndex);
                            int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f1245l0 = x9;
                            this.f1243j0 = x9;
                            int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f1246m0 = y9;
                            this.f1244k0 = y9;
                        }
                    } else {
                        b0();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1241h0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1241h0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f1240g0 != 1) {
                        int i10 = x10 - this.f1243j0;
                        int i11 = y10 - this.f1244k0;
                        if (d10 != 0 && Math.abs(i10) > this.f1247n0) {
                            this.f1245l0 = x10;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (e10 && Math.abs(i11) > this.f1247n0) {
                            this.f1246m0 = y10;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f1242i0.clear();
                j0(0);
            }
        } else {
            if (this.P) {
                this.P = false;
            }
            this.f1241h0 = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.f1245l0 = x11;
            this.f1243j0 = x11;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.f1246m0 = y11;
            this.f1244k0 = y11;
            EdgeEffect edgeEffect = this.f1231b0;
            if (edgeEffect != null && a.u(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
                a.O(this.f1231b0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z9 = true;
            } else {
                z9 = false;
            }
            EdgeEffect edgeEffect2 = this.f1235d0;
            boolean z11 = z9;
            if (edgeEffect2 != null) {
                z11 = z9;
                if (a.u(edgeEffect2) != 0.0f) {
                    z11 = z9;
                    if (!canScrollHorizontally(1)) {
                        a.O(this.f1235d0, 0.0f, motionEvent.getY() / getHeight());
                        z11 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f1233c0;
            boolean z12 = z11;
            if (edgeEffect3 != null) {
                z12 = z11;
                if (a.u(edgeEffect3) != 0.0f) {
                    z12 = z11;
                    if (!canScrollVertically(-1)) {
                        a.O(this.f1233c0, 0.0f, motionEvent.getX() / getWidth());
                        z12 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f1237e0;
            boolean z13 = z12;
            if (edgeEffect4 != null) {
                z13 = z12;
                if (a.u(edgeEffect4) != 0.0f) {
                    z13 = z12;
                    if (!canScrollVertically(1)) {
                        a.O(this.f1237e0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z13 = true;
                    }
                }
            }
            if (z13 || this.f1240g0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                j0(1);
            }
            int[] iArr = this.I0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i12 = d10;
            if (e10) {
                i12 = (d10 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i12, 0);
        }
        if (this.f1240g0 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14 = n.f1613a;
        m.a("RV OnLayout");
        r();
        m.b();
        this.L = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        k0 k0Var = this.E;
        if (k0Var == null) {
            q(i10, i11);
            return;
        }
        boolean J = k0Var.J();
        boolean z9 = false;
        w0 w0Var = this.f1258x0;
        if (J) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.E.f7279b.q(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z9 = true;
            }
            this.M0 = z9;
            if (!z9 && this.D != null) {
                if (w0Var.f7409d == 1) {
                    s();
                }
                this.E.p0(i10, i11);
                w0Var.f7414i = true;
                t();
                this.E.r0(i10, i11);
                if (this.E.u0()) {
                    this.E.p0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    w0Var.f7414i = true;
                    t();
                    this.E.r0(i10, i11);
                }
                this.N0 = getMeasuredWidth();
                this.O0 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.K) {
            this.E.f7279b.q(i10, i11);
            return;
        }
        if (this.R) {
            h0();
            R();
            V();
            S(true);
            if (w0Var.f7416k) {
                w0Var.f7412g = true;
            } else {
                this.f1236e.c();
                w0Var.f7412g = false;
            }
            this.R = false;
            i0(false);
        } else if (w0Var.f7416k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        d0 d0Var = this.D;
        if (d0Var != null) {
            w0Var.f7410e = d0Var.a();
        } else {
            w0Var.f7410e = 0;
        }
        h0();
        this.E.f7279b.q(i10, i11);
        i0(false);
        w0Var.f7412g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (N()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof t0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        t0 t0Var = (t0) parcelable;
        this.f1234d = t0Var;
        super.onRestoreInstanceState(t0Var.f7897a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        t0 t0Var = new t0(super.onSaveInstanceState());
        t0 t0Var2 = this.f1234d;
        if (t0Var2 != null) {
            t0Var.f7368c = t0Var2.f7368c;
        } else {
            k0 k0Var = this.E;
            if (k0Var != null) {
                t0Var.f7368c = k0Var.d0();
            } else {
                t0Var.f7368c = null;
            }
        }
        return t0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.f1237e0 = null;
            this.f1233c0 = null;
            this.f1235d0 = null;
            this.f1231b0 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x05d1, code lost:
    
        if (r8 != false) goto L771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05bb, code lost:
    
        if (r1 < r8) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x00e2, code lost:
    
        if (r15 >= 0) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0139, code lost:
    
        if (r12 >= 0) goto L458;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:183:0x0473. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0232  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.L && !this.T) {
            if (!this.f1236e.g()) {
                return;
            }
            b bVar = this.f1236e;
            int i10 = bVar.f7176f;
            boolean z12 = false;
            if ((4 & i10) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if ((i10 & 11) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int i11 = n.f1613a;
                    m.a("RV PartialInvalidate");
                    h0();
                    R();
                    this.f1236e.j();
                    if (!this.N) {
                        int e10 = this.f1238f.e();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= e10) {
                                break;
                            }
                            a1 L = L(this.f1238f.d(i12));
                            if (L != null && !L.p()) {
                                if ((L.f7162j & 2) != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    z12 = true;
                                    break;
                                }
                            }
                            i12++;
                        }
                        if (z12) {
                            r();
                        } else {
                            this.f1236e.b();
                        }
                    }
                    i0(true);
                    S(true);
                    m.b();
                    return;
                }
            }
            if (bVar.g()) {
                int i13 = n.f1613a;
                m.a("RV FullInvalidate");
                r();
                m.b();
                return;
            }
            return;
        }
        int i14 = n.f1613a;
        m.a("RV FullInvalidate");
        r();
        m.b();
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = y0.f4277a;
        setMeasuredDimension(k0.g(i10, paddingRight, g0.h0.e(this)), k0.g(i11, getPaddingBottom() + getPaddingTop(), g0.h0.d(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0321, code lost:
    
        if (r17.f1238f.j(getFocusedChild()) == false) goto L480;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r():void");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z9) {
        a1 L = L(view);
        if (L != null) {
            if (L.l()) {
                L.f7162j &= -257;
            } else if (!L.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L);
                throw new IllegalArgumentException(a3.g.m(this, sb));
            }
        } else if (Q0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(a3.g.m(this, sb2));
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z9;
        w wVar = this.E.f7282e;
        boolean z10 = true;
        if (wVar != null && wVar.f7395e) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && !N()) {
            z10 = false;
        }
        if (!z10 && view2 != null) {
            a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        return this.E.j0(this, view, rect, z9, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.M == 0 && !this.O) {
            super.requestLayout();
        } else {
            this.N = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0074 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        k0 k0Var = this.E;
        if (k0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.O) {
            return;
        }
        boolean d10 = k0Var.d();
        boolean e10 = this.E.e();
        if (d10 || e10) {
            if (!d10) {
                i10 = 0;
            }
            if (!e10) {
                i11 = 0;
            }
            c0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (N()) {
            if (accessibilityEvent != null) {
                i10 = h0.b.a(accessibilityEvent);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.Q |= i11;
            i11 = 1;
        }
        if (i11 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(c1 c1Var) {
        this.E0 = c1Var;
        y0.l(this, c1Var);
    }

    public void setAdapter(d0 d0Var) {
        setLayoutFrozen(false);
        d0 d0Var2 = this.D;
        s0 s0Var = this.f1230b;
        if (d0Var2 != null) {
            d0Var2.f7192a.unregisterObserver(s0Var);
            this.D.getClass();
        }
        h0 h0Var = this.f1239f0;
        if (h0Var != null) {
            h0Var.e();
        }
        k0 k0Var = this.E;
        h hVar = this.f1232c;
        if (k0Var != null) {
            k0Var.f0(hVar);
            this.E.g0(hVar);
        }
        ((ArrayList) hVar.f66c).clear();
        hVar.g();
        b bVar = this.f1236e;
        bVar.l(bVar.f7172b);
        bVar.l(bVar.f7173c);
        bVar.f7176f = 0;
        d0 d0Var3 = this.D;
        this.D = d0Var;
        if (d0Var != null) {
            d0Var.f7192a.registerObserver(s0Var);
        }
        k0 k0Var2 = this.E;
        if (k0Var2 != null) {
            k0Var2.O();
        }
        d0 d0Var4 = this.D;
        ((ArrayList) hVar.f66c).clear();
        hVar.g();
        hVar.f(d0Var3, true);
        q0 c6 = hVar.c();
        if (d0Var3 != null) {
            c6.f7350b--;
        }
        if (c6.f7350b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = c6.f7349a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                p0 p0Var = (p0) sparseArray.valueAt(i10);
                Iterator it = p0Var.f7339a.iterator();
                while (it.hasNext()) {
                    z7.c.c(((a1) it.next()).f7153a);
                }
                p0Var.f7339a.clear();
                i10++;
            }
        }
        if (d0Var4 != null) {
            c6.f7350b++;
        }
        hVar.e();
        this.f1258x0.f7411f = true;
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(f0 f0Var) {
        if (f0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z9) {
        if (z9 != this.f1259y) {
            this.f1237e0 = null;
            this.f1233c0 = null;
            this.f1235d0 = null;
            this.f1231b0 = null;
        }
        this.f1259y = z9;
        super.setClipToPadding(z9);
        if (this.L) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(g0 g0Var) {
        g0Var.getClass();
        this.f1229a0 = g0Var;
        this.f1237e0 = null;
        this.f1233c0 = null;
        this.f1235d0 = null;
        this.f1231b0 = null;
    }

    public void setHasFixedSize(boolean z9) {
        this.K = z9;
    }

    public void setItemAnimator(h0 h0Var) {
        h0 h0Var2 = this.f1239f0;
        if (h0Var2 != null) {
            h0Var2.e();
            this.f1239f0.f7230a = null;
        }
        this.f1239f0 = h0Var;
        if (h0Var != null) {
            h0Var.f7230a = this.C0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        h hVar = this.f1232c;
        hVar.f64a = i10;
        hVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z9) {
        suppressLayout(z9);
    }

    public void setLayoutManager(k0 k0Var) {
        c0 c0Var;
        RecyclerView recyclerView;
        w wVar;
        if (k0Var == this.E) {
            return;
        }
        int i10 = 0;
        setScrollState(0);
        z0 z0Var = this.f1254u0;
        z0Var.f7433x.removeCallbacks(z0Var);
        z0Var.f7429c.abortAnimation();
        k0 k0Var2 = this.E;
        if (k0Var2 != null && (wVar = k0Var2.f7282e) != null) {
            wVar.i();
        }
        k0 k0Var3 = this.E;
        h hVar = this.f1232c;
        if (k0Var3 != null) {
            h0 h0Var = this.f1239f0;
            if (h0Var != null) {
                h0Var.e();
            }
            this.E.f0(hVar);
            this.E.g0(hVar);
            ((ArrayList) hVar.f66c).clear();
            hVar.g();
            if (this.J) {
                k0 k0Var4 = this.E;
                k0Var4.f7284g = false;
                k0Var4.P(this);
            }
            this.E.s0(null);
            this.E = null;
        } else {
            ((ArrayList) hVar.f66c).clear();
            hVar.g();
        }
        m3.c cVar = this.f1238f;
        cVar.f7182b.g();
        ArrayList arrayList = cVar.f7183c;
        int size = arrayList.size();
        while (true) {
            size--;
            c0Var = cVar.f7181a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            c0Var.getClass();
            a1 L = L(view);
            if (L != null) {
                int i11 = L.f7167p;
                RecyclerView recyclerView2 = c0Var.f7186a;
                if (recyclerView2.N()) {
                    L.f7168q = i11;
                    recyclerView2.K0.add(L);
                } else {
                    WeakHashMap weakHashMap = y0.f4277a;
                    g0.h0.s(L.f7153a, i11);
                }
                L.f7167p = 0;
            }
            arrayList.remove(size);
        }
        int c6 = c0Var.c();
        while (true) {
            recyclerView = c0Var.f7186a;
            if (i10 >= c6) {
                break;
            }
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getClass();
            L(childAt);
            d0 d0Var = recyclerView.D;
            childAt.clearAnimation();
            i10++;
        }
        recyclerView.removeAllViews();
        this.E = k0Var;
        if (k0Var != null) {
            if (k0Var.f7279b == null) {
                k0Var.s0(this);
                if (this.J) {
                    this.E.f7284g = true;
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(k0Var);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a3.g.m(k0Var.f7279b, sb));
            }
        }
        hVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        u scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4258d) {
            WeakHashMap weakHashMap = y0.f4277a;
            g0.n0.z(scrollingChildHelper.f4257c);
        }
        scrollingChildHelper.f4258d = z9;
    }

    public void setOnFlingListener(m0 m0Var) {
        this.f1248o0 = m0Var;
    }

    @Deprecated
    public void setOnScrollListener(o0 o0Var) {
        this.f1260y0 = o0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z9) {
        this.f1253t0 = z9;
    }

    public void setRecycledViewPool(q0 q0Var) {
        h hVar = this.f1232c;
        hVar.f(((RecyclerView) hVar.f72i).D, false);
        if (((q0) hVar.f70g) != null) {
            r1.f7350b--;
        }
        hVar.f70g = q0Var;
        if (q0Var != null && ((RecyclerView) hVar.f72i).getAdapter() != null) {
            ((q0) hVar.f70g).f7350b++;
        }
        hVar.e();
    }

    @Deprecated
    public void setRecyclerListener(r0 r0Var) {
    }

    public void setScrollState(int i10) {
        w wVar;
        if (i10 == this.f1240g0) {
            return;
        }
        if (R0) {
            StringBuilder u9 = a3.g.u("setting scroll state to ", i10, " from ");
            u9.append(this.f1240g0);
            Log.d("RecyclerView", u9.toString(), new Exception());
        }
        this.f1240g0 = i10;
        if (i10 != 2) {
            z0 z0Var = this.f1254u0;
            z0Var.f7433x.removeCallbacks(z0Var);
            z0Var.f7429c.abortAnimation();
            k0 k0Var = this.E;
            if (k0Var != null && (wVar = k0Var.f7282e) != null) {
                wVar.i();
            }
        }
        k0 k0Var2 = this.E;
        if (k0Var2 != null) {
            k0Var2.e0(i10);
        }
        o0 o0Var = this.f1260y0;
        if (o0Var != null) {
            o0Var.a(this, i10);
        }
        ArrayList arrayList = this.f1262z0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((o0) this.f1262z0.get(size)).a(this, i10);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f1247n0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f1247n0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(m3.y0 y0Var) {
        this.f1232c.f71h = y0Var;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z9) {
        w wVar;
        if (z9 != this.O) {
            k("Do not suppressLayout in layout or scroll");
            if (!z9) {
                this.O = false;
                if (this.N && this.E != null && this.D != null) {
                    requestLayout();
                }
                this.N = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.O = true;
            this.P = true;
            setScrollState(0);
            z0 z0Var = this.f1254u0;
            z0Var.f7433x.removeCallbacks(z0Var);
            z0Var.f7429c.abortAnimation();
            k0 k0Var = this.E;
            if (k0Var != null && (wVar = k0Var.f7282e) != null) {
                wVar.i();
            }
        }
    }

    public final void t() {
        boolean z9;
        boolean z10;
        h0();
        R();
        w0 w0Var = this.f1258x0;
        w0Var.a(6);
        this.f1236e.c();
        w0Var.f7410e = this.D.a();
        w0Var.f7408c = 0;
        if (this.f1234d != null) {
            d0 d0Var = this.D;
            int b10 = j.b(d0Var.f7194c);
            if (b10 == 1 ? d0Var.a() > 0 : b10 != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Parcelable parcelable = this.f1234d.f7368c;
                if (parcelable != null) {
                    this.E.c0(parcelable);
                }
                this.f1234d = null;
            }
        }
        w0Var.f7412g = false;
        this.E.a0(this.f1232c, w0Var);
        w0Var.f7411f = false;
        if (w0Var.f7415j && this.f1239f0 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w0Var.f7415j = z9;
        w0Var.f7409d = 4;
        S(true);
        i0(false);
    }

    public final boolean u(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void v(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void w(int i10, int i11) {
        this.W++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        o0 o0Var = this.f1260y0;
        if (o0Var != null) {
            o0Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.f1262z0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((o0) this.f1262z0.get(size)).b(this, i10, i11);
                }
            }
        }
        this.W--;
    }

    public final void x() {
        if (this.f1237e0 != null) {
            return;
        }
        ((x0) this.f1229a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1237e0 = edgeEffect;
        if (this.f1259y) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f1231b0 != null) {
            return;
        }
        ((x0) this.f1229a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1231b0 = edgeEffect;
        if (this.f1259y) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f1235d0 != null) {
            return;
        }
        ((x0) this.f1229a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1235d0 = edgeEffect;
        if (this.f1259y) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float a10;
        float a11;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.f1230b = new s0(this);
        this.f1232c = new h(this);
        this.f1257x = new m1(0);
        this.f1261z = new b0(this, 0);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new RectF();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.M = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.f1229a0 = Z0;
        this.f1239f0 = new m3.j();
        this.f1240g0 = 0;
        this.f1241h0 = -1;
        this.f1251r0 = Float.MIN_VALUE;
        this.f1252s0 = Float.MIN_VALUE;
        this.f1253t0 = true;
        this.f1254u0 = new z0(this);
        this.f1256w0 = W0 ? new g(1) : null;
        this.f1258x0 = new w0();
        this.A0 = false;
        this.B0 = false;
        c0 c0Var = new c0(this);
        this.C0 = c0Var;
        this.D0 = false;
        char c6 = 2;
        this.F0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new ArrayList();
        this.L0 = new b0(this, 1);
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = new c0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1247n0 = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = b1.f4169a;
            a10 = g0.z0.a(viewConfiguration);
        } else {
            a10 = b1.a(viewConfiguration, context);
        }
        this.f1251r0 = a10;
        if (i11 >= 26) {
            a11 = g0.z0.b(viewConfiguration);
        } else {
            a11 = b1.a(viewConfiguration, context);
        }
        this.f1252s0 = a11;
        this.f1249p0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1250q0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1228a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1239f0.f7230a = c0Var;
        this.f1236e = new b(new c0(this));
        this.f1238f = new m3.c(new c0(this));
        WeakHashMap weakHashMap = y0.f4277a;
        if ((i11 >= 26 ? g0.p0.b(this) : 0) == 0 && i11 >= 26) {
            g0.p0.l(this, 8);
        }
        if (g0.h0.c(this) == 0) {
            g0.h0.s(this, 1);
        }
        this.S = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new c1(this));
        int[] iArr = l3.a.f6817a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        y0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1259y = obtainStyledAttributes.getBoolean(1, true);
        int i12 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                new o(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(msr.pistream.app.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(msr.pistream.app.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(msr.pistream.app.R.dimen.fastscroll_margin));
                i12 = 4;
                c6 = 2;
            } else {
                throw new IllegalArgumentException(a3.g.m(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(k0.class);
                    try {
                        constructor = asSubclass.getConstructor(X0);
                        Object[] objArr2 = new Object[i12];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c6] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((k0) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = S0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        y0.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10);
        boolean z9 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z9);
        setTag(msr.pistream.app.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        k0 k0Var = this.E;
        if (k0Var != null) {
            return k0Var.t(layoutParams);
        }
        throw new IllegalStateException(a3.g.m(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
