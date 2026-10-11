package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sq7 {
    public static final Object f = new Object();
    public final String a;
    public final vm7 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ sq7(String str, Object obj, vm7 vm7Var) {
        this.a = str;
        this.c = obj;
        this.b = vm7Var;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (uv5.a == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (og5.b()) {
                    if (this.e == null) {
                        obj2 = this.c;
                    } else {
                        obj2 = this.e;
                    }
                    return obj2;
                }
                try {
                    for (sq7 sq7Var : tq7.a) {
                        if (!og5.b()) {
                            Object obj3 = null;
                            try {
                                vm7 vm7Var = sq7Var.b;
                                if (vm7Var != null) {
                                    obj3 = vm7Var.a();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f) {
                                sq7Var.e = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                vm7 vm7Var2 = this.b;
                if (vm7Var2 != null) {
                    try {
                        return vm7Var2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } finally {
            }
        }
    }
}
