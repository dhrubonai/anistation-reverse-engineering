package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a70 extends s0 {
    public final Thread B;
    public final mw1 C;

    public a70(l11 l11Var, Thread thread, mw1 mw1Var) {
        super(l11Var, true, true);
        this.B = thread;
        this.C = mw1Var;
    }

    @Override // defpackage.t43
    public final void m(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.B;
        if (!a34.i(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
