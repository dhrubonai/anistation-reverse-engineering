package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import q6.g;
import w4.l;

/* loaded from: classes.dex */
final class zbav extends zbak {
    final /* synthetic */ TaskCompletionSource zba;

    public zbav(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbal
    public final void zbb(Status status, l lVar) {
        g.h0(status, lVar, this.zba);
    }
}
