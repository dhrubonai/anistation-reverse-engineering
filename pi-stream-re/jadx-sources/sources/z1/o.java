package z1;

import android.os.Looper;
import android.os.SystemClock;
import f1.b0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class o implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final i f11939d = c(-9223372036854775807L, false);

    /* renamed from: e, reason: collision with root package name */
    public static final i f11940e = new i(2, -9223372036854775807L, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final i f11941f = new i(3, -9223372036854775807L, 0);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11942a;

    /* renamed from: b, reason: collision with root package name */
    public k f11943b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f11944c;

    public o(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i10 = b0.f3799a;
        this.f11942a = Executors.newSingleThreadExecutor(new q0.a(concat, 1));
    }

    public static i c(long j4, boolean z9) {
        return new i(z9 ? 1 : 0, j4, 0);
    }

    public final void a() {
        k kVar = this.f11943b;
        w7.b.w(kVar);
        kVar.a(false);
    }

    @Override // z1.p
    public final void b() {
        IOException iOException;
        IOException iOException2 = this.f11944c;
        if (iOException2 == null) {
            k kVar = this.f11943b;
            if (kVar != null && (iOException = kVar.f11934e) != null && kVar.f11935f > kVar.f11930a) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final boolean d() {
        if (this.f11944c != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f11943b != null) {
            return true;
        }
        return false;
    }

    public final void f(m mVar) {
        k kVar = this.f11943b;
        if (kVar != null) {
            kVar.a(true);
        }
        ExecutorService executorService = this.f11942a;
        if (mVar != null) {
            executorService.execute(new g.f(mVar, 6));
        }
        executorService.shutdown();
    }

    public final long g(l lVar, j jVar, int i10) {
        Looper myLooper = Looper.myLooper();
        w7.b.w(myLooper);
        this.f11944c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new k(this, myLooper, lVar, jVar, i10, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
