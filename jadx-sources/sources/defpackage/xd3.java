package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xd3 {
    public final Object a;
    public final yd3 b;
    public int d;
    public xd3 e;
    public boolean f;
    public int c = -1;
    public final ti4 g = xt5.g(null);

    public xd3(Object obj, yd3 yd3Var) {
        this.a = obj;
        this.b = yd3Var;
    }

    public final xd3 a() {
        if (this.f) {
            hz2.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.x.add(this);
            xd3 xd3Var = (xd3) this.g.getValue();
            if (xd3Var != null) {
                xd3Var.a();
            } else {
                xd3Var = null;
            }
            this.e = xd3Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (!this.f) {
            if (this.d <= 0) {
                hz2.c("Release should only be called once");
            }
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.b.x.remove(this);
                xd3 xd3Var = this.e;
                if (xd3Var != null) {
                    xd3Var.b();
                }
                this.e = null;
            }
        }
    }
}
