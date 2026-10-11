package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class os2 extends xz0 {
    public f91 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ rt3 C;
    public int D;
    public int x;
    public int y;
    public yp2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os2(rt3 rt3Var, xz0 xz0Var) {
        super(xz0Var);
        this.C = rt3Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.i(this);
    }
}
