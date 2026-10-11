package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes2.dex */
public final class dd2 implements Comparable<dd2> {
    public static final cd2 Companion = new Object();
    public static final rb3[] G;
    public final n47 A;
    public final int B;
    public final int C;
    public final k04 D;
    public final int E;
    public final long F;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Type inference failed for: r0v0, types: [cd2, java.lang.Object] */
    static {
        vj1 vj1Var = new vj1((byte) 16);
        jf3 jf3Var = jf3.y;
        G = new rb3[]{null, null, null, bx7.B(jf3Var, vj1Var), null, null, bx7.B(jf3Var, new vj1((byte) 17)), null, null};
        s51.a(0L);
    }

    public /* synthetic */ dd2(int i, int i2, int i3, int i4, n47 n47Var, int i5, int i6, k04 k04Var, int i7, long j) {
        if (511 != (i & 511)) {
            iq4.throwMissingFieldException(i, 511, bd2.a.getDescriptor());
        }
        this.x = i2;
        this.y = i3;
        this.z = i4;
        this.A = n47Var;
        this.B = i5;
        this.C = i6;
        this.D = k04Var;
        this.E = i7;
        this.F = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(dd2 dd2Var) {
        dd2 dd2Var2 = dd2Var;
        dd2Var2.getClass();
        return a34.E(this.F, dd2Var2.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd2)) {
            return false;
        }
        dd2 dd2Var = (dd2) obj;
        if (this.x == dd2Var.x && this.y == dd2Var.y && this.z == dd2Var.z && this.A == dd2Var.A && this.B == dd2Var.B && this.C == dd2Var.C && this.D == dd2Var.D && this.E == dd2Var.E && this.F == dd2Var.F) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.F) + qx1.c(this.E, (this.D.hashCode() + qx1.c(this.C, qx1.c(this.B, (this.A.hashCode() + qx1.c(this.z, qx1.c(this.y, Integer.hashCode(this.x) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.x + ", minutes=" + this.y + ", hours=" + this.z + ", dayOfWeek=" + this.A + ", dayOfMonth=" + this.B + ", dayOfYear=" + this.C + ", month=" + this.D + ", year=" + this.E + ", timestamp=" + this.F + ')';
    }

    public dd2(int i, int i2, int i3, n47 n47Var, int i4, int i5, k04 k04Var, int i6, long j) {
        n47Var.getClass();
        k04Var.getClass();
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.A = n47Var;
        this.B = i4;
        this.C = i5;
        this.D = k04Var;
        this.E = i6;
        this.F = j;
    }
}
