package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class rh6 implements j11 {
    public static final og5 y = new og5((byte) 6);
    public final n11 x;

    public rh6(n11 n11Var) {
        this.x = n11Var;
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        return tl7.u(this, k11Var);
    }

    @Override // defpackage.j11
    public final k11 getKey() {
        return y;
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }
}
