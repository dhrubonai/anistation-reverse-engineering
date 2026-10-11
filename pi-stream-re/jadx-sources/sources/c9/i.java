package c9;

import androidx.lifecycle.q0;
import c1.i0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import r6.h0;
import y8.d0;
import y8.w;

/* loaded from: classes.dex */
public final class i implements y8.d {
    public k A;
    public boolean B;
    public e C;
    public boolean D;
    public boolean E;
    public boolean F;
    public volatile boolean G;
    public volatile e H;
    public volatile k I;

    /* renamed from: a, reason: collision with root package name */
    public final w f2128a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.widget.w f2129b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2130c;

    /* renamed from: d, reason: collision with root package name */
    public final l f2131d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f2132e;

    /* renamed from: f, reason: collision with root package name */
    public final h f2133f;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f2134x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2135y;

    /* renamed from: z, reason: collision with root package name */
    public f f2136z;

    public i(w wVar, androidx.appcompat.widget.w wVar2, boolean z9) {
        h0.u(wVar, "client");
        h0.u(wVar2, "originalRequest");
        this.f2128a = wVar;
        this.f2129b = wVar2;
        this.f2130c = z9;
        this.f2131d = (l) wVar.f11831b.f3961a;
        q0 q0Var = (q0) wVar.f11834e.f10698b;
        byte[] bArr = z8.b.f12133a;
        h0.u(q0Var, "$this_asFactory");
        this.f2132e = q0Var;
        h hVar = new h(this);
        hVar.g(wVar.N, TimeUnit.MILLISECONDS);
        this.f2133f = hVar;
        this.f2134x = new AtomicBoolean();
        this.F = true;
    }

    public final void a(k kVar) {
        boolean z9;
        byte[] bArr = z8.b.f12133a;
        if (this.A == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.A = kVar;
            kVar.f2151p.add(new g(this, this.f2135y));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException b(IOException iOException) {
        IOException iOException2;
        Socket h10;
        boolean z9;
        byte[] bArr = z8.b.f12133a;
        k kVar = this.A;
        if (kVar != null) {
            synchronized (kVar) {
                h10 = h();
            }
            if (this.A == null) {
                if (h10 != null) {
                    z8.b.d(h10);
                }
                this.f2132e.getClass();
            } else {
                if (h10 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (this.B || !this.f2133f.i()) {
            iOException2 = iOException;
        } else {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        }
        if (iOException != null) {
            q0 q0Var = this.f2132e;
            h0.q(iOException2);
            q0Var.getClass();
        } else {
            this.f2132e.getClass();
        }
        return iOException2;
    }

    public final d0 c() {
        if (this.f2134x.compareAndSet(false, true)) {
            this.f2133f.h();
            g9.l lVar = g9.l.f4517a;
            this.f2135y = g9.l.f4517a.g();
            this.f2132e.getClass();
            try {
                i0 i0Var = this.f2128a.f11830a;
                synchronized (i0Var) {
                    ((ArrayDeque) i0Var.f1718g).add(this);
                }
                return e();
            } finally {
                this.f2128a.f11830a.c(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final Object clone() {
        return new i(this.f2128a, this.f2129b, this.f2130c);
    }

    public final void d(boolean z9) {
        e eVar;
        synchronized (this) {
            if (!this.F) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z9 && (eVar = this.H) != null) {
            eVar.f2112d.cancel();
            eVar.f2109a.f(eVar, true, true, null);
        }
        this.C = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y8.d0 e() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            y8.w r0 = r10.f2128a
            java.util.List r0 = r0.f11832c
            x6.l.p0(r0, r2)
            d9.g r0 = new d9.g
            y8.w r1 = r10.f2128a
            r0.<init>(r1)
            r2.add(r0)
            d9.a r0 = new d9.a
            y8.w r1 = r10.f2128a
            y8.l r1 = r1.A
            r0.<init>(r1)
            r2.add(r0)
            a9.a r0 = new a9.a
            y8.w r1 = r10.f2128a
            r1.getClass()
            r0.<init>()
            r2.add(r0)
            c9.a r0 = c9.a.f2091a
            r2.add(r0)
            boolean r0 = r10.f2130c
            if (r0 != 0) goto L3f
            y8.w r0 = r10.f2128a
            java.util.List r0 = r0.f11833d
            x6.l.p0(r0, r2)
        L3f:
            d9.b r0 = new d9.b
            boolean r1 = r10.f2130c
            r0.<init>(r1)
            r2.add(r0)
            d9.f r9 = new d9.f
            r3 = 0
            r4 = 0
            androidx.appcompat.widget.w r5 = r10.f2129b
            y8.w r0 = r10.f2128a
            int r6 = r0.O
            int r7 = r0.P
            int r8 = r0.Q
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            androidx.appcompat.widget.w r1 = r10.f2129b     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            y8.d0 r1 = r9.b(r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            boolean r2 = r10.G     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            if (r2 != 0) goto L6b
            r10.g(r0)
            return r1
        L6b:
            z8.b.c(r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            throw r1     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
        L76:
            r1 = move-exception
            r2 = 0
            goto L86
        L79:
            r1 = move-exception
            java.io.IOException r1 = r10.g(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r6.h0.r(r1, r2)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r1 = move-exception
            r2 = 1
        L86:
            if (r2 != 0) goto L8b
            r10.g(r0)
        L8b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.i.e():y8.d0");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:43:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001b), top: B:42:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:43:0x0012, B:12:0x0021, B:14:0x0025, B:15:0x0027, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001b), top: B:42:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException f(c9.e r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            r6.h0.u(r2, r0)
            c9.e r0 = r1.H
            boolean r2 = r6.h0.g(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.D     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L41
        L19:
            if (r4 == 0) goto L43
            boolean r0 = r1.E     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L43
        L1f:
            if (r3 == 0) goto L23
            r1.D = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.E = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.D     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.E     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.E     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.F     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L44
        L41:
            monitor-exit(r1)
            throw r2
        L43:
            r3 = r2
        L44:
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.H = r2
            c9.k r2 = r1.A
            if (r2 == 0) goto L51
            r2.h()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.b(r5)
            return r2
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.i.f(c9.e, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException g(IOException iOException) {
        boolean z9;
        synchronized (this) {
            z9 = false;
            if (this.F) {
                this.F = false;
                if (!this.D) {
                    if (!this.E) {
                        z9 = true;
                    }
                }
            }
        }
        if (z9) {
            return b(iOException);
        }
        return iOException;
    }

    public final Socket h() {
        boolean z9;
        k kVar = this.A;
        h0.q(kVar);
        byte[] bArr = z8.b.f12133a;
        ArrayList arrayList = kVar.f2151p;
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (h0.g(((Reference) it.next()).get(), this)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            arrayList.remove(i10);
            this.A = null;
            if (arrayList.isEmpty()) {
                kVar.f2152q = System.nanoTime();
                l lVar = this.f2131d;
                lVar.getClass();
                byte[] bArr2 = z8.b.f12133a;
                boolean z11 = kVar.f2146j;
                b9.c cVar = lVar.f2155c;
                if (!z11 && lVar.f2153a != 0) {
                    cVar.c(lVar.f2156d, 0L);
                } else {
                    kVar.f2146j = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f2157e;
                    concurrentLinkedQueue.remove(kVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    z10 = true;
                }
                if (z10) {
                    Socket socket = kVar.f2140d;
                    h0.q(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
