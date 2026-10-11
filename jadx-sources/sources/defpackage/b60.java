package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b60 implements hf5 {
    public final d60 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public b60(d60 d60Var, long j, long j2, long j3, long j4, long j5) {
        this.a = d60Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.hf5
    public final boolean b() {
        return true;
    }

    @Override // defpackage.hf5
    public final gf5 f(long j) {
        jf5 jf5Var = new jf5(j, c60.a(this.a.g(j), 0L, this.c, this.d, this.e, this.f));
        return new gf5(jf5Var, jf5Var);
    }

    @Override // defpackage.hf5
    public final long h() {
        return this.b;
    }
}
