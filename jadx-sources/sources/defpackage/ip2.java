package defpackage;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ip2 implements pq5 {
    public final /* synthetic */ lp2 A;
    public final boolean x;
    public final pa0 y = new Object();
    public boolean z;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, pa0] */
    public ip2(lp2 lp2Var, boolean z) {
        this.A = lp2Var;
        this.x = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z) {
        long min;
        boolean z2;
        boolean z3;
        lp2 lp2Var = this.A;
        synchronized (lp2Var) {
            lp2Var.l.h();
            while (lp2Var.e >= lp2Var.f && !this.x && !this.z) {
                try {
                    synchronized (lp2Var) {
                        int i = lp2Var.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            lp2Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    lp2Var.l.k();
                    throw th;
                }
            }
            lp2Var.l.k();
            lp2Var.b();
            min = Math.min(lp2Var.f - lp2Var.e, this.y.y);
            lp2Var.e += min;
            if (z && min == this.y.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2;
        }
        this.A.l.h();
        try {
            lp2 lp2Var2 = this.A;
            lp2Var2.b.A(lp2Var2.a, z3, this.y, min);
        } finally {
            this.A.l.k();
        }
    }

    @Override // defpackage.pq5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        lp2 lp2Var = this.A;
        byte[] bArr = dq6.a;
        synchronized (lp2Var) {
            if (this.z) {
                return;
            }
            synchronized (lp2Var) {
                int i = lp2Var.m;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            lp2 lp2Var2 = this.A;
            if (!lp2Var2.j.x) {
                if (this.y.y > 0) {
                    while (this.y.y > 0) {
                        a(true);
                    }
                } else if (z) {
                    lp2Var2.b.A(lp2Var2.a, true, null, 0L);
                }
            }
            synchronized (this.A) {
                this.z = true;
            }
            this.A.b.flush();
            this.A.a();
        }
    }

    @Override // defpackage.pq5
    public final of6 d() {
        return this.A.l;
    }

    @Override // defpackage.pq5
    public final void f0(long j, pa0 pa0Var) {
        byte[] bArr = dq6.a;
        pa0 pa0Var2 = this.y;
        pa0Var2.f0(j, pa0Var);
        while (pa0Var2.y >= 16384) {
            a(false);
        }
    }

    @Override // defpackage.pq5, java.io.Flushable
    public final void flush() {
        lp2 lp2Var = this.A;
        byte[] bArr = dq6.a;
        synchronized (lp2Var) {
            lp2Var.b();
        }
        while (this.y.y > 0) {
            a(false);
            this.A.b.flush();
        }
    }
}
