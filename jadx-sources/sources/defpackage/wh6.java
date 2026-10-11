package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wh6 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public wh6(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (!Double.isNaN(d2) && !Double.isNaN(d3) && !Double.isNaN(d4) && !Double.isNaN(d5) && !Double.isNaN(d6) && !Double.isNaN(d7) && !Double.isNaN(d)) {
            if (d == -2.0d || d == -3.0d) {
                return;
            }
            if (d5 >= 0.0d && d5 <= 1.0d) {
                if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
                    ze0.k("Parameter a or g is zero, the transfer function is constant");
                    throw null;
                }
                if (d5 >= 1.0d && d4 == 0.0d) {
                    ze0.k("Parameter c is zero, the transfer function is constant");
                    throw null;
                }
                if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
                    ze0.k("Parameter a or g is zero, and c is zero, the transfer function is constant");
                    throw null;
                }
                if (d4 >= 0.0d) {
                    if (d2 >= 0.0d && d >= 0.0d) {
                        return;
                    }
                    ze0.k("The transfer function must be positive or increasing");
                    throw null;
                }
                ze0.k("The transfer function must be increasing");
                throw null;
            }
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        ze0.k("Parameters cannot be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh6)) {
            return false;
        }
        wh6 wh6Var = (wh6) obj;
        if (Double.compare(this.a, wh6Var.a) == 0 && Double.compare(this.b, wh6Var.b) == 0 && Double.compare(this.c, wh6Var.c) == 0 && Double.compare(this.d, wh6Var.d) == 0 && Double.compare(this.e, wh6Var.e) == 0 && Double.compare(this.f, wh6Var.f) == 0 && Double.compare(this.g, wh6Var.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((Double.hashCode(this.f) + ((Double.hashCode(this.e) + ((Double.hashCode(this.d) + ((Double.hashCode(this.c) + ((Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ")";
    }

    public /* synthetic */ wh6(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
