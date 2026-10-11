package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabp extends zzacw<AuthResult, zzl> {
    private final zzyf zzy;

    public zzabp(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        if (emailAuthCredential != null) {
            this.zzy = new zzyf(emailAuthCredential, str);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "sendSignInLinkToEmail";
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
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
