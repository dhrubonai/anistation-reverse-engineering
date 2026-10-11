package k9;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b extends Thread {
    public b() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        e m5;
        while (true) {
            try {
                reentrantLock = e.f6510h;
                reentrantLock.lock();
                try {
                    m5 = f9.x.m();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (m5 == e.f6514l) {
                e.f6514l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (m5 != null) {
                    m5.k();
                }
            }
        }
    }
}
