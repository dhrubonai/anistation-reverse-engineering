package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class jy1 implements ri3, ay0 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;

    public /* synthetic */ jy1(byte b, boolean z) {
        this.x = b;
        this.y = z;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        byte b = this.x;
        boolean z = this.y;
        fq4 fq4Var = (fq4) obj;
        switch (b) {
            case 2:
                fq4Var.Y(z);
                return;
            case 3:
                fq4Var.v0(z);
                return;
            default:
                fq4Var.r(z);
                return;
        }
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        byte b = this.x;
        boolean z = this.y;
        io4 io4Var = (io4) obj;
        switch (b) {
            case 0:
                io4Var.x(z);
                return;
            case 1:
                io4Var.e(z);
                return;
            default:
                io4Var.V(z);
                return;
        }
    }
}
