package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p23 extends m23 {
    public l23 M;
    public boolean N;

    @Override // defpackage.m23
    public final long a1(ro3 ro3Var, long j) {
        int n;
        if (this.M == l23.x) {
            n = ro3Var.k(rx0.g(j));
        } else {
            n = ro3Var.n(rx0.g(j));
        }
        if (n < 0) {
            n = 0;
        }
        if (n < 0) {
            gz2.a("width must be >= 0");
        }
        return sx0.h(n, n, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.m23
    public final boolean b1() {
        return this.N;
    }

    @Override // defpackage.m23, defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        if (this.M == l23.x) {
            return ro3Var.k(i);
        }
        return ro3Var.n(i);
    }

    @Override // defpackage.m23, defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        if (this.M == l23.x) {
            return ro3Var.k(i);
        }
        return ro3Var.n(i);
    }
}
