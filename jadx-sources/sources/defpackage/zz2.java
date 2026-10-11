package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class zz2 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ a03 y;

    public /* synthetic */ zz2(a03 a03Var, byte b) {
        this.x = b;
        this.y = a03Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        a03 a03Var = this.y;
        jj6 jj6Var = (jj6) obj;
        switch (b) {
            case 0:
                jj6Var.getClass();
                a03 a03Var2 = (a03) jj6Var;
                t47 t47Var = a03Var.M;
                if (!a34.i(a03Var2.L, t47Var)) {
                    a03Var2.L = t47Var;
                    a03Var2.b1();
                }
                return ij6.y;
            default:
                jj6Var.getClass();
                a03Var.L = ((a03) jj6Var).M;
                return Boolean.FALSE;
        }
    }
}
