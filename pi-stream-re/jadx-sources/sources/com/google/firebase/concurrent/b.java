package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f2976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2977c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2979e;

    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j4, TimeUnit timeUnit, int i10) {
        this.f2975a = i10;
        this.f2976b = delegatingScheduledExecutorService;
        this.f2979e = obj;
        this.f2977c = j4;
        this.f2978d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$schedule$2;
        ScheduledFuture lambda$schedule$5;
        int i10 = this.f2975a;
        Object obj = this.f2979e;
        switch (i10) {
            case 0:
                lambda$schedule$5 = this.f2976b.lambda$schedule$5((Callable) obj, this.f2977c, this.f2978d, completer);
                return lambda$schedule$5;
            default:
                lambda$schedule$2 = this.f2976b.lambda$schedule$2((Runnable) obj, this.f2977c, this.f2978d, completer);
                return lambda$schedule$2;
        }
    }
}
