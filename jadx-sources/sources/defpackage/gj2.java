package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gj2 implements xr4 {
    public final e7 x;
    public final ad4 y;
    public long z = 0;

    public gj2(e7 e7Var, ad4 ad4Var) {
        this.x = e7Var;
        this.y = ad4Var;
    }

    @Override // defpackage.xr4
    public final long b(g13 g13Var, long j, ia3 ia3Var, long j2) {
        long a = this.y.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.z;
        }
        this.z = a;
        return c13.d(c13.d(g13Var.c(), w65.R(a)), this.x.a(j2, 0L, ia3Var));
    }
}
