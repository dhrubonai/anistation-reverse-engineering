package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p7.a0;
import w4.a;

/* loaded from: classes.dex */
final class zbap extends zby {
    final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbz
    public final void zbb(Status status, a aVar) {
        if (status.d()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(a0.s(status));
        }
    }
}
