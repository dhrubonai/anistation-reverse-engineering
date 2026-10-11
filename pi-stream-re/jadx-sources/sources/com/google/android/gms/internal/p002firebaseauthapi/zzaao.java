package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaao extends zzacw<AuthResult, zzl> {
    private final String zzaa;
    private final MultiFactorAssertion zzy;
    private final String zzz;

    public zzaao(MultiFactorAssertion multiFactorAssertion, String str, String str2) {
        super(2);
        b.s(multiFactorAssertion);
        this.zzy = multiFactorAssertion;
        b.o(str);
        this.zzz = str;
        this.zzaa = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        zzaf zza = zzaag.zza(this.zzc, this.zzk);
        FirebaseUser firebaseUser = this.zzd;
        if (firebaseUser != null && !firebaseUser.getUid().equalsIgnoreCase(zza.getUid())) {
            zza(new Status(FirebaseError.ERROR_USER_MISMATCH, null));
        } else {
            ((zzl) this.zze).zza(this.zzj, zza);
            zzb(new zzz(zza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzz, this.zzy, this.zzaa, this.zzb);
    }
}
