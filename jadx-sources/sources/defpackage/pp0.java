package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class pp0 {
    public final String a;
    public final long b;
    public final int c;

    public pp0(long j, int i, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() != 0) {
            if (i >= -1 && i <= 63) {
                return;
            }
            ze0.k("The id must be between -1 and 63");
            throw null;
        }
        ze0.k("The name of a color space cannot be null and must contain at least 1 character");
        throw null;
    }

    public float a(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    public float b(int i) {
        if (i == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    public boolean c() {
        return false;
    }

    public long d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        float f4 = 0.5f;
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 <= 0.5f) {
            f4 = f3;
        }
        float[] fArr = md4.g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = md4.f;
        float f11 = (fArr2[6] * f10) + (fArr2[3] * f9) + (fArr2[0] * f8);
        float f12 = (fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8);
        return (Float.floatToRawIntBits(f11) << 32) | (4294967295L & Float.floatToRawIntBits(f12));
    }

    public float e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        float f4 = 0.5f;
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 <= 0.5f) {
            f4 = f3;
        }
        float[] fArr = md4.g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = md4.f;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pp0 pp0Var = (pp0) obj;
            if (this.c == pp0Var.c && this.a.equals(pp0Var.a)) {
                return wk6.n(this.b, pp0Var.b);
            }
            return false;
        }
        return false;
    }

    public long f(float f, float f2, float f3, float f4, pp0 pp0Var) {
        float[] fArr = md4.d;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float v = q23.v(f5);
        float v2 = q23.v(f6);
        float v3 = q23.v(f7);
        float[] fArr2 = md4.e;
        return w65.d((fArr2[6] * v3) + (fArr2[3] * v2) + (fArr2[0] * v), (fArr2[7] * v3) + (fArr2[4] * v2) + (fArr2[1] * v), (fArr2[8] * v3) + (fArr2[5] * v2) + (fArr2[2] * v), f4, pp0Var);
    }

    public int hashCode() {
        return qx1.d(this.a.hashCode() * 31, this.b, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + wk6.K(this.b) + ")";
    }
}
