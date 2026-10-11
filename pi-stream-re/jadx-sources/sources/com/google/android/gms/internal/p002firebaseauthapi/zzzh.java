package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzh implements zzadm<zzafm> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzzh(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        zzafm zzafmVar2 = zzafmVar;
        zzagb zzagbVar = new zzagb();
        zzagbVar.zzd(zzafmVar2.zzc()).zzc(null).zzf(null);
        zzyl.zza(this.zzb, this.zza, zzafmVar2, zzagbVar, this);
    }
}
