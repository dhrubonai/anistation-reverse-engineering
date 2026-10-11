package a1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadPoolExecutor f8y;

    /* renamed from: z, reason: collision with root package name */
    public static h f9z;

    /* renamed from: a, reason: collision with root package name */
    public final e f10a;

    /* renamed from: b, reason: collision with root package name */
    public final f f11b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f12c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f14e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f15f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f16x;

    static {
        d dVar = new d();
        f8y = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), dVar);
    }

    public a(b bVar) {
        this.f16x = bVar;
        e eVar = new e(this);
        this.f10a = eVar;
        this.f11b = new f(this, eVar);
        this.f15f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        h hVar;
        synchronized (a.class) {
            if (f9z == null) {
                f9z = new h();
            }
            hVar = f9z;
        }
        hVar.obtainMessage(1, new g(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16x.b();
    }
}
