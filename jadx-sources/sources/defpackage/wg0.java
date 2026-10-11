package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wg0 {
    public ud1 a;
    public ia3 b;
    public vg0 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wg0) {
                wg0 wg0Var = (wg0) obj;
                if (!a34.i(this.a, wg0Var.a) || this.b != wg0Var.b || !a34.i(this.c, wg0Var.c) || !uq5.b(this.d, wg0Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + uq5.g(this.d) + ")";
    }
}
