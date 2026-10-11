package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzac extends zzbo<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ FirebaseUser zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ FirebaseAuth zzf;

    public zzac(FirebaseAuth firebaseAuth, String str, boolean z9, FirebaseUser firebaseUser, String str2, String str3) {
        this.zza = str;
        this.zzb = z9;
        this.zzc = firebaseUser;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        zzaag zzaagVar;
        FirebaseApp firebaseApp;
        zzaag zzaagVar2;
        FirebaseApp firebaseApp2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Logging in as " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + this.zza);
        }
        if (this.zzb) {
            zzaagVar2 = this.zzf.zze;
            firebaseApp2 = this.zzf.zza;
            FirebaseUser firebaseUser = this.zzc;
            b.s(firebaseUser);
            return zzaagVar2.zzb(firebaseApp2, firebaseUser, this.zza, this.zzd, this.zze, str, new FirebaseAuth.zza());
        }
        zzaagVar = this.zzf.zze;
        firebaseApp = this.zzf.zza;
        return zzaagVar.zzb(firebaseApp, this.zza, this.zzd, this.zze, str, new FirebaseAuth.zzb());
    }
}
