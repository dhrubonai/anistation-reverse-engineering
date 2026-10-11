package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q40 implements ad4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cc6 b;

    public /* synthetic */ q40(cc6 cc6Var, byte b) {
        this.a = b;
        this.b = cc6Var;
    }

    @Override // defpackage.ad4
    public final long a() {
        byte b = this.a;
        cc6 cc6Var = this.b;
        switch (b) {
            case 0:
                return cc6Var.j(true).b;
            case 1:
                return cc6Var.p(true, true).b;
            default:
                return cc6Var.p(false, true).b;
        }
    }
}
