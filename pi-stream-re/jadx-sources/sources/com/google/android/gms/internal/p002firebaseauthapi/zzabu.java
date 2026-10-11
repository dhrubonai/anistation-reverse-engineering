package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabu extends zzacw<AuthResult, zzl> {
    private String zzy;

    public zzabu(String str) {
        super(2);
        b.n("provider cannot be null or empty", str);
        this.zzy = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "unlinkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zza = zzaag.zza(this.zzc, this.zzk);
        ((zzl) this.zze).zza(this.zzj, zza);
        zzb(new zzz(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zzf(this.zzy, this.zzd.zze(), this.zzb);
    }
}
