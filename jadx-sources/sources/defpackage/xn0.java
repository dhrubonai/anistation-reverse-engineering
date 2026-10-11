package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xn0 extends xz0 {
    public /* synthetic */ Object x;
    public final /* synthetic */ yn0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn0(yn0 yn0Var, vz0 vz0Var) {
        super(vz0Var);
        this.y = yn0Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.f(this);
    }
}
