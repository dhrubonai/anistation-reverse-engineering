package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class to2 extends po2 {
    public boolean A;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.y) {
            return;
        }
        if (!this.A) {
            a();
        }
        this.y = true;
    }

    @Override // defpackage.po2, defpackage.bv5
    public final long j0(long j, pa0 pa0Var) {
        pa0Var.getClass();
        if (j >= 0) {
            if (!this.y) {
                if (this.A) {
                    return -1L;
                }
                long j0 = super.j0(j, pa0Var);
                if (j0 == -1) {
                    this.A = true;
                    a();
                    return -1L;
                }
                return j0;
            }
            ze0.m("closed");
            return 0L;
        }
        ze0.e(h11.h(j, "byteCount < 0: "));
        return 0L;
    }
}
