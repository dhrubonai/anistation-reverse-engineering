package defpackage;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e11 extends zc1 implements sh5 {
    public di6 N;
    public mc6 O;
    public uf3 P;
    public boolean Q;
    public h12 R;
    public jb6 S;
    public yv2 T;
    public w72 U;

    /* JADX WARN: Multi-variable type inference failed */
    public static void d1(uf3 uf3Var, String str, boolean z) {
        if (!z) {
            return;
        }
        vc6 vc6Var = uf3Var.e;
        r01 r01Var = uf3Var.v;
        if (vc6Var != null) {
            mc6 k = uf3Var.d.k(te4.I(new Object(), new mq0(str, 1)));
            vc6Var.a(null, k);
            r01Var.invoke(k);
        } else {
            int length = str.length();
            r01Var.invoke(new mc6(fy5.a(length, length), 4, str));
        }
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        ko koVar = this.O.a;
        w73[] w73VarArr = zh5.a;
        ai5 ai5Var = yh5.F;
        w73[] w73VarArr2 = zh5.a;
        w73 w73Var = w73VarArr2[18];
        ai5Var.getClass();
        bi5Var.b(ai5Var, koVar);
        ko koVar2 = this.N.a;
        ai5 ai5Var2 = yh5.G;
        w73 w73Var2 = w73VarArr2[19];
        ai5Var2.getClass();
        bi5Var.b(ai5Var2, koVar2);
        long j = this.O.b;
        ai5 ai5Var3 = yh5.H;
        w73 w73Var3 = w73VarArr2[20];
        nd6 nd6Var = new nd6(j);
        ai5Var3.getClass();
        bi5Var.b(ai5Var3, nd6Var);
        kb kbVar = nr1.B;
        ai5 ai5Var4 = yh5.s;
        w73 w73Var4 = w73VarArr2[9];
        ai5Var4.getClass();
        bi5Var.b(ai5Var4, kbVar);
        ic icVar = new ic(AutofillValue.forText(kb0.M(this.O.a)));
        ai5 ai5Var5 = yh5.t;
        w73 w73Var5 = w73VarArr2[10];
        ai5Var5.getClass();
        bi5Var.b(ai5Var5, icVar);
        bi5Var.b(oh5.h, new o3(null, new d11(this, (byte) 0)));
        int i = this.T.d;
        if (i == 6) {
            kz0.a.getClass();
            zh5.d(bi5Var, gz0.c);
        } else if (i == 7 || i == 8) {
            kz0.a.getClass();
            zh5.d(bi5Var, gz0.b);
        } else if (i == 4) {
            kz0.a.getClass();
            zh5.d(bi5Var, gz0.d);
        }
        if (!this.Q) {
            bi5Var.b(yh5.j, pn6.a);
        }
        boolean z = this.Q;
        ai5 ai5Var6 = yh5.Q;
        w73 w73Var6 = w73VarArr2[28];
        Boolean valueOf = Boolean.valueOf(z);
        ai5Var6.getClass();
        bi5Var.b(ai5Var6, valueOf);
        zh5.a(bi5Var, new d11(this, (byte) 1));
        if (z) {
            bi5Var.b(oh5.k, new o3(null, new d11(this, (byte) 2)));
            bi5Var.b(oh5.o, new o3(null, new d11(this, bi5Var)));
        }
        bi5Var.b(oh5.j, new o3(null, new fr5(this, (byte) 7)));
        zh5.b(bi5Var, this.T.e, new c11(this, (byte) 6));
        bi5Var.b(oh5.b, new o3(null, new c11(this, (byte) 7)));
        bi5Var.b(oh5.c, new o3(null, new c11(this, (byte) 1)));
        if (!nd6.d(this.O.b)) {
            bi5Var.b(oh5.q, new o3(null, new c11(this, (byte) 2)));
            if (this.Q) {
                bi5Var.b(oh5.r, new o3(null, new c11(this, (byte) 3)));
            }
        }
        if (this.Q) {
            bi5Var.b(oh5.s, new o3(null, new c11(this, (byte) 5)));
        }
    }

    @Override // defpackage.sh5
    public final boolean K0() {
        return true;
    }
}
