package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k10 extends xz0 {
    public int A;
    public m00 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ m10 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k10(m10 m10Var, xz0 xz0Var) {
        super(xz0Var);
        this.z = m10Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, this);
    }
}
