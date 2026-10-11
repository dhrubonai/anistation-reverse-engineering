package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s93 implements j11 {
    public static final m18 y = new m18((byte) 23);
    public final l11 x;

    public s93(l11 l11Var) {
        l11Var.getClass();
        this.x = l11Var;
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }

    @Override // defpackage.l11
    public final /* bridge */ j11 get(k11 k11Var) {
        return tl7.u(this, k11Var);
    }

    @Override // defpackage.j11
    public final k11 getKey() {
        return y;
    }

    @Override // defpackage.l11
    public final /* bridge */ l11 minusKey(k11 k11Var) {
        return tl7.B(this, k11Var);
    }

    @Override // defpackage.l11
    public final /* bridge */ l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }
}
