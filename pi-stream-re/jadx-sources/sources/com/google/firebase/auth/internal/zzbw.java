package com.google.firebase.auth.internal;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;
import r.f;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbw implements Continuation<zzafj, Task<RecaptchaTasksClient>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzbx zzb;

    public zzbw(zzbx zzbxVar, String str) {
        this.zza = str;
        this.zzb = zzbxVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzafj> task) {
        String str;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            b.s(exception);
            String message = exception.getMessage();
            b.s(message);
            return Tasks.forException(new zzbu(message));
        }
        zzafj result = task.getResult();
        String zza = result.zza();
        if (com.google.android.gms.internal.p002firebaseauthapi.zzah.zzc(zza)) {
            return Tasks.forException(new zzbu(f.d("No Recaptcha Enterprise siteKey configured for tenant/project ", this.zza)));
        }
        List<String> zza2 = com.google.android.gms.internal.p002firebaseauthapi.zzac.zza('/').zza((CharSequence) zza);
        if (zza2.size() != 4) {
            str = null;
        } else {
            str = zza2.get(3);
        }
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(f.d("Invalid siteKey format ", zza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.zza);
        }
        this.zzb.zzd = result;
        zzbx zzbxVar = this.zzb;
        Task<RecaptchaTasksClient> zza3 = zzbxVar.zzc.zza((Application) zzbxVar.zzb.getApplicationContext(), str);
        this.zzb.zza.put(this.zza, zza3);
        return zza3;
    }
}
