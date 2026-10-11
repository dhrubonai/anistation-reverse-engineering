package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g65 {
    public final long a = ep0.i;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g65) {
                long j = ((g65) obj).a;
                int i = ep0.j;
                if (!cm6.a(this.a, j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ep0.j;
        return Long.hashCode(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) ep0.h(this.a)) + ", rippleAlpha=null)";
    }
}
