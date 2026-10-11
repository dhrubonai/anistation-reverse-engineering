package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaay extends zzacw<Void, zzl> {
    private final zzyf zzy;

    public zzaay(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        if (emailAuthCredential != null) {
            this.zzy = new zzyf(emailAuthCredential, str);
            return;
        }
        throw new NullPointerException("Credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zza = zzaag.zza(this.zzc, this.zzk);
        if (this.zzd.getUid().equalsIgnoreCase(zza.getUid())) {
            ((zzl) this.zze).zza(this.zzj, zza);
            zzb(null);
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
