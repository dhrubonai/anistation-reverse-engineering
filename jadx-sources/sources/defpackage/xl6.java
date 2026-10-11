package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xl6 implements Comparable {
    public final int x;

    public /* synthetic */ xl6(int i) {
        this.x = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a34.D(this.x ^ Integer.MIN_VALUE, ((xl6) obj).x ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xl6) {
            if (this.x != ((xl6) obj).x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.x);
    }

    public final String toString() {
        return String.valueOf(this.x & 4294967295L);
    }
}
