package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class zzxi implements zzwz<Signature> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzwz
    public final /* synthetic */ Signature zza(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
