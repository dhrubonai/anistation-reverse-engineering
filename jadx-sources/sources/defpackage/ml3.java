package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ml3 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ k96 y;

    public /* synthetic */ ml3(k96 k96Var, byte b) {
        this.x = b;
        this.y = k96Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        k96 k96Var = this.y;
        switch (b) {
            case 0:
                k96Var.a(((xc4) obj).a, l68.K);
                return pn6Var;
            case 1:
                uq4 uq4Var = (uq4) obj;
                k96Var.e(t80.h0(uq4Var, false));
                uq4Var.a();
                return pn6Var;
            default:
                uq4 uq4Var2 = (uq4) obj;
                k96Var.e(t80.h0(uq4Var2, false));
                uq4Var2.a();
                return pn6Var;
        }
    }
}
