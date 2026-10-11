package com.google.firebase.auth;

import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import w7.b;

/* loaded from: classes.dex */
final class zzv implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ FirebaseAuth zzb;

    public zzv(FirebaseAuth firebaseAuth, String str) {
        this.zza = str;
        this.zzb = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) {
        zzaag zzaagVar;
        String str;
        if (task.isSuccessful()) {
            zzaagVar = this.zzb.zze;
            String str2 = this.zza;
            String token = task.getResult().getToken();
            b.s(token);
            str = this.zzb.zzk;
            return zzaagVar.zza(str2, token, "apple.com", str);
        }
        Exception exception = task.getException();
        b.s(exception);
        return Tasks.forException(exception);
    }
}
