package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lv4 implements g95 {
    public final int x;
    public final boolean y;
    public final /* synthetic */ nv4 z;

    public lv4(nv4 nv4Var, int i, boolean z) {
        this.z = nv4Var;
        this.x = i;
        this.y = z;
    }

    @Override // defpackage.g95
    public final int G() {
        if (this.y) {
            return 4;
        }
        return 0;
    }

    @Override // defpackage.g95
    public final int I(pz2 pz2Var, q61 q61Var, int i) {
        nv4 nv4Var = this.z;
        if (nv4Var.J()) {
            return -3;
        }
        int i2 = this.x;
        nv4Var.C(i2);
        int w = nv4Var.S[i2].w(pz2Var, q61Var, i, nv4Var.p0);
        if (w == -3) {
            nv4Var.D(i2);
        }
        return w;
    }

    @Override // defpackage.g95
    public final boolean isReady() {
        nv4 nv4Var = this.z;
        if (!nv4Var.J() && nv4Var.S[this.x].s(nv4Var.p0)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.g95
    public final void s() {
        int i = this.x;
        nv4 nv4Var = this.z;
        f95 f95Var = nv4Var.S[i];
        qp1 qp1Var = f95Var.h;
        if (qp1Var != null && qp1Var.e() == 1) {
            pp1 error = f95Var.h.getError();
            error.getClass();
            throw error;
        }
        dn0 dn0Var = nv4Var.J;
        int i2 = nv4Var.A.i(nv4Var.c0);
        IOException iOException = (IOException) dn0Var.A;
        if (iOException == null) {
            lj3 lj3Var = (lj3) dn0Var.z;
            if (lj3Var != null) {
                if (i2 == Integer.MIN_VALUE) {
                    i2 = lj3Var.x;
                }
                IOException iOException2 = lj3Var.B;
                if (iOException2 != null && lj3Var.C > i2) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // defpackage.g95
    public final int t(long j) {
        nv4 nv4Var = this.z;
        if (nv4Var.J()) {
            return 0;
        }
        int i = this.x;
        nv4Var.C(i);
        f95 f95Var = nv4Var.S[i];
        int q = f95Var.q(j, nv4Var.p0);
        f95Var.B(q);
        if (q == 0) {
            nv4Var.D(i);
        }
        return q;
    }
}
