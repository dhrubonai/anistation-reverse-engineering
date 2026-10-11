package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class im implements ub2 {
    public final /* synthetic */ oh3 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ float z;

    public /* synthetic */ im(oh3 oh3Var, float f, float f2) {
        this.x = oh3Var;
        this.y = f;
        this.z = f2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        bp1 bp1Var = (bp1) obj;
        bp1Var.getClass();
        long floatToRawIntBits = Float.floatToRawIntBits(this.z) & 4294967295L;
        bp1.a0(bp1Var, this.x, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.y) & 4294967295L), floatToRawIntBits | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bp1Var.g() >> 32))) << 32), 0.0f, null, 120);
        return pn6.a;
    }
}
