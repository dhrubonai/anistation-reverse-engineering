package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzao;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaaa implements zzadm<zzafm> {
    private final /* synthetic */ UserProfileChangeRequest zza;
    private final /* synthetic */ zzacf zzb;
    private final /* synthetic */ zzyl zzc;

    public zzaaa(zzyl zzylVar, UserProfileChangeRequest userProfileChangeRequest, zzacf zzacfVar) {
        this.zza = userProfileChangeRequest;
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
        zzagb zzagbVar = new zzagb();
        zzagbVar.zzd(zzafmVar2.zzc());
        if (this.zza.zzb() || this.zza.getDisplayName() != null) {
            zzagbVar.zzb(this.zza.getDisplayName());
        }
        if (this.zza.zzc() || this.zza.getPhotoUri() != null) {
            zzagbVar.zzg(this.zza.zza());
        }
        zzyl.zza(this.zzc, this.zzb, zzafmVar2, zzagbVar, this);
    }
}
