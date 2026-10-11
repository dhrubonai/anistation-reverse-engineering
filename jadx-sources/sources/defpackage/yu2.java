package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yu2 extends xh4 {
    public final mu2 C;

    public yu2(mu2 mu2Var) {
        this.C = mu2Var;
    }

    @Override // defpackage.xh4
    public final long h() {
        float f;
        mu2 mu2Var = this.C;
        int width = mu2Var.getWidth();
        float f2 = Float.NaN;
        if (width > 0) {
            f = width;
        } else {
            f = Float.NaN;
        }
        int height = mu2Var.getHeight();
        if (height > 0) {
            f2 = height;
        }
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // defpackage.xh4
    public final void i(bp1 bp1Var) {
        float f;
        mu2 mu2Var = this.C;
        int width = mu2Var.getWidth();
        float f2 = 1.0f;
        if (width > 0) {
            f = Float.intBitsToFloat((int) (bp1Var.g() >> 32)) / width;
        } else {
            f = 1.0f;
        }
        int height = mu2Var.getHeight();
        if (height > 0) {
            f2 = Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L)) / height;
        }
        dn0 n0 = bp1Var.n0();
        long B = n0.B();
        n0.y().h();
        try {
            ((af2) n0.y).r(f, f2, 0L);
            mu2Var.b(u9.a(bp1Var.n0().y()));
        } finally {
            h11.u(n0, B);
        }
    }
}
