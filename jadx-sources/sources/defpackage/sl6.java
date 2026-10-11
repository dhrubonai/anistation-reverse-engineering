package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class sl6 implements Comparable {
    public final byte x;

    public /* synthetic */ sl6(byte b) {
        this.x = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return a34.D(this.x & 255, ((sl6) obj).x & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sl6) {
            if (this.x != ((sl6) obj).x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.x);
    }

    public final String toString() {
        return String.valueOf(this.x & 255);
    }
}
