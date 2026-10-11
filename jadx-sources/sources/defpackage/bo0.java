package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bo0 implements AutoCloseable, v11 {
    public final l11 x;

    public bo0(l11 l11Var) {
        l11Var.getClass();
        this.x = l11Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        h98.i(this.x, null);
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.x;
    }
}
