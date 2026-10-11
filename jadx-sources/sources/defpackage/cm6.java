package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cm6 implements Comparable {
    public final long x;

    public /* synthetic */ cm6(long j) {
        this.x = j;
    }

    public static final boolean a(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static String b(long j) {
        if (j >= 0) {
            t80.z(10);
            String l = Long.toString(j, 10);
            l.getClass();
            return l;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        t80.z(10);
        String l2 = Long.toString(j2, 10);
        l2.getClass();
        t80.z(10);
        String l3 = Long.toString(j3, 10);
        l3.getClass();
        return l2.concat(l3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a34.E(this.x ^ Long.MIN_VALUE, ((cm6) obj).x ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cm6) {
            if (this.x != ((cm6) obj).x) {
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
        return b(this.x);
    }
}
