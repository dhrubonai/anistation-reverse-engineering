package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class td2 implements Cloneable {
    public final vd2 x;
    public vd2 y;

    public td2(vd2 vd2Var) {
        this.x = vd2Var;
        if (!vd2Var.g()) {
            this.y = vd2Var.i();
        } else {
            ze0.k("Default instance must be immutable.");
            throw null;
        }
    }

    public final vd2 a() {
        vd2 b = b();
        b.getClass();
        if (vd2.f(b, true)) {
            return b;
        }
        throw new ln6();
    }

    public final vd2 b() {
        boolean g = this.y.g();
        vd2 vd2Var = this.y;
        if (!g) {
            return vd2Var;
        }
        vd2Var.getClass();
        ew4 ew4Var = ew4.c;
        ew4Var.getClass();
        ew4Var.a(vd2Var.getClass()).b(vd2Var);
        vd2Var.h();
        return this.y;
    }

    public final void c() {
        if (!this.y.g()) {
            vd2 i = this.x.i();
            vd2 vd2Var = this.y;
            ew4 ew4Var = ew4.c;
            ew4Var.getClass();
            ew4Var.a(i.getClass()).a(i, vd2Var);
            this.y = i;
        }
    }

    public final Object clone() {
        td2 td2Var = (td2) this.x.c(5);
        td2Var.y = b();
        return td2Var;
    }
}
