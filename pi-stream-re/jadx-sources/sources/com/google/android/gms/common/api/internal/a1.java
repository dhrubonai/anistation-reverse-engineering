package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final class a1 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final w f2379b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f2380c;

    /* renamed from: d, reason: collision with root package name */
    public final t f2381d;

    public a1(int i10, w wVar, TaskCompletionSource taskCompletionSource, t tVar) {
        super(i10);
        this.f2380c = taskCompletionSource;
        this.f2379b = wVar;
        this.f2381d = tVar;
        if (i10 == 2 && wVar.f2476b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void a(Status status) {
        this.f2380c.trySetException(this.f2381d.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void b(RuntimeException runtimeException) {
        this.f2380c.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void c(g0 g0Var) {
        TaskCompletionSource taskCompletionSource = this.f2380c;
        try {
            w wVar = this.f2379b;
            ((s) ((s0) wVar).f2464d.f2472d).accept(g0Var.f2404b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(b1.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void d(z zVar, boolean z9) {
        Map map = (Map) zVar.f2485b;
        Boolean valueOf = Boolean.valueOf(z9);
        TaskCompletionSource taskCompletionSource = this.f2380c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new z(zVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final boolean f(g0 g0Var) {
        return this.f2379b.f2476b;
    }

    @Override // com.google.android.gms.common.api.internal.m0
    public final b5.c[] g(g0 g0Var) {
        return this.f2379b.f2475a;
    }
}
