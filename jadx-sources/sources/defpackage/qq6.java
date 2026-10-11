package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qq6 implements Comparable, Serializable {
    public static final qq6 z = new qq6(0, 0);
    public final long x;
    public final long y;

    public qq6(long j, long j2) {
        this.x = j;
        this.y = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qq6 qq6Var = (qq6) obj;
        qq6Var.getClass();
        long j = qq6Var.x;
        long j2 = this.x;
        if (j2 != j) {
            return Long.compareUnsigned(j2, j);
        }
        return Long.compareUnsigned(this.y, qq6Var.y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq6)) {
            return false;
        }
        qq6 qq6Var = (qq6) obj;
        if (this.x == qq6Var.x && this.y == qq6Var.y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.x ^ this.y);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        fy5.c(this.x, bArr, 0, 0, 4);
        bArr[8] = 45;
        fy5.c(this.x, bArr, 9, 4, 6);
        bArr[13] = 45;
        fy5.c(this.x, bArr, 14, 6, 8);
        bArr[18] = 45;
        fy5.c(this.y, bArr, 19, 0, 2);
        bArr[23] = 45;
        fy5.c(this.y, bArr, 24, 2, 8);
        return new String(bArr, kl0.a);
    }
}
