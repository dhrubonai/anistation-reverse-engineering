package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f23 extends AbstractOwnableSynchronizer implements Runnable {
    public final gk6 x;

    public f23(gk6 gk6Var) {
        this.x = gk6Var;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.x.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
