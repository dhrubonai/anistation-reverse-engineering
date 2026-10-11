package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sh4 extends xz3 implements ra3 {
    public float L;
    public float M;
    public float N;
    public float O;
    public boolean P;

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        int x0 = xo3Var.x0(this.N) + xo3Var.x0(this.L);
        int x02 = xo3Var.x0(this.O) + xo3Var.x0(this.M);
        em4 p = ro3Var.p(sx0.i(-x0, j, -x02));
        return xo3Var.L(sx0.g(p.x + x0, j), sx0.f(p.y + x02, j), ot1.x, new r82(this, p, (byte) 15));
    }
}
