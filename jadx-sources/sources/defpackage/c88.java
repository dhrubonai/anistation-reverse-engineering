package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c88 extends yu5 {
    @Override // defpackage.yu5
    public final void n(e88 e88Var, Thread thread) {
        e88Var.a = thread;
    }

    @Override // defpackage.yu5
    public final void p(e88 e88Var, e88 e88Var2) {
        e88Var.b = e88Var2;
    }

    @Override // defpackage.yu5
    public final boolean q(f88 f88Var, e88 e88Var, e88 e88Var2) {
        synchronized (f88Var) {
            try {
                if (f88Var.z == e88Var) {
                    f88Var.z = e88Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yu5
    public final boolean r(f88 f88Var, z78 z78Var, z78 z78Var2) {
        synchronized (f88Var) {
            try {
                if (f88Var.y == z78Var) {
                    f88Var.y = z78Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yu5
    public final e88 s(f88 f88Var) {
        e88 e88Var;
        e88 e88Var2 = e88.c;
        synchronized (f88Var) {
            try {
                e88Var = f88Var.z;
                if (e88Var != e88Var2) {
                    f88Var.z = e88Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e88Var;
    }

    @Override // defpackage.yu5
    public final z78 t(f88 f88Var) {
        z78 z78Var;
        z78 z78Var2 = z78.d;
        synchronized (f88Var) {
            try {
                z78Var = f88Var.y;
                if (z78Var != z78Var2) {
                    f88Var.y = z78Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z78Var;
    }

    @Override // defpackage.yu5
    public final boolean u(f88 f88Var, Object obj, Object obj2) {
        synchronized (f88Var) {
            try {
                if (f88Var.x == obj) {
                    f88Var.x = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
