package f9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import r6.h0;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3982a;

    /* renamed from: b, reason: collision with root package name */
    public final t f3983b;

    /* renamed from: c, reason: collision with root package name */
    public long f3984c;

    /* renamed from: d, reason: collision with root package name */
    public long f3985d;

    /* renamed from: e, reason: collision with root package name */
    public long f3986e;

    /* renamed from: f, reason: collision with root package name */
    public long f3987f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f3988g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3989h;

    /* renamed from: i, reason: collision with root package name */
    public final z f3990i;

    /* renamed from: j, reason: collision with root package name */
    public final y f3991j;

    /* renamed from: k, reason: collision with root package name */
    public final a0 f3992k;

    /* renamed from: l, reason: collision with root package name */
    public final a0 f3993l;

    /* renamed from: m, reason: collision with root package name */
    public b f3994m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f3995n;

    public b0(int i10, t tVar, boolean z9, boolean z10, y8.o oVar) {
        this.f3982a = i10;
        this.f3983b = tVar;
        this.f3987f = tVar.J.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f3988g = arrayDeque;
        this.f3990i = new z(this, tVar.I.a(), z10);
        this.f3991j = new y(this, z9);
        this.f3992k = new a0(this);
        this.f3993l = new a0(this);
        if (oVar != null) {
            if (!h()) {
                arrayDeque.add(oVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        }
        if (h()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z9;
        boolean i10;
        byte[] bArr = z8.b.f12133a;
        synchronized (this) {
            z zVar = this.f3990i;
            if (!zVar.f4114b && zVar.f4117e) {
                y yVar = this.f3991j;
                if (yVar.f4109a || yVar.f4111c) {
                    z9 = true;
                    i10 = i();
                }
            }
            z9 = false;
            i10 = i();
        }
        if (z9) {
            c(b.CANCEL, null);
        } else if (!i10) {
            this.f3983b.t(this.f3982a);
        }
    }

    public final void b() {
        y yVar = this.f3991j;
        if (!yVar.f4111c) {
            if (!yVar.f4109a) {
                if (this.f3994m != null) {
                    IOException iOException = this.f3995n;
                    if (iOException == null) {
                        b bVar = this.f3994m;
                        h0.q(bVar);
                        throw new g0(bVar);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(b bVar, IOException iOException) {
        if (!d(bVar, iOException)) {
            return;
        }
        t tVar = this.f3983b;
        tVar.getClass();
        tVar.P.x(this.f3982a, bVar);
    }

    public final boolean d(b bVar, IOException iOException) {
        byte[] bArr = z8.b.f12133a;
        synchronized (this) {
            if (this.f3994m != null) {
                return false;
            }
            this.f3994m = bVar;
            this.f3995n = iOException;
            notifyAll();
            if (this.f3990i.f4114b) {
                if (this.f3991j.f4109a) {
                    return false;
                }
            }
            this.f3983b.t(this.f3982a);
            return true;
        }
    }

    public final void e(b bVar) {
        if (!d(bVar, null)) {
            return;
        }
        this.f3983b.H(this.f3982a, bVar);
    }

    public final synchronized b f() {
        return this.f3994m;
    }

    public final y g() {
        boolean z9;
        synchronized (this) {
            if (!this.f3989h && !h()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f3991j;
    }

    public final boolean h() {
        boolean z9;
        if ((this.f3982a & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f3983b.f4079a == z9) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.f3994m != null) {
            return false;
        }
        z zVar = this.f3990i;
        if (zVar.f4114b || zVar.f4117e) {
            y yVar = this.f3991j;
            if (yVar.f4109a || yVar.f4111c) {
                if (this.f3989h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x001f, B:11:0x0023, B:19:0x0016), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(y8.o r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            r6.h0.u(r3, r0)
            byte[] r0 = z8.b.f12133a
            monitor-enter(r2)
            boolean r0 = r2.f3989h     // Catch: java.lang.Throwable -> L35
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto L10
            goto L16
        L10:
            f9.z r3 = r2.f3990i     // Catch: java.lang.Throwable -> L35
            r3.getClass()     // Catch: java.lang.Throwable -> L35
            goto L1d
        L16:
            r2.f3989h = r1     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r0 = r2.f3988g     // Catch: java.lang.Throwable -> L35
            r0.add(r3)     // Catch: java.lang.Throwable -> L35
        L1d:
            if (r4 == 0) goto L23
            f9.z r3 = r2.f3990i     // Catch: java.lang.Throwable -> L35
            r3.f4114b = r1     // Catch: java.lang.Throwable -> L35
        L23:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L35
            r2.notifyAll()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)
            if (r3 != 0) goto L34
            f9.t r3 = r2.f3983b
            int r4 = r2.f3982a
            r3.t(r4)
        L34:
            return
        L35:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.b0.j(y8.o, boolean):void");
    }

    public final synchronized void k(b bVar) {
        if (this.f3994m == null) {
            this.f3994m = bVar;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
