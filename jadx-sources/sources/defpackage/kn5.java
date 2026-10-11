package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class kn5 extends e3 {
    public long a;
    public qg0 b;

    @Override // defpackage.e3
    public final boolean a(d3 d3Var) {
        in5 in5Var = (in5) d3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = in5Var.F;
        if (j < in5Var.G) {
            in5Var.G = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.e3
    public final vz0[] b(d3 d3Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((in5) d3Var).v(j);
    }
}
