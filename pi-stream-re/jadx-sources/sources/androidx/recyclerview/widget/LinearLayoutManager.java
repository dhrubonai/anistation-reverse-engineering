package androidx.recyclerview.widget;

import a3.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import h3.x;
import m3.j0;
import m3.k0;
import m3.l0;
import m3.t;
import m3.u;
import m3.v;
import m3.v0;
import m3.w;
import m3.w0;
import m3.y;
import m3.z;
import n.g;
import p7.a0;

/* loaded from: classes.dex */
public class LinearLayoutManager extends k0 implements v0 {
    public final x A;
    public final t B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f1217p;

    /* renamed from: q, reason: collision with root package name */
    public u f1218q;

    /* renamed from: r, reason: collision with root package name */
    public y f1219r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1220s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1221t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1222u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1223v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1224w;

    /* renamed from: x, reason: collision with root package name */
    public int f1225x;

    /* renamed from: y, reason: collision with root package name */
    public int f1226y;

    /* renamed from: z, reason: collision with root package name */
    public v f1227z;

    public LinearLayoutManager(int i10) {
        this.f1217p = 1;
        this.f1221t = false;
        this.f1222u = false;
        this.f1223v = false;
        this.f1224w = true;
        this.f1225x = -1;
        this.f1226y = Integer.MIN_VALUE;
        this.f1227z = null;
        this.A = new x();
        this.B = new t();
        this.C = 2;
        this.D = new int[2];
        Z0(i10);
        c(null);
        if (this.f1221t) {
            this.f1221t = false;
            k0();
        }
    }

    public void A0(w0 w0Var, u uVar, g gVar) {
        int i10 = uVar.f7372d;
        if (i10 >= 0 && i10 < w0Var.b()) {
            gVar.b(i10, Math.max(0, uVar.f7375g));
        }
    }

    public final int B0(w0 w0Var) {
        if (v() == 0) {
            return 0;
        }
        F0();
        y yVar = this.f1219r;
        boolean z9 = !this.f1224w;
        return a0.f(w0Var, yVar, I0(z9), H0(z9), this, this.f1224w);
    }

    public final int C0(w0 w0Var) {
        if (v() == 0) {
            return 0;
        }
        F0();
        y yVar = this.f1219r;
        boolean z9 = !this.f1224w;
        return a0.g(w0Var, yVar, I0(z9), H0(z9), this, this.f1224w, this.f1222u);
    }

    public final int D0(w0 w0Var) {
        if (v() == 0) {
            return 0;
        }
        F0();
        y yVar = this.f1219r;
        boolean z9 = !this.f1224w;
        return a0.h(w0Var, yVar, I0(z9), H0(z9), this, this.f1224w);
    }

