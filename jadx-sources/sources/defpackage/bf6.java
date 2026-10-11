package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bf6 implements ye6, Comparable {
    public final long x;

    public /* synthetic */ bf6(long j) {
        this.x = j;
    }

    public static long b(long j) {
        long b = j04.b();
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return fq1.k(iv.C(j));
        }
        return iv.N(b, j);
    }

    public static final long c(long j, long j2) {
        int i = j04.y;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                m18 m18Var = fq1.y;
                return 0L;
            }
            return fq1.k(iv.C(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return iv.C(j);
        }
        return iv.N(j, j2);
    }

    @Override // defpackage.ye6
    public final long a() {
        return b(this.x);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bf6 bf6Var = (bf6) obj;
        bf6Var.getClass();
        return fq1.c(c(this.x, bf6Var.x), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bf6) {
            if (this.x != ((bf6) obj).x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.x);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.x + ')';
    }
}
