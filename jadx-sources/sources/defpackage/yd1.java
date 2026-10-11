package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yd1 implements ud1 {
    public final float x;
    public final float y;
    public final l92 z;

    public yd1(float f, float f2, l92 l92Var) {
        this.x = f;
        this.y = f2;
        this.z = l92Var;
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yd1) {
                yd1 yd1Var = (yd1) obj;
                if (Float.compare(this.x, yd1Var.x) != 0 || Float.compare(this.y, yd1Var.y) != 0 || !this.z.equals(yd1Var.z)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.y;
    }

    public final int hashCode() {
        return this.z.hashCode() + qx1.b(this.y, Float.hashCode(this.x) * 31, 31);
    }

    @Override // defpackage.ud1
    public final long r(float f) {
        return hz5.h(this.z.a(f), 4294967296L);
    }

    public final String toString() {
        StringBuilder t = qx1.t("DensityWithConverter(density=", this.x, ", fontScale=", this.y, ", converter=");
        t.append(this.z);
        t.append(")");
        return t.toString();
    }

    @Override // defpackage.ud1
    public final float y(long j) {
        if (fe6.a(ee6.b(j), 4294967296L)) {
            return this.z.b(ee6.c(j));
        }
        ze0.m("Only Sp can convert to Px");
        return 0.0f;
    }
}
