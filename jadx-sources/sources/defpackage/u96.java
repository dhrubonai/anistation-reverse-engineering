package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u96 extends zc1 implements ra3, zo1, wu0, hf2, sh5 {
    public boolean N;
    public boolean O;
    public dd6 P;
    public gi6 Q;
    public cc6 R;
    public ka0 S;
    public boolean T;
    public yc5 U;
    public rg4 V;
    public fg6 W;
    public bn4 X;
    public j31 Y;
    public bx5 Z;
    public nd6 a0;
    public n05 b0 = new n05(-1.0f, -1.0f, -1.0f, -1.0f);
    public int c0;
    public int d0;
    public final va6 e0;
    public final f96 f0;

    public u96(boolean z, boolean z2, boolean z3, dd6 dd6Var, gi6 gi6Var, cc6 cc6Var, ka0 ka0Var, boolean z4, yc5 yc5Var, rg4 rg4Var, fg6 fg6Var, bn4 bn4Var) {
        boolean z5;
        this.N = z;
        this.O = z2;
        this.P = dd6Var;
        this.Q = gi6Var;
        this.R = cc6Var;
        this.S = ka0Var;
        this.T = z4;
        this.U = yc5Var;
        this.V = rg4Var;
        this.W = fg6Var;
        this.X = bn4Var;
        byte b = 1;
        if (!z && !z2 && !z3) {
            z5 = false;
        } else {
            z5 = true;
        }
        ai5 ai5Var = lm3.a;
        va6 va6Var = new va6(gi6Var, cc6Var, dd6Var, z5);
        a1(va6Var);
        this.e0 = va6Var;
        f96 f96Var = new f96(this.W, new s96(this, null, (byte) 0), new vj(this, null, b), new pp5((Object) this, (byte) 10));
        a1(f96Var);
        this.f0 = f96Var;
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        this.e0.I0(bi5Var);
    }

    @Override // defpackage.xz3
    public final void S0() {
        cc6 cc6Var = this.R;
        boolean z = this.N;
        cc6Var.h = z;
        if (z && d1()) {
            e1();
        }
    }

    public final boolean d1() {
        if (this.T) {
            if (this.N || this.O) {
                ka0 ka0Var = this.S;
                if (!(ka0Var instanceof su5) || ((su5) ka0Var).a != 16) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ra3
    public final wo3 e(final xo3 xo3Var, ro3 ro3Var, long j) {
        rg4 rg4Var = this.V;
        rg4 rg4Var2 = rg4.x;
        ot1 ot1Var = ot1.x;
        if (rg4Var == rg4Var2) {
            final em4 p = ro3Var.p(rx0.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int min = Math.min(p.y, rx0.g(j));
            final byte b = 1;
            return xo3Var.L(p.x, min, ot1Var, new ub2(this) { // from class: r96
                public final /* synthetic */ u96 y;

                {
                    this.y = this;
                }

                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    byte b2 = b;
                    pn6 pn6Var = pn6.a;
                    xo3 xo3Var2 = xo3Var;
                    em4 em4Var = p;
                    switch (b2) {
                        case 0:
                            dm4 dm4Var = (dm4) obj;
                            int i = em4Var.x;
                            u96 u96Var = this.y;
                            u96Var.f1(dm4Var, min, i, u96Var.Q.d().B, xo3Var2.getLayoutDirection());
                            dm4.j(dm4Var, em4Var, -u96Var.U.a.h(), 0);
                            return pn6Var;
                        default:
                            dm4 dm4Var2 = (dm4) obj;
                            int i2 = em4Var.y;
                            u96 u96Var2 = this.y;
                            u96Var2.f1(dm4Var2, min, i2, u96Var2.Q.d().B, xo3Var2.getLayoutDirection());
                            dm4.j(dm4Var2, em4Var, 0, -u96Var2.U.a.h());
                            return pn6Var;
                    }
                }
            });
        }
        final em4 p2 = ro3Var.p(rx0.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int min2 = Math.min(p2.x, rx0.h(j));
        final byte b2 = 0;
        return xo3Var.L(min2, p2.y, ot1Var, new ub2(this) { // from class: r96
            public final /* synthetic */ u96 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                byte b22 = b2;
                pn6 pn6Var = pn6.a;
                xo3 xo3Var2 = xo3Var;
                em4 em4Var = p2;
                switch (b22) {
                    case 0:
                        dm4 dm4Var = (dm4) obj;
                        int i = em4Var.x;
                        u96 u96Var = this.y;
                        u96Var.f1(dm4Var, min2, i, u96Var.Q.d().B, xo3Var2.getLayoutDirection());
                        dm4.j(dm4Var, em4Var, -u96Var.U.a.h(), 0);
                        return pn6Var;
                    default:
                        dm4 dm4Var2 = (dm4) obj;
                        int i2 = em4Var.y;
                        u96 u96Var2 = this.y;
                        u96Var2.f1(dm4Var2, min2, i2, u96Var2.Q.d().B, xo3Var2.getLayoutDirection());
                        dm4.j(dm4Var2, em4Var, 0, -u96Var2.U.a.h());
                        return pn6Var;
                }
            }
        });
    }

    public final void e1() {
        if (this.Y == null) {
            this.Y = new j31(((Boolean) t80.C(this, bv0.y)).booleanValue());
            v94.y(this);
        }
        this.Z = tl7.z(O0(), null, null, new hu1(this, null, (byte) 25), 3);
    }

    @Override // defpackage.hf2
    public final void f0(fa4 fa4Var) {
        this.P.d.setValue(fa4Var);
        this.e0.f0(fa4Var);
    }

    public final void f1(dm4 dm4Var, int i, int i2, long j, ia3 ia3Var) {
        int i3;
        bd6 c;
        boolean z;
        float f;
        boolean z2;
        float f2;
        float f3;
        boolean z3 = false;
        Integer num = 0;
        this.U.b.i(i);
        this.U.f(i2 - i);
        nd6 nd6Var = this.a0;
        if (nd6Var != null) {
            int i4 = nd6.c;
            int i5 = (int) (j & 4294967295L);
            long j2 = nd6Var.a;
            if (i5 == ((int) (j2 & 4294967295L))) {
                i3 = (int) (j >> 32);
                if (i3 == ((int) (j2 >> 32)) && i2 == this.c0 && i == this.d0) {
                    i3 = -1;
                }
                if (i3 < 0 && d1() && (c = this.P.c()) != null) {
                    d13 d13Var = new d13(0, c.a.a.y.length(), 1);
                    if (!d13Var.isEmpty()) {
                        if (i3 < num.intValue()) {
                            i3 = num.intValue();
                        } else {
                            int i6 = d13Var.y;
                            if (i3 > Integer.valueOf(i6).intValue()) {
                                i3 = Integer.valueOf(i6).intValue();
                            }
                        }
                        n05 c2 = c.c(i3);
                        float f4 = c2.a;
                        float f5 = c2.c;
                        if (ia3Var == ia3.y) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int x0 = dm4Var.x0(2.0f);
                        if (z) {
                            f = i2 - f5;
                        } else {
                            f = f4;
                        }
                        if (z) {
                            f4 = i2 - f5;
                        }
                        float f6 = f4 + x0;
                        float f7 = i2;
                        if (f6 > f7) {
                            f6 = f7;
                        }
                        n05 b = n05.b(c2, f, f6, 10);
                        float f8 = b.b;
                        float f9 = b.a;
                        n05 n05Var = this.b0;
                        if (f9 == n05Var.a && f8 == n05Var.b && i2 == this.c0) {
                            z2 = false;
                        } else {
                            z2 = false;
                            z3 = true;
                        }
                        if (z3 || i != this.d0) {
                            if (this.V == rg4.x) {
                                z2 = true;
                            }
                            if (!z2) {
                                f8 = f9;
                            }
                            if (z2) {
                                f2 = b.d;
                            } else {
                                f2 = b.c;
                            }
                            int h = this.U.a.h();
                            float f10 = h + i;
                            if (f2 <= f10) {
                                float f11 = h;
                                if (f8 >= f11 || f2 - f8 <= i) {
                                    if (f8 < f11 && f2 - f8 <= i) {
                                        f3 = f8 - f11;
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    this.a0 = new nd6(j);
                                    this.b0 = b;
                                    this.d0 = i;
                                    this.c0 = i2;
                                    tl7.z(O0(), null, y11.A, new t96(f3, this, z3, j, c2, null), 1);
                                    return;
                                }
                            }
                            f3 = f2 - f10;
                            this.a0 = new nd6(j);
                            this.b0 = b;
                            this.d0 = i;
                            this.c0 = i2;
                            tl7.z(O0(), null, y11.A, new t96(f3, this, z3, j, c2, null), 1);
                            return;
                        }
                        return;
                    }
                    ov3.o(d13Var, "Cannot coerce value to an empty range: ");
                    return;
                }
                return;
            }
        }
        int i7 = nd6.c;
        i3 = (int) (j & 4294967295L);
        if (i3 < 0) {
        }
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        int g;
        int f;
        float f2;
        bb3Var.a();
        p96 d = this.Q.d();
        bd6 c = this.P.c();
        if (c == null) {
            return;
        }
        ai4 ai4Var = d.D;
        ai4 ai4Var2 = d.D;
        long j = d.B;
        if (ai4Var != null) {
            boolean z = ((pc6) ai4Var.x).a;
            long j2 = ((nd6) ai4Var.y).a;
            if (!nd6.d(j2)) {
                id j3 = c.j(nd6.g(j2), nd6.f(j2));
                xd6 xd6Var = c.a.b;
                if (z) {
                    ka0 d2 = xd6Var.a.a.d();
                    if (d2 != null) {
                        bp1.e0(bb3Var, j3, d2, 0.2f, null, 56);
                    } else {
                        long b = xd6Var.b();
                        if (b == 16) {
                            b = ep0.b;
                        }
                        bp1.J0(bb3Var, j3, ep0.b(ep0.c(b) * 0.2f, b), 0.0f, null, 60);
                    }
                } else {
                    bp1.J0(bb3Var, j3, ((qd6) t80.C(this, rd6.a)).b, 0.0f, null, 60);
                }
            }
        }
        if (nd6.d(j)) {
            uv5.c(bb3Var.n0().y(), c);
            if (ai4Var2 == null) {
                ka0 ka0Var = this.S;
                boolean d1 = d1();
                j31 j31Var = this.Y;
                cc6 cc6Var = this.R;
                if (j31Var != null) {
                    f2 = j31Var.c.h();
                } else {
                    f2 = 0.0f;
                }
                if (f2 != 0.0f && d1) {
                    n05 k = cc6Var.k();
                    bb3Var.d(ka0Var, (Float.floatToRawIntBits((r20 / 2.0f) + r3) << 32) | (Float.floatToRawIntBits(k.b) & 4294967295L), k.c(), k.c - k.a, f2);
                }
            }
        } else {
            if (ai4Var2 == null && (g = nd6.g(j)) != (f = nd6.f(j))) {
                bp1.J0(bb3Var, c.j(g, f), ((qd6) t80.C(this, rd6.a)).b, 0.0f, null, 60);
            }
            uv5.c(bb3Var.n0().y(), c);
        }
        this.e0.u0(bb3Var);
    }
}
