package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l88 extends AbstractOwnableSynchronizer implements Runnable {
    public final u88 x;

    public /* synthetic */ l88(u88 u88Var) {
        this.x = u88Var;
    }

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.x.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
