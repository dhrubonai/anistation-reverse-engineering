package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ij4 implements by4, kr4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ij4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.kr4
    public final Object c(String str, ub2 ub2Var, xz0 xz0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((mj4) obj).c(str, ub2Var, xz0Var);
            default:
                return ((rr4) obj).c(str, ub2Var, xz0Var);
        }
    }

    @Override // defpackage.by4
    public final g85 d() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((mj4) obj).b;
            default:
                return ((rr4) obj).b;
        }
    }
}
