package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ve5 extends xz0 {
    public int A;
    public String x;
    public /* synthetic */ Object y;
    public final /* synthetic */ af5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve5(af5 af5Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = af5Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, this);
    }
}
