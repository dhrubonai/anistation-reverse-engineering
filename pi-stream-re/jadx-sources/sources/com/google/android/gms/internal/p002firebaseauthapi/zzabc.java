package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabc extends zzacw<Void, zzl> {
    private final zzye zzy;

    public zzabc(PhoneAuthCredential phoneAuthCredential, String str) {
        super(2);
        if (phoneAuthCredential != null) {
            phoneAuthCredential.zza(false);
            this.zzy = new zzye(phoneAuthCredential, str);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithPhoneCredential";
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
