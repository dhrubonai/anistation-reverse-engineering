package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class k40 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ cc6 y;

    public /* synthetic */ k40(cc6 cc6Var, byte b) {
        this.x = b;
        this.y = cc6Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        cc6 cc6Var = this.y;
        switch (b) {
            case 0:
                return new i5(cc6Var, (byte) 6);
            case 1:
                be6 be6Var = (be6) cc6Var.s.getValue();
                be6 be6Var2 = be6.y;
                if (be6Var == be6Var2) {
                    be6Var2 = be6.x;
                }
                cc6Var.x(be6Var2);
                return pn6Var;
            default:
                cc6Var.b();
                return pn6Var;
        }
    }
}
