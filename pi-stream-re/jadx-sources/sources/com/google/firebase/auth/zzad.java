package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcc;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzad extends zzbo<Void> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    public zzad(FirebaseAuth firebaseAuth, boolean z9, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z9;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        this.zzd = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<Void> zza(String str) {
        zzaag zzaagVar;
        FirebaseApp firebaseApp;
        zzaag zzaagVar2;
        FirebaseApp firebaseApp2;
        if (this.zza) {
            if (TextUtils.isEmpty(str)) {
                Log.i("FirebaseAuth", " Email link reauth with empty reCAPTCHA token");
            } else {
                Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with email link");
            }
            zzaagVar2 = this.zzd.zze;
            firebaseApp2 = this.zzd.zza;
            return zzaagVar2.zza(firebaseApp2, this.zzb, this.zzc, str, (zzcc) new FirebaseAuth.zza());
        }
        String zzc = this.zzc.zzc();
        String zzd = this.zzc.zzd();
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Reauthenticating " + zzc + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with " + zzc);
        }
        zzaagVar = this.zzd.zze;
        firebaseApp = this.zzd.zza;
        FirebaseUser firebaseUser = this.zzb;
        b.o(zzd);
        return zzaagVar.zza(firebaseApp, firebaseUser, zzc, zzd, this.zzb.getTenantId(), str, new FirebaseAuth.zza());
    }
}
