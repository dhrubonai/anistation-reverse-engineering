package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzq extends zzbo<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzq(FirebaseAuth firebaseAuth, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        zzaag zzaagVar;
        FirebaseApp firebaseApp;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Creating user with " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + this.zza);
        }
        zzaagVar = this.zzc.zze;
        firebaseApp = this.zzc.zza;
        String str3 = this.zza;
        String str4 = this.zzb;
        str2 = this.zzc.zzk;
        return zzaagVar.zza(firebaseApp, str3, str4, str2, str, new FirebaseAuth.zzb());
    }
}
