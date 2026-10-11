package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class lp2 {
    public final int a;
    public final ep2 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final jp2 i;
    public final ip2 j;
    public final kp2 k;
    public final kp2 l;
    public int m;
    public IOException n;

    public lp2(int i, ep2 ep2Var, boolean z, boolean z2, ik2 ik2Var) {
        ep2Var.getClass();
        this.a = i;
        this.b = ep2Var;
        this.f = ep2Var.N.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new jp2(this, ep2Var.M.a(), z2);
        this.j = new ip2(this, z);
        this.k = new kp2(this);
        this.l = new kp2(this);
        if (ik2Var != null) {
            if (!g()) {
                arrayDeque.add(ik2Var);
                return;
            } else {
                ze0.m("locally-initiated streams shouldn't have headers yet");
                throw null;
            }
        }
        if (g()) {
            return;
        }
        ze0.m("remotely-initiated streams should have headers");
        throw null;
    }

    public final void a() {
        boolean z;
        boolean h;
        byte[] bArr = dq6.a;
        synchronized (this) {
            try {
                jp2 jp2Var = this.i;
                if (!jp2Var.y && jp2Var.B) {
                    ip2 ip2Var = this.j;
                    if (!ip2Var.x) {
                        if (ip2Var.z) {
                        }
                    }
                    z = true;
                    h = h();
                }
                z = false;
                h = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else if (!h) {
            this.b.p(this.a);
        }
    }

    public final void b() {
        ip2 ip2Var = this.j;
        if (!ip2Var.z) {
            if (!ip2Var.x) {
                int i = this.m;
                if (i != 0) {
                    IOException iOException = this.n;
                    if (iOException == null) {
                        if (i == 0) {
                            throw null;
                        }
                        throw new yy5(i);
                    }
                    throw iOException;
                }
                return;
            }
            qi2.k("stream finished");
            return;
        }
        qi2.k("stream closed");
    }

    public final void c(int i, IOException iOException) {
        if (i != 0) {
            if (!d(i, iOException)) {
                return;
            }
            ep2 ep2Var = this.b;
            ep2Var.getClass();
            ep2Var.T.G(this.a, i);
            return;
        }
        throw null;
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = dq6.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.y) {
                if (this.j.x) {
                    return false;
                }
            }
            this.b.p(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i != 0) {
            if (!d(i, null)) {
                return;
            }
            this.b.G(this.a, i);
            return;
        }
        throw null;
    }

    public final ip2 f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z;
        if ((this.a & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.b.getClass();
        if (true == z) {
            return true;
        }
        return false;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != 0) {
                return false;
            }
            jp2 jp2Var = this.i;
            if (!jp2Var.y) {
                if (jp2Var.B) {
                }
                return true;
            }
            ip2 ip2Var = this.j;
            if (ip2Var.x || ip2Var.z) {
                if (this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0006, B:8:0x000e, B:10:0x001f, B:11:0x0023, B:19:0x0016), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.ik2 r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            byte[] r0 = defpackage.dq6.a
            monitor-enter(r2)
            boolean r0 = r2.h     // Catch: java.lang.Throwable -> L14
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto Le
            goto L16
        Le:
            jp2 r3 = r2.i     // Catch: java.lang.Throwable -> L14
            r3.getClass()     // Catch: java.lang.Throwable -> L14
            goto L1d
        L14:
            r3 = move-exception
            goto L35
        L16:
            r2.h = r1     // Catch: java.lang.Throwable -> L14
            java.util.ArrayDeque r0 = r2.g     // Catch: java.lang.Throwable -> L14
            r0.add(r3)     // Catch: java.lang.Throwable -> L14
        L1d:
            if (r4 == 0) goto L23
            jp2 r3 = r2.i     // Catch: java.lang.Throwable -> L14
            r3.y = r1     // Catch: java.lang.Throwable -> L14
        L23:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L14
            r2.notifyAll()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            if (r3 != 0) goto L34
            ep2 r3 = r2.b
            int r2 = r2.a
            r3.p(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp2.i(ik2, boolean):void");
    }
}
