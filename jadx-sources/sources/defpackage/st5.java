package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class st5 extends zx5 {
    public Object c;

    public st5(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.zx5
    public final void a(zx5 zx5Var) {
        zx5Var.getClass();
        this.c = ((st5) zx5Var).c;
    }

    @Override // defpackage.zx5
    public final zx5 b() {
        return new st5(mt5.h().g(), this.c);
    }

    @Override // defpackage.zx5
    public final zx5 c(long j) {
        return new st5(j, this.c);
    }
}
