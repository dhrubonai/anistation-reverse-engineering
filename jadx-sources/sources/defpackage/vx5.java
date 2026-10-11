package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vx5 extends zx5 {
    public n2 c;
    public int d;
    public int e;

    public vx5(long j, n2 n2Var) {
        super(j);
        this.c = n2Var;
    }

    @Override // defpackage.zx5
    public final void a(zx5 zx5Var) {
        synchronized (n03.u) {
            zx5Var.getClass();
            this.c = ((vx5) zx5Var).c;
            this.d = ((vx5) zx5Var).d;
            this.e = ((vx5) zx5Var).e;
        }
    }

    @Override // defpackage.zx5
    public final zx5 b() {
        return c(mt5.h().g());
    }

    @Override // defpackage.zx5
    public final zx5 c(long j) {
        return new vx5(j, this.c);
    }
}
