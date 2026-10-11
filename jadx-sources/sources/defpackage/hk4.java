package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hk4 extends lk4 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public hk4(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk4)) {
            return false;
        }
        hk4 hk4Var = (hk4) obj;
        if (Float.compare(this.c, hk4Var.c) == 0 && Float.compare(this.d, hk4Var.d) == 0 && Float.compare(this.e, hk4Var.e) == 0 && Float.compare(this.f, hk4Var.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + qx1.b(this.e, qx1.b(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder t = qx1.t("RelativeReflectiveCurveTo(dx1=", this.c, ", dy1=", this.d, ", dx2=");
        t.append(this.e);
        t.append(", dy2=");
        t.append(this.f);
        t.append(")");
        return t.toString();
    }
}
