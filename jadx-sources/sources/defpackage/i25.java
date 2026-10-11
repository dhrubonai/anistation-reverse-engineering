package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class i25 implements ri3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ jo4 y;
    public final /* synthetic */ jo4 z;

    public /* synthetic */ i25(jo4 jo4Var, jo4 jo4Var2, byte b) {
        this.x = b;
        this.y = jo4Var;
        this.z = jo4Var2;
    }

    @Override // defpackage.ri3
    public final void invoke(Object obj) {
        byte b = this.x;
        jo4 jo4Var = this.z;
        jo4 jo4Var2 = this.y;
        io4 io4Var = (io4) obj;
        switch (b) {
            case 0:
                io4Var.i(4);
                io4Var.j(jo4Var2, jo4Var, 4);
                return;
            case 1:
                io4Var.i(0);
                io4Var.j(jo4Var2, jo4Var, 0);
                return;
            default:
                io4Var.i(1);
                io4Var.j(jo4Var2, jo4Var, 1);
                return;
        }
    }
}
