package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e22 {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public e22(za3 za3Var) {
        this.a = (byte) 1;
        this.d = za3Var;
        this.e = new st3((byte) 14);
        this.f = new y23((byte) 8);
        this.g = new z44(new za3[16], 0);
        this.h = new z44(new so3[16], 0);
    }

    public static boolean c(za3 za3Var, rx0 rx0Var) {
        rx0 rx0Var2;
        boolean t0;
        za3 za3Var2 = za3Var.E;
        db3 db3Var = za3Var.d0;
        if (za3Var2 == null) {
            return false;
        }
        if (rx0Var != null) {
            if (za3Var2 != null) {
                em3 em3Var = db3Var.q;
                em3Var.getClass();
                t0 = em3Var.t0(rx0Var.a);
            }
            t0 = false;
        } else {
            em3 em3Var2 = db3Var.q;
            if (em3Var2 != null) {
                rx0Var2 = em3Var2.K;
            } else {
                rx0Var2 = null;
            }
            if (rx0Var2 != null && za3Var2 != null) {
                em3Var2.getClass();
                t0 = em3Var2.t0(rx0Var2.a);
            }
            t0 = false;
        }
        za3 v = za3Var.v();
        if (t0 && v != null) {
            if (v.E == null) {
                za3.W(v, false, 3);
                return t0;
            }
            if (za3Var.s() == xa3.x) {
                za3.U(v, false, 3);
                return t0;
            }
            if (za3Var.s() == xa3.y) {
                v.T(false);
            }
        }
        return t0;
    }

    public static boolean d(za3 za3Var, rx0 rx0Var) {
        rx0 rx0Var2;
        boolean z;
        xa3 xa3Var = xa3.z;
        if (rx0Var != null) {
            if (za3Var.Z == xa3Var) {
                za3Var.e();
            }
            z = za3Var.d0.p.t0(rx0Var.a);
        } else {
            uo3 uo3Var = za3Var.d0.p;
            if (uo3Var.G) {
                rx0Var2 = new rx0(uo3Var.A);
            } else {
                rx0Var2 = null;
            }
            if (rx0Var2 != null) {
                if (za3Var.Z == xa3Var) {
                    za3Var.e();
                }
                z = za3Var.d0.p.t0(rx0Var2.a);
            } else {
                za3Var.getClass();
                z = false;
            }
        }
        za3 v = za3Var.v();
        if (z && v != null) {
            if (za3Var.r() == xa3.x) {
                za3.W(v, false, 3);
                return z;
            }
            if (za3Var.r() == xa3.y) {
                v.V(false);
            }
        }
        return z;
    }

    public static boolean i(za3 za3Var) {
        em3 em3Var;
        ab3 ab3Var;
        if (za3Var.d0.e) {
            if (za3Var.s() != xa3.z || ((em3Var = za3Var.d0.q) != null && (ab3Var = em3Var.P) != null && ab3Var.e())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean j(za3 za3Var) {
        va3 va3Var;
        if (!za3Var.q()) {
            return false;
        }
        do {
            if (za3Var.r() == xa3.z && !za3Var.d0.p.V.e()) {
                za3 v = za3Var.v();
                if (v != null) {
                    va3Var = v.d0.d;
                } else {
                    va3Var = null;
                }
                if (va3Var != va3.x) {
                    return false;
                }
            }
            za3Var = za3Var.v();
            if (za3Var == null) {
                return false;
            }
        } while (!za3Var.J());
        return true;
    }

    public static boolean k(za3 za3Var) {
        em3 em3Var;
        ab3 ab3Var;
        db3 db3Var = za3Var.d0;
        if (za3Var.J() || db3Var.p.R || j(za3Var) || a34.i(za3Var.K(), Boolean.TRUE) || i(za3Var) || db3Var.p.V.e() || ((em3Var = db3Var.q) != null && (ab3Var = em3Var.P) != null && ab3Var.e())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [xz3] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [xz3] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void a() {
        z44 z44Var = (z44) this.g;
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        for (int i2 = 0; i2 < i; i2++) {
            kf kfVar = ((za3) objArr[i2]).c0;
            kz2 kz2Var = (kz2) kfVar.A;
            boolean g = ga4.g(4194304);
            xz3 xz3Var = kz2Var.z0;
            if (g || (xz3Var = xz3Var.B) != null) {
                c94 c94Var = fa4.s0;
                for (xz3 b1 = kz2Var.b1(g); b1 != null && (b1.A & 4194304) != 0; b1 = b1.C) {
                    if ((b1.z & 4194304) != 0) {
                        zc1 zc1Var = b1;
                        ?? r10 = 0;
                        while (zc1Var != 0) {
                            if (zc1Var instanceof fa3) {
                                ((fa3) zc1Var).o((kz2) kfVar.A);
                            } else if ((zc1Var.z & 4194304) != 0 && (zc1Var instanceof zc1)) {
                                xz3 xz3Var2 = zc1Var.M;
                                int i3 = 0;
                                zc1Var = zc1Var;
                                r10 = r10;
                                while (xz3Var2 != null) {
                                    if ((xz3Var2.z & 4194304) != 0) {
                                        i3++;
                                        r10 = r10;
                                        if (i3 == 1) {
                                            zc1Var = xz3Var2;
                                        } else {
                                            if (r10 == 0) {
                                                r10 = new z44(new xz3[16], 0);
                                            }
                                            if (zc1Var != 0) {
                                                r10.b(zc1Var);
                                                zc1Var = 0;
                                            }
                                            r10.b(xz3Var2);
                                        }
                                    }
                                    xz3Var2 = xz3Var2.C;
                                    zc1Var = zc1Var;
                                    r10 = r10;
                                }
                                if (i3 == 1) {
                                }
                            }
                            zc1Var = wc7.J(r10);
                        }
                    }
                    if (b1 != xz3Var) {
                    }
                }
            }
        }
        z44Var.h();
    }

    public void b(boolean z) {
        y23 y23Var = (y23) this.f;
        z44 z44Var = (z44) y23Var.y;
        if (z) {
            za3 za3Var = (za3) this.d;
            if (za3Var.m0 > 0) {
                z44Var.h();
                z44Var.b(za3Var);
                za3Var.l0 = true;
            }
        }
        if (z44Var.z != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                y23Var.S();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void e() {
        z44 z44Var = (z44) this.h;
        int i = z44Var.z;
        if (i != 0) {
            Object[] objArr = z44Var.x;
            for (int i2 = 0; i2 < i; i2++) {
                so3 so3Var = (so3) objArr[i2];
                if (so3Var.a.I()) {
                    boolean z = so3Var.b;
                    za3 za3Var = so3Var.a;
                    boolean z2 = so3Var.c;
                    if (!z) {
                        za3.W(za3Var, z2, 2);
                    } else {
                        za3.U(za3Var, z2, 2);
                    }
                }
            }
            z44Var.h();
        }
    }

    public void f(za3 za3Var) {
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            if (a34.i(za3Var2.K(), Boolean.TRUE) && !za3Var2.n0) {
                if (((st3) this.e).h(za3Var2)) {
                    za3Var2.L();
                }
                f(za3Var2);
            }
        }
    }

    public void g(za3 za3Var, boolean z) {
        boolean q;
        if (!this.b) {
            ez2.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z) {
            q = za3Var.d0.e;
        } else {
            q = za3Var.q();
        }
        if (q) {
            ez2.a("node not yet measured");
        }
        h(za3Var, z);
    }

    public void h(za3 za3Var, boolean z) {
        boolean q;
        em3 em3Var;
        ab3 ab3Var;
        boolean q2;
        boolean q3;
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            xa3 xa3Var = xa3.x;
            if ((!z && (za3Var2.r() == xa3Var || za3Var2.d0.p.V.e())) || (z && (za3Var2.s() == xa3Var || ((em3Var = za3Var2.d0.q) != null && (ab3Var = em3Var.P) != null && ab3Var.e())))) {
                boolean w = wk6.w(za3Var2);
                db3 db3Var = za3Var2.d0;
                if (w && !z) {
                    if (db3Var.e && ((st3) this.e).h(za3Var2)) {
                        p(za3Var2, true);
                    } else {
                        g(za3Var2, true);
                    }
                }
                if (z) {
                    q2 = db3Var.e;
                } else {
                    q2 = za3Var2.q();
                }
                if (q2) {
                    p(za3Var2, z);
                }
                if (z) {
                    q3 = db3Var.e;
                } else {
                    q3 = za3Var2.q();
                }
                if (!q3) {
                    h(za3Var2, z);
                }
            }
        }
        if (z) {
            q = za3Var.d0.e;
        } else {
            q = za3Var.q();
        }
        if (q) {
            p(za3Var, z);
        }
    }

    public boolean l(sb2 sb2Var) {
        boolean z;
        boolean z2;
        za3 za3Var;
        boolean z3;
        boolean p;
        st3 st3Var = (st3) this.e;
        af2 af2Var = (af2) st3Var.x;
        za3 za3Var2 = (za3) this.d;
        if (!za3Var2.I()) {
            ez2.a("performMeasureAndLayout called with unattached root");
        }
        if (!za3Var2.J()) {
            ez2.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            ez2.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (((rx0) this.i) != null) {
            this.b = true;
            this.c = true;
            try {
                if (st3Var.w()) {
                    z = false;
                    while (true) {
                        af2 af2Var2 = (af2) st3Var.z;
                        zu5 zu5Var = (zu5) af2Var2.y;
                        af2 af2Var3 = (af2) st3Var.y;
                        zu5 zu5Var2 = (zu5) af2Var3.y;
                        if (!((zu5) af2Var.y).isEmpty()) {
                            za3Var = (za3) ((zu5) af2Var.y).first();
                            af2Var.p(za3Var);
                            if (za3Var.E != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = false;
                        } else if (!zu5Var2.isEmpty()) {
                            za3Var = (za3) zu5Var2.first();
                            af2Var3.p(za3Var);
                            if (za3Var.E != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = true;
                        } else {
                            if (zu5Var.isEmpty()) {
                                break;
                            }
                            za3 za3Var3 = (za3) zu5Var.first();
                            af2Var2.p(za3Var3);
                            z2 = true;
                            za3Var = za3Var3;
                            z3 = false;
                        }
                        if (z2) {
                            p = o(za3Var, z3);
                        } else {
                            p = p(za3Var, z3);
                            if (za3Var.d0.f) {
                                st3Var.c(za3Var, d33.y);
                            }
                            if (za3Var.p()) {
                                st3Var.c(za3Var, d33.A);
                            }
                        }
                        if (za3Var == za3Var2 && p) {
                            z = true;
                        }
                    }
                    if (sb2Var != null) {
                        sb2Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z4 = z;
            } finally {
            }
        }
        a();
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:20:0x003e, B:22:0x0062, B:25:0x0078, B:27:0x0081, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:34:0x009f, B:36:0x00a7, B:37:0x00aa, B:39:0x00b0, B:41:0x00b6, B:43:0x00c1, B:44:0x00ca, B:47:0x0069, B:49:0x0075), top: B:19:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:20:0x003e, B:22:0x0062, B:25:0x0078, B:27:0x0081, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:34:0x009f, B:36:0x00a7, B:37:0x00aa, B:39:0x00b0, B:41:0x00b6, B:43:0x00c1, B:44:0x00ca, B:47:0x0069, B:49:0x0075), top: B:19:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:20:0x003e, B:22:0x0062, B:25:0x0078, B:27:0x0081, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:34:0x009f, B:36:0x00a7, B:37:0x00aa, B:39:0x00b0, B:41:0x00b6, B:43:0x00c1, B:44:0x00ca, B:47:0x0069, B:49:0x0075), top: B:19:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x0067, blocks: (B:20:0x003e, B:22:0x0062, B:25:0x0078, B:27:0x0081, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:34:0x009f, B:36:0x00a7, B:37:0x00aa, B:39:0x00b0, B:41:0x00b6, B:43:0x00c1, B:44:0x00ca, B:47:0x0069, B:49:0x0075), top: B:19:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.za3 r6, long r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.d
            za3 r0 = (defpackage.za3) r0
            boolean r1 = r6.n0
            db3 r2 = r6.d0
            if (r1 == 0) goto Lb
            return
        Lb:
            if (r6 == r0) goto Le
            goto L13
        Le:
            java.lang.String r1 = "measureAndLayout called on root"
            defpackage.ez2.a(r1)
        L13:
            boolean r1 = r0.I()
            if (r1 != 0) goto L1e
            java.lang.String r1 = "performMeasureAndLayout called with unattached root"
            defpackage.ez2.a(r1)
        L1e:
            boolean r0 = r0.J()
            if (r0 != 0) goto L29
            java.lang.String r0 = "performMeasureAndLayout called with unplaced root"
            defpackage.ez2.a(r0)
        L29:
            boolean r0 = r5.b
            if (r0 == 0) goto L32
            java.lang.String r0 = "performMeasureAndLayout called during measure layout"
            defpackage.ez2.a(r0)
        L32:
            java.lang.Object r0 = r5.i
            rx0 r0 = (defpackage.rx0) r0
            if (r0 == 0) goto Ld9
            r0 = 1
            r5.b = r0
            r1 = 0
            r5.c = r1
            java.lang.Object r3 = r5.e     // Catch: java.lang.Throwable -> L67
            st3 r3 = (defpackage.st3) r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r3.x     // Catch: java.lang.Throwable -> L67
            af2 r4 = (defpackage.af2) r4     // Catch: java.lang.Throwable -> L67
            r4.p(r6)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r3.y     // Catch: java.lang.Throwable -> L67
            af2 r4 = (defpackage.af2) r4     // Catch: java.lang.Throwable -> L67
            r4.p(r6)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r3.z     // Catch: java.lang.Throwable -> L67
            af2 r3 = (defpackage.af2) r3     // Catch: java.lang.Throwable -> L67
            r3.p(r6)     // Catch: java.lang.Throwable -> L67
            rx0 r3 = new rx0     // Catch: java.lang.Throwable -> L67
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L67
            boolean r3 = c(r6, r3)     // Catch: java.lang.Throwable -> L67
            if (r3 != 0) goto L69
            boolean r3 = r2.f     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L78
            goto L69
        L67:
            r6 = move-exception
            goto Ld2
        L69:
            java.lang.Boolean r3 = r6.K()     // Catch: java.lang.Throwable -> L67
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L67
            boolean r3 = defpackage.a34.i(r3, r4)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L78
            r6.L()     // Catch: java.lang.Throwable -> L67
        L78:
            r5.f(r6)     // Catch: java.lang.Throwable -> L67
            xa3 r3 = r6.Z     // Catch: java.lang.Throwable -> L67
            xa3 r4 = defpackage.xa3.z     // Catch: java.lang.Throwable -> L67
            if (r3 != r4) goto L84
            r6.e()     // Catch: java.lang.Throwable -> L67
        L84:
            uo3 r2 = r2.p     // Catch: java.lang.Throwable -> L67
            boolean r7 = r2.t0(r7)     // Catch: java.lang.Throwable -> L67
            za3 r8 = r6.v()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto Laa
            if (r8 == 0) goto Laa
            xa3 r7 = r6.r()     // Catch: java.lang.Throwable -> L67
            xa3 r2 = defpackage.xa3.x     // Catch: java.lang.Throwable -> L67
            if (r7 != r2) goto L9f
            r7 = 3
            defpackage.za3.W(r8, r1, r7)     // Catch: java.lang.Throwable -> L67
            goto Laa
        L9f:
            xa3 r7 = r6.r()     // Catch: java.lang.Throwable -> L67
            xa3 r2 = defpackage.xa3.y     // Catch: java.lang.Throwable -> L67
            if (r7 != r2) goto Laa
            r8.V(r1)     // Catch: java.lang.Throwable -> L67
        Laa:
            boolean r7 = r6.p()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto Lca
            boolean r7 = r6.J()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto Lca
            r6.S()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = r5.f     // Catch: java.lang.Throwable -> L67
            y23 r7 = (defpackage.y23) r7     // Catch: java.lang.Throwable -> L67
            int r8 = r6.m0     // Catch: java.lang.Throwable -> L67
            if (r8 <= 0) goto Lca
            java.lang.Object r7 = r7.y     // Catch: java.lang.Throwable -> L67
            z44 r7 = (defpackage.z44) r7     // Catch: java.lang.Throwable -> L67
            r7.b(r6)     // Catch: java.lang.Throwable -> L67
            r6.l0 = r0     // Catch: java.lang.Throwable -> L67
        Lca:
            r5.e()     // Catch: java.lang.Throwable -> L67
            r5.b = r1
            r5.c = r1
            goto Ld9
        Ld2:
            throw r6     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r6 = move-exception
            r5.b = r1
            r5.c = r1
            throw r6
        Ld9:
            r5.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e22.m(za3, long):void");
    }

    public void n() {
        boolean z;
        za3 za3Var = (za3) this.d;
        st3 st3Var = (st3) this.e;
        if (st3Var.w()) {
            if (!za3Var.I()) {
                ez2.a("performMeasureAndLayout called with unattached root");
            }
            if (!za3Var.J()) {
                ez2.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.b) {
                ez2.a("performMeasureAndLayout called during measure layout");
            }
            if (((rx0) this.i) != null) {
                this.b = true;
                this.c = false;
                try {
                    if (!((zu5) ((af2) st3Var.z).y).isEmpty() && !((zu5) ((af2) st3Var.x).y).isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (za3Var.E != null) {
                            r(za3Var, true);
                        } else {
                            q(za3Var);
                        }
                    }
                    r(za3Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.b = false;
                        this.c = false;
                    }
                }
            }
        }
    }

    public boolean o(za3 za3Var, boolean z) {
        rx0 rx0Var;
        boolean z2;
        dm4 placementScope;
        za3 v;
        za3 za3Var2 = (za3) this.d;
        boolean z3 = za3Var.n0;
        db3 db3Var = za3Var.d0;
        boolean z4 = false;
        if (!z3 && k(za3Var)) {
            if (za3Var == za3Var2) {
                rx0Var = (rx0) this.i;
                rx0Var.getClass();
            } else {
                rx0Var = null;
            }
            if (z) {
                if (db3Var.e) {
                    z4 = c(za3Var, rx0Var);
                }
                if ((z4 || db3Var.f) && a34.i(za3Var.K(), Boolean.TRUE)) {
                    za3Var.L();
                }
            } else {
                if (za3Var.q()) {
                    z2 = d(za3Var, rx0Var);
                } else {
                    z2 = false;
                }
                if (za3Var.p() && (za3Var == za3Var2 || ((v = za3Var.v()) != null && v.J() && db3Var.p.R))) {
                    if (za3Var == za3Var2) {
                        if (za3Var.Z == xa3.z) {
                            za3Var.f();
                        }
                        za3 v2 = za3Var.v();
                        if (v2 != null) {
                            placementScope = ((kz2) v2.c0.A).M;
                        } else {
                            placementScope = ((oa) cb3.a(za3Var)).getPlacementScope();
                        }
                        dm4.j(placementScope, db3Var.p, 0, 0);
                    } else {
                        za3Var.S();
                    }
                    y23 y23Var = (y23) this.f;
                    if (za3Var.m0 > 0) {
                        ((z44) y23Var.y).b(za3Var);
                        za3Var.l0 = true;
                    }
                }
                z4 = z2;
            }
            e();
        }
        return z4;
    }

    public boolean p(za3 za3Var, boolean z) {
        rx0 rx0Var;
        boolean z2 = false;
        if (!za3Var.n0 && k(za3Var)) {
            if (za3Var == ((za3) this.d)) {
                rx0Var = (rx0) this.i;
                rx0Var.getClass();
            } else {
                rx0Var = null;
            }
            if (z) {
                if (za3Var.d0.e) {
                    z2 = c(za3Var, rx0Var);
                }
            } else if (za3Var.q()) {
                z2 = d(za3Var, rx0Var);
            }
            e();
        }
        return z2;
    }

    public void q(za3 za3Var) {
        z44 A = za3Var.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            za3 za3Var2 = (za3) objArr[i2];
            if (za3Var2.r() == xa3.x || za3Var2.d0.p.V.e()) {
                if (wk6.w(za3Var2)) {
                    r(za3Var2, true);
                } else {
                    q(za3Var2);
                }
            }
        }
    }

    public void r(za3 za3Var, boolean z) {
        rx0 rx0Var;
        if (za3Var.n0) {
            return;
        }
        if (za3Var == ((za3) this.d)) {
            rx0Var = (rx0) this.i;
            rx0Var.getClass();
        } else {
            rx0Var = null;
        }
        if (z) {
            c(za3Var, rx0Var);
        } else {
            d(za3Var, rx0Var);
        }
    }

    public boolean s(za3 za3Var, boolean z) {
        int ordinal = za3Var.d0.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    if (!za3Var.q() || z) {
                        za3Var.d0.p.S = true;
                        if (!za3Var.n0 && (za3Var.J() || j(za3Var))) {
                            za3 v = za3Var.v();
                            if (v == null || !v.q()) {
                                ((st3) this.e).c(za3Var, d33.z);
                            }
                            if (!this.c) {
                                return true;
                            }
                        }
                    }
                } else {
                    ze0.l();
                    return false;
                }
            } else {
                ((z44) this.h).b(new so3(za3Var, false, z));
            }
        }
        return false;
    }

    public void t(long j) {
        boolean b;
        d33 d33Var;
        za3 za3Var = (za3) this.d;
        rx0 rx0Var = (rx0) this.i;
        if (rx0Var == null) {
            b = false;
        } else {
            b = rx0.b(rx0Var.a, j);
        }
        if (!b) {
            if (this.b) {
                ez2.a("updateRootConstraints called while measuring");
            }
            this.i = new rx0(j);
            boolean I = za3Var.I();
            db3 db3Var = za3Var.d0;
            if (I) {
                za3 za3Var2 = za3Var.E;
                if (za3Var2 != null) {
                    db3Var.e = true;
                }
                db3Var.p.S = true;
                st3 st3Var = (st3) this.e;
                if (za3Var2 != null) {
                    d33Var = d33.x;
                } else {
                    d33Var = d33.z;
                }
                st3Var.c(za3Var, d33Var);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return yo0.q0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public e22(boolean z, boolean z2, qj4 qj4Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = (byte) 0;
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = qj4Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = vn3.Z(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e22(boolean z, boolean z2, qj4 qj4Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, qj4Var, l, l2, l3, l4, ot1.x);
        this.a = (byte) 0;
    }
}
