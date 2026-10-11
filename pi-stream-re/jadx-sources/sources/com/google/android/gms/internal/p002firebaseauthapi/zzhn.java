package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzic;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzhn {
    private static final zzic.zza zza = zzic.zza.zzb;
    private static final ThreadLocal<Cipher> zzb = new zzhm();
    private final SecretKey zzc;
    private final boolean zzd;

    public zzhn(byte[] bArr, boolean z9) {
        if (zza.zza()) {
            zzxq.zza(bArr.length);
            this.zzc = new SecretKeySpec(bArr, "AES");
            this.zzd = z9;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    private static AlgorithmParameterSpec zza(byte[] bArr) {
        int length = bArr.length;
        Integer zzb2 = zzpg.zzb();
        if (zzb2 != null && zzb2.intValue() <= 19) {
            return new IvParameterSpec(bArr, 0, length);
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length;
        int i10;
        if (bArr.length == 12) {
            if (bArr2.length <= 2147483619) {
                boolean z9 = this.zzd;
                if (z9) {
                    length = bArr2.length + 12;
                } else {
                    length = bArr2.length;
                }
                byte[] bArr4 = new byte[length + 16];
                if (z9) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec zza2 = zza(bArr);
                ThreadLocal<Cipher> threadLocal = zzb;
                threadLocal.get().init(1, this.zzc, zza2);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                if (this.zzd) {
                    i10 = 12;
                } else {
                    i10 = 0;
                }
                int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, i10);
                if (doFinal == bArr2.length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            boolean z9 = this.zzd;
            if (bArr2.length >= (z9 ? 28 : 16)) {
                if (z9 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec zza2 = zza(bArr);
                ThreadLocal<Cipher> threadLocal = zzb;
                threadLocal.get().init(2, this.zzc, zza2);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                boolean z10 = this.zzd;
                return threadLocal.get().doFinal(bArr2, z10 ? 12 : 0, z10 ? bArr2.length - 12 : bArr2.length);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
