package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzqt implements zzcf {
    private final zzch<zzcf> zza;
    private final zzrp zzb;
    private final zzrp zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcf
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (zzcm<zzcf> zzcmVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
                try {
                    zzcmVar.zze().zza(bArr, bArr2);
                    this.zzc.zza(zzcmVar.zza(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (zzcm<zzcf> zzcmVar2 : this.zza.zze()) {
                try {
                    zzcmVar2.zze().zza(bArr, bArr2);
                    this.zzc.zza(zzcmVar2.zza(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.zzc.zza();
            throw new GeneralSecurityException("invalid MAC");
        }
        this.zzc.zza();
        throw new GeneralSecurityException("tag too short");
    }

    private zzqt(zzch<zzcf> zzchVar) {
        this.zza = zzchVar;
        if (zzchVar.zzf()) {
            zzrq zzb = zzno.zza().zzb();
            zzrs zza = zzng.zza(zzchVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            this.zzc = zzb.zza(zza, "mac", "verify");
            return;
        }
        zzrp zzrpVar = zzng.zza;
        this.zzb = zzrpVar;
        this.zzc = zzrpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcf
    public final byte[] zza(byte[] bArr) {
        try {
            byte[] zza = this.zza.zza().zze().zza(bArr);
            this.zzb.zza(this.zza.zza().zza(), bArr.length);
            return zza;
        } catch (GeneralSecurityException e10) {
            this.zzb.zza();
            throw e10;
        }
    }
}
