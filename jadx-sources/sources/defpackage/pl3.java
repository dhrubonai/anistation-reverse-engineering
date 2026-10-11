package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pl3 implements Iterable, j73 {
    public final long x;
    public final long y;

    public pl3(long j, long j2) {
        this.x = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.y = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pl3) {
            if (!isEmpty() || !((pl3) obj).isEmpty()) {
                pl3 pl3Var = (pl3) obj;
                if (this.x == pl3Var.x && this.y == pl3Var.y) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.y) + (Long.hashCode(this.x) * 31);
    }

    public final boolean isEmpty() {
        if (this.x > this.y) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ol3(this.x, this.y);
    }

    public final String toString() {
        return this.x + ".." + this.y;
    }
}
