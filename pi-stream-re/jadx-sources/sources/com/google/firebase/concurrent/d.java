package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f2984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f2985c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f2986d;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i10) {
        this.f2983a = i10;
        this.f2984b = delegatingScheduledExecutorService;
        this.f2985c = runnable;
        this.f2986d = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2983a;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f2984b;
        DelegatingScheduledFuture.Completer completer = this.f2986d;
        Runnable runnable = this.f2985c;
        switch (i10) {
            case 0:
                delegatingScheduledExecutorService.lambda$scheduleAtFixedRate$7(runnable, completer);
                return;
            case 1:
                delegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$10(runnable, completer);
                return;
            default:
                delegatingScheduledExecutorService.lambda$schedule$1(runnable, completer);
                return;
        }
    }
}
