package defpackage;

import android.util.Pair;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pr3 {
    public final wn3 a;
    public final Object b;
    public final g95[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public qr3 g;
    public final boolean[] h;
    public final boolean[] i;
    public final w30[] j;
    public final mb1 k;
    public final ax3 l;
    public pr3 m;
    public zg6 n;
    public jh6 o;
    public long p;

    public pr3(w30[] w30VarArr, long j, mb1 mb1Var, dn0 dn0Var, ax3 ax3Var, qr3 qr3Var, jh6 jh6Var) {
        this.j = w30VarArr;
        this.p = j;
        this.k = mb1Var;
        this.l = ax3Var;
        jw3 jw3Var = qr3Var.a;
        Object obj = jw3Var.a;
        this.b = obj;
        this.g = qr3Var;
        this.n = zg6.d;
        this.o = jh6Var;
        this.c = new g95[w30VarArr.length];
        this.h = new boolean[w30VarArr.length];
        this.i = new boolean[w30VarArr.length];
        long j2 = qr3Var.b;
        ax3Var.getClass();
        int i = hq4.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        jw3 a = jw3Var.a(pair.second);
        zw3 zw3Var = (zw3) ax3Var.e.get(obj2);
        zw3Var.getClass();
        ax3Var.h.add(zw3Var);
        yw3 yw3Var = (yw3) ax3Var.g.get(zw3Var);
        if (yw3Var != null) {
            ((t30) yw3Var.a).k(yw3Var.b);
        }
        zw3Var.c.add(a);
        wn3 b = zw3Var.a.b(a, dn0Var, j2);
        ax3Var.d.put(b, zw3Var);
        ax3Var.c();
        this.a = b;
    }

    public final long a(jh6 jh6Var, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        w30[] w30VarArr;
        boolean[] zArr3;
        g95[] g95VarArr;
        boolean z2;
        jz1[] jz1VarArr = (jz1[]) jh6Var.z;
        int i = 0;
        while (true) {
            int i2 = jh6Var.x;
            zArr2 = this.i;
            boolean z3 = true;
            if (i >= i2) {
                break;
            }
            if (z || !jh6Var.c(this.o, i)) {
                z3 = false;
            }
            zArr2[i] = z3;
            i++;
        }
        int i3 = 0;
        while (true) {
            w30VarArr = this.j;
            int length = w30VarArr.length;
            zArr3 = zArr2;
            g95VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (w30VarArr[i3].y == -2) {
                g95VarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = jh6Var;
        c();
        long c = this.a.c(jz1VarArr, zArr3, g95VarArr, zArr, j);
        for (int i4 = 0; i4 < w30VarArr.length; i4++) {
            if (w30VarArr[i4].y == -2 && this.o.d(i4)) {
                g95VarArr[i4] = new m18((byte) 17);
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < g95VarArr.length; i5++) {
            if (g95VarArr[i5] != null) {
                io3.B(jh6Var.d(i5));
                if (w30VarArr[i5].y != -2) {
                    this.f = true;
                }
            } else {
                if (jz1VarArr[i5] == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                io3.B(z2);
            }
        }
        return c;
    }

    public final void b() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                jh6 jh6Var = this.o;
                if (i < jh6Var.x) {
                    boolean d = jh6Var.d(i);
                    jz1 jz1Var = ((jz1[]) this.o.z)[i];
                    if (d && jz1Var != null) {
                        jz1Var.l();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.m == null) {
            int i = 0;
            while (true) {
                jh6 jh6Var = this.o;
                if (i < jh6Var.x) {
                    boolean d = jh6Var.d(i);
                    jz1 jz1Var = ((jz1[]) this.o.z)[i];
                    if (d && jz1Var != null) {
                        jz1Var.i();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        long j;
        if (!this.e) {
            return this.g.b;
        }
        if (this.f) {
            j = this.a.s();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.g.e;
        }
        return j;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, kf6 kf6Var, boolean z) {
        this.e = true;
        this.n = this.a.p();
        jh6 j = j(f, kf6Var, z);
        qr3 qr3Var = this.g;
        long j2 = qr3Var.b;
        long j3 = qr3Var.e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long a = a(j, j2, false, new boolean[this.j.length]);
        long j4 = this.p;
        qr3 qr3Var2 = this.g;
        this.p = (qr3Var2.b - a) + j4;
        this.g = qr3Var2.b(a, qr3Var2.c);
    }

    public final boolean g() {
        if (this.e) {
            if (!this.f || this.a.s() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            if (g() || d() - this.g.b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        b();
        ax3 ax3Var = this.l;
        wn3 wn3Var = this.a;
        try {
            IdentityHashMap identityHashMap = ax3Var.d;
            zw3 zw3Var = (zw3) identityHashMap.remove(wn3Var);
            zw3Var.getClass();
            zw3Var.a.h(wn3Var);
            zw3Var.c.remove(wn3Var.x);
            if (!identityHashMap.isEmpty()) {
                ax3Var.c();
            }
            ax3Var.d(zw3Var);
        } catch (RuntimeException e) {
            kb0.t("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final jh6 j(float f, kf6 kf6Var, boolean z) {
        zg6 zg6Var = this.n;
        jw3 jw3Var = this.g.a;
        mb1 mb1Var = this.k;
        w30[] w30VarArr = this.j;
        jh6 m = mb1Var.m(w30VarArr, zg6Var, jw3Var, kf6Var);
        jz1[] jz1VarArr = (jz1[]) m.z;
        for (int i = 0; i < m.x; i++) {
            boolean z2 = true;
            if (m.d(i)) {
                if (jz1VarArr[i] == null && w30VarArr[i].y != -2) {
                    z2 = false;
                }
                io3.B(z2);
            } else {
                if (jz1VarArr[i] != null) {
                    z2 = false;
                }
                io3.B(z2);
            }
        }
        for (jz1 jz1Var : jz1VarArr) {
            if (jz1Var != null) {
                jz1Var.q(f);
                jz1Var.g(z);
            }
        }
        return m;
    }
}
