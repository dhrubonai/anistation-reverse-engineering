package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vb6 extends xz0 {
    public /* synthetic */ Object A;
    public final /* synthetic */ cc6 B;
    public int C;
    public v05 x;
    public v05 y;
    public cj2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb6(cc6 cc6Var, xz0 xz0Var) {
        super(xz0Var);
        this.B = cc6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.g(null, false, this);
    }
}
