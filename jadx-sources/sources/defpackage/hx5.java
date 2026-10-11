package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hx5 extends ia2 {
    public final /* synthetic */ hf5 b;
    public final /* synthetic */ ok2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx5(ok2 ok2Var, hf5 hf5Var, hf5 hf5Var2) {
        super(hf5Var);
        this.c = ok2Var;
        this.b = hf5Var2;
    }

    @Override // defpackage.ia2, defpackage.hf5
    public final gf5 f(long j) {
        gf5 f = this.b.f(j);
        jf5 jf5Var = f.a;
        long j2 = jf5Var.a;
        long j3 = jf5Var.b;
        long j4 = this.c.y;
        jf5 jf5Var2 = new jf5(j2, j3 + j4);
        jf5 jf5Var3 = f.b;
        return new gf5(jf5Var2, new jf5(jf5Var3.a, jf5Var3.b + j4));
    }
}
