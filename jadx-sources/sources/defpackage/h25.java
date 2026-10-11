package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class h25 implements ri3, si3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ p25 y;

    public /* synthetic */ h25(p25 p25Var, byte b) {
        this.x = b;
        this.y = p25Var;
    }

    @Override // defpackage.si3
    public void c(Object obj, g42 g42Var) {
        ((io4) obj).B(this.y, new ho4(g42Var));
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        byte b = this.x;
        p25 p25Var = this.y;
        io4 io4Var = (io4) obj;
        switch (b) {
            case 0:
                io4Var.F(p25Var.J);
                return;
            case 1:
                io4Var.t(3, p25Var.q());
                return;
            case 2:
                io4Var.t(1, p25Var.q());
                return;
            case 3:
                io4Var.E(p25Var.I);
                return;
            case 4:
                io4Var.P(p25Var.A);
                return;
            default:
                io4Var.E(p25Var.I);
                return;
        }
    }
}
