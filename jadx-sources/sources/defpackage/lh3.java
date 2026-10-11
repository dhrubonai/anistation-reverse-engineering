package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lh3 {
    public static final lh3 d = new lh3(ih3.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public lh3(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh3)) {
            return false;
        }
        lh3 lh3Var = (lh3) obj;
        float f = lh3Var.a;
        float f2 = ih3.b;
        if (Float.compare(this.a, f) == 0 && this.b == lh3Var.b && this.c == lh3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f = ih3.b;
        return Integer.hashCode(this.c) + qx1.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        String b = ih3.b(this.a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else if (i != 0) {
            str = "Invalid";
        } else {
            str = "LineHeightStyle.Trim.None";
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return h11.k(h11.o("LineHeightStyle(alignment=", b, ", trim=", str, ",mode="), str2, ")");
    }
}
