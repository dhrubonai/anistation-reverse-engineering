package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dh4 {
    public final long a;
    public final vh4 b;

    public dh4() {
        long f = w65.f(4284900966L);
        vh4 j = n77.j(0.0f, 0.0f, 3);
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (dh4.class.equals(cls)) {
                obj.getClass();
                dh4 dh4Var = (dh4) obj;
                long j = dh4Var.a;
                int i = ep0.j;
                if (!cm6.a(this.a, j) || !this.b.equals(dh4Var.b)) {
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
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ep0.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
