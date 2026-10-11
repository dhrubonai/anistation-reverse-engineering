package u7;

import java.util.concurrent.Executor;
import p7.u0;
import p7.w;
import r6.h0;
import t7.y;

/* loaded from: classes.dex */
public final class c extends u0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f10313c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final w f10314d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [t7.k] */
    static {
        k kVar = k.f10329c;
        int i10 = y.f10092a;
        if (64 >= i10) {
            i10 = 64;
        }
        int U0 = h0.U0("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        kVar.getClass();
        com.bumptech.glide.d.l(U0);
        if (U0 < j.f10324d) {
            com.bumptech.glide.d.l(U0);
            kVar = new t7.k(kVar, U0);
        }
        f10314d = kVar;
    }

    @Override // p7.w
    public final void G(z6.i iVar, Runnable runnable) {
        f10314d.G(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        G(z6.j.f12080a, runnable);
    }

    @Override // p7.w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
