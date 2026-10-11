package defpackage;

import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class im3 extends d04 {
    public final mm x;
    public final nb6 y;
    public final pk2 z;

    public im3(mm mmVar, nb6 nb6Var, pk2 pk2Var) {
        this.x = mmVar;
        this.y = nb6Var;
        this.z = pk2Var;
    }

    @Override // defpackage.d04
    public final xz3 a() {
        return new km3(this.x, this.y, this.z);
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        km3 km3Var = (km3) xz3Var;
        float f = km3Var.N;
        long j = km3Var.P;
        float f2 = km3Var.Q;
        boolean z = km3Var.O;
        float f3 = km3Var.R;
        boolean z2 = km3Var.S;
        pk2 pk2Var = km3Var.T;
        View view = km3Var.U;
        ud1 ud1Var = km3Var.V;
        km3Var.L = this.x;
        km3Var.N = Float.NaN;
        km3Var.O = true;
        km3Var.P = 9205357640488583168L;
        km3Var.Q = Float.NaN;
        km3Var.R = Float.NaN;
        km3Var.S = true;
        km3Var.M = this.y;
        pk2 pk2Var2 = this.z;
        km3Var.T = pk2Var2;
        View E = jf7.E(km3Var);
        ud1 ud1Var2 = wc7.O(km3Var).V;
        if (km3Var.W != null) {
            ai5 ai5Var = lm3.a;
            if (!Float.isNaN(Float.NaN) || !Float.isNaN(f)) {
                int i = (Float.NaN > f ? 1 : (Float.NaN == f ? 0 : -1));
            }
            if (9205357640488583168L != j || !vm1.c(Float.NaN, f2) || !vm1.c(Float.NaN, f3) || true != z || true != z2 || !pk2Var2.equals(pk2Var) || !E.equals(view) || !a34.i(ud1Var2, ud1Var)) {
                km3Var.b1();
            }
        }
        km3Var.c1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.z.hashCode() + ((this.y.hashCode() + zo5.g(qx1.b(Float.NaN, qx1.b(Float.NaN, qx1.d(zo5.g(qx1.b(Float.NaN, this.x.hashCode() * 961, 31), 31, true), 9205357640488583168L, 31), 31), 31), 31, true)) * 31);
    }
}
