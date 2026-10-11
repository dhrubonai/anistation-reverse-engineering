package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dl extends x93 implements jc2 {
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ xi6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(ub2 ub2Var, xi6 xi6Var) {
        super(3);
        this.y = ub2Var;
        this.z = xi6Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        xo3 xo3Var = (xo3) obj;
        em4 p = ((ro3) obj2).p(((rx0) obj3).a);
        if (xo3Var.d0()) {
            if (!((Boolean) this.y.invoke(this.z.d.getValue())).booleanValue()) {
                j = 0;
                return xo3Var.L((int) (j >> 32), (int) (4294967295L & j), ot1.x, new cl(p, (byte) 0));
            }
        }
        j = (p.x << 32) | (p.y & 4294967295L);
        return xo3Var.L((int) (j >> 32), (int) (4294967295L & j), ot1.x, new cl(p, (byte) 0));
    }
}
