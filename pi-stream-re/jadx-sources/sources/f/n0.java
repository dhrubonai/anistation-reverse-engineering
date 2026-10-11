package f;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3756a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3757b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f3758c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f3759d;

    public n0(o0 o0Var) {
        this.f3758c = o0Var;
    }

    public final void a() {
        synchronized (this.f3756a) {
            Runnable runnable = (Runnable) this.f3757b.poll();
            this.f3759d = runnable;
            if (runnable != null) {
                this.f3758c.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3756a) {
            this.f3757b.add(new m0(0, this, runnable));
            if (this.f3759d == null) {
                a();
            }
        }
    }
}
