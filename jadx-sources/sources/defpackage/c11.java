package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class c11 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ e11 y;

    public /* synthetic */ c11(e11 e11Var, byte b) {
        this.x = b;
        this.y = e11Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        e11 e11Var = this.y;
        switch (b) {
            case 0:
                wc7.L(e11Var);
                return pn6Var;
            case 1:
                e11Var.S.e(true);
                break;
            case 2:
                e11Var.S.a(true);
                break;
            case 3:
                e11Var.S.c();
                break;
            case 4:
                wc7.L(e11Var);
                return pn6Var;
            case 5:
                e11Var.S.o();
                break;
            case 6:
                r01 r01Var = e11Var.P.w;
                r01Var.y.r.F(e11Var.T.e);
                break;
            default:
                uf3 uf3Var = e11Var.P;
                w72 w72Var = e11Var.U;
                if (!uf3Var.b()) {
                    w72.a(w72Var);
                } else {
                    ou5 ou5Var = uf3Var.c;
                    if (ou5Var != null) {
                        ((id1) ou5Var).b();
                    }
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
