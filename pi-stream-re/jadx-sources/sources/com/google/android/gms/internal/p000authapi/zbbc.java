package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import w4.g;

/* loaded from: classes.dex */
final class zbbc extends zbab {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbc(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbac
    public final void zbb(Status status, g gVar) {
        q6.g.h0(status, gVar, this.zba);
    }
}
