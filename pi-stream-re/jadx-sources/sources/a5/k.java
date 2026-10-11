package a5;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static k f108b;

    /* renamed from: a, reason: collision with root package name */
    public final b f109a;

    public k(Context context) {
        b a10 = b.a(context);
        this.f109a = a10;
        a10.b();
        a10.c();
    }

    public static synchronized k a(Context context) {
        k c6;
        synchronized (k.class) {
            c6 = c(context.getApplicationContext());
        }
        return c6;
    }

    public static synchronized k c(Context context) {
        synchronized (k.class) {
            k kVar = f108b;
            if (kVar != null) {
                return kVar;
            }
            k kVar2 = new k(context);
            f108b = kVar2;
            return kVar2;
        }
    }

    public final synchronized void b() {
        b bVar = this.f109a;
        ReentrantLock reentrantLock = bVar.f96a;
        reentrantLock.lock();
        try {
            bVar.f97b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
