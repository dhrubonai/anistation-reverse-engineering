package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzcv {
    public static zzci zza(byte[] bArr) {
        try {
            zzvd zza = zzvd.zza(bArr, zzaip.zza());
            zznv zza2 = zznv.zza();
            zzos zza3 = zzos.zza(zza);
            if (!zza2.zzb(zza3)) {
                return new zzne(zza3);
            }
            return zza2.zza((zznv) zza3);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zza(zzci zzciVar) {
        if (zzciVar instanceof zzne) {
            return ((zzne) zzciVar).zzb().zza().zzj();
        }
        return ((zzos) zznv.zza().zza((zznv) zzciVar, zzos.class)).zza().zzj();
    }
}
