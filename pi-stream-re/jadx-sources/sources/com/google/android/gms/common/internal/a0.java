package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a0 implements com.google.android.gms.common.api.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.q f2495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f2497c;

    public a0(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, androidx.lifecycle.q0 q0Var) {
        this.f2495a = basePendingResult;
        this.f2496b = taskCompletionSource;
        this.f2497c = q0Var;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        boolean d10 = status.d();
        TaskCompletionSource taskCompletionSource = this.f2496b;
        if (d10) {
            taskCompletionSource.setResult(this.f2497c.n(this.f2495a.await(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        taskCompletionSource.setException(p7.a0.s(status));
    }
}
