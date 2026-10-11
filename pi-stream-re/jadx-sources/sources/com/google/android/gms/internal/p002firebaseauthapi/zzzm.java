package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzm implements zzadm<zzafm> {
    final /* synthetic */ zzacf zza;
    final /* synthetic */ zzyl zzb;
    private final /* synthetic */ zzaeq zzc;

    public zzzm(zzyl zzylVar, zzaeq zzaeqVar, zzacf zzacfVar) {
        this.zzc = zzaeqVar;
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
        this.zzc.zza(zzafmVar.zzc());
        zzadkVar = this.zzb.zza;
        zzadkVar.zza(this.zzc, new zzzp(this));
    }
}
