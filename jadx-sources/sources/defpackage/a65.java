package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a65 extends x93 implements ub2 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ b65 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a65(b65 b65Var, byte b) {
        super(1);
        this.y = b;
        this.z = b65Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.y;
        b65 b65Var = this.z;
        switch (b) {
            case 0:
                return Double.valueOf(b65Var.n.b(db.A(((Number) obj).doubleValue(), b65Var.e, b65Var.f)));
            default:
                return Double.valueOf(db.A(b65Var.k.b(((Number) obj).doubleValue()), b65Var.e, b65Var.f));
        }
    }
}
