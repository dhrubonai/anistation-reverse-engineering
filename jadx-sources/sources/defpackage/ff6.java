package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ff6 {
    public final Boolean a;
    public final long b;

    public ff6(Boolean bool, long j) {
        this.a = bool;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ff6) {
            ff6 ff6Var = (ff6) obj;
            if (this.a.equals(ff6Var.a)) {
                long j = ff6Var.b;
                m18 m18Var = fq1.y;
                if (this.b == j) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m18 m18Var = fq1.y;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return "TimedValue(value=" + this.a + ", duration=" + ((Object) fq1.j(this.b)) + ')';
    }
}
