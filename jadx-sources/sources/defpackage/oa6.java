package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oa6 {
    public static final y95 g = new y95((byte) 6);
    public final xo3 a;
    public final ia3 b;
    public final p82 c;
    public final long d;
    public final float e;
    public final float f;

    public oa6(xo3 xo3Var, ia3 ia3Var, p82 p82Var, long j) {
        this.a = xo3Var;
        this.b = ia3Var;
        this.c = p82Var;
        this.d = j;
        this.e = xo3Var.b();
        this.f = xo3Var.getFontScale();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + rx0.l(this.d) + ")";
    }
}
