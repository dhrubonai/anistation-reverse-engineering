package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ky1 implements ri3, ay0 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ float y;

    public /* synthetic */ ky1(float f, byte b) {
        this.x = b;
        this.y = f;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        byte b = this.x;
        float f = this.y;
        fq4 fq4Var = (fq4) obj;
        switch (b) {
            case 1:
                fq4Var.c(f);
                return;
            default:
                fq4Var.U(f);
                return;
        }
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        byte b = this.x;
        float f = this.y;
        io4 io4Var = (io4) obj;
        switch (b) {
            case 0:
                io4Var.s(f);
                return;
            default:
                io4Var.s(f);
                return;
        }
    }
}
