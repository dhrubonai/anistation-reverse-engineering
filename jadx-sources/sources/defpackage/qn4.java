package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qn4 {
    public static final jw3 u = new jw3(new Object());
    public final kf6 a;
    public final jw3 b;
    public final long c;
    public final long d;
    public final int e;
    public final yx1 f;
    public final boolean g;
    public final zg6 h;
    public final jh6 i;
    public final List j;
    public final jw3 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final rn4 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public qn4(kf6 kf6Var, jw3 jw3Var, long j, long j2, int i, yx1 yx1Var, boolean z, zg6 zg6Var, jh6 jh6Var, List list, jw3 jw3Var2, boolean z2, int i2, int i3, rn4 rn4Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = kf6Var;
        this.b = jw3Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = yx1Var;
        this.g = z;
        this.h = zg6Var;
        this.i = jh6Var;
        this.j = list;
        this.k = jw3Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = rn4Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static qn4 k(jh6 jh6Var) {
        gf6 gf6Var = kf6.a;
        zg6 zg6Var = zg6.d;
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        rn4 rn4Var = rn4.d;
        jw3 jw3Var = u;
        return new qn4(gf6Var, jw3Var, -9223372036854775807L, 0L, 1, null, false, zg6Var, jh6Var, o15Var, jw3Var, false, 1, 0, rn4Var, 0L, 0L, 0L, 0L, false);
    }

    public final qn4 a() {
        return new qn4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final qn4 b(boolean z) {
        return new qn4(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final qn4 c(jw3 jw3Var) {
        return new qn4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, jw3Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final qn4 d(jw3 jw3Var, long j, long j2, long j3, long j4, zg6 zg6Var, jh6 jh6Var, List list) {
        return new qn4(this.a, jw3Var, j2, j3, this.e, this.f, this.g, zg6Var, jh6Var, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final qn4 e(int i, int i2, boolean z) {
        return new qn4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final qn4 f(yx1 yx1Var) {
        return new qn4(this.a, this.b, this.c, this.d, this.e, yx1Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final qn4 g(rn4 rn4Var) {
        return new qn4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, rn4Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final qn4 h(int i) {
        return new qn4(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final qn4 i(boolean z) {
        return new qn4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final qn4 j(kf6 kf6Var) {
        return new qn4(kf6Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return eq6.U(eq6.l0(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.o.a));
    }

    public final boolean m() {
        if (this.e == 3 && this.l && this.n == 0) {
            return true;
        }
        return false;
    }
}
