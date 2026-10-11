package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ya0 extends xz0 {
    public /* synthetic */ Object x;
    public final /* synthetic */ za0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(za0 za0Var, xz0 xz0Var) {
        super(xz0Var);
        this.y = za0Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        Object G = this.y.G(null, 0, 0L, this);
        if (G == w11.x) {
            return G;
        }
        return new dk0(G);
    }
}
