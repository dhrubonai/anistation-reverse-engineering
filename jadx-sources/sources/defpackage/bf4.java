package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bf4 extends fg4 {
    public static final bf4 c = new fg4(0, 2, 1);

    @Override // defpackage.fg4
    public final void a(fm0 fm0Var, nr nrVar, bs5 bs5Var, b25 b25Var, gg4 gg4Var) {
        int i;
        int E;
        h13 h13Var = (h13) fm0Var.h(0);
        int c2 = bs5Var.c((ed2) fm0Var.h(1));
        if (bs5Var.t >= c2) {
            eu0.a("Check failed");
        }
        h41.O(bs5Var, nrVar, c2);
        int i2 = bs5Var.t;
        int i3 = bs5Var.v;
        while (i3 >= 0 && !bs5Var.x(i3)) {
            i3 = bs5Var.F(bs5Var.b, i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (bs5Var.u(i2, i4)) {
                if (bs5Var.x(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                if (bs5Var.x(i4)) {
                    E = 1;
                } else {
                    E = bs5Var.E(i4);
                }
                i5 += E;
                i4 += bs5Var.t(i4);
            }
        }
        while (true) {
            i = bs5Var.t;
            if (i >= c2) {
                break;
            }
            if (bs5Var.u(c2, i)) {
                int i6 = bs5Var.t;
                if (i6 < bs5Var.u && (bs5Var.b[(bs5Var.q(i6) * 5) + 1] & 1073741824) != 0) {
                    nrVar.j(bs5Var.D(bs5Var.t));
                    i5 = 0;
                }
                bs5Var.Q();
            } else {
                i5 += bs5Var.M();
            }
        }
        if (i != c2) {
            eu0.a("Check failed");
        }
        h13Var.a = i5;
    }
}
