package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzlt implements zzlg {
    private final zzkx zza;

    public zzlt(zzkx zzkxVar) {
        this.zza = zzkxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    public final byte[] zza(byte[] bArr, zzli zzliVar) {
        byte[] zza = zzxp.zza(zzliVar.zza().zzb(), bArr);
        byte[] zza2 = zzwi.zza(bArr, zzliVar.zzb().zzb());
        byte[] zza3 = zzlq.zza(zzlq.zzb);
        zzkx zzkxVar = this.zza;
        return zzkxVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzkxVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    public final byte[] zza() {
        if (Arrays.equals(this.zza.zzb(), zzlq.zzf)) {
            return zzlq.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
