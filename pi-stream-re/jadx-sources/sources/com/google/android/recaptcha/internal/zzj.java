package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p7.d0;
import p7.k1;

/* loaded from: classes.dex */
public final class zzj {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Task zza(d0 d0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        ((k1) d0Var).F(false, true, new zzi(taskCompletionSource, d0Var));
        return taskCompletionSource.getTask();
    }
}
