package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class d85 extends xz0 {
    public int A;
    public k54 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ zp2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d85(zp2 zp2Var, xz0 xz0Var) {
        super(xz0Var);
        this.z = zp2Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.G(this);
    }
}
