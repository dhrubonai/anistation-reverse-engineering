package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tc implements jn4 {
    public nf3 a;
    public bx5 b;
    public vf3 c;
    public in5 d;

    @Override // defpackage.jn4
    public final void a(mc6 mc6Var, yv2 yv2Var, bg bgVar, r01 r01Var) {
        j(new g5(mc6Var, this, yv2Var, bgVar, r01Var, (byte) 1));
    }

    @Override // defpackage.jn4
    public final void b() {
        j(null);
    }

    @Override // defpackage.jn4
    public final void c() {
        ou5 ou5Var;
        nf3 nf3Var = this.a;
        if (nf3Var != null && (ou5Var = (ou5) t80.C(nf3Var, bv0.q)) != null) {
            ((id1) ou5Var).b();
        }
    }

    @Override // defpackage.jn4
    public final void d() {
        bx5 bx5Var = this.b;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        this.b = null;
        t44 i = i();
        if (i != null) {
            ((in5) i).b();
        }
    }

    @Override // defpackage.jn4
    public final void e(mc6 mc6Var, mc6 mc6Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        vf3 vf3Var = this.c;
        if (vf3Var != null) {
            if (nd6.c(vf3Var.h.b, mc6Var2.b) && a34.i(vf3Var.h.c, mc6Var2.c)) {
                z = false;
            } else {
                z = true;
            }
            vf3Var.h = mc6Var2;
            int size = vf3Var.j.size();
            for (int i4 = 0; i4 < size; i4++) {
                k05 k05Var = (k05) ((WeakReference) vf3Var.j.get(i4)).get();
                if (k05Var != null) {
                    k05Var.g = mc6Var2;
                }
            }
            pf3 pf3Var = vf3Var.m;
            synchronized (pf3Var.c) {
                pf3Var.j = null;
                pf3Var.l = null;
                pf3Var.k = null;
                pf3Var.m = null;
                pf3Var.n = null;
            }
            int i5 = -1;
            if (a34.i(mc6Var, mc6Var2)) {
                if (z) {
                    pz2 pz2Var = vf3Var.b;
                    int g = nd6.g(mc6Var2.b);
                    int f = nd6.f(mc6Var2.b);
                    nd6 nd6Var = vf3Var.h.c;
                    if (nd6Var != null) {
                        i3 = nd6.g(nd6Var.a);
                    } else {
                        i3 = -1;
                    }
                    nd6 nd6Var2 = vf3Var.h.c;
                    if (nd6Var2 != null) {
                        i5 = nd6.f(nd6Var2.a);
                    }
                    pz2Var.u().updateSelection((View) pz2Var.y, g, f, i3, i5);
                    return;
                }
                return;
            }
            if (mc6Var != null && (!a34.i(mc6Var.a.y, mc6Var2.a.y) || (nd6.c(mc6Var.b, mc6Var2.b) && !a34.i(mc6Var.c, mc6Var2.c)))) {
                pz2 pz2Var2 = vf3Var.b;
                pz2Var2.u().restartInput((View) pz2Var2.y);
                return;
            }
            int size2 = vf3Var.j.size();
            for (int i6 = 0; i6 < size2; i6++) {
                k05 k05Var2 = (k05) ((WeakReference) vf3Var.j.get(i6)).get();
                if (k05Var2 != null) {
                    mc6 mc6Var3 = vf3Var.h;
                    pz2 pz2Var3 = vf3Var.b;
                    if (k05Var2.k) {
                        k05Var2.g = mc6Var3;
                        if (k05Var2.i) {
                            pz2Var3.u().updateExtractedText((View) pz2Var3.y, k05Var2.h, h41.f0(mc6Var3));
                        }
                        nd6 nd6Var3 = mc6Var3.c;
                        long j = mc6Var3.b;
                        if (nd6Var3 != null) {
                            i = nd6.g(nd6Var3.a);
                        } else {
                            i = -1;
                        }
                        nd6 nd6Var4 = mc6Var3.c;
                        if (nd6Var4 != null) {
                            i2 = nd6.f(nd6Var4.a);
                        } else {
                            i2 = -1;
                        }
                        pz2Var3.u().updateSelection((View) pz2Var3.y, nd6.g(j), nd6.f(j), i, i2);
                    }
                }
            }
        }
    }

    @Override // defpackage.jn4
    public final void f() {
        ou5 ou5Var;
        nf3 nf3Var = this.a;
        if (nf3Var != null && (ou5Var = (ou5) t80.C(nf3Var, bv0.q)) != null) {
            ((id1) ou5Var).a();
        }
    }

    @Override // defpackage.jn4
    public final void g(n05 n05Var) {
        Rect rect;
        vf3 vf3Var = this.c;
        if (vf3Var != null) {
            vf3Var.l = new Rect(io3.h0(n05Var.a), io3.h0(n05Var.b), io3.h0(n05Var.c), io3.h0(n05Var.d));
            if (vf3Var.j.isEmpty() && (rect = vf3Var.l) != null) {
                vf3Var.a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // defpackage.jn4
    public final void h(mc6 mc6Var, h12 h12Var, bd6 bd6Var, yd ydVar, n05 n05Var, n05 n05Var2) {
        vf3 vf3Var = this.c;
        if (vf3Var != null) {
            pf3 pf3Var = vf3Var.m;
            synchronized (pf3Var.c) {
                try {
                    pf3Var.j = mc6Var;
                    pf3Var.l = h12Var;
                    pf3Var.k = bd6Var;
                    pf3Var.m = n05Var;
                    pf3Var.n = n05Var2;
                    if (!pf3Var.e) {
                        if (pf3Var.d) {
                        }
                    }
                    pf3Var.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final t44 i() {
        in5 in5Var = this.d;
        if (in5Var != null) {
            return in5Var;
        }
        if (!o06.a) {
            return null;
        }
        in5 b = jn5.b(1, 0, ta0.z, 2);
        this.d = b;
        return b;
    }

    public final void j(g5 g5Var) {
        nf3 nf3Var = this.a;
        if (nf3Var == null) {
            return;
        }
        bx5 bx5Var = null;
        l5 l5Var = new l5(g5Var, this, nf3Var, bx5Var, (byte) 1);
        if (nf3Var.K) {
            bx5Var = tl7.z(nf3Var.O0(), null, y11.A, new e52(nf3Var, l5Var, bx5Var, (byte) 6), 1);
        }
        this.b = bx5Var;
    }

    public final void k(nf3 nf3Var) {
        nf3 nf3Var2 = this.a;
        if (nf3Var2 != nf3Var) {
            hz2.c("Expected textInputModifierNode to be " + nf3Var + " but was " + nf3Var2);
        }
        this.a = null;
    }
}
