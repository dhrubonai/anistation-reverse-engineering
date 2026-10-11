package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzrj implements zzcf {
    private static final byte[] zza = {0};
    private final zzcf zzb;
    private final zzvt zzc;
    private final byte[] zzd;

    private zzrj(zzcf zzcfVar, zzvt zzvtVar, byte[] bArr) {
        this.zzb = zzcfVar;
        this.zzc = zzvtVar;
        this.zzd = bArr;
    }

    public static zzcf zza(zznc zzncVar) {
        byte[] bArr;
        zzot zza2 = zzncVar.zza(zzbr.zza());
        zzcf zzcfVar = (zzcf) zzox.zza().zza((zzux) ((zzaja) zzux.zza().zza(zza2.zzf()).zza(zza2.zzd()).zza(zza2.zza()).zzf()), zzcf.class);
        zzvt zzc = zza2.zzc();
        int i10 = zzrm.zza[zzc.ordinal()];
        if (i10 == 1) {
            bArr = new byte[0];
        } else if (i10 == 2 || i10 == 3) {
            bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzncVar.zza().intValue()).array();
        } else if (i10 == 4) {
            bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzncVar.zza().intValue()).array();
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return new zzrj(zzcfVar, zzc, bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcf
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 10) {
            if (this.zzc.equals(zzvt.LEGACY)) {
                bArr2 = zzwi.zza(bArr2, zza);
            }
            byte[] bArr3 = new byte[0];
            if (!this.zzc.equals(zzvt.RAW)) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
                bArr3 = copyOf;
            }
            if (Arrays.equals(this.zzd, bArr3)) {
                this.zzb.zza(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcf
    public final byte[] zza(byte[] bArr) {
        if (this.zzc.equals(zzvt.LEGACY)) {
            bArr = zzwi.zza(bArr, zza);
        }
        return zzwi.zza(this.zzd, this.zzb.zza(bArr));
    }
}
