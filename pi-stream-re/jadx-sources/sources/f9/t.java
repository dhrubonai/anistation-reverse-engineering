package f9;

import androidx.lifecycle.q0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import r6.h0;

/* loaded from: classes.dex */
public final class t implements Closeable {
    public static final f0 S;
    public final b9.c A;
    public final b9.c B;
    public final q0 C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public final f0 I;
    public f0 J;
    public long K;
    public long L;
    public long M;
    public long N;
    public final Socket O;
    public final c0 P;
    public final n Q;
    public final LinkedHashSet R;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4079a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4080b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4081c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4082d;

    /* renamed from: e, reason: collision with root package name */
    public int f4083e;

    /* renamed from: f, reason: collision with root package name */
    public int f4084f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4085x;

    /* renamed from: y, reason: collision with root package name */
    public final b9.f f4086y;

    /* renamed from: z, reason: collision with root package name */
    public final b9.c f4087z;

    static {
        f0 f0Var = new f0();
        f0Var.b(7, 65535);
        f0Var.b(5, 16384);
        S = f0Var;
    }

    public t(h hVar) {
        int i10;
        boolean z9 = hVar.f4042a;
        this.f4079a = z9;
        this.f4080b = hVar.f4048g;
        this.f4081c = new LinkedHashMap();
        String str = hVar.f4045d;
        if (str != null) {
            this.f4082d = str;
            if (z9) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f4084f = i10;
            b9.f fVar = hVar.f4043b;
            this.f4086y = fVar;
            b9.c f10 = fVar.f();
            this.f4087z = f10;
            this.A = fVar.f();
            this.B = fVar.f();
            this.C = hVar.f4049h;
            f0 f0Var = new f0();
            if (z9) {
                f0Var.b(7, 16777216);
            }
            this.I = f0Var;
            this.J = S;
            this.N = r3.a();
            Socket socket = hVar.f4044c;
            if (socket != null) {
                this.O = socket;
                k9.h hVar2 = hVar.f4047f;
                if (hVar2 != null) {
                    this.P = new c0(hVar2, z9);
                    k9.i iVar = hVar.f4046e;
                    if (iVar != null) {
                        this.Q = new n(this, new w(iVar, z9));
                        this.R = new LinkedHashSet();
                        int i11 = hVar.f4050i;
                        if (i11 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i11);
                            f10.c(new r(str.concat(" ping"), this, nanos), nanos);
                            return;
                        }
                        return;
                    }
                    h0.X0("source");
                    throw null;
                }
                h0.X0("sink");
                throw null;
            }
            h0.X0("socket");
            throw null;
        }
        h0.X0("connectionName");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.P.f4009d);
        r6 = r2;
        r8.M += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(int r9, boolean r10, k9.g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            f9.c0 r12 = r8.P
            r12.f(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.M     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            long r6 = r8.N     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L32
            java.util.LinkedHashMap r2 = r8.f4081c     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L57 java.lang.InterruptedException -> L59
        L32:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L57
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L57
            f9.c0 r4 = r8.P     // Catch: java.lang.Throwable -> L57
            int r4 = r4.f4009d     // Catch: java.lang.Throwable -> L57
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L57
            long r4 = r8.M     // Catch: java.lang.Throwable -> L57
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L57
            long r4 = r4 + r6
            r8.M = r4     // Catch: java.lang.Throwable -> L57
            monitor-exit(r8)
            long r12 = r12 - r6
            f9.c0 r4 = r8.P
            if (r10 == 0) goto L52
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L52
            r5 = 1
            goto L53
        L52:
            r5 = r3
        L53:
            r4.f(r5, r9, r11, r2)
            goto Ld
        L57:
            r9 = move-exception
            goto L66
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57
            r9.interrupt()     // Catch: java.lang.Throwable -> L57
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L57
            r9.<init>()     // Catch: java.lang.Throwable -> L57
            throw r9     // Catch: java.lang.Throwable -> L57
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.t.G(int, boolean, k9.g, long):void");
    }

    public final void H(int i10, b bVar) {
        this.f4087z.c(new q(this.f4082d + '[' + i10 + "] writeSynReset", this, i10, bVar, 1), 0L);
    }

    public final void I(int i10, long j4) {
        this.f4087z.c(new s(this.f4082d + '[' + i10 + "] windowUpdate", this, i10, j4), 0L);
    }

    public final void a(b bVar, b bVar2, IOException iOException) {
        int i10;
        Object[] objArr;
        byte[] bArr = z8.b.f12133a;
        try {
            v(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f4081c.isEmpty()) {
                objArr = this.f4081c.values().toArray(new b0[0]);
                this.f4081c.clear();
            } else {
                objArr = null;
            }
        }
        b0[] b0VarArr = (b0[]) objArr;
        if (b0VarArr != null) {
            for (b0 b0Var : b0VarArr) {
                try {
                    b0Var.c(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.P.close();
        } catch (IOException unused3) {
        }
        try {
            this.O.close();
        } catch (IOException unused4) {
        }
        this.f4087z.e();
        this.A.e();
        this.B.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(b.NO_ERROR, b.CANCEL, null);
    }

    public final void f(IOException iOException) {
        b bVar = b.PROTOCOL_ERROR;
        a(bVar, bVar, iOException);
    }

    public final void flush() {
        this.P.flush();
    }

    public final synchronized b0 q(int i10) {
        return (b0) this.f4081c.get(Integer.valueOf(i10));
    }

    public final synchronized boolean r(long j4) {
        if (this.f4085x) {
            return false;
        }
        if (this.G < this.F) {
            if (j4 >= this.H) {
                return false;
            }
        }
        return true;
    }

    public final synchronized b0 t(int i10) {
        b0 b0Var;
        b0Var = (b0) this.f4081c.remove(Integer.valueOf(i10));
        notifyAll();
        return b0Var;
    }

    public final void v(b bVar) {
        synchronized (this.P) {
            synchronized (this) {
                if (this.f4085x) {
                    return;
                }
                this.f4085x = true;
                this.P.r(this.f4083e, bVar, z8.b.f12133a);
            }
        }
    }

    public final synchronized void x(long j4) {
        long j10 = this.K + j4;
        this.K = j10;
        long j11 = j10 - this.L;
        if (j11 >= this.I.a() / 2) {
            I(0, j11);
            this.L += j11;
        }
    }
}
