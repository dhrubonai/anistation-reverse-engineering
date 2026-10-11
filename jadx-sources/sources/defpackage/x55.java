package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class x55 implements ui1 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ b65 y;

    public /* synthetic */ x55(b65 b65Var, byte b) {
        this.x = b;
        this.y = b65Var;
    }

    @Override // defpackage.ui1
    public final double b(double d) {
        byte b = this.x;
        b65 b65Var = this.y;
        switch (b) {
            case 0:
                return db.A(b65Var.k.b(d), b65Var.e, b65Var.f);
            default:
                return b65Var.n.b(db.A(d, b65Var.e, b65Var.f));
        }
    }
}
