package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f96 extends zc1 implements wu0, q86 {
    public fg6 N;
    public ub2 O;
    public ub2 P;
    public ub2 Q;
    public bx5 R;
    public final he1 S = ut5.b(new e96(this, 0));
    public n05 T = n05.e;

    public f96(fg6 fg6Var, ub2 ub2Var, ub2 ub2Var2, ub2 ub2Var3) {
        this.N = fg6Var;
        this.O = ub2Var;
        this.P = ub2Var2;
        this.Q = ub2Var3;
    }

    @Override // defpackage.xz3
    public final void S0() {
        fg6 fg6Var = this.N;
        fg6Var.b = eg6.z;
        fg6Var.a = this;
    }

    @Override // defpackage.xz3
    public final void T0() {
        fg6 fg6Var = this.N;
        fg6Var.b = eg6.y;
        fg6Var.a = null;
    }

    @Override // defpackage.q86
    public final p86 U() {
        return (p86) this.S.getValue();
    }

    @Override // defpackage.q86
    public final long k(ha3 ha3Var) {
        return n(ha3Var).f();
    }

    @Override // defpackage.q86
    public final n05 n(ha3 ha3Var) {
        if (!this.K) {
            return this.T;
        }
        n05 n05Var = (n05) this.Q.invoke(ha3Var);
        if (n05Var == null) {
            return this.T;
        }
        this.T = n05Var;
        return n05Var;
    }
}
