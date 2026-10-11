package k9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import r6.h0;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final x f6558d = new x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f6559a;

    /* renamed from: b, reason: collision with root package name */
    public long f6560b;

    /* renamed from: c, reason: collision with root package name */
    public long f6561c;

    public y a() {
        this.f6559a = false;
        return this;
    }

    public y b() {
        this.f6561c = 0L;
        return this;
    }

    public long c() {
        if (this.f6559a) {
            return this.f6560b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public y d(long j4) {
        this.f6559a = true;
        this.f6560b = j4;
        return this;
    }

    public boolean e() {
        return this.f6559a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f6559a && this.f6560b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public y g(long j4, TimeUnit timeUnit) {
        boolean z9;
        h0.u(timeUnit, "unit");
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            this.f6561c = timeUnit.toNanos(j4);
            return this;
        }
        throw new IllegalArgumentException(a3.g.q("timeout < 0: ", j4).toString());
    }
}
