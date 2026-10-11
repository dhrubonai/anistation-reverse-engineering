package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import r.f;

/* loaded from: classes.dex */
public final class zzlq {
    private static final byte[] zzn;
    private static final byte[] zzo;
    private static final byte[] zzp;
    public static final byte[] zza = zza(1, 0);
    private static final byte[] zzm = zza(1, 2);
    public static final byte[] zzb = zza(2, 32);
    public static final byte[] zzc = zza(2, 16);
    public static final byte[] zzd = zza(2, 17);
    public static final byte[] zze = zza(2, 18);
    public static final byte[] zzf = zza(2, 1);
    public static final byte[] zzg = zza(2, 2);
    public static final byte[] zzh = zza(2, 3);
    public static final byte[] zzi = zza(2, 1);
    public static final byte[] zzj = zza(2, 2);
    public static final byte[] zzk = zza(2, 3);
    public static final byte[] zzl = new byte[0];

    static {
        Charset charset = zzpg.zza;
        zzn = "KEM".getBytes(charset);
        zzo = "HPKE".getBytes(charset);
        zzp = "HPKE-v1".getBytes(charset);
    }

    public static int zza(zzum zzumVar) {
        int i10 = zzlp.zza[zzumVar.ordinal()];
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 48;
        }
        if (i10 == 3) {
            return 66;
        }
        if (i10 == 4) {
            return 32;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int zzb(zzum zzumVar) {
        int i10 = zzlp.zza[zzumVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 32;
                    }
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                return 133;
            }
            return 97;
        }
        return 65;
    }

    public static zzwq zzc(zzum zzumVar) {
        int i10 = zzlp.zza[zzumVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return zzwq.NIST_P521;
                }
                throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
            }
            return zzwq.NIST_P384;
        }
        return zzwq.NIST_P256;
    }

    public static void zza(zzus zzusVar) {
        if (zzusVar.zzc() != zzum.KEM_UNKNOWN && zzusVar.zzc() != zzum.UNRECOGNIZED) {
            if (zzusVar.zzb() != zzuk.KDF_UNKNOWN && zzusVar.zzb() != zzuk.UNRECOGNIZED) {
                if (zzusVar.zza() == zzuj.AEAD_UNKNOWN || zzusVar.zza() == zzuj.UNRECOGNIZED) {
                    throw new GeneralSecurityException(f.d("Invalid AEAD param: ", zzusVar.zza().name()));
                }
                return;
            }
            throw new GeneralSecurityException(f.d("Invalid KDF param: ", zzusVar.zzb().name()));
        }
        throw new GeneralSecurityException(f.d("Invalid KEM param: ", zzusVar.zzc().name()));
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return zzwi.zza(zzo, bArr, bArr2, bArr3);
    }

    private static byte[] zza(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) (i11 >> (((i10 - i12) - 1) * 8));
        }
        return bArr;
    }

    public static byte[] zza(byte[] bArr) {
        return zzwi.zza(zzn, bArr);
    }

    public static byte[] zza(String str, byte[] bArr, byte[] bArr2) {
        return zzwi.zza(zzp, bArr2, str.getBytes(zzpg.zza), bArr);
    }

    public static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i10) {
        return zzwi.zza(zza(2, i10), zzp, bArr2, str.getBytes(zzpg.zza), bArr);
    }
}
