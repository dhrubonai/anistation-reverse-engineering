package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class v0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f2474b;

    public v0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f2474b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void a(Status status) {
        this.f2474b.trySetException(new com.google.android.gms.common.api.j(status));
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void b(RuntimeException runtimeException) {
        this.f2474b.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void c(g0 g0Var) {
        try {
            h(g0Var);
        } catch (DeadObjectException e10) {
            a(b1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(b1.e(e11));
        } catch (RuntimeException e12) {
            this.f2474b.trySetException(e12);
        }
    }

    public abstract void h(g0 g0Var);
}
