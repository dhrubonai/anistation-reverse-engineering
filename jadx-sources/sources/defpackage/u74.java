package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class u74 {
    public m74 a;
    public boolean b;

    public final void a() {
        m74 m74Var = this.a;
        if (m74Var != null) {
            if (!this.b) {
                m74Var.d(this, null);
            }
            v74 v74Var = m74Var.b;
            xv3 xv3Var = m74Var.a;
            if (equals(v74Var.h) && -1 == v74Var.g) {
                o74 o74Var = v74Var.f;
                if (o74Var == null) {
                    o74Var = v74Var.c(-1);
                }
                v74Var.f = null;
                v74Var.g = 0;
                v74Var.h = null;
                x74 x74Var = x74.a;
                if (o74Var == null) {
                    ((wd4) xv3Var.y).a.run();
                } else {
                    o74Var.d = x74Var;
                    o74Var.b();
                }
                v74Var.a.l(null, x74Var);
            }
            this.b = false;
            return;
        }
        ze0.m("This input is not added to any dispatcher.");
    }

    public void b(boolean z) {
    }
}
