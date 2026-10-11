package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pu1 extends xz0 {
    public int A;
    public mz4 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ qu1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu1(qu1 qu1Var, xz0 xz0Var) {
        super(xz0Var);
        this.z = qu1Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(null, this);
    }
}
