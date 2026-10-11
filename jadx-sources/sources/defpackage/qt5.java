package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qt5 extends zx5 {
    public long c;

    public qt5(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.zx5
    public final void a(zx5 zx5Var) {
        zx5Var.getClass();
        this.c = ((qt5) zx5Var).c;
    }

    @Override // defpackage.zx5
    public final zx5 b() {
        return c(mt5.h().g());
    }

    @Override // defpackage.zx5
    public final zx5 c(long j) {
        return new qt5(j, this.c);
    }
}
