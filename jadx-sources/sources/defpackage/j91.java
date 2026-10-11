package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class j91 extends cx1 implements Executor {
    public static final j91 y = new n11();
    public static final n11 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [j91, n11] */
    static {
        go6 go6Var = go6.y;
        int i = r46.a;
        if (64 >= i) {
            i = 64;
        }
        z = go6Var.x0(ov5.g("kotlinx.coroutines.io.parallelism", i, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u0(it1.x, runnable);
    }

    @Override // defpackage.n11
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        z.u0(l11Var, runnable);
    }

    @Override // defpackage.n11
    public final void v0(l11 l11Var, Runnable runnable) {
        z.v0(l11Var, runnable);
    }

    @Override // defpackage.n11
    public final n11 x0(int i) {
        return go6.y.x0(i);
    }

    @Override // defpackage.cx1
    public final Executor y0() {
        return this;
    }
}
