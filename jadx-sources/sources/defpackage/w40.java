package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class w40 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ hd6 y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ w40(hd6 hd6Var, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = hd6Var;
        this.z = ub2Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        ub2 ub2Var = this.z;
        hd6 hd6Var = this.y;
        switch (b) {
            case 0:
                bd6 bd6Var = (bd6) obj;
                if (hd6Var != null) {
                    hd6Var.a.setValue(bd6Var);
                }
                if (ub2Var != null) {
                    ub2Var.invoke(bd6Var);
                }
                return pn6.a;
            default:
                hd6Var.c.add(ub2Var);
                return new qj(hd6Var, ub2Var, (byte) 13);
        }
    }
}
