package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaas extends zzacw<AuthResult, zzl> {
    private final EmailAuthCredential zzy;
    private final String zzz;

    public zzaas(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        if (emailAuthCredential != null) {
            this.zzy = emailAuthCredential;
            b.n("email cannot be null", emailAuthCredential.zzc());
            b.n("password cannot be null", emailAuthCredential.zzd());
            this.zzz = str;
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "linkEmailAuthCredential";
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
        String zzc = this.zzy.zzc();
        String zzd = this.zzy.zzd();
        b.o(zzd);
        zzaceVar.zza(zzc, zzd, this.zzd.zze(), this.zzd.getTenantId(), this.zzz, this.zzb);
    }
}
