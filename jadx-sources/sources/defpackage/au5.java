package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class au5 extends zx5 {
    public bl4 c;
    public int d;

    public au5(long j, bl4 bl4Var) {
        super(j);
        this.c = bl4Var;
    }

    @Override // defpackage.zx5
    public final void a(zx5 zx5Var) {
        zx5Var.getClass();
        au5 au5Var = (au5) zx5Var;
        synchronized (q23.g) {
            this.c = au5Var.c;
            this.d = au5Var.d;
        }
    }

    @Override // defpackage.zx5
    public final zx5 b() {
        return new au5(mt5.h().g(), this.c);
    }

    @Override // defpackage.zx5
    public final zx5 c(long j) {
        return new au5(j, this.c);
    }
}
