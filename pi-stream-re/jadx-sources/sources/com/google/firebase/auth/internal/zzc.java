package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzc implements OnFailureListener {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzc(zzb zzbVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = zzb.zza;
        Log.e(str, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Failing open with a fake token.");
        this.zza.setResult(new zzm().zzb("NO_RECAPTCHA").zza());
    }
}
