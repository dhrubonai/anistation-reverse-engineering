package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class di4 {
    public final cd a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public di4(cd cdVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = cdVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final n05 a(n05 n05Var) {
        return n05Var.k((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = nd6.b;
            if (nd6.c(j, j2)) {
                return j2;
            }
        }
        int i = nd6.c;
        int i2 = this.b;
        return fy5.a(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final n05 c(n05 n05Var) {
        float f = -this.f;
        return n05Var.k((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return db.C(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof di4) {
                di4 di4Var = (di4) obj;
                if (this.a == di4Var.a && this.b == di4Var.b && this.c == di4Var.c && this.d == di4Var.d && this.e == di4Var.e && Float.compare(this.f, di4Var.f) == 0 && Float.compare(this.g, di4Var.g) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + qx1.b(this.f, qx1.c(this.e, qx1.c(this.d, qx1.c(this.c, qx1.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        h11.y(sb, this.c, ", startLineIndex=", this.d, ", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
