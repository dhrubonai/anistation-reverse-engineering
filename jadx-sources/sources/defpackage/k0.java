package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class k0 extends zc1 implements xq4, j83, sh5, wu0, mc4, ly2, be2 {
    public u34 N;
    public by2 O;
    public boolean P;
    public String Q;
    public m65 R;
    public boolean S;
    public sb2 T;
    public final m82 U;
    public by2 V;
    public ee2 W;
    public String X = "idle";
    public yc1 Y;
    public qt4 Z;
    public fo2 a0;
    public final x34 b0;
    public long c0;
    public qt4 d0;
    public u34 e0;
    public boolean f0;
    public bx5 g0;

    public k0(u34 u34Var, by2 by2Var, boolean z, boolean z2, String str, m65 m65Var, sb2 sb2Var) {
        this.N = u34Var;
        this.O = by2Var;
        this.P = z;
        this.Q = str;
        this.R = m65Var;
        this.S = z2;
        this.T = sb2Var;
        this.U = new m82(u34Var, 0, new d0(1, this, k0.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 0));
        int i = gl3.a;
        this.b0 = new x34(6);
        this.c0 = 0L;
        u34 u34Var2 = this.N;
        this.e0 = u34Var2;
        this.f0 = u34Var2 == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    @Override // defpackage.j83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(android.view.KeyEvent r12) {
        /*
            r11 = this;
            r11.l1()
            long r0 = defpackage.h41.C(r12)
            boolean r2 = r11.S
            r3 = 3
            r4 = 0
            x34 r5 = r11.b0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = defpackage.h41.E(r12)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = defpackage.q23.G(r12)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            qt4 r2 = new qt4
            long r9 = r11.c0
            r2.<init>(r9)
            r5.g(r0, r2)
            u34 r0 = r11.N
            if (r0 == 0) goto L3e
            v11 r0 = r11.O0()
            i0 r1 = new i0
            r1.<init>(r11, r2, r4, r8)
            defpackage.tl7.z(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r11.n1(r12)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r11.S
            if (r2 == 0) goto L78
            int r2 = defpackage.h41.E(r12)
            if (r2 != r6) goto L78
            boolean r2 = defpackage.q23.G(r12)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.f(r0)
            qt4 r0 = (defpackage.qt4) r0
            if (r0 == 0) goto L75
            u34 r1 = r11.N
            if (r1 == 0) goto L72
            v11 r1 = r11.O0()
            i0 r2 = new i0
            r2.<init>(r11, r0, r4, r3)
            defpackage.tl7.z(r1, r4, r4, r2, r3)
        L72:
            r11.o1(r12)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.E(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        m65 m65Var = this.R;
        if (m65Var != null) {
            zh5.f(bi5Var, m65Var.a);
        }
        String str = this.Q;
        a0 a0Var = new a0(this, (byte) 1);
        w73[] w73VarArr = zh5.a;
        bi5Var.b(oh5.b, new o3(str, a0Var));
        if (this.S) {
            this.U.I0(bi5Var);
        } else {
            bi5Var.b(yh5.j, pn6.a);
        }
        d1(bi5Var);
    }

    @Override // defpackage.sh5
    public final boolean K0() {
        return true;
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.be2
    public final String S() {
        return this.X;
    }

    @Override // defpackage.xz3
    public final void S0() {
        q0();
        if (!this.f0) {
            l1();
        }
        if (this.S) {
            a1(this.U);
        }
    }

    @Override // defpackage.xz3
    public final void T0() {
        f1();
        if (this.e0 == null) {
            this.N = null;
        }
        yc1 yc1Var = this.Y;
        if (yc1Var != null) {
            b1(yc1Var);
        }
        this.Y = null;
        ee2 ee2Var = this.W;
        if (ee2Var != null) {
            b1(ee2Var);
        }
        this.W = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w05] */
    public final boolean e1() {
        ?? obj = new Object();
        iv5.i(this, ee2.M, new wi(new aa(obj, (byte) 1), (byte) 4));
        if (obj.x == null) {
            int i = vm0.b;
            ViewParent parent = jf7.E(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    public final void f1() {
        u34 u34Var = this.N;
        x34 x34Var = this.b0;
        if (u34Var != null) {
            qt4 qt4Var = this.Z;
            if (qt4Var != null) {
                u34Var.b(new pt4(qt4Var));
            }
            qt4 qt4Var2 = this.d0;
            if (qt4Var2 != null) {
                u34Var.b(new pt4(qt4Var2));
            }
            fo2 fo2Var = this.a0;
            if (fo2Var != null) {
                u34Var.b(new go2(fo2Var));
            }
            Object[] objArr = x34Var.c;
            long[] jArr = x34Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                u34Var.b(new pt4((qt4) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.Z = null;
        this.d0 = null;
        this.a0 = null;
        x34Var.a();
    }

    public final long g1(long j) {
        long D0 = wc7.O(this).V.D0(((rv6) t80.C(this, bv0.t)).d());
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (D0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (D0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    public final void h1(boolean z) {
        qt4 qt4Var;
        ei1 ei1Var;
        u34 u34Var = this.N;
        if (u34Var != null) {
            bx5 bx5Var = this.g0;
            vz0 vz0Var = null;
            if (bx5Var != null && bx5Var.isActive()) {
                bx5 bx5Var2 = this.g0;
                if (bx5Var2 != null) {
                    bx5Var2.l(null);
                }
            } else {
                if (z) {
                    qt4Var = this.d0;
                } else {
                    qt4Var = this.Z;
                }
                if (qt4Var != null) {
                    pt4 pt4Var = new pt4(qt4Var);
                    h43 h43Var = (h43) ((ke0) O0()).y.get(h95.F);
                    if (h43Var != null) {
                        ei1Var = h43Var.l0(new b0(u34Var, pt4Var, (byte) 0));
                    } else {
                        ei1Var = null;
                    }
                    tl7.z(O0(), null, null, new e0((Object) u34Var, (Object) pt4Var, (Object) ei1Var, vz0Var, (byte) 0), 3);
                }
            }
            if (z) {
                this.d0 = null;
            } else {
                this.Z = null;
            }
        }
    }

    public final void i1(long j, boolean z) {
        qt4 qt4Var;
        u34 u34Var = this.N;
        if (u34Var != null) {
            bx5 bx5Var = this.g0;
            if (bx5Var != null && bx5Var.isActive()) {
                bx5Var.l(null);
                tl7.z(O0(), null, null, new f0((Object) bx5Var, j, u34Var, (vz0) null, (byte) 0), 3);
            } else {
                if (z) {
                    qt4Var = this.d0;
                } else {
                    qt4Var = this.Z;
                }
                if (qt4Var != null) {
                    tl7.z(O0(), null, null, new g0(qt4Var, u34Var, null), 3);
                }
            }
            if (z) {
                this.d0 = null;
            } else {
                this.Z = null;
            }
        }
    }

    public final void j1(dy2 dy2Var) {
        u34 u34Var = this.N;
        if (u34Var != null) {
            qt4 qt4Var = new qt4(dy2Var.c);
            vz0 vz0Var = null;
            if (e1()) {
                this.g0 = tl7.z(O0(), null, null, new h0(u34Var, qt4Var, this, vz0Var, (byte) 0), 3);
            } else {
                this.d0 = qt4Var;
                tl7.z(O0(), null, null, new g0(u34Var, qt4Var, vz0Var, (byte) 1), 3);
            }
        }
    }

    public final void k1(uq4 uq4Var) {
        u34 u34Var = this.N;
        if (u34Var != null) {
            qt4 qt4Var = new qt4(uq4Var.c);
            vz0 vz0Var = null;
            if (e1()) {
                this.g0 = tl7.z(O0(), null, null, new h0(u34Var, qt4Var, this, vz0Var, (byte) 1), 3);
            } else {
                this.Z = qt4Var;
                tl7.z(O0(), null, null, new g0(u34Var, qt4Var, vz0Var, (byte) 2), 3);
            }
        }
    }

    public final void l1() {
        by2 by2Var;
        if (this.Y == null) {
            if (this.P) {
                by2Var = this.V;
            } else {
                by2Var = this.O;
            }
            if (by2Var != null) {
                u34 u34Var = this.N;
                if (u34Var == null) {
                    u34Var = new u34();
                    this.N = u34Var;
                }
                this.U.f1(u34Var);
                u34 u34Var2 = this.N;
                u34Var2.getClass();
                yc1 a = by2Var.a(u34Var2);
                a1(a);
                this.Y = a;
            }
        }
    }

    @Override // defpackage.j83
    public final boolean m(KeyEvent keyEvent) {
        return false;
    }

    public boolean n1(KeyEvent keyEvent) {
        return false;
    }

    public void o1(KeyEvent keyEvent) {
        p1();
    }

    public final void p1() {
        av5 av5Var = (av5) t80.C(this, bv0.v);
        if (av5Var != null) {
            av5Var.a();
        }
        this.T.invoke();
    }

    @Override // defpackage.mc4
    public final void q0() {
        if (this.P) {
            h98.I(this, new a0(this, (byte) 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q1(defpackage.u34 r4, defpackage.by2 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.m65 r9, defpackage.sb2 r10) {
        /*
            r3 = this;
            u34 r0 = r3.e0
            boolean r0 = defpackage.a34.i(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.f1()
            r3.e0 = r4
            r3.N = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            by2 r0 = r3.O
            boolean r0 = defpackage.a34.i(r0, r5)
            if (r0 != 0) goto L1f
            r3.O = r5
            r4 = r1
        L1f:
            boolean r5 = r3.P
            if (r5 == r6) goto L2b
            r3.P = r6
            if (r6 == 0) goto L2a
            r3.q0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.S
            r6 = 0
            m82 r0 = r3.U
            if (r5 == r7) goto L52
            if (r7 == 0) goto L38
            r3.a1(r0)
            goto L3e
        L38:
            r3.b1(r0)
            r3.f1()
        L3e:
            defpackage.z51.w(r3)
            if (r7 != 0) goto L50
            ee2 r5 = r3.W
            if (r5 == 0) goto L4a
            r3.b1(r5)
        L4a:
            r3.W = r6
            java.lang.String r5 = "idle"
            r3.X = r5
        L50:
            r3.S = r7
        L52:
            java.lang.String r5 = r3.Q
            boolean r5 = defpackage.a34.i(r5, r8)
            if (r5 != 0) goto L5f
            r3.Q = r8
            defpackage.z51.w(r3)
        L5f:
            m65 r5 = r3.R
            boolean r5 = defpackage.a34.i(r5, r9)
            if (r5 != 0) goto L6c
            r3.R = r9
            defpackage.z51.w(r3)
        L6c:
            r3.T = r10
            boolean r5 = r3.f0
            u34 r7 = r3.e0
            if (r7 != 0) goto L76
            r8 = r1
            goto L77
        L76:
            r8 = r2
        L77:
            if (r5 == r8) goto L86
            if (r7 != 0) goto L7c
            r2 = r1
        L7c:
            r3.f0 = r2
            if (r2 != 0) goto L85
            yc1 r5 = r3.Y
            if (r5 != 0) goto L85
            goto L88
        L85:
            r5 = r2
        L86:
            r1 = r4
            r2 = r5
        L88:
            if (r1 == 0) goto L9a
            yc1 r4 = r3.Y
            if (r4 != 0) goto L90
            if (r2 != 0) goto L9a
        L90:
            if (r4 == 0) goto L95
            r3.b1(r4)
        L95:
            r3.Y = r6
            r3.l1()
        L9a:
            u34 r3 = r3.N
            r0.f1(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.q1(u34, by2, boolean, boolean, java.lang.String, m65, sb2):void");
    }

    public void x(nq4 nq4Var, oq4 oq4Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.c0 = (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        l1();
        if (this.S) {
            if (this.W == null) {
                ee2 ee2Var = new ee2(this);
                a1(ee2Var);
                this.W = ee2Var;
            }
            if (oq4Var == oq4.y) {
                int i = nq4Var.f;
                vz0 vz0Var = null;
                if (i == 4) {
                    tl7.z(O0(), null, null, new j0(this, vz0Var, (byte) 0), 3);
                } else if (i == 5) {
                    tl7.z(O0(), null, null, new j0(this, vz0Var, (byte) 1), 3);
                }
            }
        }
    }

    public void m1() {
    }

    public void d1(bi5 bi5Var) {
    }
}
