package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fy3 {
    public final ey3[] a;
    public final long b;

    public fy3(List list) {
        this((ey3[]) list.toArray(new ey3[0]));
    }

    public final fy3 a(ey3... ey3VarArr) {
        if (ey3VarArr.length == 0) {
            return this;
        }
        String str = eq6.a;
        ey3[] ey3VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(ey3VarArr2, ey3VarArr2.length + ey3VarArr.length);
        System.arraycopy(ey3VarArr, 0, copyOf, ey3VarArr2.length, ey3VarArr.length);
        return new fy3(this.b, (ey3[]) copyOf);
    }

    public final fy3 b(fy3 fy3Var) {
        if (fy3Var == null) {
            return this;
        }
        return a(fy3Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fy3.class == obj.getClass()) {
            fy3 fy3Var = (fy3) obj;
            if (Arrays.equals(this.a, fy3Var.a) && this.b == fy3Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zz.K(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public fy3(long j, ey3... ey3VarArr) {
        this.b = j;
        this.a = ey3VarArr;
    }

    public fy3(ey3... ey3VarArr) {
        this(-9223372036854775807L, ey3VarArr);
    }
}
