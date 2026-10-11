package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uc6 implements jn4 {
    public final View a;
    public final dn0 b;
    public final ba c;
    public boolean d;
    public ub2 e;
    public ub2 f;
    public mc6 g;
    public yv2 h;
    public final ArrayList i;
    public final rb3 j;
    public Rect k;
    public final g31 l;
    public final z44 m;
    public a92 n;

    public uc6(View view, oa oaVar, ba baVar) {
        dn0 dn0Var = new dn0(view);
        this.a = view;
        this.b = dn0Var;
        this.c = baVar;
        this.e = new ka6((byte) 7);
        this.f = new ka6((byte) 8);
        this.g = new mc6(nd6.b, 4, "");
        this.h = yv2.g;
        this.i = new ArrayList();
        this.j = bx7.B(jf3.z, new e96(this, (byte) 2));
        this.l = new g31(oaVar, dn0Var);
        this.m = new z44(new tc6[16], 0);
    }

    @Override // defpackage.jn4
    public final void a(mc6 mc6Var, yv2 yv2Var, bg bgVar, r01 r01Var) {
        this.d = true;
        this.g = mc6Var;
        this.h = yv2Var;
        this.e = bgVar;
        this.f = r01Var;
        i(tc6.x);
    }

    @Override // defpackage.jn4
    public final void b() {
        i(tc6.x);
    }

    @Override // defpackage.jn4
    public final void c() {
        i(tc6.z);
    }

    @Override // defpackage.jn4
    public final void d() {
        this.d = false;
        this.e = new ka6((byte) 5);
        this.f = new ka6((byte) 6);
        this.k = null;
        i(tc6.y);
    }

    @Override // defpackage.jn4
    public final void e(mc6 mc6Var, mc6 mc6Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (nd6.c(this.g.b, mc6Var2.b) && a34.i(this.g.c, mc6Var2.c)) {
            z = false;
        } else {
            z = true;
        }
        this.g = mc6Var2;
        int size = this.i.size();
        for (int i4 = 0; i4 < size; i4++) {
            j05 j05Var = (j05) ((WeakReference) this.i.get(i4)).get();
            if (j05Var != null) {
                j05Var.d = mc6Var2;
            }
        }
        g31 g31Var = this.l;
        synchronized (g31Var.c) {
            g31Var.j = null;
            g31Var.l = null;
            g31Var.k = null;
            g31Var.m = xd.A;
            g31Var.n = null;
            g31Var.o = null;
        }
        int i5 = -1;
        if (a34.i(mc6Var, mc6Var2)) {
            if (z) {
                dn0 dn0Var = this.b;
                int g = nd6.g(mc6Var2.b);
                int f = nd6.f(mc6Var2.b);
                nd6 nd6Var = this.g.c;
                if (nd6Var != null) {
                    i3 = nd6.g(nd6Var.a);
                } else {
                    i3 = -1;
                }
                nd6 nd6Var2 = this.g.c;
                if (nd6Var2 != null) {
                    i5 = nd6.f(nd6Var2.a);
                }
                ((InputMethodManager) ((rb3) dn0Var.z).getValue()).updateSelection((View) dn0Var.y, g, f, i3, i5);
                return;
            }
            return;
        }
        if (mc6Var != null && (!a34.i(mc6Var.a.y, mc6Var2.a.y) || (nd6.c(mc6Var.b, mc6Var2.b) && !a34.i(mc6Var.c, mc6Var2.c)))) {
            dn0 dn0Var2 = this.b;
            ((InputMethodManager) ((rb3) dn0Var2.z).getValue()).restartInput((View) dn0Var2.y);
            return;
        }
        int size2 = this.i.size();
        for (int i6 = 0; i6 < size2; i6++) {
            j05 j05Var2 = (j05) ((WeakReference) this.i.get(i6)).get();
            if (j05Var2 != null) {
                mc6 mc6Var3 = this.g;
                dn0 dn0Var3 = this.b;
                if (j05Var2.h) {
                    j05Var2.d = mc6Var3;
                    if (j05Var2.f) {
                        ((InputMethodManager) ((rb3) dn0Var3.z).getValue()).updateExtractedText((View) dn0Var3.y, j05Var2.e, v94.Q(mc6Var3));
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
                    ((InputMethodManager) ((rb3) dn0Var3.z).getValue()).updateSelection((View) dn0Var3.y, nd6.g(j), nd6.f(j), i, i2);
                }
            }
        }
    }

    @Override // defpackage.jn4
    public final void f() {
        i(tc6.A);
    }

    @Override // defpackage.jn4
    public final void g(n05 n05Var) {
        Rect rect;
        this.k = new Rect(io3.h0(n05Var.a), io3.h0(n05Var.b), io3.h0(n05Var.c), io3.h0(n05Var.d));
        if (this.i.isEmpty() && (rect = this.k) != null) {
            this.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.jn4
    public final void h(mc6 mc6Var, h12 h12Var, bd6 bd6Var, yd ydVar, n05 n05Var, n05 n05Var2) {
        g31 g31Var = this.l;
        synchronized (g31Var.c) {
            try {
                g31Var.j = mc6Var;
                g31Var.l = h12Var;
                g31Var.k = bd6Var;
                g31Var.m = ydVar;
                g31Var.n = n05Var;
                g31Var.o = n05Var2;
                if (!g31Var.e) {
                    if (g31Var.d) {
                    }
                }
                g31Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(tc6 tc6Var) {
        this.m.b(tc6Var);
        if (this.n == null) {
            a92 a92Var = new a92(this, (byte) 26);
            this.c.execute(a92Var);
            this.n = a92Var;
        }
    }
}
