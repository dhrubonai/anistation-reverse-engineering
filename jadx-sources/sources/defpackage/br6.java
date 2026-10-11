package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class br6 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ cr6 y;

    public /* synthetic */ br6(cr6 cr6Var, byte b) {
        this.x = b;
        this.y = cr6Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        cr6 cr6Var = this.y;
        switch (b) {
            case 0:
                cr6Var.d = true;
                cr6Var.f.invoke();
                return pn6Var;
            default:
                bp1 bp1Var = (bp1) obj;
                ni2 ni2Var = cr6Var.b;
                float f = cr6Var.k;
                float f2 = cr6Var.l;
                dn0 n0 = bp1Var.n0();
                long B = n0.B();
                n0.y().h();
                try {
                    ((af2) n0.y).r(f, f2, 0L);
                    ni2Var.a(bp1Var);
                    return pn6Var;
                } finally {
                    h11.u(n0, B);
                }
        }
    }
}
