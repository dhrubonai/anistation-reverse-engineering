package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xk2 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ yk2 y;

    public /* synthetic */ xk2(yk2 yk2Var, byte b) {
        this.x = b;
        this.y = yk2Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        yk2 yk2Var = this.y;
        switch (b) {
            case 0:
                ll6 ll6Var = yk2Var.S;
                if (ll6Var != null) {
                    ll6Var.getValue();
                    return pn6Var;
                }
                throw qx1.e("Font resolution state is not set.");
            default:
                ll6 ll6Var2 = yk2Var.S;
                if (ll6Var2 != null) {
                    ll6Var2.getValue();
                    return pn6Var;
                }
                throw qx1.e("Font resolution state is not set.");
        }
    }
}
