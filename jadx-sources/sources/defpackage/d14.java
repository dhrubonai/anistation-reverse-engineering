package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d14 {
    public final long a;
    public final long b;
    public final boolean c;

    public d14(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final d14 a(d14 d14Var) {
        return new d14(xc4.f(this.a, d14Var.a), Math.max(this.b, d14Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d14) {
                d14 d14Var = (d14) obj;
                if (!xc4.b(this.a, d14Var.a) || this.b != d14Var.b || this.c != d14Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qx1.d(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + xc4.h(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
