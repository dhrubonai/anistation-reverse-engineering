package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ts6 {
    public static final long h;
    public final boolean a;
    public final ExecutorService b;
    public final Future c;
    public final rs6 d;
    public final Object e = new Object();
    public final ArrayDeque f = new ArrayDeque();
    public boolean g;

    static {
        long j;
        if (eq6.Q()) {
            j = 5000;
        } else {
            j = 500;
        }
        h = j;
    }

    public ts6(ExecutorService executorService, boolean z, rs6 rs6Var) {
        this.b = executorService;
        this.c = executorService.submit((Callable) new Object());
        this.a = z;
        this.d = rs6Var;
    }

    public final void a() {
        synchronized (this.e) {
            this.g = true;
            this.f.clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.submit(new qs6(this, false, new fj0(this, countDownLatch, (byte) 6)));
        countDownLatch.await();
    }

    public final void b(Exception exc) {
        synchronized (this.e) {
            try {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.d.a(ns6.a(exc, -9223372036854775807L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ss6 ss6Var) {
        if (d()) {
            try {
                ss6Var.run();
                return;
            } catch (Exception e) {
                b(e);
                return;
            }
        }
        try {
            this.b.submit(new sp5(this, ss6Var, (byte) 10)).get(h, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            b(e2);
        }
    }

    public final boolean d() {
        try {
            if (Thread.currentThread() != ((Thread) this.c.get(h, TimeUnit.MILLISECONDS))) {
                return false;
            }
            return true;
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            b(e2);
            return false;
        }
    }

    public final void e(ss6 ss6Var) {
        io3.B(!d());
        synchronized (this.e) {
            this.g = true;
            this.f.clear();
        }
        this.b.submit(new qs6(this, false, ss6Var));
        if (this.a) {
            this.b.shutdown();
            if (!this.b.awaitTermination(h, TimeUnit.MILLISECONDS)) {
                this.d.a(new ns6("Release timed out. OpenGL resources may not be cleaned up properly."));
            }
        }
    }

    public final void f(ss6 ss6Var, boolean z) {
        synchronized (this.e) {
            if (this.g && z) {
                return;
            }
            try {
                this.b.submit(new qs6(this, z, ss6Var));
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                b(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ss6, java.lang.Object] */
    public final void g(ss6 ss6Var) {
        synchronized (this.e) {
            try {
                if (this.g) {
                    return;
                }
                this.f.add(ss6Var);
                f(new Object(), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        try {
            io3.B(d());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            b(e);
        }
    }
}
