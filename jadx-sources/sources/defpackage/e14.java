package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e14 extends xz0 {
    public /* synthetic */ Object A;
    public final /* synthetic */ h14 B;
    public int C;
    public rd5 x;
    public t05 y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e14(h14 h14Var, xz0 xz0Var) {
        super(xz0Var);
        this.B = h14Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.d(null, null, 0.0f, 0.0f, this);
    }
}
