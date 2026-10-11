package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nw3 implements ay0 {
    public final /* synthetic */ fr3 A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ eb2 y;
    public final /* synthetic */ ij3 z;

    public /* synthetic */ nw3(eb2 eb2Var, ij3 ij3Var, fr3 fr3Var, byte b) {
        this.x = b;
        this.y = eb2Var;
        this.z = ij3Var;
        this.A = fr3Var;
    }

    @Override // defpackage.ay0
    public final void accept(Object obj) {
        byte b = this.x;
        fr3 fr3Var = this.A;
        ij3 ij3Var = this.z;
        eb2 eb2Var = this.y;
        qw3 qw3Var = (qw3) obj;
        switch (b) {
            case 0:
                qw3Var.w(eb2Var.y, (jw3) eb2Var.z, ij3Var, fr3Var);
                return;
            default:
                qw3Var.u(eb2Var.y, (jw3) eb2Var.z, ij3Var, fr3Var);
                return;
        }
    }
}
