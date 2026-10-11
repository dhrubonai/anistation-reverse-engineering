package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzzk implements zzadm<zzagu> {
    private final /* synthetic */ zzacf zza;
    private final /* synthetic */ zzyl zzb;

    public zzzk(zzyl zzylVar, zzacf zzacfVar) {
        this.zza = zzacfVar;
        this.zzb = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zza.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzagu zzaguVar) {
        zzagu zzaguVar2 = zzaguVar;
        if (!zzaguVar2.zzl()) {
            zzyl.zza(this.zzb, zzaguVar2, this.zza, this);
        } else {
            this.zza.zza(new zzyi(zzaguVar2.zzf(), zzaguVar2.zzk(), zzaguVar2.zzb()));
        }
    }
}
