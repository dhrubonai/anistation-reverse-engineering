package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ck4 extends lk4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public ck4(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck4)) {
            return false;
        }
        ck4 ck4Var = (ck4) obj;
        if (Float.compare(this.c, ck4Var.c) == 0 && Float.compare(this.d, ck4Var.d) == 0 && Float.compare(this.e, ck4Var.e) == 0 && Float.compare(this.f, ck4Var.f) == 0 && Float.compare(this.g, ck4Var.g) == 0 && Float.compare(this.h, ck4Var.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + qx1.b(this.g, qx1.b(this.f, qx1.b(this.e, qx1.b(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder t = qx1.t("RelativeCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        h11.x(t, this.e, ", dy2=", this.f, ", dx3=");
        t.append(this.g);
        t.append(", dy3=");
        t.append(this.h);
        t.append(")");
        return t.toString();
    }
}
