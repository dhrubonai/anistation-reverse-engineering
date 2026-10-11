package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
final class gc6 extends d04 {
    public final xd6 x;

    public gc6(xd6 xd6Var) {
        this.x = xd6Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new hc6(this.x);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        hc6 hc6Var = (hc6) xz3Var;
        hc6Var.getClass();
        xd6 j = ez5.j(this.x, wc7.O(hc6Var).W);
        hc6Var.a1(j, (p82) t80.C(hc6Var, bv0.k));
        fc6 fc6Var = hc6Var.N;
        if (fc6Var != null) {
            fc6.a(fc6Var, null, null, j, 23);
            w65.E(hc6Var);
            return;
        }
        throw qx1.e("Min size state is not set.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc6)) {
            return false;
        }
        return a34.i(this.x, ((gc6) obj).x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
