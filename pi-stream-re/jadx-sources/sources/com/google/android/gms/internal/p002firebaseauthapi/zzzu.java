package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzu implements zzadm<zzafm> {
    final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzzu(zzyl zzylVar, zzacf zzacfVar) {
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
        zzael zzaelVar = new zzael(zzafmVar.zzc());
        zzadkVar = this.zzb.zza;
        zzadkVar.zza(zzaelVar, new zzzx(this, this));
    }
}
