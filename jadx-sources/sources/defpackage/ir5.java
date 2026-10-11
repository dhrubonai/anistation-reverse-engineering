package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ir5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public ir5(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof ir5)) {
                ir5 ir5Var = (ir5) obj;
                long j = ir5Var.a;
                int i = ep0.j;
                if (cm6.a(this.a, j) && cm6.a(this.b, ir5Var.b) && cm6.a(this.c, ir5Var.c) && cm6.a(this.d, ir5Var.d) && cm6.a(this.e, ir5Var.e) && cm6.a(this.f, ir5Var.f) && cm6.a(this.g, ir5Var.g) && cm6.a(this.h, ir5Var.h) && cm6.a(this.i, ir5Var.i) && cm6.a(this.j, ir5Var.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ep0.j;
        return Long.hashCode(this.j) + qx1.d(qx1.d(qx1.d(qx1.d(qx1.d(qx1.d(qx1.d(qx1.d(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
    }
}
