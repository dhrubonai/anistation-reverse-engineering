package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n05 {
    public static final n05 e = new n05(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public n05(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static n05 b(n05 n05Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = n05Var.a;
        }
        return new n05(f, n05Var.b, f2, n05Var.d);
    }

    public final boolean a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z4 = false;
        if (intBitsToFloat >= this.a) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (intBitsToFloat2 >= this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (intBitsToFloat2 < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        return (Float.floatToRawIntBits(((f - f2) / 2.0f) + f2) << 32) | (Float.floatToRawIntBits(this.d) & 4294967295L);
    }

    public final long d() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long e() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n05)) {
            return false;
        }
        n05 n05Var = (n05) obj;
        if (Float.compare(this.a, n05Var.a) == 0 && Float.compare(this.b, n05Var.b) == 0 && Float.compare(this.c, n05Var.c) == 0 && Float.compare(this.d, n05Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final long f() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final n05 g(n05 n05Var) {
        return new n05(Math.max(this.a, n05Var.a), Math.max(this.b, n05Var.b), Math.min(this.c, n05Var.c), Math.min(this.d, n05Var.d));
    }

    public final boolean h() {
        boolean z;
        boolean z2 = false;
        if (this.a >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (this.b >= this.d) {
            z2 = true;
        }
        return z | z2;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + qx1.b(this.c, qx1.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final boolean i(n05 n05Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.a < n05Var.c) {
            z = true;
        } else {
            z = false;
        }
        if (n05Var.a < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.b < n05Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (n05Var.b < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final n05 j(float f, float f2) {
        return new n05(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final n05 k(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new n05(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String P = bx7.P(this.a);
        String P2 = bx7.P(this.b);
        return h11.l(h11.o("Rect.fromLTRB(", P, ", ", P2, ", "), bx7.P(this.c), ", ", bx7.P(this.d), ")");
    }
}
