package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ul7 extends Thread {
    public final WeakReference x;
    public final long y;
    public final CountDownLatch z = new CountDownLatch(1);
    public boolean A = false;

    public ul7(y6 y6Var, long j) {
        this.x = new WeakReference(y6Var);
        this.y = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        y6 y6Var;
        WeakReference weakReference = this.x;
        try {
            if (!this.z.await(this.y, TimeUnit.MILLISECONDS) && (y6Var = (y6) weakReference.get()) != null) {
                y6Var.b();
                this.A = true;
            }
        } catch (InterruptedException unused) {
            y6 y6Var2 = (y6) weakReference.get();
            if (y6Var2 != null) {
                y6Var2.b();
                this.A = true;
            }
        }
    }
}
