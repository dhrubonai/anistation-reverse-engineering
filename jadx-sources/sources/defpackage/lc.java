package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lc implements xm4 {
    public final int x;

    public lc(int i) {
        this.x = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lc) && this.x == ((lc) obj).x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.x);
    }

    public final String toString() {
        return qx1.i(this.x, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
