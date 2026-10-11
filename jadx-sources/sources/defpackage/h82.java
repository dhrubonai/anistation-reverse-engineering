package defpackage;

import android.os.Trace;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h82 extends xz3 implements wu0, mc4, a04, yc1 {
    public final boolean L;
    public final ic2 M;
    public boolean N;
    public boolean O;
    public final int P;
    public m95 Q;

    public h82(int i, ic2 ic2Var, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        ic2Var = (i2 & 4) != 0 ? null : ic2Var;
        this.L = z;
        this.M = ic2Var;
        this.P = i;
    }

    public static boolean j1(h82 h82Var) {
        return h82Var.i1(7);
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    @Override // defpackage.xz3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0() {
        /*
            r4 = this;
            d82 r0 = r4.f1()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L18
            r2 = 2
            if (r0 == r2) goto L39
            r1 = 3
            if (r0 != r1) goto L14
            goto L59
        L14:
            defpackage.ze0.l()
            return
        L18:
            kh4 r0 = defpackage.wc7.P(r4)
            oa r0 = (defpackage.oa) r0
            p72 r0 = r0.getFocusOwner()
            h82 r2 = defpackage.bb4.y(r4)
            if (r2 == 0) goto L59
            boolean r2 = r2.L
            if (r2 != r1) goto L59
            r72 r0 = (defpackage.r72) r0
            oa r1 = r0.a
            r1.B()
            n72 r0 = r0.d
            r0.a()
            goto L59
        L39:
            kh4 r0 = defpackage.wc7.P(r4)
            oa r0 = (defpackage.oa) r0
            p72 r0 = r0.getFocusOwner()
            r72 r0 = (defpackage.r72) r0
            r2 = 8
            r3 = 0
            r0.c(r2, r1, r3)
            boolean r1 = r4.L
            if (r1 == 0) goto L54
            oa r1 = r0.a
            r1.B()
        L54:
            n72 r0 = r0.d
            r0.a()
        L59:
            m95 r0 = r4.Q
            if (r0 == 0) goto L62
            st3 r0 = (defpackage.st3) r0
            r0.L()
        L62:
            r0 = 0
            r4.Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h82.T0():void");
    }

    @Override // defpackage.xz3
    public final void U0() {
        if (f1().a()) {
            ((r72) ((oa) wc7.P(this)).getFocusOwner()).c(8, true, true);
        }
    }

    public final boolean a1(int i) {
        int ordinal = v94.G(this, i).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                if (ordinal != 3) {
                    ze0.l();
                    return false;
                }
                return false;
            }
            return false;
        }
        return v94.H(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [xz3] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [z44] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [z44] */
    public final void b1(d82 d82Var, d82 d82Var2) {
        kf kfVar;
        ic2 ic2Var;
        r72 r72Var = (r72) ((oa) wc7.P(this)).getFocusOwner();
        h82 g = r72Var.g();
        if (!d82Var.equals(d82Var2) && (ic2Var = this.M) != null) {
            ic2Var.invoke(d82Var, d82Var2);
        }
        xz3 xz3Var = this.x;
        if (!xz3Var.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        xz3 xz3Var2 = this.x;
        za3 O = wc7.O(this);
        while (O != null) {
            if ((((xz3) O.c0.D).A & 5120) != 0) {
                while (xz3Var2 != null) {
                    int i = xz3Var2.z;
                    if ((i & 5120) != 0) {
                        if (xz3Var2 == xz3Var || (i & 1024) == 0) {
                            if ((i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                                zc1 zc1Var = xz3Var2;
                                ?? r5 = 0;
                                while (zc1Var != 0) {
                                    if (zc1Var instanceof g72) {
                                        g72 g72Var = (g72) zc1Var;
                                        if (g == r72Var.g()) {
                                            g72Var.G(d82Var2);
                                        }
                                    } else if ((zc1Var.z & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 && (zc1Var instanceof zc1)) {
                                        xz3 xz3Var3 = zc1Var.M;
                                        int i2 = 0;
                                        zc1Var = zc1Var;
                                        r5 = r5;
                                        while (xz3Var3 != null) {
                                            if ((xz3Var3.z & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                                                i2++;
                                                r5 = r5;
                                                if (i2 == 1) {
                                                    zc1Var = xz3Var3;
                                                } else {
                                                    if (r5 == 0) {
                                                        r5 = new z44(new xz3[16], 0);
                                                    }
                                                    if (zc1Var != 0) {
                                                        r5.b(zc1Var);
                                                        zc1Var = 0;
                                                    }
                                                    r5.b(xz3Var3);
                                                }
                                            }
                                            xz3Var3 = xz3Var3.C;
                                            zc1Var = zc1Var;
                                            r5 = r5;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    zc1Var = wc7.J(r5);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    xz3Var2 = xz3Var2.B;
                }
            }
            O = O.v();
            if (O != null && (kfVar = O.c0) != null) {
                xz3Var2 = (z66) kfVar.C;
            } else {
                xz3Var2 = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u72, java.lang.Object, s72] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [xz3] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [xz3] */
    /* JADX WARN: Type inference failed for: r6v9, types: [v72] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [z44] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [z44] */
    public final u72 c1() {
        boolean z;
        boolean z2;
        kf kfVar;
        ?? obj = new Object();
        obj.a = true;
        w72 w72Var = w72.b;
        obj.b = w72Var;
        obj.c = w72Var;
        obj.d = w72Var;
        obj.e = w72Var;
        obj.f = w72Var;
        obj.g = w72Var;
        obj.h = w72Var;
        obj.i = w72Var;
        obj.j = new f01((byte) 29);
        obj.k = new t72((byte) 0);
        obj.l = l68.E;
        int i = this.P;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            if (((rz2) ((tz2) ((sz2) t80.C(this, bv0.m))).a.getValue()).a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = !z2;
        } else if (i == 2) {
            z = false;
        } else {
            ze0.m("Unknown Focusability");
            return null;
        }
        obj.a = z;
        xz3 xz3Var = this.x;
        if (!xz3Var.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        xz3 xz3Var2 = this.x;
        za3 O = wc7.O(this);
        loop0: while (O != null) {
            if ((((xz3) O.c0.D).A & 3072) != 0) {
                while (xz3Var2 != null) {
                    int i2 = xz3Var2.z;
                    if ((i2 & 3072) != 0) {
                        if (xz3Var2 != xz3Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? r7 = 0;
                            zc1 zc1Var = xz3Var2;
                            while (zc1Var != 0) {
                                if (zc1Var instanceof v72) {
                                    ((v72) zc1Var).D(obj);
                                } else if ((zc1Var.z & 2048) != 0 && (zc1Var instanceof zc1)) {
                                    xz3 xz3Var3 = zc1Var.M;
                                    int i3 = 0;
                                    zc1Var = zc1Var;
                                    r7 = r7;
                                    while (xz3Var3 != null) {
                                        if ((xz3Var3.z & 2048) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                zc1Var = xz3Var3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new z44(new xz3[16], 0);
                                                }
                                                if (zc1Var != 0) {
                                                    r7.b(zc1Var);
                                                    zc1Var = 0;
                                                }
                                                r7.b(xz3Var3);
                                            }
                                        }
                                        xz3Var3 = xz3Var3.C;
                                        zc1Var = zc1Var;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                zc1Var = wc7.J(r7);
                            }
                        }
                    }
                    xz3Var2 = xz3Var2.B;
                }
            }
            O = O.v();
            if (O != null && (kfVar = O.c0) != null) {
                xz3Var2 = (z66) kfVar.C;
            } else {
                xz3Var2 = null;
            }
        }
        return obj;
    }

    public final n05 d1(ha3 ha3Var) {
        n05 n05Var = c1().l;
        if (n05Var != l68.E) {
            if (ha3Var == null) {
                return n05Var;
            }
            return n05Var.k(ha3Var.E(wc7.N(this), 0L));
        }
        if (ha3Var != null) {
            return ha3Var.G(wc7.N(this), false);
        }
        return n03.g(0L, m37.O(wc7.N(this).z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x009f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gd3 e1() {
        /*
            r6 = this;
            xz3 r0 = r6.x
            boolean r0 = r0.K
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.ez2.b(r0)
        Lb:
            xz3 r0 = r6.x
            xz3 r0 = r0.B
            za3 r6 = defpackage.wc7.O(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto L9f
            kf r2 = r6.c0
            java.lang.Object r2 = r2.D
            xz3 r2 = (defpackage.xz3) r2
            int r2 = r2.A
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L8c
        L24:
            if (r0 == 0) goto L8c
            int r2 = r0.z
            r4 = r2 & r3
            if (r4 == 0) goto L89
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4f
            boolean r6 = r0 instanceof defpackage.gd3
            if (r6 == 0) goto L36
            goto L4a
        L36:
            boolean r6 = r0 instanceof defpackage.zc1
            if (r6 == 0) goto L49
            zc1 r0 = (defpackage.zc1) r0
            xz3 r6 = r0.M
            r0 = r1
        L3f:
            if (r6 == 0) goto L4a
            boolean r2 = r6 instanceof defpackage.gd3
            if (r2 == 0) goto L46
            r0 = r6
        L46:
            xz3 r6 = r6.C
            goto L3f
        L49:
            r0 = r1
        L4a:
            gd3 r0 = (defpackage.gd3) r0
            if (r0 == 0) goto L9f
            return r0
        L4f:
            r2 = r2 & 32
            if (r2 == 0) goto L89
            boolean r2 = r0 instanceof defpackage.a04
            if (r2 == 0) goto L59
            r4 = r0
            goto L6e
        L59:
            boolean r2 = r0 instanceof defpackage.zc1
            if (r2 == 0) goto L6d
            r2 = r0
            zc1 r2 = (defpackage.zc1) r2
            xz3 r2 = r2.M
            r4 = r1
        L63:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof defpackage.a04
            if (r5 == 0) goto L6a
            r4 = r2
        L6a:
            xz3 r2 = r2.C
            goto L63
        L6d:
            r4 = r1
        L6e:
            a04 r4 = (defpackage.a04) r4
            if (r4 == 0) goto L89
            iv r2 = r4.Y()
            kw4 r5 = defpackage.zz.f
            boolean r2 = r2.r(r5)
            if (r2 == 0) goto L89
            iv r6 = r4.Y()
            java.lang.Object r6 = r6.w(r5)
            gd3 r6 = (defpackage.gd3) r6
            return r6
        L89:
            xz3 r0 = r0.B
            goto L24
        L8c:
            za3 r6 = r6.v()
            if (r6 == 0) goto L9c
            kf r0 = r6.c0
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r0.C
            z66 r0 = (defpackage.z66) r0
            goto L13
        L9c:
            r0 = r1
            goto L13
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h82.e1():gd3");
    }

    public final d82 f1() {
        kf kfVar;
        boolean z = this.K;
        d82 d82Var = d82.z;
        if (!z) {
            return d82Var;
        }
        h82 g = ((r72) ((oa) wc7.P(this)).getFocusOwner()).g();
        if (g == null) {
            return d82Var;
        }
        if (this == g) {
            return d82.x;
        }
        if (g.K) {
            if (!g.x.K) {
                ez2.b("visitAncestors called on an unattached node");
            }
            xz3 xz3Var = g.x.B;
            za3 O = wc7.O(g);
            while (O != null) {
                if ((((xz3) O.c0.D).A & 1024) != 0) {
                    while (xz3Var != null) {
                        if ((xz3Var.z & 1024) != 0) {
                            xz3 xz3Var2 = xz3Var;
                            z44 z44Var = null;
                            while (xz3Var2 != null) {
                                if (xz3Var2 instanceof h82) {
                                    if (this == ((h82) xz3Var2)) {
                                        return d82.y;
                                    }
                                } else if ((xz3Var2.z & 1024) != 0 && (xz3Var2 instanceof zc1)) {
                                    int i = 0;
                                    for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                        if ((xz3Var3.z & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                xz3Var2 = xz3Var3;
                                            } else {
                                                if (z44Var == null) {
                                                    z44Var = new z44(new xz3[16], 0);
                                                }
                                                if (xz3Var2 != null) {
                                                    z44Var.b(xz3Var2);
                                                    xz3Var2 = null;
                                                }
                                                z44Var.b(xz3Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                xz3Var2 = wc7.J(z44Var);
                            }
                        }
                        xz3Var = xz3Var.B;
                    }
                }
                O = O.v();
                if (O != null && (kfVar = O.c0) != null) {
                    xz3Var = (z66) kfVar.C;
                } else {
                    xz3Var = null;
                }
            }
        }
        return d82Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w05] */
    public final void g1() {
        int ordinal = f1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        ze0.l();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        ?? obj = new Object();
        h98.I(this, new va1(obj, this, (byte) 7));
        Object obj2 = obj.x;
        if (obj2 != null) {
            if (!((s72) obj2).a()) {
                ((r72) ((oa) wc7.P(this)).getFocusOwner()).c(8, true, true);
                return;
            }
            return;
        }
        a34.s0("focusProperties");
        throw null;
    }

    public final boolean i1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (c1().a) {
                return a1(i);
            }
            return vv5.h(this, i, new da(i, (byte) 6));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.mc4
    public final void q0() {
        g1();
    }

    @Override // defpackage.xz3
    public final void S0() {
    }

    public final void h1() {
    }
}
