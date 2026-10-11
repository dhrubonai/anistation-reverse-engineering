package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bo4 implements gv6 {
    public final int a;
    public nw2 b;
    public ea2 c;
    public boolean d;
    public long e;
    public long f;
    public int g;
    public dv6 h;
    public Executor i;
    public boolean j;
    public final /* synthetic */ eo4 k;

    public bo4(eo4 eo4Var, Context context) {
        int i;
        this.k = eo4Var;
        if (eq6.O(context)) {
            i = 1;
        } else {
            i = 5;
        }
        this.a = i;
        z62 z62Var = nw2.y;
        this.b = o15.B;
        this.f = -9223372036854775807L;
        this.h = dv6.a;
        this.i = eo4.B;
    }

    @Override // defpackage.gv6
    public final Surface a() {
        io3.B(this.j);
        ht6 ht6Var = this.k.p;
        ht6Var.getClass();
        return ht6Var.j(0);
    }

    @Override // defpackage.gv6
    public final void b() {
        long j = this.f;
        eo4 eo4Var = this.k;
        eo4Var.x = j;
        if (eo4Var.w >= j) {
            eo4Var.e.b();
            eo4Var.y = true;
        }
    }

    @Override // defpackage.gv6
    public final void c(float f) {
        eo4 eo4Var = this.k;
        eo4Var.j.c(f);
        eo4Var.e.c(f);
    }

    @Override // defpackage.gv6
    public final boolean d() {
        if (this.j) {
            eo4 eo4Var = this.k;
            if (eo4Var.u == 0 && eo4Var.y && eo4Var.e.d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.gv6
    public final void e() {
        if (!this.j) {
            return;
        }
        eo4 eo4Var = this.k;
        long j = eo4Var.w;
        eo4Var.e(false);
        ht6 ht6Var = eo4Var.p;
        ht6Var.getClass();
        ht6Var.e();
        eo4Var.w = j;
    }

    @Override // defpackage.gv6
    public final boolean f(long j, ev6 ev6Var) {
        long j2;
        int i;
        io3.B(this.j);
        long j3 = j + this.e;
        eo4 eo4Var = this.k;
        zs6 zs6Var = eo4Var.j;
        if (zs6Var.a == -9223372036854775807L) {
            j2 = -9223372036854775807L;
        } else {
            j2 = (long) (((j3 - r2) * zs6Var.c) + zs6Var.b);
        }
        if (j2 != -9223372036854775807L) {
            long j4 = eo4Var.i;
            if (j4 != -9223372036854775807L && j2 < j4 && (i = this.g) < 2) {
                this.g = i + 1;
                ((xp3) ev6Var).b();
                return true;
            }
        }
        int i2 = eo4Var.z;
        if (i2 != -1 && i2 == eo4Var.A) {
            ht6 ht6Var = eo4Var.p;
            ht6Var.getClass();
            if (ht6Var.g(0) < this.a) {
                ht6 ht6Var2 = eo4Var.p;
                ht6Var2.getClass();
                if (ht6Var2.f(0)) {
                    this.f = j3;
                    ((xp3) ev6Var).a(j3 * 1000);
                    this.g = 0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.gv6
    public final void g() {
        eo4 eo4Var = this.k;
        if (eo4Var.d) {
            eo4Var.e.g();
        }
    }

    @Override // defpackage.gv6
    public final void h() {
        eo4 eo4Var = this.k;
        if (eo4Var.d) {
            eo4Var.e.h();
        }
    }

    @Override // defpackage.gv6
    public final void i(long j) {
        this.e = j;
    }

    @Override // defpackage.gv6
    public final boolean isInitialized() {
        return this.j;
    }

    @Override // defpackage.gv6
    public final void j(int i) {
        this.k.e.j(i);
    }

    @Override // defpackage.gv6
    public final void k() {
        sq5 sq5Var = sq5.c;
        int i = sq5Var.a;
        int i2 = sq5Var.b;
        eo4 eo4Var = this.k;
        eo4Var.g(null, i, i2);
        eo4Var.t = null;
    }

    @Override // defpackage.gv6
    public final void l(wp3 wp3Var) {
        this.h = wp3Var;
        this.i = qg1.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    @Override // defpackage.gv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(defpackage.ea2 r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo4.m(ea2):boolean");
    }

    @Override // defpackage.gv6
    public final void n(boolean z) {
        boolean z2 = this.j;
        eo4 eo4Var = this.k;
        if (z2) {
            ht6 ht6Var = eo4Var.p;
            ht6Var.getClass();
            ht6Var.flush();
        }
        this.f = -9223372036854775807L;
        eo4Var.e(z);
    }

    @Override // defpackage.gv6
    public final void o(List list) {
        if (!this.b.equals(list)) {
            this.b = nw2.o(list);
            ea2 ea2Var = this.c;
            if (ea2Var != null) {
                w(ea2Var);
            }
        }
    }

    @Override // defpackage.gv6
    public final void p(long j, long j2) {
        this.k.e.p(j + this.e, j2);
    }

    @Override // defpackage.gv6
    public final void q(boolean z) {
        eo4 eo4Var = this.k;
        if (eo4Var.d) {
            eo4Var.e.q(z);
        }
    }

    @Override // defpackage.gv6
    public final boolean r(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z && this.j) {
            z2 = true;
        } else {
            z2 = false;
        }
        eo4 eo4Var = this.k;
        kc1 kc1Var = eo4Var.e;
        if (z2 && eo4Var.u == 0) {
            z3 = true;
        }
        return kc1Var.a.b(z3);
    }

    @Override // defpackage.gv6
    public final void release() {
        eo4 eo4Var = this.k;
        if (eo4Var.v == 2) {
            return;
        }
        k46 k46Var = eo4Var.o;
        if (k46Var != null) {
            k46Var.h();
        }
        ht6 ht6Var = eo4Var.p;
        if (ht6Var != null) {
            ht6Var.release();
        }
        eo4Var.t = null;
        eo4Var.v = (byte) 2;
    }

    @Override // defpackage.gv6
    public final void s(ms6 ms6Var) {
        eo4 eo4Var = this.k;
        eo4Var.q = ms6Var;
        eo4Var.e.k = ms6Var;
    }

    @Override // defpackage.gv6
    public final void t(Surface surface, sq5 sq5Var) {
        eo4 eo4Var = this.k;
        Pair pair = eo4Var.t;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((sq5) eo4Var.t.second).equals(sq5Var)) {
            return;
        }
        eo4Var.t = Pair.create(surface, sq5Var);
        eo4Var.g(surface, sq5Var.a, sq5Var.b);
    }

    @Override // defpackage.gv6
    public final void u(int i, long j, ea2 ea2Var, List list) {
        long j2;
        io3.B(this.j);
        this.b = nw2.o(list);
        boolean z = true;
        this.d = true;
        this.c = ea2Var;
        eo4 eo4Var = this.k;
        eo4Var.x = -9223372036854775807L;
        eo4Var.y = false;
        w(ea2Var);
        long j3 = this.f;
        if (j3 != -9223372036854775807L) {
            z = false;
        }
        if (!eo4Var.d && !z) {
            return;
        }
        if (z) {
            j2 = -4611686018427387904L;
        } else {
            j2 = 1 + j3;
        }
        long j4 = j2;
        eo4Var.k.a(j4, new do4(this.e + j, i, j4));
    }

    @Override // defpackage.gv6
    public final void v() {
        eo4 eo4Var = this.k;
        kc1 kc1Var = eo4Var.e;
        if (eo4Var.k.y() == 0) {
            kc1Var.v();
            return;
        }
        wp wpVar = new wp();
        boolean z = true;
        while (eo4Var.k.y() > 0) {
            do4 do4Var = (do4) eo4Var.k.r();
            do4Var.getClass();
            if (z) {
                int i = do4Var.b;
                if (i != 0 && i != 1) {
                    kc1Var.v();
                } else {
                    do4Var = new do4(do4Var.a, 0, do4Var.c);
                }
                z = false;
            }
            wpVar.a(do4Var.c, do4Var);
        }
        eo4Var.k = wpVar;
    }

    public final void w(ea2 ea2Var) {
        da2 a = ea2Var.a();
        hp0 hp0Var = ea2Var.H;
        if (hp0Var == null || !hp0Var.f()) {
            hp0Var = hp0.h;
        }
        a.G = hp0Var;
        ea2 ea2Var2 = new ea2(a);
        int i = 1;
        if (!this.d) {
            i = 2;
        }
        int i2 = i;
        ht6 ht6Var = this.k.p;
        ht6Var.getClass();
        ht6Var.l(0, i2, ea2Var2, this.b, 0L);
    }
}
