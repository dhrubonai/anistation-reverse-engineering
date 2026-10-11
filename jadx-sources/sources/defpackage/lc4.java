package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lc4 extends xz0 {
    public /* synthetic */ Object x;
    public final /* synthetic */ sn3 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc4(sn3 sn3Var, xz0 xz0Var) {
        super(xz0Var);
        this.y = sn3Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        this.y.F(null, this);
        return w11.x;
    }
}
