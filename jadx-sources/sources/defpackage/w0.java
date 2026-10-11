package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class w0 extends xz0 {
    public int A;
    public q85 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ mx0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(mx0 mx0Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = mx0Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.collect(null, this);
    }
}
