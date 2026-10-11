package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yr4 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final short f;

    public yr4(boolean z, ef5 ef5Var, boolean z2, int i) {
        int i2;
        boolean z3;
        tq1 tq1Var = ae.a;
        if (!z) {
            i2 = 262152;
        } else {
            i2 = 262144;
        }
        i2 = ef5Var == ef5.y ? i2 | 8192 : i2;
        i2 = z2 ? i2 : i2 | 512;
        if (ef5Var == ef5.x) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.a = i2;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = (short) 1002;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yr4) {
                yr4 yr4Var = (yr4) obj;
                if (this.a != yr4Var.a || this.b != yr4Var.b || this.c != yr4Var.c || this.d != yr4Var.d || this.e != yr4Var.e || this.f != yr4Var.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (zo5.g(zo5.g(zo5.g(zo5.g(zo5.g(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false) + this.f) * 31;
    }

    public yr4(boolean z) {
        this(z, ef5.x, true, 0);
    }
}
