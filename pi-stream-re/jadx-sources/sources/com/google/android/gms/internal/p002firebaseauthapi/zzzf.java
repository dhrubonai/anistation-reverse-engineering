package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzf implements zzadm<zzafm> {
    final /* synthetic */ zzacf zza;
    final /* synthetic */ zzyl zzb;
    private final /* synthetic */ zzags zzc;

    public zzzf(zzyl zzylVar, zzags zzagsVar, zzacf zzacfVar) {
        this.zzc = zzagsVar;
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        zzadk zzadkVar;
        this.zzc.zzb(true);
        this.zzc.zza(zzafmVar.zzc());
        zzadkVar = this.zzb.zza;
        zzadkVar.zza(this.zzc, new zzze(this, this));
    }
}
