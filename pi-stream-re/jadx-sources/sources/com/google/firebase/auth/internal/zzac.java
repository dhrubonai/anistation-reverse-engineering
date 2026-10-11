package com.google.firebase.auth.internal;

import com.google.firebase.auth.FirebaseAuthSettings;

/* loaded from: classes.dex */
public final class zzac extends FirebaseAuthSettings {
    private String zza;
    private String zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    @Override // com.google.firebase.auth.FirebaseAuthSettings
    public final void forceRecaptchaFlowForTesting(boolean z9) {
        this.zzd = z9;
    }

    @Override // com.google.firebase.auth.FirebaseAuthSettings
    public final void setAppVerificationDisabledForTesting(boolean z9) {
        this.zzc = z9;
    }

    @Override // com.google.firebase.auth.FirebaseAuthSettings
    public final void setAutoRetrievedSmsCodeForPhoneNumber(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        if (this.zza != null && this.zzb != null) {
            return true;
        }
        return false;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
