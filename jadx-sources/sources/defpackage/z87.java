package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z87 extends xz3 implements ra3 {
    public tg1 L;
    public ic2 M;

    @Override // defpackage.ra3
    public final wo3 e(final xo3 xo3Var, ro3 ro3Var, long j) {
        int j2;
        int i = 0;
        if (this.L != tg1.x) {
            j2 = 0;
        } else {
            j2 = rx0.j(j);
        }
        if (this.L == tg1.y) {
            i = rx0.i(j);
        }
        final em4 p = ro3Var.p(sx0.a(j2, rx0.h(j), i, rx0.g(j)));
        final int C = db.C(p.x, rx0.j(j), rx0.h(j));
        final int C2 = db.C(p.y, rx0.i(j), rx0.g(j));
        return xo3Var.L(C, C2, ot1.x, new ub2() { // from class: y87
            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                ic2 ic2Var = z87.this.M;
                dm4.i((dm4) obj, p, ((c13) ic2Var.invoke(new k13(((C - r1.x) << 32) | ((C2 - r1.y) & 4294967295L)), xo3Var.getLayoutDirection())).a);
                return pn6.a;
            }
        });
    }
}
