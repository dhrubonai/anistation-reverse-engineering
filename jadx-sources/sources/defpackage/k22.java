package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k22 extends xz0 {
    public /* synthetic */ Object A;
    public final /* synthetic */ l22 B;
    public int C;
    public Object x;
    public Object y;
    public x22 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k22(l22 l22Var, xz0 xz0Var) {
        super(xz0Var);
        this.B = l22Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}
