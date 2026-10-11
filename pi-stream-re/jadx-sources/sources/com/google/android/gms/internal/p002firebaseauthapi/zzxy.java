package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes.dex */
public final class zzxy {
    private final String zza;
    private final PhoneAuthCredential zzb;

    public zzxy(String str, PhoneAuthCredential phoneAuthCredential) {
        this.zza = str;
        this.zzb = phoneAuthCredential;
    }

    public final PhoneAuthCredential zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
