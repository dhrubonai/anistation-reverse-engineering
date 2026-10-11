package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qc6 {
    public static final qc6 c = new qc6(hz5.g(0), hz5.g(0));
    public final long a;
    public final long b;

    public qc6(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc6)) {
            return false;
        }
        qc6 qc6Var = (qc6) obj;
        if (ee6.a(this.a, qc6Var.a) && ee6.a(this.b, qc6Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        fe6[] fe6VarArr = ee6.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qx1.n("TextIndent(firstLine=", ee6.d(this.a), ", restLine=", ee6.d(this.b), ")");
    }
}
