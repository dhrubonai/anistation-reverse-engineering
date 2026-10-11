package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yn2 {
    public final ic2 a;
    public final /* synthetic */ byte b;

    public yn2(ic2 ic2Var, byte b) {
        this.b = b;
        this.a = ic2Var;
    }

    public final float a(float f, ha3 ha3Var, ha3 ha3Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (ha3Var2.B(ha3Var, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (ha3Var.j() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                float j = ((int) (ha3Var.j() & 4294967295L)) / 2.0f;
                return Float.intBitsToFloat((int) (ha3Var2.B(ha3Var, (Float.floatToRawIntBits(j) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
