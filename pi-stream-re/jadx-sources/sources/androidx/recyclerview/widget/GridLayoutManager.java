package androidx.recyclerview.widget;

import a3.h;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.appcompat.widget.x3;
import g0.h0;
import g0.y0;
import h3.x;
import java.util.WeakHashMap;
import m3.k0;
import m3.l0;
import m3.r;
import m3.u;
import m3.w0;
import n.g;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final x3 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new x3(3);
        this.L = new Rect();
        k1(k0.G(context, attributeSet, i10, i11).f7267b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(w0 w0Var, u uVar, g gVar) {
        boolean z9;
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F; i11++) {
            int i12 = uVar.f7372d;
            if (i12 >= 0 && i12 < w0Var.b()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && i10 > 0) {
                gVar.b(uVar.f7372d, Math.max(0, uVar.f7375g));
                this.K.getClass();
                i10--;
                uVar.f7372d += uVar.f7373e;
            } else {
                return;
            }
        }
    }

    @Override // m3.k0
    public final int H(h hVar, w0 w0Var) {
        if (this.f1217p == 0) {
            return this.F;
        }
        if (w0Var.b() < 1) {
            return 0;
        }
        return g1(w0Var.b() - 1, hVar, w0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(h hVar, w0 w0Var, boolean z9, boolean z10) {
        int i10;
        int i11;
        int v9 = v();
        int i12 = 1;
        if (z10) {
            i11 = v() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = v9;
            i11 = 0;
        }
        int b10 = w0Var.b();
        F0();
        int h10 = this.f1219r.h();
        int f10 = this.f1219r.f();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View u9 = u(i11);
            int F = k0.F(u9);
            if (F >= 0 && F < b10 && h1(F, hVar, w0Var) == 0) {
                if (((l0) u9.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = u9;
                    }
                } else {
                    if (this.f1219r.d(u9) < f10 && this.f1219r.b(u9) >= h10) {
                        return u9;
                    }
                    if (view == null) {
                        view = u9;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        if (r13 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0111, code lost:
    
        if (r13 == r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x001e, code lost:
    
        if (r22.f7278a.j(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Q(android.view.View r23, int r24, a3.h r25, m3.w0 r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q(android.view.View, int, a3.h, m3.w0):android.view.View");
    }

    @Override // m3.k0
    public final void S(h hVar, w0 w0Var, h0.h hVar2) {
        super.S(hVar, w0Var, hVar2);
        hVar2.f4539a.setClassName(GridView.class.getName());
    }

    @Override // m3.k0
    public final void T(h hVar, w0 w0Var, View view, h0.h hVar2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r)) {
            U(view, hVar2);
            return;
        }
        r rVar = (r) layoutParams;
        int g12 = g1(rVar.a(), hVar, w0Var);
        int i10 = this.f1217p;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar2.f4539a;
        if (i10 == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(rVar.f7352e, rVar.f7353f, g12, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(g12, 1, rVar.f7352e, rVar.f7353f, false, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v42 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0(a3.h r19, m3.w0 r20, m3.u r21, m3.t r22) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T0(a3.h, m3.w0, m3.u, m3.t):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(h hVar, w0 w0Var, x xVar, int i10) {
        boolean z9;
        l1();
        if (w0Var.b() > 0 && !w0Var.f7412g) {
            if (i10 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            int h12 = h1(xVar.f4976b, hVar, w0Var);
            if (z9) {
                while (h12 > 0) {
                    int i11 = xVar.f4976b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    xVar.f4976b = i12;
                    h12 = h1(i12, hVar, w0Var);
                }
            } else {
                int b10 = w0Var.b() - 1;
                int i13 = xVar.f4976b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int h13 = h1(i14, hVar, w0Var);
                    if (h13 <= h12) {
                        break;
                    }
                    i13 = i14;
                    h12 = h13;
                }
                xVar.f4976b = i13;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // m3.k0
    public final void V(int i10, int i11) {
        x3 x3Var = this.K;
        x3Var.d();
        ((SparseIntArray) x3Var.f708e).clear();
    }

    @Override // m3.k0
    public final void W() {
        x3 x3Var = this.K;
        x3Var.d();
        ((SparseIntArray) x3Var.f708e).clear();
    }

    @Override // m3.k0
    public final void X(int i10, int i11) {
        x3 x3Var = this.K;
        x3Var.d();
        ((SparseIntArray) x3Var.f708e).clear();
    }

    @Override // m3.k0
    public final void Y(int i10, int i11) {
        x3 x3Var = this.K;
        x3Var.d();
        ((SparseIntArray) x3Var.f708e).clear();
    }

    @Override // m3.k0
    public final void Z(int i10, int i11) {
        x3 x3Var = this.K;
        x3Var.d();
        ((SparseIntArray) x3Var.f708e).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final void a0(h hVar, w0 w0Var) {
        boolean z9 = w0Var.f7412g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z9) {
            int v9 = v();
            for (int i10 = 0; i10 < v9; i10++) {
                r rVar = (r) u(i10).getLayoutParams();
                int a10 = rVar.a();
                sparseIntArray2.put(a10, rVar.f7353f);
                sparseIntArray.put(a10, rVar.f7352e);
            }
        }
        super.a0(hVar, w0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z9) {
        if (!z9) {
            super.a1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final void b0(w0 w0Var) {
        super.b0(w0Var);
        this.E = false;
    }

    public final void e1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 > 0 && i12 - i13 < i15) {
                i11 = i14 + 1;
                i13 -= i12;
            } else {
                i11 = i14;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    @Override // m3.k0
    public final boolean f(l0 l0Var) {
        return l0Var instanceof r;
    }

    public final int f1(int i10, int i11) {
        if (this.f1217p == 1 && S0()) {
            int[] iArr = this.G;
            int i12 = this.F;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.G;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    public final int g1(int i10, h hVar, w0 w0Var) {
        boolean z9 = w0Var.f7412g;
        x3 x3Var = this.K;
        if (!z9) {
            return x3Var.a(i10, this.F);
        }
        int b10 = hVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return x3Var.a(b10, this.F);
    }

    public final int h1(int i10, h hVar, w0 w0Var) {
        boolean z9 = w0Var.f7412g;
        x3 x3Var = this.K;
        if (!z9) {
            return x3Var.b(i10, this.F);
        }
        int i11 = this.J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = hVar.b(i10);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return x3Var.b(b10, this.F);
    }

    public final int i1(int i10, h hVar, w0 w0Var) {
        boolean z9 = w0Var.f7412g;
        x3 x3Var = this.K;
        if (!z9) {
            x3Var.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (hVar.b(i10) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        x3Var.getClass();
        return 1;
    }

    public final void j1(View view, int i10, boolean z9) {
        int i11;
        int i12;
        boolean t02;
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f7295b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        int f12 = f1(rVar.f7352e, rVar.f7353f);
        if (this.f1217p == 1) {
            i12 = k0.w(false, f12, i10, i14, ((ViewGroup.MarginLayoutParams) rVar).width);
            i11 = k0.w(true, this.f1219r.i(), this.f7290m, i13, ((ViewGroup.MarginLayoutParams) rVar).height);
        } else {
            int w9 = k0.w(false, f12, i10, i13, ((ViewGroup.MarginLayoutParams) rVar).height);
            int w10 = k0.w(true, this.f1219r.i(), this.f7289l, i14, ((ViewGroup.MarginLayoutParams) rVar).width);
            i11 = w9;
            i12 = w10;
        }
        l0 l0Var = (l0) view.getLayoutParams();
        if (z9) {
            t02 = v0(view, i12, i11, l0Var);
        } else {
            t02 = t0(view, i12, i11, l0Var);
        }
        if (t02) {
            view.measure(i12, i11);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final int k(w0 w0Var) {
        return C0(w0Var);
    }

    public final void k1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 >= 1) {
            this.F = i10;
            this.K.d();
            k0();
            return;
        }
        throw new IllegalArgumentException(a3.g.n("Span count should be at least 1. Provided ", i10));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final int l(w0 w0Var) {
        return D0(w0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final int l0(int i10, h hVar, w0 w0Var) {
        l1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.l0(i10, hVar, w0Var);
    }

    public final void l1() {
        int B;
        int E;
        if (this.f1217p == 1) {
            B = this.f7291n - D();
            E = C();
        } else {
            B = this.o - B();
            E = E();
        }
        e1(B - E);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final int n(w0 w0Var) {
        return C0(w0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final int n0(int i10, h hVar, w0 w0Var) {
        l1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.n0(i10, hVar, w0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final int o(w0 w0Var) {
        return D0(w0Var);
    }

    @Override // m3.k0
    public final void q0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        if (this.G == null) {
            super.q0(rect, i10, i11);
        }
        int D = D() + C();
        int B = B() + E();
        if (this.f1217p == 1) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.f7279b;
            WeakHashMap weakHashMap = y0.f4277a;
            g11 = k0.g(i11, height, h0.d(recyclerView));
            int[] iArr = this.G;
            g10 = k0.g(i10, iArr[iArr.length - 1] + D, h0.e(this.f7279b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f7279b;
            WeakHashMap weakHashMap2 = y0.f4277a;
            g10 = k0.g(i10, width, h0.e(recyclerView2));
            int[] iArr2 = this.G;
            g11 = k0.g(i11, iArr2[iArr2.length - 1] + B, h0.d(this.f7279b));
        }
        this.f7279b.setMeasuredDimension(g10, g11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final l0 r() {
        if (this.f1217p == 0) {
            return new r(-2, -1);
        }
        return new r(-1, -2);
    }

    @Override // m3.k0
    public final l0 s(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    @Override // m3.k0
    public final l0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new r((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new r(layoutParams);
    }

    @Override // m3.k0
    public final int x(h hVar, w0 w0Var) {
        if (this.f1217p == 1) {
            return this.F;
        }
        if (w0Var.b() < 1) {
            return 0;
        }
        return g1(w0Var.b() - 1, hVar, w0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final boolean y0() {
        if (this.f1227z == null && !this.E) {
            return true;
        }
        return false;
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new x3(3);
        this.L = new Rect();
        k1(i10);
    }

    public GridLayoutManager() {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new x3(3);
        this.L = new Rect();
        k1(2);
    }
}
