package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p76 {
    public final v78 a = new v78();

    public final void a(Exception exc) {
        this.a.g(exc);
    }

    public final void b(Object obj) {
        this.a.f(obj);
    }

    public final void c(Exception exc) {
        v78 v78Var = this.a;
        a34.y(exc, "Exception must not be null");
        synchronized (v78Var.a) {
            try {
                if (v78Var.c) {
                    return;
                }
                v78Var.c = true;
                v78Var.f = exc;
                v78Var.b.n(v78Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        v78 v78Var = this.a;
        synchronized (v78Var.a) {
            try {
                if (v78Var.c) {
                    return;
                }
                v78Var.c = true;
                v78Var.e = obj;
                v78Var.b.n(v78Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
