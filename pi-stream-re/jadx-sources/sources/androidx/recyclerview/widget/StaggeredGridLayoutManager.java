package androidx.recyclerview.widget;

import a3.h;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.f;
import g0.h0;
import g0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import m3.f1;
import m3.g1;
import m3.i1;
import m3.j0;
import m3.j1;
import m3.k;
import m3.k0;
import m3.l0;
import m3.m1;
import m3.s;
import m3.v0;
import m3.w;
import m3.w0;
import m3.z;
import n.g;
import p7.a0;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends k0 implements v0 {
    public final m1 B;
    public final int C;
    public boolean D;
    public boolean E;
    public i1 F;
    public final Rect G;
    public final f1 H;
    public final boolean I;
    public int[] J;
    public final k K;

    /* renamed from: p, reason: collision with root package name */
    public int f1263p;

    /* renamed from: q, reason: collision with root package name */
    public j1[] f1264q;

    /* renamed from: r, reason: collision with root package name */
    public z f1265r;

    /* renamed from: s, reason: collision with root package name */
    public z f1266s;

    /* renamed from: t, reason: collision with root package name */
    public int f1267t;

    /* renamed from: u, reason: collision with root package name */
    public int f1268u;

    /* renamed from: v, reason: collision with root package name */
    public final s f1269v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1270w;

    /* renamed from: y, reason: collision with root package name */
    public BitSet f1272y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1271x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1273z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1263p = -1;
        this.f1270w = false;
        m1 m1Var = new m1(1);
        this.B = m1Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new f1(this);
        this.I = true;
        this.K = new k(this, 1);
        j0 G = k0.G(context, attributeSet, i10, i11);
        int i12 = G.f7266a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f1267t) {
            this.f1267t = i12;
            z zVar = this.f1265r;
            this.f1265r = this.f1266s;
            this.f1266s = zVar;
            k0();
        }
        int i13 = G.f7267b;
        c(null);
        if (i13 != this.f1263p) {
            m1Var.d();
            k0();
            this.f1263p = i13;
            this.f1272y = new BitSet(this.f1263p);
            this.f1264q = new j1[this.f1263p];
            for (int i14 = 0; i14 < this.f1263p; i14++) {
                this.f1264q[i14] = new j1(this, i14);
            }
            k0();
        }
        boolean z9 = G.f7268c;
        c(null);
        i1 i1Var = this.F;
        if (i1Var != null && i1Var.f7252y != z9) {
            i1Var.f7252y = z9;
        }
        this.f1270w = z9;
        k0();
        this.f1269v = new s();
        this.f1265r = z.a(this, this.f1267t);
        this.f1266s = z.a(this, 1 - this.f1267t);
    }

    public static int c1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    public final boolean A0() {
        int J0;
        if (v() != 0 && this.C != 0 && this.f7284g) {
            if (this.f1271x) {
                J0 = K0();
                J0();
            } else {
                J0 = J0();
                K0();
            }
            if (J0 == 0 && O0() != null) {
                this.B.d();
                this.f7283f = true;
                k0();
                return true;
            }
        }
        return false;
    }

    public final int B0(w0 w0Var) {
        if (v() == 0) {
            return 0;
        }
        z zVar = this.f1265r;
        boolean z9 = this.I;
        return a0.f(w0Var, zVar, G0(!z9), F0(!z9), this, this.I);
    }

    public final int C0(w0 w0Var) {
        if (v() == 0) {
            return 0;
        }
        z zVar = this.f1265r;
        boolean z9 = this.I;
        return a0.g(w0Var, zVar, G0(!z9), F0(!z9), this, this.I, this.f1271x);
    }

    public final int D0(w0 w0Var) {
        if (v() == 0) {
            return 0;
        }
        z zVar = this.f1265r;
        boolean z9 = this.I;
        return a0.h(w0Var, zVar, G0(!z9), F0(!z9), this, this.I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    public final int E0(h hVar, s sVar, w0 w0Var) {
        int i10;
        int h10;
        int i11;
        int L0;
        int i12;
        int i13;
        j1 j1Var;
        ?? r8;
        int i14;
        int c6;
        int h11;
        int c10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 0;
        int i20 = 1;
        this.f1272y.set(0, this.f1263p, true);
        s sVar2 = this.f1269v;
        if (sVar2.f7362i) {
            if (sVar.f7358e == 1) {
                i10 = f.API_PRIORITY_OTHER;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (sVar.f7358e == 1) {
            i10 = sVar.f7360g + sVar.f7355b;
        } else {
            i10 = sVar.f7359f - sVar.f7355b;
        }
        int i21 = sVar.f7358e;
        for (int i22 = 0; i22 < this.f1263p; i22++) {
            if (!this.f1264q[i22].f7270a.isEmpty()) {
                b1(this.f1264q[i22], i21, i10);
            }
        }
        if (this.f1271x) {
            h10 = this.f1265r.f();
        } else {
            h10 = this.f1265r.h();
        }
        boolean z9 = false;
        while (true) {
            int i23 = sVar.f7356c;
            if (i23 >= 0 && i23 < w0Var.b()) {
                i11 = i20;
            } else {
                i11 = i19;
            }
            if (i11 == 0 || (!sVar2.f7362i && this.f1272y.isEmpty())) {
                break;
            }
            View d10 = hVar.d(sVar.f7356c);
            sVar.f7356c += sVar.f7357d;
            g1 g1Var = (g1) d10.getLayoutParams();
            int a10 = g1Var.a();
            m1 m1Var = this.B;
            int[] iArr = (int[]) m1Var.f7306b;
            if (iArr != null && a10 < iArr.length) {
                i12 = iArr[a10];
            } else {
                i12 = -1;
            }
            if (i12 == -1) {
                i13 = i20;
            } else {
                i13 = i19;
            }
            if (i13 != 0) {
                if (S0(sVar.f7358e)) {
                    i18 = this.f1263p - i20;
                    i17 = -1;
                    i16 = -1;
                } else {
                    i16 = i20;
                    i17 = this.f1263p;
                    i18 = i19;
                }
                j1 j1Var2 = null;
                if (sVar.f7358e == i20) {
                    int h12 = this.f1265r.h();
                    int i24 = f.API_PRIORITY_OTHER;
                    while (i18 != i17) {
                        j1 j1Var3 = this.f1264q[i18];
                        int f10 = j1Var3.f(h12);
                        if (f10 < i24) {
                            i24 = f10;
                            j1Var2 = j1Var3;
                        }
                        i18 += i16;
                    }
                } else {
                    int f11 = this.f1265r.f();
                    int i25 = Integer.MIN_VALUE;
                    while (i18 != i17) {
                        j1 j1Var4 = this.f1264q[i18];
                        int i26 = j1Var4.i(f11);
                        if (i26 > i25) {
                            j1Var2 = j1Var4;
                            i25 = i26;
                        }
                        i18 += i16;
                    }
                }
                j1Var = j1Var2;
                m1Var.e(a10);
                ((int[]) m1Var.f7306b)[a10] = j1Var.f7274e;
            } else {
                j1Var = this.f1264q[i12];
            }
            g1Var.f7223e = j1Var;
            if (sVar.f7358e == 1) {
                r8 = 0;
                b(d10, -1, false);
            } else {
                r8 = 0;
                b(d10, 0, false);
            }
            if (this.f1267t == 1) {
                Q0(d10, k0.w(r8, this.f1268u, this.f7289l, r8, ((ViewGroup.MarginLayoutParams) g1Var).width), k0.w(true, this.o, this.f7290m, B() + E(), ((ViewGroup.MarginLayoutParams) g1Var).height), r8);
            } else {
                Q0(d10, k0.w(true, this.f7291n, this.f7289l, D() + C(), ((ViewGroup.MarginLayoutParams) g1Var).width), k0.w(false, this.f1268u, this.f7290m, 0, ((ViewGroup.MarginLayoutParams) g1Var).height), false);
            }
            if (sVar.f7358e == 1) {
                c6 = j1Var.f(h10);
                i14 = this.f1265r.c(d10) + c6;
            } else {
                i14 = j1Var.i(h10);
                c6 = i14 - this.f1265r.c(d10);
            }
            if (sVar.f7358e == 1) {
                j1 j1Var5 = g1Var.f7223e;
                j1Var5.getClass();
                g1 g1Var2 = (g1) d10.getLayoutParams();
                g1Var2.f7223e = j1Var5;
                ArrayList arrayList = j1Var5.f7270a;
                arrayList.add(d10);
                j1Var5.f7272c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    j1Var5.f7271b = Integer.MIN_VALUE;
                }
                if (g1Var2.c() || g1Var2.b()) {
                    j1Var5.f7273d = j1Var5.f7275f.f1265r.c(d10) + j1Var5.f7273d;
                }
            } else {
                j1 j1Var6 = g1Var.f7223e;
                j1Var6.getClass();
                g1 g1Var3 = (g1) d10.getLayoutParams();
                g1Var3.f7223e = j1Var6;
                ArrayList arrayList2 = j1Var6.f7270a;
                arrayList2.add(0, d10);
                j1Var6.f7271b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    j1Var6.f7272c = Integer.MIN_VALUE;
                }
                if (g1Var3.c() || g1Var3.b()) {
                    j1Var6.f7273d = j1Var6.f7275f.f1265r.c(d10) + j1Var6.f7273d;
                }
            }
            if (P0() && this.f1267t == 1) {
                c10 = this.f1266s.f() - (((this.f1263p - 1) - j1Var.f7274e) * this.f1268u);
                h11 = c10 - this.f1266s.c(d10);
            } else {
                h11 = this.f1266s.h() + (j1Var.f7274e * this.f1268u);
                c10 = this.f1266s.c(d10) + h11;
            }
            if (this.f1267t == 1) {
                k0.L(d10, h11, c6, c10, i14);
            } else {
                k0.L(d10, c6, h11, i14, c10);
            }
            b1(j1Var, sVar2.f7358e, i10);
            U0(hVar, sVar2);
            if (sVar2.f7361h && d10.hasFocusable()) {
                i15 = 0;
                this.f1272y.set(j1Var.f7274e, false);
            } else {
                i15 = 0;
            }
            i19 = i15;
            i20 = 1;
            z9 = true;
        }
        int i27 = i19;
        if (!z9) {
            U0(hVar, sVar2);
        }
        if (sVar2.f7358e == -1) {
            L0 = this.f1265r.h() - M0(this.f1265r.h());
        } else {
            L0 = L0(this.f1265r.f()) - this.f1265r.f();
        }
        if (L0 > 0) {
            return Math.min(sVar.f7355b, L0);
        }
        return i27;
    }

    public final View F0(boolean z9) {
        int h10 = this.f1265r.h();
        int f10 = this.f1265r.f();
        View view = null;
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            View u9 = u(v9);
            int d10 = this.f1265r.d(u9);
            int b10 = this.f1265r.b(u9);
            if (b10 > h10 && d10 < f10) {
                if (b10 > f10 && z9) {
                    if (view == null) {
                        view = u9;
                    }
                } else {
                    return u9;
                }
            }
        }
        return view;
    }

    public final View G0(boolean z9) {
        int h10 = this.f1265r.h();
        int f10 = this.f1265r.f();
        int v9 = v();
        View view = null;
        for (int i10 = 0; i10 < v9; i10++) {
            View u9 = u(i10);
            int d10 = this.f1265r.d(u9);
            if (this.f1265r.b(u9) > h10 && d10 < f10) {
                if (d10 < h10 && z9) {
                    if (view == null) {
                        view = u9;
                    }
                } else {
                    return u9;
                }
            }
        }
        return view;
    }

    public final void H0(h hVar, w0 w0Var, boolean z9) {
        int f10;
        int L0 = L0(Integer.MIN_VALUE);
        if (L0 != Integer.MIN_VALUE && (f10 = this.f1265r.f() - L0) > 0) {
            int i10 = f10 - (-Y0(-f10, hVar, w0Var));
            if (z9 && i10 > 0) {
                this.f1265r.l(i10);
            }
        }
    }

    public final void I0(h hVar, w0 w0Var, boolean z9) {
        int h10;
        int M0 = M0(f.API_PRIORITY_OTHER);
        if (M0 != Integer.MAX_VALUE && (h10 = M0 - this.f1265r.h()) > 0) {
            int Y0 = h10 - Y0(h10, hVar, w0Var);
            if (z9 && Y0 > 0) {
                this.f1265r.l(-Y0);
            }
        }
    }

    @Override // m3.k0
    public final boolean J() {
        if (this.C != 0) {
            return true;
        }
        return false;
    }

    public final int J0() {
        if (v() == 0) {
            return 0;
        }
        return k0.F(u(0));
    }

    public final int K0() {
        int v9 = v();
        if (v9 == 0) {
            return 0;
        }
        return k0.F(u(v9 - 1));
    }

    public final int L0(int i10) {
        int f10 = this.f1264q[0].f(i10);
        for (int i11 = 1; i11 < this.f1263p; i11++) {
            int f11 = this.f1264q[i11].f(i10);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    @Override // m3.k0
    public final void M(int i10) {
        super.M(i10);
        for (int i11 = 0; i11 < this.f1263p; i11++) {
            j1 j1Var = this.f1264q[i11];
            int i12 = j1Var.f7271b;
            if (i12 != Integer.MIN_VALUE) {
                j1Var.f7271b = i12 + i10;
            }
            int i13 = j1Var.f7272c;
            if (i13 != Integer.MIN_VALUE) {
                j1Var.f7272c = i13 + i10;
            }
        }
    }

    public final int M0(int i10) {
        int i11 = this.f1264q[0].i(i10);
        for (int i12 = 1; i12 < this.f1263p; i12++) {
            int i13 = this.f1264q[i12].i(i10);
            if (i13 < i11) {
                i11 = i13;
            }
        }
        return i11;
    }

    @Override // m3.k0
    public final void N(int i10) {
        super.N(i10);
        for (int i11 = 0; i11 < this.f1263p; i11++) {
            j1 j1Var = this.f1264q[i11];
            int i12 = j1Var.f7271b;
            if (i12 != Integer.MIN_VALUE) {
                j1Var.f7271b = i12 + i10;
            }
            int i13 = j1Var.f7272c;
            if (i13 != Integer.MIN_VALUE) {
                j1Var.f7272c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f1271x
            if (r0 == 0) goto L9
            int r0 = r7.K0()
            goto Ld
        L9:
            int r0 = r7.J0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            m3.m1 r4 = r7.B
            r4.g(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.j(r8, r5)
            r4.i(r9, r5)
            goto L39
        L32:
            r4.j(r8, r9)
            goto L39
        L36:
            r4.i(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f1271x
            if (r8 == 0) goto L45
            int r8 = r7.J0()
            goto L49
        L45:
            int r8 = r7.K0()
        L49:
            if (r3 > r8) goto L4e
            r7.k0()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0(int, int, int):void");
    }

    @Override // m3.k0
    public final void O() {
        this.B.d();
        for (int i10 = 0; i10 < this.f1263p; i10++) {
            this.f1264q[i10].b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d1, code lost:
    
        if (r10 == r11) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e3, code lost:
    
        if (r10 == r11) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View O0() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0():android.view.View");
    }

    @Override // m3.k0
    public final void P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7279b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f1263p; i10++) {
            this.f1264q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean P0() {
        if (A() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004a, code lost:
    
        if (r8.f1267t == 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x004f, code lost:
    
        if (r8.f1267t == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005d, code lost:
    
        if (P0() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0069, code lost:
    
        if (P0() == false) goto L54;
     */
    @Override // m3.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Q(android.view.View r9, int r10, a3.h r11, m3.w0 r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q(android.view.View, int, a3.h, m3.w0):android.view.View");
    }

    public final void Q0(View view, int i10, int i11, boolean z9) {
        RecyclerView recyclerView = this.f7279b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        g1 g1Var = (g1) view.getLayoutParams();
        int c12 = c1(i10, ((ViewGroup.MarginLayoutParams) g1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) g1Var).rightMargin + rect.right);
        int c13 = c1(i11, ((ViewGroup.MarginLayoutParams) g1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) g1Var).bottomMargin + rect.bottom);
        if (t0(view, c12, c13, g1Var)) {
            view.measure(c12, c13);
        }
    }

    @Override // m3.k0
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            View G0 = G0(false);
            View F0 = F0(false);
            if (G0 != null && F0 != null) {
                int F = k0.F(G0);
                int F2 = k0.F(F0);
                if (F < F2) {
                    accessibilityEvent.setFromIndex(F);
                    accessibilityEvent.setToIndex(F2);
                } else {
                    accessibilityEvent.setFromIndex(F2);
                    accessibilityEvent.setToIndex(F);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0408, code lost:
    
        if (A0() != false) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R0(a3.h r17, m3.w0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0(a3.h, m3.w0, boolean):void");
    }

    public final boolean S0(int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f1267t == 0) {
            if (i10 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != this.f1271x) {
                return true;
            }
            return false;
        }
        if (i10 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 == this.f1271x) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == P0()) {
            return true;
        }
        return false;
    }

    public final void T0(int i10, w0 w0Var) {
        int J0;
        int i11;
        if (i10 > 0) {
            J0 = K0();
            i11 = 1;
        } else {
            J0 = J0();
            i11 = -1;
        }
        s sVar = this.f1269v;
        sVar.f7354a = true;
        a1(J0, w0Var);
        Z0(i11);
        sVar.f7356c = J0 + sVar.f7357d;
        sVar.f7355b = Math.abs(i10);
    }

    public final void U0(h hVar, s sVar) {
        int min;
        int min2;
        if (sVar.f7354a && !sVar.f7362i) {
            if (sVar.f7355b == 0) {
                if (sVar.f7358e == -1) {
                    V0(sVar.f7360g, hVar);
                    return;
                } else {
                    W0(sVar.f7359f, hVar);
                    return;
                }
            }
            int i10 = 1;
            if (sVar.f7358e == -1) {
                int i11 = sVar.f7359f;
                int i12 = this.f1264q[0].i(i11);
                while (i10 < this.f1263p) {
                    int i13 = this.f1264q[i10].i(i11);
                    if (i13 > i12) {
                        i12 = i13;
                    }
                    i10++;
                }
                int i14 = i11 - i12;
                if (i14 < 0) {
                    min2 = sVar.f7360g;
                } else {
                    min2 = sVar.f7360g - Math.min(i14, sVar.f7355b);
                }
                V0(min2, hVar);
                return;
            }
            int i15 = sVar.f7360g;
            int f10 = this.f1264q[0].f(i15);
            while (i10 < this.f1263p) {
                int f11 = this.f1264q[i10].f(i15);
                if (f11 < f10) {
                    f10 = f11;
                }
                i10++;
            }
            int i16 = f10 - sVar.f7360g;
            if (i16 < 0) {
                min = sVar.f7359f;
            } else {
                min = Math.min(i16, sVar.f7355b) + sVar.f7359f;
            }
            W0(min, hVar);
        }
    }

    @Override // m3.k0
    public final void V(int i10, int i11) {
        N0(i10, i11, 1);
    }

    public final void V0(int i10, h hVar) {
        for (int v9 = v() - 1; v9 >= 0; v9--) {
            View u9 = u(v9);
            if (this.f1265r.d(u9) >= i10 && this.f1265r.k(u9) >= i10) {
                g1 g1Var = (g1) u9.getLayoutParams();
                g1Var.getClass();
                if (g1Var.f7223e.f7270a.size() == 1) {
                    return;
                }
                j1 j1Var = g1Var.f7223e;
                ArrayList arrayList = j1Var.f7270a;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                g1 h10 = j1.h(view);
                h10.f7223e = null;
                if (h10.c() || h10.b()) {
                    j1Var.f7273d -= j1Var.f7275f.f1265r.c(view);
                }
                if (size == 1) {
                    j1Var.f7271b = Integer.MIN_VALUE;
                }
                j1Var.f7272c = Integer.MIN_VALUE;
                h0(u9, hVar);
            } else {
                return;
            }
        }
    }

    @Override // m3.k0
    public final void W() {
        this.B.d();
        k0();
    }

    public final void W0(int i10, h hVar) {
        while (v() > 0) {
            View u9 = u(0);
            if (this.f1265r.b(u9) <= i10 && this.f1265r.j(u9) <= i10) {
                g1 g1Var = (g1) u9.getLayoutParams();
                g1Var.getClass();
                if (g1Var.f7223e.f7270a.size() == 1) {
                    return;
                }
                j1 j1Var = g1Var.f7223e;
                ArrayList arrayList = j1Var.f7270a;
                View view = (View) arrayList.remove(0);
                g1 h10 = j1.h(view);
                h10.f7223e = null;
                if (arrayList.size() == 0) {
                    j1Var.f7272c = Integer.MIN_VALUE;
                }
                if (h10.c() || h10.b()) {
                    j1Var.f7273d -= j1Var.f7275f.f1265r.c(view);
                }
                j1Var.f7271b = Integer.MIN_VALUE;
                h0(u9, hVar);
            } else {
                return;
            }
        }
    }

    @Override // m3.k0
    public final void X(int i10, int i11) {
        N0(i10, i11, 8);
    }

    public final void X0() {
        if (this.f1267t != 1 && P0()) {
            this.f1271x = !this.f1270w;
        } else {
            this.f1271x = this.f1270w;
        }
    }

    @Override // m3.k0
    public final void Y(int i10, int i11) {
        N0(i10, i11, 2);
    }

    public final int Y0(int i10, h hVar, w0 w0Var) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        T0(i10, w0Var);
        s sVar = this.f1269v;
        int E0 = E0(hVar, sVar, w0Var);
        if (sVar.f7355b >= E0) {
            if (i10 < 0) {
                i10 = -E0;
            } else {
                i10 = E0;
            }
        }
        this.f1265r.l(-i10);
        this.D = this.f1271x;
        sVar.f7355b = 0;
        U0(hVar, sVar);
        return i10;
    }

    @Override // m3.k0
    public final void Z(int i10, int i11) {
        N0(i10, i11, 4);
    }

    public final void Z0(int i10) {
        boolean z9;
        s sVar = this.f1269v;
        sVar.f7358e = i10;
        boolean z10 = this.f1271x;
        int i11 = 1;
        if (i10 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z10 != z9) {
            i11 = -1;
        }
        sVar.f7357d = i11;
    }

    @Override // m3.v0
    public final PointF a(int i10) {
        int z02 = z0(i10);
        PointF pointF = new PointF();
        if (z02 == 0) {
            return null;
        }
        if (this.f1267t == 0) {
            pointF.x = z02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = z02;
        }
        return pointF;
    }

    @Override // m3.k0
    public final void a0(h hVar, w0 w0Var) {
        R0(hVar, w0Var, true);
    }

    public final void a1(int i10, w0 w0Var) {
        boolean z9;
        int i11;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        s sVar = this.f1269v;
        boolean z12 = false;
        sVar.f7355b = 0;
        sVar.f7356c = i10;
        w wVar = this.f7282e;
        if (wVar != null && wVar.f7395e) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && (i13 = w0Var.f7406a) != -1) {
            boolean z13 = this.f1271x;
            if (i13 < i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z13 == z11) {
                i11 = this.f1265r.i();
                i12 = 0;
            } else {
                i12 = this.f1265r.i();
                i11 = 0;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        RecyclerView recyclerView = this.f7279b;
        if (recyclerView != null && recyclerView.f1259y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sVar.f7359f = this.f1265r.h() - i12;
            sVar.f7360g = this.f1265r.f() + i11;
        } else {
            sVar.f7360g = this.f1265r.e() + i11;
            sVar.f7359f = -i12;
        }
        sVar.f7361h = false;
        sVar.f7354a = true;
        if (this.f1265r.g() == 0 && this.f1265r.e() == 0) {
            z12 = true;
        }
        sVar.f7362i = z12;
    }

    @Override // m3.k0
    public final void b0(w0 w0Var) {
        this.f1273z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void b1(j1 j1Var, int i10, int i11) {
        int i12 = j1Var.f7273d;
        int i13 = j1Var.f7274e;
        if (i10 == -1) {
            int i14 = j1Var.f7271b;
            if (i14 == Integer.MIN_VALUE) {
                View view = (View) j1Var.f7270a.get(0);
                g1 h10 = j1.h(view);
                j1Var.f7271b = j1Var.f7275f.f1265r.d(view);
                h10.getClass();
                i14 = j1Var.f7271b;
            }
            if (i14 + i12 <= i11) {
                this.f1272y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = j1Var.f7272c;
        if (i15 == Integer.MIN_VALUE) {
            j1Var.a();
            i15 = j1Var.f7272c;
        }
        if (i15 - i12 >= i11) {
            this.f1272y.set(i13, false);
        }
    }

    @Override // m3.k0
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // m3.k0
    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof i1) {
            i1 i1Var = (i1) parcelable;
            this.F = i1Var;
            if (this.f1273z != -1) {
                i1Var.f7248d = null;
                i1Var.f7247c = 0;
                i1Var.f7245a = -1;
                i1Var.f7246b = -1;
                i1Var.f7248d = null;
                i1Var.f7247c = 0;
                i1Var.f7249e = 0;
                i1Var.f7250f = null;
                i1Var.f7251x = null;
            }
            k0();
        }
    }

    @Override // m3.k0
    public final boolean d() {
        if (this.f1267t == 0) {
            return true;
        }
        return false;
    }

    @Override // m3.k0
    public final Parcelable d0() {
        int J0;
        View G0;
        int i10;
        int h10;
        int[] iArr;
        i1 i1Var = this.F;
        if (i1Var != null) {
            return new i1(i1Var);
        }
        i1 i1Var2 = new i1();
        i1Var2.f7252y = this.f1270w;
        i1Var2.f7253z = this.D;
        i1Var2.A = this.E;
        m1 m1Var = this.B;
        if (m1Var != null && (iArr = (int[]) m1Var.f7306b) != null) {
            i1Var2.f7250f = iArr;
            i1Var2.f7249e = iArr.length;
            i1Var2.f7251x = (List) m1Var.f7307c;
        } else {
            i1Var2.f7249e = 0;
        }
        int i11 = -1;
        if (v() > 0) {
            if (this.D) {
                J0 = K0();
            } else {
                J0 = J0();
            }
            i1Var2.f7245a = J0;
            if (this.f1271x) {
                G0 = F0(true);
            } else {
                G0 = G0(true);
            }
            if (G0 != null) {
                i11 = k0.F(G0);
            }
            i1Var2.f7246b = i11;
            int i12 = this.f1263p;
            i1Var2.f7247c = i12;
            i1Var2.f7248d = new int[i12];
            for (int i13 = 0; i13 < this.f1263p; i13++) {
                if (this.D) {
                    i10 = this.f1264q[i13].f(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        h10 = this.f1265r.f();
                        i10 -= h10;
                        i1Var2.f7248d[i13] = i10;
                    } else {
                        i1Var2.f7248d[i13] = i10;
                    }
                } else {
                    i10 = this.f1264q[i13].i(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        h10 = this.f1265r.h();
                        i10 -= h10;
                        i1Var2.f7248d[i13] = i10;
                    } else {
                        i1Var2.f7248d[i13] = i10;
                    }
                }
            }
        } else {
            i1Var2.f7245a = -1;
            i1Var2.f7246b = -1;
            i1Var2.f7247c = 0;
        }
        return i1Var2;
    }

    @Override // m3.k0
    public final boolean e() {
        if (this.f1267t == 1) {
            return true;
        }
        return false;
    }

    @Override // m3.k0
    public final void e0(int i10) {
        if (i10 == 0) {
            A0();
        }
    }

    @Override // m3.k0
    public final boolean f(l0 l0Var) {
        return l0Var instanceof g1;
    }

    @Override // m3.k0
    public final void h(int i10, int i11, w0 w0Var, g gVar) {
        s sVar;
        boolean z9;
        int f10;
        int i12;
        if (this.f1267t != 0) {
            i10 = i11;
        }
        if (v() != 0 && i10 != 0) {
            T0(i10, w0Var);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1263p) {
                this.J = new int[this.f1263p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f1263p;
                sVar = this.f1269v;
                if (i13 >= i15) {
                    break;
                }
                if (sVar.f7357d == -1) {
                    f10 = sVar.f7359f;
                    i12 = this.f1264q[i13].i(f10);
                } else {
                    f10 = this.f1264q[i13].f(sVar.f7360g);
                    i12 = sVar.f7360g;
                }
                int i16 = f10 - i12;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.J, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = sVar.f7356c;
                if (i18 >= 0 && i18 < w0Var.b()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    gVar.b(sVar.f7356c, this.J[i17]);
                    sVar.f7356c += sVar.f7357d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // m3.k0
    public final int j(w0 w0Var) {
        return B0(w0Var);
    }

    @Override // m3.k0
    public final int k(w0 w0Var) {
        return C0(w0Var);
    }

    @Override // m3.k0
    public final int l(w0 w0Var) {
        return D0(w0Var);
    }

    @Override // m3.k0
    public final int l0(int i10, h hVar, w0 w0Var) {
        return Y0(i10, hVar, w0Var);
    }

    @Override // m3.k0
    public final int m(w0 w0Var) {
        return B0(w0Var);
    }

    @Override // m3.k0
    public final void m0(int i10) {
        i1 i1Var = this.F;
        if (i1Var != null && i1Var.f7245a != i10) {
            i1Var.f7248d = null;
            i1Var.f7247c = 0;
            i1Var.f7245a = -1;
            i1Var.f7246b = -1;
        }
        this.f1273z = i10;
        this.A = Integer.MIN_VALUE;
        k0();
    }

    @Override // m3.k0
    public final int n(w0 w0Var) {
        return C0(w0Var);
    }

    @Override // m3.k0
    public final int n0(int i10, h hVar, w0 w0Var) {
        return Y0(i10, hVar, w0Var);
    }

    @Override // m3.k0
    public final int o(w0 w0Var) {
        return D0(w0Var);
    }

    @Override // m3.k0
    public final void q0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        int D = D() + C();
        int B = B() + E();
        if (this.f1267t == 1) {
            int height = rect.height() + B;
            RecyclerView recyclerView = this.f7279b;
            WeakHashMap weakHashMap = y0.f4277a;
            g11 = k0.g(i11, height, h0.d(recyclerView));
            g10 = k0.g(i10, (this.f1268u * this.f1263p) + D, h0.e(this.f7279b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f7279b;
            WeakHashMap weakHashMap2 = y0.f4277a;
            g10 = k0.g(i10, width, h0.e(recyclerView2));
            g11 = k0.g(i11, (this.f1268u * this.f1263p) + B, h0.d(this.f7279b));
        }
        RecyclerView.g(this.f7279b, g10, g11);
    }

    @Override // m3.k0
    public final l0 r() {
        if (this.f1267t == 0) {
            return new g1(-2, -1);
        }
        return new g1(-1, -2);
    }

    @Override // m3.k0
    public final l0 s(Context context, AttributeSet attributeSet) {
        return new g1(context, attributeSet);
    }

    @Override // m3.k0
    public final l0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g1(layoutParams);
    }

    @Override // m3.k0
    public final void w0(RecyclerView recyclerView, int i10) {
        w wVar = new w(recyclerView.getContext());
        wVar.f7391a = i10;
        x0(wVar);
    }

    @Override // m3.k0
    public final boolean y0() {
        if (this.F == null) {
            return true;
        }
        return false;
    }

    public final int z0(int i10) {
        boolean z9;
        if (v() == 0) {
            if (!this.f1271x) {
                return -1;
            }
            return 1;
        }
        if (i10 < J0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != this.f1271x) {
            return -1;
        }
        return 1;
    }
}
