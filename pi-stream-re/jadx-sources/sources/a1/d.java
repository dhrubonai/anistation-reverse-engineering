package a1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f26a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.f26a.getAndIncrement());
    }
}
