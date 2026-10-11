package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j84 extends xz0 {
    public int A;
    public long x;
    public /* synthetic */ Object y;
    public final /* synthetic */ k84 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j84(k84 k84Var, xz0 xz0Var) {
        super(xz0Var);
        this.z = k84Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.z0(0L, this);
    }
}
