package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bm extends xz0 {
    public final /* synthetic */ dm A;
    public int B;
    public int x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(dm dmVar, xz0 xz0Var) {
        super(xz0Var);
        this.A = dmVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.h(null, null, 0, null, null, false, this);
    }
}
