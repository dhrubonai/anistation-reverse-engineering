package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.tasks.TaskCompletionSource;
import p7.a0;
import q6.g;

/* loaded from: classes.dex */
final class zzu extends i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onResult(Status status) {
        if (status.f2361b == 6) {
            this.zza.trySetException(a0.s(status));
        } else {
            g.h0(status, null, this.zza);
        }
    }
}
