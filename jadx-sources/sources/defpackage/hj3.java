package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hj3 {
    public long a;
    public long b;
    public long c;
    public long d;
    public Object e;
    public Object f;
    public Object g = t15.D;

    public hj3(long j, v41 v41Var, long j2) {
        this.a = j;
        this.e = v41Var;
        this.f = v41Var.a;
        this.b = j2;
    }

    public void a(te6 te6Var, long j, long j2, float[] fArr, long j3) {
        boolean z;
        long j4 = te6Var.g;
        if (j3 - j4 <= 0 && j4 != Long.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            te6Var.g = j3;
            te6Var.a(te6Var.e, te6Var.f, j, j2, fArr);
        }
    }

    public boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (!c13.b(j2, this.b)) {
            this.b = j2;
            z = true;
        } else {
            z = false;
        }
        if (!c13.b(j, this.c)) {
            this.c = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 != this.d) {
            this.d = j3;
            return true;
        }
        return z;
    }
}
