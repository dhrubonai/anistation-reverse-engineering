package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cc extends xz0 {
    public int A;
    public long x;
    public /* synthetic */ Object y;
    public final /* synthetic */ fc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(fc fcVar, xz0 xz0Var) {
        super(xz0Var);
        this.z = fcVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(0L, null, this);
    }
}
