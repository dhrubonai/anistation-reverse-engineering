package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class p12 implements pq5 {
    public final Object A;
    public final /* synthetic */ byte x = 0;
    public boolean y;
    public final Object z;

    public p12(uo2 uo2Var) {
        this.A = uo2Var;
        this.z = new na2(uo2Var.d.d());
    }

    @Override // defpackage.pq5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte b = this.x;
        Object obj = this.z;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                try {
                    ((pq5) obj).close();
                    return;
                } catch (IOException e) {
                    this.y = true;
                    ((lz0) obj2).invoke(e);
                    return;
                }
            default:
                uo2 uo2Var = (uo2) obj2;
                if (!this.y) {
                    this.y = true;
                    na2 na2Var = (na2) obj;
                    of6 of6Var = na2Var.e;
                    na2Var.e = of6.d;
                    of6Var.a();
                    of6Var.b();
                    uo2Var.e = (byte) 3;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.pq5
    public final of6 d() {
        byte b = this.x;
        Object obj = this.z;
        switch (b) {
            case 0:
                return ((pq5) obj).d();
            default:
                return (na2) obj;
        }
    }

    @Override // defpackage.pq5
    public final void f0(long j, pa0 pa0Var) {
        byte b = this.x;
        Object obj = this.A;
        switch (b) {
            case 0:
                if (this.y) {
                    pa0Var.skip(j);
                    return;
                }
                try {
                    ((pq5) this.z).f0(j, pa0Var);
                    return;
                } catch (IOException e) {
                    this.y = true;
                    ((lz0) obj).invoke(e);
                    return;
                }
            default:
                if (!this.y) {
                    dq6.c(pa0Var.y, 0L, j);
                    ((uo2) obj).d.f0(j, pa0Var);
                    return;
                } else {
                    ze0.m("closed");
                    return;
                }
        }
    }

    @Override // defpackage.pq5, java.io.Flushable
    public final void flush() {
        byte b = this.x;
        Object obj = this.A;
        switch (b) {
            case 0:
                try {
                    ((pq5) this.z).flush();
                    return;
                } catch (IOException e) {
                    this.y = true;
                    ((lz0) obj).invoke(e);
                    return;
                }
            default:
                if (!this.y) {
                    ((uo2) obj).d.flush();
                    return;
                }
                return;
        }
    }

    public p12(pq5 pq5Var, lz0 lz0Var) {
        this.z = pq5Var;
        this.A = lz0Var;
    }
}
