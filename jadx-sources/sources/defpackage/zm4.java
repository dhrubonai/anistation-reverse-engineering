package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zm4 extends xz0 {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ bn4 C;
    public int D;
    public Object x;
    public Object y;
    public m54 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm4(bn4 bn4Var, xz0 xz0Var) {
        super(xz0Var);
        this.C = bn4Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, 0L, null, this);
    }
}
