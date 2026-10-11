package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zi5 implements Executor {
    public static final Logger C = Logger.getLogger(zi5.class.getName());
    public final Executor x;
    public final ArrayDeque y = new ArrayDeque();
    public int z = 1;
    public long A = 0;
    public final yc2 B = new yc2(this);

    public zi5(Executor executor) {
        a34.x(executor);
        this.x = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a34.x(runnable);
        synchronized (this.y) {
            int i = this.z;
            if (i != 4 && i != 3) {
                long j = this.A;
                boolean z = true;
                x85 x85Var = new x85(runnable, (byte) 1);
                this.y.add(x85Var);
                this.z = 2;
                try {
                    this.x.execute(this.B);
                    if (this.z == 2) {
                        synchronized (this.y) {
                            try {
                                if (this.A == j && this.z == 2) {
                                    this.z = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.y) {
                        try {
                            int i2 = this.z;
                            if ((i2 != 1 && i2 != 2) || !this.y.removeLastOccurrence(x85Var)) {
                                z = false;
                            }
                            if ((e instanceof RejectedExecutionException) && !z) {
                                return;
                            } else {
                                throw e;
                            }
                        } finally {
                        }
                    }
                }
            }
            this.y.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.x + "}";
    }
}
