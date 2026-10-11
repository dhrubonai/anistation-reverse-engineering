package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xq5 extends x93 implements ub2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xo3 B;
    public final /* synthetic */ em4 C;
    public final /* synthetic */ long y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq5(yq5 yq5Var, long j, int i, int i2, xo3 xo3Var, em4 em4Var) {
        super(1);
        this.y = j;
        this.z = i;
        this.A = i2;
        this.B = xo3Var;
        this.C = em4Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        float f;
        dm4 dm4Var = (dm4) obj;
        long j = (this.z << 32) | (this.A & 4294967295L);
        ia3 layoutDirection = this.B.getLayoutDirection();
        long j2 = this.y;
        float f2 = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f3 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        if (layoutDirection == ia3.x) {
            f = -1.0f;
        } else {
            f = (-1.0f) * (-1.0f);
        }
        float f4 = (1.0f - 1.0f) * f3;
        int round = Math.round((f + 1.0f) * f2);
        int round2 = Math.round(f4);
        dm4.i(dm4Var, this.C, (round2 & 4294967295L) | (round << 32));
        return pn6.a;
    }
}
