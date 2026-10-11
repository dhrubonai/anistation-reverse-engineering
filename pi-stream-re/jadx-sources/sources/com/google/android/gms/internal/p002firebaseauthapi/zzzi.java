package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzi implements zzadm<zzafm> {
    final /* synthetic */ zzacf zza;
    final /* synthetic */ zzyl zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;

    public zzzi(zzyl zzylVar, String str, String str2, zzacf zzacfVar) {
        this.zzc = str;
        this.zzd = str2;
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
        zzagz zzagzVar = new zzagz(zzafmVar.zzc(), this.zzc, this.zzd);
        zzadkVar = this.zzb.zza;
        zzadkVar.zza(zzagzVar, new zzzl(this));
    }
}
