package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class zzkv implements zzla {
    private final int zza;

    public zzkv(int i10) {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(g.n("Unsupported key length: ", i10));
        }
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final byte[] zzc() {
        int i10 = this.zza;
        if (i10 != 16) {
            if (i10 == 32) {
                return zzlq.zzj;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzlq.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == this.zza) {
            return new zzhn(bArr, false).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(g.n("Unexpected key length: ", bArr.length));
    }
}
