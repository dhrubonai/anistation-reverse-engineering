package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qr3 {
    public final jw3 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public qr3(jw3 jw3Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        io3.n(z5);
        if (z3 && !z2) {
            z6 = false;
        } else {
            z6 = true;
        }
        io3.n(z6);
        if (z && (z2 || z3 || z4)) {
            z7 = false;
        }
        io3.n(z7);
        this.a = jw3Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final qr3 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new qr3(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i);
    }

    public final qr3 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new qr3(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qr3.class == obj.getClass()) {
                qr3 qr3Var = (qr3) obj;
                if (this.b == qr3Var.b && this.d == qr3Var.d && this.e == qr3Var.e && this.f == qr3Var.f && this.g == qr3Var.g && this.h == qr3Var.h && this.i == qr3Var.i && this.a.equals(qr3Var.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
