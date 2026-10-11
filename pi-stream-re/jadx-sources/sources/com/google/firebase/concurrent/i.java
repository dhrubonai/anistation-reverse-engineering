package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f2999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3000c;

    public /* synthetic */ i(Runnable runnable, Object obj, int i10) {
        this.f2998a = i10;
        this.f2999b = runnable;
        this.f3000c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f2998a;
        Object obj = this.f3000c;
        Runnable runnable = this.f2999b;
        switch (i10) {
            case 0:
                return LimitedConcurrencyExecutorService.c(runnable, obj);
            default:
                return PausableExecutorServiceImpl.a(runnable, obj);
        }
    }
}
