package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzxe implements zzwz<KeyFactory> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzwz
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
