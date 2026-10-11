package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzqq {
    private static final String zza = "type.googleapis.com/google.crypto.tink.HmacKey";

    @Deprecated
    private static final zzvv zzb;

    @Deprecated
    private static final zzvv zzc;

    @Deprecated
    private static final zzvv zzd;

    static {
        zzvv zzb2 = zzvv.zzb();
        zzb = zzb2;
        zzc = zzb2;
        zzd = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() {
        zzqr.zzc();
        zzqa.zzc();
        zzqe.zza(true);
        if (zzic.zzb()) {
            return;
        }
        zzpm.zza(true);
    }
}
