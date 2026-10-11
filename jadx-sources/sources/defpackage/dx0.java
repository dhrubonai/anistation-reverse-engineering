package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dx0 extends cx0 implements uf5 {
    public final long i;
    public final long j;

    public dx0(long j, long j2, int i, int i2, boolean z, boolean z2, long j3) {
        super(j, j2, i, i2, z, z2);
        this.i = j3;
        this.j = j == -1 ? -1L : j;
    }

    @Override // defpackage.uf5
    public final long a() {
        return this.j;
    }

    @Override // defpackage.uf5
    public final long c(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.cx0, defpackage.hf5
    public final gf5 f(long j) {
        long j2 = this.i;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.j;
            if (j3 != -1) {
                long j4 = this.c;
                long j5 = this.b;
                jf5 jf5Var = new jf5(Math.max(0L, j2 - ((Math.max(0L, (j4 + j5) - j5) * 8000000) / this.e)), Math.max(j5, j3 - j4));
                return new gf5(jf5Var, jf5Var);
            }
        }
        return super.f(j);
    }

    @Override // defpackage.uf5
    public final int g() {
        return this.e;
    }

    @Override // defpackage.cx0, defpackage.hf5
    public final long h() {
        long j = this.i;
        if (j != -9223372036854775807L) {
            return j;
        }
        return this.f;
    }
}
