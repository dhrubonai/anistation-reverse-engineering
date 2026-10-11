package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qz0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public qz0(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof qz0)) {
                qz0 qz0Var = (qz0) obj;
                long j = qz0Var.a;
                int i = ep0.j;
                if (cm6.a(this.a, j) && cm6.a(this.b, qz0Var.b) && cm6.a(this.c, qz0Var.c) && cm6.a(this.d, qz0Var.d) && cm6.a(this.e, qz0Var.e)) {
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
        return Long.hashCode(this.e) + qx1.d(qx1.d(qx1.d(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String h = ep0.h(this.a);
        String h2 = ep0.h(this.b);
        String h3 = ep0.h(this.c);
        String h4 = ep0.h(this.d);
        String h5 = ep0.h(this.e);
        StringBuilder o = h11.o("ContextMenuColors(backgroundColor=", h, ", textColor=", h2, ", iconColor=");
        qx1.x(o, h3, ", disabledTextColor=", h4, ", disabledIconColor=");
        return h11.k(o, h5, ")");
    }
}
