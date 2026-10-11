package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzic;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzxm implements zzrv {
    private static final zzic.zza zza = zzic.zza.zzb;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    public zzxm(String str, Key key) {
        zzxl zzxlVar = new zzxl(this);
        this.zzb = zzxlVar;
        if (zza.zza()) {
            this.zzc = str;
            this.zzd = key;
            if (key.getEncoded().length >= 16) {
                str.getClass();
                char c6 = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c6 = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c6 = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c6 = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c6 = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c6 = 4;
                            break;
                        }
                        break;
                }
                switch (c6) {
                    case 0:
                        this.zze = 20;
                        break;
                    case 1:
                        this.zze = 28;
                        break;
                    case 2:
                        this.zze = 32;
                        break;
                    case 3:
                        this.zze = 48;
                        break;
                    case 4:
                        this.zze = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                zzxlVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrv
    public final byte[] zza(byte[] bArr, int i10) {
        if (i10 <= this.zze) {
            this.zzb.get().update(bArr);
            return Arrays.copyOf(this.zzb.get().doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
