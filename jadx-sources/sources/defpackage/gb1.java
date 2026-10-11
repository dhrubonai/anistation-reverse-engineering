package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gb1 extends gh6 {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public gb1(hb1 hb1Var) {
        e(hb1Var);
        this.J = hb1Var.w0;
        this.K = hb1Var.x0;
        this.L = hb1Var.y0;
        this.M = hb1Var.z0;
        this.N = hb1Var.A0;
        this.O = hb1Var.B0;
        this.P = hb1Var.C0;
        SparseArray sparseArray = hb1Var.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.Q = sparseArray2;
        this.R = hb1Var.E0.clone();
    }

    @Override // defpackage.gh6
    public final void a(dh6 dh6Var) {
        this.H.put(dh6Var.a, dh6Var);
    }

    @Override // defpackage.gh6
    public final hh6 b() {
        return new hb1(this);
    }

    @Override // defpackage.gh6
    public final gh6 c() {
        super.c();
        return this;
    }

    @Override // defpackage.gh6
    public final gh6 d(int i) {
        super.d(i);
        return this;
    }

    @Override // defpackage.gh6
    public final gh6 g(dh6 dh6Var) {
        super.g(dh6Var);
        return this;
    }

    @Override // defpackage.gh6
    public final gh6 h(String str) {
        super.h(str);
        return this;
    }

    @Override // defpackage.gh6
    public final gh6 i(String[] strArr) {
        super.i(strArr);
        return this;
    }

    @Override // defpackage.gh6
    public final gh6 k(String[] strArr) {
        super.k(strArr);
        return this;
    }

    @Override // defpackage.gh6
    public final gh6 l(boolean z) {
        this.x = z;
        return this;
    }

    @Override // defpackage.gh6
    public final gh6 m(int i, boolean z) {
        super.m(i, z);
        return this;
    }

    public final void n(Set set) {
        this.I.clear();
        this.I.addAll(set);
    }

    public final void o(String... strArr) {
        super.i(strArr);
    }

    public gb1() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }
}
