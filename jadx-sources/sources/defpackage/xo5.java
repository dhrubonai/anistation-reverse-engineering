package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xo5 implements r26 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ jp5 y;

    public /* synthetic */ xo5(jp5 jp5Var, byte b) {
        this.x = b;
        this.y = jp5Var;
    }

    @Override // defpackage.r26
    public final Object get() {
        int i;
        byte b = this.x;
        jp5 jp5Var = this.y;
        switch (b) {
            case 0:
                ip5 a = jp5Var.a();
                a.f = null;
                if (jp5Var.A.p()) {
                    i = 4;
                } else {
                    i = 2;
                }
                a.d = i;
                return new jp5(a);
            case 1:
                ip5 a2 = jp5Var.a();
                a2.b(Math.max(0, jp5Var.v - 1));
                return new jp5(a2);
            default:
                ip5 a3 = jp5Var.a();
                a3.b(Math.max(0, jp5Var.v - 1));
                return new jp5(a3);
        }
    }
}
