package k9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import r6.h0;

/* loaded from: classes.dex */
public class e extends y {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f6510h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f6511i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f6512j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f6513k;

    /* renamed from: l, reason: collision with root package name */
    public static e f6514l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6515e;

    /* renamed from: f, reason: collision with root package name */
    public e f6516f;

    /* renamed from: g, reason: collision with root package name */
    public long f6517g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f6510h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        h0.s(newCondition, "newCondition(...)");
        f6511i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f6512j = millis;
        f6513k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j4 = this.f6561c;
        boolean z9 = this.f6559a;
        if (j4 == 0 && !z9) {
            return;
        }
        ReentrantLock reentrantLock = f6510h;
        reentrantLock.lock();
        try {
            if (!this.f6515e) {
                this.f6515e = true;
                if (f6514l == null) {
                    f6514l = new e();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j4 != 0 && z9) {
                    this.f6517g = Math.min(j4, c() - nanoTime) + nanoTime;
                } else if (j4 != 0) {
                    this.f6517g = j4 + nanoTime;
                } else if (z9) {
                    this.f6517g = c();
                } else {
                    throw new AssertionError();
                }
                long j10 = this.f6517g - nanoTime;
                e eVar2 = f6514l;
                h0.q(eVar2);
                while (true) {
                    eVar = eVar2.f6516f;
                    if (eVar == null || j10 < eVar.f6517g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f6516f = eVar;
                eVar2.f6516f = this;
                if (eVar2 == f6514l) {
                    f6511i.signal();
                }
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f6510h;
        reentrantLock.lock();
        try {
            if (!this.f6515e) {
                return false;
            }
            this.f6515e = false;
            e eVar = f6514l;
            while (eVar != null) {
                e eVar2 = eVar.f6516f;
                if (eVar2 == this) {
                    eVar.f6516f = this.f6516f;
                    this.f6516f = null;
                    return false;
                }
                eVar = eVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
