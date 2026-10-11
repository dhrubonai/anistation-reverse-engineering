package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vh4 implements th4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public vh4(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f2 >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z & z2;
        if (f3 >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z4 & z3 & (f4 >= 0.0f))) {
            cz2.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.th4
    public final float a() {
        return this.d;
    }

    @Override // defpackage.th4
    public final float b(ia3 ia3Var) {
        if (ia3Var == ia3.x) {
            return this.a;
        }
        return this.c;
    }

    @Override // defpackage.th4
    public final float c(ia3 ia3Var) {
        if (ia3Var == ia3.x) {
            return this.c;
        }
        return this.a;
    }

    @Override // defpackage.th4
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vh4) {
            vh4 vh4Var = (vh4) obj;
            if (vm1.c(this.a, vh4Var.a) && vm1.c(this.b, vh4Var.b) && vm1.c(this.c, vh4Var.c) && vm1.c(this.d, vh4Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + qx1.b(this.c, qx1.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String d = vm1.d(this.a);
        String d2 = vm1.d(this.b);
        return h11.l(h11.o("PaddingValues(start=", d, ", top=", d2, ", end="), vm1.d(this.c), ", bottom=", vm1.d(this.d), ")");
    }
}
