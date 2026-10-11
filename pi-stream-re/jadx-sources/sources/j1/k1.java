package j1;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class k1 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final f1.a f5817a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5818b;

    /* renamed from: c, reason: collision with root package name */
    public long f5819c;

    /* renamed from: d, reason: collision with root package name */
    public long f5820d;

    /* renamed from: e, reason: collision with root package name */
    public c1.t0 f5821e = c1.t0.f1893d;

    public k1(f1.a aVar) {
        this.f5817a = aVar;
    }

    public final void a(long j4) {
        this.f5819c = j4;
        if (this.f5818b) {
            ((f1.v) this.f5817a).getClass();
            this.f5820d = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (!this.f5818b) {
            ((f1.v) this.f5817a).getClass();
            this.f5820d = SystemClock.elapsedRealtime();
            this.f5818b = true;
        }
    }

    @Override // j1.o0
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // j1.o0
    public final c1.t0 h() {
        return this.f5821e;
    }

    @Override // j1.o0
    public final void j(c1.t0 t0Var) {
        if (this.f5818b) {
            a(k());
        }
        this.f5821e = t0Var;
    }

    @Override // j1.o0
    public final long k() {
        long j4;
        long j10 = this.f5819c;
        if (this.f5818b) {
            ((f1.v) this.f5817a).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5820d;
            if (this.f5821e.f1894a == 1.0f) {
                j4 = f1.b0.O(elapsedRealtime);
            } else {
                j4 = elapsedRealtime * r4.f1896c;
            }
            return j10 + j4;
        }
        return j10;
    }
}
