package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xb6 implements x42 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ cc6 y;

    public /* synthetic */ xb6(cc6 cc6Var, byte b) {
        this.x = b;
        this.y = cc6Var;
    }

    @Override // defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        bx5 bx5Var;
        byte b = this.x;
        cc6 cc6Var = this.y;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                cc6Var.w(false);
                cc6Var.x(be6.x);
                return pn6Var;
            default:
                if (((n05) obj) != null) {
                    cc6Var.d.a();
                } else {
                    f96 f96Var = cc6Var.d.a;
                    if (f96Var != null && (bx5Var = f96Var.R) != null) {
                        bx5Var.l(null);
                        f96Var.R = null;
                    }
                }
                return pn6Var;
        }
    }
}
