package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabb extends zzacw<AuthResult, zzl> {
    private final zzyf zzy;

    public zzabb(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        if (emailAuthCredential != null) {
            this.zzy = new zzyf(emailAuthCredential, str);
            return;
        }
        throw new NullPointerException("credential cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zza = zzaag.zza(this.zzc, this.zzk);
        if (this.zzd.getUid().equalsIgnoreCase(zza.getUid())) {
            ((zzl) this.zze).zza(this.zzj, zza);
            zzb(new zzz(zza));
        } else {
            zza(new Status(FirebaseError.ERROR_USER_MISMATCH, null));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
