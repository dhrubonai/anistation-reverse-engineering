package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.internal.zzar;
import com.google.firebase.auth.internal.zzl;
import java.util.List;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaam extends zzacw<SignInMethodQueryResult, zzl> {
    private final String zzy;
    private final String zzz;

    public zzaam(String str, String str2) {
        super(3);
        b.n("email cannot be null or empty", str);
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacw
    public final void zzb() {
        List<String> zza;
        if (this.zzl.zza() == null) {
            zza = zzaq.zzh();
        } else {
            zza = this.zzl.zza();
            b.s(zza);
        }
        zzb(new zzar(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zze(this.zzy, this.zzz, this.zzb);
    }
}
