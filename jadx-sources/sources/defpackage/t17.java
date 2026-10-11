package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t17 {
    public final String a;
    public final v17 b;
    public final long c;
    public final long d;

    public t17(String str, v17 v17Var, long j, long j2) {
        str.getClass();
        this.a = str;
        this.b = v17Var;
        this.c = j;
        this.d = j2;
    }

    public static t17 a(t17 t17Var, long j) {
        String str = t17Var.a;
        v17 v17Var = t17Var.b;
        long j2 = t17Var.c;
        t17Var.getClass();
        str.getClass();
        return new t17(str, v17Var, j2, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t17) {
                t17 t17Var = (t17) obj;
                if (!a34.i(this.a, t17Var.a) || !this.b.equals(t17Var.b) || this.c != t17Var.c || this.d != t17Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + qx1.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "ActiveCastSource(server=" + this.a + ", scope=" + this.b + ", requestId=" + this.c + ", attemptId=" + this.d + ")";
    }
}
