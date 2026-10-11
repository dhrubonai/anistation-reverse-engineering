package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class h3 extends x62 implements Runnable {
    public ii3 F;
    public Object G;

    public h3(ii3 ii3Var, Object obj) {
        ii3Var.getClass();
        this.F = ii3Var;
        this.G = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x62, h3, g3, java.lang.Runnable] */
    public static g3 q(ii3 ii3Var, qc2 qc2Var, Executor executor) {
        ?? h3Var = new h3(ii3Var, qc2Var);
        ii3Var.a(h3Var, kb0.I(executor, h3Var));
        return h3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x62, h3, java.lang.Runnable, f3] */
    public static f3 r(ii3 ii3Var, gt gtVar, Executor executor) {
        executor.getClass();
        ?? h3Var = new h3(ii3Var, gtVar);
        ii3Var.a(h3Var, kb0.I(executor, h3Var));
        return h3Var;
    }

    @Override // defpackage.j1
    public final void c() {
        boolean z;
        ii3 ii3Var = this.F;
        if (ii3Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.x instanceof x0)) {
            ii3Var.cancel(p());
        }
        this.F = null;
        this.G = null;
    }

    @Override // defpackage.j1
    public final String j() {
        String str;
        ii3 ii3Var = this.F;
        Object obj = this.G;
        String j = super.j();
        if (ii3Var != null) {
            str = "inputFuture=[" + ii3Var + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        }
        if (j != null) {
            return str.concat(j);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ii3 ii3Var = this.F;
        Object obj = this.G;
        boolean z2 = this.x instanceof x0;
        boolean z3 = true;
        if (ii3Var == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z2 | z;
        if (obj != null) {
            z3 = false;
        }
        if (z4 | z3) {
            return;
        }
        this.F = null;
        if (ii3Var.isCancelled()) {
            n(ii3Var);
            return;
        }
        try {
            try {
                Object s = s(obj, wc7.s(ii3Var));
                this.G = null;
                t(s);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.G = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }

    public Object s(Object obj, Object obj2) {
        gt gtVar = (gt) obj;
        ii3 apply = gtVar.apply(obj2);
        io3.u(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", gtVar);
        return apply;
    }

    public void t(Object obj) {
        n((ii3) obj);
    }
}
