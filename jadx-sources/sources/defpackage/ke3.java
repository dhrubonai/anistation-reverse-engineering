package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ke3 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ le3 y;

    public /* synthetic */ ke3(le3 le3Var, byte b) {
        this.x = b;
        this.y = le3Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        le3 le3Var = this.y;
        switch (b) {
            case 0:
                return Float.valueOf(le3Var.M.b());
            case 1:
                return Float.valueOf(le3Var.M.e());
            default:
                return Float.valueOf(le3Var.M.a() - le3Var.M.d());
        }
    }
}
