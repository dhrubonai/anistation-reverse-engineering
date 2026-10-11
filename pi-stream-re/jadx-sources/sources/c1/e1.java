package c1;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f1676a = new b1();

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
    }

    public int a(boolean z9) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z9) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, c1 c1Var, d1 d1Var, int i11, boolean z9) {
        int i12 = g(i10, c1Var, false).f1643c;
        if (n(i12, d1Var).f1669p == i10) {
            int e10 = e(i12, i11, z9);
            if (e10 == -1) {
                return -1;
            }
            return n(e10, d1Var).o;
        }
        return i10 + 1;
    }

    public int e(int i10, int i11, boolean z9) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == c(z9)) {
                        return a(z9);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == c(z9)) {
            return -1;
        }
        return i10 + 1;
    }

    public final boolean equals(Object obj) {
        int c6;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        if (e1Var.p() != p() || e1Var.i() != i()) {
            return false;
        }
        d1 d1Var = new d1();
        c1 c1Var = new c1();
        d1 d1Var2 = new d1();
        c1 c1Var2 = new c1();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, d1Var).equals(e1Var.n(i10, d1Var2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, c1Var, true).equals(e1Var.g(i11, c1Var2, true))) {
                return false;
            }
        }
        int a10 = a(true);
        if (a10 != e1Var.a(true) || (c6 = c(true)) != e1Var.c(true)) {
            return false;
        }
        while (a10 != c6) {
            int e10 = e(a10, 0, true);
            if (e10 != e1Var.e(a10, 0, true)) {
                return false;
            }
            a10 = e10;
        }
        return true;
    }

    public final c1 f(int i10, c1 c1Var) {
        return g(i10, c1Var, false);
    }

    public abstract c1 g(int i10, c1 c1Var, boolean z9);

    public c1 h(Object obj, c1 c1Var) {
        return g(b(obj), c1Var, true);
    }

    public final int hashCode() {
        d1 d1Var = new d1();
        c1 c1Var = new c1();
        int p3 = p() + 217;
        for (int i10 = 0; i10 < p(); i10++) {
            p3 = (p3 * 31) + n(i10, d1Var).hashCode();
        }
        int i11 = i() + (p3 * 31);
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, c1Var, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            i11 = (i11 * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair j(d1 d1Var, c1 c1Var, int i10, long j4) {
        Pair k10 = k(d1Var, c1Var, i10, j4, 0L);
        k10.getClass();
        return k10;
    }

    public final Pair k(d1 d1Var, c1 c1Var, int i10, long j4, long j10) {
        w7.b.m(i10, p());
        o(i10, d1Var, j10);
        if (j4 == -9223372036854775807L) {
            j4 = d1Var.f1667m;
            if (j4 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = d1Var.o;
        f(i11, c1Var);
        while (i11 < d1Var.f1669p && c1Var.f1645e != j4) {
            int i12 = i11 + 1;
            if (g(i12, c1Var, false).f1645e > j4) {
                break;
            }
            i11 = i12;
        }
        g(i11, c1Var, true);
        long j11 = j4 - c1Var.f1645e;
        long j12 = c1Var.f1644d;
        if (j12 != -9223372036854775807L) {
            j11 = Math.min(j11, j12 - 1);
        }
        long max = Math.max(0L, j11);
        Object obj = c1Var.f1642b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i10, int i11, boolean z9) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == a(z9)) {
                        return c(z9);
                    }
                    return i10 - 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == a(z9)) {
            return -1;
        }
        return i10 - 1;
    }

    public abstract Object m(int i10);

    public final d1 n(int i10, d1 d1Var) {
        return o(i10, d1Var, 0L);
    }

    public abstract d1 o(int i10, d1 d1Var, long j4);

    public abstract int p();

    public final boolean q() {
        if (p() == 0) {
            return true;
        }
        return false;
    }
}
