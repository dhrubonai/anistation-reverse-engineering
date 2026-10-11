package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xd1 implements ud1 {
    public final float x;
    public final float y;

    public xd1(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    @Override // defpackage.ud1
    public final float b() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd1)) {
            return false;
        }
        xd1 xd1Var = (xd1) obj;
        if (Float.compare(this.x, xd1Var.x) == 0 && Float.compare(this.y, xd1Var.y) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        return this.y;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.x + ", fontScale=" + this.y + ")";
    }
}
