package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaby extends zzacw<Void, zzl> {
    private final UserProfileChangeRequest zzy;

    public zzaby(UserProfileChangeRequest userProfileChangeRequest) {
        super(2);
        if (userProfileChangeRequest != null) {
            this.zzy = userProfileChangeRequest;
            return;
        }
        throw new NullPointerException("request cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        ((zzl) this.zze).zza(this.zzj, zzaag.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzd.zze(), this.zzy, this.zzb);
    }
}
