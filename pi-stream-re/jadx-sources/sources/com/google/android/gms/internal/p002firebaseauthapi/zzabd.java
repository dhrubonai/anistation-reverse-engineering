package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabd extends zzacw<AuthResult, zzl> {
    private final String zzaa;
    private final String zzab;
    private final String zzy;
    private final String zzz;

    public zzabd(String str, String str2, String str3, String str4) {
        super(2);
        b.n("email cannot be null or empty", str);
        b.n("password cannot be null or empty", str2);
        this.zzy = str;
        this.zzz = str2;
        this.zzaa = str3;
        this.zzab = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "reauthenticateWithEmailPasswordWithData";
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
        zzaceVar.zzb(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzb);
    }
}
