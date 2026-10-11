package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzl;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabx extends zzacw<Void, zzl> {
    private final String zzy;

    public zzabx(String str) {
        super(2);
        b.n("email cannot be null or empty", str);
        this.zzy = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "updateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        ((zzl) this.zze).zza(this.zzj, zzaag.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zzb(this.zzd.zze(), this.zzy, this.zzb);
    }
}
