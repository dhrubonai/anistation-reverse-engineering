package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import w7.b;

/* loaded from: classes.dex */
final class zzah implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ FirebaseUser zza;

    public zzah(FirebaseUser firebaseUser) {
        this.zza = firebaseUser;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) {
        GetTokenResult result = task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(this.zza.zza());
        String token = result.getToken();
        b.s(token);
        return firebaseAuth.zza((ActionCodeSettings) null, token);
    }
}
