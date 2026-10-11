package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ps {
    public final float a;
    public final float b;

    public ps(float f, ud1 ud1Var) {
        this.a = f;
        float b = ud1Var.b();
        float f2 = k42.a;
        this.b = b * 386.0878f * 160.0f * 0.84f;
    }

    public j42 a(float f) {
        double b = b(f);
        double d = k42.a;
        double d2 = d - 1.0d;
        return new j42(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = kc.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    public ps(float f, float f2, float f3, float f4) {
        this.a = f3;
        this.b = f4;
    }
}
