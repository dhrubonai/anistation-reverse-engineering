package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, s4.c
    public final void zzc(boolean z9) {
        Status status;
        zzag zzagVar = this.zza;
        if (z9) {
            status = Status.f2356f;
        } else {
            status = zzal.zza;
        }
        zzagVar.setResult((zzag) new zzak(status));
    }
}
