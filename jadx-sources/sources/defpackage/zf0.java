package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zf0 implements ii3 {
    public final WeakReference x;
    public final yf0 y = new yf0(this);

    public zf0(wf0 wf0Var) {
        this.x = new WeakReference(wf0Var);
    }

    @Override // defpackage.ii3
    public final void a(Runnable runnable, Executor executor) {
        this.y.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        wf0 wf0Var = (wf0) this.x.get();
        boolean cancel = this.y.cancel(z);
        if (cancel && wf0Var != null) {
            wf0Var.a = null;
            wf0Var.b = null;
            wf0Var.c.k(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.y.x instanceof q2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.y.isDone();
    }

    public final String toString() {
        return this.y.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.y.get(j, timeUnit);
    }
}
