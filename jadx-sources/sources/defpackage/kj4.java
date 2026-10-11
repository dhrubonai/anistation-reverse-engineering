package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kj4 extends xz0 {
    public final /* synthetic */ mj4 A;
    public int B;
    public String x;
    public ub2 y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj4(mj4 mj4Var, xz0 xz0Var) {
        super(xz0Var);
        this.A = mj4Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, null, this);
    }
}
