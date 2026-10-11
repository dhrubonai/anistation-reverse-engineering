package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hv1 extends m23 implements fa3 {
    public xi6 M;
    public qi6 N;
    public qi6 O;
    public qi6 P;
    public iv1 Q;
    public rx1 R;
    public ln5 S;
    public sb2 T;
    public vu1 U;
    public long V;
    public e7 W;
    public final gv1 X;
    public final gv1 Y;

    public hv1(xi6 xi6Var, qi6 qi6Var, qi6 qi6Var2, qi6 qi6Var3, iv1 iv1Var, rx1 rx1Var, ln5 ln5Var, sb2 sb2Var, vu1 vu1Var) {
        super((byte) 1);
        this.M = xi6Var;
        this.N = qi6Var;
        this.O = qi6Var2;
        this.P = qi6Var3;
        this.Q = iv1Var;
        this.R = rx1Var;
        this.S = ln5Var;
        this.T = sb2Var;
        this.U = vu1Var;
        this.V = -9223372034707292160L;
        sx0.b(0, 0, 0, 0, 15);
        this.X = new gv1(this, (byte) 0);
        this.Y = new gv1(this, (byte) 1);
    }

    @Override // defpackage.xz3
    public final void S0() {
        this.V = -9223372034707292160L;
    }

    public final e7 c1() {
        e7 e7Var;
        e7 e7Var2;
        if (this.M.f().b(tu1.x, tu1.y)) {
            ij0 ij0Var = this.Q.a.c;
            if (ij0Var != null && (e7Var2 = ij0Var.a) != null) {
                return e7Var2;
            }
            ij0 ij0Var2 = this.R.a.c;
            if (ij0Var2 != null) {
                return ij0Var2.a;
            }
            return null;
        }
        ij0 ij0Var3 = this.R.a.c;
        if (ij0Var3 != null && (e7Var = ij0Var3.a) != null) {
            return e7Var;
        }
        ij0 ij0Var4 = this.Q.a.c;
        if (ij0Var4 != null) {
            return ij0Var4.a;
        }
        return null;
    }

    @Override // defpackage.m23, defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        pi6 pi6Var;
        pi6 pi6Var2;
        xh6 xh6Var;
        pi6 pi6Var3;
        long j2;
        pi6 pi6Var4;
        long j3;
        long j4;
        long j5;
        long j6;
        pi6 pi6Var5;
        c13 c13Var;
        ol olVar;
        float f;
        Float f2;
        float f3;
        xh6 xh6Var2;
        Float f4;
        nl nlVar;
        float f5;
        Float f6;
        if (this.M.a.v() == this.M.d.getValue()) {
            this.W = null;
        } else if (this.W == null) {
            e7 c1 = c1();
            if (c1 == null) {
                c1 = pk2.y;
            }
            this.W = c1;
        }
        boolean d0 = xo3Var.d0();
        ot1 ot1Var = ot1.x;
        if (d0) {
            em4 p = ro3Var.p(j);
            long j7 = (p.x << 32) | (p.y & 4294967295L);
            this.V = j7;
            return xo3Var.L((int) (j7 >> 32), (int) (j7 & 4294967295L), ot1Var, new cl(p, (byte) 1));
        }
        if (((Boolean) this.T.invoke()).booleanValue()) {
            vu1 vu1Var = this.U;
            qi6 qi6Var = vu1Var.a;
            ln5 ln5Var = vu1Var.b;
            qi6 qi6Var2 = vu1Var.c;
            xi6 xi6Var = vu1Var.d;
            iv1 iv1Var = vu1Var.e;
            wi6 wi6Var = iv1Var.a;
            rx1 rx1Var = vu1Var.f;
            qi6 qi6Var3 = vu1Var.g;
            byte b = 0;
            if (qi6Var != null) {
                xu1 xu1Var = new xu1(iv1Var, rx1Var, (byte) 0);
                if (ln5Var.a()) {
                    f6 = Float.valueOf(ln5Var.f);
                } else {
                    f6 = null;
                }
                pi6Var = qi6Var.a(xu1Var, f6, null, new yu1(iv1Var, rx1Var, ln5Var, b));
            } else {
                pi6Var = null;
            }
            if (qi6Var2 != null) {
                xu1 xu1Var2 = new xu1(iv1Var, rx1Var, (byte) 1);
                if (ln5Var.a()) {
                    f4 = Float.valueOf(ln5Var.g);
                } else {
                    f4 = null;
                }
                if (ln5Var.a()) {
                    wr6 wr6Var = ln5Var.j;
                    if (wr6Var != null) {
                        float b2 = wr6Var.b();
                        Float valueOf = Float.valueOf(b2);
                        if (Float.isNaN(b2)) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            f5 = valueOf.floatValue();
                            nlVar = new nl(f5);
                        }
                    }
                    f5 = 0.0f;
                    nlVar = new nl(f5);
                } else {
                    nlVar = null;
                }
                pi6Var2 = qi6Var2.a(xu1Var2, f4, nlVar, new yu1(iv1Var, rx1Var, ln5Var, (byte) 1));
            } else {
                pi6Var2 = null;
            }
            if (xi6Var.a.v() == tu1.x) {
                ya5 ya5Var = wi6Var.d;
                if (ya5Var != null) {
                    xh6Var = new xh6(ya5Var.b);
                } else {
                    ya5 ya5Var2 = rx1Var.a.d;
                    if (ya5Var2 != null) {
                        xh6Var = new xh6(ya5Var2.b);
                    }
                    xh6Var = null;
                }
            } else {
                ya5 ya5Var3 = rx1Var.a.d;
                if (ya5Var3 != null) {
                    xh6Var = new xh6(ya5Var3.b);
                } else {
                    ya5 ya5Var4 = wi6Var.d;
                    if (ya5Var4 != null) {
                        xh6Var = new xh6(ya5Var4.b);
                    }
                    xh6Var = null;
                }
            }
            if (qi6Var3 != null) {
                yj yjVar = yj.H;
                if (ln5Var.a()) {
                    xh6Var2 = new xh6(ln5Var.h);
                } else {
                    xh6Var2 = null;
                }
                pi6Var3 = qi6Var3.a(yjVar, xh6Var2, null, new zu1(xh6Var, iv1Var, rx1Var, ln5Var));
            } else {
                pi6Var3 = null;
            }
            zu1 zu1Var = new zu1(ln5Var, pi6Var, pi6Var2, pi6Var3);
            em4 p2 = ro3Var.p(j);
            long j8 = (p2.x << 32) | (p2.y & 4294967295L);
            if (!k13.a(this.V, -9223372034707292160L)) {
                j2 = this.V;
            } else {
                j2 = j8;
            }
            qi6 qi6Var4 = this.N;
            if (qi6Var4 != null) {
                pi6Var4 = qi6Var4.a(this.X, null, null, new fv1(this, j2, (byte) 0));
            } else {
                pi6Var4 = null;
            }
            if (pi6Var4 != null) {
                j3 = ((k13) pi6Var4.getValue()).a;
            } else {
                j3 = j8;
            }
            long d = sx0.d(j, j3);
            qi6 qi6Var5 = this.O;
            if (qi6Var5 != null) {
                j4 = 0;
                j5 = ((c13) qi6Var5.a(yj.M, null, null, new fv1(this, j2, (byte) 2)).getValue()).a;
            } else {
                j4 = 0;
                j5 = 0;
            }
            qi6 qi6Var6 = this.P;
            if (qi6Var6 != null) {
                ln5 ln5Var2 = this.S;
                j6 = j8;
                if (ln5Var2.a()) {
                    c13Var = new c13(ln5Var2.i);
                } else {
                    c13Var = null;
                }
                if (this.S.a()) {
                    float b3 = ur6.b(j4);
                    Float valueOf2 = Float.valueOf(b3);
                    if (Float.isNaN(b3)) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        f = valueOf2.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    float c = ur6.c(j4);
                    Float valueOf3 = Float.valueOf(c);
                    if (!Float.isNaN(c)) {
                        f2 = valueOf3;
                    } else {
                        f2 = null;
                    }
                    if (f2 != null) {
                        f3 = f2.floatValue();
                    } else {
                        f3 = 0.0f;
                    }
                    olVar = new ol(f, f3);
                } else {
                    olVar = null;
                }
                pi6Var5 = qi6Var6.a(this.Y, c13Var, olVar, new fv1(this, j2, (byte) 1));
            } else {
                j6 = j8;
                pi6Var5 = null;
            }
            return xo3Var.L((int) (d >> 32), (int) (d & 4294967295L), ot1Var, new ev1(this, pi6Var5, j6, j2, d, p2, j5, zu1Var));
        }
        em4 p3 = ro3Var.p(j);
        return xo3Var.L(p3.x, p3.y, ot1Var, new cl(p3, (byte) 2));
    }

    @Override // defpackage.fa3
    public final void o(ha3 ha3Var) {
    }
}
