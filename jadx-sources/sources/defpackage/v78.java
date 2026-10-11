package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v78 extends Task {
    public final Object a = new Object();
    public final u98 b = new u98((byte) 7);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final v78 a(Executor executor, ke4 ke4Var) {
        this.b.m(new os7(executor, ke4Var));
        j();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception b() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object c() {
        Object obj;
        synchronized (this.a) {
            try {
                a34.A("Task is not yet complete", this.c);
                if (!this.d) {
                    Exception exc = this.f;
                    if (exc == null) {
                        obj = this.e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final v78 e(zd4 zd4Var) {
        this.b.m(new os7(r76.a, zd4Var));
        j();
        return this;
    }

    public final void f(Object obj) {
        synchronized (this.a) {
            i();
            this.c = true;
            this.e = obj;
        }
        this.b.n(this);
    }

    public final void g(Exception exc) {
        a34.y(exc, "Exception must not be null");
        synchronized (this.a) {
            i();
            this.c = true;
            this.f = exc;
        }
        this.b.n(this);
    }

    public final void h() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.n(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        boolean z;
        String str;
        if (this.c) {
            synchronized (this.a) {
                z = this.c;
            }
            if (z) {
                Exception b = b();
                if (b == null) {
                    if (!d()) {
                        if (this.d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(c()));
                    }
                } else {
                    str = "failure";
                }
                throw new wm0("Complete with: ".concat(str), b, (byte) 2);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void j() {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    return;
                }
                this.b.n(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
