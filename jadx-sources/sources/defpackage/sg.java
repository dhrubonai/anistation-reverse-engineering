package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ pi4 y;

    public /* synthetic */ sg(pi4 pi4Var, byte b) {
        this.x = b;
        this.y = pi4Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        pi4 pi4Var = this.y;
        switch (b) {
            case 0:
                pi4Var.i((int) (((k13) obj).a & 4294967295L));
                return pn6Var;
            case 1:
                pi4Var.i((int) (((k13) obj).a & 4294967295L));
                return pn6Var;
            case 2:
                pi4Var.i(((Float) obj).floatValue());
                return pn6Var;
            default:
                pi4Var.i(((Float) obj).floatValue());
                return pn6Var;
        }
    }
}
