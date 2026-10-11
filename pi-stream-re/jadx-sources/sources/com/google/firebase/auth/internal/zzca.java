package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzca implements b {
    private final /* synthetic */ zzcb zza;

    public zzca(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.b
    public final void onBackgroundStateChanged(boolean z9) {
        boolean zzb;
        zzaq zzaqVar;
        if (z9) {
            this.zza.zzc = true;
            this.zza.zza();
            return;
        }
        this.zza.zzc = false;
        zzb = this.zza.zzb();
        if (zzb) {
            zzaqVar = this.zza.zzb;
            zzaqVar.zzc();
        }
    }
}
