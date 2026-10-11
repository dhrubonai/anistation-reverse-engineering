package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ao2 implements om5 {
    public static final ao2 b = new ao2(0);
    public static final ao2 c = new ao2(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ ao2(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.om5
    public final bb4 a(long j, ia3 ia3Var, ud1 ud1Var) {
        switch (this.a) {
            case 0:
                float x0 = ud1Var.x0(30.0f);
                return new ah4(new n05(0.0f, -x0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + x0));
            case 1:
                float x02 = ud1Var.x0(30.0f);
                return new ah4(new n05(-x02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + x02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new ah4(n03.g(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
