package d0;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class k implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final String f3034a = "fonts-androidx";

    /* renamed from: b, reason: collision with root package name */
    public final int f3035b = 10;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new j(runnable, this.f3034a, this.f3035b);
    }
}
