package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f2988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f2989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2992f;

    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j4, long j10, TimeUnit timeUnit, int i10) {
        this.f2987a = i10;
        this.f2988b = delegatingScheduledExecutorService;
        this.f2989c = runnable;
        this.f2990d = j4;
        this.f2991e = j10;
        this.f2992f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        ScheduledFuture lambda$scheduleAtFixedRate$8;
        ScheduledFuture lambda$scheduleWithFixedDelay$11;
        switch (this.f2987a) {
            case 0:
                lambda$scheduleWithFixedDelay$11 = this.f2988b.lambda$scheduleWithFixedDelay$11(this.f2989c, this.f2990d, this.f2991e, this.f2992f, completer);
                return lambda$scheduleWithFixedDelay$11;
            default:
                lambda$scheduleAtFixedRate$8 = this.f2988b.lambda$scheduleAtFixedRate$8(this.f2989c, this.f2990d, this.f2991e, this.f2992f, completer);
                return lambda$scheduleAtFixedRate$8;
        }
    }
}
