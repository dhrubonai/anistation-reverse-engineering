package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class db3 {
    public final za3 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public em3 q;
    public va3 d = va3.B;
    public final uo3 p = new uo3(this);

    public db3(za3 za3Var) {
        this.a = za3Var;
    }

    public final fa4 a() {
        return (fa4) this.a.c0.B;
    }

    public final void b() {
        va3 va3Var = this.a.d0.d;
        va3 va3Var2 = va3.z;
        va3 va3Var3 = va3.A;
        if (va3Var == va3Var2 || va3Var == va3Var3) {
            if (this.p.Y) {
                g(true);
            } else {
                f(true);
            }
        }
        if (va3Var == va3Var3) {
            em3 em3Var = this.q;
            if (em3Var != null && em3Var.S) {
                i(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(long j) {
        em3 em3Var = this.q;
        if (em3Var != null) {
            db3 db3Var = em3Var.C;
            db3Var.d = va3.y;
            za3 za3Var = db3Var.a;
            db3Var.e = false;
            em3Var.W = j;
            mh4 snapshotObserver = ((oa) cb3.a(za3Var)).getSnapshotObserver();
            cm3 cm3Var = em3Var.X;
            snapshotObserver.a.d(za3Var, snapshotObserver.b, cm3Var);
            db3Var.f = true;
            db3Var.g = true;
            boolean w = wk6.w(za3Var);
            uo3 uo3Var = db3Var.p;
            if (w) {
                uo3Var.T = true;
                uo3Var.U = true;
            } else {
                uo3Var.S = true;
            }
            db3Var.d = va3.B;
        }
    }

    public final void d(int i) {
        boolean z;
        db3 db3Var;
        int i2 = this.l;
        this.l = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            za3 v = this.a.v();
            if (v != null) {
                db3Var = v.d0;
            } else {
                db3Var = null;
            }
            if (db3Var != null) {
                int i3 = db3Var.l;
                if (i == 0) {
                    db3Var.d(i3 - 1);
                } else {
                    db3Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        boolean z;
        db3 db3Var;
        int i2 = this.o;
        this.o = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            za3 v = this.a.v();
            if (v != null) {
                db3Var = v.d0;
            } else {
                db3Var = null;
            }
            if (db3Var != null) {
                int i3 = db3Var.o;
                if (i == 0) {
                    db3Var.e(i3 - 1);
                } else {
                    db3Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else if (!z && !this.j) {
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else if (!z && !this.k) {
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else if (!z && !this.m) {
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else if (!z && !this.n) {
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        uo3 uo3Var = this.p;
        db3 db3Var = uo3Var.C;
        Object obj = uo3Var.P;
        za3 za3Var = this.a;
        if ((obj != null || db3Var.a().w() != null) && uo3Var.O) {
            uo3Var.O = false;
            uo3Var.P = db3Var.a().w();
            za3 v = za3Var.v();
            if (v != null) {
                za3.W(v, false, 7);
            }
        }
        em3 em3Var = this.q;
        if (em3Var != null) {
            db3 db3Var2 = em3Var.C;
            if (em3Var.V == null) {
                am3 W0 = db3Var2.a().W0();
                W0.getClass();
                if (W0.R.w() == null) {
                    return;
                }
            }
            if (em3Var.U) {
                em3Var.U = false;
                am3 W02 = db3Var2.a().W0();
                W02.getClass();
                em3Var.V = W02.R.w();
                if (wk6.w(za3Var)) {
                    za3 v2 = za3Var.v();
                    if (v2 != null) {
                        za3.W(v2, false, 7);
                        return;
                    }
                    return;
                }
                za3 v3 = za3Var.v();
                if (v3 != null) {
                    za3.U(v3, false, 7);
                }
            }
        }
    }
}
