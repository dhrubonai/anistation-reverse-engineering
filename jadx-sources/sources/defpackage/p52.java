package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p52 extends xz0 {
    public /* synthetic */ Object x;
    public final /* synthetic */ ii y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p52(ii iiVar, vz0 vz0Var) {
        super(vz0Var);
        this.y = iiVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.emit(null, this);
    }
}
