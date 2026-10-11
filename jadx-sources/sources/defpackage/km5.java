package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class km5 {
    public static final km5 d = new km5(0.0f, w65.f(4278190080L), 0);
    public final long a;
    public final long b;
    public final float c;

    public km5(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof km5) {
                km5 km5Var = (km5) obj;
                long j = km5Var.a;
                int i = ep0.j;
                if (cm6.a(this.a, j) && xc4.b(this.b, km5Var.b) && this.c == km5Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ep0.j;
        return Float.hashCode(this.c) + qx1.d(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = h11.o("Shadow(color=", ep0.h(this.a), ", offset=", xc4.h(this.b), ", blurRadius=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
