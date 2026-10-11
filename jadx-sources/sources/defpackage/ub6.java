package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ub6 extends xz0 {
    public final /* synthetic */ cc6 A;
    public int B;
    public v05 x;
    public v05 y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub6(cc6 cc6Var, xz0 xz0Var) {
        super(xz0Var);
        this.A = cc6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.e(null, this);
    }
}
