package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f744d = new e(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f745a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f746b;

    /* renamed from: c, reason: collision with root package name */
    public e f747c;

    public e(Runnable runnable, Executor executor) {
        this.f745a = runnable;
        this.f746b = executor;
    }
}
