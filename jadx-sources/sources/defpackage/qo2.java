package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qo2 implements pq5 {
    public final na2 x;
    public boolean y;
    public final /* synthetic */ uo2 z;

    public qo2(uo2 uo2Var) {
        this.z = uo2Var;
        this.x = new na2(uo2Var.d.d());
    }

    @Override // defpackage.pq5, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.y) {
            return;
        }
        this.y = true;
        this.z.d.V("0\r\n\r\n");
        na2 na2Var = this.x;
        of6 of6Var = na2Var.e;
        na2Var.e = of6.d;
        of6Var.a();
        of6Var.b();
        this.z.e = (byte) 3;
    }

    @Override // defpackage.pq5
    public final of6 d() {
        return this.x;
    }

    @Override // defpackage.pq5
    public final void f0(long j, pa0 pa0Var) {
        cb0 cb0Var = this.z.d;
        if (!this.y) {
            if (j == 0) {
                return;
            }
            cb0Var.b0(j);
            cb0Var.V("\r\n");
            cb0Var.f0(j, pa0Var);
            cb0Var.V("\r\n");
            return;
        }
        ze0.m("closed");
    }

    @Override // defpackage.pq5, java.io.Flushable
    public final synchronized void flush() {
        if (this.y) {
            return;
        }
        this.z.d.flush();
    }
}
