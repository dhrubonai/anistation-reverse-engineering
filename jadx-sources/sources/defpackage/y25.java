package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y25 {
    public final w30 a;
    public final int b;
    public final w30 c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public y25(w30 w30Var, w30 w30Var2, int i) {
        this.a = w30Var;
        this.b = i;
        this.c = w30Var2;
    }

    public static void b(w30 w30Var) {
        boolean z;
        byte b = w30Var.E;
        if (b == 2) {
            if (b == 2) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
            w30Var.E = (byte) 1;
            w30Var.v();
        }
    }

    public static boolean k(w30 w30Var) {
        if (w30Var.E != 0) {
            return true;
        }
        return false;
    }

    public static void o(w30 w30Var, long j) {
        w30Var.K = true;
        if (w30Var instanceof pd6) {
            pd6 pd6Var = (pd6) w30Var;
            io3.B(pd6Var.K);
            pd6Var.i0 = j;
        }
    }

    public final void a(w30 w30Var, s91 s91Var) {
        boolean z;
        boolean z2 = true;
        if (this.a != w30Var && this.c != w30Var) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        if (!k(w30Var)) {
            return;
        }
        if (w30Var == s91Var.z) {
            s91Var.A = null;
            s91Var.z = null;
            s91Var.B = true;
        }
        b(w30Var);
        if (w30Var.E != 1) {
            z2 = false;
        }
        io3.B(z2);
        w30Var.z.m();
        w30Var.E = (byte) 0;
        w30Var.F = null;
        w30Var.G = null;
        w30Var.K = false;
        w30Var.p();
        w30Var.N = null;
        w30Var.O = -9223372036854775807L;
    }

    public final int c() {
        int i;
        boolean k = k(this.a);
        w30 w30Var = this.c;
        if (w30Var != null && k(w30Var)) {
            i = 1;
        } else {
            i = 0;
        }
        return (k ? 1 : 0) + i;
    }

    public final w30 d(pr3 pr3Var) {
        g95 g95Var;
        if (pr3Var != null && (g95Var = pr3Var.c[this.b]) != null) {
            w30 w30Var = this.a;
            if (w30Var.F == g95Var) {
                return w30Var;
            }
            w30 w30Var2 = this.c;
            if (w30Var2 != null && w30Var2.F == g95Var) {
                return w30Var2;
            }
            return null;
        }
        return null;
    }

    public final boolean e(pr3 pr3Var, w30 w30Var) {
        if (w30Var != null) {
            g95[] g95VarArr = pr3Var.c;
            int i = this.b;
            g95 g95Var = g95VarArr[i];
            g95 g95Var2 = w30Var.F;
            if (g95Var2 != null) {
                if (g95Var2 == g95Var) {
                    if (g95Var != null && !w30Var.j()) {
                        pr3 pr3Var2 = pr3Var.m;
                        if (pr3Var.g.f && pr3Var2 != null && pr3Var2.e && ((w30Var instanceof pd6) || (w30Var instanceof ly3) || w30Var.J >= pr3Var2.e())) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
                for (pr3 pr3Var3 = pr3Var.m; pr3Var3 != null; pr3Var3 = pr3Var3.m) {
                    if (Objects.equals(pr3Var3.c[i], w30Var.F)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean f() {
        boolean z;
        w30 w30Var = this.a;
        if (k(w30Var)) {
            z = w30Var.k();
        } else {
            z = true;
        }
        w30 w30Var2 = this.c;
        if (w30Var2 != null && w30Var2.E != 0) {
            return w30Var2.k() & z;
        }
        return z;
    }

    public final boolean g() {
        int i = this.d;
        if (i != 2 && i != 5 && i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final boolean h(pr3 pr3Var) {
        boolean z;
        boolean z2;
        int i = this.d;
        if ((i == 2 || i == 5) && d(pr3Var) == this.a) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.d;
        if ((i2 == 3 || i2 == 4) && d(pr3Var) == this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public final boolean i(pr3 pr3Var) {
        if (d(pr3Var) != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        int i = this.d;
        if (i != 0 && i != 2 && i != 5) {
            w30 w30Var = this.c;
            w30Var.getClass();
            if (w30Var.E != 0) {
                return true;
            }
            return false;
        }
        return k(this.a);
    }

    public final void l(boolean z) {
        boolean z2 = true;
        if (z) {
            if (this.e) {
                w30 w30Var = this.a;
                if (w30Var.E != 0) {
                    z2 = false;
                }
                io3.B(z2);
                w30Var.z.m();
                w30Var.t();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            w30 w30Var2 = this.c;
            w30Var2.getClass();
            if (w30Var2.E != 0) {
                z2 = false;
            }
            io3.B(z2);
            w30Var2.z.m();
            w30Var2.t();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m(w30 w30Var, pr3 pr3Var, jh6 jh6Var, s91 s91Var) {
        w30 w30Var2;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        g95[] g95VarArr = pr3Var.c;
        if (w30Var == null || w30Var.E == 0 || (w30Var == (w30Var2 = this.a) && ((i3 = this.d) == 2 || i3 == 5))) {
            return 1;
        }
        if (w30Var == this.c && ((i2 = this.d) == 3 || i2 == 4)) {
            return 1;
        }
        g95 g95Var = w30Var.F;
        int i4 = this.b;
        boolean z = false;
        if (g95Var != g95VarArr[i4]) {
            objArr = true;
        } else {
            objArr = false;
        }
        boolean d = jh6Var.d(i4);
        if (!d || objArr != false) {
            if (!w30Var.K) {
                jz1 jz1Var = ((jz1[]) jh6Var.z)[i4];
                if (jz1Var != null) {
                    i = jz1Var.length();
                } else {
                    i = 0;
                }
                ea2[] ea2VarArr = new ea2[i];
                for (int i5 = 0; i5 < i; i5++) {
                    jz1Var.getClass();
                    ea2VarArr[i5] = jz1Var.h(i5);
                }
                g95 g95Var2 = g95VarArr[i4];
                g95Var2.getClass();
                w30Var.A(ea2VarArr, g95Var2, pr3Var.e(), pr3Var.p, pr3Var.g.a);
                return 3;
            }
            if (!w30Var.k()) {
                return 0;
            }
            a(w30Var, s91Var);
            if (!d || g()) {
                if (w30Var == w30Var2) {
                    z = true;
                }
                l(z);
                return 1;
            }
        }
        return 1;
    }

    public final void n() {
        if (!k(this.a)) {
            l(true);
        }
        w30 w30Var = this.c;
        if (w30Var == null || w30Var.E != 0) {
            return;
        }
        l(false);
    }

    public final void p() {
        byte b;
        w30 w30Var = this.a;
        byte b2 = w30Var.E;
        boolean z = false;
        if (b2 == 1 && this.d != 5) {
            if (b2 == 1) {
                z = true;
            }
            io3.B(z);
            w30Var.E = (byte) 2;
            w30Var.u();
            return;
        }
        w30 w30Var2 = this.c;
        if (w30Var2 != null && (b = w30Var2.E) == 1 && this.d != 4) {
            if (b == 1) {
                z = true;
            }
            io3.B(z);
            w30Var2.E = (byte) 2;
            w30Var2.u();
        }
    }
}
