package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class um1 implements l11 {
    public final /* synthetic */ l11 x;
    public final Throwable y;

    public um1(l11 l11Var, Throwable th) {
        this.x = l11Var;
        this.y = th;
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return this.x.fold(obj, ic2Var);
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        return this.x.get(k11Var);
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        return this.x.minusKey(k11Var);
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        return this.x.plus(l11Var);
    }
}
