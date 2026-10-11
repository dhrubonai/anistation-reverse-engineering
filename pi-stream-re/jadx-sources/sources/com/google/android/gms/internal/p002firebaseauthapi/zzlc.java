package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import r.f;

/* loaded from: classes.dex */
final class zzlc implements zzbp {
    private static final byte[] zza = new byte[0];
    private final zzli zzb;
    private final zzlg zzc;
    private final zzld zzd;
    private final zzla zze;
    private final int zzf;
    private final byte[] zzg;

    private zzlc(zzli zzliVar, zzlg zzlgVar, zzld zzldVar, zzla zzlaVar, int i10, zzxr zzxrVar) {
        this.zzb = zzliVar;
        this.zzc = zzlgVar;
        this.zzd = zzldVar;
        this.zze = zzlaVar;
        this.zzf = i10;
        this.zzg = zzxrVar.zzb();
    }

    public static zzlc zza(zzut zzutVar) {
        int i10;
        zzli zza2;
        if (zzutVar.zzf()) {
            if (zzutVar.zzd().zzg()) {
                if (!zzutVar.zze().zze()) {
                    zzus zzb = zzutVar.zzd().zzb();
                    zzlg zzc = zzlh.zzc(zzb);
                    zzld zzb2 = zzlh.zzb(zzb);
                    zzla zza3 = zzlh.zza(zzb);
                    zzum zzc2 = zzb.zzc();
                    int i11 = zzlb.zza[zzc2.ordinal()];
                    if (i11 == 1) {
                        i10 = 32;
                    } else if (i11 == 2) {
                        i10 = 65;
                    } else if (i11 == 3) {
                        i10 = 97;
                    } else {
                        if (i11 != 4) {
                            throw new IllegalArgumentException(f.d("Unable to determine KEM-encoding length for ", zzc2.name()));
                        }
                        i10 = 133;
                    }
                    int i12 = zzlf.zza[zzutVar.zzd().zzb().zzc().ordinal()];
                    if (i12 == 1) {
                        zza2 = zzlw.zza(zzutVar.zze().zzg());
                    } else {
                        if (i12 != 2 && i12 != 3 && i12 != 4) {
                            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                        }
                        zza2 = zzlu.zza(zzutVar.zze().zzg(), zzutVar.zzd().zzf().zzg(), zzlq.zzc(zzutVar.zzd().zzb().zzc()));
                    }
                    return new zzlc(zza2, zzc, zzb2, zza3, i10, zzxr.zza(new byte[0]));
                }
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }

    private final byte[] zzb(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.zzf;
        if (length >= i10) {
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            return zzkz.zza(copyOf, this.zzb, this.zzc, this.zzd, this.zze, bArr3).zza(Arrays.copyOfRange(bArr, this.zzf, bArr.length), zza);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzg;
        if (bArr3.length == 0) {
            return zzb(bArr, bArr2);
        }
        if (zzpg.zza(bArr3, bArr)) {
            return zzb(Arrays.copyOfRange(bArr, this.zzg.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
