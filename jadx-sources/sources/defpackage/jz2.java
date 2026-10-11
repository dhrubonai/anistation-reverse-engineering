package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jz2 extends am3 {
    @Override // defpackage.am3
    public final void M0() {
        em3 em3Var = this.R.R.d0.q;
        em3Var.getClass();
        em3Var.q0();
    }

    @Override // defpackage.ro3
    public final int O(int i) {
        y23 t = this.R.R.t();
        vo3 V = t.V();
        za3 za3Var = (za3) t.y;
        return V.e((fa4) za3Var.c0.B, za3Var.l(), i);
    }

    @Override // defpackage.ro3
    public final int c(int i) {
        y23 t = this.R.R.t();
        vo3 V = t.V();
        za3 za3Var = (za3) t.y;
        return V.d((fa4) za3Var.c0.B, za3Var.l(), i);
    }

    @Override // defpackage.yl3
    public final int j0(f7 f7Var) {
        Boolean bool;
        int i;
        boolean z;
        em3 em3Var = this.R.R.d0.q;
        em3Var.getClass();
        ab3 ab3Var = em3Var.P;
        if (!em3Var.H) {
            db3 db3Var = em3Var.C;
            if (db3Var.d == va3.y) {
                ab3Var.f = true;
                if (ab3Var.b) {
                    db3Var.f = true;
                    db3Var.g = true;
                }
            } else {
                ab3Var.g = true;
            }
        }
        jz2 jz2Var = em3Var.e().A0;
        if (jz2Var != null) {
            bool = Boolean.valueOf(jz2Var.L);
        } else {
            bool = null;
        }
        jz2 jz2Var2 = em3Var.e().A0;
        if (jz2Var2 != null) {
            jz2Var2.L = true;
        }
        em3Var.A();
        jz2 jz2Var3 = em3Var.e().A0;
        if (jz2Var3 != null) {
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            jz2Var3.L = z;
        }
        Integer num = (Integer) ab3Var.i.get(f7Var);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        this.W.g(i, f7Var);
        return i;
    }

    @Override // defpackage.ro3
    public final int k(int i) {
        y23 t = this.R.R.t();
        vo3 V = t.V();
        za3 za3Var = (za3) t.y;
        return V.c((fa4) za3Var.c0.B, za3Var.l(), i);
    }

    @Override // defpackage.ro3
    public final int n(int i) {
        y23 t = this.R.R.t();
        vo3 V = t.V();
        za3 za3Var = (za3) t.y;
        return V.a((fa4) za3Var.c0.B, za3Var.l(), i);
    }

    @Override // defpackage.ro3
    public final em4 p(long j) {
        b0(j);
        fa4 fa4Var = this.R;
        z44 A = fa4Var.R.A();
        Object[] objArr = A.x;
        int i = A.z;
        for (int i2 = 0; i2 < i; i2++) {
            em3 em3Var = ((za3) objArr[i2]).d0.q;
            em3Var.getClass();
            em3Var.G = xa3.z;
        }
        za3 za3Var = fa4Var.R;
        Q0(za3Var.T.b(this, za3Var.l(), j));
        return this;
    }
}
