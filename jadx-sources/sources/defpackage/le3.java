package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class le3 extends xz3 implements sh5 {
    public sb2 L;
    public fe3 M;
    public rg4 N;
    public boolean O;
    public hc5 P;
    public final je3 Q = new je3(this, 0);
    public je3 R;

    public le3(sb2 sb2Var, fe3 fe3Var, rg4 rg4Var, boolean z) {
        this.L = sb2Var;
        this.M = fe3Var;
        this.N = rg4Var;
        this.O = z;
        a1();
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        w73[] w73VarArr;
        zh5.i(bi5Var);
        bi5Var.b(yh5.P, this.Q);
        rg4 rg4Var = this.N;
        hc5 hc5Var = this.P;
        if (rg4Var == rg4.x) {
            if (hc5Var != null) {
                ai5 ai5Var = yh5.w;
                w73VarArr = zh5.a;
                w73 w73Var = w73VarArr[13];
                ai5Var.getClass();
                bi5Var.b(ai5Var, hc5Var);
            } else {
                a34.s0("scrollAxisRange");
                throw null;
            }
        } else if (hc5Var != null) {
            ai5 ai5Var2 = yh5.v;
            w73VarArr = zh5.a;
            w73 w73Var2 = w73VarArr[12];
            ai5Var2.getClass();
            bi5Var.b(ai5Var2, hc5Var);
        } else {
            a34.s0("scrollAxisRange");
            throw null;
        }
        je3 je3Var = this.R;
        if (je3Var != null) {
            bi5Var.b(oh5.f, new o3(null, je3Var));
        }
        bi5Var.b(oh5.C, new o3(null, new pz3(new ke3(this, (byte) 2), (byte) 26)));
        wo0 f = this.M.f();
        ai5 ai5Var3 = yh5.f;
        w73 w73Var3 = w73VarArr[24];
        ai5Var3.getClass();
        bi5Var.b(ai5Var3, f);
    }

    @Override // defpackage.xz3
    public final boolean P0() {
        return false;
    }

    public final void a1() {
        je3 je3Var;
        this.P = new hc5(new ke3(this, (byte) 0), new ke3(this, (byte) 1));
        if (this.O) {
            je3Var = new je3(this, (byte) 1);
        } else {
            je3Var = null;
        }
        this.R = je3Var;
    }
}
