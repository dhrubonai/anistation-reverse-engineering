package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sj4 extends lk4 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public sj4(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj4)) {
            return false;
        }
        sj4 sj4Var = (sj4) obj;
        if (Float.compare(this.c, sj4Var.c) == 0 && Float.compare(this.d, sj4Var.d) == 0 && Float.compare(this.e, sj4Var.e) == 0 && this.f == sj4Var.f && this.g == sj4Var.g && Float.compare(this.h, sj4Var.h) == 0 && Float.compare(this.i, sj4Var.i) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + qx1.b(this.h, zo5.g(zo5.g(qx1.b(this.e, qx1.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder t = qx1.t("ArcTo(horizontalEllipseRadius=", this.c, ", verticalEllipseRadius=", this.d, ", theta=");
        t.append(this.e);
        t.append(", isMoreThanHalf=");
        t.append(this.f);
        t.append(", isPositiveArc=");
        t.append(this.g);
        t.append(", arcStartX=");
        t.append(this.h);
        t.append(", arcStartY=");
        t.append(this.i);
        t.append(")");
        return t.toString();
    }
}
