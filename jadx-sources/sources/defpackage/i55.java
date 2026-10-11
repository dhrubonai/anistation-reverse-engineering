package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i55 {
    public final Object[] a;
    public final long b;
    public final int c;

    public i55(Object[] objArr, long j, int i) {
        this.a = objArr;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i55) {
            i55 i55Var = (i55) obj;
            if (i55Var.b == this.b && i55Var.c == this.c && Arrays.equals(i55Var.a, this.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.a;
        if (objArr != null) {
            i = Arrays.hashCode(objArr);
        } else {
            i = 0;
        }
        return Integer.hashCode(this.c) + qx1.d(i * 31, this.b, 31);
    }
}
