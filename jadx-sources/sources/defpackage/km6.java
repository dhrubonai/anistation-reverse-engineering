package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class km6 implements Comparable {
    public final short x;

    public /* synthetic */ km6(short s) {
        this.x = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return a34.D(this.x & 65535, ((km6) obj).x & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof km6) {
            if (this.x != ((km6) obj).x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.x);
    }

    public final String toString() {
        return String.valueOf(this.x & 65535);
    }
}
