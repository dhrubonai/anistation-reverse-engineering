package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class z96 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ fa6 y;

    public /* synthetic */ z96(fa6 fa6Var, byte b) {
        this.x = b;
        this.y = fa6Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        byte b2 = 1;
        be6 be6Var = be6.z;
        vz0 vz0Var = null;
        pn6 pn6Var = pn6.a;
        fa6 fa6Var = this.y;
        switch (b) {
            case 0:
                tl7.z(fa6Var.O0(), null, null, new ca6(fa6Var, vz0Var, b2), 3);
                return Boolean.TRUE;
            case 1:
                fa6Var.a0 = (r47) t80.C(fa6Var, bv0.u);
                fa6Var.P.h = fa6Var.f1();
                if (fa6Var.f1() && fa6Var.b0 == null) {
                    fa6Var.b0 = tl7.z(fa6Var.O0(), null, null, new ca6(fa6Var, vz0Var, (byte) 4), 3);
                } else if (!fa6Var.f1()) {
                    bx5 bx5Var = fa6Var.b0;
                    if (bx5Var != null) {
                        bx5Var.l(null);
                    }
                    fa6Var.b0 = null;
                }
                return pn6Var;
            case 2:
                wc7.L(fa6Var);
                return pn6Var;
            case 3:
                wc7.L(fa6Var);
                return pn6Var;
            case 4:
                a34.f0(fa6Var);
                return null;
            case 5:
                a34.f0(fa6Var);
                return x96.a;
            case 6:
                tl7.z(fa6Var.O0(), null, null, new ca6(fa6Var, vz0Var, (byte) 2), 3);
                return Boolean.TRUE;
            case 7:
                return fa6Var.N.a.c().A.toString();
            case 8:
                if (!fa6Var.f1()) {
                    m82 m82Var = fa6Var.W;
                    if (m82Var.K) {
                        h82.j1(m82Var.S);
                    }
                } else {
                    ((id1) fa6Var.h1()).b();
                }
                return Boolean.TRUE;
            case 9:
                if (!fa6Var.f1()) {
                    m82 m82Var2 = fa6Var.W;
                    if (m82Var2.K) {
                        h82.j1(m82Var2.S);
                    }
                }
                fa6Var.P.x(be6Var);
                return Boolean.TRUE;
            case 10:
                tl7.z(fa6Var.O0(), null, null, new ca6(fa6Var, vz0Var, (byte) 0), 3);
                return Boolean.TRUE;
            case 11:
                if (fa6Var.e0 != null) {
                    ((id1) fa6Var.h1()).b();
                } else {
                    fa6Var.i1(true);
                }
                return pn6Var;
            default:
                fa6Var.P.x(be6Var);
                return pn6Var;
        }
    }
}
