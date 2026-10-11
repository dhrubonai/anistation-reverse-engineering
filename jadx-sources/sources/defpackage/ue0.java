package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ue0 implements q41 {
    public final q41 A;
    public final ze0 B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public Uri F;
    public v41 G;
    public v41 H;
    public q41 I;
    public long J;
    public long K;
    public long L;
    public mp5 M;
    public boolean N;
    public boolean O;
    public long P;
    public final lp5 x;
    public final q41 y;
    public final w76 z;

    public ue0(lp5 lp5Var, q41 q41Var, q41 q41Var2, se0 se0Var, int i) {
        ze0 ze0Var = ze0.y;
        this.x = lp5Var;
        this.y = q41Var2;
        this.B = ze0Var;
        this.C = (i & 1) != 0;
        this.D = false;
        this.E = false;
        if (q41Var != null) {
            this.A = q41Var;
            this.z = se0Var != null ? new w76(q41Var, se0Var) : null;
        } else {
            this.A = hm4.x;
            this.z = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        lp5 lp5Var = this.x;
        q41 q41Var = this.I;
        if (q41Var != null) {
            try {
                q41Var.close();
            } finally {
                this.H = null;
                this.I = null;
                mp5 mp5Var = this.M;
                if (mp5Var != null) {
                    lp5Var.j(mp5Var);
                    this.M = null;
                }
            }
        }
    }

    public final void b(v41 v41Var, boolean z) {
        mp5 n;
        v41 a;
        q41 q41Var;
        long j;
        boolean z2;
        String str = v41Var.h;
        String str2 = eq6.a;
        Uri uri = null;
        if (this.O) {
            n = null;
        } else {
            boolean z3 = this.C;
            lp5 lp5Var = this.x;
            long j2 = this.K;
            if (z3) {
                try {
                    long j3 = this.L;
                    synchronized (lp5Var) {
                        lp5Var.c();
                        while (true) {
                            n = lp5Var.n(j2, str, j3);
                            if (n != null) {
                                break;
                            } else {
                                lp5Var.wait();
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                n = lp5Var.n(j2, str, this.L);
            }
        }
        if (n == null) {
            q41Var = this.A;
            u41 a2 = v41Var.a();
            a2.f = this.K;
            a2.g = this.L;
            a = a2.a();
        } else if (n.A) {
            Uri fromFile = Uri.fromFile(n.B);
            long j4 = n.y;
            long j5 = this.K - j4;
            long j6 = n.z - j5;
            long j7 = this.L;
            if (j7 != -1) {
                j6 = Math.min(j6, j7);
            }
            u41 a3 = v41Var.a();
            a3.a = fromFile;
            a3.b = j4;
            a3.f = j5;
            a3.g = j6;
            a = a3.a();
            q41Var = this.y;
        } else {
            long j8 = n.z;
            long j9 = this.L;
            if (j8 == -1) {
                j8 = j9;
            } else if (j9 != -1) {
                j8 = Math.min(j8, j9);
            }
            u41 a4 = v41Var.a();
            a4.f = this.K;
            a4.g = j8;
            a = a4.a();
            q41Var = this.z;
            if (q41Var == null) {
                q41Var = this.A;
                this.x.j(n);
                n = null;
            }
        }
        if (!this.O && q41Var == this.A) {
            j = this.K + 102400;
        } else {
            j = Long.MAX_VALUE;
        }
        this.P = j;
        boolean z4 = false;
        if (z) {
            if (this.I == this.A) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.B(z2);
            if (q41Var == this.A) {
                return;
            }
            try {
                a();
            } catch (Throwable th) {
                if (!n.A) {
                    this.x.j(n);
                }
                throw th;
            }
        }
        if (n != null && !n.A) {
            this.M = n;
        }
        this.I = q41Var;
        this.H = a;
        this.J = 0L;
        long h = q41Var.h(a);
        pz2 pz2Var = new pz2((byte) 13);
        if (a.g == -1 && h != -1) {
            this.L = h;
            pz2Var.l(Long.valueOf(this.K + h), "exo_len");
        }
        if (this.I == this.y) {
            z4 = true;
        }
        if (!z4) {
            Uri y = q41Var.y();
            this.F = y;
            if (!v41Var.a.equals(y)) {
                uri = this.F;
            }
            if (uri == null) {
                ((ArrayList) pz2Var.z).add("exo_redir");
                ((HashMap) pz2Var.y).remove("exo_redir");
            } else {
                pz2Var.l(uri.toString(), "exo_redir");
            }
        }
        if (this.I == this.z) {
            this.x.b(str, pz2Var);
        }
    }

    @Override // defpackage.q41
    public final void close() {
        this.G = null;
        this.F = null;
        this.K = 0L;
        try {
            a();
        } catch (Throwable th) {
            if (this.I == this.y || (th instanceof pe0)) {
                this.N = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:3:0x0007, B:5:0x0030, B:10:0x0043, B:12:0x004e, B:16:0x005e, B:18:0x0064, B:24:0x0098, B:25:0x0093, B:33:0x00a8, B:35:0x00a2, B:36:0x006a, B:38:0x0079, B:41:0x0081, B:42:0x0088, B:43:0x0053, B:48:0x003c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:3:0x0007, B:5:0x0030, B:10:0x0043, B:12:0x004e, B:16:0x005e, B:18:0x0064, B:24:0x0098, B:25:0x0093, B:33:0x00a8, B:35:0x00a2, B:36:0x006a, B:38:0x0079, B:41:0x0081, B:42:0x0088, B:43:0x0053, B:48:0x003c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:3:0x0007, B:5:0x0030, B:10:0x0043, B:12:0x004e, B:16:0x005e, B:18:0x0064, B:24:0x0098, B:25:0x0093, B:33:0x00a8, B:35:0x00a2, B:36:0x006a, B:38:0x0079, B:41:0x0081, B:42:0x0088, B:43:0x0053, B:48:0x003c), top: B:2:0x0007 }] */
    @Override // defpackage.q41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.v41 r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            lp5 r2 = r1.x
            r3 = 1
            ze0 r4 = r1.B     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r4.c(r0)     // Catch: java.lang.Throwable -> L68
            long r5 = r0.f     // Catch: java.lang.Throwable -> L68
            long r7 = r0.g     // Catch: java.lang.Throwable -> L68
            u41 r0 = r0.a()     // Catch: java.lang.Throwable -> L68
            r0.h = r4     // Catch: java.lang.Throwable -> L68
            v41 r0 = r0.a()     // Catch: java.lang.Throwable -> L68
            r1.G = r0     // Catch: java.lang.Throwable -> L68
            android.net.Uri r9 = r0.a     // Catch: java.lang.Throwable -> L68
            r71 r10 = r2.g(r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r11 = "exo_redir"
            java.util.Map r10 = r10.b     // Catch: java.lang.Throwable -> L68
            java.lang.Object r10 = r10.get(r11)     // Catch: java.lang.Throwable -> L68
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Throwable -> L68
            r11 = 0
            if (r10 == 0) goto L38
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L68
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L68
            r12.<init>(r10, r13)     // Catch: java.lang.Throwable -> L68
            goto L39
        L38:
            r12 = r11
        L39:
            if (r12 != 0) goto L3c
            goto L40
        L3c:
            android.net.Uri r11 = android.net.Uri.parse(r12)     // Catch: java.lang.Throwable -> L68
        L40:
            if (r11 == 0) goto L43
            r9 = r11
        L43:
            r1.F = r9     // Catch: java.lang.Throwable -> L68
            r1.K = r5     // Catch: java.lang.Throwable -> L68
            boolean r9 = r1.D     // Catch: java.lang.Throwable -> L68
            r10 = 0
            r11 = -1
            if (r9 == 0) goto L53
            boolean r9 = r1.N     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L53
            goto L5b
        L53:
            boolean r9 = r1.E     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L5d
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L5d
        L5b:
            r9 = r3
            goto L5e
        L5d:
            r9 = r10
        L5e:
            r1.O = r9     // Catch: java.lang.Throwable -> L68
            r13 = 0
            if (r9 == 0) goto L6a
            r1.L = r11     // Catch: java.lang.Throwable -> L68
            r15 = r11
            goto L89
        L68:
            r0 = move-exception
            goto Lab
        L6a:
            r71 r2 = r2.g(r4)     // Catch: java.lang.Throwable -> L68
            r15 = r11
            long r11 = defpackage.ry0.a(r2)     // Catch: java.lang.Throwable -> L68
            r1.L = r11     // Catch: java.lang.Throwable -> L68
            int r2 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r2 == 0) goto L89
            long r11 = r11 - r5
            r1.L = r11     // Catch: java.lang.Throwable -> L68
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 < 0) goto L81
            goto L89
        L81:
            s41 r0 = new s41     // Catch: java.lang.Throwable -> L68
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L89:
            int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r2 == 0) goto L9a
            int r4 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r4 != 0) goto L93
            r11 = r7
            goto L98
        L93:
            long r4 = java.lang.Math.min(r11, r7)     // Catch: java.lang.Throwable -> L68
            r11 = r4
        L98:
            r1.L = r11     // Catch: java.lang.Throwable -> L68
        L9a:
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 > 0) goto La2
            int r4 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r4 != 0) goto La5
        La2:
            r1.b(r0, r10)     // Catch: java.lang.Throwable -> L68
        La5:
            if (r2 == 0) goto La8
            return r7
        La8:
            long r0 = r1.L     // Catch: java.lang.Throwable -> L68
            return r0
        Lab:
            q41 r2 = r1.I
            q41 r4 = r1.y
            if (r2 == r4) goto Lb5
            boolean r2 = r0 instanceof defpackage.pe0
            if (r2 == 0) goto Lb7
        Lb5:
            r1.N = r3
        Lb7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue0.h(v41):long");
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        long j;
        q41 q41Var = this.y;
        boolean z2 = false;
        if (i2 == 0) {
            return 0;
        }
        if (this.L == 0) {
            return -1;
        }
        v41 v41Var = this.G;
        v41Var.getClass();
        v41 v41Var2 = this.H;
        v41Var2.getClass();
        try {
            if (this.K >= this.P) {
                b(v41Var, true);
            }
            q41 q41Var2 = this.I;
            q41Var2.getClass();
            int read = q41Var2.read(bArr, i, i2);
            q41 q41Var3 = this.I;
            if (read != -1) {
                long j2 = read;
                this.K += j2;
                this.J += j2;
                long j3 = this.L;
                if (j3 != -1) {
                    this.L = j3 - j2;
                    return read;
                }
                return read;
            }
            if (q41Var3 == q41Var) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j = -1;
                long j4 = v41Var2.g;
                if (j4 != -1) {
                    i3 = read;
                    if (this.J < j4) {
                    }
                } else {
                    i3 = read;
                }
                String str = v41Var.h;
                String str2 = eq6.a;
                this.L = 0L;
                if (q41Var3 == this.z) {
                    z2 = true;
                }
                if (z2) {
                    pz2 pz2Var = new pz2((byte) 13);
                    pz2Var.l(Long.valueOf(this.K), "exo_len");
                    this.x.b(str, pz2Var);
                    return i3;
                }
                return i3;
            }
            i3 = read;
            j = -1;
            long j5 = this.L;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            a();
            b(v41Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.I == q41Var || (th instanceof pe0)) {
                this.N = true;
            }
            throw th;
        }
    }

    @Override // defpackage.q41
    public final Map s() {
        boolean z;
        if (this.I == this.y) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return this.A.s();
        }
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.q41
    public final Uri y() {
        return this.F;
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        this.y.z(n71Var);
        this.A.z(n71Var);
    }
}
