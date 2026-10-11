package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ii0 {
    public final long a;
    public final long b;
    public final String c;

    public ii0(long j, String str, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ii0) {
                ii0 ii0Var = (ii0) obj;
                if (this.a != ii0Var.a || this.b != ii0Var.b || !this.c.equals(ii0Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + qx1.d(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder n = zo5.n(this.a, "Cue(startMs=", ", endMs=");
        n.append(this.b);
        n.append(", text=");
        n.append(this.c);
        n.append(")");
        return n.toString();
    }
}
