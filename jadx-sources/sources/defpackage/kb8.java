package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kb8 implements pb8 {
    public final w88 a;
    public final z95 b;

    public kb8(z95 z95Var, w88 w88Var) {
        qp7 qp7Var = n98.a;
        this.b = z95Var;
        this.a = w88Var;
    }

    @Override // defpackage.pb8
    public final ba8 a() {
        w88 w88Var = this.a;
        if (w88Var instanceof ba8) {
            return (ba8) ((ba8) w88Var).i(4, null);
        }
        x98 x98Var = (x98) ((ba8) w88Var).i(5, null);
        boolean j = x98Var.y.j();
        ba8 ba8Var = x98Var.y;
        if (!j) {
            return ba8Var;
        }
        ba8Var.getClass();
        mb8.c.a(ba8Var.getClass()).g(ba8Var);
        ba8Var.k();
        return x98Var.y;
    }

    @Override // defpackage.pb8
    public final void b(Object obj, Object obj2) {
        rb8.b(obj, obj2);
    }

    @Override // defpackage.pb8
    public final int c(w88 w88Var) {
        tc7 tc7Var = ((ba8) w88Var).zzc;
        int i = tc7Var.c;
        if (i == -1) {
            tc7Var.c = 0;
            return 0;
        }
        return i;
    }

    @Override // defpackage.pb8
    public final boolean d(ba8 ba8Var, ba8 ba8Var2) {
        if (!ba8Var.zzc.equals(ba8Var2.zzc)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.pb8
    public final int e(ba8 ba8Var) {
        ba8Var.zzc.getClass();
        return 506991;
    }

    @Override // defpackage.pb8
    public final boolean f(Object obj) {
        throw h11.f(obj);
    }

    @Override // defpackage.pb8
    public final void g(Object obj) {
        this.b.getClass();
        tc7 tc7Var = ((ba8) obj).zzc;
        if (tc7Var.d) {
            tc7Var.d = false;
        }
        qp7 qp7Var = n98.a;
        throw h11.f(obj);
    }

    @Override // defpackage.pb8
    public final void h(Object obj, qb7 qb7Var) {
        throw h11.f(obj);
    }
}
