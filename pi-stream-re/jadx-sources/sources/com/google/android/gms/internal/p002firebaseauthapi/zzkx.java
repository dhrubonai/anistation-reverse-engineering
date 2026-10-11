package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class zzkx implements zzld {
    private final String zza;

    public zzkx(String str) {
        this.zza = str;
    }

    public final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzld
    public final byte[] zzb() {
        String str = this.zza;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c6 = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c6 = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c6 = 2;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return zzlq.zzf;
            case 1:
                return zzlq.zzg;
            case 2:
                return zzlq.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i10) {
        Mac zza = zzwr.zzb.zza(this.zza);
        if (i10 <= zza.getMacLength() * 255) {
            byte[] bArr3 = new byte[i10];
            zza.init(new SecretKeySpec(bArr, this.zza));
            byte[] bArr4 = new byte[0];
            int i11 = 1;
            int i12 = 0;
            while (true) {
                zza.update(bArr4);
                zza.update(bArr2);
                zza.update((byte) i11);
                bArr4 = zza.doFinal();
                if (bArr4.length + i12 < i10) {
                    System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
                    i12 += bArr4.length;
                    i11++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i12, i10 - i12);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) {
        Mac zza = zzwr.zzb.zza(this.zza);
        if (bArr2 != null && bArr2.length != 0) {
            zza.init(new SecretKeySpec(bArr2, this.zza));
        } else {
            zza.init(new SecretKeySpec(new byte[zza.getMacLength()], this.zza));
        }
        return zza.doFinal(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i10) {
        return zza(zza(zzlq.zza(str, bArr2, bArr4), null), zzlq.zza(str2, bArr3, bArr4, i10), i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzld
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) {
        return zza(bArr, zzlq.zza(str, bArr2, bArr3, i10), i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzld
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zza(zzlq.zza(str, bArr2, bArr3), bArr);
    }
}
