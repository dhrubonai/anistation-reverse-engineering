package com.google.firebase.auth;

import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzj implements OnCompleteListener<com.google.firebase.auth.internal.zzj> {
    private final /* synthetic */ PhoneAuthOptions zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzj(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, String str) {
        this.zza = phoneAuthOptions;
        this.zzb = str;
        this.zzc = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<com.google.firebase.auth.internal.zzj> task) {
        String zza;
        String str;
        String str2;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if (exception != null) {
                str2 = exception.getMessage();
            } else {
                str2 = "";
            }
            Log.e("FirebaseAuth", "Error while validating application identity: " + str2);
            if (exception != null && com.google.firebase.auth.internal.zzb.zza(exception)) {
                FirebaseAuth.zza((FirebaseException) exception, this.zza, this.zzb);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str = null;
                zza = null;
            }
        } else {
            String zzc = task.getResult().zzc();
            zza = task.getResult().zza();
            str = zzc;
        }
        this.zzc.zza(this.zza, str, zza);
    }
}
