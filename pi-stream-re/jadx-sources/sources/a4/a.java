package a4;

import androidx.appcompat.widget.j;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import w1.o;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f82a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83b;

    /* renamed from: c, reason: collision with root package name */
    public final b f84c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f85d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f86e;

    public a(x3.a aVar, String str, boolean z9) {
        o oVar = b.f87g;
        this.f86e = new AtomicInteger();
        this.f82a = aVar;
        this.f83b = str;
        this.f84c = oVar;
        this.f85d = z9;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f82a.newThread(new j(5, this, runnable));
        newThread.setName("glide-" + this.f83b + "-thread-" + this.f86e.getAndIncrement());
        return newThread;
    }
}
