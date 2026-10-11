package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aw2 implements ii3 {
    public static final aw2 y = new aw2(null);
    public static final cf3 z = new cf3(aw2.class);
    public final Object x;

    public aw2(Object obj) {
        this.x = obj;
    }

    @Override // defpackage.ii3
    public final void a(Runnable runnable, Executor executor) {
        io3.w(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            z.b().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.x;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.x + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.x;
    }
}
