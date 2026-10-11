package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes.dex */
public final class zzadn {
    public static zzagx zza(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.zzd())) {
            return zzagx.zzb(phoneAuthCredential.zzb(), phoneAuthCredential.zzd(), phoneAuthCredential.zze());
        }
        return zzagx.zza(phoneAuthCredential.zzc(), phoneAuthCredential.getSmsCode(), phoneAuthCredential.zze());
    }
}
