package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ma0 implements nc6 {
    public final im5 x;
    public final float y;

    public ma0(im5 im5Var, float f) {
        this.x = im5Var;
        this.y = f;
    }

    @Override // defpackage.nc6
    public final long a() {
        int i = ep0.j;
        return ep0.i;
    }

    @Override // defpackage.nc6
    public final ka0 d() {
        return this.x;
    }

    @Override // defpackage.nc6
    public final float e() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ma0) {
                ma0 ma0Var = (ma0) obj;
                if (!this.x.equals(ma0Var.x) || Float.compare(this.y, ma0Var.y) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (this.x.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.x + ", alpha=" + this.y + ")";
    }
}
