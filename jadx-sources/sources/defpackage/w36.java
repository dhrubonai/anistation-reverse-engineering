package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w36 extends xz0 {
    public int A;
    public bx5 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ z36 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w36(z36 z36Var, h30 h30Var) {
        super(h30Var);
        this.z = z36Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.i(0L, null, this);
    }
}
