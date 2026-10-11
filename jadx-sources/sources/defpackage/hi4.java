package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hi4 implements go {
    public final int a;
    public final int b;
    public final long c;
    public final qc6 d;
    public final um4 e;
    public final lh3 f;
    public final int g;
    public final int h;
    public final kd6 i;

    public hi4(int i, int i2, long j, qc6 qc6Var, um4 um4Var, lh3 lh3Var, int i3, int i4, kd6 kd6Var) {
        boolean z;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = qc6Var;
        this.e = um4Var;
        this.f = lh3Var;
        this.g = i3;
        this.h = i4;
        this.i = kd6Var;
        fe6[] fe6VarArr = ee6.b;
        if (!ee6.a(j, ee6.c)) {
            if (ee6.c(j) >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                fz2.b("lineHeight can't be negative (" + ee6.c(j) + ")");
            }
        }
    }

    public final hi4 a(hi4 hi4Var) {
        if (hi4Var == null) {
            return this;
        }
        return ii4.a(this, hi4Var.a, hi4Var.b, hi4Var.c, hi4Var.d, hi4Var.e, hi4Var.f, hi4Var.g, hi4Var.h, hi4Var.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hi4) {
                hi4 hi4Var = (hi4) obj;
                if (this.a == hi4Var.a && this.b == hi4Var.b && ee6.a(this.c, hi4Var.c) && a34.i(this.d, hi4Var.d) && a34.i(this.e, hi4Var.e) && a34.i(this.f, hi4Var.f) && this.g == hi4Var.g && this.h == hi4Var.h && a34.i(this.i, hi4Var.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int c = qx1.c(this.b, Integer.hashCode(this.a) * 31, 31);
        fe6[] fe6VarArr = ee6.b;
        int d = qx1.d(c, this.c, 31);
        int i4 = 0;
        qc6 qc6Var = this.d;
        if (qc6Var != null) {
            i = qc6Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (d + i) * 31;
        um4 um4Var = this.e;
        if (um4Var != null) {
            i2 = um4Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        lh3 lh3Var = this.f;
        if (lh3Var != null) {
            i3 = lh3Var.hashCode();
        } else {
            i3 = 0;
        }
        int c2 = qx1.c(this.h, qx1.c(this.g, (i6 + i3) * 31, 31), 31);
        kd6 kd6Var = this.i;
        if (kd6Var != null) {
            i4 = kd6Var.hashCode();
        }
        return c2 + i4;
    }

    public final String toString() {
        String a = c86.a(this.a);
        String a2 = j96.a(this.b);
        String d = ee6.d(this.c);
        String a3 = fh3.a(this.g);
        String a4 = zs2.a(this.h);
        StringBuilder o = h11.o("ParagraphStyle(textAlign=", a, ", textDirection=", a2, ", lineHeight=");
        o.append(d);
        o.append(", textIndent=");
        o.append(this.d);
        o.append(", platformStyle=");
        o.append(this.e);
        o.append(", lineHeightStyle=");
        o.append(this.f);
        o.append(", lineBreak=");
        qx1.x(o, a3, ", hyphens=", a4, ", textMotion=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
