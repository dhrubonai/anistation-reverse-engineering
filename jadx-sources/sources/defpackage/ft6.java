package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ft6 {
    public final pz2 a;
    public final ys6 b;
    public final zs6 g;
    public final v32 h;
    public long m;
    public final ss c = new ss();
    public final wp d = new wp();
    public final wp e = new wp();
    public final sr1 f = new sr1();
    public long i = -9223372036854775807L;
    public hv6 l = hv6.d;
    public long j = -9223372036854775807L;
    public long k = -9223372036854775807L;

    public ft6(pz2 pz2Var, ys6 ys6Var, zs6 zs6Var, v32 v32Var) {
        this.a = pz2Var;
        this.b = ys6Var;
        this.g = zs6Var;
        this.h = v32Var;
    }

    public final void a(long j, long j2) {
        boolean z;
        long j3;
        ea2 ea2Var;
        final pz2 pz2Var = this.a;
        kc1 kc1Var = (kc1) pz2Var.z;
        while (true) {
            sr1 sr1Var = this.f;
            if (sr1Var.d == 0) {
                return;
            }
            long f = sr1Var.f();
            Long l = (Long) this.e.s(f);
            ys6 ys6Var = this.b;
            if (l != null && l.longValue() != this.m) {
                this.m = l.longValue();
                ys6Var.e(2);
            }
            v32 v32Var = this.h;
            v32Var.b(1000 * f);
            long j4 = this.m;
            long a = v32Var.a();
            long j5 = v32Var.h;
            ys6 ys6Var2 = this.b;
            ss ssVar = this.c;
            int a2 = ys6Var2.a(f, j, j2, j4, false, false, a, j5, ssVar);
            if (a2 != 5 && a2 != 4) {
                this.g.a(f, ssVar.a);
            }
            final byte b = 1;
            if (a2 != 0 && a2 != 1) {
                if (a2 != 2 && a2 != 3) {
                    if (a2 != 4) {
                        if (a2 == 5) {
                            return;
                        }
                        ze0.m(String.valueOf(a2));
                        return;
                    }
                    this.j = f;
                } else {
                    this.j = f;
                    sr1Var.m();
                    kc1Var.j.execute(new Runnable() { // from class: jc1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            pz2 pz2Var2 = pz2Var;
                            switch (b2) {
                                case 0:
                                    ((kc1) pz2Var2.z).i.onFirstFrameRendered();
                                    return;
                                default:
                                    ((kc1) pz2Var2.z).i.b();
                                    return;
                            }
                        }
                    });
                    ((ev6) kc1Var.d.remove()).b();
                }
            } else {
                this.j = f;
                final byte b2 = 0;
                if (a2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                long m = sr1Var.m();
                hv6 hv6Var = (hv6) this.d.s(m);
                if (hv6Var != null && !hv6Var.equals(hv6.d) && !hv6Var.equals(this.l)) {
                    this.l = hv6Var;
                    da2 da2Var = new da2();
                    da2Var.v = hv6Var.a;
                    da2Var.w = hv6Var.b;
                    da2Var.o = qy3.n("video/raw");
                    pz2Var.y = new ea2(da2Var);
                    kc1Var.j.execute(new gb(pz2Var, hv6Var, (byte) 20));
                }
                if (z) {
                    j3 = System.nanoTime();
                } else {
                    j3 = ssVar.b;
                }
                long j6 = j3;
                if (ys6Var.e == 3) {
                    b = 0;
                }
                ys6Var.e = 3;
                ys6Var.k.getClass();
                ys6Var.g = eq6.U(SystemClock.elapsedRealtime());
                if (b != 0 && kc1Var.f != null) {
                    kc1Var.j.execute(new Runnable() { // from class: jc1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            pz2 pz2Var2 = pz2Var;
                            switch (b22) {
                                case 0:
                                    ((kc1) pz2Var2.z).i.onFirstFrameRendered();
                                    return;
                                default:
                                    ((kc1) pz2Var2.z).i.b();
                                    return;
                            }
                        }
                    });
                }
                ea2 ea2Var2 = (ea2) pz2Var.y;
                if (ea2Var2 == null) {
                    ea2Var = new ea2(new da2());
                } else {
                    ea2Var = ea2Var2;
                }
                kc1Var.k.d(m, j6, ea2Var, null);
                ((ev6) kc1Var.d.remove()).a(j6);
            }
        }
    }
}
