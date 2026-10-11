package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vt extends Thread {
    public final /* synthetic */ byte x = 1;

    public /* synthetic */ vt(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        yt p;
        switch (this.x) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                reentrantLock = yt.j;
                reentrantLock.lock();
                try {
                    p = nx7.p();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
            if (p == yt.i) {
                yt.i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (p != null) {
                    p.j();
                }
            }
        }
    }

    public /* synthetic */ vt(String str) {
        super(str);
    }

    public /* synthetic */ vt(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
