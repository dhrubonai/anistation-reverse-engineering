package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p7.a0;
import w4.j;

/* loaded from: classes.dex */
final class zbau extends zbai {
    final /* synthetic */ TaskCompletionSource zba;

    public zbau(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbaj
    public final void zbb(Status status, j jVar) {
        if (status.d()) {
            this.zba.setResult(jVar);
        } else {
            this.zba.setException(a0.s(status));
        }
    }
}
