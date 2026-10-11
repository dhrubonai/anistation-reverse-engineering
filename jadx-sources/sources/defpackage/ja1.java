package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ja1 extends cx1 {
    public static final ja1 z;
    public u11 y;

    /* JADX WARN: Type inference failed for: r0v0, types: [ja1, n11] */
    static {
        int i = v76.c;
        int i2 = v76.d;
        long j = v76.e;
        String str = v76.a;
        ?? n11Var = new n11();
        n11Var.y = new u11(j, str, i, i2);
        z = n11Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.n11
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        u11.p(this.y, runnable, 6);
    }

    @Override // defpackage.n11
    public final void v0(l11 l11Var, Runnable runnable) {
        u11.p(this.y, runnable, 2);
    }

    @Override // defpackage.n11
    public final n11 x0(int i) {
        wk6.k(i);
        if (i >= v76.c) {
            return this;
        }
        return super.x0(i);
    }

    @Override // defpackage.cx1
    public final Executor y0() {
        return this.y;
    }
}
