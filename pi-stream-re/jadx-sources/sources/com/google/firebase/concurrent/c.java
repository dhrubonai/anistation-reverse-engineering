package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f2981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f2982c;

    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i10) {
        this.f2980a = i10;
        this.f2981b = runnable;
        this.f2982c = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2980a;
        DelegatingScheduledFuture.Completer completer = this.f2982c;
        Runnable runnable = this.f2981b;
        switch (i10) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(runnable, completer);
                return;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$0(runnable, completer);
                return;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(runnable, completer);
                return;
        }
    }
}
