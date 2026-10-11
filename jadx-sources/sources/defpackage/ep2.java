package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ep2 implements Closeable {
    public static final jl5 W;
    public int A;
    public int B;
    public boolean C;
    public final u76 D;
    public final t76 E;
    public final t76 F;
    public final t76 G;
    public final p7 H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final jl5 M;
    public jl5 N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public final Socket S;
    public final mp2 T;
    public final uh0 U;
    public final LinkedHashSet V;
    public final xo2 x;
    public final LinkedHashMap y = new LinkedHashMap();
    public final String z;

    static {
        jl5 jl5Var = new jl5();
        jl5Var.b(7, 65535);
        jl5Var.b(5, 16384);
        W = jl5Var;
    }

    public ep2(tp tpVar) {
        this.x = (xo2) tpVar.D;
        String str = (String) tpVar.A;
        if (str != null) {
            this.z = str;
            this.B = 3;
            u76 u76Var = (u76) tpVar.y;
            this.D = u76Var;
            this.E = u76Var.d();
            this.F = u76Var.d();
            this.G = u76Var.d();
            this.H = p7.P;
            jl5 jl5Var = new jl5();
            jl5Var.b(7, 16777216);
            this.M = jl5Var;
            this.N = W;
            this.R = r0.a();
            Socket socket = (Socket) tpVar.z;
            if (socket != null) {
                this.S = socket;
                wy4 wy4Var = (wy4) tpVar.C;
                if (wy4Var != null) {
                    this.T = new mp2(wy4Var);
                    xy4 xy4Var = (xy4) tpVar.B;
                    if (xy4Var != null) {
                        this.U = new uh0(this, new hp2(xy4Var));
                        this.V = new LinkedHashSet();
                        return;
                    } else {
                        a34.s0("source");
                        throw null;
                    }
                }
                a34.s0("sink");
                throw null;
            }
            a34.s0("socket");
            throw null;
        }
        a34.s0("connectionName");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.T.z);
        r6 = r2;
        r8.Q += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(int r9, boolean r10, defpackage.pa0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            mp2 r8 = r8.T
            r8.l(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.Q     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.R     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.y     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            mp2 r4 = r8.T     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.z     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.Q     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.Q = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            mp2 r4 = r8.T
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.l(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep2.A(int, boolean, pa0, long):void");
    }

    public final void G(int i, int i2) {
        if (i2 != 0) {
            this.E.c(new zo2(this.z + '[' + i + "] writeSynReset", this, i, i2, (byte) 2), 0L);
            return;
        }
        throw null;
    }

    public final void I(int i, long j) {
        this.E.c(new dp2(this.z + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void a(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr = null;
        if (i != 0) {
            if (i2 != 0) {
                byte[] bArr = dq6.a;
                try {
                    q(i);
                } catch (IOException unused) {
                }
                synchronized (this) {
                    if (!this.y.isEmpty()) {
                        objArr = this.y.values().toArray(new lp2[0]);
                        this.y.clear();
                    }
                }
                lp2[] lp2VarArr = (lp2[]) objArr;
                if (lp2VarArr != null) {
                    for (lp2 lp2Var : lp2VarArr) {
                        try {
                            lp2Var.c(i2, iOException);
                        } catch (IOException unused2) {
                        }
                    }
                }
                try {
                    this.T.close();
                } catch (IOException unused3) {
                }
                try {
                    this.S.close();
                } catch (IOException unused4) {
                }
                this.E.e();
                this.F.e();
                this.G.e();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final void flush() {
        this.T.flush();
    }

    public final synchronized lp2 l(int i) {
        return (lp2) this.y.get(Integer.valueOf(i));
    }

    public final synchronized lp2 p(int i) {
        lp2 lp2Var;
        lp2Var = (lp2) this.y.remove(Integer.valueOf(i));
        notifyAll();
        return lp2Var;
    }

    public final void q(int i) {
        if (i != 0) {
            synchronized (this.T) {
                synchronized (this) {
                    if (this.C) {
                        return;
                    }
                    this.C = true;
                    this.T.q(dq6.a, this.A, i);
                    return;
                }
            }
        }
        throw null;
    }

    public final synchronized void t(long j) {
        long j2 = this.O + j;
        this.O = j2;
        long j3 = j2 - this.P;
        if (j3 >= this.M.a() / 2) {
            I(0, j3);
            this.P += j3;
        }
    }
}
