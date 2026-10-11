package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzxd implements zzwz<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzwz
    public final /* synthetic */ KeyPairGenerator zza(String str, Provider provider) {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
