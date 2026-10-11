package defpackage;

import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ic6 {
    public final l33 a;
    public o96 b;
    public final ti4 c;
    public final ti4 d;
    public final ti4 e;
    public final ti4 f;
    public final fq3 g;
    public final z44 h;

    public ic6(String str, long j, l33 l33Var) {
        this.a = l33Var;
        this.b = new o96(new p96(str, fy5.b(str.length(), j), null, null, null, null, null, 124), null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.c = xt5.g(bool);
        this.d = xt5.g(new p96(str, j, null, null, null, null, null, 124));
        this.e = xt5.g(bool);
        this.f = xt5.g(bool);
        this.g = new fq3((Object) this, (byte) 15);
        this.h = new z44(new jf[16], 0);
    }

    public final void a(o96 o96Var) {
        boolean z;
        if (((z44) o96Var.a().y).z > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean c = nd6.c(o96Var.C, this.b.C);
        boolean i = a34.i(o96Var.z, this.b.z);
        if (z) {
            d(c(), o96.h(o96Var, 0L, null, 15), o96Var.a(), ia6.y);
        }
        p96 h = o96.h(this.b, 0L, null, 15);
        if (!z && i) {
            if (!c) {
                o96 o96Var2 = this.b;
                long j = o96Var.C;
                int i2 = nd6.c;
                o96Var2.g(fy5.a((int) (j >> 32), (int) (j & 4294967295L)));
            }
        } else {
            this.b = new o96(new p96(o96Var.y.toString(), o96Var.C, null, null, null, null, yu5.h(o96Var), 60), null, null, 14);
        }
        if (z || !c || !a34.i(h.C, o96Var.D)) {
            this.b.f(null);
        }
        h(h, o96.h(this.b, 0L, null, 15), true);
    }

    public final void b(boolean z, ia6 ia6Var) {
        boolean z2;
        p96 c = c();
        if (((z44) this.b.a().y).z == 0 && nd6.c(c.B, this.b.C)) {
            if (a34.i(c.C, this.b.D) && a34.i(c.D, this.b.F) && a34.i(c.x, this.b.E)) {
                return;
            }
            p96 c2 = c();
            String kk0Var = this.b.y.toString();
            o96 o96Var = this.b;
            long j = o96Var.C;
            nd6 nd6Var = o96Var.D;
            h(c2, new p96(kk0Var, j, nd6Var, o96Var.F, yu5.e(nd6Var, o96Var.E), null, c.z, 32), z);
            return;
        }
        boolean z3 = false;
        if (((z44) this.b.a().y).z != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String kk0Var2 = this.b.y.toString();
        o96 o96Var2 = this.b;
        long j2 = o96Var2.C;
        nd6 nd6Var2 = o96Var2.D;
        p96 p96Var = new p96(kk0Var2, j2, nd6Var2, o96Var2.F, yu5.e(nd6Var2, o96Var2.E), null, yu5.h(this.b), 32);
        if (z2 && z) {
            z3 = true;
        }
        h(c, p96Var, z3);
        d(c, p96Var, this.b.a(), ia6Var);
    }

    public final p96 c() {
        return (p96) this.d.getValue();
    }

    public final void d(p96 p96Var, p96 p96Var2, pz2 pz2Var, ia6 ia6Var) {
        int ordinal = ia6Var.ordinal();
        l33 l33Var = this.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    fz5.l(l33Var, p96Var, p96Var2, pz2Var, false);
                    return;
                } else {
                    ze0.l();
                    return;
                }
            }
            ((ti4) l33Var.z).setValue(null);
            hn6 hn6Var = (hn6) l33Var.y;
            hn6Var.b.clear();
            hn6Var.c.clear();
            return;
        }
        fz5.l(l33Var, p96Var, p96Var2, pz2Var, true);
    }

    public final void e(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final o96 g() {
        ub2 ub2Var;
        ti4 ti4Var = this.c;
        ft5 b = et5.b();
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ft5 e = et5.e(b);
        try {
            if (((Boolean) ti4Var.getValue()).booleanValue()) {
                hz2.c("TextFieldState does not support concurrent or nested editing.");
            }
            ti4Var.setValue(Boolean.TRUE);
            return new o96(c(), null, null, 14);
        } finally {
            et5.k(b, e, ub2Var);
        }
    }

    public final void h(p96 p96Var, p96 p96Var2, boolean z) {
        boolean z2;
        int i;
        this.d.setValue(p96Var2);
        z44 z44Var = this.h;
        Object[] objArr = z44Var.x;
        int i2 = z44Var.z;
        for (int i3 = 0; i3 < i2; i3++) {
            jf jfVar = (jf) objArr[i3];
            if (z && !b06.y(p96Var.A, p96Var2) && p96Var.C != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            rt3 rt3Var = jfVar.a;
            long j = p96Var.B;
            nd6 nd6Var = p96Var.C;
            long j2 = p96Var2.B;
            nd6 nd6Var2 = p96Var2.C;
            if (z2) {
                rt3Var.E().restartInput((View) rt3Var.y);
            } else if (!nd6.c(j, j2) || !a34.i(nd6Var, nd6Var2)) {
                int g = nd6.g(j2);
                int f = nd6.f(j2);
                int i4 = -1;
                if (nd6Var2 != null) {
                    i = nd6.g(nd6Var2.a);
                } else {
                    i = -1;
                }
                if (nd6Var2 != null) {
                    i4 = nd6.f(nd6Var2.a);
                }
                rt3Var.E().updateSelection((View) rt3Var.y, g, f, i, i4);
            }
        }
        f(false);
    }

    public final String toString() {
        ub2 ub2Var;
        ft5 b = et5.b();
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ft5 e = et5.e(b);
        try {
            return "TextFieldState(selection=" + nd6.i(c().B) + ", text=\"" + ((Object) c().A) + "\")";
        } finally {
            et5.k(b, e, ub2Var);
        }
    }
}
