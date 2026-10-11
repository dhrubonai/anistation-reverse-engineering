package j1;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f5697a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f5698b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.a f5699c;

    /* renamed from: d, reason: collision with root package name */
    public int f5700d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5701e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f5702f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5703g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5704h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5705i;

    public d1(j0 j0Var, c1 c1Var, c1.e1 e1Var, int i10, f1.a aVar, Looper looper) {
        this.f5698b = j0Var;
        this.f5697a = c1Var;
        this.f5702f = looper;
        this.f5699c = aVar;
    }

    public final synchronized void a(long j4) {
        boolean z9;
        boolean z10;
        w7.b.u(this.f5703g);
        if (this.f5702f.getThread() != Thread.currentThread()) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        ((f1.v) this.f5699c).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j4;
        while (true) {
            z10 = this.f5705i;
            if (z10 || j4 <= 0) {
                break;
            }
            this.f5699c.getClass();
            wait(j4);
            ((f1.v) this.f5699c).getClass();
            j4 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z9) {
        this.f5704h = z9 | this.f5704h;
        this.f5705i = true;
        notifyAll();
    }

    public final void c() {
        w7.b.u(!this.f5703g);
        this.f5703g = true;
        j0 j0Var = this.f5698b;
        synchronized (j0Var) {
            if (!j0Var.P && j0Var.A.getThread().isAlive()) {
                j0Var.f5806y.a(14, this).a();
                return;
            }
            f1.o.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
