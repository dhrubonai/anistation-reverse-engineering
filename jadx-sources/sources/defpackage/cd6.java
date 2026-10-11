package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cd6 {
    public final bd6 a;
    public ha3 b = null;
    public ha3 c;

    public cd6(bd6 bd6Var, ha3 ha3Var) {
        this.a = bd6Var;
        this.c = ha3Var;
    }

    public final long a(long j) {
        n05 n05Var;
        ha3 ha3Var = this.b;
        n05 n05Var2 = n05.e;
        if (ha3Var != null) {
            if (ha3Var.m()) {
                ha3 ha3Var2 = this.c;
                if (ha3Var2 != null) {
                    n05Var = ha3Var2.G(ha3Var, true);
                } else {
                    n05Var = null;
                }
            } else {
                n05Var = n05Var2;
            }
            if (n05Var != null) {
                n05Var2 = n05Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = n05Var2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = n05Var2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = n05Var2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = n05Var2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        bd6 bd6Var = this.a;
        int e = bd6Var.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        if (Float.intBitsToFloat(i) >= bd6Var.f(e) && Float.intBitsToFloat(i) <= bd6Var.g(e)) {
            return true;
        }
        return false;
    }

    public final long d(long j) {
        ha3 ha3Var;
        ha3 ha3Var2 = this.b;
        if (ha3Var2 != null) {
            ha3 ha3Var3 = null;
            if (!ha3Var2.m()) {
                ha3Var2 = null;
            }
            if (ha3Var2 != null && (ha3Var = this.c) != null) {
                if (ha3Var.m()) {
                    ha3Var3 = ha3Var;
                }
                if (ha3Var3 != null) {
                    return ha3Var2.B(ha3Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        ha3 ha3Var;
        ha3 ha3Var2 = this.b;
        if (ha3Var2 != null) {
            ha3 ha3Var3 = null;
            if (!ha3Var2.m()) {
                ha3Var2 = null;
            }
            if (ha3Var2 != null && (ha3Var = this.c) != null) {
                if (ha3Var.m()) {
                    ha3Var3 = ha3Var;
                }
                if (ha3Var3 != null) {
                    return ha3Var3.B(ha3Var2, j);
                }
            }
        }
        return j;
    }
}
