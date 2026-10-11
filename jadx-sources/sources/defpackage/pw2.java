package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pw2 implements Serializable {
    public static final pw2 z = new pw2(new long[0], 0);
    public final long[] x;
    public final int y;

    public pw2(long[] jArr, int i) {
        this.x = jArr;
        this.y = i;
    }

    public final long a(int i) {
        io3.r(i, this.y);
        return this.x[i];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof pw2) {
                pw2 pw2Var = (pw2) obj;
                int i = pw2Var.y;
                int i2 = this.y;
                if (i2 == i) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (a(i3) == pw2Var.a(i3)) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.y; i2++) {
            i = (i * 31) + zz.K(this.x[i2]);
        }
        return i;
    }

    public final String toString() {
        int i = this.y;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.x;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
