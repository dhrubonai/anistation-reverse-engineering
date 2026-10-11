package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ky2 implements po1 {
    public hy2 A;
    public gy2 B;
    public n03 C;
    public fq3 D;
    public ok2 E;
    public final fr0 F;
    public final fr0 G;
    public final ho1 x;
    public fy2 y;
    public iy2 z;

    public ky2(ho1 ho1Var) {
        this.x = ho1Var;
        fr0 fr0Var = new fr0((byte) 2, false);
        fr0Var.z = new f44();
        this.F = fr0Var;
        fr0 fr0Var2 = new fr0((byte) 7, false);
        fr0Var2.z = new w34();
        this.G = fr0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hy2, java.lang.Object] */
    public static void c(ky2 ky2Var, dy2 dy2Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ho1 ho1Var = ky2Var.x;
        hy2 hy2Var = ky2Var.A;
        hy2 hy2Var2 = hy2Var;
        if (hy2Var == null) {
            ?? obj = new Object();
            obj.y = null;
            obj.z = Long.MAX_VALUE;
            obj.A = false;
            ky2Var.A = obj;
            hy2Var2 = obj;
        }
        hy2Var2.y = dy2Var;
        hy2Var2.z = j;
        ok2 ok2Var = ky2Var.E;
        rg4 rg4Var = ho1Var.N;
        if (ok2Var == null) {
            ky2Var.E = new ok2(rg4Var);
        } else {
            ok2Var.z = rg4Var;
            ok2Var.y = j2;
        }
        hy2Var2.A = false;
        ky2Var.C = hy2Var2;
    }

    @Override // defpackage.be2
    public final String S() {
        n03 n03Var = this.C;
        if (n03Var instanceof fy2) {
            if (((fy2) n03Var).A) {
                return "waiting";
            }
            return "idle";
        }
        if ((n03Var instanceof hy2) || (n03Var instanceof gy2)) {
            return "waiting";
        }
        if (n03Var instanceof iy2) {
            return "recognized";
        }
        return "idle";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fy2] */
    public final void a() {
        fy2 fy2Var = this.y;
        ey2 ey2Var = ey2.z;
        fy2 fy2Var2 = fy2Var;
        if (fy2Var == null) {
            ?? obj = new Object();
            obj.y = ey2Var;
            obj.z = false;
            obj.A = false;
            this.y = obj;
            fy2Var2 = obj;
        }
        fy2Var2.y = ey2Var;
        fy2Var2.z = false;
        fy2Var2.A = false;
        this.C = fy2Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gy2, java.lang.Object] */
    public final void b(dy2 dy2Var, long j, ok2 ok2Var) {
        gy2 gy2Var = this.B;
        gy2 gy2Var2 = gy2Var;
        if (gy2Var == null) {
            ?? obj = new Object();
            obj.y = null;
            obj.z = Long.MAX_VALUE;
            this.B = obj;
            gy2Var2 = obj;
        }
        gy2Var2.y = dy2Var;
        gy2Var2.z = j;
        ok2Var.y = 0L;
        this.C = gy2Var2;
    }

    public final fq3 d() {
        fq3 fq3Var = this.D;
        if (fq3Var != null) {
            return fq3Var;
        }
        ze0.k("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(dy2 dy2Var, cy2 cy2Var, long j) {
        long j2;
        long j3;
        float intBitsToFloat;
        long j4 = dy2Var.c;
        ho1 ho1Var = this.x;
        rg4 rg4Var = ho1Var.N;
        rg4Var.getClass();
        qo1 qo1Var = ro1.a;
        long j5 = 4294967295L;
        if (rg4Var == rg4.x) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        if (Math.abs(Float.intBitsToFloat((int) j2)) > 2.0f) {
            fq3 d = d();
            rg4 rg4Var2 = ho1Var.N;
            fr0 fr0Var = this.F;
            f44 f44Var = (f44) fr0Var.z;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 >> 32));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            if (q23.h(dy2Var)) {
                fr0Var.y = 0;
                f44Var.d();
            }
            float f = 0.0f;
            if (!q23.i(dy2Var) && !q23.h(dy2Var)) {
                if (f44Var.b == 3) {
                    int i = fr0Var.y;
                    fr0Var.y = i + 1;
                    f44Var.o(i, dy2Var);
                } else {
                    f44Var.a(dy2Var);
                }
                if (fr0Var.y == 3) {
                    fr0Var.y = 0;
                }
                Object[] objArr = f44Var.a;
                int i2 = f44Var.b;
                int i3 = 0;
                float f2 = 0.0f;
                while (i3 < i2) {
                    f2 += Float.intBitsToFloat((int) (((dy2) objArr[i3]).c >> 32));
                    i3++;
                    j5 = j5;
                }
                j3 = j5;
                int i4 = f44Var.b;
                intBitsToFloat2 = f2 / i4;
                Object[] objArr2 = f44Var.a;
                float f3 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    f3 += Float.intBitsToFloat((int) (((dy2) objArr2[i5]).c & j3));
                }
                intBitsToFloat3 = f3 / f44Var.b;
            } else {
                j3 = 4294967295L;
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & j3) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
            if (rg4Var2 != null) {
                int i6 = cy2Var.a;
                if (i6 == 1) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j3));
                }
                floatToRawIntBits = rg4Var2 == rg4.y ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & j3) : (Float.floatToRawIntBits(intBitsToFloat) & j3) | (Float.floatToRawIntBits(0.0f) << 32);
            }
            ((wv) d.y).a(dy2Var.b, floatToRawIntBits);
            fr0 fr0Var2 = this.G;
            w34 w34Var = (w34) fr0Var2.z;
            if (w34Var.b == 3) {
                int i7 = fr0Var2.y;
                fr0Var2.y = i7 + 1;
                w34Var.e(i7, j);
            } else {
                w34Var.a(j);
            }
            if (fr0Var2.y == 3) {
                fr0Var2.y = 0;
            }
            long[] jArr = w34Var.a;
            int i8 = w34Var.b;
            float f4 = 0.0f;
            for (int i9 = 0; i9 < i8; i9++) {
                f4 += Float.intBitsToFloat((int) (jArr[i9] >> 32));
            }
            int i10 = w34Var.b;
            float f5 = f4 / i10;
            long[] jArr2 = w34Var.a;
            for (int i11 = 0; i11 < i10; i11++) {
                f = Float.intBitsToFloat((int) (jArr2[i11] & j3)) + f;
            }
            float f6 = f / w34Var.b;
            ho1Var.i1(new qn1((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & j3), true));
        }
    }

    public final void f(dy2 dy2Var, dy2 dy2Var2, cy2 cy2Var, long j) {
        char c;
        long j2;
        float intBitsToFloat;
        if (this.D == null) {
            this.D = new fq3((byte) 18);
        }
        fq3 d = d();
        ho1 ho1Var = this.x;
        rg4 rg4Var = ho1Var.N;
        fr0 fr0Var = this.F;
        f44 f44Var = (f44) fr0Var.z;
        char c2 = ' ';
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dy2Var.c >> 32));
        long j3 = 4294967295L;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (dy2Var.c & 4294967295L));
        if (q23.h(dy2Var)) {
            fr0Var.y = 0;
            f44Var.d();
        }
        if (!q23.i(dy2Var) && !q23.h(dy2Var)) {
            if (f44Var.b == 3) {
                int i = fr0Var.y;
                fr0Var.y = i + 1;
                f44Var.o(i, dy2Var);
            } else {
                f44Var.a(dy2Var);
            }
            if (fr0Var.y == 3) {
                fr0Var.y = 0;
            }
            Object[] objArr = f44Var.a;
            int i2 = f44Var.b;
            int i3 = 0;
            float f = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                f += Float.intBitsToFloat((int) (((dy2) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = f44Var.b;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = f44Var.a;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((dy2) objArr2[i5]).c & j2));
            }
            intBitsToFloat3 = f2 / f44Var.b;
        } else {
            c = ' ';
            j2 = 4294967295L;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & j2);
        if (rg4Var != null) {
            int i6 = cy2Var.a;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j2));
            }
            floatToRawIntBits = rg4Var == rg4.y ? (Float.floatToRawIntBits(intBitsToFloat) << c) | (Float.floatToRawIntBits(0.0f) & j2) : (Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        }
        ((wv) d.y).a(dy2Var.b, floatToRawIntBits);
        long e = xc4.e(q23.O(dy2Var2, ho1Var.N, cy2Var), j);
        if (((Boolean) ho1Var.O.invoke(new cr4(1))).booleanValue()) {
            ho1Var.i1(new rn1(e));
        }
        fr0 fr0Var2 = this.G;
        fr0Var2.y = 0;
        ((w34) fr0Var2.z).b = 0;
    }

    @Override // defpackage.po1
    public final rg4 getOrientation() {
        return this.x.N;
    }
}
