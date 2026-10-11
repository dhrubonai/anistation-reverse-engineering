package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbz implements Continuation<RecaptchaTasksClient, Task<String>> {
    private final /* synthetic */ RecaptchaAction zza;

    public zzbz(zzbx zzbxVar, RecaptchaAction recaptchaAction) {
        this.zza = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.zza);
        }
        Exception exception = task.getException();
        b.s(exception);
        if (exception instanceof zzbu) {
            if (Log.isLoggable("RecaptchaHandler", 4)) {
                Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception.getMessage());
            }
            return Tasks.forResult("");
        }
        return Tasks.forException(exception);
    }
}
