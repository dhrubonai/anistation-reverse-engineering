package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class t0 implements j11 {
    private final k11 key;

    public t0(k11 k11Var) {
        k11Var.getClass();
        this.key = k11Var;
    }

    @Override // defpackage.l11
    public /* bridge */ <R> R fold(R r, ic2 ic2Var) {
        return (R) tl7.t(this, r, ic2Var);
    }

    @Override // defpackage.l11
    public /* bridge */ <E extends j11> E get(k11 k11Var) {
        return (E) tl7.u(this, k11Var);
    }

    @Override // defpackage.j11
    public k11 getKey() {
        return this.key;
    }

    @Override // defpackage.l11
    public /* bridge */ l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public /* bridge */ l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }
}
