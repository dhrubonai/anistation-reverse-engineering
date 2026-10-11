package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n06 extends zc1 implements xq4, g72, y72 {
    public sb2 N;
    public boolean O;
    public final a46 P;

    public n06(sb2 sb2Var) {
        this.N = sb2Var;
        ec ecVar = new ec(this, (byte) 5);
        nq4 nq4Var = v36.a;
        a46 a46Var = new a46(null, null, null, ecVar);
        a1(a46Var);
        this.P = a46Var;
    }

    @Override // defpackage.g72
    public final void G(d82 d82Var) {
        this.O = d82Var.a();
    }

    @Override // defpackage.xq4
    public final void J() {
        this.P.J();
    }

    @Override // defpackage.xq4
    public final long q() {
        zm1 zm1Var = bb4.M;
        ud1 ud1Var = wc7.O(this).V;
        zm1Var.getClass();
        int i = og6.b;
        return et5.g(ud1Var.x0(10.0f), ud1Var.x0(40.0f), ud1Var.x0(10.0f), ud1Var.x0(40.0f));
    }

    @Override // defpackage.xq4
    public final void x(nq4 nq4Var, oq4 oq4Var, long j) {
        this.P.x(nq4Var, oq4Var, j);
    }
}
