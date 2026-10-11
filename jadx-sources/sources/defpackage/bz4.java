package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class bz4 implements nf0 {
    public final az4 A;
    public final AtomicBoolean B;
    public Object C;
    public yw1 D;
    public ez4 E;
    public qb0 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public volatile boolean J;
    public volatile qb0 K;
    public volatile ez4 L;
    public final jd4 x;
    public final l35 y;
    public final cs1 z;

    public bz4(jd4 jd4Var, l35 l35Var) {
        jd4Var.getClass();
        l35Var.getClass();
        this.x = jd4Var;
        this.y = l35Var;
        this.z = (cs1) jd4Var.y.x;
        jd4Var.B.getClass();
        az4 az4Var = new az4(this);
        az4Var.g(0L, TimeUnit.MILLISECONDS);
        this.A = az4Var;
        this.B = new AtomicBoolean();
        this.I = true;
    }

    public final void a(ez4 ez4Var) {
        byte[] bArr = dq6.a;
        if (this.E == null) {
            this.E = ez4Var;
            ez4Var.p.add(new zy4(this, this.C));
        } else {
            ze0.m("Check failed.");
        }
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket j;
        byte[] bArr = dq6.a;
        ez4 ez4Var = this.E;
        if (ez4Var != null) {
            synchronized (ez4Var) {
                j = j();
            }
            if (this.E == null) {
                if (j != null) {
                    dq6.e(j);
                }
            } else if (j != null) {
                ze0.m("Check failed.");
                return null;
            }
        }
        if (!this.A.i()) {
            interruptedIOException = iOException;
        } else {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final void c() {
        Socket socket;
        if (this.J) {
            return;
        }
        this.J = true;
        qb0 qb0Var = this.K;
        if (qb0Var != null) {
            ((xw1) qb0Var.A).cancel();
        }
        ez4 ez4Var = this.L;
        if (ez4Var != null && (socket = ez4Var.c) != null) {
            dq6.e(socket);
        }
    }

    public final Object clone() {
        return new bz4(this.x, this.y);
    }

    public final void d(tf0 tf0Var) {
        yy4 yy4Var;
        if (this.B.compareAndSet(false, true)) {
            lm4 lm4Var = lm4.a;
            this.C = lm4.a.g();
            nh1 nh1Var = this.x.x;
            yy4 yy4Var2 = new yy4(this, tf0Var);
            nh1Var.getClass();
            synchronized (nh1Var) {
                nh1Var.d.add(yy4Var2);
                String str = this.y.a.d;
                Iterator it = nh1Var.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        yy4Var = (yy4) it.next();
                        if (a34.i(yy4Var.z.y.a.d, str)) {
                            break;
                        }
                    } else {
                        Iterator it2 = nh1Var.d.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                yy4Var = (yy4) it2.next();
                                if (a34.i(yy4Var.z.y.a.d, str)) {
                                    break;
                                }
                            } else {
                                yy4Var = null;
                                break;
                            }
                        }
                    }
                }
                if (yy4Var != null) {
                    yy4Var2.y = yy4Var.y;
                }
            }
            nh1Var.c();
            return;
        }
        ze0.m("Already Executed");
    }

    public final p45 e() {
        if (this.B.compareAndSet(false, true)) {
            this.A.h();
            lm4 lm4Var = lm4.a;
            this.C = lm4.a.g();
            try {
                nh1 nh1Var = this.x.x;
                synchronized (nh1Var) {
                    nh1Var.f.add(this);
                }
                return g();
            } finally {
                nh1 nh1Var2 = this.x.x;
                nh1Var2.getClass();
                nh1Var2.a(nh1Var2.f, this);
            }
        }
        ze0.m("Already Executed");
        return null;
    }

    public final void f(boolean z) {
        qb0 qb0Var;
        synchronized (this) {
            if (!this.I) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (qb0Var = this.K) != null) {
            ((xw1) qb0Var.A).cancel();
            ((bz4) qb0Var.y).h(qb0Var, true, true, null);
        }
        this.F = null;
    }

    public final p45 g() {
        ArrayList arrayList = new ArrayList();
        dp0.Y(this.x.z, arrayList);
        arrayList.add(new r90(this.x));
        arrayList.add(new r90(this.x.G));
        this.x.getClass();
        arrayList.add(new rv0((byte) 2));
        arrayList.add(rv0.b);
        dp0.Y(this.x.A, arrayList);
        arrayList.add(new rv0((byte) 3));
        l35 l35Var = this.y;
        jd4 jd4Var = this.x;
        try {
            try {
                p45 f = new tc3(this, arrayList, 0, null, l35Var, jd4Var.S, jd4Var.T, jd4Var.U).f(this.y);
                if (!this.J) {
                    i(null);
                    return f;
                }
                dq6.d(f);
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException i = i(e);
                i.getClass();
                throw i;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:48:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:7:0x001a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:48:0x0011, B:10:0x0020, B:12:0x0024, B:13:0x0026, B:15:0x002a, B:19:0x0033, B:21:0x0037, B:7:0x001a), top: B:47:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException h(defpackage.qb0 r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            r3.getClass()
            qb0 r0 = r2.K
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lc
            goto L5e
        Lc:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L18
            boolean r1 = r2.G     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1e
            goto L18
        L16:
            r3 = move-exception
            goto L3f
        L18:
            if (r5 == 0) goto L41
            boolean r1 = r2.H     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L41
        L1e:
            if (r4 == 0) goto L22
            r2.G = r0     // Catch: java.lang.Throwable -> L16
        L22:
            if (r5 == 0) goto L26
            r2.H = r0     // Catch: java.lang.Throwable -> L16
        L26:
            boolean r4 = r2.G     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L30
            boolean r5 = r2.H     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L30
            r5 = r3
            goto L31
        L30:
            r5 = r0
        L31:
            if (r4 != 0) goto L3c
            boolean r4 = r2.H     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L3c
            boolean r4 = r2.I     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L3c
            r0 = r3
        L3c:
            r4 = r0
            r0 = r5
            goto L42
        L3f:
            monitor-exit(r2)
            throw r3
        L41:
            r4 = r0
        L42:
            monitor-exit(r2)
            if (r0 == 0) goto L57
            r5 = 0
            r2.K = r5
            ez4 r5 = r2.E
            if (r5 == 0) goto L57
            monitor-enter(r5)
            int r0 = r5.m     // Catch: java.lang.Throwable -> L54
            int r0 = r0 + r3
            r5.m = r0     // Catch: java.lang.Throwable -> L54
            monitor-exit(r5)
            goto L57
        L54:
            r2 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            throw r2
        L57:
            if (r4 == 0) goto L5e
            java.io.IOException r2 = r2.b(r6)
            return r2
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz4.h(qb0, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.I) {
                this.I = false;
                if (!this.G) {
                    if (!this.H) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return b(iOException);
        }
        return iOException;
    }

    public final Socket j() {
        ez4 ez4Var = this.E;
        ez4Var.getClass();
        byte[] bArr = dq6.a;
        ArrayList arrayList = ez4Var.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (a34.i(((Reference) obj).get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.E = null;
            if (!arrayList.isEmpty()) {
                return null;
            }
            ez4Var.q = System.nanoTime();
            cs1 cs1Var = this.z;
            t76 t76Var = (t76) cs1Var.b;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) cs1Var.d;
            byte[] bArr2 = dq6.a;
            if (!ez4Var.j) {
                t76Var.c((cp2) cs1Var.c, 0L);
                return null;
            }
            ez4Var.j = true;
            concurrentLinkedQueue.remove(ez4Var);
            if (concurrentLinkedQueue.isEmpty()) {
                t76Var.a();
            }
            Socket socket = ez4Var.d;
            socket.getClass();
            return socket;
        }
        ze0.m("Check failed.");
        return null;
    }
}
