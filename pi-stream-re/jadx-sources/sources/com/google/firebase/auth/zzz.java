package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzz implements Continuation<RecaptchaTasksClient, Task<Void>> {
    public zzz(FirebaseAuth firebaseAuth) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<RecaptchaTasksClient> task) {
        String str;
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        if (exception != null) {
            str = exception.getMessage();
        } else {
            str = "";
        }
        return Tasks.forException(new FirebaseAuthException("INTERNAL_ERROR", com.google.android.gms.internal.p002firebaseauthapi.zzah.zzb(str)));
    }
}
