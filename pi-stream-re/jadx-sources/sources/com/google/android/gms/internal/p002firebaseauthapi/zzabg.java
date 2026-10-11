package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.internal.zzl;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabg extends zzacw<Void, zzl> {
    private final zzyb zzy;

    public zzabg(String str, ActionCodeSettings actionCodeSettings) {
        super(6);
        b.n("token cannot be null or empty", str);
        this.zzy = new zzyb(str, actionCodeSettings);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }
}
