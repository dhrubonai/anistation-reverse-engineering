package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xi6 {
    public final qt0 a;
    public final xi6 b;
    public final String c;
    public final ti4 d;
    public final ti4 f;
    public final ti4 i;
    public final zt5 j;
    public final zt5 k;
    public final ti4 l;
    public final he1 m;
    public final ti4 e = xt5.g(null);
    public final ri4 g = new ri4(0);
    public final ri4 h = new ri4(Long.MIN_VALUE);

    public xi6(qt0 qt0Var, xi6 xi6Var, String str) {
        this.a = qt0Var;
        this.b = xi6Var;
        this.c = str;
        this.d = xt5.g(qt0Var.v());
        this.f = xt5.g(new ti6(qt0Var.v(), qt0Var.v()));
        Boolean bool = Boolean.FALSE;
        this.i = xt5.g(bool);
        this.j = new zt5();
        this.k = new zt5();
        this.l = xt5.g(bool);
        this.m = ut5.b(new h74(this, (byte) 2));
        qt0Var.C(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Object obj, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        Object[] objArr;
        int i3;
        boolean h;
        int i4;
        kd2Var.f0(-1493585151);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = kd2Var.f(obj);
            } else {
                h = kd2Var.h(obj);
            }
            if (h) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (kd2Var.f(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        byte b = 1;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            if (!h()) {
                kd2Var.e0(466062241);
                r(obj);
                int i5 = i2 & 112;
                if (i5 == 32) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                Object Q = kd2Var.Q();
                q18 q18Var = au0.a;
                if (objArr != false || Q == q18Var) {
                    Q = ut5.b(new h74(this, b));
                    kd2Var.n0(Q);
                }
                if (((Boolean) ((px5) Q).getValue()).booleanValue()) {
                    kd2Var.e0(466470356);
                    Object Q2 = kd2Var.Q();
                    if (Q2 == q18Var) {
                        Q2 = db.L(kd2Var);
                        kd2Var.n0(Q2);
                    }
                    v11 v11Var = (v11) Q2;
                    boolean h2 = kd2Var.h(v11Var);
                    if (i5 != 32) {
                        b = 0;
                    }
                    boolean z2 = (h2 ? 1 : 0) | b;
                    Object Q3 = kd2Var.Q();
                    if (z2 != 0 || Q3 == q18Var) {
                        Q3 = new ll5((Object) v11Var, (Object) this, (byte) 10);
                        kd2Var.n0(Q3);
                    }
                    db.d(v11Var, this, (ub2) Q3, kd2Var);
                    kd2Var.q(false);
                } else {
                    kd2Var.e0(467712929);
                    kd2Var.q(false);
                }
                kd2Var.q(false);
            } else {
                kd2Var.e0(467722849);
                kd2Var.q(false);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new mo((byte) 8, i, this, obj);
        }
    }

    public final long b() {
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((ui6) zt5Var.get(i)).I.h());
        }
        zt5 zt5Var2 = this.k;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((xi6) zt5Var2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        for (int i = 0; i < size; i++) {
            ui6 ui6Var = (ui6) zt5Var.get(i);
            ui6Var.C = null;
            ui6Var.B = null;
            ui6Var.F = false;
        }
        zt5 zt5Var2 = this.k;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((xi6) zt5Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        for (int i = 0; i < size; i++) {
            if (((ui6) zt5Var.get(i)).B != null) {
                return true;
            }
        }
        zt5 zt5Var2 = this.k;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((xi6) zt5Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        xi6 xi6Var = this.b;
        if (xi6Var != null) {
            return xi6Var.e();
        }
        return this.g.h();
    }

    public final si6 f() {
        return (si6) this.f.getValue();
    }

    public final boolean g() {
        if (this.h.h() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void i(long j, boolean z) {
        long j2;
        ri4 ri4Var = this.h;
        long h = ri4Var.h();
        qt0 qt0Var = this.a;
        if (h == Long.MIN_VALUE) {
            ri4Var.i(j);
            ((ti4) qt0Var.x).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((ti4) qt0Var.x).getValue()).booleanValue()) {
            ((ti4) qt0Var.x).setValue(Boolean.TRUE);
        }
        p(false);
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            ui6 ui6Var = (ui6) zt5Var.get(i);
            ti4 ti4Var = ui6Var.D;
            ti4 ti4Var2 = ui6Var.D;
            if (!((Boolean) ti4Var.getValue()).booleanValue()) {
                if (z) {
                    j2 = ui6Var.b().c();
                } else {
                    j2 = j;
                }
                ui6Var.e(ui6Var.b().g(j2));
                ui6Var.H = ui6Var.b().e(j2);
                if (ui6Var.b().f(j2)) {
                    ti4Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ti4Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        zt5 zt5Var2 = this.k;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            xi6 xi6Var = (xi6) zt5Var2.get(i2);
            ti4 ti4Var3 = xi6Var.d;
            qt0 qt0Var2 = xi6Var.a;
            if (!a34.i(ti4Var3.getValue(), qt0Var2.v())) {
                xi6Var.i(j, z);
            }
            if (!a34.i(xi6Var.d.getValue(), qt0Var2.v())) {
                z2 = false;
            }
        }
        if (z2) {
            j();
        }
    }

    public final void j() {
        this.h.i(Long.MIN_VALUE);
        qt0 qt0Var = this.a;
        if (qt0Var instanceof y44) {
            qt0Var.B(this.d.getValue());
        }
        o(0L);
        ((ti4) qt0Var.x).setValue(Boolean.FALSE);
        zt5 zt5Var = this.k;
        int size = zt5Var.size();
        for (int i = 0; i < size; i++) {
            ((xi6) zt5Var.get(i)).j();
        }
    }

    public final void k(float f) {
        Object obj;
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        for (int i = 0; i < size; i++) {
            ui6 ui6Var = (ui6) zt5Var.get(i);
            ui6Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                l76 l76Var = ui6Var.C;
                if (l76Var != null) {
                    ui6Var.b().a(l76Var.c);
                    ui6Var.B = null;
                    ui6Var.C = null;
                }
                if (f == -4.0f) {
                    obj = ui6Var.b().d;
                } else {
                    obj = ui6Var.b().c;
                }
                ui6Var.b().a(obj);
                ui6Var.b().i(obj);
                ui6Var.e(obj);
                ui6Var.I.i(ui6Var.b().c());
            } else {
                ui6Var.E.i(f);
            }
        }
        zt5 zt5Var2 = this.k;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((xi6) zt5Var2.get(i2)).k(f);
        }
    }

    public final void l(Object obj, Object obj2) {
        this.h.i(Long.MIN_VALUE);
        qt0 qt0Var = this.a;
        ((ti4) qt0Var.x).setValue(Boolean.FALSE);
        boolean h = h();
        ti4 ti4Var = this.d;
        if (!h || !a34.i(qt0Var.v(), obj) || !a34.i(ti4Var.getValue(), obj2)) {
            if (!a34.i(qt0Var.v(), obj) && (qt0Var instanceof y44)) {
                qt0Var.B(obj);
            }
            ti4Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new ti6(obj, obj2));
        }
        zt5 zt5Var = this.k;
        int size = zt5Var.size();
        for (int i = 0; i < size; i++) {
            xi6 xi6Var = (xi6) zt5Var.get(i);
            xi6Var.getClass();
            if (xi6Var.h()) {
                xi6Var.l(xi6Var.a.v(), xi6Var.d.getValue());
            }
        }
        zt5 zt5Var2 = this.j;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ui6) zt5Var2.get(i2)).c(0L);
        }
    }

    public final void m(long j) {
        ri4 ri4Var = this.h;
        if (ri4Var.h() == Long.MIN_VALUE) {
            ri4Var.i(j);
        }
        o(j);
        p(false);
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        for (int i = 0; i < size; i++) {
            ((ui6) zt5Var.get(i)).c(j);
        }
        zt5 zt5Var2 = this.k;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            xi6 xi6Var = (xi6) zt5Var2.get(i2);
            if (!a34.i(xi6Var.d.getValue(), xi6Var.a.v())) {
                xi6Var.m(j);
            }
        }
    }

    public final void n(lf5 lf5Var) {
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        for (int i = 0; i < size; i++) {
            ui6 ui6Var = (ui6) zt5Var.get(i);
            ti4 ti4Var = ui6Var.G;
            if (!a34.i(ui6Var.b().c, ui6Var.b().d)) {
                ui6Var.C = ui6Var.b();
                ui6Var.B = lf5Var;
            }
            ui6Var.A.setValue(new l76(ui6Var.K, ui6Var.x, ti4Var.getValue(), ti4Var.getValue(), ui6Var.H.c()));
            ui6Var.I.i(ui6Var.b().c());
            ui6Var.F = true;
        }
        zt5 zt5Var2 = this.k;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((xi6) zt5Var2.get(i2)).n(lf5Var);
        }
    }

    public final void o(long j) {
        if (this.b == null) {
            this.g.i(j);
        }
    }

    public final void p(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void q() {
        l76 l76Var;
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        for (int i = 0; i < size; i++) {
            ui6 ui6Var = (ui6) zt5Var.get(i);
            lf5 lf5Var = ui6Var.B;
            if (lf5Var != null && (l76Var = ui6Var.C) != null) {
                long i0 = io3.i0(lf5Var.g * lf5Var.d);
                Object g = l76Var.g(i0);
                if (ui6Var.F) {
                    ui6Var.b().i(g);
                }
                ui6Var.b().a(g);
                ui6Var.I.i(ui6Var.b().c());
                if (ui6Var.E.h() == -2.0f || ui6Var.F) {
                    ui6Var.e(g);
                } else {
                    ui6Var.c(ui6Var.L.e());
                }
                if (i0 >= lf5Var.g) {
                    ui6Var.B = null;
                    ui6Var.C = null;
                } else {
                    lf5Var.c = false;
                }
            }
        }
        zt5 zt5Var2 = this.k;
        int size2 = zt5Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((xi6) zt5Var2.get(i2)).q();
        }
    }

    public final void r(Object obj) {
        ti4 ti4Var = this.d;
        if (!a34.i(ti4Var.getValue(), obj)) {
            this.f.setValue(new ti6(ti4Var.getValue(), obj));
            qt0 qt0Var = this.a;
            if (!a34.i(qt0Var.v(), ti4Var.getValue())) {
                qt0Var.B(ti4Var.getValue());
            }
            ti4Var.setValue(obj);
            if (!g()) {
                p(true);
            }
            zt5 zt5Var = this.j;
            int size = zt5Var.size();
            for (int i = 0; i < size; i++) {
                ((ui6) zt5Var.get(i)).E.i(-2.0f);
            }
        }
    }

    public final String toString() {
        zt5 zt5Var = this.j;
        int size = zt5Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((ui6) zt5Var.get(i)) + ", ";
        }
        return str;
    }
}
