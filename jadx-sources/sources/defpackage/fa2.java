package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fa2 extends y62 {
    public final ii3 F;

    public fa2(ii3 ii3Var) {
        this.F = ii3Var;
    }

    @Override // defpackage.j1, defpackage.ii3
    public final void a(Runnable runnable, Executor executor) {
        this.F.a(runnable, executor);
    }

    @Override // defpackage.j1, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.F.cancel(z);
    }

    @Override // defpackage.j1, java.util.concurrent.Future
    public final Object get() {
        return this.F.get();
    }

    @Override // defpackage.j1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.F.isCancelled();
    }

    @Override // defpackage.j1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.F.isDone();
    }

    @Override // defpackage.j1
    public final String toString() {
        return this.F.toString();
    }

    @Override // defpackage.j1, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.F.get(j, timeUnit);
    }
}
