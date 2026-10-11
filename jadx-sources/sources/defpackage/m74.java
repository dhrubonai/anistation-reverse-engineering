package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m74 {
    public final xv3 a;
    public final v74 b = new v74();
    public final g44 c;
    public final g44 d;

    public m74(xv3 xv3Var) {
        this.a = xv3Var;
        pg4.a();
        this.c = pg4.a();
        this.d = pg4.a();
    }

    public static void a(m74 m74Var, o74 o74Var) {
        m74Var.getClass();
        o74Var.getClass();
        if (m74Var.c.a(o74Var)) {
            v74 v74Var = m74Var.b;
            if (o74Var.g == null) {
                v74Var.e.addFirst(o74Var);
                o74Var.g = m74Var;
                v74Var.b();
                return;
            }
            ov3.m("Handler '", o74Var, "' is already registered with a dispatcher");
        }
    }

    public final void b(u74 u74Var) {
        if (this.d.a(u74Var)) {
            this.b.a(this, u74Var, -1);
        }
    }

    public final void c(od4 od4Var, int i) {
        if (i != 1 && i != 0) {
            ze0.e(qx1.h(i, "Unsupported priority value: "));
        } else if (this.d.a(od4Var)) {
            this.b.a(this, od4Var, i);
        }
    }

    public final void d(u74 u74Var, l74 l74Var) {
        v74 v74Var = this.b;
        if (v74Var.g == 0) {
            o74 c = v74Var.c(-1);
            v74Var.f = c;
            v74Var.g = -1;
            v74Var.h = u74Var;
            if (l74Var != null) {
                if (c != null) {
                    c.d = new y74(l74Var, -1);
                    c.d(l74Var);
                }
                v74Var.a.l(null, new y74(l74Var, -1));
            }
        }
    }
}
