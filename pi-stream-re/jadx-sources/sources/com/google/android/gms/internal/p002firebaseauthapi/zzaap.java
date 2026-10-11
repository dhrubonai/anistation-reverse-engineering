package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.internal.zzl;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaap extends zzacw<Void, zzl> {
    private final String zzaa;
    private final String zzab;
    private final MultiFactorAssertion zzy;
    private final String zzz;

    public zzaap(MultiFactorAssertion multiFactorAssertion, String str, String str2, String str3) {
        super(2);
        b.s(multiFactorAssertion);
        this.zzy = multiFactorAssertion;
        b.o(str);
        this.zzz = str;
        this.zzaa = str2;
        this.zzab = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        ((zzl) this.zze).zza(this.zzj, zzaag.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzb);
    }
}
