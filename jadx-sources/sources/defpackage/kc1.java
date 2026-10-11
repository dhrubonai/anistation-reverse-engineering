package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kc1 implements gv6 {
    public final ys6 a;
    public final zs6 b;
    public final ft6 c;
    public final ArrayDeque d;
    public final v32 e;
    public Surface f;
    public ea2 g;
    public long h;
    public dv6 i;
    public Executor j;
    public ms6 k;

    /* JADX WARN: Type inference failed for: r3v6, types: [ms6, java.lang.Object] */
    public kc1(ys6 ys6Var, zs6 zs6Var, f46 f46Var) {
        this.a = ys6Var;
        this.b = zs6Var;
        ys6Var.k = f46Var;
        v32 v32Var = new v32(new h5((Object) ys6Var, (byte) 13));
        this.e = v32Var;
        this.c = new ft6(new pz2(this), ys6Var, zs6Var, v32Var);
        this.d = new ArrayDeque();
        this.g = new ea2(new da2());
        this.h = -9223372036854775807L;
        this.i = dv6.a;
        this.j = new qr((byte) 1);
        this.k = new Object();
    }

    @Override // defpackage.gv6
    public final Surface a() {
        Surface surface = this.f;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.gv6
    public final void b() {
        ft6 ft6Var = this.c;
        long j = ft6Var.i;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            ft6Var.i = Long.MIN_VALUE;
            ft6Var.j = Long.MIN_VALUE;
        }
        ft6Var.k = j;
    }

    @Override // defpackage.gv6
    public final void c(float f) {
        this.a.g(f);
    }

    @Override // defpackage.gv6
    public final boolean d() {
        ft6 ft6Var = this.c;
        long j = ft6Var.k;
        if (j != -9223372036854775807L && ft6Var.j == j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gv6
    public final void e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gv6
    public final boolean f(long j, ev6 ev6Var) {
        this.d.add(ev6Var);
        ft6 ft6Var = this.c;
        ft6Var.f.a(j);
        ft6Var.i = j;
        ft6Var.k = -9223372036854775807L;
        this.j.execute(new p0((Object) this, (byte) 18));
        return true;
    }

    @Override // defpackage.gv6
    public final void g() {
        this.b.b();
        ys6 ys6Var = this.a;
        ys6Var.d = false;
        ys6Var.h = -9223372036854775807L;
        et6 et6Var = ys6Var.b;
        et6Var.d = false;
        at6 at6Var = et6Var.c;
        if (at6Var != null) {
            at6Var.b();
        }
        et6Var.a();
    }

    @Override // defpackage.gv6
    public final void h() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.gv6
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gv6
    public final boolean isInitialized() {
        return true;
    }

    @Override // defpackage.gv6
    public final void j(int i) {
        et6 et6Var = this.a.b;
        if (et6Var.i == i) {
            return;
        }
        et6Var.i = i;
        et6Var.c(true);
    }

    @Override // defpackage.gv6
    public final void k() {
        this.f = null;
        this.a.f(null);
    }

    @Override // defpackage.gv6
    public final void l(wp3 wp3Var) {
        this.i = wp3Var;
        this.j = qg1.x;
    }

    @Override // defpackage.gv6
    public final boolean m(ea2 ea2Var) {
        return true;
    }

    @Override // defpackage.gv6
    public final void n(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            ys6 ys6Var = this.a;
            ys6Var.b.b();
            ys6Var.f = -9223372036854775807L;
            ys6Var.e = Math.min(ys6Var.e, 1);
            ys6Var.h = -9223372036854775807L;
            ys6Var.m = false;
        }
        this.b.b();
        ft6 ft6Var = this.c;
        wp wpVar = ft6Var.d;
        sr1 sr1Var = ft6Var.f;
        sr1Var.b = 0;
        sr1Var.c = -1;
        sr1Var.d = 0;
        ft6Var.i = -9223372036854775807L;
        ft6Var.j = -9223372036854775807L;
        ft6Var.k = -9223372036854775807L;
        wp wpVar2 = ft6Var.e;
        if (wpVar2.y() > 0) {
            if (wpVar2.y() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            io3.n(z2);
            while (wpVar2.y() > 1) {
                wpVar2.r();
            }
            Object r = wpVar2.r();
            r.getClass();
            ft6Var.m = ((Long) r).longValue();
        }
        if (wpVar.y() > 0) {
            if (wpVar.y() > 0) {
                z3 = true;
            }
            io3.n(z3);
            while (wpVar.y() > 1) {
                wpVar.r();
            }
            Object r2 = wpVar.r();
            r2.getClass();
            wpVar.a(0L, (hv6) r2);
        }
        this.d.clear();
    }

    @Override // defpackage.gv6
    public final void o(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gv6
    public final void p(long j, long j2) {
        try {
            this.c.a(j, j2);
        } catch (yx1 e) {
            throw new fv6(e, this.g);
        }
    }

    @Override // defpackage.gv6
    public final void q(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.gv6
    public final boolean r(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.gv6
    public final void s(ms6 ms6Var) {
        this.k = ms6Var;
    }

    @Override // defpackage.gv6
    public final void t(Surface surface, sq5 sq5Var) {
        this.f = surface;
        this.a.f(surface);
    }

    @Override // defpackage.gv6
    public final void u(int i, long j, ea2 ea2Var, List list) {
        long j2;
        long j3;
        io3.B(list.isEmpty());
        int i2 = ea2Var.w;
        int i3 = ea2Var.x;
        ea2 ea2Var2 = this.g;
        int i4 = ea2Var2.w;
        ft6 ft6Var = this.c;
        if (i2 != i4 || i3 != ea2Var2.x) {
            wp wpVar = ft6Var.d;
            long j4 = ft6Var.i;
            if (j4 == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j4 + 1;
            }
            wpVar.a(j2, new hv6(i2, i3));
        }
        float f = ea2Var.B;
        if (f != this.g.B) {
            v32 v32Var = this.e;
            v32Var.f = f;
            v32Var.a.c();
            v32Var.b.c();
            v32Var.c = false;
            v32Var.d = -9223372036854775807L;
            v32Var.e = 0;
            v32Var.c();
        }
        this.g = ea2Var;
        if (j != this.h) {
            if (ft6Var.f.d == 0) {
                ft6Var.b.e(i);
                ft6Var.m = j;
            } else {
                wp wpVar2 = ft6Var.e;
                long j5 = ft6Var.i;
                if (j5 == -9223372036854775807L) {
                    j3 = -4611686018427387904L;
                } else {
                    j3 = j5 + 1;
                }
                wpVar2.a(j3, Long.valueOf(j));
            }
            this.h = j;
        }
    }

    @Override // defpackage.gv6
    public final void v() {
        ys6 ys6Var = this.a;
        if (ys6Var.e == 0) {
            ys6Var.e = 1;
        }
    }

    @Override // defpackage.gv6
    public final void release() {
    }
}
