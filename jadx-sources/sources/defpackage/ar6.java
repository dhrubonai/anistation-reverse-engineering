package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ar6 implements uf5 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public ar6(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = z51.j(j3 - j2, j);
    }

    @Override // defpackage.uf5
    public final long a() {
        return this.d;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.uf5
    public final long c(long j) {
        return this.a[eq6.f(this.b, j, true)];
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        long[] jArr = this.a;
        int f = eq6.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        jf5 jf5Var = new jf5(j2, jArr2[f]);
        if (j2 < j && f != jArr.length - 1) {
            int i = f + 1;
            return new gf5(jf5Var, new jf5(jArr[i], jArr2[i]));
        }
        return new gf5(jf5Var, jf5Var);
    }

    @Override // defpackage.uf5
    public final int g() {
        return this.e;
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.c;
    }
}
