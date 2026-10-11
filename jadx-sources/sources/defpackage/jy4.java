package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jy4 extends xz0 {
    public int A;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ky4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy4(ky4 ky4Var, xz0 xz0Var) {
        super(xz0Var);
        this.z = ky4Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(0, this);
    }
}
