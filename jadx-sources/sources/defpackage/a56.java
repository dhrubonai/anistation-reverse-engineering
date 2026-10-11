package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class a56 extends xz0 {
    public /* synthetic */ Object A;
    public final /* synthetic */ g56 B;
    public int C;
    public jg1 x;
    public g56 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a56(g56 g56Var, xz0 xz0Var) {
        super(xz0Var);
        this.B = g56Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(this);
    }
}