    public final int E0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.f1217p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f1217p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f1217p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f1217p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f1217p != 1 && S0()) {
                return -1;
            }
            return 1;
        }
        if (this.f1217p == 1 || !S0()) {
            return -1;
        }
        return 1;
    }

    public final void F0() {
        if (this.f1218q == null) {
            this.f1218q = new u();
        }
    }

    public final int G0(h hVar, u uVar, w0 w0Var, boolean z9) {
        boolean z10;
        int i10 = uVar.f7371c;
        int i11 = uVar.f7375g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                uVar.f7375g = i11 + i10;
            }
            V0(hVar, uVar);
        }
        int i12 = uVar.f7371c + uVar.f7376h;
        while (true) {
            if (!uVar.f7380l && i12 <= 0) {
                break;
            }
            int i13 = uVar.f7372d;
            if (i13 >= 0 && i13 < w0Var.b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            t tVar = this.B;
            tVar.f7364a = 0;
            tVar.f7365b = false;
            tVar.f7366c = false;
            tVar.f7367d = false;
            T0(hVar, w0Var, uVar, tVar);
            if (!tVar.f7365b) {
                int i14 = uVar.f7370b;
                int i15 = tVar.f7364a;
                uVar.f7370b = (uVar.f7374f * i15) + i14;
                if (!tVar.f7366c || uVar.f7379k != null || !w0Var.f7412g) {
                    uVar.f7371c -= i15;
                    i12 -= i15;
                }
                int i16 = uVar.f7375g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    uVar.f7375g = i17;
                    int i18 = uVar.f7371c;
                    if (i18 < 0) {
                        uVar.f7375g = i17 + i18;
                    }
                    V0(hVar, uVar);
                }
                if (z9 && tVar.f7367d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - uVar.f7371c;
    }

    public final View H0(boolean z9) {
        if (this.f1222u) {
            return M0(0, v(), z9);
        }
        return M0(v() - 1, -1, z9);
    }

    public final View I0(boolean z9) {
        if (this.f1222u) {
            return M0(v() - 1, -1, z9);
        }
        return M0(0, v(), z9);
    }

    @Override // m3.k0
    public final boolean J() {
        return true;
    }

    public final int J0() {
        View M0 = M0(0, v(), false);
        if (M0 == null) {
            return -1;
        }
        return k0.F(M0);
    }

    public final int K0() {
        View M0 = M0(v() - 1, -1, false);
        if (M0 == null) {
            return -1;
        }
        return k0.F(M0);
    }

    public final View L0(int i10, int i11) {
        char c6;
        int i12;
        int i13;
        F0();
        if (i11 > i10) {
            c6 = 1;
        } else if (i11 < i10) {
            c6 = 65535;
        } else {
            c6 = 0;
        }
        if (c6 == 0) {
            return u(i10);
        }
        if (this.f1219r.d(u(i10)) < this.f1219r.h()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        if (this.f1217p == 0) {
            return this.f7280c.f(i10, i11, i12, i13);
        }
        return this.f7281d.f(i10, i11, i12, i13);
    }

    public final View M0(int i10, int i11, boolean z9) {
        int i12;
        F0();
        if (z9) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (this.f1217p == 0) {
            return this.f7280c.f(i10, i11, i12, 320);
        }
        return this.f7281d.f(i10, i11, i12, 320);
    }

    public View N0(h hVar, w0 w0Var, boolean z9, boolean z10) {
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        F0();
        int v9 = v();
        if (z10) {
            i11 = v() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = v9;
            i11 = 0;
            i12 = 1;
        }
        int b10 = w0Var.b();
        int h10 = this.f1219r.h();
        int f10 = this.f1219r.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View u9 = u(i11);
            int F = k0.F(u9);
            int d10 = this.f1219r.d(u9);
            int b11 = this.f1219r.b(u9);
            if (F >= 0 && F < b10) {
                if (((l0) u9.getLayoutParams()).c()) {
                    if (view3 == null) {
                        view3 = u9;
                    }
                } else {
                    if (b11 <= h10 && d10 < h10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (d10 >= f10 && b11 > f10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z11 && !z12) {
                        return u9;
                    }
                    if (z9) {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = u9;
                        }
                        view2 = u9;
                    } else {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = u9;
                        }
                        view2 = u9;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    public final int O0(int i10, h hVar, w0 w0Var, boolean z9) {
        int f10;
        int f11 = this.f1219r.f() - i10;
        if (f11 > 0) {
            int i11 = -Y0(-f11, hVar, w0Var);
            int i12 = i10 + i11;
            if (z9 && (f10 = this.f1219r.f() - i12) > 0) {
                this.f1219r.l(f10);
                return f10 + i11;
            }
            return i11;
        }
        return 0;
    }

    @Override // m3.k0
    public final void P(RecyclerView recyclerView) {
    }

    public final int P0(int i10, h hVar, w0 w0Var, boolean z9) {
        int h10;
        int h11 = i10 - this.f1219r.h();
        if (h11 > 0) {
            int i11 = -Y0(h11, hVar, w0Var);
            int i12 = i10 + i11;
            if (z9 && (h10 = i12 - this.f1219r.h()) > 0) {
                this.f1219r.l(-h10);
                return i11 - h10;
            }
            return i11;
        }
        return 0;
    }

    @Override // m3.k0
    public View Q(View view, int i10, h hVar, w0 w0Var) {
        int E0;
        View L0;
        View Q0;
        X0();
        if (v() == 0 || (E0 = E0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        F0();
        b1(E0, (int) (this.f1219r.i() * 0.33333334f), false, w0Var);
        u uVar = this.f1218q;
        uVar.f7375g = Integer.MIN_VALUE;
        uVar.f7369a = false;
        G0(hVar, uVar, w0Var, true);
        if (E0 == -1) {
            if (this.f1222u) {
                L0 = L0(v() - 1, -1);
            } else {
                L0 = L0(0, v());
            }
        } else if (this.f1222u) {
            L0 = L0(0, v());
        } else {
            L0 = L0(v() - 1, -1);
        }
        if (E0 == -1) {
            Q0 = R0();
        } else {
            Q0 = Q0();
        }
        if (Q0.hasFocusable()) {
            if (L0 == null) {
                return null;
            }
            return Q0;
        }
        return L0;
    }

    public final View Q0() {
        int v9;
        if (this.f1222u) {
            v9 = 0;
        } else {
            v9 = v() - 1;
        }
        return u(v9);
    }

    @Override // m3.k0
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(J0());
            accessibilityEvent.setToIndex(K0());
        }
    }

    public final View R0() {
        int i10;
        if (this.f1222u) {
            i10 = v() - 1;
        } else {
            i10 = 0;
        }
        return u(i10);
    }

    public final boolean S0() {
        if (A() == 1) {
            return true;
        }
        return false;
    }

    public void T0(h hVar, w0 w0Var, u uVar, t tVar) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        View b10 = uVar.b(hVar);
        if (b10 == null) {
            tVar.f7365b = true;
            return;
        }
        l0 l0Var = (l0) b10.getLayoutParams();
        if (uVar.f7379k == null) {
            boolean z11 = this.f1222u;
            if (uVar.f7374f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            boolean z12 = this.f1222u;
            if (uVar.f7374f == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z12 == z9) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        l0 l0Var2 = (l0) b10.getLayoutParams();
        Rect M = this.f7279b.M(b10);
        int i14 = M.left + M.right + 0;
        int i15 = M.top + M.bottom + 0;
        int w9 = k0.w(d(), this.f7291n, this.f7289l, D() + C() + ((ViewGroup.MarginLayoutParams) l0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) l0Var2).rightMargin + i14, ((ViewGroup.MarginLayoutParams) l0Var2).width);
        int w10 = k0.w(e(), this.o, this.f7290m, B() + E() + ((ViewGroup.MarginLayoutParams) l0Var2).topMargin + ((ViewGroup.MarginLayoutParams) l0Var2).bottomMargin + i15, ((ViewGroup.MarginLayoutParams) l0Var2).height);
        if (t0(b10, w9, w10, l0Var2)) {
            b10.measure(w9, w10);
        }
        tVar.f7364a = this.f1219r.c(b10);
        if (this.f1217p == 1) {
            if (S0()) {
                i13 = this.f7291n - D();
                i10 = i13 - this.f1219r.m(b10);
            } else {
                i10 = C();
                i13 = this.f1219r.m(b10) + i10;
            }
            if (uVar.f7374f == -1) {
                i11 = uVar.f7370b;
                i12 = i11 - tVar.f7364a;
            } else {
                i12 = uVar.f7370b;
                i11 = tVar.f7364a + i12;
            }
        } else {
            int E = E();
            int m5 = this.f1219r.m(b10) + E;
            if (uVar.f7374f == -1) {
                int i16 = uVar.f7370b;
                int i17 = i16 - tVar.f7364a;
                i13 = i16;
                i11 = m5;
                i10 = i17;
                i12 = E;
            } else {
                int i18 = uVar.f7370b;
                int i19 = tVar.f7364a + i18;
                i10 = i18;
                i11 = m5;
                i12 = E;
                i13 = i19;
            }
        }
        k0.L(b10, i10, i12, i13, i11);
        if (l0Var.c() || l0Var.b()) {
            tVar.f7366c = true;
        }
        tVar.f7367d = b10.hasFocusable();
    }

    public void U0(h hVar, w0 w0Var, x xVar, int i10) {
    }

    public final void V0(h hVar, u uVar) {
        if (uVar.f7369a && !uVar.f7380l) {
            int i10 = uVar.f7375g;
            int i11 = uVar.f7377i;
            if (uVar.f7374f == -1) {
                int v9 = v();
                if (i10 >= 0) {
                    int e10 = (this.f1219r.e() - i10) + i11;
                    if (this.f1222u) {
                        for (int i12 = 0; i12 < v9; i12++) {
                            View u9 = u(i12);
                            if (this.f1219r.d(u9) < e10 || this.f1219r.k(u9) < e10) {
                                W0(hVar, 0, i12);
                                return;
                            }
                        }
                        return;
                    }
                    int i13 = v9 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View u10 = u(i14);
                        if (this.f1219r.d(u10) < e10 || this.f1219r.k(u10) < e10) {
                            W0(hVar, i13, i14);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 >= 0) {
                int i15 = i10 - i11;
                int v10 = v();
                if (this.f1222u) {
                    int i16 = v10 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View u11 = u(i17);
                        if (this.f1219r.b(u11) > i15 || this.f1219r.j(u11) > i15) {
                            W0(hVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                for (int i18 = 0; i18 < v10; i18++) {
                    View u12 = u(i18);
                    if (this.f1219r.b(u12) > i15 || this.f1219r.j(u12) > i15) {
                        W0(hVar, 0, i18);
                        return;
                    }
                }
            }
        }
    }

    public final void W0(h hVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View u9 = u(i10);
                i0(i10);
                hVar.i(u9);
                i10--;
            }
            return;
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                View u10 = u(i11);
                i0(i11);
                hVar.i(u10);
            } else {
                return;
            }
        }
    }

    public final void X0() {
        if (this.f1217p != 1 && S0()) {
            this.f1222u = !this.f1221t;
        } else {
            this.f1222u = this.f1221t;
        }
    }

    public final int Y0(int i10, h hVar, w0 w0Var) {
        int i11;
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        F0();
        this.f1218q.f7369a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        b1(i11, abs, true, w0Var);
        u uVar = this.f1218q;
        int G0 = G0(hVar, uVar, w0Var, false) + uVar.f7375g;
        if (G0 < 0) {
            return 0;
        }
        if (abs > G0) {
            i10 = i11 * G0;
        }
        this.f1219r.l(-i10);
        this.f1218q.f7378j = i10;
        return i10;
    }

    public final void Z0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a3.g.n("invalid orientation:", i10));
        }
        c(null);
        if (i10 != this.f1217p || this.f1219r == null) {
            y a10 = z.a(this, i10);
            this.f1219r = a10;
            this.A.f4980f = a10;
            this.f1217p = i10;
            k0();
        }
    }

    @Override // m3.v0
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        boolean z9 = false;
        int i11 = 1;
        if (i10 < k0.F(u(0))) {
            z9 = true;
        }
        if (z9 != this.f1222u) {
            i11 = -1;
        }
        if (this.f1217p == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0234  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // m3.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a0(a3.h r18, m3.w0 r19) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.a0(a3.h, m3.w0):void");
    }

    public void a1(boolean z9) {
        c(null);
        if (this.f1223v == z9) {
            return;
        }
        this.f1223v = z9;
        k0();
    }

    @Override // m3.k0
    public void b0(w0 w0Var) {
        this.f1227z = null;
        this.f1225x = -1;
        this.f1226y = Integer.MIN_VALUE;
        this.A.f();
    }

    public final void b1(int i10, int i11, boolean z9, w0 w0Var) {
        boolean z10;
        int i12;
        int h10;
        int B;
        u uVar = this.f1218q;
        int i13 = 1;
        boolean z11 = false;
        if (this.f1219r.g() == 0 && this.f1219r.e() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        uVar.f7380l = z10;
        this.f1218q.f7374f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(w0Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i10 == 1) {
            z11 = true;
        }
        u uVar2 = this.f1218q;
        if (z11) {
            i12 = max2;
        } else {
            i12 = max;
        }
        uVar2.f7376h = i12;
        if (!z11) {
            max = max2;
        }
        uVar2.f7377i = max;
        if (z11) {
            y yVar = this.f1219r;
            int i14 = yVar.f7423d;
            k0 k0Var = yVar.f7424a;
            switch (i14) {
                case 0:
                    B = k0Var.D();
                    break;
                default:
                    B = k0Var.B();
                    break;
            }
            uVar2.f7376h = B + i12;
            View Q0 = Q0();
            u uVar3 = this.f1218q;
            if (this.f1222u) {
                i13 = -1;
            }
            uVar3.f7373e = i13;
            int F = k0.F(Q0);
            u uVar4 = this.f1218q;
            uVar3.f7372d = F + uVar4.f7373e;
            uVar4.f7370b = this.f1219r.b(Q0);
            h10 = this.f1219r.b(Q0) - this.f1219r.f();
        } else {
            View R0 = R0();
            u uVar5 = this.f1218q;
            uVar5.f7376h = this.f1219r.h() + uVar5.f7376h;
            u uVar6 = this.f1218q;
            if (!this.f1222u) {
                i13 = -1;
            }
            uVar6.f7373e = i13;
            int F2 = k0.F(R0);
            u uVar7 = this.f1218q;
            uVar6.f7372d = F2 + uVar7.f7373e;
            uVar7.f7370b = this.f1219r.d(R0);
            h10 = (-this.f1219r.d(R0)) + this.f1219r.h();
        }
        u uVar8 = this.f1218q;
        uVar8.f7371c = i11;
        if (z9) {
            uVar8.f7371c = i11 - h10;
        }
        uVar8.f7375g = h10;
    }

    @Override // m3.k0
    public final void c(String str) {
        if (this.f1227z == null) {
            super.c(str);
        }
    }

    @Override // m3.k0
    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof v) {
            v vVar = (v) parcelable;
            this.f1227z = vVar;
            if (this.f1225x != -1) {
                vVar.f7388a = -1;
            }
            k0();
        }
    }

    public final void c1(int i10, int i11) {
        int i12;
        this.f1218q.f7371c = this.f1219r.f() - i11;
        u uVar = this.f1218q;
        if (this.f1222u) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        uVar.f7373e = i12;
        uVar.f7372d = i10;
        uVar.f7374f = 1;
        uVar.f7370b = i11;
        uVar.f7375g = Integer.MIN_VALUE;
    }

    @Override // m3.k0
    public final boolean d() {
        if (this.f1217p == 0) {
            return true;
        }
        return false;
    }

    @Override // m3.k0
    public final Parcelable d0() {
        v vVar = this.f1227z;
        if (vVar != null) {
            return new v(vVar);
        }
        v vVar2 = new v();
        if (v() > 0) {
            F0();
            boolean z9 = this.f1220s ^ this.f1222u;
            vVar2.f7390c = z9;
            if (z9) {
                View Q0 = Q0();
                vVar2.f7389b = this.f1219r.f() - this.f1219r.b(Q0);
                vVar2.f7388a = k0.F(Q0);
            } else {
                View R0 = R0();
                vVar2.f7388a = k0.F(R0);
                vVar2.f7389b = this.f1219r.d(R0) - this.f1219r.h();
            }
        } else {
            vVar2.f7388a = -1;
        }
        return vVar2;
    }

    public final void d1(int i10, int i11) {
        int i12;
        this.f1218q.f7371c = i11 - this.f1219r.h();
        u uVar = this.f1218q;
        uVar.f7372d = i10;
        if (this.f1222u) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        uVar.f7373e = i12;
        uVar.f7374f = -1;
        uVar.f7370b = i11;
        uVar.f7375g = Integer.MIN_VALUE;
    }

    @Override // m3.k0
    public final boolean e() {
        if (this.f1217p == 1) {
            return true;
        }
        return false;
    }

    @Override // m3.k0
    public final void h(int i10, int i11, w0 w0Var, g gVar) {
        int i12;
        if (this.f1217p != 0) {
            i10 = i11;
        }
        if (v() != 0 && i10 != 0) {
            F0();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            b1(i12, Math.abs(i10), true, w0Var);
            A0(w0Var, this.f1218q, gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // m3.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r7, n.g r8) {
        /*
            r6 = this;
            m3.v r0 = r6.f1227z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f7388a
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f7390c
            goto L22
        L13:
            r6.X0()
            boolean r0 = r6.f1222u
            int r4 = r6.f1225x
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.C
            if (r0 >= r2) goto L35
            if (r4 < 0) goto L35
            if (r4 >= r7) goto L35
            r8.b(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i(int, n.g):void");
    }

    @Override // m3.k0
    public final int j(w0 w0Var) {
        return B0(w0Var);
    }

    @Override // m3.k0
    public int k(w0 w0Var) {
        return C0(w0Var);
    }

    @Override // m3.k0
    public int l(w0 w0Var) {
        return D0(w0Var);
    }

    @Override // m3.k0
    public int l0(int i10, h hVar, w0 w0Var) {
        if (this.f1217p == 1) {
            return 0;
        }
        return Y0(i10, hVar, w0Var);
    }

    @Override // m3.k0
    public final int m(w0 w0Var) {
        return B0(w0Var);
    }

    @Override // m3.k0
    public final void m0(int i10) {
        this.f1225x = i10;
        this.f1226y = Integer.MIN_VALUE;
        v vVar = this.f1227z;
        if (vVar != null) {
            vVar.f7388a = -1;
        }
        k0();
    }

    @Override // m3.k0
    public int n(w0 w0Var) {
        return C0(w0Var);
    }

    @Override // m3.k0
    public int n0(int i10, h hVar, w0 w0Var) {
        if (this.f1217p == 0) {
            return 0;
        }
        return Y0(i10, hVar, w0Var);
    }

    @Override // m3.k0
    public int o(w0 w0Var) {
        return D0(w0Var);
    }

    @Override // m3.k0
    public final View q(int i10) {
        int v9 = v();
        if (v9 == 0) {
            return null;
        }
        int F = i10 - k0.F(u(0));
        if (F >= 0 && F < v9) {
            View u9 = u(F);
            if (k0.F(u9) == i10) {
                return u9;
            }
        }
        return super.q(i10);
    }

    @Override // m3.k0
    public l0 r() {
        return new l0(-2, -2);
    }

    @Override // m3.k0
    public final boolean u0() {
        boolean z9;
        if (this.f7290m == 1073741824 || this.f7289l == 1073741824) {
            return false;
        }
        int v9 = v();
        int i10 = 0;
        while (true) {
            if (i10 < v9) {
                ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z9 = true;
                    break;
                }
                i10++;
            } else {
                z9 = false;
                break;
            }
        }
        if (!z9) {
            return false;
        }
        return true;
    }

    @Override // m3.k0
    public void w0(RecyclerView recyclerView, int i10) {
        w wVar = new w(recyclerView.getContext());
        wVar.f7391a = i10;
        x0(wVar);
    }

    @Override // m3.k0
    public boolean y0() {
        if (this.f1227z == null && this.f1220s == this.f1223v) {
            return true;
        }
        return false;
    }

    public void z0(w0 w0Var, int[] iArr) {
        boolean z9;
        int i10;
        int i11;
        if (w0Var.f7406a != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = this.f1219r.i();
        } else {
            i10 = 0;
        }
        if (this.f1218q.f7374f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1217p = 1;
        this.f1221t = false;
        this.f1222u = false;
        this.f1223v = false;
        this.f1224w = true;
        this.f1225x = -1;
        this.f1226y = Integer.MIN_VALUE;
        this.f1227z = null;
        this.A = new x();
        this.B = new t();
        this.C = 2;
        this.D = new int[2];
        j0 G = k0.G(context, attributeSet, i10, i11);
        Z0(G.f7266a);
        boolean z9 = G.f7268c;
        c(null);
        if (z9 != this.f1221t) {
            this.f1221t = z9;
            k0();
        }
        a1(G.f7269d);
    }
}
