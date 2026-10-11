package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p90 implements m90 {
    public final ud1 a;
    public final long b;

    public p90(x06 x06Var, long j) {
        this.a = x06Var;
        this.b = j;
    }

    @Override // defpackage.m90
    public final yz3 a(yz3 yz3Var, y50 y50Var) {
        return yz3Var.w(new y80(y50Var, false));
    }

    public final float b() {
        long j = this.b;
        if (rx0.c(j)) {
            return this.a.T(rx0.g(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final float c() {
        long j = this.b;
        if (rx0.d(j)) {
            return this.a.T(rx0.h(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p90) {
                p90 p90Var = (p90) obj;
                if (!a34.i(this.a, p90Var.a) || !rx0.b(this.b, p90Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + rx0.l(this.b) + ")";
    }
}
