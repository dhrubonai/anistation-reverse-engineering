package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ad5 extends zc1 implements wu0, mc4 {
    public kd5 N;
    public rg4 O;
    public boolean P;
    public i42 Q;
    public u34 R;
    public fa0 S;
    public boolean T;
    public fc U;
    public jd5 V;
    public yc1 W;
    public gc X;
    public fc Y;
    public boolean Z;

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    @Override // defpackage.xz3
    public final void S0() {
        fc fcVar;
        this.Z = e1();
        d1();
        if (this.V == null) {
            kd5 kd5Var = this.N;
            if (this.T) {
                fcVar = this.Y;
            } else {
                fcVar = this.U;
            }
            fc fcVar2 = fcVar;
            i42 i42Var = this.Q;
            rg4 rg4Var = this.O;
            boolean z = this.P;
            boolean z2 = this.Z;
            jd5 jd5Var = new jd5(fcVar2, this.S, i42Var, this.R, rg4Var, kd5Var, z, z2);
            a1(jd5Var);
            this.V = jd5Var;
        }
    }

    @Override // defpackage.xz3
    public final void T0() {
        yc1 yc1Var = this.W;
        if (yc1Var != null) {
            b1(yc1Var);
        }
    }

    @Override // defpackage.yc1
    public final void V() {
        fc fcVar;
        boolean e1 = e1();
        if (this.Z != e1) {
            this.Z = e1;
            kd5 kd5Var = this.N;
            rg4 rg4Var = this.O;
            boolean z = this.T;
            if (z) {
                fcVar = this.Y;
            } else {
                fcVar = this.U;
            }
            fc fcVar2 = fcVar;
            boolean z2 = this.P;
            f1(fcVar2, this.S, this.Q, this.R, rg4Var, kd5Var, z, z2);
        }
    }

    public final void d1() {
        fc fcVar;
        yc1 yc1Var = this.W;
        if (yc1Var == null) {
            if (this.T) {
                h98.I(this, new nj4(this, (byte) 13));
            }
            if (this.T) {
                fcVar = this.Y;
            } else {
                fcVar = this.U;
            }
            if (fcVar != null) {
                zc1 zc1Var = fcVar.i;
                if (!zc1Var.x.K) {
                    a1(zc1Var);
                    this.W = zc1Var;
                    return;
                }
                return;
            }
            return;
        }
        if (!((xz3) yc1Var).x.K) {
            a1(yc1Var);
        }
    }

    public final boolean e1() {
        ia3 ia3Var;
        if (this.K) {
            ia3Var = wc7.O(this).W;
        } else {
            ia3Var = ia3.x;
        }
        rg4 rg4Var = this.O;
        if (ia3Var == ia3.y && rg4Var != rg4.x) {
            return false;
        }
        return true;
    }

    public final void f1(fc fcVar, fa0 fa0Var, i42 i42Var, u34 u34Var, rg4 rg4Var, kd5 kd5Var, boolean z, boolean z2) {
        boolean z3;
        fc fcVar2;
        this.N = kd5Var;
        this.O = rg4Var;
        boolean z4 = true;
        if (this.T != z) {
            this.T = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!a34.i(this.U, fcVar)) {
            this.U = fcVar;
        } else {
            z4 = false;
        }
        if (z3 || (z4 && !z)) {
            yc1 yc1Var = this.W;
            if (yc1Var != null) {
                b1(yc1Var);
            }
            this.W = null;
            d1();
        }
        this.P = z2;
        this.Q = i42Var;
        this.R = u34Var;
        this.S = fa0Var;
        boolean e1 = e1();
        this.Z = e1;
        jd5 jd5Var = this.V;
        if (jd5Var != null) {
            if (this.T) {
                fcVar2 = this.Y;
            } else {
                fcVar2 = this.U;
            }
            jd5Var.v1(fcVar2, fa0Var, i42Var, u34Var, rg4Var, kd5Var, z2, e1);
        }
    }

    @Override // defpackage.mc4
    public final void q0() {
        fc fcVar;
        gc gcVar = (gc) t80.C(this, fh4.a);
        if (!a34.i(gcVar, this.X)) {
            this.X = gcVar;
            this.Y = null;
            yc1 yc1Var = this.W;
            if (yc1Var != null) {
                b1(yc1Var);
            }
            this.W = null;
            d1();
            jd5 jd5Var = this.V;
            if (jd5Var != null) {
                kd5 kd5Var = this.N;
                rg4 rg4Var = this.O;
                if (this.T) {
                    fcVar = this.Y;
                } else {
                    fcVar = this.U;
                }
                fc fcVar2 = fcVar;
                boolean z = this.P;
                boolean z2 = this.Z;
                jd5Var.v1(fcVar2, this.S, this.Q, this.R, rg4Var, kd5Var, z, z2);
            }
        }
    }
}
