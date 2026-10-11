package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzu;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaai extends zzacw<ActionCodeResult, zzl> {
    private final String zzy;
    private final String zzz;

    public zzaai(String str, String str2) {
        super(4);
        b.n("code cannot be null or empty", str);
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "checkActionCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        zzb(new zzu(this.zzm));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zzd(this.zzy, this.zzz, this.zzb);
    }
}
