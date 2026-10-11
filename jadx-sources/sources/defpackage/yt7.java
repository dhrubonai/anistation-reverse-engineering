package defpackage;

import android.os.Process;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yt7 extends Thread {
    public final /* synthetic */ au7 A;
    public final Object x;
    public final BlockingQueue y;
    public boolean z = false;

    public yt7(au7 au7Var, String str, BlockingQueue blockingQueue) {
        this.A = au7Var;
        a34.x(blockingQueue);
        this.x = new Object();
        this.y = blockingQueue;
        setName(str);
    }

    public final void a() {
        au7 au7Var = this.A;
        synchronized (au7Var.F) {
            try {
                if (!this.z) {
                    au7Var.G.release();
                    au7Var.F.notifyAll();
                    if (this == au7Var.z) {
                        au7Var.z = null;
                    } else if (this == au7Var.A) {
                        au7Var.A = null;
                    } else {
                        es7 es7Var = ((gu7) au7Var.x).C;
                        gu7.l(es7Var);
                        es7Var.C.a("Current scheduler thread is neither worker nor network");
                    }
                    this.z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        boolean z = false;
        while (!z) {
            try {
                this.A.G.acquire();
                z = true;
            } catch (InterruptedException e) {
                es7 es7Var = ((gu7) this.A.x).C;
                gu7.l(es7Var);
                es7Var.F.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.y;
                wt7 wt7Var = (wt7) blockingQueue.poll();
                if (wt7Var != null) {
                    if (true != wt7Var.y) {
                        i = 10;
                    } else {
                        i = threadPriority;
                    }
                    Process.setThreadPriority(i);
                    wt7Var.run();
                } else {
                    Object obj = this.x;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.A.getClass();
                            try {
                                obj.wait(DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS);
                            } catch (InterruptedException e2) {
                                es7 es7Var2 = ((gu7) this.A.x).C;
                                gu7.l(es7Var2);
                                es7Var2.F.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.A.F) {
                        if (this.y.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
