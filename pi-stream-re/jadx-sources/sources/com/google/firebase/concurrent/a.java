package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2974c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f2972a = i10;
        this.f2973b = obj;
        this.f2974c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2972a;
        Object obj = this.f2974c;
        Object obj2 = this.f2973b;
        switch (i10) {
            case 0:
                ((CustomThreadFactory) obj2).lambda$newThread$0((Runnable) obj);
                return;
            case 1:
                DelegatingScheduledExecutorService.l((Callable) obj2, (DelegatingScheduledFuture.Completer) obj);
                return;
            default:
                LimitedConcurrencyExecutor.a((LimitedConcurrencyExecutor) obj2, (Runnable) obj);
                return;
        }
    }
}
