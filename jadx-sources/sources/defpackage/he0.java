package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class he0 extends xz0 {
    public /* synthetic */ Object A;
    public final /* synthetic */ ie0 B;
    public int C;
    public ls0 x;
    public l11 y;
    public iu1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he0(ie0 ie0Var, xz0 xz0Var) {
        super(xz0Var);
        this.B = ie0Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
