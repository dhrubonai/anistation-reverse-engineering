package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzafj;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbx {
    Map<String, Task<RecaptchaTasksClient>> zza;
    FirebaseApp zzb;
    zzbs zzc;
    private zzafj zzd;
    private FirebaseAuth zze;

    public zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth) {
        this(firebaseApp, firebaseAuth, new zzbv());
    }

    private final Task<RecaptchaTasksClient> zzb(String str) {
        return this.zza.get(str);
    }

    private static String zzc(String str) {
        if (com.google.android.gms.internal.p002firebaseauthapi.zzah.zzc(str)) {
            return "*";
        }
        return str;
    }

    private zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth, zzbs zzbsVar) {
        this.zza = new HashMap();
        this.zzb = firebaseApp;
        this.zze = firebaseAuth;
        this.zzc = zzbsVar;
    }

    public final Task<String> zza(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String zzc = zzc(str);
        Task<RecaptchaTasksClient> zzb = zzb(zzc);
        if (bool.booleanValue() || zzb == null) {
            zzb = zza(zzc, bool);
        }
        return zzb.continueWithTask(new zzbz(this, recaptchaAction));
    }

    public final Task<RecaptchaTasksClient> zza(String str, Boolean bool) {
        Task<RecaptchaTasksClient> zzb;
        String zzc = zzc(str);
        return (bool.booleanValue() || (zzb = zzb(zzc)) == null) ? this.zze.zza("RECAPTCHA_ENTERPRISE").continueWithTask(new zzbw(this, zzc)) : zzb;
    }

    public final boolean zza(String str) {
        zzafj zzafjVar = this.zzd;
        return zzafjVar != null && zzafjVar.zzb(str);
    }
}
