package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class th6 implements Executor {
    public final Object A;
    public final Executor x;
    public final ArrayDeque y;
    public Runnable z;

    public th6(Executor executor) {
        executor.getClass();
        this.x = executor;
        this.y = new ArrayDeque();
        this.A = new Object();
    }

    public final void a() {
        synchronized (this.A) {
            Object poll = this.y.poll();
            Runnable runnable = (Runnable) poll;
            this.z = runnable;
            if (poll != null) {
                this.x.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.A) {
            this.y.offer(new sp5(runnable, this, (byte) 4));
            if (this.z == null) {
                a();
            }
        }
    }
}
