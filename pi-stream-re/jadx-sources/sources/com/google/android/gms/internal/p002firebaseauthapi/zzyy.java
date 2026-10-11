package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyy implements zzadm<zzaha> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzyy(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzaha zzahaVar) {
        zzaha zzahaVar2 = zzahaVar;
        this.zzb.zza(new zzafm(zzahaVar2.zzd(), zzahaVar2.zzb(), Long.valueOf(zzahaVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzahaVar2.zzf()), null, this.zza, this);
    }
}
