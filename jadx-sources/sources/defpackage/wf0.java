package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wf0 {
    public Object a;
    public zf0 b;
    public b45 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        zf0 zf0Var = this.b;
        if (zf0Var != null && zf0Var.y.k(obj)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        zf0 zf0Var = this.b;
        if (zf0Var != null && zf0Var.y.l(th)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void finalize() {
        b45 b45Var;
        zf0 zf0Var = this.b;
        if (zf0Var != null) {
            yf0 yf0Var = zf0Var.y;
            if (!yf0Var.isDone()) {
                yf0Var.l(new y0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (!this.d && (b45Var = this.c) != null) {
            b45Var.k(null);
        }
    }
}
