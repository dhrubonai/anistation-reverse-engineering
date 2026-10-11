package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzic;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzrd implements zzpx {
    private static final zzic.zza zza = zzic.zza.zzb;
    private final zzqb zzb;

    public zzrd(zzqb zzqbVar) {
        if (zza.zza()) {
            this.zzb = zzqbVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
