package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import q6.g;

/* loaded from: classes.dex */
final class zbbf extends zbae {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbf(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbaf
    public final void zbb(Status status, PendingIntent pendingIntent) {
        g.h0(status, pendingIntent, this.zba);
    }
}
