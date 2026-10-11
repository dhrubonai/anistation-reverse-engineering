package defpackage;

import android.view.KeyEvent;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fa6 extends zc1 implements zo1, fn4, sh5, hf2, xq4, j83, wu0, a04, mc4, fa3, v72 {
    public gi6 N;
    public dd6 O;
    public cc6 P;
    public boolean Q;
    public o83 R;
    public he5 S;
    public boolean T;
    public u34 U;
    public t44 V;
    public final m82 W;
    public final a46 X;
    public bn1 Y;
    public final hn1 Z;
    public r47 a0;
    public bx5 b0;
    public final dn0 c0;
    public final ba6 d0;
    public bx5 e0;
    public final z96 f0;
    public final ti4 g0;

    public fa6(gi6 gi6Var, dd6 dd6Var, cc6 cc6Var, boolean z, o83 o83Var, he5 he5Var, boolean z2, u34 u34Var, t44 t44Var) {
        this.N = gi6Var;
        this.O = dd6Var;
        this.P = cc6Var;
        this.Q = z;
        this.R = o83Var;
        this.S = he5Var;
        this.T = z2;
        this.U = u34Var;
        this.V = t44Var;
        byte b = 3;
        cc6Var.l = new z96(this, b);
        byte b2 = 0;
        this.W = new m82(u34Var, new aa6(this, b2), 2);
        ec ecVar = new ec(this, (byte) 7);
        nq4 nq4Var = v36.a;
        a46 a46Var = new a46(null, null, null, ecVar);
        a1(a46Var);
        this.X = a46Var;
        byte b3 = 5;
        z96 z96Var = new z96(this, b3);
        ba6 ba6Var = new ba6(this, b2);
        byte b4 = 1;
        aa6 aa6Var = new aa6(this, b4);
        aa6 aa6Var2 = new aa6(this, (byte) 2);
        aa6 aa6Var3 = new aa6(this, b);
        byte b5 = 4;
        hn1 hn1Var = new hn1(new b0(new pp5((Object) z96Var, (byte) 11), new ha6(aa6Var, ba6Var, aa6Var2, aa6Var3, new aa6(this, b5), new aa6(this, b3)), (byte) 26), 1);
        a1(hn1Var);
        this.Z = hn1Var;
        this.c0 = new dn0((byte) 4);
        this.d0 = new ba6(this, b4);
        this.f0 = new z96(this, b5);
        this.g0 = xt5.g(Boolean.FALSE);
    }

    @Override // defpackage.v72
    public final void D(s72 s72Var) {
        ha3 b;
        cc6 cc6Var = this.P;
        dd6 dd6Var = cc6Var.b;
        bd6 c = dd6Var.c();
        n05 n05Var = n05.e;
        if (c != null) {
            if (!cc6Var.h) {
                n05Var = l68.E;
            } else {
                p96 d = cc6Var.a.d();
                if (nd6.d(d.B)) {
                    n05Var = cc6Var.a(c, d);
                } else {
                    long j = d.B;
                    if (!nd6.d(j)) {
                        int i = (int) (j >> 32);
                        o24 o24Var = c.b;
                        int d2 = o24Var.d(i);
                        int i2 = (int) (4294967295L & j);
                        int d3 = o24Var.d(i2);
                        if (d2 == d3) {
                            float e = c.e(i, true);
                            float e2 = c.e(i2, true);
                            n05Var = new n05(Math.min(e, e2), o24Var.f(d2), Math.max(e, e2), o24Var.b(d3));
                        } else {
                            n05Var = c.j(nd6.g(j), nd6.f(j)).c();
                        }
                    }
                }
                ha3 e3 = dd6Var.e();
                if (e3 != null) {
                    ha3 ha3Var = null;
                    if (!e3.m()) {
                        e3 = null;
                    }
                    if (e3 != null && (b = dd6Var.b()) != null) {
                        if (b.m()) {
                            ha3Var = b;
                        }
                        if (ha3Var != null) {
                            n05Var = n05Var.k(ha3Var.G(e3, false).f());
                        }
                    }
                }
            }
        }
        s72Var.d(n05Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x012c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019f  */
    @Override // defpackage.j83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(android.view.KeyEvent r25) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa6.E(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        p96 c = this.N.a.c();
        long j = c.B;
        ko koVar = new ko(this.N.a.c().A.toString());
        w73[] w73VarArr = zh5.a;
        ai5 ai5Var = yh5.F;
        w73[] w73VarArr2 = zh5.a;
        w73 w73Var = w73VarArr2[18];
        ai5Var.getClass();
        bi5Var.b(ai5Var, koVar);
        ko koVar2 = new ko(c.A.toString());
        ai5 ai5Var2 = yh5.G;
        w73 w73Var2 = w73VarArr2[19];
        ai5Var2.getClass();
        bi5Var.b(ai5Var2, koVar2);
        ai5 ai5Var3 = yh5.H;
        byte b = 20;
        w73 w73Var3 = w73VarArr2[20];
        nd6 nd6Var = new nd6(j);
        ai5Var3.getClass();
        bi5Var.b(ai5Var3, nd6Var);
        nd6 nd6Var2 = this.N.a.c().C;
        ai5 ai5Var4 = yh5.I;
        w73 w73Var4 = w73VarArr2[21];
        ai5Var4.getClass();
        bi5Var.b(ai5Var4, nd6Var2);
        xz2 xz2Var = new xz2(((Boolean) this.N.a.e.getValue()).booleanValue(), ((Boolean) this.N.a.f.getValue()).booleanValue());
        ai5 ai5Var5 = yh5.M;
        w73 w73Var5 = w73VarArr2[27];
        ai5Var5.getClass();
        bi5Var.b(ai5Var5, xz2Var);
        if (!this.Q) {
            bi5Var.b(yh5.j, pn6.a);
        }
        final boolean z = this.Q;
        ai5 ai5Var6 = yh5.Q;
        w73 w73Var6 = w73VarArr2[28];
        Boolean valueOf = Boolean.valueOf(z);
        ai5Var6.getClass();
        bi5Var.b(ai5Var6, valueOf);
        kb kbVar = nr1.B;
        ai5 ai5Var7 = yh5.s;
        byte b2 = 9;
        w73 w73Var7 = w73VarArr2[9];
        ai5Var7.getClass();
        bi5Var.b(ai5Var7, kbVar);
        ic icVar = new ic(AutofillValue.forText(kb0.M(c)));
        ai5 ai5Var8 = yh5.t;
        byte b3 = 10;
        w73 w73Var8 = w73VarArr2[10];
        ai5Var8.getClass();
        bi5Var.b(ai5Var8, icVar);
        final byte b4 = 0;
        bi5Var.b(oh5.h, new o3(null, new ub2() { // from class: y96
            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                CharSequence charSequence;
                byte b5 = b4;
                boolean z2 = true;
                fa6 fa6Var = this;
                boolean z3 = z;
                switch (b5) {
                    case 0:
                        ic icVar2 = (ic) obj;
                        if (!z3) {
                            z2 = false;
                        } else {
                            AutofillValue autofillValue = icVar2.a;
                            vz0 vz0Var = null;
                            if (autofillValue.isText()) {
                                charSequence = autofillValue.getTextValue();
                            } else {
                                charSequence = null;
                            }
                            if (charSequence != null) {
                                fa6Var.N.g(charSequence);
                            }
                            fa6Var.g0.setValue(Boolean.TRUE);
                            tl7.z(fa6Var.O0(), null, null, new ca6(fa6Var, vz0Var, (byte) 3), 3);
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        ko koVar3 = (ko) obj;
                        if (!z3) {
                            z2 = false;
                        } else {
                            fa6Var.N.g(koVar3);
                        }
                        return Boolean.valueOf(z2);
                    default:
                        ko koVar4 = (ko) obj;
                        if (!z3) {
                            z2 = false;
                        } else {
                            gi6.h(fa6Var.N, koVar4, false, false, 28);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        int i = this.R.c;
        byte b5 = 8;
        byte b6 = 6;
        if (i == 6) {
            kz0.a.getClass();
            zh5.d(bi5Var, gz0.c);
        } else if (i == 7) {
            kz0.a.getClass();
            zh5.d(bi5Var, gz0.b);
        } else if (i == 8) {
            kz0.a.getClass();
            zh5.d(bi5Var, gz0.b);
        } else if (i == 4) {
            kz0.a.getClass();
            zh5.d(bi5Var, gz0.d);
        }
        zh5.a(bi5Var, new aa6(this, b6));
        final byte b7 = 2;
        if (z) {
            final byte b8 = 1;
            bi5Var.b(oh5.k, new o3(null, new ub2() { // from class: y96
                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    CharSequence charSequence;
                    byte b52 = b8;
                    boolean z2 = true;
                    fa6 fa6Var = this;
                    boolean z3 = z;
                    switch (b52) {
                        case 0:
                            ic icVar2 = (ic) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                AutofillValue autofillValue = icVar2.a;
                                vz0 vz0Var = null;
                                if (autofillValue.isText()) {
                                    charSequence = autofillValue.getTextValue();
                                } else {
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    fa6Var.N.g(charSequence);
                                }
                                fa6Var.g0.setValue(Boolean.TRUE);
                                tl7.z(fa6Var.O0(), null, null, new ca6(fa6Var, vz0Var, (byte) 3), 3);
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            ko koVar3 = (ko) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                fa6Var.N.g(koVar3);
                            }
                            return Boolean.valueOf(z2);
                        default:
                            ko koVar4 = (ko) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                gi6.h(fa6Var.N, koVar4, false, false, 28);
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
            bi5Var.b(oh5.o, new o3(null, new ub2() { // from class: y96
                @Override // defpackage.ub2
                public final Object invoke(Object obj) {
                    CharSequence charSequence;
                    byte b52 = b7;
                    boolean z2 = true;
                    fa6 fa6Var = this;
                    boolean z3 = z;
                    switch (b52) {
                        case 0:
                            ic icVar2 = (ic) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                AutofillValue autofillValue = icVar2.a;
                                vz0 vz0Var = null;
                                if (autofillValue.isText()) {
                                    charSequence = autofillValue.getTextValue();
                                } else {
                                    charSequence = null;
                                }
                                if (charSequence != null) {
                                    fa6Var.N.g(charSequence);
                                }
                                fa6Var.g0.setValue(Boolean.TRUE);
                                tl7.z(fa6Var.O0(), null, null, new ca6(fa6Var, vz0Var, (byte) 3), 3);
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            ko koVar3 = (ko) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                fa6Var.N.g(koVar3);
                            }
                            return Boolean.valueOf(z2);
                        default:
                            ko koVar4 = (ko) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                gi6.h(fa6Var.N, koVar4, false, false, 28);
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
        }
        bi5Var.b(oh5.j, new o3(null, new fr5(this, b)));
        int a = this.R.a();
        zh5.b(bi5Var, a, new af1(this, a, b7));
        bi5Var.b(oh5.b, new o3(null, new z96(this, b5)));
        bi5Var.b(oh5.c, new o3(null, new z96(this, b2)));
        if (!nd6.d(j)) {
            bi5Var.b(oh5.q, new o3(null, new z96(this, b3)));
            if (this.Q) {
                bi5Var.b(oh5.r, new o3(null, new z96(this, b4)));
            }
        }
        if (z) {
            bi5Var.b(oh5.s, new o3(null, new z96(this, b6)));
        }
        if (this.Q) {
            this.W.I0(bi5Var);
        }
    }

    @Override // defpackage.xq4
    public final void J() {
        this.X.J();
    }

    @Override // defpackage.sh5
    public final boolean K0() {
        return true;
    }

    @Override // defpackage.xz3
    public final void S0() {
        h98.I(this, new z96(this, (byte) 1));
        this.P.m = this.f0;
        if (this.Q) {
            a1(this.W);
        }
    }

    @Override // defpackage.xz3
    public final void T0() {
        d1();
        this.P.m = null;
    }

    @Override // defpackage.fa3, defpackage.yo3
    public final void a(long j) {
        this.Z.O = j;
    }

    public final void d1() {
        bx5 bx5Var = this.e0;
        if (bx5Var != null) {
            bx5Var.l(null);
        }
        this.e0 = null;
        t44 t44Var = this.V;
        if (t44Var != null) {
            t44Var.b();
        }
    }

    public final void e1() {
        bn1 bn1Var = this.Y;
        if (bn1Var != null) {
            this.U.b(new cn1(bn1Var));
            this.Y = null;
        }
    }

    @Override // defpackage.hf2
    public final void f0(fa4 fa4Var) {
        this.O.e.setValue(fa4Var);
        if (this.Q) {
            this.W.f0(fa4Var);
        }
    }

    public final boolean f1() {
        r47 r47Var;
        if (this.W.S.f1().a() && (r47Var = this.a0) != null && ((lf3) r47Var).a()) {
            return true;
        }
        return false;
    }

    public final boolean g1(int i) {
        he5 he5Var;
        if (i == 0 || i == 1 || (he5Var = this.S) == null) {
            if (i == 6) {
                ((r72) ((p72) t80.C(this, bv0.i))).h(1, true);
                return true;
            }
            if (i == 5) {
                ((r72) ((p72) t80.C(this, bv0.i))).h(2, true);
                return true;
            }
            if (i == 7) {
                ((id1) h1()).a();
                return true;
            }
            return false;
        }
        ic6 ic6Var = he5Var.a;
        p72 p72Var = he5Var.b;
        ub2 ub2Var = he5Var.c;
        String obj = uz5.w0(ic6Var.c().A.toString()).toString();
        if (obj.length() > 0) {
            yu5.l(ic6Var, obj);
            p72.a(p72Var);
            ub2Var.invoke(obj);
        }
        return true;
    }

    public final ou5 h1() {
        ou5 ou5Var = (ou5) t80.C(this, bv0.q);
        if (ou5Var != null) {
            return ou5Var;
        }
        ze0.m("No software keyboard controller");
        return null;
    }

    public final void i1(boolean z) {
        boolean z2;
        if (!z) {
            Boolean bool = this.R.e;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = true;
            }
            if (!z2) {
                return;
            }
        }
        a34.f0(this);
        this.e0 = tl7.z(O0(), null, y11.A, new ca6(this, null, (byte) 5), 1);
    }

    @Override // defpackage.j83
    public final boolean m(KeyEvent keyEvent) {
        gi6 gi6Var = this.N;
        cc6 cc6Var = this.P;
        h1();
        this.c0.getClass();
        if (nd6.d(gi6Var.d().B) || keyEvent.getKeyCode() != 4 || h41.E(keyEvent) != 1) {
            return false;
        }
        gi6 gi6Var2 = cc6Var.a;
        if (!nd6.d(gi6Var2.d().B)) {
            ic6 ic6Var = gi6Var2.a;
            ic6Var.b.a().n();
            o96 o96Var = ic6Var.b;
            int i = (int) (o96Var.C & 4294967295L);
            ss5.j(o96Var, i, i);
            ic6Var.b(true, ia6.x);
            ic6Var.f(true);
            ic6Var.e(ic6Var.b.A);
        }
        cc6Var.w(false);
        cc6Var.x(be6.x);
        return true;
    }

    @Override // defpackage.fa3
    public final void o(ha3 ha3Var) {
        this.Z.getClass();
    }

    @Override // defpackage.mc4
    public final void q0() {
        h98.I(this, new z96(this, (byte) 1));
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        bb3Var.a();
        if (((Boolean) this.g0.getValue()).booleanValue()) {
            ka0 ka0Var = (ka0) t80.C(this, ry.a);
            long j = ((ep0) t80.C(this, ry.b)).a;
            long e = w65.e(1308617531);
            int i = ep0.j;
            if (!cm6.a(j, e)) {
                ka0Var = new su5(j);
            }
            bp1.a0(bb3Var, ka0Var, 0L, 0L, 0.0f, null, 126);
        }
    }

    @Override // defpackage.xq4
    public final void x(nq4 nq4Var, oq4 oq4Var, long j) {
        this.X.x(nq4Var, oq4Var, j);
    }
}
