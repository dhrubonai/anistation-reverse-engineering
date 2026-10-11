package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qd6 {
    public final long a;
    public final long b;

    public qd6(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qd6) {
                qd6 qd6Var = (qd6) obj;
                long j = qd6Var.a;
                int i = ep0.j;
                if (!cm6.a(this.a, j) || !cm6.a(this.b, qd6Var.b)) {
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
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qx1.n("SelectionColors(selectionHandleColor=", ep0.h(this.a), ", selectionBackgroundColor=", ep0.h(this.b), ")");
    }
}
