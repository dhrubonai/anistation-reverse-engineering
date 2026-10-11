package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaac implements zzadm<zzafm> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzacf zzb;
    private final /* synthetic */ zzyl zzc;

    public zzaac(zzyl zzylVar, String str, zzacf zzacfVar) {
        this.zza = str;
        this.zzb = zzacfVar;
        this.zzc = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzb.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        zzafm zzafmVar2 = zzafmVar;
        String zzc = zzafmVar2.zzc();
        zzagb zzagbVar = new zzagb();
        zzagbVar.zzd(zzc).zzf(this.zza);
        zzyl.zza(this.zzc, this.zzb, zzafmVar2, zzagbVar, this);
    }
}
