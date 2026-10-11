package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oj4 implements j11 {
    public static final q18 y = new q18((byte) 26);
    public final mj4 x;

    public oj4(mj4 mj4Var) {
        this.x = mj4Var;
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
