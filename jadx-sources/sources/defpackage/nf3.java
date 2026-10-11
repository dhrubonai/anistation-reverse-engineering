package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nf3 extends xz3 implements fn4, wu0, hf2 {
    public tc L;
    public uf3 M;
    public jb6 N;
    public final ti4 O = xt5.g(null);

    public nf3(tc tcVar, uf3 uf3Var, jb6 jb6Var) {
        this.L = tcVar;
        this.M = uf3Var;
        this.N = jb6Var;
    }

    @Override // defpackage.xz3
    public final void S0() {
        tc tcVar = this.L;
        if (tcVar.a != null) {
            hz2.c("Expected textInputModifierNode to be null");
        }
        tcVar.a = this;
    }

    @Override // defpackage.xz3
    public final void T0() {
        this.L.k(this);
    }

    @Override // defpackage.hf2
    public final void f0(fa4 fa4Var) {
        this.O.setValue(fa4Var);
    }
}
