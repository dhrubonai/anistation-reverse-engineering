package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ui6 implements px5 {
    public final ti4 A;
    public lf5 B;
    public l76 C;
    public final ti4 D;
    public final pi4 E;
    public boolean F;
    public final ti4 G;
    public rl H;
    public final ri4 I;
    public boolean J;
    public final tw5 K;
    public final /* synthetic */ xi6 L;
    public final tk6 x;
    public final ti4 y;
    public final ti4 z;

    public ui6(xi6 xi6Var, Object obj, rl rlVar, tk6 tk6Var) {
        this.L = xi6Var;
        this.x = tk6Var;
        ti4 g = xt5.g(obj);
        this.y = g;
        Object obj2 = null;
        ti4 g2 = xt5.g(z51.O(0.0f, 0.0f, null, 7));
        this.z = g2;
        this.A = xt5.g(new l76((j32) g2.getValue(), tk6Var, obj, g.getValue(), rlVar));
        this.D = xt5.g(Boolean.TRUE);
        this.E = new pi4(-1.0f);
        this.G = xt5.g(obj);
        this.H = rlVar;
        this.I = new ri4(b().c());
        Float f = (Float) sw6.a.get(tk6Var);
        if (f != null) {
            float floatValue = f.floatValue();
            rl rlVar2 = (rl) tk6Var.a.invoke(obj);
            int b = rlVar2.b();
            for (int i = 0; i < b; i++) {
                rlVar2.e(i, floatValue);
            }
            obj2 = this.x.b.invoke(rlVar2);
        }
        this.K = z51.O(0.0f, 0.0f, obj2, 3);
    }

    public final l76 b() {
        return (l76) this.A.getValue();
    }

    public final void c(long j) {
        if (this.E.h() == -1.0f) {
            this.J = true;
            if (a34.i(b().c, b().d)) {
                e(b().c);
            } else {
                e(b().g(j));
                this.H = b().e(j);
            }
        }
    }

    public final void e(Object obj) {
        this.G.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        Object obj2;
        ll fx5Var;
        l76 l76Var = this.C;
        if (l76Var != null) {
            obj2 = l76Var.c;
        } else {
            obj2 = null;
        }
        ti4 ti4Var = this.y;
        boolean i = a34.i(obj2, ti4Var.getValue());
        ri4 ri4Var = this.I;
        ti4 ti4Var2 = this.A;
        j32 j32Var = this.K;
        if (i) {
            ti4Var2.setValue(new l76(j32Var, this.x, obj, obj, this.H.c()));
            this.F = true;
            ri4Var.i(b().c());
            return;
        }
        ti4 ti4Var3 = this.z;
        if (z && !this.J) {
            if (((j32) ti4Var3.getValue()) instanceof tw5) {
                j32Var = (j32) ti4Var3.getValue();
            }
        } else {
            j32Var = (j32) ti4Var3.getValue();
        }
        xi6 xi6Var = this.L;
        if (xi6Var.e() <= 0) {
            fx5Var = j32Var;
        } else {
            fx5Var = new fx5(j32Var, xi6Var.e());
        }
        ti4Var2.setValue(new l76(fx5Var, this.x, obj, ti4Var.getValue(), this.H));
        ri4Var.i(b().c());
        this.F = false;
        xi6Var.p(true);
        if (xi6Var.h()) {
            zt5 zt5Var = xi6Var.j;
            int size = zt5Var.size();
            for (int i2 = 0; i2 < size; i2++) {
                ui6 ui6Var = (ui6) zt5Var.get(i2);
                ui6Var.I.h();
                ui6Var.c(0L);
            }
            xi6Var.p(false);
        }
    }

    public final void g(Object obj, Object obj2, j32 j32Var) {
        this.y.setValue(obj2);
        this.z.setValue(j32Var);
        if (a34.i(b().d, obj) && a34.i(b().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return this.G.getValue();
    }

    public final void h(Object obj, j32 j32Var, Object obj2, rl rlVar) {
        Object obj3;
        Object obj4;
        if (this.F) {
            l76 l76Var = this.C;
            if (l76Var != null) {
                obj4 = l76Var.c;
            } else {
                obj4 = null;
            }
            if (a34.i(obj, obj4)) {
                return;
            }
        }
        ti4 ti4Var = this.y;
        boolean i = a34.i(ti4Var.getValue(), obj);
        pi4 pi4Var = this.E;
        if (i && pi4Var.h() == -1.0f && (obj2 == null || obj2.equals(b().d))) {
            return;
        }
        ti4Var.setValue(obj);
        this.z.setValue(j32Var);
        if (obj2 == null) {
            if (pi4Var.h() == -3.0f) {
                obj3 = obj;
            } else {
                obj3 = this.G.getValue();
            }
        } else {
            obj3 = obj2;
        }
        if (obj2 != null) {
            e(obj3);
            if (rlVar != null) {
                this.H = rlVar;
            }
        }
        ti4 ti4Var2 = this.D;
        boolean z = true;
        f(obj3, !((Boolean) ti4Var2.getValue()).booleanValue());
        if (pi4Var.h() != -3.0f) {
            z = false;
        }
        ti4Var2.setValue(Boolean.valueOf(z));
        if (pi4Var.h() >= 0.0f) {
            long c = b().c();
            e(b().g(pi4Var.h() * ((float) c)));
        } else if (pi4Var.h() == -3.0f) {
            e(obj);
        }
        this.F = false;
        pi4Var.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.G.getValue() + ", target: " + this.y.getValue() + ", spec: " + ((j32) this.z.getValue());
    }
}
