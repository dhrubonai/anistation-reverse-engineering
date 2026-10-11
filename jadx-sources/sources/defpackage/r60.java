package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class r60 implements ss6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u60 b;

    public /* synthetic */ r60(u60 u60Var, byte b) {
        this.a = b;
        this.b = u60Var;
    }

    @Override // defpackage.ss6
    public final void run() {
        byte b = this.a;
        u60 u60Var = this.b;
        switch (b) {
            case 0:
                u60Var.F++;
                u60Var.p();
                return;
            case 1:
                we2 we2Var = u60Var.E;
                if (we2Var != null) {
                    we2Var.a();
                }
                u60Var.A.clear();
                return;
            default:
                if (u60Var.A.isEmpty()) {
                    oa1 oa1Var = u60Var.D;
                    oa1Var.getClass();
                    oa1Var.b();
                    a61.a();
                    return;
                }
                u60Var.G = true;
                return;
        }
    }
}
