package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yl extends xz0 {
    public /* synthetic */ Object A;
    public final /* synthetic */ dm B;
    public int C;
    public long x;
    public long y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(dm dmVar, xz0 xz0Var) {
        super(xz0Var);
        this.B = dmVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(0L, 0L, 0, this);
    }
}
