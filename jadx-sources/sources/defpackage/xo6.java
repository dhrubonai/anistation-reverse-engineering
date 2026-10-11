package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xo6 extends xz0 {
    public /* synthetic */ Object A;
    public final /* synthetic */ yo6 B;
    public int C;
    public ec2 x;
    public sb2 y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo6(yo6 yo6Var, xz0 xz0Var) {
        super(xz0Var);
        this.B = yo6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this);
    }
}
