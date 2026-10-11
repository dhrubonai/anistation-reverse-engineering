package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xj6 extends xz0 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ ak6 D;
    public int E;
    public kr4 x;
    public String y;
    public String[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj6(ak6 ak6Var, xz0 xz0Var) {
        super(xz0Var);
        this.D = ak6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.g(null, 0, this);
    }
}
