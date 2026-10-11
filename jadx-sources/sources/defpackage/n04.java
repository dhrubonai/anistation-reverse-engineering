package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n04 extends x97 implements ScheduledFuture, ii3, Future {
    public final j1 G;
    public final ScheduledFuture H;

    public n04(j1 j1Var, ScheduledFuture scheduledFuture) {
        this.G = j1Var;
        this.H = scheduledFuture;
    }

    public final boolean Z(boolean z) {
        return this.G.cancel(z);
    }

    @Override // defpackage.ii3
    public final void a(Runnable runnable, Executor executor) {
        this.G.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean Z = Z(z);
        if (Z) {
            this.H.cancel(z);
        }
        return Z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.H.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.G.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.H.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.G.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.G.isDone();
    }

    @Override // defpackage.x97
    public final Object w() {
        return this.G;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.G.get(j, timeUnit);
    }
}
