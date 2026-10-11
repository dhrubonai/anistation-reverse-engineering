package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qr4 extends xz0 {
    public /* synthetic */ Object A;
    public final /* synthetic */ rr4 B;
    public int C;
    public String x;
    public ub2 y;
    public ow0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr4(rr4 rr4Var, xz0 xz0Var) {
        super(xz0Var);
        this.B = rr4Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, this);
    }
}
