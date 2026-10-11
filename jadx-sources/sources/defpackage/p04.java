package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p04 extends m04 implements ScheduledExecutorService {
    public final ScheduledExecutorService y;

    public p04(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.y = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        hk6 hk6Var = new hk6(Executors.callable(runnable, null));
        return new n04(hk6Var, this.y.schedule(hk6Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        o04 o04Var = new o04(runnable);
        return new n04(o04Var, this.y.scheduleAtFixedRate(o04Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        o04 o04Var = new o04(runnable);
        return new n04(o04Var, this.y.scheduleWithFixedDelay(o04Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        hk6 hk6Var = new hk6(callable);
        return new n04(hk6Var, this.y.schedule(hk6Var, j, timeUnit));
    }
}
