package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ey1 implements ri3, si3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ vy1 y;

    public /* synthetic */ ey1(vy1 vy1Var, byte b) {
        this.x = b;
        this.y = vy1Var;
    }

    @Override // defpackage.si3
    public void c(Object obj, g42 g42Var) {
        ((io4) obj).B(this.y.f, new ho4(g42Var));
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        byte b = this.x;
        vy1 vy1Var = this.y;
        io4 io4Var = (io4) obj;
        switch (b) {
            case 0:
                io4Var.F(vy1Var.T);
                return;
            default:
                io4Var.P(vy1Var.R);
                return;
        }
    }
}
