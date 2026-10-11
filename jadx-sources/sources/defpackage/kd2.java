package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kd2 {
    public int A;
    public int B;
    public boolean C;
    public final jd2 D;
    public final ArrayList E;
    public boolean F;
    public xr5 G;
    public yr5 H;
    public bs5 I;
    public boolean J;
    public al4 K;
    public hj0 L;
    public final bu0 M;
    public ed2 N;
    public z32 O;
    public ko5 P;
    public final tu0 Q;
    public final l11 R;
    public boolean S;
    public long T;
    public ld2 U;
    public final rm6 a;
    public final qu0 b;
    public final yr5 c;
    public final s44 d;
    public final hj0 e;
    public final hj0 f;
    public final af2 g;
    public final vu0 h;
    public nd2 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public q34 p;
    public boolean q;
    public boolean r;
    public s34 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final l13 n = new l13((byte) 1);
    public final ArrayList s = new ArrayList();
    public final l13 t = new l13((byte) 1);
    public al4 u = al4.A;
    public final l13 x = new l13((byte) 1);
    public int z = -1;

    public kd2(rm6 rm6Var, qu0 qu0Var, yr5 yr5Var, s44 s44Var, hj0 hj0Var, hj0 hj0Var2, af2 af2Var, vu0 vu0Var) {
        boolean z;
        this.a = rm6Var;
        this.b = qu0Var;
        this.c = yr5Var;
        this.d = s44Var;
        this.e = hj0Var;
        this.f = hj0Var2;
        this.g = af2Var;
        this.h = vu0Var;
        if (!qu0Var.g() && !qu0Var.e()) {
            z = false;
        } else {
            z = true;
        }
        this.C = z;
        this.D = new jd2(this, (byte) 0);
        this.E = new ArrayList();
        xr5 g = yr5Var.g();
        g.c();
        this.G = g;
        yr5 yr5Var2 = new yr5();
        if (qu0Var.g()) {
            yr5Var2.c();
        }
        if (qu0Var.e()) {
            yr5Var2.H = new s34();
        }
        this.H = yr5Var2;
        bs5 h = yr5Var2.h();
        h.e(true);
        this.I = h;
        this.M = new bu0(this, hj0Var);
        xr5 g2 = this.H.g();
        try {
            ed2 a = g2.a(0);
            g2.c();
            this.N = a;
            this.O = new z32();
            this.Q = new tu0(this);
            l11 k = qu0Var.k();
            l11 D = D();
            this.R = k.plus(D == null ? it1.x : D);
        } catch (Throwable th) {
            g2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.k14 S(int r13, defpackage.kd2 r14) {
        /*
            xr5 r0 = r14.G
            int r0 = r0.i(r13)
            xr5 r1 = r14.G
            int[] r2 = r1.b
            java.lang.Object r1 = r1.p(r2, r13)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L94
            boolean r0 = r1 instanceof defpackage.i14
            if (r0 == 0) goto L94
            xr5 r0 = r14.G
            boolean r0 = r0.d(r13)
            if (r0 == 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            T(r14, r0, r13)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            r12 = r0
            goto L31
        L30:
            r12 = r3
        L31:
            xr5 r0 = r14.G
            int[] r1 = r0.b
            java.lang.Object r0 = r0.p(r1, r13)
            r0.getClass()
            r5 = r0
            i14 r5 = (defpackage.i14) r5
            xr5 r0 = r14.G
            r1 = 0
            java.lang.Object r6 = r0.h(r13, r1)
            xr5 r0 = r14.G
            ed2 r9 = r0.a(r13)
            xr5 r0 = r14.G
            int[] r0 = r0.b
            int r1 = r13 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r13
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r1 = r14.s
            int r2 = defpackage.q23.w(r13, r1)
            if (r2 >= 0) goto L67
            int r2 = r2 + 1
            int r2 = -r2
        L67:
            int r3 = r1.size()
            if (r2 >= r3) goto L86
            java.lang.Object r3 = r1.get(r2)
            e33 r3 = (defpackage.e33) r3
            int r4 = r3.b
            if (r4 >= r0) goto L86
            zz4 r4 = r3.a
            java.lang.Object r3 = r3.c
            ai4 r7 = new ai4
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L67
        L86:
            k14 r4 = new k14
            vu0 r7 = r14.h
            yr5 r8 = r14.c
            al4 r11 = r14.m(r13)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.S(int, kd2):k14");
    }

    public static final void T(kd2 kd2Var, ArrayList arrayList, int i) {
        int i2 = kd2Var.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (kd2Var.G.j(i3)) {
                k14 S = S(i3, kd2Var);
                if (S != null) {
                    arrayList.add(S);
                }
            } else if (kd2Var.G.d(i3)) {
                T(kd2Var, arrayList, i3);
            }
            i3 += kd2Var.G.b[(i3 * 5) + 3];
        }
    }

    public static final int U(kd2 kd2Var, int i, int i2, boolean z, int i3) {
        int i4;
        boolean z2;
        int i5;
        od2 od2Var;
        Object obj;
        long[] jArr;
        Object[] objArr;
        int i6;
        long[] jArr2;
        Object[] objArr2;
        int i7;
        int i8;
        int o;
        xr5 xr5Var = kd2Var.G;
        int i9 = 0;
        if (xr5Var.j(i2)) {
            int i10 = xr5Var.i(i2);
            Object p = xr5Var.p(xr5Var.b, i2);
            if (i10 == 126665345 && (p instanceof i14)) {
                k14 S = S(i2, kd2Var);
                if (S != null) {
                    kd2Var.b.c(S);
                    kd2Var.M.e();
                    bu0 bu0Var = kd2Var.M;
                    vu0 vu0Var = kd2Var.h;
                    qu0 qu0Var = kd2Var.b;
                    hg4 hg4Var = bu0Var.b.O;
                    hg4Var.O(of4.c);
                    z51.M(hg4Var, vu0Var, qu0Var, S);
                }
                if (z && i2 != i) {
                    bu0 bu0Var2 = kd2Var.M;
                    bu0Var2.c();
                    bu0Var2.b();
                    kd2 kd2Var2 = bu0Var2.a;
                    if (kd2Var2.G.l(i2)) {
                        o = 1;
                    } else {
                        o = kd2Var2.G.o(i2);
                    }
                    if (o > 0) {
                        bu0Var2.f(i3, o);
                    }
                    return 0;
                }
                return xr5Var.o(i2);
            }
            if (i10 == 206 && a34.i(p, eu0.e)) {
                Object h = xr5Var.h(i2, 0);
                hd2 hd2Var = null;
                if (h instanceof od2) {
                    od2Var = (od2) h;
                } else {
                    od2Var = null;
                }
                if (od2Var != null) {
                    obj = od2Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof hd2) {
                    hd2Var = (hd2) obj;
                }
                if (hd2Var != null) {
                    q44 q44Var = hd2Var.x.e;
                    Object[] objArr3 = q44Var.b;
                    long[] jArr3 = q44Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j = jArr3[i11];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8;
                                int i13 = 8 - ((~(i11 - length)) >>> 31);
                                int i14 = i9;
                                while (i14 < i13) {
                                    if ((255 & j) < 128) {
                                        kd2 kd2Var3 = (kd2) objArr3[(i11 << 3) + i14];
                                        yr5 yr5Var = kd2Var3.c;
                                        if (yr5Var.y > 0 && (yr5Var.x[1] & 67108864) != 0) {
                                            vu0 vu0Var2 = kd2Var3.h;
                                            synchronized (vu0Var2.A) {
                                                vu0Var2.s();
                                                i8 = i12;
                                                p44 p44Var = vu0Var2.K;
                                                vu0Var2.K = x97.q();
                                                try {
                                                    vu0Var2.S.k0(p44Var);
                                                } finally {
                                                }
                                            }
                                            hj0 hj0Var = new hj0();
                                            kd2Var3.L = hj0Var;
                                            xr5 g = kd2Var3.c.g();
                                            try {
                                                kd2Var3.G = g;
                                                bu0 bu0Var3 = kd2Var3.M;
                                                hj0 hj0Var2 = bu0Var3.b;
                                                try {
                                                    bu0Var3.b = hj0Var;
                                                    kd2Var3.R(0);
                                                    bu0 bu0Var4 = kd2Var3.M;
                                                    bu0Var4.b();
                                                    jArr2 = jArr3;
                                                    if (bu0Var4.c) {
                                                        objArr2 = objArr3;
                                                        bu0Var4.b.O.O(vf4.c);
                                                        if (bu0Var4.c) {
                                                            bu0Var4.d(false);
                                                            bu0Var4.d(false);
                                                            bu0Var4.b.O.O(ef4.c);
                                                            i7 = 0;
                                                            bu0Var4.c = false;
                                                        }
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i7 = 0;
                                                } finally {
                                                }
                                            } finally {
                                                g.c();
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i7 = i9;
                                            i8 = i12;
                                        }
                                        kd2Var.b.u(kd2Var3.h);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i7 = i9;
                                        i8 = i12;
                                    }
                                    j >>= i8;
                                    i14++;
                                    i12 = i8;
                                    objArr3 = objArr2;
                                    i9 = i7;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                objArr = objArr3;
                                i6 = i9;
                                if (i13 != i12) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                i6 = i9;
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                            objArr3 = objArr;
                            i9 = i6;
                            jArr3 = jArr;
                        }
                    }
                }
                return xr5Var.o(i2);
            }
            i4 = 1;
            if (!xr5Var.l(i2)) {
                return xr5Var.o(i2);
            }
        } else {
            i4 = 1;
            if (xr5Var.d(i2)) {
                int i15 = xr5Var.b[(i2 * 5) + 3] + i2;
                int i16 = 0;
                for (int i17 = i2 + 1; i17 < i15; i17 += xr5Var.b[(i17 * 5) + 3]) {
                    boolean l = xr5Var.l(i17);
                    if (l) {
                        kd2Var.M.c();
                        bu0 bu0Var5 = kd2Var.M;
                        Object n = xr5Var.n(i17);
                        bu0Var5.c();
                        bu0Var5.h.add(n);
                    }
                    if (!l && !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (l) {
                        i5 = 0;
                    } else {
                        i5 = i3 + i16;
                    }
                    i16 += U(kd2Var, i, i17, z2, i5);
                    if (l) {
                        kd2Var.M.c();
                        kd2Var.M.a();
                    }
                }
                if (!xr5Var.l(i2)) {
                    return i16;
                }
            } else if (!xr5Var.l(i2)) {
                return xr5Var.o(i2);
            }
        }
        return i4;
    }

    public final al4 A() {
        return l();
    }

    public final zz4 B() {
        if (this.A == 0) {
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty()) {
                return (zz4) arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
        return null;
    }

    public final boolean C() {
        if (F() && !this.w) {
            zz4 B = B();
            if (B == null || (B.b & 4) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final tu0 D() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean E() {
        return this.S;
    }

    public final boolean F() {
        zz4 B;
        if (!this.S && !this.y && !this.w && (B = B()) != null && (B.b & 8) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(12:(9:(7:39|(1:41)|42|(1:44)(1:132)|45|(1:47)(1:131)|(33:49|50|51|52|53|(4:55|(1:57)(1:124)|58|(1:60)(1:123))(1:125)|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(1:86)|87|88|89))(1:133)|81|82|83|84|(0)|87|88|89)|69|70|71|72|73|74|75|76|77|78|79)|64|65|66|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0243, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0244, code lost:
    
        r10 = r3;
        r12 = r5;
        r23 = r7;
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d A[Catch: all -> 0x00ac, TryCatch #5 {all -> 0x00ac, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:10:0x0066, B:18:0x00a2, B:19:0x020a, B:23:0x00b2, B:24:0x00b5, B:29:0x0058, B:31:0x005e, B:32:0x0063, B:33:0x00b6, B:35:0x00bc, B:37:0x00c6, B:39:0x00d0, B:41:0x00d4, B:42:0x00d9, B:45:0x00e3, B:47:0x00f0, B:50:0x0110, B:53:0x0124, B:55:0x012d, B:57:0x0138, B:58:0x0149, B:61:0x0161, B:89:0x0207, B:91:0x025b, B:92:0x025e, B:123:0x014e, B:128:0x0260, B:129:0x0263, B:130:0x010e, B:131:0x00fe, B:132:0x00de, B:137:0x0264, B:52:0x011d), top: B:2:0x000a, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5 A[Catch: all -> 0x021d, TRY_LEAVE, TryCatch #11 {all -> 0x021d, blocks: (B:84:0x01e8, B:86:0x01f5, B:98:0x0249, B:99:0x024b), top: B:83:0x01e8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.G(java.util.ArrayList):void");
    }

    public final void H(i14 i14Var, al4 al4Var, Object obj, boolean z) {
        boolean z2;
        c0(126665345, i14Var);
        I();
        o0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                bs5.y(this.I);
            }
            if (this.S || a34.i(this.G.f(), al4Var)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                O(al4Var);
            }
            Z(202, 0, eu0.c, al4Var);
            this.K = null;
            if (this.S && !z) {
                this.J = true;
                bs5 bs5Var = this.I;
                this.b.m(new k14(i14Var, obj, this.h, this.H, bs5Var.b(bs5Var.F(bs5Var.b, bs5Var.v)), nt1.x, l(), null));
            } else {
                boolean z3 = this.w;
                this.w = z2;
                io3.R(this, new os0(-59194059, true, new o0(i14Var, obj)));
                this.w = z3;
            }
        } catch (Throwable th) {
            try {
                iv.Q(th, new gd2(this, (byte) 1));
                throw th;
            } finally {
                q(false);
                this.K = null;
                this.T = j;
                q(false);
            }
        }
    }

    public final Object I() {
        boolean z = this.S;
        q18 q18Var = au0.a;
        if (z) {
            if (this.r) {
                eu0.a("A call to createNode(), emitNode() or useNode() expected");
                return q18Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof o55)) {
                return m;
            }
        }
        return q18Var;
    }

    public final List J() {
        vu0 vu0Var;
        qu0 qu0Var = this.b;
        pu0 i = qu0Var.i();
        if (i != null) {
            vu0Var = (vu0) i;
        } else {
            vu0Var = null;
        }
        if (vu0Var != null) {
            yr5 yr5Var = vu0Var.C;
            xr5 g = as5.a(yr5Var).g();
            try {
                Integer Q = db.Q(g, qu0Var, 0, g.c);
                if (Q != null) {
                    g = as5.a(yr5Var).g();
                    try {
                        ArrayList q0 = db.q0(g, Q.intValue(), 0);
                        g.c();
                        return yo0.u0(vu0Var.S.J(), q0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return nt1.x;
    }

    public final int K(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += this.G.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.vu0 r9, defpackage.vu0 r10, java.lang.Integer r11, java.util.List r12, defpackage.sb2 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            ai4 r6 = (defpackage.ai4) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.x     // Catch: java.lang.Throwable -> L24
            zz4 r7 = (defpackage.zz4) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.y     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.j0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L5e
        L26:
            r8.j0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L55
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L4f
            if (r10 == r9) goto L4f
            if (r11 < 0) goto L4f
            r9.O = r10     // Catch: java.lang.Throwable -> L24
            r9.P = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L49
            r9.O = r5     // Catch: java.lang.Throwable -> L24
            r9.P = r2     // Catch: java.lang.Throwable -> L24
            goto L53
        L49:
            r10 = move-exception
            r9.O = r5     // Catch: java.lang.Throwable -> L24
            r9.P = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L4f:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L53:
            if (r10 != 0) goto L59
        L55:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L59:
            r8.F = r0
            r8.k = r1
            return r10
        L5e:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.L(vu0, vu0, java.lang.Integer, java.util.List, sb2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r4.b < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.M():void");
    }

    public final void N() {
        R(this.G.g);
        bu0 bu0Var = this.M;
        bu0Var.d(false);
        bu0Var.e();
        bu0Var.b.O.O(rf4.c);
        int i = bu0Var.f;
        xr5 xr5Var = bu0Var.a.G;
        bu0Var.f = xr5Var.b[(xr5Var.g * 5) + 3] + i;
    }

    public final void O(al4 al4Var) {
        s34 s34Var = this.v;
        if (s34Var == null) {
            s34Var = new s34();
            this.v = s34Var;
        }
        s34Var.h(this.G.g, al4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(int r7, int r8, int r9) {
        /*
            r6 = this;
            xr5 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            bu0 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.p(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.P(int, int, int):void");
    }

    public final Object Q() {
        boolean z = this.S;
        q18 q18Var = au0.a;
        if (z) {
            if (this.r) {
                eu0.a("A call to createNode(), emitNode() or useNode() expected");
                return q18Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof o55)) {
                if (m instanceof od2) {
                    return ((od2) m).a;
                }
                return m;
            }
        }
        return q18Var;
    }

    public final void R(int i) {
        boolean l = this.G.l(i);
        bu0 bu0Var = this.M;
        if (l) {
            bu0Var.c();
            Object n = this.G.n(i);
            bu0Var.c();
            bu0Var.h.add(n);
        }
        U(this, i, i, l, 0);
        bu0Var.c();
        if (l) {
            bu0Var.a();
        }
    }

    public final boolean V(int i, boolean z) {
        zz4 B;
        int i2;
        if ((i & 1) == 0 && (this.S || this.y)) {
            ko5 ko5Var = this.P;
            if (ko5Var != null && (B = B()) != null && ko5Var.a()) {
                int i3 = B.b;
                if ((i3 & 512) != 0) {
                    return true;
                }
                int i4 = i3 | 1;
                B.b = i4;
                if (this.y) {
                    i2 = i3 | 129;
                } else {
                    i2 = i4 & (-129);
                }
                B.b = i2 | 256;
                hg4 hg4Var = this.M.b.O;
                hg4Var.O(qf4.c);
                z51.K(hg4Var, 0, B);
                this.b.t(B);
                return false;
            }
        } else if (!z && F()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.W():void");
    }

    public final void X() {
        int i;
        xr5 xr5Var = this.G;
        int i2 = xr5Var.i;
        if (i2 >= 0) {
            i = xr5Var.b[(i2 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.l = i;
        xr5Var.t();
    }

    public final void Y() {
        if (this.l != 0) {
            eu0.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            zz4 B = B();
            if (B != null) {
                int i = B.b;
                if ((i & 128) == 0) {
                    B.b = i | 16;
                }
            }
            if (this.s.isEmpty()) {
                X();
            } else {
                M();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(int r26, int r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.Z(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        z32 z32Var = this.O;
        z32Var.z.L();
        z32Var.y.L();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        xr5 xr5Var = this.G;
        if (!xr5Var.f) {
            xr5Var.c();
        }
        if (!this.I.w) {
            y();
        }
    }

    public final void a0() {
        Z(-127, 0, null, null);
    }

    public final void b(Object obj, ic2 ic2Var) {
        if (this.S) {
            hg4 hg4Var = this.O.y;
            hg4Var.O(cg4.c);
            z51.K(hg4Var, 0, obj);
            wk6.j(2, ic2Var);
            z51.K(hg4Var, 1, ic2Var);
            return;
        }
        bu0 bu0Var = this.M;
        bu0Var.b();
        hg4 hg4Var2 = bu0Var.b.O;
        hg4Var2.O(cg4.c);
        wk6.j(2, ic2Var);
        z51.L(hg4Var2, 0, obj, 1, ic2Var);
    }

    public final void b0(int i, se4 se4Var) {
        Z(i, 0, se4Var, null);
    }

    public final boolean c(float f) {
        Object I = I();
        if ((I instanceof Float) && f == ((Number) I).floatValue()) {
            return false;
        }
        o0(Float.valueOf(f));
        return true;
    }

    public final void c0(int i, Object obj) {
        Z(i, 0, obj, null);
    }

    public final boolean d(int i) {
        Object I = I();
        if ((I instanceof Integer) && i == ((Number) I).intValue()) {
            return false;
        }
        o0(Integer.valueOf(i));
        return true;
    }

    public final void d0(Object obj, boolean z) {
        if (z) {
            xr5 xr5Var = this.G;
            if (xr5Var.k <= 0) {
                if ((xr5Var.b[(xr5Var.g * 5) + 1] & 1073741824) == 0) {
                    ds4.a("Expected a node group");
                }
                xr5Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            bu0 bu0Var = this.M;
            bu0Var.getClass();
            bu0Var.d(false);
            hg4 hg4Var = bu0Var.b.O;
            hg4Var.O(bg4.c);
            z51.K(hg4Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean e(long j) {
        Object I = I();
        if ((I instanceof Long) && j == ((Number) I).longValue()) {
            return false;
        }
        o0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            Z(i, 0, null, null);
            return;
        }
        if (this.r) {
            eu0.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        xr5 xr5Var = this.G;
        boolean z = this.S;
        q18 q18Var = au0.a;
        if (z) {
            xr5Var.k++;
            this.I.R(i, q18Var, false, q18Var);
            x(false, null);
            return;
        }
        if (xr5Var.g() == i && ((i3 = xr5Var.g) >= xr5Var.h || (xr5Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            xr5Var.u();
            x(false, null);
            return;
        }
        if (xr5Var.k <= 0 && (i2 = xr5Var.g) != xr5Var.h) {
            int i4 = this.k;
            N();
            this.M.f(i4, xr5Var.s());
            q23.R(this.s, i2, xr5Var.g);
        }
        xr5Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            bs5 h = this.H.h();
            this.I = h;
            h.N();
            this.J = false;
            this.K = null;
        }
        bs5 bs5Var = this.I;
        bs5Var.d();
        int i5 = bs5Var.t;
        bs5Var.R(i, q18Var, false, q18Var);
        this.N = bs5Var.b(i5);
        x(false, null);
    }

    public final boolean f(Object obj) {
        if (!a34.i(I(), obj)) {
            o0(obj);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kd2 f0(int r7) {
        /*
            r6 = this;
            r6.e0(r7)
            boolean r7 = r6.S
            af2 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            vu0 r2 = r6.h
            if (r7 == 0) goto L26
            zz4 r7 = new zz4
            r7.<init>(r2)
            r1.add(r7)
            r6.o0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.d()
            return r6
        L26:
            xr5 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.q23.w(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            e33 r7 = (defpackage.e33) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            xr5 r3 = r6.G
            java.lang.Object r3 = r3.m()
            q18 r4 = defpackage.au0.a
            boolean r4 = defpackage.a34.i(r3, r4)
            if (r4 == 0) goto L51
            zz4 r3 = new zz4
            r3.<init>(r2)
            r6.o0(r3)
            goto L56
        L51:
            r3.getClass()
            zz4 r3 = (defpackage.zz4) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.d()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            bu0 r7 = r6.M
            hj0 r7 = r7.b
            hg4 r7 = r7.O
            wf4 r0 = defpackage.wf4.c
            r7.O(r0)
            defpackage.z51.K(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lba
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.y = r4
            xr5 r0 = r6.G
            int r0 = r0.i
            r6.z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.f0(int):kd2");
    }

    public final boolean g(boolean z) {
        Object I = I();
        if ((I instanceof Boolean) && z == ((Boolean) I).booleanValue()) {
            return false;
        }
        o0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(Object obj) {
        if (!this.S && this.G.g() == 207 && !a34.i(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        Z(207, 0, null, obj);
    }

    public final boolean h(Object obj) {
        if (I() != obj) {
            o0(obj);
            return true;
        }
        return false;
    }

    public final void h0() {
        Z(125, 2, null, null);
        this.r = true;
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        bu0 bu0Var = this.M;
        bu0Var.c = false;
        bu0Var.d.b = 0;
        bu0Var.f = 0;
        bu0Var.e = true;
        bu0Var.g = 0;
        bu0Var.h.clear();
        bu0Var.i = -1;
        bu0Var.j = -1;
        bu0Var.k = -1;
        bu0Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0() {
        this.m = 0;
        this.G = this.c.g();
        Z(100, 0, null, null);
        qu0 qu0Var = this.b;
        qu0Var.w();
        al4 j = qu0Var.j();
        this.x.e(this.w ? 1 : 0);
        this.w = f(j);
        this.K = null;
        if (!this.q) {
            this.q = qu0Var.f();
        }
        boolean z = this.C;
        if (!z) {
            z = qu0Var.g();
            this.C = z;
        }
        if (z) {
            tq1 tq1Var = uu0.a;
            tq1Var.getClass();
            j = j.d(tq1Var, new hy5(D()));
        }
        this.u = j;
        Set set = (Set) sw0.E(j, j03.a);
        if (set != null) {
            set.add(z());
            qu0Var.r(set);
        }
        Z(Long.hashCode(qu0Var.h()), 0, null, null);
    }

    public final Object j(jw4 jw4Var) {
        return sw0.E(l(), jw4Var);
    }

    public final boolean j0(zz4 zz4Var, Object obj) {
        ed2 ed2Var = zz4Var.c;
        if (ed2Var != null) {
            int b = this.G.a.b(tl7.h(ed2Var));
            if (this.F && b >= this.G.g) {
                ArrayList arrayList = this.s;
                int w = q23.w(b, arrayList);
                if (w < 0) {
                    int i = -(w + 1);
                    if (!(obj instanceof he1)) {
                        obj = null;
                    }
                    arrayList.add(i, new e33(zz4Var, b, obj));
                    return true;
                }
                e33 e33Var = (e33) arrayList.get(w);
                if (obj instanceof he1) {
                    Object obj2 = e33Var.c;
                    if (obj2 == null) {
                        e33Var.c = obj;
                        return true;
                    }
                    if (obj2 instanceof q44) {
                        ((q44) obj2).a(obj);
                        return true;
                    }
                    q44 q44Var = db5.a;
                    q44 q44Var2 = new q44(2);
                    q44Var2.k(obj2);
                    q44Var2.k(obj);
                    e33Var.c = q44Var2;
                    return true;
                }
                e33Var.c = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public final void k(sb2 sb2Var) {
        if (!this.r) {
            eu0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            eu0.a("createNode() can only be called when inserting");
        }
        l13 l13Var = this.n;
        int i = l13Var.a[l13Var.b - 1];
        bs5 bs5Var = this.I;
        ed2 b = bs5Var.b(bs5Var.v);
        this.l++;
        z32 z32Var = this.O;
        hg4 hg4Var = z32Var.y;
        hg4Var.O(jf4.d);
        z51.K(hg4Var, 0, sb2Var);
        hg4Var.A[hg4Var.B - hg4Var.y[hg4Var.z - 1].a] = i;
        z51.K(hg4Var, 1, b);
        hg4 hg4Var2 = z32Var.z;
        hg4Var2.O(jf4.e);
        hg4Var2.A[hg4Var2.B - hg4Var2.y[hg4Var2.z - 1].a] = i;
        z51.K(hg4Var2, 0, b);
    }

    public final void k0(p44 p44Var) {
        ed2 ed2Var;
        ArrayList arrayList = this.s;
        for (int D = te4.D(arrayList); -1 < D; D--) {
            e33 e33Var = (e33) arrayList.get(D);
            ed2 ed2Var2 = e33Var.a.c;
            if (ed2Var2 != null) {
                ed2Var = tl7.h(ed2Var2);
            } else {
                ed2Var = null;
            }
            if (ed2Var != null && ed2Var.a()) {
                int i = e33Var.b;
                int i2 = ed2Var.a;
                if (i != i2) {
                    e33Var.b = i2;
                }
            } else {
                arrayList.remove(D);
            }
        }
        Object[] objArr = p44Var.b;
        Object[] objArr2 = p44Var.c;
        long[] jArr = p44Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            zz4 zz4Var = (zz4) obj;
                            ed2 ed2Var3 = zz4Var.c;
                            if (ed2Var3 != null) {
                                int i7 = tl7.h(ed2Var3).a;
                                if (obj2 == nr1.N) {
                                    obj2 = null;
                                }
                                arrayList.add(new e33(zz4Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        cp0.X(arrayList, q23.c);
    }

    public final al4 l() {
        al4 al4Var = this.K;
        if (al4Var != null) {
            return al4Var;
        }
        return m(this.G.i);
    }

    public final void l0(int i, int i2) {
        if (p0(i) != i2) {
            if (i < 0) {
                q34 q34Var = this.p;
                if (q34Var == null) {
                    q34Var = new q34();
                    this.p = q34Var;
                }
                q34Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final al4 m(int i) {
        al4 al4Var;
        boolean z = this.S;
        se4 se4Var = eu0.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.r(i2) == 202 && a34.i(this.I.s(i2), se4Var)) {
                    Object p = this.I.p(i2);
                    p.getClass();
                    al4 al4Var2 = (al4) p;
                    this.K = al4Var2;
                    return al4Var2;
                }
                bs5 bs5Var = this.I;
                i2 = bs5Var.F(bs5Var.b, i2);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    xr5 xr5Var = this.G;
                    if (a34.i(xr5Var.p(xr5Var.b, i), se4Var)) {
                        s34 s34Var = this.v;
                        if (s34Var == null || (al4Var = (al4) s34Var.b(i)) == null) {
                            xr5 xr5Var2 = this.G;
                            Object b = xr5Var2.b(xr5Var2.b, i);
                            b.getClass();
                            al4Var = (al4) b;
                        }
                        this.K = al4Var;
                        return al4Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        al4 al4Var3 = this.u;
        this.K = al4Var3;
        return al4Var3;
    }

    public final void m0(int i, int i2) {
        int p0 = p0(i);
        if (p0 != i2) {
            int i3 = i2 - p0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int p02 = p0(i) + i3;
                l0(i, p02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        nd2 nd2Var = (nd2) arrayList.get(i4);
                        if (nd2Var != null && nd2Var.a(i, p02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                xr5 xr5Var = this.G;
                if (i < 0) {
                    i = xr5Var.i;
                } else if (!xr5Var.l(i)) {
                    i = this.G.q(i);
                } else {
                    return;
                }
            }
        }
    }

    public final pt0 n() {
        Collection collection;
        Object obj;
        if (!this.b.l()) {
            return null;
        }
        ai3 y = te4.y();
        bs5 bs5Var = this.I;
        y.addAll(db.r(bs5Var, null, bs5Var.t, null));
        xr5 xr5Var = this.G;
        boolean z = xr5Var.f;
        int[] iArr = xr5Var.b;
        if (!z && xr5Var.c != 0) {
            sy4 sy4Var = new sy4(xr5Var);
            int i = xr5Var.i;
            Object valueOf = Integer.valueOf(xr5Var.l - as5.d(iArr, i));
            while (i >= 0) {
                if (xr5Var.k(i)) {
                    obj = xr5Var.p(iArr, i);
                } else {
                    obj = au0.a;
                }
                sy4Var.y(xr5Var.i(i), obj, xr5Var.a.j(i), valueOf);
                valueOf = xr5Var.a(i);
                i = xr5Var.q(i);
            }
            collection = (ArrayList) sy4Var.x;
        } else {
            collection = nt1.x;
        }
        y.addAll(collection);
        y.addAll(J());
        return new pt0(te4.r(y), this.C);
    }

    public final void n0(Object obj) {
        if (obj instanceof c25) {
            od2 od2Var = new od2((c25) obj, this.m - 1);
            if (this.S) {
                hg4 hg4Var = this.M.b.O;
                hg4Var.O(pf4.c);
                z51.K(hg4Var, 0, od2Var);
            }
            this.d.add(obj);
            obj = od2Var;
        }
        o0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(p44 p44Var, ic2 ic2Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            eu0.a("Reentrant composition is not supported");
        }
        this.g.d();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(mt5.h().g());
            this.v = null;
            k0(p44Var);
            this.k = 0;
            this.F = true;
            try {
                i0();
                Object I = I();
                if (I != ic2Var && ic2Var != null) {
                    o0(ic2Var);
                }
                jd2 jd2Var = this.D;
                z44 a = ut5.a();
                try {
                    a.b(jd2Var);
                    se4 se4Var = eu0.a;
                    if (ic2Var != null) {
                        b0(200, se4Var);
                        io3.R(this, ic2Var);
                        q(false);
                    } else if (this.w && I != null && !I.equals(au0.a)) {
                        b0(200, se4Var);
                        wk6.j(2, I);
                        io3.R(this, (ic2) I);
                        q(false);
                    } else {
                        W();
                    }
                    a.m(a.z - 1);
                    v();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        eu0.a("Check failed");
                    }
                    y();
                } catch (Throwable th) {
                    a.m(a.z - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o0(Object obj) {
        if (this.S) {
            this.I.T(obj);
            return;
        }
        xr5 xr5Var = this.G;
        boolean z = xr5Var.n;
        bu0 bu0Var = this.M;
        if (z) {
            int d = (xr5Var.l - as5.d(xr5Var.b, xr5Var.i)) - 1;
            if (bu0Var.a.G.i - bu0Var.f < 0) {
                xr5 xr5Var2 = this.G;
                ed2 a = xr5Var2.a(xr5Var2.i);
                hg4 hg4Var = bu0Var.b.O;
                hg4Var.O(jf4.f);
                z51.L(hg4Var, 0, obj, 1, a);
                hg4Var.A[hg4Var.B - hg4Var.y[hg4Var.z - 1].a] = d;
                return;
            }
            bu0Var.d(true);
            hg4 hg4Var2 = bu0Var.b.O;
            hg4Var2.O(jf4.g);
            z51.K(hg4Var2, 0, obj);
            hg4Var2.A[hg4Var2.B - hg4Var2.y[hg4Var2.z - 1].a] = d;
            return;
        }
        ed2 a2 = xr5Var.a(xr5Var.i);
        hg4 hg4Var3 = bu0Var.b.O;
        hg4Var3.O(we4.c);
        z51.L(hg4Var3, 0, a2, 1, obj);
    }

    public final void p(int i, int i2) {
        if (i > 0 && i != i2) {
            p(this.G.q(i), i2);
            if (this.G.l(i)) {
                Object n = this.G.n(i);
                bu0 bu0Var = this.M;
                bu0Var.c();
                bu0Var.h.add(n);
            }
        }
    }

    public final int p0(int i) {
        int i2;
        if (i < 0) {
            q34 q34Var = this.p;
            if (q34Var != null && q34Var.c(i) >= 0) {
                int c = q34Var.c(i);
                if (c >= 0) {
                    return q34Var.c[c];
                }
                p65.h(qx1.h(i, "Cannot find value for key "));
            }
            return 0;
        }
        int[] iArr = this.o;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.G.o(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04cc  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r43) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.q(boolean):void");
    }

    public final void q0() {
        if (!this.r) {
            eu0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            eu0.a("useNode() called while inserting");
        }
        xr5 xr5Var = this.G;
        Object n = xr5Var.n(xr5Var.i);
        bu0 bu0Var = this.M;
        bu0Var.c();
        bu0Var.h.add(n);
        if (this.y && (n instanceof it0)) {
            bu0Var.b();
            bu0Var.b.O.O(eg4.c);
        }
    }

    public final void r() {
        q(false);
        zz4 B = B();
        if (B != null) {
            int i = B.b;
            if ((i & 1) != 0) {
                B.b = i | 2;
            }
        }
    }

    public final void s() {
        q(true);
    }

    public final void t() {
        q(false);
    }

    public final zz4 u() {
        zz4 zz4Var;
        zz4 zz4Var2;
        ed2 a;
        vm vmVar;
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            zz4Var = (zz4) arrayList.remove(arrayList.size() - 1);
        } else {
            zz4Var = null;
        }
        if (zz4Var != null) {
            zz4Var.b &= -9;
            this.g.d();
            int i = this.B;
            b44 b44Var = zz4Var.f;
            if (b44Var != null && (zz4Var.b & 16) == 0) {
                Object[] objArr = b44Var.b;
                int[] iArr = b44Var.c;
                long[] jArr = b44Var.a;
                byte b = 2;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        vmVar = new vm(b, i, zz4Var, b44Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            vmVar = null;
            bu0 bu0Var = this.M;
            if (vmVar != null) {
                hg4 hg4Var = bu0Var.b.O;
                hg4Var.O(df4.c);
                z51.L(hg4Var, 0, vmVar, 1, this.h);
            }
            int i6 = zz4Var.b;
            if ((i6 & 512) != 0) {
                zz4Var.b = i6 & (-513);
                hg4 hg4Var2 = bu0Var.b.O;
                hg4Var2.O(gf4.c);
                z51.K(hg4Var2, 0, zz4Var);
                int i7 = zz4Var.b;
                zz4Var.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    zz4Var.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (zz4Var != null) {
            int i8 = zz4Var.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (zz4Var.c == null) {
                    if (this.S) {
                        bs5 bs5Var = this.I;
                        a = bs5Var.b(bs5Var.v);
                    } else {
                        xr5 xr5Var = this.G;
                        a = xr5Var.a(xr5Var.i);
                    }
                    zz4Var.c = a;
                }
                zz4Var.b &= -5;
                zz4Var2 = zz4Var;
                q(false);
                return zz4Var2;
            }
        }
        zz4Var2 = null;
        q(false);
        return zz4Var2;
    }

    public final void v() {
        boolean z = false;
        q(false);
        this.b.d();
        q(false);
        bu0 bu0Var = this.M;
        if (bu0Var.c) {
            bu0Var.d(false);
            bu0Var.d(false);
            bu0Var.b.O.O(ef4.c);
            bu0Var.c = false;
        }
        bu0Var.b();
        if (bu0Var.d.b != 0) {
            eu0.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            eu0.a("Start/end imbalance");
        }
        i();
        this.G.c();
        if (this.x.d() != 0) {
            z = true;
        }
        this.w = z;
    }

    public final void w(int i) {
        if (i < 0) {
            int i2 = -i;
            bs5 bs5Var = this.I;
            while (true) {
                int i3 = bs5Var.v;
                if (i3 > i2) {
                    q(bs5Var.x(i3));
                } else {
                    return;
                }
            }
        } else {
            if (this.S) {
                bs5 bs5Var2 = this.I;
                while (this.S) {
                    q(bs5Var2.x(bs5Var2.v));
                }
            }
            xr5 xr5Var = this.G;
            while (true) {
                int i4 = xr5Var.i;
                if (i4 > i) {
                    q(xr5Var.l(i4));
                } else {
                    return;
                }
            }
        }
    }

    public final void x(boolean z, nd2 nd2Var) {
        this.i.add(this.j);
        this.j = nd2Var;
        int i = this.l;
        l13 l13Var = this.n;
        l13Var.e(i);
        l13Var.e(this.m);
        l13Var.e(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void y() {
        yr5 yr5Var = new yr5();
        if (this.C) {
            yr5Var.c();
        }
        if (this.b.e()) {
            yr5Var.H = new s34();
        }
        this.H = yr5Var;
        bs5 h = yr5Var.h();
        h.e(true);
        this.I = h;
    }

    public final su0 z() {
        ld2 ld2Var = this.U;
        if (ld2Var == null) {
            ld2 ld2Var2 = new ld2(this.h);
            this.U = ld2Var2;
            return ld2Var2;
        }
        return ld2Var;
    }
}
