package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u21 extends xh4 {
    public final xh4 C;
    public final dz0 D;
    public final long E;
    public final boolean F;
    public ye6 H;
    public boolean I;
    public w60 K;
    public xh4 L;
    public final long M;
    public final qi4 G = new qi4(0);
    public float J = 1.0f;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r7 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u21(defpackage.xh4 r5, defpackage.xh4 r6, defpackage.dz0 r7, long r8, boolean r10, boolean r11) {
        /*
            r4 = this;
            r4.<init>()
            r4.C = r6
            r4.D = r7
            r4.E = r8
            r4.F = r10
            qi4 r7 = new qi4
            r8 = 0
            r7.<init>(r8)
            r4.G = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.J = r7
            r4.L = r5
            r9 = 0
            if (r5 == 0) goto L22
            long r0 = r5.h()
            goto L23
        L22:
            r0 = r9
        L23:
            if (r6 == 0) goto L29
            long r9 = r6.h()
        L29:
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r2 = 1
            if (r7 == 0) goto L35
            r7 = r2
            goto L36
        L35:
            r7 = r8
        L36:
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 == 0) goto L3b
            r8 = r2
        L3b:
            if (r11 == 0) goto L44
            if (r8 == 0) goto L41
            r0 = r9
            goto L82
        L41:
            if (r7 == 0) goto L44
            goto L82
        L44:
            if (r7 == 0) goto L81
            if (r8 == 0) goto L81
            r5 = 32
            long r6 = r0 >> r5
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r9 >> r5
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = java.lang.Math.max(r6, r7)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r7
            int r11 = (int) r0
            float r11 = java.lang.Float.intBitsToFloat(r11)
            long r9 = r9 & r7
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = java.lang.Math.max(r11, r9)
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r10 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r9)
            long r0 = (long) r6
            long r5 = r10 << r5
            long r7 = r7 & r0
            long r0 = r5 | r7
            goto L82
        L81:
            r0 = r5
        L82:
            r4.M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u21.<init>(xh4, xh4, dz0, long, boolean, boolean):void");
    }

    @Override // defpackage.xh4
    public final boolean d(float f) {
        this.J = f;
        return true;
    }

    @Override // defpackage.xh4
    public final boolean e(w60 w60Var) {
        this.K = w60Var;
        return true;
    }

    @Override // defpackage.xh4
    public final long h() {
        return this.M;
    }

    @Override // defpackage.xh4
    public final void i(bp1 bp1Var) {
        boolean z;
        boolean z2 = this.I;
        xh4 xh4Var = this.C;
        if (z2) {
            j(bp1Var, xh4Var, this.J);
            return;
        }
        ye6 ye6Var = this.H;
        if (ye6Var == null) {
            ye6Var = new bf6(j04.b());
            this.H = ye6Var;
        }
        float d = ((float) fq1.d(ye6Var.a())) / ((float) fq1.d(this.E));
        float B = db.B(d, 0.0f, 1.0f);
        float f = this.J;
        float f2 = B * f;
        if (this.F) {
            f -= f2;
        }
        if (d >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.I = z;
        j(bp1Var, this.L, f);
        j(bp1Var, xh4Var, f2);
        if (this.I) {
            this.L = null;
        } else {
            qi4 qi4Var = this.G;
            qi4Var.i(qi4Var.h() + 1);
        }
    }

    public final void j(bp1 bp1Var, xh4 xh4Var, float f) {
        long S;
        if (xh4Var != null && f > 0.0f) {
            long g = bp1Var.g();
            long h = xh4Var.h();
            if (h == 9205357640488583168L || uq5.f(h) || g == 9205357640488583168L || uq5.f(g)) {
                S = g;
            } else {
                S = te4.S(h, this.D.a(h, g));
            }
            if (g == 9205357640488583168L || uq5.f(g)) {
                xh4Var.g(bp1Var, S, f, this.K);
                return;
            }
            float intBitsToFloat = (Float.intBitsToFloat((int) (g >> 32)) - Float.intBitsToFloat((int) (S >> 32))) / 2.0f;
            float intBitsToFloat2 = (Float.intBitsToFloat((int) (g & 4294967295L)) - Float.intBitsToFloat((int) (S & 4294967295L))) / 2.0f;
            ((af2) bp1Var.n0().y).i(intBitsToFloat, intBitsToFloat2, intBitsToFloat, intBitsToFloat2);
            try {
                xh4Var.g(bp1Var, S, f, this.K);
            } finally {
                float f2 = -intBitsToFloat;
                float f3 = -intBitsToFloat2;
                ((af2) bp1Var.n0().y).i(f2, f3, f2, f3);
            }
        }
    }
}
