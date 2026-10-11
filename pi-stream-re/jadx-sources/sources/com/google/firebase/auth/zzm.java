package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;
import r.f;
import w7.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzm implements OnCompleteListener<com.google.firebase.auth.internal.zzj> {
    private final /* synthetic */ PhoneAuthOptions zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzm(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, String str) {
        this.zza = phoneAuthOptions;
        this.zzb = str;
        this.zzc = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<com.google.firebase.auth.internal.zzj> task) {
        String zzc;
        String zza;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2;
        zzaag zzaagVar;
        String str;
        boolean z9;
        zzaag zzaagVar2;
        String str2;
        boolean z10;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            String str3 = "Error while validating application identity: ";
            if (exception != null) {
                str3 = f.d("Error while validating application identity: ", exception.getMessage());
            }
            Log.e("FirebaseAuth", str3);
            if (exception != null && com.google.firebase.auth.internal.zzb.zza(exception)) {
                FirebaseAuth.zza((FirebaseException) exception, this.zza, this.zzb);
                return;
            } else {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                zzc = null;
                zza = null;
            }
        } else {
            zzc = task.getResult().zzc();
            zza = task.getResult().zza();
        }
        long longValue = this.zza.zzg().longValue();
        zza2 = this.zzc.zza(this.zza.zzh(), this.zza.zze());
        if (TextUtils.isEmpty(zzc)) {
            zza2 = this.zzc.zza(this.zza, zza2);
        }
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks = zza2;
        MultiFactorSession zzc2 = this.zza.zzc();
        b.s(zzc2);
        com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) zzc2;
        if (zzamVar.zzd()) {
            zzaagVar2 = this.zzc.zze;
            String zzh = this.zza.zzh();
            b.s(zzh);
            str2 = this.zzc.zzi;
            if (this.zza.zzd() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzaagVar2.zza(zzamVar, zzh, str2, longValue, z10, this.zza.zzk(), zzc, zza, this.zzc.zzi(), onVerificationStateChangedCallbacks, this.zza.zzi(), this.zza.zza());
            return;
        }
        zzaagVar = this.zzc.zze;
        PhoneMultiFactorInfo zzf = this.zza.zzf();
        b.s(zzf);
        str = this.zzc.zzi;
        if (this.zza.zzd() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzaagVar.zza(zzamVar, zzf, str, longValue, z9, this.zza.zzk(), zzc, zza, this.zzc.zzi(), onVerificationStateChangedCallbacks, this.zza.zzi(), this.zza.zza());
    }
}
