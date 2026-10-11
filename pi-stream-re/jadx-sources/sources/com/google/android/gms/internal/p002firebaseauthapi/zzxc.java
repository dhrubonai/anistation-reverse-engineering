package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class zzxc implements zzwz<Cipher> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzwz
    public final /* synthetic */ Cipher zza(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
