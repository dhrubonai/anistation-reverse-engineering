package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class la2 implements bv5 {
    public final bv5 x;

    public la2(bv5 bv5Var) {
        bv5Var.getClass();
        this.x = bv5Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.x.close();
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return this.x.d();
    }

    @Override // defpackage.bv5
    public long j0(long j, pa0 pa0Var) {
        pa0Var.getClass();
        return this.x.j0(j, pa0Var);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.x + ')';
    }
}
