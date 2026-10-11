package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wh4 extends xz3 implements ra3 {
    public th4 L;

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float b = this.L.b(xo3Var.getLayoutDirection());
        float d = this.L.d();
        float c = this.L.c(xo3Var.getLayoutDirection());
        float a = this.L.a();
        boolean z4 = false;
        if (vm1.b(b, 0.0f) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (vm1.b(d, 0.0f) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (vm1.b(c, 0.0f) >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (vm1.b(a, 0.0f) >= 0) {
            z4 = true;
        }
        if (!(z6 & z4)) {
            cz2.a("Padding must be non-negative");
        }
        int x0 = xo3Var.x0(b);
        int x02 = xo3Var.x0(c) + x0;
        int x03 = xo3Var.x0(d);
        int x04 = xo3Var.x0(a) + x03;
        em4 p = ro3Var.p(sx0.i(-x02, j, -x04));
        return xo3Var.L(sx0.g(p.x + x02, j), sx0.f(p.y + x04, j), ot1.x, new e03(p, x0, x03, (byte) 2));
    }
}
