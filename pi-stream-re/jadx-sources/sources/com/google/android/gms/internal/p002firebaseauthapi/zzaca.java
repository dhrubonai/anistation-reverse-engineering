package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzu;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaca extends zzacw<String, zzl> {
    private final String zzy;
    private final String zzz;

    public zzaca(String str, String str2) {
        super(4);
        b.n("code cannot be null or empty", str);
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        if (new zzu(this.zzm).getOperation() != 0) {
            zza(new Status(FirebaseError.ERROR_INTERNAL_ERROR, null));
        } else {
            zzb(this.zzm.zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zzd(this.zzy, this.zzz, this.zzb);
    }
}
