package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyp implements zzadm<zzafm> {
    private final /* synthetic */ EmailAuthCredential zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzacf zzc;
    private final /* synthetic */ zzyl zzd;

    public zzyp(zzyl zzylVar, EmailAuthCredential emailAuthCredential, String str, zzacf zzacfVar) {
        this.zza = emailAuthCredential;
        this.zzb = str;
        this.zzc = zzacfVar;
        this.zzd = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzc.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        this.zzd.zza(new zzaeo(this.zza, zzafmVar.zzc(), this.zzb), this.zzc);
    }
}
