package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x00 {
    public final long a;
    public final String b;
    public final long c;

    public x00(long j, String str, long j2) {
        this.a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x00) {
                x00 x00Var = (x00) obj;
                if (this.a != x00Var.a || !this.b.equals(x00Var.b) || this.c != x00Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + zo5.i(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "LocalBackup(id=" + this.a + ", displayName=" + this.b + ", modifiedAtEpochSeconds=" + this.c + ")";
    }
}
