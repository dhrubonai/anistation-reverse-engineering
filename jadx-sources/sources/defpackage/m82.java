package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m82 extends zc1 implements sh5, hf2, wu0, mc4, jj6 {
    public static final i18 T = new i18((byte) 19);
    public u34 N;
    public final ub2 O;
    public k72 P;
    public xd3 Q;
    public fa4 R;
    public final h82 S;

    public m82(u34 u34Var, int i, ub2 ub2Var) {
        this.N = u34Var;
        this.O = ub2Var;
        h82 h82Var = new h82(i, new hj1(2, this, m82.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte) 2), 10);
        a1(h82Var);
        this.S = h82Var;
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        boolean a = this.S.f1().a();
        w73[] w73VarArr = zh5.a;
        ai5 ai5Var = yh5.l;
        w73 w73Var = zh5.a[4];
        Boolean valueOf = Boolean.valueOf(a);
        ai5Var.getClass();
        bi5Var.b(ai5Var, valueOf);
        bi5Var.b(oh5.w, new o3(null, new ia(0, this, m82.class, "requestFocus", "requestFocus()Z", 0, (byte) 15)));
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.xz3
    public final void U0() {
        xd3 xd3Var = this.Q;
        if (xd3Var != null) {
            xd3Var.b();
        }
        this.Q = null;
    }

    public final void d1(u34 u34Var, n13 n13Var) {
        ei1 ei1Var;
        if (this.K) {
            h43 h43Var = (h43) ((ke0) O0()).y.get(h95.F);
            vz0 vz0Var = null;
            if (h43Var != null) {
                ei1Var = h43Var.l0(new b0(u34Var, n13Var, (byte) 29));
            } else {
                ei1Var = null;
            }
            tl7.z(O0(), null, null, new e0((Object) u34Var, (Object) n13Var, (Object) ei1Var, vz0Var, (byte) 20), 3);
            return;
        }
        u34Var.b(n13Var);
    }

    public final void e1() {
        kf kfVar;
        if (this.K) {
            if (!this.x.K) {
                ez2.b("visitAncestors called on an unattached node");
            }
            xz3 xz3Var = this.x.B;
            za3 O = wc7.O(this);
            while (O != null) {
                if ((((xz3) O.c0.D).A & 262144) != 0) {
                    while (xz3Var != null) {
                        if ((xz3Var.z & 262144) != 0) {
                            xz3 xz3Var2 = xz3Var;
                            z44 z44Var = null;
                            while (xz3Var2 != null) {
                                if (xz3Var2 instanceof jj6) {
                                    if (n82.L == ((jj6) xz3Var2).p()) {
                                        return;
                                    }
                                }
                                if ((xz3Var2.z & 262144) != 0 && (xz3Var2 instanceof zc1)) {
                                    int i = 0;
                                    for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                        if ((xz3Var3.z & 262144) != 0) {
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
    }

    @Override // defpackage.hf2
    public final void f0(fa4 fa4Var) {
        this.R = fa4Var;
        if (this.S.f1().a()) {
            if (fa4Var.Y0().K) {
                fa4 fa4Var2 = this.R;
                if (fa4Var2 != null && fa4Var2.Y0().K) {
                    e1();
                    return;
                }
                return;
            }
            e1();
        }
    }

    public final void f1(u34 u34Var) {
        k72 k72Var;
        if (!a34.i(this.N, u34Var)) {
            u34 u34Var2 = this.N;
            if (u34Var2 != null && (k72Var = this.P) != null) {
                u34Var2.b(new l72(k72Var));
            }
            this.P = null;
            this.N = u34Var;
        }
    }

    @Override // defpackage.jj6
    public final Object p() {
        return T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w05] */
    @Override // defpackage.mc4
    public final void q0() {
        ?? obj = new Object();
        h98.I(this, new va1(obj, this, (byte) 8));
        xd3 xd3Var = (xd3) obj.x;
        if (this.S.f1().a()) {
            xd3 xd3Var2 = this.Q;
            if (xd3Var2 != null) {
                xd3Var2.b();
            }
            if (xd3Var != null) {
                xd3Var.a();
            } else {
                xd3Var = null;
            }
            this.Q = xd3Var;
        }
    }

    public m82(u34 u34Var, aa6 aa6Var, int i) {
        this(u34Var, 1, (i & 4) != 0 ? null : aa6Var);
    }
}
