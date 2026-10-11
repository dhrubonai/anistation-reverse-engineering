package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class o74 {
    public t74 a;
    public List b;
    public List c;
    public z74 d;
    public boolean e;
    public boolean f;
    public m74 g;

    public o74(t74 t74Var, boolean z) {
        t74Var.getClass();
        this.a = t74Var;
        nt1 nt1Var = nt1.x;
        this.b = nt1Var;
        this.c = nt1Var;
        this.d = x74.a;
        this.e = z;
        this.f = false;
    }

    public abstract void b();

    public void d(l74 l74Var) {
        l74Var.getClass();
    }

    public final void f() {
        m74 m74Var = this.g;
        if (m74Var != null && m74Var.c.h(this)) {
            v74 v74Var = m74Var.b;
            if (equals(v74Var.f)) {
                int i = v74Var.g;
                x74 x74Var = x74.a;
                if (i != -1) {
                    if (i == 1) {
                        this.d = x74Var;
                        e();
                    }
                } else {
                    this.d = x74Var;
                    a();
                }
                v74Var.f = null;
                v74Var.g = 0;
                v74Var.h = null;
            }
            v74Var.d.remove(this);
            v74Var.e.remove(this);
            this.g = null;
            v74Var.b();
        }
    }

    public final void g(boolean z) {
        if (this.e != z) {
            this.e = z;
            m74 m74Var = this.g;
            if (m74Var != null) {
                m74Var.b.b();
            }
        }
    }

    public void a() {
    }

    public void e() {
    }

    public void c(l74 l74Var) {
    }
}
