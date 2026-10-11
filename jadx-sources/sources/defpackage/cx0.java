package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class cx0 implements hf5 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;

    public cx0(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        this.h = z2;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    @Override // defpackage.hf5
    public final boolean b() {
        if (this.d == -1 && !this.g) {
            return false;
        }
        return true;
    }

    @Override // defpackage.hf5
    public final boolean e() {
        return this.h;
    }

    @Override // defpackage.hf5
    public gf5 f(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            jf5 jf5Var = new jf5(0L, j3);
            return new gf5(jf5Var, jf5Var);
        }
        int i = this.e;
        long j4 = this.c;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        jf5 jf5Var2 = new jf5(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.a) {
                return new gf5(jf5Var2, new jf5((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new gf5(jf5Var2, jf5Var2);
    }

    @Override // defpackage.hf5
    public long h() {
        return this.f;
    }
}
