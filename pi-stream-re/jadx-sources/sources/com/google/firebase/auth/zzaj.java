package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import w7.b;

/* loaded from: classes.dex */
final class zzaj implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ ActionCodeSettings zza;
    private final /* synthetic */ FirebaseUser zzb;

    public zzaj(FirebaseUser firebaseUser, ActionCodeSettings actionCodeSettings) {
        this.zza = actionCodeSettings;
        this.zzb = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) {
        GetTokenResult result = task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(this.zzb.zza());
        ActionCodeSettings actionCodeSettings = this.zza;
        String token = result.getToken();
        b.s(token);
        return firebaseAuth.zza(actionCodeSettings, token);
    }
}
