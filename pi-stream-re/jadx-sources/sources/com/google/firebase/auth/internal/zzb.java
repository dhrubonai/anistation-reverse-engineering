package com.google.firebase.auth.internal;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzadq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.gms.internal.p002firebaseauthapi.zzafi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;

/* loaded from: classes.dex */
public class zzb {
    private static final String zza = "zzb";
    private static final zzb zzb = new zzb();
    private String zzc;

    private zzb() {
    }

    public final Task<zzj> zza(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z9, boolean z10, boolean z11, final RecaptchaAction recaptchaAction) {
        zzac zzacVar = (zzac) firebaseAuth.getFirebaseAuthSettings();
        final zzce zzc = zzce.zzc();
        if (!zzaec.zza(firebaseAuth.getApp()) && !zzacVar.zze()) {
            String str2 = zza;
            Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z10 + ", ForceRecaptchav2Flow from firebaseSettings = " + zzacVar.zzc());
            boolean z12 = z10 || zzacVar.zzc();
            final TaskCompletionSource<zzj> taskCompletionSource = new TaskCompletionSource<>();
            Task<String> zzb2 = zzc.zzb();
            if (zzb2 != null) {
                if (zzb2.isSuccessful()) {
                    return Tasks.forResult(new zzm().zzc(zzb2.getResult()).zza());
                }
                Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + zzb2.getException().getMessage());
                Log.e(str2, "Continuing with application verification as normal");
            }
            if (!z12) {
                final boolean z13 = false;
                firebaseAuth.initializeRecaptchaConfig().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zza
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        zzb.this.zza(taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z9, z13, zzc, task);
                    }
                });
            } else {
                zza(firebaseAuth, str, activity, z9, true, zzc, taskCompletionSource);
            }
            return taskCompletionSource.getTask();
        }
        return Tasks.forResult(new zzm().zza());
    }

    public static zzb zza() {
        return zzb;
    }

    private final void zza(FirebaseAuth firebaseAuth, zzce zzceVar, Activity activity, TaskCompletionSource<zzj> taskCompletionSource) {
        Task<String> task;
        if (activity == null) {
            taskCompletionSource.setException(new FirebaseAuthMissingActivityForRecaptchaException());
            return;
        }
        zzbl.zza(firebaseAuth.getApp().getApplicationContext(), firebaseAuth);
        TaskCompletionSource<String> taskCompletionSource2 = new TaskCompletionSource<>();
        if (!zzax.zza().zza(activity, taskCompletionSource2)) {
            task = Tasks.forException(zzach.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            new zzadq(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        }
        task.addOnSuccessListener(new zzg(this, taskCompletionSource)).addOnFailureListener(new zzh(this, taskCompletionSource));
    }

    public final /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, zzce zzceVar, Activity activity, Task task) {
        if ((!task.isSuccessful() || task.getResult() == null || TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) ? false : true) {
            taskCompletionSource.setResult(new zzm().zza(((IntegrityTokenResponse) task.getResult()).token()).zza());
            return;
        }
        String message = task.getException() == null ? "" : task.getException().getMessage();
        Log.e(zza, "Play Integrity Token fetch failed, falling back to Recaptcha" + message);
        zza(firebaseAuth, zzceVar, activity, taskCompletionSource);
    }

    public final /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z9, boolean z10, zzce zzceVar, Task task) {
        if (!task.isSuccessful()) {
            Log.e(zza, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.zzb() != null && firebaseAuth.zzb().zza("PHONE_PROVIDER")) {
            firebaseAuth.zzb().zza(firebaseAuth.getTenantId(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new zzf(this, taskCompletionSource)).addOnFailureListener(new zzc(this, taskCompletionSource));
        } else {
            zza(firebaseAuth, str, activity, z9, z10, zzceVar, (TaskCompletionSource<zzj>) taskCompletionSource);
        }
    }

    private final void zza(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z9, boolean z10, final zzce zzceVar, final TaskCompletionSource<zzj> taskCompletionSource) {
        Task<zzafi> zza2;
        if (z9 && !z10) {
            IntegrityManager create = IntegrityManagerFactory.create(firebaseAuth.getApp().getApplicationContext());
            if (!TextUtils.isEmpty(this.zzc)) {
                zza2 = Tasks.forResult(new zzafi(this.zzc));
            } else {
                zza2 = firebaseAuth.zza();
            }
            zza2.continueWithTask(firebaseAuth.zzf(), new zze(this, str, create)).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zzd
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    zzb.this.zza(taskCompletionSource, firebaseAuth, zzceVar, activity, task);
                }
            });
            return;
        }
        zza(firebaseAuth, zzceVar, activity, taskCompletionSource);
    }

    public static boolean zza(Exception exc) {
        if (exc instanceof FirebaseAuthMissingActivityForRecaptchaException) {
            return true;
        }
        return (exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).getErrorCode().endsWith("UNAUTHORIZED_DOMAIN");
    }
}
