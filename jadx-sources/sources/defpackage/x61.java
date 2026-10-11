package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class x61 implements ri3, ay0 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;

    public /* synthetic */ x61(q7 q7Var, int i, jo4 jo4Var, jo4 jo4Var2) {
        this.x = (byte) 0;
        this.y = i;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        byte b = this.x;
        int i = this.y;
        fq4 fq4Var = (fq4) obj;
        switch (b) {
            case 3:
                fq4Var.i0(i);
                return;
            case 4:
                fq4Var.G(i);
                return;
            case 5:
                fq4Var.u0(i);
                return;
            default:
                fq4Var.R0(i);
                return;
        }
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        byte b = this.x;
        int i = this.y;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                r7Var.getClass();
                mr3 mr3Var = (mr3) r7Var;
                if (i == 1) {
                    mr3Var.v = true;
                }
                mr3Var.l = i;
                return;
            case 1:
                ((io4) obj).c(i);
                return;
            case 2:
                ((io4) obj).d(i);
                return;
            case 7:
                ((io4) obj).v(i);
                return;
            default:
                ((io4) obj).d(i);
                return;
        }
    }

    public /* synthetic */ x61(int i, byte b) {
        this.x = b;
        this.y = i;
    }
}
