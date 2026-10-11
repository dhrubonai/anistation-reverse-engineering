package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import w7.b;

/* loaded from: classes.dex */
public abstract class zzbo<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> Task<T> zza(zzbx zzbxVar, RecaptchaAction recaptchaAction, String str, Continuation<String, Task<T>> continuation) {
        Task<String> zza = zzbxVar.zza(str, Boolean.FALSE, recaptchaAction);
        return zza.continueWithTask(continuation).continueWithTask(new zzbt(str, zzbxVar, recaptchaAction, continuation));
    }

    public abstract Task<T> zza(String str);

    public final Task<T> zza(final FirebaseAuth firebaseAuth, final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: com.google.firebase.auth.internal.zzbq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzbo zzboVar = zzbo.this;
                if (!task.isSuccessful()) {
                    Exception exception = task.getException();
                    b.s(exception);
                    Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception.getMessage() + "\n\n Failing open with a fake token.");
                    return zzboVar.zza("NO_RECAPTCHA");
                }
                return zzboVar.zza((String) task.getResult());
            }
        };
        zzbx zzb = firebaseAuth.zzb();
        if (zzb != null && zzb.zza(str2)) {
            return zza(zzb, recaptchaAction, str, continuation);
        }
        return (Task<T>) zza(null).continueWithTask(new Continuation() { // from class: com.google.firebase.auth.internal.zzbr
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzbo.zza(RecaptchaAction.this, firebaseAuth, str, continuation, task);
            }
        });
    }

    public static /* synthetic */ Task zza(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        b.s(exception);
        if (zzach.zzc(exception)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
            }
            if (firebaseAuth.zzb() == null) {
                firebaseAuth.zza(new zzbx(firebaseAuth.getApp(), firebaseAuth));
            }
            return zza(firebaseAuth.zzb(), recaptchaAction, str, continuation);
        }
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
        return Tasks.forException(exception);
    }
}
