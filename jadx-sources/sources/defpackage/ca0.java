package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ca0 extends xz3 implements t90, fa3 {
    public py0 L;
    public boolean M;

    public static final n05 a1(ca0 ca0Var, fa4 fa4Var, n nVar) {
        n05 n05Var;
        if (ca0Var.K && ca0Var.M) {
            fa4 N = wc7.N(ca0Var);
            if (!fa4Var.Y0().K) {
                fa4Var = null;
            }
            if (fa4Var != null && (n05Var = (n05) nVar.invoke()) != null) {
                return n05Var.k(N.G(fa4Var, false).f());
            }
        }
        return null;
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.fa3
    public final void o(ha3 ha3Var) {
        this.M = true;
    }

    @Override // defpackage.t90
    public final Object o0(fa4 fa4Var, n nVar, xz0 xz0Var) {
        Object K = db.K(new ba0(this, fa4Var, nVar, new mi((Object) this, (Object) fa4Var, (Object) nVar, (byte) 5), null), xz0Var);
        if (K == w11.x) {
            return K;
        }
        return pn6.a;
    }
}
