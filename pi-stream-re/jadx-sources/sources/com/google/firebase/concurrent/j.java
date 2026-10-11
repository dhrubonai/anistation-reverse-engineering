package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f3002b;

    public /* synthetic */ j(Runnable runnable, int i10) {
        this.f3001a = i10;
        this.f3002b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$submit$1;
        Object lambda$submit$12;
        int i10 = this.f3001a;
        Runnable runnable = this.f3002b;
        switch (i10) {
            case 0:
                lambda$submit$12 = LimitedConcurrencyExecutorService.lambda$submit$1(runnable);
                return lambda$submit$12;
            default:
                lambda$submit$1 = PausableExecutorServiceImpl.lambda$submit$1(runnable);
                return lambda$submit$1;
        }
    }
}
